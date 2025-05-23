import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("im")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
	@ObfuscatedName("af")
	@Export("javaVendor")
	public static String javaVendor;
	@ObfuscatedName("mk")
	@ObfuscatedGetter(
		intValue = -1412620743
	)
	@Export("cameraY")
	static int cameraY;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	@Export("current")
	Task current;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("am")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("aa")
	@Export("isClosed")
	boolean isClosed;

	public TaskHandler() {
		this.current = null;
		this.task = null;
		this.isClosed = false;
		javaVendor = "Unknown";
		class447.javaVersion = "1.6";

		try {
			javaVendor = System.getProperty("java.vendor");
			class447.javaVersion = System.getProperty("java.version");
		} catch (Exception var2) {
		}

		this.isClosed = false;
		this.thread = new Thread(this);
		this.thread.setPriority(10);
		this.thread.setDaemon(true);
		this.thread.start();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1454106467"
	)
	@Export("close")
	public final void close() {
		synchronized(this) {
			this.isClosed = true;
			this.notifyAll();
		}

		try {
			this.thread.join();
		} catch (InterruptedException var3) {
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/lang/Object;B)Lip;",
		garbageValue = "-70"
	)
	@Export("newTask")
	final Task newTask(int var1, int var2, int var3, Object var4) {
		Task var5 = new Task();
		var5.type = var1;
		var5.intArgument = var2;
		var5.objectArgument = var4;
		synchronized(this) {
			if (this.task != null) {
				this.task.next = var5;
				this.task = var5;
			} else {
				this.task = this.current = var5;
			}

			this.notify();
			return var5;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)Lip;",
		garbageValue = "49"
	)
	@Export("newSocketTask")
	public final Task newSocketTask(String var1, int var2) {
		return this.newTask(1, var2, 0, var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;IB)Lip;",
		garbageValue = "-16"
	)
	@Export("newThreadTask")
	public final Task newThreadTask(Runnable var1, int var2) {
		return this.newTask(2, var2, 0, var1);
	}

	public final void run() {
		while (true) {
			Task var1;
			synchronized(this) {
				while (true) {
					if (this.isClosed) {
						return;
					}

					if (this.current != null) {
						var1 = this.current;
						this.current = this.current.next;
						if (this.current == null) {
							this.task = null;
						}
						break;
					}

					try {
						this.wait();
					} catch (InterruptedException var8) {
					}
				}
			}

			try {
				int var5 = var1.type;
				if (var5 == 1) {
					var1.result = new Socket(InetAddress.getByName((String)var1.objectArgument), var1.intArgument);
				} else if (var5 == 2) {
					Thread var3 = new Thread((Runnable)var1.objectArgument);
					var3.setDaemon(true);
					var3.start();
					var3.setPriority(var1.intArgument);
					var1.result = var3;
				} else if (var5 == 4) {
					var1.result = new DataInputStream(((URL)var1.objectArgument).openStream());
				}

				var1.status = 1;
			} catch (ThreadDeath var6) {
				throw var6;
			} catch (Throwable var7) {
				var1.status = 2;
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "16"
	)
	public static void method4803() {
		VarcInt.VarcInt_cached.clear();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-964431882"
	)
	static void method4790() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromFriend();
		}

	}

	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "125"
	)
	static void method4791() {
		if (class224.field2524 != null) {
			Client.field569 = Client.cycle;
			class224.field2524.method7907();
			Iterator var0 = class509.topLevelWorldView.players.iterator();

			while (var0.hasNext()) {
				Player var1 = (Player)var0.next();
				class224.field2524.method7906((var1.x >> 7) + class509.topLevelWorldView.baseX, (var1.y >> 7) + class509.topLevelWorldView.baseY);
			}
		}

	}
}
