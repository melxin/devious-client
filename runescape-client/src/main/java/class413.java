import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pa")
public class class413 {
	@ObfuscatedName("af")
	static int[] field4799;
	@ObfuscatedName("as")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("av")
	int[] field4803;
	@ObfuscatedName("am")
	int[] field4805;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -398477263
	)
	int field4798;

	public class413() {
		this.spriteMap = new HashMap();
		this.bounds = new Bounds(0, 0);
		this.field4803 = new int[2048];
		this.field4805 = new int[2048];
		this.field4798 = 0;
		field4799 = new int[2000];
		int var1 = 0;
		int var2 = 240;

		int var4;
		for (byte var3 = 12; var1 < 16; var2 -= var3) {
			var4 = HitSplatDefinition.method5422((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)(0.075F + 0.425F * (float)var1 / 16.0F));
			field4799[var1] = var4;
			++var1;
		}

		var2 = 48;

		for (int var6 = var2 / 6; var1 < field4799.length; var2 -= var6) {
			var4 = var1 * 2;

			for (int var5 = HitSplatDefinition.method5422((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var4 && var1 < field4799.length; ++var1) {
				field4799[var1] = var5;
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2067006566"
	)
	void method7904(int var1) {
		int var2 = var1 * 2 + 1;
		double var4 = (double)((float)var1 / 3.0F);
		int var6 = var1 * 2 + 1;
		double[] var7 = new double[var6];
		int var8 = -var1;

		for (int var9 = 0; var8 <= var1; ++var9) {
			double var16 = (double)(var8 - 0) / var4;
			double var14 = Math.exp(var16 * -var16 / 2.0D) / Math.sqrt(6.283185307179586D);
			double var24 = var14 / var4;
			var7[var9] = var24;
			++var8;
		}

		double[] var18 = var7;
		double var19 = var7[var1] * var7[var1];
		int[] var21 = new int[var2 * var2];
		boolean var10 = false;

		for (int var11 = 0; var11 < var2; ++var11) {
			for (int var12 = 0; var12 < var2; ++var12) {
				int var13 = var21[var12 + var11 * var2] = (int)(var18[var12] * var18[var11] / var19 * 256.0D);
				if (!var10 && var13 > 0) {
					var10 = true;
				}
			}
		}

		SpritePixels var22 = new SpritePixels(var21, var2, var2);
		this.spriteMap.put(var1, var22);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Lwc;",
		garbageValue = "-82"
	)
	SpritePixels method7905(int var1) {
		if (!this.spriteMap.containsKey(var1)) {
			this.method7904(var1);
		}

		return (SpritePixels)this.spriteMap.get(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1181831999"
	)
	public final void method7906(int var1, int var2) {
		if (this.field4798 < this.field4803.length) {
			this.field4803[this.field4798] = var1;
			this.field4805[this.field4798] = var2;
			++this.field4798;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1135573552"
	)
	public final void method7907() {
		this.field4798 = 0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IILwc;FI)V",
		garbageValue = "-667437099"
	)
	public final void method7908(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(18.0F * var4);
		SpritePixels var6 = this.method7905(var5);
		int var7 = var5 * 2 + 1;
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
		Bounds var9 = new Bounds(0, 0);
		this.bounds.setHigh(var7, var7);
		System.nanoTime();

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field4798; ++var10) {
			var11 = this.field4803[var10];
			var12 = this.field4805[var10];
			int var13 = (int)((float)(var11 - var1) * var4) - var5;
			int var14 = (int)((float)var3.subHeight - (float)(var12 - var2) * var4) - var5;
			this.bounds.setLow(var13, var14);
			this.bounds.method8308(var8, var9);
			this.method7912(var6, var3, var9);
		}

		System.nanoTime();
		System.nanoTime();

		for (var10 = 0; var10 < var3.pixels.length; ++var10) {
			if (var3.pixels[var10] == 0) {
				var3.pixels[var10] = -16777216;
			} else {
				var11 = (var3.pixels[var10] + 64 - 1) / 256;
				if (var11 <= 0) {
					var3.pixels[var10] = -16777216;
				} else {
					if (var11 > field4799.length) {
						var11 = field4799.length;
					}

					var12 = field4799[var11 - 1];
					var3.pixels[var10] = -16777216 | var12;
				}
			}
		}

		System.nanoTime();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lwc;Lwc;Lqs;B)V",
		garbageValue = "39"
	)
	void method7912(SpritePixels var1, SpritePixels var2, Bounds var3) {
		if (var3.highX != 0 && var3.highY != 0) {
			int var4 = 0;
			int var5 = 0;
			if (var3.lowX == 0) {
				var4 = var1.subWidth - var3.highX;
			}

			if (var3.lowY == 0) {
				var5 = var1.subHeight - var3.highY;
			}

			int var6 = var4 + var5 * var1.subWidth;
			int var7 = var2.subWidth * var3.lowY + var3.lowX;

			for (int var8 = 0; var8 < var3.highY; ++var8) {
				for (int var9 = 0; var9 < var3.highX; ++var9) {
					int[] var10000 = var2.pixels;
					int var10001 = var7++;
					var10000[var10001] += var1.pixels[var6++];
				}

				var6 += var1.subWidth - var3.highX;
				var7 += var2.subWidth - var3.highX;
			}

		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-68780674"
	)
	public static void method7928() {
		DbTableType.DBTableType_cache.clear();
	}
}
