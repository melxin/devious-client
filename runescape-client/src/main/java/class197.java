import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
public class class197 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class197 field2103;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class197 field2098;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class197 field2094;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class197 field2097;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class197 field2096;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class197 field2099;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class197 field2100;
	@ObfuscatedName("as")
	static int[] field2095;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1924847043
	)
	final int field2102;

	static {
		field2103 = new class197(0);
		field2098 = new class197(1);
		field2094 = new class197(2);
		field2097 = new class197(3);
		field2096 = new class197(4);
		field2099 = new class197(5);
		field2100 = new class197(6);
		field2095 = null;
	}

	class197(int var1) {
		this.field2102 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1974609479"
	)
	static void method3986() {
		field2095 = new int[7];
		field2095[field2103.field2102] = class213.field2385.field2390;
		field2095[field2098.field2102] = class213.field2389.field2390;
		field2095[field2094.field2102] = class213.field2380.field2390;
		field2095[field2097.field2102] = class213.field2382.field2390;
		field2095[field2096.field2102] = class213.field2392.field2390;
		field2095[field2099.field2102] = class213.field2383.field2390;
		field2095[field2100.field2102] = class213.field2376.field2390;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "677790989"
	)
	public static int method3991(int var0) {
		if (field2095 == null) {
			method3986();
		}

		return field2095[var0];
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ldp;I)V",
		garbageValue = "-1780748773"
	)
	static final void method3992(WorldView var0) {
		int var1 = var0.sizeX;
		int var2 = var0.sizeY;
		int[][][] var3 = var0.tileHeights;
		byte[][][] var4 = var0.tileSettings;
		Scene var5 = var0.scene;
		CollisionMap[] var6 = var0.collisionMaps;

		int var7;
		int var8;
		int var9;
		int var10;
		for (var7 = 0; var7 < 4; ++var7) {
			for (var8 = 0; var8 < var1; ++var8) {
				for (var9 = 0; var9 < var2; ++var9) {
					if ((var0.tileSettings[var7][var8][var9] & 1) == 1) {
						var10 = var7;
						if ((var0.tileSettings[1][var8][var9] & 2) == 2) {
							var10 = var7 - 1;
						}

						if (var10 >= 0 && var6 != null) {
							var6[var10].setBlockedByFloor(var8, var9);
						}
					}
				}
			}
		}

		Tiles.rndHue += (int)(Math.random() * 5.0D) - 2;
		if (Tiles.rndHue < -8) {
			Tiles.rndHue = -8;
		}

		if (Tiles.rndHue > 8) {
			Tiles.rndHue = 8;
		}

		Tiles.rndLightness += (int)(Math.random() * 5.0D) - 2;
		if (Tiles.rndLightness < -16) {
			Tiles.rndLightness = -16;
		}

		if (Tiles.rndLightness > 16) {
			Tiles.rndLightness = 16;
		}

		int var14;
		int var15;
		int var16;
		int[] var10000;
		int var17;
		int var18;
		int var19;
		int var20;
		int var21;
		int var22;
		int var23;
		for (var7 = 0; var7 < 4; ++var7) {
			byte[][] var50 = SpriteMask.Tiles_underlays2[var7];
			boolean var61 = true;
			boolean var62 = true;
			boolean var11 = true;
			boolean var12 = true;
			boolean var13 = true;
			var14 = (int)Math.sqrt(5100.0D);
			var15 = var14 * 768 >> 8;

			int var24;
			int var58;
			for (var16 = 1; var16 < var2 - 1; ++var16) {
				for (var17 = 1; var17 < var1 - 1; ++var17) {
					var18 = var3[var7][var17 + 1][var16] - var3[var7][var17 - 1][var16];
					var19 = var3[var7][var17][var16 + 1] - var3[var7][var17][var16 - 1];
					var20 = (int)Math.sqrt((double)(var19 * var19 + var18 * var18 + 65536));
					var21 = (var18 << 8) / var20;
					var22 = 65536 / var20;
					var23 = (var19 << 8) / var20;
					var24 = (var21 * -50 + var23 * -50 + var22 * -10) / var15 + 96;
					var58 = (var50[var17][var16 + 1] >> 3) + (var50[var17 - 1][var16] >> 2) + (var50[var17][var16 - 1] >> 2) + (var50[var17 + 1][var16] >> 3) + (var50[var17][var16] >> 1);
					SecureUrlRequester.field1506[var17][var16] = var24 - var58;
				}
			}

			for (var16 = 0; var16 < var2; ++var16) {
				Tiles.Tiles_hue[var16] = 0;
				class592.Tiles_saturation[var16] = 0;
				class447.Tiles_lightness[var16] = 0;
				class330.Tiles_hueMultiplier[var16] = 0;
				BoundaryObject.field3005[var16] = 0;
			}

			for (var16 = -5; var16 < var1 + 5; ++var16) {
				for (var17 = 0; var17 < var2; ++var17) {
					var18 = var16 + 5;
					int var10002;
					if (var18 >= 0 && var18 < var1) {
						long var52 = (long)Math.pow(2.0D, 15.0D) - 1L;
						var21 = (int)var52;
						var22 = Tiles.Tiles_underlays[var7][var18][var17] & var21;
						if (var22 > 0) {
							var24 = var22 - 1;
							FloorUnderlayDefinition var54 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var24);
							FloorUnderlayDefinition var55;
							if (var54 != null) {
								var55 = var54;
							} else {
								byte[] var26 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var24);
								var54 = new FloorUnderlayDefinition();
								if (var26 != null) {
									var54.decode(new Buffer(var26), var24);
								}

								var54.postDecode();
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var54, (long)var24);
								var55 = var54;
							}

							var10000 = Tiles.Tiles_hue;
							var10000[var17] += var55.hue;
							var10000 = class592.Tiles_saturation;
							var10000[var17] += var55.saturation;
							var10000 = class447.Tiles_lightness;
							var10000[var17] += var55.lightness;
							var10000 = class330.Tiles_hueMultiplier;
							var10000[var17] += var55.hueMultiplier;
							var10002 = BoundaryObject.field3005[var17]++;
						}
					}

					var19 = var16 - 5;
					if (var19 >= 0 && var19 < var1) {
						long var56 = (long)Math.pow(2.0D, 15.0D) - 1L;
						var22 = (int)var56;
						var23 = Tiles.Tiles_underlays[var7][var19][var17] & var22;
						if (var23 > 0) {
							var58 = var23 - 1;
							FloorUnderlayDefinition var67 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var58);
							FloorUnderlayDefinition var60;
							if (var67 != null) {
								var60 = var67;
							} else {
								byte[] var59 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var58);
								var67 = new FloorUnderlayDefinition();
								if (var59 != null) {
									var67.decode(new Buffer(var59), var58);
								}

								var67.postDecode();
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var67, (long)var58);
								var60 = var67;
							}

							var10000 = Tiles.Tiles_hue;
							var10000[var17] -= var60.hue;
							var10000 = class592.Tiles_saturation;
							var10000[var17] -= var60.saturation;
							var10000 = class447.Tiles_lightness;
							var10000[var17] -= var60.lightness;
							var10000 = class330.Tiles_hueMultiplier;
							var10000[var17] -= var60.hueMultiplier;
							var10002 = BoundaryObject.field3005[var17]--;
						}
					}
				}

				if (var16 >= 1 && var16 < var1 - 1) {
					var17 = 0;
					var18 = 0;
					var19 = 0;
					var20 = 0;
					var21 = 0;

					for (var22 = -5; var22 < var2 + 5; ++var22) {
						var23 = var22 + 5;
						if (var23 >= 0 && var23 < var2) {
							var17 += Tiles.Tiles_hue[var23];
							var18 += class592.Tiles_saturation[var23];
							var19 += class447.Tiles_lightness[var23];
							var20 += class330.Tiles_hueMultiplier[var23];
							var21 += BoundaryObject.field3005[var23];
						}

						var24 = var22 - 5;
						if (var24 >= 0 && var24 < var2) {
							var17 -= Tiles.Tiles_hue[var24];
							var18 -= class592.Tiles_saturation[var24];
							var19 -= class447.Tiles_lightness[var24];
							var20 -= class330.Tiles_hueMultiplier[var24];
							var21 -= BoundaryObject.field3005[var24];
						}

						if (var22 >= 1 && var22 < var2 - 1 && (!Client.isLowDetail || (var4[0][var16][var22] & 2) != 0 || (var4[var7][var16][var22] & 16) == 0)) {
							if (var7 < Tiles.Tiles_minPlane) {
								Tiles.Tiles_minPlane = var7;
							}

							long var25 = (long)Math.pow(2.0D, 15.0D) - 1L;
							int var27 = (int)var25;
							int var28 = Tiles.Tiles_underlays[var7][var16][var22] & var27;
							int var29 = Tiles.Tiles_overlays[var7][var16][var22] & var27;
							if (var28 > 0 || var29 > 0) {
								int var30 = var3[var7][var16][var22];
								int var31 = var3[var7][var16 + 1][var22];
								int var32 = var3[var7][var16 + 1][var22 + 1];
								int var33 = var3[var7][var16][var22 + 1];
								int var34 = SecureUrlRequester.field1506[var16][var22];
								int var35 = SecureUrlRequester.field1506[var16 + 1][var22];
								int var36 = SecureUrlRequester.field1506[var16 + 1][var22 + 1];
								int var37 = SecureUrlRequester.field1506[var16][var22 + 1];
								int var38 = -1;
								int var39 = -1;
								int var40;
								int var41;
								if (var28 > 0) {
									var40 = var17 * 256 / var20;
									var41 = var18 / var21;
									int var42 = var19 / var21;
									var38 = class442.method8350(var40, var41, var42);
									var40 = var40 + Tiles.rndHue & 255;
									var42 += Tiles.rndLightness;
									if (var42 < 0) {
										var42 = 0;
									} else if (var42 > 255) {
										var42 = 255;
									}

									var39 = class442.method8350(var40, var41, var42);
								}

								if (var7 > 0) {
									boolean var68 = true;
									if (var28 == 0 && Tiles.Tiles_shapes[var7][var16][var22] != 0) {
										var68 = false;
									}

									if (var29 > 0 && !Canvas.method284(var29 - 1).hideUnderlay) {
										var68 = false;
									}

									if (var68 && var31 == var30 && var30 == var32 && var30 == var33) {
										var10000 = Canvas.field98[var7][var16];
										var10000[var22] |= 2340;
									}
								}

								var40 = 0;
								if (var39 != -1) {
									var40 = Rasterizer3D.Rasterizer3D_colorPalette[class141.method3402(var39, 96)];
								}

								if (var29 == 0) {
									var5.addTile(var7, var16, var22, 0, 0, -1, var30, var31, var32, var33, class141.method3402(var38, var34), class141.method3402(var38, var35), class141.method3402(var38, var36), class141.method3402(var38, var37), 0, 0, 0, 0, var40, 0);
								} else {
									var41 = Tiles.Tiles_shapes[var7][var16][var22] + 1;
									byte var69 = Tiles.field1047[var7][var16][var22];
									FloorOverlayDefinition var43 = Canvas.method284(var29 - 1);
									int var44 = var43.texture;
									int var45;
									int var46;
									int var47;
									int var48;
									if (var44 >= 0) {
										var46 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var44);
										var45 = -1;
									} else if (var43.primaryRgb == 16711935) {
										var45 = -2;
										var44 = -1;
										var46 = -2;
									} else {
										var45 = class442.method8350(var43.hue, var43.saturation, var43.lightness);
										var47 = var43.hue + Tiles.rndHue & 255;
										var48 = var43.lightness + Tiles.rndLightness;
										if (var48 < 0) {
											var48 = 0;
										} else if (var48 > 255) {
											var48 = 255;
										}

										var46 = class442.method8350(var47, var43.saturation, var48);
									}

									var47 = 0;
									if (var46 != -2) {
										var47 = Rasterizer3D.Rasterizer3D_colorPalette[DynamicObject.method2333(var46, 96)];
									}

									if (var43.secondaryRgb != -1) {
										var48 = var43.secondaryHue + Tiles.rndHue & 255;
										int var49 = var43.secondaryLightness + Tiles.rndLightness;
										if (var49 < 0) {
											var49 = 0;
										} else if (var49 > 255) {
											var49 = 255;
										}

										var46 = class442.method8350(var48, var43.secondarySaturation, var49);
										var47 = Rasterizer3D.Rasterizer3D_colorPalette[DynamicObject.method2333(var46, 96)];
									}

									var5.addTile(var7, var16, var22, var41, var69, var44, var30, var31, var32, var33, class141.method3402(var38, var34), class141.method3402(var38, var35), class141.method3402(var38, var36), class141.method3402(var38, var37), DynamicObject.method2333(var45, var34), DynamicObject.method2333(var45, var35), DynamicObject.method2333(var45, var36), DynamicObject.method2333(var45, var37), var40, var47);
								}
							}
						}
					}
				}
			}

			for (var16 = 1; var16 < var2 - 1; ++var16) {
				for (var17 = 1; var17 < var1 - 1; ++var17) {
					if ((var0.tileSettings[var7][var17][var16] & 8) != 0) {
						var22 = 0;
					} else if (var7 > 0 && (var0.tileSettings[1][var17][var16] & 2) != 0) {
						var22 = var7 - 1;
					} else {
						var22 = var7;
					}

					var5.setTileMinPlane(var7, var17, var16, var22);
				}
			}

			Tiles.Tiles_underlays[var7] = null;
			Tiles.Tiles_overlays[var7] = null;
			Tiles.Tiles_shapes[var7] = null;
			Tiles.field1047[var7] = null;
			SpriteMask.Tiles_underlays2[var7] = null;
		}

		var5.method4935(-50, -10, -50);

		for (var7 = 0; var7 < var1; ++var7) {
			for (var8 = 0; var8 < var2; ++var8) {
				if ((var4[1][var7][var8] & 2) == 2) {
					var5.setLinkBelow(var7, var8);
				}
			}
		}

		var7 = 1;
		var8 = 2;
		var9 = 4;

		for (var10 = 0; var10 < 4; ++var10) {
			if (var10 > 0) {
				var7 <<= 3;
				var8 <<= 3;
				var9 <<= 3;
			}

			for (int var63 = 0; var63 <= var10; ++var63) {
				for (int var64 = 0; var64 <= var2; ++var64) {
					for (int var65 = 0; var65 <= var1; ++var65) {
						short var66;
						if ((Canvas.field98[var63][var65][var64] & var7) != 0) {
							var14 = var64;
							var15 = var64;
							var16 = var63;

							for (var17 = var63; var14 > 0 && (Canvas.field98[var63][var65][var14 - 1] & var7) != 0; --var14) {
							}

							while (var15 < var2 && (Canvas.field98[var63][var65][var15 + 1] & var7) != 0) {
								++var15;
							}

							label461:
							while (var16 > 0) {
								for (var18 = var14; var18 <= var15; ++var18) {
									if ((Canvas.field98[var16 - 1][var65][var18] & var7) == 0) {
										break label461;
									}
								}

								--var16;
							}

							label450:
							while (var17 < var10) {
								for (var18 = var14; var18 <= var15; ++var18) {
									if ((Canvas.field98[var17 + 1][var65][var18] & var7) == 0) {
										break label450;
									}
								}

								++var17;
							}

							var18 = (var17 + 1 - var16) * (var15 - var14 + 1);
							if (var18 >= 8) {
								var66 = 240;
								var20 = var3[var17][var65][var14] - var66;
								var21 = var3[var16][var65][var14];
								var5.Scene_addOccluder(var10, 1, var65 * 128, var65 * 128, var14 * 128, var15 * 128 + 128, var20, var21);

								for (var22 = var16; var22 <= var17; ++var22) {
									for (var23 = var14; var23 <= var15; ++var23) {
										var10000 = Canvas.field98[var22][var65];
										var10000[var23] &= ~var7;
									}
								}
							}
						}

						if ((Canvas.field98[var63][var65][var64] & var8) != 0) {
							var14 = var65;
							var15 = var65;
							var16 = var63;

							for (var17 = var63; var14 > 0 && (Canvas.field98[var63][var14 - 1][var64] & var8) != 0; --var14) {
							}

							while (var15 < var1 && (Canvas.field98[var63][var15 + 1][var64] & var8) != 0) {
								++var15;
							}

							label514:
							while (var16 > 0) {
								for (var18 = var14; var18 <= var15; ++var18) {
									if ((Canvas.field98[var16 - 1][var18][var64] & var8) == 0) {
										break label514;
									}
								}

								--var16;
							}

							label503:
							while (var17 < var10) {
								for (var18 = var14; var18 <= var15; ++var18) {
									if ((Canvas.field98[var17 + 1][var18][var64] & var8) == 0) {
										break label503;
									}
								}

								++var17;
							}

							var18 = (var15 - var14 + 1) * (var17 + 1 - var16);
							if (var18 >= 8) {
								var66 = 240;
								var20 = var3[var17][var14][var64] - var66;
								var21 = var3[var16][var14][var64];
								var5.Scene_addOccluder(var10, 2, var14 * 128, var15 * 128 + 128, var64 * 128, var64 * 128, var20, var21);

								for (var22 = var16; var22 <= var17; ++var22) {
									for (var23 = var14; var23 <= var15; ++var23) {
										var10000 = Canvas.field98[var22][var23];
										var10000[var64] &= ~var8;
									}
								}
							}
						}

						if ((Canvas.field98[var63][var65][var64] & var9) != 0) {
							var14 = var65;
							var15 = var65;
							var16 = var64;

							for (var17 = var64; var16 > 0 && (Canvas.field98[var63][var65][var16 - 1] & var9) != 0; --var16) {
							}

							while (var17 < var2 && (Canvas.field98[var63][var65][var17 + 1] & var9) != 0) {
								++var17;
							}

							label567:
							while (var14 > 0) {
								for (var18 = var16; var18 <= var17; ++var18) {
									if ((Canvas.field98[var63][var14 - 1][var18] & var9) == 0) {
										break label567;
									}
								}

								--var14;
							}

							label556:
							while (var15 < var1) {
								for (var18 = var16; var18 <= var17; ++var18) {
									if ((Canvas.field98[var63][var15 + 1][var18] & var9) == 0) {
										break label556;
									}
								}

								++var15;
							}

							if ((var17 - var16 + 1) * (var15 - var14 + 1) >= 4) {
								var18 = var3[var63][var14][var16];
								var5.Scene_addOccluder(var10, 4, var14 * 128, var15 * 128 + 128, var16 * 128, var17 * 128 + 128, var18, var18);

								for (var19 = var14; var19 <= var15; ++var19) {
									for (var20 = var16; var20 <= var17; ++var20) {
										var10000 = Canvas.field98[var63][var19];
										var10000[var20] &= ~var9;
									}
								}
							}
						}
					}
				}
			}
		}

	}
}
