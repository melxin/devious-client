import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bm")
public class class46 {
	@ObfuscatedName("at")
	int field327;
	@ObfuscatedName("an")
	int field325;
	@ObfuscatedName("av")
	int field326;
	@ObfuscatedName("as")
	int field330;
	@ObfuscatedName("ax")
	int field324;
	@ObfuscatedName("ap")
	int field328;
	@ObfuscatedName("ab")
	int[] field329;

	class46() {
		class60 var1 = VorbisSample.field374;
		this.field327 = var1.method1118(16);
		this.field325 = var1.method1118(24);
		this.field326 = var1.method1118(24);
		this.field330 = var1.method1118(24) + 1;
		this.field324 = var1.method1118(6) + 1;
		this.field328 = var1.method1118(8);
		int[] var2 = new int[this.field324];

		int var3;
		for (var3 = 0; var3 < this.field324; ++var3) {
			int var4 = 0;
			int var5 = var1.method1118(3);
			boolean var6 = var1.method1117() != 0;
			if (var6) {
				var4 = var1.method1118(5);
			}

			var2[var3] = var4 << 3 | var5;
		}

		this.field329 = new int[this.field324 * 8];

		for (var3 = 0; var3 < this.field324 * 8; ++var3) {
			this.field329[var3] = (var2[var3 >> 3] & 1 << (var3 & 7)) != 0 ? var1.method1118(8) : -1;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([FIZLcd;)V"
	)
	void method840(float[] var1, int var2, boolean var3, class60 var4) {
		int var5;
		for (var5 = 0; var5 < var2; ++var5) {
			var1[var5] = 0.0F;
		}

		if (!var3) {
			var5 = VorbisSample.field383[this.field328].field362;
			int var6 = this.field326 - this.field325;
			int var7 = var6 / this.field330;
			int[] var8 = new int[var7];

			for (int var9 = 0; var9 < 8; ++var9) {
				int var10 = 0;

				while (var10 < var7) {
					int var11;
					int var12;
					if (var9 == 0) {
						var11 = VorbisSample.field383[this.field328].method1035(var4);

						for (var12 = var5 - 1; var12 >= 0; --var12) {
							if (var10 + var12 < var7) {
								var8[var10 + var12] = var11 % this.field324;
							}

							var11 /= this.field324;
						}
					}

					for (var11 = 0; var11 < var5; ++var11) {
						var12 = var8[var10];
						int var13 = this.field329[var9 + var12 * 8];
						if (var13 >= 0) {
							int var14 = var10 * this.field330 + this.field325;
							VorbisCodebook var15 = VorbisSample.field383[var13];
							int var16;
							if (this.field327 == 0) {
								var16 = this.field330 / var15.field362;

								for (int var20 = 0; var20 < var16; ++var20) {
									float[] var21 = var15.method1027(var4);

									for (int var19 = 0; var19 < var15.field362; ++var19) {
										var1[var14 + var20 + var19 * var16] += var21[var19];
									}
								}
							} else {
								var16 = 0;

								while (var16 < this.field330) {
									float[] var17 = var15.method1027(var4);

									for (int var18 = 0; var18 < var15.field362; ++var18) {
										var1[var14 + var16] += var17[var18];
										++var16;
									}
								}
							}
						}

						++var10;
						if (var10 >= var7) {
							break;
						}
					}
				}
			}

		}
	}
}
