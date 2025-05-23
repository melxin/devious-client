import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nk")
public class class358 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	UrlRequest field3866;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lwc;"
	)
	SpritePixels field3865;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lep;)V"
	)
	class358(String var1, UrlRequester var2) {
		try {
			this.field3866 = var2.request(new URL(var1));
		} catch (MalformedURLException var4) {
			this.field3866 = null;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Lee;)V"
	)
	class358(UrlRequest var1) {
		this.field3866 = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(S)Lwc;",
		garbageValue = "325"
	)
	SpritePixels method6982() {
		if (this.field3865 == null && this.field3866 != null && this.field3866.isDone()) {
			if (this.field3866.getResponse() != null) {
				this.field3865 = class387.readSpritePixelsFromBytes(this.field3866.getResponse());
			}

			this.field3866 = null;
		}

		return this.field3865;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lnh;IB)V",
		garbageValue = "19"
	)
	static void method6984(Widget var0, int var1) {
		if (var0.type == 0 && var0.childIndex * -1626125685 > -1) {
			if (var1 > var0.field3968) {
				var0.field3968 = var1;
			}

			if (var1 < var0.field3962) {
				var0.field3962 = var1;
			}
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILdb;ZB)I",
		garbageValue = "45"
	)
	static int method6983(int var0, Script var1, boolean var2) {
		int var4 = -1;
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			var3 = class232.widgetDefinition.method6951(var4);
		} else {
			var3 = var2 ? class156.scriptDotWidget : SoundCache.scriptActiveWidget;
		}

		int var23;
		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
			AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
			var23 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
			int var16 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
			if (var3.type == 12) {
				class361 var17 = var3.method7377();
				if (var17 != null && var17.method7124(var23, var16)) {
					class139.invalidateWidget(var3);
				}
			} else {
				var3.scrollX = var23;
				if (var3.scrollX > var3.scrollWidth - var3.width * 624892547) {
					var3.scrollX = var3.scrollWidth - var3.width * 624892547;
				}

				if (var3.scrollX < 0) {
					var3.scrollX = 0;
				}

				var3.scrollY = var16;
				if (var3.scrollY > var3.scrollHeight - var3.height * 1265510039) {
					var3.scrollY = var3.scrollHeight - var3.height * 1265510039;
				}

				if (var3.scrollY < 0) {
					var3.scrollY = 0;
				}

				class139.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			class139.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
			class139.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			class139.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			class139.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			class139.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			class139.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
			class139.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1;
			var3.modelId = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			class139.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			AbstractByteArrayCopier.Interpreter_intStackSize -= 6;
			var3.modelOffsetX = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
			var3.modelOffsetY = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
			var3.modelAngleX = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 2];
			var3.modelAngleY = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 3];
			var3.modelAngleZ = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 4];
			var3.modelZoom = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 5];
			class139.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
			var23 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			if (var23 != var3.sequenceId) {
				var3.sequenceId = var23;
				var3.modelFrame = 0;
				var3.modelFrameCycle = 0;
				class139.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
			var3.modelOrthog = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
			class139.invalidateWidget(var3);
			return 1;
		} else {
			String var15;
			class361 var21;
			if (var0 == ScriptOpcodes.CC_SETTEXT) {
				var15 = Interpreter.Interpreter_stringStack[--class338.Interpreter_stringStackSize];
				if (var3.type == 12) {
					var21 = var3.method7377();
					if (var21 != null && var21.method7118()) {
						var21.method7250(var15);
					} else {
						var3.text = var15;
					}

					class139.invalidateWidget(var3);
				} else if (!var15.equals(var3.text)) {
					var3.text = var15;
					class139.invalidateWidget(var3);
				}

				return 1;
			} else {
				class361 var19;
				if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
					var3.fontId = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
					if (var3.type == 12) {
						var19 = var3.method7377();
						if (var19 != null) {
							var19.method7078();
						}
					}

					class139.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
					AbstractByteArrayCopier.Interpreter_intStackSize -= 3;
					if (var3.type == 12) {
						var19 = var3.method7377();
						if (var19 != null) {
							var19.method7075(Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize], Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1]);
							var19.method7076(Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 2]);
						}
					} else {
						var3.textXAlignment = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
						var3.textYAlignment = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
						var3.textLineHeight = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 2];
					}

					class139.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
					var3.textShadowed = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
					class139.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
					var3.outline = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
					class139.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
					var3.spriteShadow = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
					class139.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
					var3.spriteFlipV = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
					class139.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
					var3.spriteFlipH = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
					class139.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
					AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
					var3.scrollWidth = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
					var3.scrollHeight = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
					class139.invalidateWidget(var3);
					if (var4 != -1 && var3.type == 0) {
						class170.revalidateWidgetScroll(class232.widgetDefinition.Widget_interfaceComponents[var4 >> 16], var3, false);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
					TileItem.resumePauseWidget(var3.id, var3.childIndex * -1626125685);
					Client.meslayerContinueWidget = var3;
					class139.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1122) {
					var3.spriteId = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
					class139.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
					var3.color2 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
					class139.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1124) {
					var3.transparencyBot = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
					class139.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1125) {
					var23 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
					FillMode var22 = (FillMode)ArchiveDiskActionHandler.findEnumerated(class171.FillMode_values(), var23);
					if (var22 != null) {
						var3.fillMode = var22;
						class139.invalidateWidget(var3);
					}

					return 1;
				} else {
					boolean var14;
					if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
						var14 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
						var3.field3977 = var14;
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
						var14 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
						var3.modelTransparency = var14;
						return 1;
					} else if (var0 == 1129) {
						var3.field3980 = Interpreter.Interpreter_stringStack[--class338.Interpreter_stringStackSize];
						class139.invalidateWidget(var3);
						return 1;
					} else if (var0 == 1130) {
						var3.method7432(Interpreter.Interpreter_stringStack[--class338.Interpreter_stringStackSize], "", ParamComposition.urlRequester, FriendSystem.getUserId());
						return 1;
					} else if (var0 == 1131) {
						AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
						var3.method7363(Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize], Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1]);
						return 1;
					} else if (var0 == 1132) {
						var3.method7364(Interpreter.Interpreter_stringStack[--class338.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize]);
						return 1;
					} else {
						class355 var20;
						if (var0 == 1133) {
							--AbstractByteArrayCopier.Interpreter_intStackSize;
							var20 = var3.method7378();
							if (var20 != null) {
								var20.field3860 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
								class139.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1134) {
							--AbstractByteArrayCopier.Interpreter_intStackSize;
							var20 = var3.method7378();
							if (var20 != null) {
								var20.field3858 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
								class139.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1135) {
							--class338.Interpreter_stringStackSize;
							var19 = var3.method7377();
							if (var19 != null) {
								var3.text2 = Interpreter.Interpreter_stringStack[class338.Interpreter_stringStackSize];
							}

							return 1;
						} else if (var0 == 1136) {
							--AbstractByteArrayCopier.Interpreter_intStackSize;
							var20 = var3.method7378();
							if (var20 != null) {
								var20.field3859 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
								class139.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1137) {
							--AbstractByteArrayCopier.Interpreter_intStackSize;
							var19 = var3.method7377();
							if (var19 != null && var19.method7144(Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize])) {
								class139.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1138) {
							--AbstractByteArrayCopier.Interpreter_intStackSize;
							var19 = var3.method7377();
							if (var19 != null && var19.method7072(Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize])) {
								class139.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1139) {
							--AbstractByteArrayCopier.Interpreter_intStackSize;
							var19 = var3.method7377();
							if (var19 != null && var19.method7218(Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize])) {
								class139.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1140) {
							var14 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
							Client.field654.method5641();
							var21 = var3.method7377();
							if (var21 != null && var21.method7111(var14)) {
								if (var14) {
									Client.field654.method5635(var3);
								}

								class139.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1141) {
							var14 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
							if (!var14 && Client.field654.method5634() == var3) {
								Client.field654.method5641();
								class139.invalidateWidget(var3);
							}

							var21 = var3.method7377();
							if (var21 != null) {
								var21.method7231(var14);
							}

							return 1;
						} else if (var0 == 1142) {
							AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
							var19 = var3.method7377();
							if (var19 != null && var19.method7251(Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize], Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1])) {
								class139.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1143) {
							--AbstractByteArrayCopier.Interpreter_intStackSize;
							var19 = var3.method7377();
							if (var19 != null && var19.method7251(Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize], Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize])) {
								class139.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1144) {
							--AbstractByteArrayCopier.Interpreter_intStackSize;
							var19 = var3.method7377();
							if (var19 != null) {
								var19.method7280(Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize]);
								class139.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1145) {
							--AbstractByteArrayCopier.Interpreter_intStackSize;
							var19 = var3.method7377();
							if (var19 != null) {
								var19.method7125(Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1146) {
							--AbstractByteArrayCopier.Interpreter_intStackSize;
							var19 = var3.method7377();
							if (var19 != null) {
								var19.method7305(Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1147) {
							--AbstractByteArrayCopier.Interpreter_intStackSize;
							var19 = var3.method7377();
							if (var19 != null) {
								var19.method7130(Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize]);
								class139.invalidateWidget(var3);
							}

							return 1;
						} else {
							class27 var18;
							if (var0 == 1148) {
								AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
								var18 = var3.method7482();
								if (var18 != null) {
									var18.method395(Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize], Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1149) {
								AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
								var18 = var3.method7482();
								if (var18 != null) {
									var18.method396((char)Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize], Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1150) {
								var3.method7365(Interpreter.Interpreter_stringStack[--class338.Interpreter_stringStackSize], ParamComposition.urlRequester);
								return 1;
							} else if (var0 == 1151) {
								class338.Interpreter_stringStackSize -= 3;
								var15 = Interpreter.Interpreter_stringStack[class338.Interpreter_stringStackSize];
								String var13 = Interpreter.Interpreter_stringStack[class338.Interpreter_stringStackSize + 1];
								String var7 = Interpreter.Interpreter_stringStack[class338.Interpreter_stringStackSize + 2];
								long var8 = FriendSystem.getUserId();
								long var10 = FileSystem.getUserHash();
								String var12 = class408.getPlatformInfo().getDeviceId(class408.getPlatformInfo().os);
								if (var8 != -1L) {
									var15 = var15.replaceAll("%userid%", Long.toString(var8));
								}

								if (-1L != var10) {
									var15 = var15.replaceAll("%userhash%", Long.toString(var10));
								}

								if (!var12.isEmpty()) {
									var15 = var15.replaceAll("%deviceid%", var12);
								}

								var3.method7354(var15, var13, var7, var12, Long.toString(var10), ParamComposition.urlRequester);
								return 1;
							} else if (var0 == 1152) {
								if (var3.type != 11) {
									throw new RuntimeException();
								} else {
									class211 var5 = var3.method7373();
									boolean var6 = var5 != null && var5.method4724() && BoundaryObject.method4686().method4854(var5.method4732());
									Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var6 ? 1 : 0;
									return 1;
								}
							} else {
								return 2;
							}
						}
					}
				}
			}
		}
	}
}
