import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("cq")
@Implements("AbstractSound")
public abstract class AbstractSound extends Node {
	@ObfuscatedName("an")
	@Export("position")
	int position;

	AbstractSound() {
	}
}
