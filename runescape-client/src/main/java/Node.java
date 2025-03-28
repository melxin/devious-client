import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uy")
@Implements("Node")
public class Node {
	@ObfuscatedName("hc")
	@Export("key")
	public long key;
	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	@Export("previous")
	public Node previous;
	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	@Export("next")
	public Node next;

	@ObfuscatedName("kn")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}

	@ObfuscatedName("kr")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null;
	}
}
