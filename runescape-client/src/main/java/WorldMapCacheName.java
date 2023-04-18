import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	public static final WorldMapCacheName field3054;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	public static final WorldMapCacheName field3058;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	public static final WorldMapCacheName field3055;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	static final WorldMapCacheName field3056;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	public static final WorldMapCacheName field3053;
	@ObfuscatedName("ab")
	@Export("name")
	public final String name;

	static {
		field3054 = new WorldMapCacheName("details");
		field3058 = new WorldMapCacheName("compositemap");
		field3055 = new WorldMapCacheName("compositetexture");
		field3056 = new WorldMapCacheName("area");
		field3053 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}
}
