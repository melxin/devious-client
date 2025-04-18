import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("an")
public class class1 implements Callable {
	@ObfuscatedName("vq")
	@ObfuscatedSignature(
		descriptor = "Lbe;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	final Buffer field3;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	final class3 field1;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lam;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lam;Lve;Laf;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1;
		this.field3 = var2;
		this.field1 = var3;
	}

	public Object call() {
		return this.field1.vmethod14(this.field3);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZB)Lwc;",
		garbageValue = "-3"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) {
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) {
			var4 = 1;
		}

		long var6 = ((long)var2 << 38) + ((long)var1 << 16) + (long)var0 + ((long)var4 << 40) + ((long)var3 << 42);
		SpritePixels var8;
		if (!var5) {
			var8 = (SpritePixels)ItemComposition.ItemDefinition_cachedSprites.get(var6);
			if (var8 != null) {
				return var8;
			}
		}

		ItemComposition var9 = class231.ItemDefinition_get(var0);
		if (var1 > 1 && var9.countobj != null) {
			int var10 = -1;

			for (int var11 = 0; var11 < 10; ++var11) {
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) {
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) {
				var9 = class231.ItemDefinition_get(var10);
			}
		}

		Model var20 = var9.getModel(1);
		if (var20 == null) {
			return null;
		} else {
			SpritePixels var21 = null;
			if (var9.noteTemplate != -1) {
				var21 = getItemSprite(var9.note, 10, 1, 0, 0, true);
				if (var21 == null) {
					return null;
				}
			} else if (var9.notedId != -1) {
				var21 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false);
				if (var21 == null) {
					return null;
				}
			} else if (var9.placeholderTemplate != -1) {
				var21 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false);
				if (var21 == null) {
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels;
			int var13 = Rasterizer2D.Rasterizer2D_width;
			int var14 = Rasterizer2D.Rasterizer2D_height;
			float[] var15 = Rasterizer2D.Rasterizer2D_brightness;
			int[] var16 = new int[4];
			Rasterizer2D.Rasterizer2D_getClipArray(var16);
			var8 = new SpritePixels(36, 32);
			Rasterizer3D.method3900(var8.pixels, 36, 32, (float[])null);
			Rasterizer2D.Rasterizer2D_clear();
			Rasterizer3D.resetRasterClipping();
			Rasterizer3D.setCustomClipBounds(16, 16);
			Rasterizer3D.clips.rasterGouraudLowRes = false;
			if (var9.placeholderTemplate != -1) {
				var21.drawTransBgAt(0, 0);
			}

			int var17 = var9.zoom2d;
			if (var5) {
				var17 = (int)(1.5D * (double)var17);
			} else if (var2 == 2) {
				var17 = (int)((double)var17 * 1.04D);
			}

			int var18 = var17 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16;
			int var19 = var17 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16;
			var20.calculateBoundsCylinder();
			var20.drawFrustum(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var20.height / 2 + var18 + var9.offsetY2d, var19 + var9.offsetY2d);
			if (var9.notedId != -1) {
				var21.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) {
				var8.outline(1);
			}

			if (var2 >= 2) {
				var8.outline(16777215);
			}

			if (var3 != 0) {
				var8.shadow(var3);
			}

			Rasterizer3D.method3900(var8.pixels, 36, 32, (float[])null);
			if (var9.noteTemplate != -1) {
				var21.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) {
				WorldMapAreaData.ItemDefinition_fontPlain11.draw(WorldMapData_1.method6224(var1), 0, 9, 16776960, 1);
			}

			if (!var5) {
				ItemComposition.ItemDefinition_cachedSprites.put(var8, var6);
			}

			Rasterizer3D.method3900(var12, var13, var14, var15);
			Rasterizer2D.Rasterizer2D_setClipArray(var16);
			Rasterizer3D.resetRasterClipping();
			Rasterizer3D.clips.rasterGouraudLowRes = true;
			return var8;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "100"
	)
	static final void method8() {
		ClanSettings.method3631("You can't add yourself to your own friend list");
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ldj;[BIIIII)V",
		garbageValue = "576694650"
	)
	static final void method12(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5) {
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		if (var0.collisionMaps != null) {
			for (int var6 = 0; var6 < 4; ++var6) {
				var7 = var2 - var0.collisionMaps[var6].xInset;
				var8 = var3 - var0.collisionMaps[var6].yInset;

				for (var9 = 0; var9 < 64; ++var9) {
					var10 = var7 + var9;

					for (var11 = 0; var11 < 64; ++var11) {
						int var12 = var11 + var8;
						if (var10 > 0 && var10 < var0.collisionMaps[var6].flags.length && var12 > 0 && var12 < var0.collisionMaps[var6].flags[var10].length) {
							int[] var10000 = var0.collisionMaps[var6].flags[var10];
							var10000[var12] &= -1073741825;
						}
					}
				}
			}
		}

		Buffer var13 = new Buffer(var1);

		for (var7 = 0; var7 < 4; ++var7) {
			for (var8 = 0; var8 < 64; ++var8) {
				for (var9 = 0; var9 < 64; ++var9) {
					var10 = var8 + var2;
					var11 = var3 + var9;
					class232.loadTerrain(var0, var13, var7, var10, var11, var10 + var4, var5 + var11, 0);
				}
			}
		}

	}
}
