import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("qm")
public class class440 {
	@ObfuscatedName("ax")
	static final int[] field4721;
	@ObfuscatedName("ai")
	static final int[] field4727;

	static {
		field4721 = new int[2048];
		field4727 = new int[2048];
		double var0 = 0.0030679615757712823D;

		for (int var2 = 0; var2 < 2048; ++var2) {
			field4721[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2));
			field4727[var2] = (int)(65536.0D * Math.cos((double)var2 * var0));
		}

	}
}
