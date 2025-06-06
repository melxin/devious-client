import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
@Implements("TextureProvider")
public class TextureProvider implements TextureLoader {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lgs;"
	)
	@Export("textures")
	Texture[] textures;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqx;"
	)
	@Export("deque")
	NodeDeque deque;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2077997629
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -669948463
	)
	@Export("remaining")
	int remaining;
	@ObfuscatedName("as")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1160667105
	)
	@Export("textureSize")
	int textureSize;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("archive")
	AbstractArchive archive;

	@ObfuscatedSignature(
		descriptor = "(Lph;Lph;IDI)V"
	)
	public TextureProvider(AbstractArchive var1, AbstractArchive var2, int var3, double var4, int var6) {
		this.deque = new NodeDeque();
		this.remaining = 0;
		this.brightness = 1.0D;
		this.textureSize = 128;
		this.archive = var2;
		this.capacity = var3;
		this.remaining = this.capacity;
		this.brightness = var4;
		this.textureSize = var6;
		int[] var7 = var1.getGroupFileIds(0);
		if (var7 != null) {
			int var8 = var7.length;
			this.textures = new Texture[var1.getGroupFileCount(0)];

			for (int var9 = 0; var9 < var8; ++var9) {
				Buffer var10 = new Buffer(var1.takeFile(0, var7[var9]));
				this.textures[var7[var9]] = new Texture(var10);
			}
		} else {
			this.textures = new Texture[0];
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "7"
	)
	@Export("getLoadedPercentage")
	public int getLoadedPercentage() {
		if (this.textures.length == 0) {
			return 100;
		} else {
			int var1 = 0;
			int var2 = 0;
			Texture[] var3 = this.textures;

			for (int var4 = 0; var4 < var3.length; ++var4) {
				Texture var5 = var3[var4];
				if (var5 != null && var5.fileIds != null) {
					var1 += var5.fileIds.length;
					int[] var6 = var5.fileIds;

					for (int var7 = 0; var7 < var6.length; ++var7) {
						int var8 = var6[var7];
						if (this.archive.method7688(var8)) {
							++var2;
						}
					}
				}
			}

			if (var1 == 0) {
				return 0;
			} else {
				return var2 * 100 / var1;
			}
		}
	}

	@ObfuscatedName("an")
	@Export("setBrightness")
	public void setBrightness(double var1) {
		this.brightness = var1;
		this.clear();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "2121605786"
	)
	@Export("getTexturePixels")
	public int[] getTexturePixels(int var1) {
		Texture var2 = this.textures[var1];
		if (var2 != null) {
			if (var2.pixels != null) {
				this.deque.addLast(var2);
				var2.isLoaded = true;
				return var2.pixels;
			}

			boolean var3 = var2.load(this.brightness, this.textureSize, this.archive);
			if (var3) {
				if (this.remaining == 0) {
					Texture var4 = (Texture)this.deque.removeFirst();
					var4.reset();
				} else {
					--this.remaining;
				}

				this.deque.addLast(var2);
				var2.isLoaded = true;
				return var2.pixels;
			}
		}

		return null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1615037448"
	)
	@Export("getAverageTextureRGB")
	public int getAverageTextureRGB(int var1) {
		return this.textures[var1] != null ? this.textures[var1].averageRGB : 0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "1824"
	)
	public boolean vmethod4697(int var1) {
		return this.textures[var1].field1946;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "18"
	)
	@Export("isLowDetail")
	public boolean isLowDetail(int var1) {
		return this.textureSize == 64;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1974404543"
	)
	@Export("clear")
	public void clear() {
		for (int var1 = 0; var1 < this.textures.length; ++var1) {
			if (this.textures[var1] != null) {
				this.textures[var1].reset();
			}
		}

		this.deque = new NodeDeque();
		this.remaining = this.capacity;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "4"
	)
	@Export("animate")
	public void animate(int var1) {
		for (int var2 = 0; var2 < this.textures.length; ++var2) {
			Texture var3 = this.textures[var2];
			if (var3 != null && var3.animationDirection != 0 && var3.isLoaded) {
				var3.animate(var1);
				var3.isLoaded = false;
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)[B",
		garbageValue = "2"
	)
	static byte[] method4360(String var0) {
		boolean var1 = true;
		boolean var2 = true;
		int var3 = "pattern".length();
		int var4 = 0;
		byte[] var5 = new byte[8];

		while (true) {
			int var6 = var3 + var4;
			if (var6 >= var0.length()) {
				return null;
			}

			char var7 = var0.charAt(var6);
			if (var7 == ':') {
				if (var4 == 0) {
					return null;
				}

				byte[] var8 = new byte[var4];
				System.arraycopy(var5, 0, var8, 0, var4);
				return var8;
			}

			if (var5.length == var4) {
				return null;
			}

			if (var7 >= '0' && var7 <= '9') {
				var7 = (char)(var7 - '0');
			} else {
				if (var7 < 'a' || var7 > 'z') {
					return null;
				}

				var7 = (char)(var7 - 'W');
			}

			var5[var4++] = (byte)var7;
		}
	}

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "(Lnh;IIB)V",
		garbageValue = "32"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) {
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) {
			var0.x = (var1 - var0.width * 624892547) / 2 + var0.rawX;
		} else if (var0.xAlignment == 2) {
			var0.x = var1 - var0.width * 624892547 - var0.rawX;
		} else if (var0.xAlignment == 3) {
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) {
			var0.x = (var0.rawX * var1 >> 14) + (var1 - var0.width * 624892547) / 2;
		} else {
			var0.x = var1 - var0.width * 624892547 - (var0.rawX * var1 >> 14);
		}

		if (var0.yAlignment == 0) {
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) {
			var0.y = (var2 - var0.height * 1265510039) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) {
			var0.y = var2 - var0.height * 1265510039 - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14;
		} else if (var0.yAlignment == 4) {
			var0.y = (var2 * var0.rawY >> 14) + (var2 - var0.height * 1265510039) / 2;
		} else {
			var0.y = var2 - var0.height * 1265510039 - (var2 * var0.rawY >> 14);
		}

	}
}
