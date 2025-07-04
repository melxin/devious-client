import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("xi")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("ap")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1923332713
	)
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("ac")
	@Export("message")
	String message;
	@ObfuscatedName("aa")
	@Export("throwable")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2;
		this.throwable = var1;
	}
}
