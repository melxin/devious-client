import java.util.ArrayList;
import java.util.BitSet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nk")
@Implements("MusicPatch")
public class MusicPatch extends Node {
	@ObfuscatedName("uo")
	@ObfuscatedGetter(
		intValue = 2105467855
	)
	static int field3764;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -136989647
	)
	int field3755;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lcd;"
	)
	@Export("rawSounds")
	class53[] rawSounds;
	@ObfuscatedName("ad")
	short[] field3757;
	@ObfuscatedName("ah")
	byte[] field3758;
	@ObfuscatedName("ac")
	byte[] field3760;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lmn;"
	)
	MusicPatchNode2[] field3759;
	@ObfuscatedName("af")
	byte[] field3761;
	@ObfuscatedName("aa")
	ArrayList field3762;
	@ObfuscatedName("as")
	int[] field3763;

	MusicPatch(byte[] var1) {
		this.field3762 = new ArrayList(8);
		this.rawSounds = new class53[128];
		this.field3757 = new short[128];
		this.field3758 = new byte[128];
		this.field3760 = new byte[128];
		this.field3759 = new MusicPatchNode2[128];
		this.field3761 = new byte[128];
		this.field3763 = new int[128];
		Buffer var2 = new Buffer(var1);

		int var3;
		for (var3 = 0; var2.array[var3 + var2.offset] != 0; ++var3) {
		}

		byte[] var4 = new byte[var3];

		int var5;
		for (var5 = 0; var5 < var3; ++var5) {
			var4[var5] = var2.readByte();
		}

		++var2.offset;
		++var3;
		var5 = var2.offset;
		var2.offset += var3;

		int var6;
		for (var6 = 0; var2.array[var6 + var2.offset] != 0; ++var6) {
		}

		byte[] var7 = new byte[var6];

		int var8;
		for (var8 = 0; var8 < var6; ++var8) {
			var7[var8] = var2.readByte();
		}

		++var2.offset;
		++var6;
		var8 = var2.offset;
		var2.offset += var6;

		int var9;
		for (var9 = 0; var2.array[var9 + var2.offset] != 0; ++var9) {
		}

		byte[] var10 = new byte[var9];

		for (int var11 = 0; var11 < var9; ++var11) {
			var10[var11] = var2.readByte();
		}

		++var2.offset;
		++var9;
		byte[] var38 = new byte[var9];
		int var12;
		int var14;
		if (var9 > 1) {
			var38[1] = 1;
			int var13 = 1;
			var12 = 2;

			for (var14 = 2; var14 < var9; ++var14) {
				int var43 = var2.readUnsignedByte();
				if (var43 == 0) {
					var13 = var12++;
				} else {
					if (var43 <= var13) {
						--var43;
					}

					var13 = var43;
				}

				var38[var14] = (byte)var13;
			}
		} else {
			var12 = var9;
		}

		MusicPatchNode2[] var39 = new MusicPatchNode2[var12];

		MusicPatchNode2 var15;
		for (var14 = 0; var14 < var39.length; ++var14) {
			var15 = var39[var14] = new MusicPatchNode2();
			int var42 = var2.readUnsignedByte();
			if (var42 > 0) {
				var15.field3681 = new byte[var42 * 2];
			}

			var42 = var2.readUnsignedByte();
			if (var42 > 0) {
				var15.field3676 = new byte[var42 * 2 + 2];
				var15.field3676[1] = 64;
			}
		}

		var14 = var2.readUnsignedByte();
		byte[] var44 = var14 > 0 ? new byte[var14 * 2] : null;
		var14 = var2.readUnsignedByte();
		byte[] var16 = var14 > 0 ? new byte[var14 * 2] : null;

		int var17;
		for (var17 = 0; var2.array[var17 + var2.offset] != 0; ++var17) {
		}

		byte[] var18 = new byte[var17];

		int var19;
		for (var19 = 0; var19 < var17; ++var19) {
			var18[var19] = var2.readByte();
		}

		++var2.offset;
		++var17;
		var19 = 0;

		int var20;
		for (var20 = 0; var20 < 128; ++var20) {
			var19 += var2.readUnsignedByte();
			this.field3757[var20] = (short)var19;
		}

		var19 = 0;

		short[] var50;
		for (var20 = 0; var20 < 128; ++var20) {
			var19 += var2.readUnsignedByte();
			var50 = this.field3757;
			var50[var20] = (short)(var50[var20] + (var19 << 8));
		}

		var20 = 0;
		int var21 = 0;
		int var22 = 0;

		int var23;
		for (var23 = 0; var23 < 128; ++var23) {
			if (var20 == 0) {
				if (var21 < var18.length) {
					var20 = var18[var21++];
				} else {
					var20 = -1;
				}

				var22 = var2.readVarInt();
			}

			var50 = this.field3757;
			var50[var23] = (short)(var50[var23] + ((var22 - 1 & 2) << 14));
			this.field3763[var23] = var22;
			--var20;
		}

		var20 = 0;
		var21 = 0;
		var23 = 0;

		int var24;
		for (var24 = 0; var24 < 128; ++var24) {
			if (this.field3763[var24] != 0) {
				if (var20 == 0) {
					if (var21 < var4.length) {
						var20 = var4[var21++];
					} else {
						var20 = -1;
					}

					var23 = var2.array[var5++] - 1;
				}

				this.field3761[var24] = (byte)var23;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		var24 = 0;

		for (int var25 = 0; var25 < 128; ++var25) {
			if (this.field3763[var25] != 0) {
				if (var20 == 0) {
					if (var21 < var7.length) {
						var20 = var7[var21++];
					} else {
						var20 = -1;
					}

					var24 = var2.array[var8++] + 16 << 2;
				}

				this.field3760[var25] = (byte)var24;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		MusicPatchNode2 var40 = null;

		int var26;
		for (var26 = 0; var26 < 128; ++var26) {
			if (this.field3763[var26] != 0) {
				if (var20 == 0) {
					var40 = var39[var38[var21]];
					if (var21 < var10.length) {
						var20 = var10[var21++];
					} else {
						var20 = -1;
					}
				}

				this.field3759[var26] = var40;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		var26 = 0;

		int var27;
		for (var27 = 0; var27 < 128; ++var27) {
			if (var20 == 0) {
				if (var21 < var18.length) {
					var20 = var18[var21++];
				} else {
					var20 = -1;
				}

				if (this.field3763[var27] > 0) {
					var26 = var2.readUnsignedByte() + 1;
				}
			}

			this.field3758[var27] = (byte)var26;
			--var20;
		}

		this.field3755 = var2.readUnsignedByte() + 1;

		int var29;
		MusicPatchNode2 var41;
		for (var27 = 0; var27 < var12; ++var27) {
			var41 = var39[var27];
			if (var41.field3681 != null) {
				for (var29 = 1; var29 < var41.field3681.length; var29 += 2) {
					var41.field3681[var29] = var2.readByte();
				}
			}

			if (var41.field3676 != null) {
				for (var29 = 3; var29 < var41.field3676.length - 2; var29 += 2) {
					var41.field3676[var29] = var2.readByte();
				}
			}
		}

		if (var44 != null) {
			for (var27 = 1; var27 < var44.length; var27 += 2) {
				var44[var27] = var2.readByte();
			}
		}

		if (var16 != null) {
			for (var27 = 1; var27 < var16.length; var27 += 2) {
				var16[var27] = var2.readByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var41 = var39[var27];
			if (var41.field3676 != null) {
				var19 = 0;

				for (var29 = 2; var29 < var41.field3676.length; var29 += 2) {
					var19 = 1 + var19 + var2.readUnsignedByte();
					var41.field3676[var29] = (byte)var19;
				}
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var41 = var39[var27];
			if (var41.field3681 != null) {
				var19 = 0;

				for (var29 = 2; var29 < var41.field3681.length; var29 += 2) {
					var19 = 1 + var19 + var2.readUnsignedByte();
					var41.field3681[var29] = (byte)var19;
				}
			}
		}

		byte var30;
		int var32;
		int var33;
		int var34;
		int var35;
		int var36;
		int var47;
		byte var49;
		if (var44 != null) {
			var19 = var2.readUnsignedByte();
			var44[0] = (byte)var19;

			for (var27 = 2; var27 < var44.length; var27 += 2) {
				var19 = 1 + var19 + var2.readUnsignedByte();
				var44[var27] = (byte)var19;
			}

			var49 = var44[0];
			byte var28 = var44[1];

			for (var29 = 0; var29 < var49; ++var29) {
				this.field3758[var29] = (byte)(var28 * this.field3758[var29] + 32 >> 6);
			}

			for (var29 = 2; var29 < var44.length; var29 += 2) {
				var30 = var44[var29];
				byte var31 = var44[var29 + 1];
				var32 = var28 * (var30 - var49) + (var30 - var49) / 2;

				for (var33 = var49; var33 < var30; ++var33) {
					var35 = var30 - var49;
					var36 = var32 >>> 31;
					var34 = (var36 + var32) / var35 - var36;
					this.field3758[var33] = (byte)(var34 * this.field3758[var33] + 32 >> 6);
					var32 += var31 - var28;
				}

				var49 = var30;
				var28 = var31;
			}

			for (var47 = var49; var47 < 128; ++var47) {
				this.field3758[var47] = (byte)(var28 * this.field3758[var47] + 32 >> 6);
			}

			var15 = null;
		}

		if (var16 != null) {
			var19 = var2.readUnsignedByte();
			var16[0] = (byte)var19;

			for (var27 = 2; var27 < var16.length; var27 += 2) {
				var19 = 1 + var19 + var2.readUnsignedByte();
				var16[var27] = (byte)var19;
			}

			var49 = var16[0];
			int var46 = var16[1] << 1;

			for (var29 = 0; var29 < var49; ++var29) {
				var47 = var46 + (this.field3760[var29] & 255);
				if (var47 < 0) {
					var47 = 0;
				}

				if (var47 > 128) {
					var47 = 128;
				}

				this.field3760[var29] = (byte)var47;
			}

			int var48;
			for (var29 = 2; var29 < var16.length; var29 += 2) {
				var30 = var16[var29];
				var48 = var16[var29 + 1] << 1;
				var32 = var46 * (var30 - var49) + (var30 - var49) / 2;

				for (var33 = var49; var33 < var30; ++var33) {
					var35 = var30 - var49;
					var36 = var32 >>> 31;
					var34 = (var32 + var36) / var35 - var36;
					int var37 = var34 + (this.field3760[var33] & 255);
					if (var37 < 0) {
						var37 = 0;
					}

					if (var37 > 128) {
						var37 = 128;
					}

					this.field3760[var33] = (byte)var37;
					var32 += var48 - var46;
				}

				var49 = var30;
				var46 = var48;
			}

			for (var47 = var49; var47 < 128; ++var47) {
				var48 = var46 + (this.field3760[var47] & 255);
				if (var48 < 0) {
					var48 = 0;
				}

				if (var48 > 128) {
					var48 = 128;
				}

				this.field3760[var47] = (byte)var48;
			}

			Object var45 = null;
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var39[var27].field3677 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var41 = var39[var27];
			if (var41.field3681 != null) {
				var41.field3678 = var2.readUnsignedByte();
			}

			if (var41.field3676 != null) {
				var41.field3679 = var2.readUnsignedByte();
			}

			if (var41.field3677 > 0) {
				var41.field3680 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var39[var27].field3682 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var41 = var39[var27];
			if (var41.field3682 > 0) {
				var41.field3683 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var41 = var39[var27];
			if (var41.field3683 > 0) {
				var41.field3675 = var2.readUnsignedByte();
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lbi;Ljava/util/BitSet;I)Z",
		garbageValue = "-550430987"
	)
	boolean method6786(SoundCache var1, BitSet var2) {
		boolean var3 = true;
		int var4 = 0;
		class53 var5 = new class53();

		int var7;
		for (int var6 = var2.nextSetBit(0); var6 != -1; var6 = var2.nextSetBit(var7)) {
			var7 = var2.nextClearBit(var6);

			for (int var8 = var6; var8 < var7; ++var8) {
				if (var2.get(var8)) {
					int var9 = this.field3763[var8];
					if (var9 != 0) {
						if (var4 != var9) {
							var4 = var9--;
							if ((var9 & 1) == 0) {
								var5 = new class53(var1.method839(var9 >> 2));
							} else {
								var5 = var1.method853(var9 >> 2);
							}

							if (var5.method1058()) {
								var3 = false;
							} else {
								this.field3762.add(this.field3762.size(), var5);
							}
						}

						if (!var5.method1058()) {
							this.rawSounds[var8] = var5;
							this.field3763[var8] = 0;
						}
					}
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1595199927"
	)
	void method6788() {
		this.field3763 = null;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Lnz;I)V",
		garbageValue = "-1783220395"
	)
	static void method6787(Widget var0) {
		var0.method7363();
		var0.method7331().method7182(new class109(var0));
		var0.method7331().method7067(new class110(var0));
	}
}
