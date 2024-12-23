import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ti")
@Implements("DualNode")
public class DualNode extends Node {
	@ObfuscatedName("en")
	@Export("keyDual")
	public long keyDual;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Lti;"
	)
	@Export("previousDual")
	public DualNode previousDual;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Lti;"
	)
	@Export("nextDual")
	public DualNode nextDual;

	@ObfuscatedName("kv")
	@Export("removeDual")
	public void removeDual() {
		if (this.nextDual != null) {
			this.nextDual.previousDual = this.previousDual;
			this.previousDual.nextDual = this.nextDual;
			this.previousDual = null;
			this.nextDual = null;
		}
	}
}
