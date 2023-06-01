import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qr")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 405209753
	)
	@Export("compass")
	public int compass;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2107532429
	)
	public int field4654;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1581349197
	)
	@Export("mapScenes")
	public int mapScenes;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -973216231
	)
	@Export("headIconsPk")
	public int headIconsPk;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 812049877
	)
	public int field4657;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1595846741
	)
	public int field4658;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1222094955
	)
	public int field4655;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1266276839
	)
	public int field4660;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 148077025
	)
	public int field4661;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1022033619
	)
	public int field4662;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -134112561
	)
	public int field4659;

	public GraphicsDefaults() {
		this.compass = -1;
		this.field4654 = -1;
		this.mapScenes = -1;
		this.headIconsPk = -1;
		this.field4657 = -1;
		this.field4658 = -1;
		this.field4655 = -1;
		this.field4660 = -1;
		this.field4661 = -1;
		this.field4662 = -1;
		this.field4659 = -1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lnq;I)V",
		garbageValue = "757040442"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4651.group);
		Buffer var3 = new Buffer(var2);

		while (true) {
			int var4 = var3.readUnsignedByte();
			if (var4 == 0) {
				return;
			}

			switch(var4) {
			case 1:
				var3.readMedium();
				break;
			case 2:
				this.compass = var3.method8928();
				this.field4654 = var3.method8928();
				this.mapScenes = var3.method8928();
				this.headIconsPk = var3.method8928();
				this.field4657 = var3.method8928();
				this.field4658 = var3.method8928();
				this.field4655 = var3.method8928();
				this.field4660 = var3.method8928();
				this.field4661 = var3.method8928();
				this.field4662 = var3.method8928();
				this.field4659 = var3.method8928();
			}
		}
	}
}
