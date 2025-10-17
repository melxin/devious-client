package net.devious.mixins;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Base64;
import java.util.Properties;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.MethodHook;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSBuffer;
import net.runelite.rs.api.RSClient;

@Mixin(RSClient.class)
public abstract class DRSCachedRandomDatMixin implements RSClient
{
	@Shadow("client")
	private static RSClient client;

	@net.runelite.api.mixins.Inject
	@javax.inject.Inject
	@javax.inject.Named("cachedRandomDat")
	private boolean cachedRandomDat;

	@Inject
	@Override
	public boolean useCachedRandomDat()
	{
		return cachedRandomDat;
	}

	@net.runelite.api.mixins.Inject
	@javax.inject.Inject
	@javax.inject.Named("runeLiteDir")
	private File openosrsDir;

	@Inject
	private File cachedDataFile;

	@Inject
	private Properties cachedDataProperties;

	@Inject
	@Override
	public byte[] getCachedRandomDatData(String username)
	{
		if (cachedDataProperties == null)
		{
			cachedDataFile = new File(openosrsDir, "random.dat-cached.properties");
			cachedDataProperties = new Properties();

			if (cachedDataProperties.isEmpty() && cachedDataFile.exists())
			{
				try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(cachedDataFile), StandardCharsets.UTF_8))
				{
					cachedDataProperties.load(inputStreamReader);
				}
				catch (IOException e)
				{
					client.getLogger().warn("Unable to load cached random.dat profiles from disk", e);
				}

				if (cachedDataProperties.size() > 0)
				{
					client.getLogger().info("Read {} cached random.dat profiles from disk", cachedDataProperties.size());
				}
			}
		}

		byte[] data = null;
		String property = cachedDataProperties.getProperty(username);
		if (property != null)
		{
			data = Base64.getDecoder().decode(property);
		}
		return data != null ? data : null;
	}

	@Inject
	@Override
	public void writeCachedRandomDatData(String username, byte[] data)
	{
		cachedDataProperties.setProperty(username, Base64.getEncoder().encodeToString(data));
		try (OutputStreamWriter outputStreamWriter = new OutputStreamWriter(Files.newOutputStream(cachedDataFile.toPath()), StandardCharsets.UTF_8))
		{
			cachedDataProperties.store(outputStreamWriter, "Cached random.dat");
		}
		catch (IOException e)
		{
			client.getLogger().warn("Unable to write cached random.dat to disk", e);
		}
	}

	@Inject
	@MethodHook(value = "writeRandomDat", end = true)
	public static void onWriteNewRandomDatData(byte[] var0, int var1, byte[] newRandomDatData, int var3, int var4)
	{
		if (!client.useCachedRandomDat())
		{
			return;
		}

		client.getLogger().info("Saving new random.dat data {} for user {}", newRandomDatData, client.getLauncherDisplayName() != null ? client.getLauncherDisplayName() : client.getUsername());
		client.writeCachedRandomDatData(client.getLauncherDisplayName() != null ? client.getLauncherDisplayName() : client.getUsername(), newRandomDatData);
	}

	@Inject
	private static String lastUser;

	@Inject
	private static void setRSCachedRandomDatData()
	{
		if (!client.useCachedRandomDat())
		{
			return;
		}

		byte[] cachedData = client.getCachedRandomDatData(client.getLauncherDisplayName() != null ? client.getLauncherDisplayName() : client.getUsername());
		if (cachedData == null)
		{
			cachedData = new byte[24];
			for (byte i = 0; i < 24; i++)
			{
				cachedData[i] = -1;
			}
		}
		client.setRSRandomDat(cachedData);
		if (lastUser == null || !lastUser.equalsIgnoreCase(client.getLauncherDisplayName() != null ? client.getLauncherDisplayName() : client.getUsername()))
		{
			lastUser = client.getLauncherDisplayName() != null ? client.getLauncherDisplayName() : client.getUsername();
			client.getLogger().info("Using cached random.dat {} for user {}", cachedData, client.getLauncherDisplayName() != null ? client.getLauncherDisplayName() : client.getUsername());
		}
	}

	@MethodHook("doCycleLoggedOut")
	@Inject
	public void onDoCycleLoggedOut()
	{
		setRSCachedRandomDatData();
	}

	@MethodHook("performLoginRequest")
	@Inject
	public static void onPerformLoginRequest(long var0, String var2)
	{
		setRSCachedRandomDatData();
	}

	//@Copy("randomDatData2")
	//@Replace("randomDatData2")
	public static void copy$RandomDatData2(RSBuffer buffer, int offset)
	{
		if (!client.useCachedRandomDat())
		{
			copy$RandomDatData2(buffer, offset);
			return;
		}

		byte[] cachedData = client.getCachedRandomDatData(client.getLauncherDisplayName() != null ? client.getLauncherDisplayName() : client.getUsername());
		if (cachedData == null)
		{
			cachedData = new byte[24];
			for (byte i = 0; i < 24; i++)
			{
				cachedData[i] = -1;
			}
		}
		buffer.writeBytes(cachedData, offset, cachedData.length);
		client.getLogger().info("Using cached random.dat {} for user {}", cachedData, client.getLauncherDisplayName() != null ? client.getLauncherDisplayName() : client.getUsername());
	}
}