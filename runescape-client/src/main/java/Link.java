import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uc")
@Implements("Link")
public class Link {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	@Export("previous")
	public Link previous;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	@Export("next")
	public Link next;

	@ObfuscatedName("ab")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}
}
