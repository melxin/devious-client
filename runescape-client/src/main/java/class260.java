import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
public class class260 {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1109598135
	)
	static int field2944;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V",
		garbageValue = "-2120938795"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = "";
				if (var1 != null) {
					Throwable var4 = var1;
					String var5;
					if (var1 instanceof RunException) {
						RunException var6 = (RunException)var1;
						var5 = var6.message + " | ";
						var4 = var6.throwable;
					} else {
						var5 = "";
					}

					StringWriter var18 = new StringWriter();
					PrintWriter var7 = new PrintWriter(var18);
					var4.printStackTrace(var7);
					var7.close();
					String var8 = var18.toString();
					BufferedReader var9 = new BufferedReader(new StringReader(var8));
					String var10 = var9.readLine();

					label59:
					while (true) {
						while (true) {
							String var11 = var9.readLine();
							if (var11 == null) {
								var5 = var5 + "| " + var10;
								var2 = var5;
								break label59;
							}

							int var12 = var11.indexOf(40);
							int var13 = var11.indexOf(41, var12 + 1);
							if (var12 >= 0 && var13 >= 0) {
								String var14 = var11.substring(var12 + 1, var13);
								int var15 = var14.indexOf(".java:");
								if (var15 >= 0) {
									var14 = var14.substring(0, var15) + var14.substring(var15 + 5);
									var5 = var5 + var14 + ' ';
									continue;
								}

								var11 = var11.substring(0, var12);
							}

							var11 = var11.trim();
							var11 = var11.substring(var11.lastIndexOf(32) + 1);
							var11 = var11.substring(var11.lastIndexOf(9) + 1);
							var5 = var5 + var11 + ' ';
						}
					}
				}

				if (var0 != null) {
					if (var1 != null) {
						var2 = var2 + " | ";
					}

					var2 = var2 + var0;
				}

				System.out.println("Error: " + var2);
				var2 = var2.replace(':', '.');
				var2 = var2.replace('@', '_');
				var2 = var2.replace('&', '_');
				var2 = var2.replace('#', '_');
				if (RunException.RunException_applet == null) {
					return;
				}

				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?cv=" + class160.RunException_revision + "&cs=" + class163.field1773 + "&u=" + RunException.field5176 + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + class451.clientType + "&e=" + var2);
				DataInputStream var17 = new DataInputStream(var3.openStream());
				var17.read();
				var17.close();
			} catch (Exception var16) {
			}

		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Lll;",
		garbageValue = "1728453073"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.field3265, ServerPacket.field3221, ServerPacket.field3222, ServerPacket.field3223, ServerPacket.field3224, ServerPacket.field3230, ServerPacket.field3296, ServerPacket.field3227, ServerPacket.field3228, ServerPacket.field3229, ServerPacket.field3300, ServerPacket.field3276, ServerPacket.field3232, ServerPacket.field3233, ServerPacket.field3234, ServerPacket.field3235, ServerPacket.field3236, ServerPacket.field3237, ServerPacket.field3238, ServerPacket.field3250, ServerPacket.field3240, ServerPacket.field3241, ServerPacket.field3242, ServerPacket.field3243, ServerPacket.field3220, ServerPacket.field3320, ServerPacket.field3246, ServerPacket.field3338, ServerPacket.field3248, ServerPacket.field3254, ServerPacket.field3301, ServerPacket.field3251, ServerPacket.field3252, ServerPacket.field3253, ServerPacket.field3288, ServerPacket.field3309, ServerPacket.field3273, ServerPacket.field3257, ServerPacket.field3326, ServerPacket.field3259, ServerPacket.field3289, ServerPacket.field3261, ServerPacket.field3262, ServerPacket.field3278, ServerPacket.field3264, ServerPacket.field3256, ServerPacket.field3266, ServerPacket.field3297, ServerPacket.field3268, ServerPacket.field3269, ServerPacket.field3270, ServerPacket.field3271, ServerPacket.field3272, ServerPacket.field3239, ServerPacket.field3274, ServerPacket.field3275, ServerPacket.field3282, ServerPacket.field3277, ServerPacket.field3286, ServerPacket.field3279, ServerPacket.field3280, ServerPacket.field3281, ServerPacket.field3231, ServerPacket.field3283, ServerPacket.field3247, ServerPacket.field3285, ServerPacket.field3306, ServerPacket.field3244, ServerPacket.field3287, ServerPacket.field3284, ServerPacket.field3225, ServerPacket.field3291, ServerPacket.field3332, ServerPacket.field3293, ServerPacket.field3226, ServerPacket.field3295, ServerPacket.field3263, ServerPacket.field3292, ServerPacket.field3298, ServerPacket.field3299, ServerPacket.field3327, ServerPacket.field3267, ServerPacket.field3302, ServerPacket.field3303, ServerPacket.field3304, ServerPacket.field3305, ServerPacket.field3317, ServerPacket.field3307, ServerPacket.field3258, ServerPacket.field3245, ServerPacket.field3310, ServerPacket.field3311, ServerPacket.field3312, ServerPacket.field3313, ServerPacket.field3260, ServerPacket.field3315, ServerPacket.field3316, ServerPacket.field3314, ServerPacket.field3318, ServerPacket.field3319, ServerPacket.field3249, ServerPacket.field3321, ServerPacket.field3322, ServerPacket.field3323, ServerPacket.field3308, ServerPacket.field3325, ServerPacket.field3333, ServerPacket.field3294, ServerPacket.field3328, ServerPacket.field3329, ServerPacket.field3330, ServerPacket.field3331, ServerPacket.field3324, ServerPacket.field3290, ServerPacket.field3334, ServerPacket.field3335, ServerPacket.field3336, ServerPacket.field3337};
	}
}
