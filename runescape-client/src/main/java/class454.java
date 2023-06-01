import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ry")
public class class454 {
	@ObfuscatedName("at")
	static int[] field4745;
	@ObfuscatedName("an")
	public static int[] field4744;

	static {
		field4745 = new int[32768];

		for (int var0 = 0; var0 < 32768; ++var0) {
			int[] var1 = field4745;
			double var4 = (double)(var0 >> 10 & 31) / 31.0D;
			double var6 = (double)(var0 >> 5 & 31) / 31.0D;
			double var8 = (double)(var0 & 31) / 31.0D;
			double var10 = var4;
			if (var6 < var4) {
				var10 = var6;
			}

			if (var8 < var10) {
				var10 = var8;
			}

			double var12 = var4;
			if (var6 > var4) {
				var12 = var6;
			}

			if (var8 > var12) {
				var12 = var8;
			}

			double var14 = 0.0D;
			double var29 = 0.0D;
			double var31 = (var12 + var10) / 2.0D;
			if (var12 != var10) {
				if (var31 < 0.5D) {
					var29 = (var12 - var10) / (var10 + var12);
				}

				if (var31 >= 0.5D) {
					var29 = (var12 - var10) / (2.0D - var12 - var10);
				}

				if (var4 == var12) {
					var14 = (var6 - var8) / (var12 - var10);
				} else if (var12 == var6) {
					var14 = 2.0D + (var8 - var4) / (var12 - var10);
				} else if (var8 == var12) {
					var14 = (var4 - var6) / (var12 - var10) + 4.0D;
				}
			}

			int var20 = (int)(var14 * 256.0D / 6.0D);
			var20 &= 255;
			double var21 = 256.0D * var29;
			if (var21 < 0.0D) {
				var21 = 0.0D;
			} else if (var21 > 255.0D) {
				var21 = 255.0D;
			}

			if (var31 > 0.7D) {
				var21 /= 2.0D;
				var21 = Math.floor(var21);
			}

			if (var31 > 0.75D) {
				var21 /= 2.0D;
				var21 = Math.floor(var21);
			}

			if (var31 > 0.85D) {
				var21 /= 2.0D;
				var21 = Math.floor(var21);
			}

			if (var31 > 0.95D) {
				var21 /= 2.0D;
				var21 = Math.floor(var21);
			}

			if (var31 > 0.995D) {
				var31 = 0.995D;
			}

			int var33 = (int)(var21 / 32.0D + (double)(var20 / 4 * 8));
			int var34 = (var33 << 7) + (int)(var31 * 128.0D);
			var1[var0] = var34;
		}

		if (field4744 == null) {
			field4744 = new int[65536];
			double var25 = 0.949999988079071D;

			for (int var2 = 0; var2 < 65536; ++var2) {
				double var3 = 0.0078125D + (double)(var2 >> 10 & 63) / 64.0D;
				double var5 = 0.0625D + (double)(var2 >> 7 & 7) / 8.0D;
				double var7 = (double)(var2 & 127) / 128.0D;
				double var9 = var7;
				double var11 = var7;
				double var13 = var7;
				if (var5 != 0.0D) {
					double var15;
					if (var7 < 0.5D) {
						var15 = var7 * (var5 + 1.0D);
					} else {
						var15 = var5 + var7 - var7 * var5;
					}

					double var17 = var7 * 2.0D - var15;
					double var19 = 0.3333333333333333D + var3;
					if (var19 > 1.0D) {
						--var19;
					}

					double var23 = var3 - 0.3333333333333333D;
					if (var23 < 0.0D) {
						++var23;
					}

					if (6.0D * var19 < 1.0D) {
						var9 = var17 + var19 * (var15 - var17) * 6.0D;
					} else if (var19 * 2.0D < 1.0D) {
						var9 = var15;
					} else if (var19 * 3.0D < 2.0D) {
						var9 = 6.0D * (0.6666666666666666D - var19) * (var15 - var17) + var17;
					} else {
						var9 = var17;
					}

					if (var3 * 6.0D < 1.0D) {
						var11 = var17 + var3 * (var15 - var17) * 6.0D;
					} else if (2.0D * var3 < 1.0D) {
						var11 = var15;
					} else if (var3 * 3.0D < 2.0D) {
						var11 = 6.0D * (0.6666666666666666D - var3) * (var15 - var17) + var17;
					} else {
						var11 = var17;
					}

					if (6.0D * var23 < 1.0D) {
						var13 = var17 + (var15 - var17) * 6.0D * var23;
					} else if (2.0D * var23 < 1.0D) {
						var13 = var15;
					} else if (var23 * 3.0D < 2.0D) {
						var13 = var17 + (var15 - var17) * (0.6666666666666666D - var23) * 6.0D;
					} else {
						var13 = var17;
					}
				}

				var9 = Math.pow(var9, var25);
				var11 = Math.pow(var11, var25);
				var13 = Math.pow(var13, var25);
				int var27 = (int)(256.0D * var9);
				int var16 = (int)(256.0D * var11);
				int var28 = (int)(256.0D * var13);
				int var18 = var28 + (var16 << 8) + (var27 << 16);
				field4744[var2] = var18 & 16777215;
			}
		}

	}
}
