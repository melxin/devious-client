import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qi")
@Implements("IterableNodeDeque")
public class IterableNodeDeque implements Iterable, Collection {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Luz;"
	)
	@Export("sentinel")
	Node sentinel;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Luz;"
	)
	Node field4870;

	public IterableNodeDeque() {
		this.sentinel = new Node();
		this.sentinel.previous = this.sentinel;
		this.sentinel.next = this.sentinel;
	}

	@ObfuscatedName("an")
	@Export("rsClear")
	public void rsClear() {
		while (this.sentinel.previous != this.sentinel) {
			this.sentinel.previous.remove();
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Luz;)V"
	)
	@Export("addFirst")
	public void addFirst(Node var1) {
		if (var1.next != null) {
			var1.remove();
		}

		var1.next = this.sentinel.next;
		var1.previous = this.sentinel;
		var1.next.previous = var1;
		var1.previous.next = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Luz;)V"
	)
	@Export("addLast")
	public void addLast(Node var1) {
		if (var1.next != null) {
			var1.remove();
		}

		var1.next = this.sentinel;
		var1.previous = this.sentinel.previous;
		var1.next.previous = var1;
		var1.previous.next = var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Luz;"
	)
	@Export("last")
	public Node last() {
		return this.method8107((Node)null);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luz;)Luz;"
	)
	Node method8107(Node var1) {
		Node var2;
		if (var1 == null) {
			var2 = this.sentinel.previous;
		} else {
			var2 = var1;
		}

		if (var2 == this.sentinel) {
			this.field4870 = null;
			return null;
		} else {
			this.field4870 = var2.previous;
			return var2;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Luz;"
	)
	@Export("previous")
	public Node previous() {
		Node var1 = this.field4870;
		if (var1 == this.sentinel) {
			this.field4870 = null;
			return null;
		} else {
			this.field4870 = var1.previous;
			return var1;
		}
	}

	@ObfuscatedName("am")
	int method8100() {
		int var1 = 0;

		for (Node var2 = this.sentinel.previous; var2 != this.sentinel; var2 = var2.previous) {
			++var1;
		}

		return var1;
	}

	@ObfuscatedName("aa")
	public boolean method8103() {
		return this.sentinel.previous == this.sentinel;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()[Luz;"
	)
	Node[] method8148() {
		Node[] var1 = new Node[this.method8100()];
		int var2 = 0;

		for (Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
			var1[var2++] = var3;
		}

		return var1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Luz;)Z"
	)
	boolean method8111(Node var1) {
		this.addFirst(var1);
		return true;
	}

	public int size() {
		return this.method8100();
	}

	public boolean isEmpty() {
		return this.method8103();
	}

	public Object[] toArray() {
		return this.method8148();
	}

	public Object[] toArray(Object[] var1) {
		int var2 = 0;

		for (Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
			var1[var2++] = var3;
		}

		return var1;
	}

	public boolean remove(Object var1) {
		throw new RuntimeException();
	}

	public boolean containsAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean removeAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean retainAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean add(Object var1) {
		return this.method8111((Node)var1);
	}

	public void clear() {
		this.rsClear();
	}

	public int hashCode() {
		return super.hashCode();
	}

	public Iterator iterator() {
		return new IterableNodeDequeDescendingIterator(this);
	}

	public boolean contains(Object var1) {
		throw new RuntimeException();
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public boolean addAll(Collection var1) {
		throw new RuntimeException();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Luz;Luz;)V"
	)
	@Export("IterableNodeDeque_addBefore")
	public static void IterableNodeDeque_addBefore(Node var0, Node var1) {
		if (var0.next != null) {
			var0.remove();
		}

		var0.next = var1;
		var0.previous = var1.previous;
		var0.next.previous = var0;
		var0.previous.next = var0;
	}
}
