import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("ParamDefinition_archive")
	public static AbstractArchive ParamDefinition_archive;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("ParamDefinition_cached")
	static EvictingDualNodeHashTable ParamDefinition_cached;
	@ObfuscatedName("au")
	@Export("type")
	char type;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1761910951
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("ah")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("ac")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	ParamComposition() {
		this.autoDisable = true;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "17"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-241005263"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvy;II)V",
		garbageValue = "229190323"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.type = Varcs.method3065(var1.readByte());
		} else if (var2 == 2) {
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) {
			this.autoDisable = false;
		} else if (var2 == 5) {
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1731449205"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's';
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(IIIIZB)V",
		garbageValue = "105"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 < 1) {
			var3 = 1;
		}

		int var5 = var3 - 334;
		int var6;
		if (var5 < 0) {
			var6 = Client.field787;
		} else if (var5 >= 100) {
			var6 = Client.field788;
		} else {
			var6 = (Client.field788 - Client.field787) * var5 / 100 + Client.field787;
		}

		int var7 = var3 * var6 * 512 / (var2 * 334);
		int var8;
		int var9;
		short var18;
		if (var7 < Client.field656) {
			var18 = Client.field656;
			var6 = var18 * var2 * 334 / (var3 * 512);
			if (var6 > Client.field675) {
				var6 = Client.field675;
				var8 = var3 * var6 * 512 / (var18 * 334);
				var9 = (var2 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216);
				}

				var0 += var9;
				var2 -= var9 * 2;
			}
		} else if (var7 > Client.field615) {
			var18 = Client.field615;
			var6 = var18 * var2 * 334 / (var3 * 512);
			if (var6 < Client.field782) {
				var6 = Client.field782;
				var8 = var18 * var2 * 334 / (var6 * 512);
				var9 = (var3 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216);
				}

				var1 += var9;
				var3 -= var9 * 2;
			}
		}

		Client.viewportZoom = var3 * var6 / 334;
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) {
			int[] var17 = new int[9];

			for (var9 = 0; var9 < var17.length; ++var9) {
				int var10 = var9 * 32 + 15 + 128;
				int var11 = var10 * 3 + 600;
				int var13 = Rasterizer3D.Rasterizer3D_sine[var10];
				int var15 = var3 - 334;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 100) {
					var15 = 100;
				}

				int var16 = (Client.zoomWidth - Client.zoomHeight) * var15 / 100 + Client.zoomHeight;
				int var14 = var11 * var16 / 256;
				var17[var9] = var14 * var13 >> 16;
			}

			class200.topLevelWorldView.scene.method4955(var17, 500, 800, var2 * 334 / var3, 334);
		}

		Client.viewportOffsetX = var0;
		Client.viewportOffsetY = var1;
		Client.viewportWidth = var2;
		Client.viewportHeight = var3;
	}
}
