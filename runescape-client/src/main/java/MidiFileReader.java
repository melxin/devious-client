import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mo")
@Implements("MidiFileReader")
public class MidiFileReader {
	@ObfuscatedName("aq")
	static final byte[] field3745;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("am")
	@Export("division")
	int division;
	@ObfuscatedName("aa")
	@Export("trackLengths")
	int[] trackLengths;
	@ObfuscatedName("ap")
	int field3749;
	@ObfuscatedName("ax")
	@Export("trackStarts")
	int[] trackStarts;
	@ObfuscatedName("aw")
	@Export("trackPositions")
	int[] trackPositions;
	@ObfuscatedName("ar")
	int[] field3747;
	@ObfuscatedName("au")
	long field3741;

	static {
		field3745 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	}

	MidiFileReader() {
		this.buffer = new Buffer((byte[])null);
	}

	@ObfuscatedName("ao")
	@Export("parse")
	void parse(byte[] var1) {
		this.buffer.array = var1;
		this.buffer.offset = 296997470;
		int var2 = this.buffer.readUnsignedShort();
		this.division = this.buffer.readUnsignedShort();
		this.field3749 = 500000;
		this.trackStarts = new int[var2];

		Buffer var10000;
		int var3;
		int var5;
		for (var3 = 0; var3 < var2; var10000.offset += var5 * 29699747) {
			int var4 = this.buffer.readInt();
			var5 = this.buffer.readInt();
			if (var4 == 1297379947) {
				this.trackStarts[var3] = this.buffer.offset * -2066221813;
				++var3;
			}

			var10000 = this.buffer;
		}

		this.field3741 = 0L;
		this.trackPositions = new int[var2];

		for (var3 = 0; var3 < var2; ++var3) {
			this.trackPositions[var3] = this.trackStarts[var3];
		}

		this.trackLengths = new int[var2];
		this.field3747 = new int[var2];
	}

	@ObfuscatedName("an")
	@Export("clear")
	void clear() {
		this.buffer.array = null;
		this.trackStarts = null;
		this.trackPositions = null;
		this.trackLengths = null;
		this.field3747 = null;
	}

	@ObfuscatedName("ae")
	@Export("isReady")
	boolean isReady() {
		return this.buffer.array != null;
	}

	@ObfuscatedName("af")
	@Export("trackCount")
	int trackCount() {
		return this.trackPositions.length;
	}

	@ObfuscatedName("as")
	@Export("gotoTrack")
	void gotoTrack(int var1) {
		this.buffer.offset = this.trackPositions[var1] * 29699747;
	}

	@ObfuscatedName("aq")
	@Export("markTrackPosition")
	void markTrackPosition(int var1) {
		this.trackPositions[var1] = this.buffer.offset * -2066221813;
	}

	@ObfuscatedName("av")
	@Export("setTrackDone")
	void setTrackDone() {
		this.buffer.offset = -29699747;
	}

	@ObfuscatedName("am")
	@Export("readTrackLength")
	void readTrackLength(int var1) {
		int var2 = this.buffer.readVarInt();
		int[] var10000 = this.trackLengths;
		var10000[var1] += var2;
	}

	@ObfuscatedName("aa")
	@Export("readMessage")
	int readMessage(int var1) {
		int var2 = this.readMessage0(var1);
		return var2;
	}

	@ObfuscatedName("ap")
	@Export("readMessage0")
	int readMessage0(int var1) {
		byte var2 = this.buffer.array[this.buffer.offset * -2066221813];
		Buffer var10000;
		int var5;
		if (var2 < 0) {
			var5 = var2 & 255;
			this.field3747[var1] = var5;
			var10000 = this.buffer;
			var10000.offset += 29699747;
		} else {
			var5 = this.field3747[var1];
		}

		if (var5 != 240 && var5 != 247) {
			return this.method6787(var1, var5);
		} else {
			int var3 = this.buffer.readVarInt();
			if (var5 == 247 && var3 > 0) {
				int var4 = this.buffer.array[this.buffer.offset * -2066221813] & 255;
				if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
					var10000 = this.buffer;
					var10000.offset += 29699747;
					this.field3747[var1] = var4;
					return this.method6787(var1, var4);
				}
			}

			var10000 = this.buffer;
			var10000.offset += var3 * 29699747;
			return 0;
		}
	}

	@ObfuscatedName("ax")
	int method6787(int var1, int var2) {
		int var4;
		if (var2 == 255) {
			int var7 = this.buffer.readUnsignedByte();
			var4 = this.buffer.readVarInt();
			Buffer var10000;
			if (var7 == 47) {
				var10000 = this.buffer;
				var10000.offset += var4 * 29699747;
				return 1;
			} else if (var7 == 81) {
				int var5 = this.buffer.readMedium();
				var4 -= 3;
				int var6 = this.trackLengths[var1];
				this.field3741 += (long)var6 * (long)(this.field3749 - var5);
				this.field3749 = var5;
				var10000 = this.buffer;
				var10000.offset += var4 * 29699747;
				return 2;
			} else {
				var10000 = this.buffer;
				var10000.offset += var4 * 29699747;
				return 3;
			}
		} else {
			byte var3 = field3745[var2 - 128];
			var4 = var2;
			if (var3 >= 1) {
				var4 = var2 | this.buffer.readUnsignedByte() << 8;
			}

			if (var3 >= 2) {
				var4 |= this.buffer.readUnsignedByte() << 16;
			}

			return var4;
		}
	}

	@ObfuscatedName("aw")
	long method6767(int var1) {
		return this.field3741 + (long)var1 * (long)this.field3749;
	}

	@ObfuscatedName("ar")
	@Export("getPrioritizedTrack")
	int getPrioritizedTrack() {
		int var1 = this.trackPositions.length;
		int var2 = -1;
		int var3 = Integer.MAX_VALUE;

		for (int var4 = 0; var4 < var1; ++var4) {
			if (this.trackPositions[var4] >= 0 && this.trackLengths[var4] < var3) {
				var2 = var4;
				var3 = this.trackLengths[var4];
			}
		}

		return var2;
	}

	@ObfuscatedName("au")
	@Export("isDone")
	boolean isDone() {
		int var1 = this.trackPositions.length;

		for (int var2 = 0; var2 < var1; ++var2) {
			if (this.trackPositions[var2] >= 0) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("aj")
	@Export("reset")
	void reset(long var1) {
		this.field3741 = var1;
		int var3 = this.trackPositions.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			this.trackLengths[var4] = 0;
			this.field3747[var4] = 0;
			this.buffer.offset = this.trackStarts[var4] * 29699747;
			this.readTrackLength(var4);
			this.trackPositions[var4] = this.buffer.offset * -2066221813;
		}

	}
}
