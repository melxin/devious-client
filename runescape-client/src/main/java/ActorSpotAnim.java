import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("tt")
@Implements("ActorSpotAnim")
public class ActorSpotAnim extends Node {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1171575623
	)
	@Export("id")
	public int id;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 971664459
	)
	public int field5142;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 77733639
	)
	public int field5141;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1415749665
	)
	@Export("frame")
	public int frame;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -790772793
	)
	@Export("height")
	public int height;

	public ActorSpotAnim(int var1, int var2, int var3, int var4) {
		this.id = -1;
		this.field5142 = 0;
		this.field5141 = 0;
		this.frame = 0;
		this.height = 0;
		this.id = var1;
		this.height = var2;
		this.frame = var3;
		this.field5142 = var4;
	}
}
