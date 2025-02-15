import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tm")
@Implements("DualNode")
public class DualNode extends Node {
	@ObfuscatedName("ei")
	@Export("keyDual")
	public long keyDual;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	@Export("previousDual")
	public DualNode previousDual;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	@Export("nextDual")
	public DualNode nextDual;

	@ObfuscatedName("kt")
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
