/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import com.google.common.annotations.VisibleForTesting;
import com.google.gson.Gson;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.openosrs.client.OpenOSRS;
import com.openosrs.client.game.PlayerManager;
import com.openosrs.client.ui.OpenOSRSSplashScreen;
import java.applet.Applet;
import java.io.File;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import static java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import javax.inject.Provider;
import javax.inject.Singleton;
import javax.management.ObjectName;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.swing.SwingUtilities;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import joptsimple.ValueConversionException;
import joptsimple.ValueConverter;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.Constants;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.discord.DiscordService;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.externalplugins.ExternalPluginManager;
import net.runelite.client.game.WorldService;
import net.runelite.client.game.XpDropManager;
import net.runelite.client.plugins.OPRSExternalPluginManager;
import net.runelite.client.rs.ClientLoader;
import net.runelite.client.ui.ClientUI;
import net.runelite.client.ui.FatalErrorDialog;
import net.runelite.client.ui.SplashScreen;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.ui.overlay.WidgetOverlay;
import net.runelite.client.ui.overlay.tooltip.TooltipOverlay;
import net.runelite.client.ui.overlay.worldmap.WorldMapOverlay;
import net.runelite.client.util.ReflectUtil;
import net.runelite.client.util.WorldUtil;
import net.runelite.http.api.RuneLiteAPI;
import net.runelite.http.api.worlds.World;
import net.runelite.http.api.worlds.WorldResult;
import net.unethicalite.client.Unethicalite;
import net.unethicalite.client.managers.SettingsManager;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.LoggerFactory;

@Singleton
@Slf4j
public class RuneLite
{
	public static final String OPENOSRS = ".openosrs";
	public static final File RUNELITE_DIR = new File(System.getProperty("user.home"), OPENOSRS);
	public static final File CACHE_DIR = new File(RUNELITE_DIR, "cache");
	public static final File PLUGINS_DIR = new File(RUNELITE_DIR, "plugin-hub");
	public static final File PROFILES_DIR = new File(RUNELITE_DIR, "profiles");
	public static final File SCREENSHOT_DIR = new File(RUNELITE_DIR, "screenshots");
	public static final File LOGS_DIR = new File(RUNELITE_DIR, "logs");
	public static final File DEFAULT_SESSION_FILE = new File(RUNELITE_DIR, "session");
	public static final File DEFAULT_CONFIG_FILE = new File(RUNELITE_DIR, "settings.properties");
	public static final File NOTIFICATIONS_DIR = new File(RuneLite.RUNELITE_DIR, "notifications");

	private static final int MAX_OKHTTP_CACHE_SIZE = 20 * 1024 * 1024; // 20mb
	private static final String BYPASS_ARG = "--IWillNotComplainIfIGetSentToTheGulagByJamflex";
	public static String USER_AGENT = "RuneLite/" + RuneLiteProperties.getVersion() + "-" + RuneLiteProperties.getCommit() + (RuneLiteProperties.isDirty() ? "+" : "");
	@Getter
	private static Injector injector;

	static
	{
		//Fixes win10 scaling when not 100% while using Anti-Aliasing with GPU
		System.setProperty("sun.java2d.uiScale", "1.0");

		String launcherVersion = System.getProperty("launcher.version");
		System.setProperty("runelite.launcher.version", launcherVersion == null ? "unknown" : launcherVersion);
	}

	@Inject
	private net.runelite.client.plugins.PluginManager pluginManager;
	@Inject
	private ExternalPluginManager externalPluginManager;
	@Inject
	private OPRSExternalPluginManager oprsExternalPluginManager;
	@Inject
	private EventBus eventBus;
	@Inject
	private ConfigManager configManager;
	@Inject
	private DiscordService discordService;
	@Inject
	private ClientSessionManager clientSessionManager;
	@Inject
	private ClientUI clientUI;
	@Inject
	private OverlayManager overlayManager;
	@Inject
	private Provider<TooltipOverlay> tooltipOverlay;
	@Inject
	private Provider<WorldMapOverlay> worldMapOverlay;
	@Inject
	private Gson gson;
	@Inject
	private Provider<XpDropManager> xpDropManager;
	@Inject
	private Provider<PlayerManager> playerManager;
	@Inject
	private WorldService worldService;
	@Inject
	@Nullable
	private Client client;
	@Inject
	@Nullable
	private RuntimeConfig runtimeConfig;

	public static void main(String[] args) throws Exception
	{
		args = Arrays.stream(args).filter(s -> !BYPASS_ARG.equals(s)).toArray(String[]::new);
		Locale.setDefault(Locale.ENGLISH);

		final OptionParser parser = new OptionParser(false);
		parser.accepts("developer-mode", "Enable developer tools");
		parser.accepts("debug", "Show extra debugging output");
		parser.accepts("safe-mode", "Disables external plugins and the GPU plugin");
		parser.accepts("insecure-skip-tls-verification", "Disables TLS verification");
		parser.accepts("jav_config", "jav_config url")
			.withRequiredArg()
			.defaultsTo(RuneLiteProperties.getJavConfig());
		parser.accepts("enable-telemetry", "Enable telemetry");

		final ArgumentAcceptingOptionSpec<File> sessionfile = parser.accepts("sessionfile", "Use a specified session file")
			.withRequiredArg()
			.withValuesConvertedBy(new ConfigFileConverter())
			.defaultsTo(DEFAULT_SESSION_FILE);

		final ArgumentAcceptingOptionSpec<String> proxyInfo = parser
			.accepts("proxy")
			.withRequiredArg().ofType(String.class);

		final ArgumentAcceptingOptionSpec<Integer> worldInfo = parser
			.accepts("world")
			.withRequiredArg().ofType(Integer.class);

		final ArgumentAcceptingOptionSpec<File> configfile = parser.accepts("config", "Use a specified config file")
			.withRequiredArg()
			.withValuesConvertedBy(new ConfigFileConverter())
			.defaultsTo(DEFAULT_CONFIG_FILE);

		final OptionSpec<Void> insecureWriteCredentials = parser.accepts("insecure-write-credentials", "Dump authentication tokens from the Jagex Launcher to a text file to be used for development");

		final OptionSpec<Void> cachedRandomDat = parser.accepts("cached-random-dat", "Use cached random.dat data for each account");
		final OptionSpec<Void> cachedUUID = parser.accepts("cached-uuid", "Use a random cached uuid for each account");

		parser.accepts("help", "Show this text").forHelp();
		OptionSet options = SettingsManager.parseArgs(parser, args);

		if (options.has("help"))
		{
			parser.printHelpOn(System.out);
			System.exit(0);
		}

		if (options.has("debug"))
		{
			final Logger logger = (Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
			logger.setLevel(Level.DEBUG);
		}

		if (options.has("proxy"))
		{
			String[] proxy = options.valueOf(proxyInfo).split(":");

			if (proxy.length >= 2)
			{
				System.setProperty("socksProxyHost", proxy[0]);
				System.setProperty("socksProxyPort", proxy[1]);
			}

			if (proxy.length >= 4)
			{
				System.setProperty("java.net.socks.username", proxy[2]);
				System.setProperty("java.net.socks.password", proxy[3]);

				final String user = proxy[2];
				final char[] pass = proxy[3].toCharArray();

				Authenticator.setDefault(new Authenticator()
				{
					private final PasswordAuthentication auth = new PasswordAuthentication(user, pass);

					protected PasswordAuthentication getPasswordAuthentication()
					{
						return auth;
					}
				});
			}
		}

		if (options.has("world"))
		{
			int world = options.valueOf(worldInfo);
			System.setProperty("cli.world", String.valueOf(world));
		}

		Thread.setDefaultUncaughtExceptionHandler((thread, throwable) ->
		{
			log.error("Uncaught exception:", throwable);
			if (throwable instanceof AbstractMethodError)
			{
				log.error("Classes are out of date; Build with maven again.");
			}
		});

		OpenOSRS.preload();

		final OkHttpClient okHttpClient = buildHttpClient(options.has("insecure-skip-tls-verification"));
		RuneLiteAPI.CLIENT = okHttpClient;

		SplashScreen.init();
		OpenOSRSSplashScreen.init();
		SplashScreen.stage(0, "Retrieving client", "");

		try
		{
			final RuntimeConfigLoader runtimeConfigLoader = new RuntimeConfigLoader(okHttpClient);
			final ClientLoader clientLoader = new ClientLoader(okHttpClient, runtimeConfigLoader, (String) options.valueOf("jav_config"));

			new Thread(() ->
			{
				clientLoader.get();
				ClassPreloader.preload();
			}, "Preloader").start();

			final boolean developerMode = true;

			PROFILES_DIR.mkdirs();

			log.info("OpenOSRS {} (RuneLite version {}, launcher version {}) starting up, args: {}",
				OpenOSRS.SYSTEM_VERSION, RuneLiteProperties.getVersion() == null ? "unknown" : RuneLiteProperties.getVersion(),
				RuneLiteProperties.getLauncherVersion(), args.length == 0 ? "none" : String.join(" ", args));

			final RuntimeMXBean runtime = ManagementFactory.getRuntimeMXBean();
			// This includes arguments from _JAVA_OPTIONS, which are parsed after command line flags and applied to
			// the global VM args
			log.info("Java VM arguments: {}", String.join(" ", runtime.getInputArguments()));

			final long start = System.currentTimeMillis();
			injector = Guice.createInjector(new RuneLiteModule(
				okHttpClient,
				clientLoader,
				runtimeConfigLoader,
				developerMode,
				options.has("safe-mode"),
				options.valueOf(sessionfile),
				options.valueOf(configfile),
				options,
				options.has(insecureWriteCredentials),
				options.has(cachedRandomDat),
				options.has(cachedUUID)
			));

			injector.getInstance(RuneLite.class).start(options);

			final long end = System.currentTimeMillis();
			final long uptime = runtime.getUptime();
			log.info("Client initialization took {}ms. Uptime: {}ms", end - start, uptime);
		}
		catch (Exception e)
		{
			log.error("Failure during startup", e);
			SwingUtilities.invokeLater(() ->
				new FatalErrorDialog("OpenOSRS has encountered an unexpected error during startup.")
					.addHelpButtons()
					.open());
		}
		finally
		{
			SplashScreen.stop();
		}
	}

	@VisibleForTesting
	public static void setInjector(Injector injector)
	{
		RuneLite.injector = injector;
	}

	@VisibleForTesting
	static OkHttpClient buildHttpClient(boolean insecureSkipTlsVerification)
	{
		OkHttpClient.Builder builder = new OkHttpClient.Builder()
			.pingInterval(30, TimeUnit.SECONDS)
			.addInterceptor(chain ->
			{
				Request request = chain.request();

				if (request.url().host().endsWith("runescape.com"))
				{
					return chain.proceed(request);
				}

				if (request.url().host().endsWith("openosrs.dev"))
				{
					Request userAgentRequest = request
						.newBuilder()
						.header("User-Agent", "OpenOSRS/" + OpenOSRS.SYSTEM_VERSION)
						.build();

					return chain.proceed(userAgentRequest);
				}

				if (request.header("User-Agent") != null)
				{
					return chain.proceed(request);
				}

				Request userAgentRequest = request
					.newBuilder()
					.header("User-Agent", USER_AGENT)
					.build();
				return chain.proceed(userAgentRequest);
			})
			// Setup cache
			.cache(new Cache(new File(CACHE_DIR, "okhttp"), MAX_OKHTTP_CACHE_SIZE))
			.addNetworkInterceptor(chain ->
			{
				// This has to be a network interceptor so it gets hit before the cache tries to store stuff
				Response res = chain.proceed(chain.request());
				if (res.code() >= 400 && "GET".equals(res.request().method()))
				{
					// if the request 404'd we don't want to cache it because its probably temporary
					res = res.newBuilder()
						.header("Cache-Control", "no-store")
						.build();
				}
				return res;
			});

		if (insecureSkipTlsVerification || RuneLiteProperties.isInsecureSkipTlsVerification())
		{
			setupInsecureTrustManager(builder);
		}

		return builder.build();
	}

	private static void setupInsecureTrustManager(OkHttpClient.Builder okHttpClientBuilder)
	{
		try
		{
			X509TrustManager trustManager = new X509TrustManager()
			{
				@Override
				public void checkClientTrusted(X509Certificate[] chain, String authType)
				{
				}

				@Override
				public void checkServerTrusted(X509Certificate[] chain, String authType)
				{
				}

				@Override
				public X509Certificate[] getAcceptedIssuers()
				{
					return new X509Certificate[0];
				}
			};

			SSLContext sc = SSLContext.getInstance("SSL");
			sc.init(null, new TrustManager[]{trustManager}, new SecureRandom());
			okHttpClientBuilder.sslSocketFactory(sc.getSocketFactory(), trustManager);
		}
		catch (NoSuchAlgorithmException | KeyManagementException ex)
		{
			log.warn("unable to setup insecure trust manager", ex);
		}
	}

	private static void copyJagexCache()
	{
		Path from = Paths.get(System.getProperty("user.home"), "jagexcache");
		Path to = Unethicalite.getCacheDirectory().toPath();
		if (Files.exists(to) || !Files.exists(from))
		{
			return;
		}

		log.info("Copying jagexcache from {} to {}", from, to);

		// Recursively copy path https://stackoverflow.com/a/50418060
		try (Stream<Path> stream = Files.walk(from))
		{
			stream.forEach(source ->
			{
				try
				{
					Files.copy(source, to.resolve(from.relativize(source)), COPY_ATTRIBUTES);
				}
				catch (IOException e)
				{
					throw new RuntimeException(e);
				}
			});
		}
		catch (Exception e)
		{
			log.warn("unable to copy jagexcache", e);
		}
	}

	public void start(OptionSet options) throws Exception
	{
		// Inject members into client
		injector.injectMembers(client);

		setupSystemProps();
		//setupCompilerControl();

		// Start the applet
		copyJagexCache();

		// Client size must be set prior to init
		var applet = (Applet) client;
		applet.setSize(Constants.GAME_FIXED_SIZE);

		System.setProperty("jagex.disableBouncyCastle", "true");
		System.setProperty("jagex.userhome", Unethicalite.getCacheDirectory().getParent());

		applet.init();
		applet.start();

		SplashScreen.stage(.57, null, "Loading configuration");

		// Load user configuration
		configManager.load();

		// Load external plugin manager
		oprsExternalPluginManager.setupInstance();
		oprsExternalPluginManager.startExternalUpdateManager();
		oprsExternalPluginManager.startExternalPluginManager();

		// Update external plugins
		oprsExternalPluginManager.update();

		// Load the plugins, but does not start them yet.
		// This will initialize configuration
		pluginManager.loadCorePlugins();
		pluginManager.loadSideLoadPlugins();

		oprsExternalPluginManager.loadPlugins();

		externalPluginManager.loadExternalPlugins();

		SplashScreen.stage(.70, null, "Finalizing configuration");

		// Plugins have provided their config, so set default config
		// to main settings
		pluginManager.loadDefaultPluginConfiguration(null);

		eventBus.register(clientSessionManager);

		SplashScreen.stage(.75, null, "Starting core interface");

		// Initialize UI
		clientUI.init();

		// Initialize Discord service
		discordService.init();

		// Register event listeners
		eventBus.register(clientUI);
		eventBus.register(pluginManager);
		eventBus.register(externalPluginManager);
		eventBus.register(overlayManager);
		eventBus.register(configManager);
		eventBus.register(discordService);

		// Add core overlays
		WidgetOverlay.createOverlays(overlayManager, client).forEach(overlayManager::add);
		overlayManager.add(worldMapOverlay.get());
		overlayManager.add(tooltipOverlay.get());

		playerManager.get();

		// legacy method, i cant figure out how to make it work without garbage
		eventBus.register(xpDropManager.get());

		//Set the world if specified via CLI args - will not work until clientUI.init is called
		Optional<Integer> worldArg = Optional.ofNullable(System.getProperty("cli.world")).map(Integer::parseInt);
		worldArg.ifPresent(this::setWorld);

		// Start plugins
		pluginManager.startPlugins();

		SplashScreen.stop();

		clientUI.show();

		if (options.has("enable-telemetry"))
		{
			TelemetryClient telemetryClient = injector.getInstance(TelemetryClient.class);
			telemetryClient.submitTelemetry();
			telemetryClient.submitVmErrors(LOGS_DIR);
		}

		ReflectUtil.queueInjectorAnnotationCacheInvalidation(injector);
		ReflectUtil.invalidateAnnotationCaches();
	}

	private void setWorld(int cliWorld)
	{
		int correctedWorld = cliWorld < 300 ? cliWorld + 300 : cliWorld;

		if (correctedWorld <= 300 || client.getWorld() == correctedWorld)
		{
			return;
		}

		final WorldResult worldResult = worldService.getWorlds();

		if (worldResult == null)
		{
			log.warn("Failed to lookup worlds.");
			return;
		}

		final World world = worldResult.findWorld(correctedWorld);

		if (world != null)
		{
			final net.runelite.api.World rsWorld = client.createWorld();
			rsWorld.setActivity(world.getActivity());
			rsWorld.setAddress(world.getAddress());
			rsWorld.setId(world.getId());
			rsWorld.setPlayerCount(world.getPlayers());
			rsWorld.setLocation(world.getLocation());
			rsWorld.setTypes(WorldUtil.toWorldTypes(world.getTypes()));

			client.changeWorld(rsWorld);
			log.debug("Applied new world {}", correctedWorld);
		}
		else
		{
			log.warn("World {} not found.", correctedWorld);
		}
	}

	private void setupSystemProps()
	{
		if (runtimeConfig == null || runtimeConfig.getSysProps() == null)
		{
			return;
		}

		for (Map.Entry<String, String> entry : runtimeConfig.getSysProps().entrySet())
		{
			String key = entry.getKey(), value = entry.getValue();
			log.debug("Setting property {}={}", key, value);
			System.setProperty(key, value);
		}
	}

	private void setupCompilerControl()
	{
		try
		{
			var file = Files.createTempFile("rl_compilercontrol", "");
			try
			{
				if (runtimeConfig != null && runtimeConfig.getCompilerControl() != null)
				{
					var json = gson.toJson(runtimeConfig.getCompilerControl());
					Files.writeString(file, json, StandardCharsets.UTF_8);
				}
				else
				{
					try (var in = RuneLite.class.getResourceAsStream("/compilercontrol.json"))
					{
						Files.copy(in, file, StandardCopyOption.REPLACE_EXISTING);
					}
				}

				ManagementFactory.getPlatformMBeanServer().invoke(
					new ObjectName("com.sun.management:type=DiagnosticCommand"),
					"compilerDirectivesAdd",
					new Object[]{new String[]{file.toFile().getAbsolutePath()}},
					new String[]{String[].class.getName()});
			}
			finally
			{
				Files.delete(file);
			}
		}
		catch (Exception e)
		{
			log.info("Failed to set compiler control", e);
		}
	}

	private static class ConfigFileConverter implements ValueConverter<File>
	{
		@Override
		public File convert(String fileName)
		{
			final File file;

			if (Paths.get(fileName).isAbsolute()
				|| fileName.startsWith("./")
				|| fileName.startsWith(".\\"))
			{
				file = new File(fileName);
			}
			else
			{
				file = new File(RuneLite.RUNELITE_DIR, fileName);
			}

			if (file.exists() && (!file.isFile() || !file.canWrite()))
			{
				throw new ValueConversionException(String.format("File %s is not accessible", file.getAbsolutePath()));
			}

			return file;
		}

		@Override
		public Class<? extends File> valueType()
		{
			return File.class;
		}

		@Override
		public String valuePattern()
		{
			return null;
		}
	}
}
