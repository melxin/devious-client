import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bm")
@Implements("RasterProvider")
public final class RasterProvider extends AbstractRasterProvider {
	@ObfuscatedName("ap")
	@Export("image")
	Image image;
	@ObfuscatedName("aj")
	@Export("component")
	Component component;

	RasterProvider(int var1, int var2, Component var3, boolean var4) {
		super.width = var1;
		super.height = var2;
		super.pixels = new int[var2 * var1 + 1];
		if (var4) {
			super.field5775 = new float[var2 * var1 + 1];
		}

		DataBufferInt var5 = new DataBufferInt(super.pixels, super.pixels.length);
		DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(super.width, super.height), var5, (Point)null);
		this.image = new BufferedImage(var6, var7, false, new Hashtable());
		this.setComponent(var3);
		this.apply();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-24006145"
	)
	@Export("setComponent")
	final void setComponent(Component var1) {
		this.component = var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1599847989"
	)
	@Export("drawFull")
	public final void drawFull(int var1, int var2) {
		this.drawFull0(this.component.getGraphics(), var1, var2);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "0"
	)
	@Export("draw")
	public final void draw(int var1, int var2, int var3, int var4) {
		this.draw0(this.component.getGraphics(), var1, var2, var3, var4);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics;IIB)V",
		garbageValue = "-104"
	)
	@Export("drawFull0")
	final void drawFull0(Graphics var1, int var2, int var3) {
		try {
			var1.drawImage(this.image, var2, var3, this.component);
		} catch (Exception var5) {
			this.component.repaint();
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics;IIIII)V",
		garbageValue = "1996941387"
	)
	@Export("draw0")
	final void draw0(Graphics var1, int var2, int var3, int var4, int var5) {
		try {
			Shape var6 = var1.getClip();
			var1.clipRect(var2, var3, var4, var5);
			var1.drawImage(this.image, 0, 0, this.component);
			var1.setClip(var6);
		} catch (Exception var7) {
			this.component.repaint();
		}

	}
}
