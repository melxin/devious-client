import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("cy")
@Implements("AbstractSound")
public abstract class AbstractSound extends Node {
	@ObfuscatedName("ay")
	@Export("position")
	int position;

	AbstractSound() {
	}
}
