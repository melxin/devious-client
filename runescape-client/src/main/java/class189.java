import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hi")
public class class189 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("field2023")
	static EvictingDualNodeHashTable field2023;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	static Archive field2024;

	static {
		field2023 = new EvictingDualNodeHashTable(64);
	}
}
