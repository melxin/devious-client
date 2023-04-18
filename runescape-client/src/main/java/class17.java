import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ar")
class class17 implements SSLSession {
	@ObfuscatedName("au")
	@Export("SpriteBuffer_yOffsets")
	public static int[] SpriteBuffer_yOffsets;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lax;)V"
	)
	class17(class12 var1) {
		this.this$1 = var1;
	}

	public String getCipherSuite() {
		throw new UnsupportedOperationException();
	}

	public int getApplicationBufferSize() {
		return 0;
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException();
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException();
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException();
	}

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException();
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null;
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field61;
	}

	public int getPeerPort() {
		return 0;
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException();
	}

	public boolean isValid() {
		throw new UnsupportedOperationException();
	}

	public String[] getValueNames() {
		throw new UnsupportedOperationException();
	}

	public byte[] getId() {
		throw new UnsupportedOperationException();
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException();
	}

	public String getProtocol() {
		throw new UnsupportedOperationException();
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException();
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null;
	}

	public long getCreationTime() {
		throw new UnsupportedOperationException();
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException();
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException();
	}

	public void invalidate() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(IIIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-1745540313"
	)
	@Export("menuAction")
	static final void menuAction(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		NPC var9;
		PacketBufferNode var10;
		if (var2 == 11) {
			var9 = Client.npcs[var3];
			if (var9 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var10 = class330.getPacketBufferNode(ClientPacket.field3178, Client.packetWriter.isaacCipher);
				var10.packetBuffer.method9132(var3);
				var10.packetBuffer.method9086(Client.field721.method4229(82) ? 1 : 0);
				Client.packetWriter.addNode(var10);
			}
		}

		PacketBufferNode var14;
		if (var2 == 6) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var14 = class330.getPacketBufferNode(ClientPacket.field3100, Client.packetWriter.isaacCipher);
			var14.packetBuffer.method9096(var3);
			var14.packetBuffer.method9086(Client.field721.method4229(82) ? 1 : 0);
			var14.packetBuffer.method9096(GameObject.baseY * 64 + var1);
			var14.packetBuffer.method9132(WorldMapData_0.baseX * 64 + var0);
			Client.packetWriter.addNode(var14);
		}

		if (var2 == 13) {
			var9 = Client.npcs[var3];
			if (var9 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var10 = class330.getPacketBufferNode(ClientPacket.field3187, Client.packetWriter.isaacCipher);
				var10.packetBuffer.writeByte(Client.field721.method4229(82) ? 1 : 0);
				var10.packetBuffer.method9096(var3);
				Client.packetWriter.addNode(var10);
			}
		}

		if (var2 == 5) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var14 = class330.getPacketBufferNode(ClientPacket.field3143, Client.packetWriter.isaacCipher);
			var14.packetBuffer.method9257(WorldMapData_0.baseX * 64 + var0);
			var14.packetBuffer.method9132(var3);
			var14.packetBuffer.method9257(GameObject.baseY * 64 + var1);
			var14.packetBuffer.method9114(Client.field721.method4229(82) ? 1 : 0);
			Client.packetWriter.addNode(var14);
		}

		if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) {
			class126.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
		}

		if (var2 == 19) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var14 = class330.getPacketBufferNode(ClientPacket.field3132, Client.packetWriter.isaacCipher);
			var14.packetBuffer.method9096(GameObject.baseY * 64 + var1);
			var14.packetBuffer.method9257(var3);
			var14.packetBuffer.writeByte(Client.field721.method4229(82) ? 1 : 0);
			var14.packetBuffer.method9257(WorldMapData_0.baseX * 64 + var0);
			Client.packetWriter.addNode(var14);
		}

		if (var2 == 1001) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var14 = class330.getPacketBufferNode(ClientPacket.field3170, Client.packetWriter.isaacCipher);
			var14.packetBuffer.method9114(Client.field721.method4229(82) ? 1 : 0);
			var14.packetBuffer.method9257(var3);
			var14.packetBuffer.method9096(WorldMapData_0.baseX * 64 + var0);
			var14.packetBuffer.method9257(GameObject.baseY * 64 + var1);
			Client.packetWriter.addNode(var14);
		}

		if (var2 == 23) {
			if (Client.isMenuOpen) {
				class31.scene.setViewportWalking();
			} else {
				class31.scene.menuOpen(GameEngine.Client_plane, var0, var1, true);
			}
		}

		int var11;
		Widget var15;
		if (var2 == 28) {
			var14 = class330.getPacketBufferNode(ClientPacket.field3131, Client.packetWriter.isaacCipher);
			var14.packetBuffer.writeInt(var1);
			Client.packetWriter.addNode(var14);
			var15 = class165.getWidget(var1);
			if (var15 != null && var15.cs1Instructions != null && var15.cs1Instructions[0][0] == 5) {
				var11 = var15.cs1Instructions[0][1];
				Varps.Varps_main[var11] = 1 - Varps.Varps_main[var11];
				class7.changeGameOptions(var11);
			}
		}

		Player var16;
		if (var2 == 47) {
			var16 = Client.players[var3];
			if (var16 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var10 = class330.getPacketBufferNode(ClientPacket.field3160, Client.packetWriter.isaacCipher);
				var10.packetBuffer.method9114(Client.field721.method4229(82) ? 1 : 0);
				var10.packetBuffer.method9132(var3);
				Client.packetWriter.addNode(var10);
			}
		}

		if (var2 == 7) {
			var9 = Client.npcs[var3];
			if (var9 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var10 = class330.getPacketBufferNode(ClientPacket.field3191, Client.packetWriter.isaacCipher);
				var10.packetBuffer.method9203(Client.field721.method4229(82) ? 1 : 0);
				var10.packetBuffer.writeInt(class294.field3364);
				var10.packetBuffer.method9096(var3);
				var10.packetBuffer.method9257(class144.field1677);
				var10.packetBuffer.writeShort(WorldMapSectionType.field2984);
				Client.packetWriter.addNode(var10);
			}
		}

		if (var2 == 50) {
			var16 = Client.players[var3];
			if (var16 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var10 = class330.getPacketBufferNode(ClientPacket.field3116, Client.packetWriter.isaacCipher);
				var10.packetBuffer.method9257(var3);
				var10.packetBuffer.method9086(Client.field721.method4229(82) ? 1 : 0);
				Client.packetWriter.addNode(var10);
			}
		}

		if (var2 == 10) {
			var9 = Client.npcs[var3];
			if (var9 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var10 = class330.getPacketBufferNode(ClientPacket.field3164, Client.packetWriter.isaacCipher);
				var10.packetBuffer.method9096(var3);
				var10.packetBuffer.method9086(Client.field721.method4229(82) ? 1 : 0);
				Client.packetWriter.addNode(var10);
			}
		}

		Widget var17;
		if (var2 == 57 || var2 == 1007) {
			var17 = SoundSystem.getWidgetChild(var1, var0);
			if (var17 != null) {
				Message.widgetDefaultMenuAction(var3, var1, var0, var4, var6);
			}
		}

		if (var2 == 14) {
			var16 = Client.players[var3];
			if (var16 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var10 = class330.getPacketBufferNode(ClientPacket.field3129, Client.packetWriter.isaacCipher);
				var10.packetBuffer.writeShort(var3);
				var10.packetBuffer.method9086(Client.field721.method4229(82) ? 1 : 0);
				var10.packetBuffer.method9096(WorldMapSectionType.field2984);
				var10.packetBuffer.writeInt(class294.field3364);
				var10.packetBuffer.writeShort(class144.field1677);
				Client.packetWriter.addNode(var10);
			}
		}

		if (var2 == 48) {
			var16 = Client.players[var3];
			if (var16 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var10 = class330.getPacketBufferNode(ClientPacket.field3120, Client.packetWriter.isaacCipher);
				var10.packetBuffer.method9114(Client.field721.method4229(82) ? 1 : 0);
				var10.packetBuffer.writeShort(var3);
				Client.packetWriter.addNode(var10);
			}
		}

		if (var2 == 9) {
			var9 = Client.npcs[var3];
			if (var9 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var10 = class330.getPacketBufferNode(ClientPacket.field3189, Client.packetWriter.isaacCipher);
				var10.packetBuffer.writeByte(Client.field721.method4229(82) ? 1 : 0);
				var10.packetBuffer.method9257(var3);
				Client.packetWriter.addNode(var10);
			}
		}

		if (var2 == 51) {
			var16 = Client.players[var3];
			if (var16 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var10 = class330.getPacketBufferNode(ClientPacket.field3106, Client.packetWriter.isaacCipher);
				var10.packetBuffer.method9096(var3);
				var10.packetBuffer.method9114(Client.field721.method4229(82) ? 1 : 0);
				Client.packetWriter.addNode(var10);
			}
		}

		if (var2 == 3) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var14 = class330.getPacketBufferNode(ClientPacket.field3108, Client.packetWriter.isaacCipher);
			var14.packetBuffer.method9132(WorldMapData_0.baseX * 64 + var0);
			var14.packetBuffer.method9086(Client.field721.method4229(82) ? 1 : 0);
			var14.packetBuffer.method9257(GameObject.baseY * 64 + var1);
			var14.packetBuffer.method9096(var3);
			Client.packetWriter.addNode(var14);
		}

		if (var2 == 25) {
			var17 = SoundSystem.getWidgetChild(var1, var0);
			if (var17 != null) {
				class166.Widget_runOnTargetLeave();
				class18.selectSpell(var1, var0, class195.Widget_unpackTargetMask(KeyHandler.getWidgetFlags(var17)), var4);
				Client.isItemSelected = 0;
				Client.selectedSpellActionName = MusicPatchNode.Widget_getSpellActionName(var17);
				if (Client.selectedSpellActionName == null) {
					Client.selectedSpellActionName = "null";
				}

				if (var17.isIf3) {
					Client.selectedSpellName = var17.dataText + class383.colorStartTag(16777215);
				} else {
					Client.selectedSpellName = class383.colorStartTag(65280) + var17.field3698 + class383.colorStartTag(16777215);
				}
			}

		} else {
			PacketBufferNode var13;
			if (var2 == 24) {
				var17 = class165.getWidget(var1);
				if (var17 != null) {
					boolean var12 = true;
					if (var17.contentType > 0) {
						var12 = Message.method1199(var17);
					}

					if (var12) {
						var13 = class330.getPacketBufferNode(ClientPacket.field3131, Client.packetWriter.isaacCipher);
						var13.packetBuffer.writeInt(var1);
						Client.packetWriter.addNode(var13);
					}
				}
			}

			if (var2 == 1003) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				var9 = Client.npcs[var3];
				if (var9 != null) {
					NPCComposition var18 = var9.definition;
					if (var18.transforms != null) {
						var18 = var18.transform();
					}

					if (var18 != null) {
						var13 = class330.getPacketBufferNode(ClientPacket.field3158, Client.packetWriter.isaacCipher);
						var13.packetBuffer.method9132(var18.id);
						Client.packetWriter.addNode(var13);
					}
				}
			}

			if (var2 == 20) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = class330.getPacketBufferNode(ClientPacket.field3126, Client.packetWriter.isaacCipher);
				var14.packetBuffer.method9096(WorldMapData_0.baseX * 64 + var0);
				var14.packetBuffer.writeByte(Client.field721.method4229(82) ? 1 : 0);
				var14.packetBuffer.method9257(var3);
				var14.packetBuffer.method9096(GameObject.baseY * 64 + var1);
				Client.packetWriter.addNode(var14);
			}

			if (var2 == 49) {
				var16 = Client.players[var3];
				if (var16 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = class330.getPacketBufferNode(ClientPacket.field3155, Client.packetWriter.isaacCipher);
					var10.packetBuffer.method9096(var3);
					var10.packetBuffer.method9114(Client.field721.method4229(82) ? 1 : 0);
					Client.packetWriter.addNode(var10);
				}
			}

			if (var2 == 8) {
				var9 = Client.npcs[var3];
				if (var9 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = class330.getPacketBufferNode(ClientPacket.field3150, Client.packetWriter.isaacCipher);
					var10.packetBuffer.method9096(Client.selectedSpellItemId);
					var10.packetBuffer.method9043(class236.selectedSpellWidget);
					var10.packetBuffer.method9132(var3);
					var10.packetBuffer.method9096(Client.selectedSpellChildIndex);
					var10.packetBuffer.method9086(Client.field721.method4229(82) ? 1 : 0);
					Client.packetWriter.addNode(var10);
				}
			}

			if (var2 == 2) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = class330.getPacketBufferNode(ClientPacket.field3122, Client.packetWriter.isaacCipher);
				var14.packetBuffer.method9086(Client.field721.method4229(82) ? 1 : 0);
				var14.packetBuffer.method9132(var3);
				var14.packetBuffer.method9132(Client.selectedSpellItemId);
				var14.packetBuffer.method9132(WorldMapData_0.baseX * 64 + var0);
				var14.packetBuffer.method9257(Client.selectedSpellChildIndex);
				var14.packetBuffer.method9043(class236.selectedSpellWidget);
				var14.packetBuffer.method9257(GameObject.baseY * 64 + var1);
				Client.packetWriter.addNode(var14);
			}

			if (var2 == 1002) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				var14 = class330.getPacketBufferNode(ClientPacket.field3107, Client.packetWriter.isaacCipher);
				var14.packetBuffer.method9257(var3);
				Client.packetWriter.addNode(var14);
			}

			if (var2 == 45) {
				var16 = Client.players[var3];
				if (var16 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = class330.getPacketBufferNode(ClientPacket.field3133, Client.packetWriter.isaacCipher);
					var10.packetBuffer.method9086(Client.field721.method4229(82) ? 1 : 0);
					var10.packetBuffer.method9132(var3);
					Client.packetWriter.addNode(var10);
				}
			}

			if (var2 == 16) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = class330.getPacketBufferNode(ClientPacket.field3113, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeShort(WorldMapSectionType.field2984);
				var14.packetBuffer.method9257(WorldMapData_0.baseX * 64 + var0);
				var14.packetBuffer.method9257(var3);
				var14.packetBuffer.method9257(GameObject.baseY * 64 + var1);
				var14.packetBuffer.writeShort(class144.field1677);
				var14.packetBuffer.writeByte(Client.field721.method4229(82) ? 1 : 0);
				var14.packetBuffer.method9043(class294.field3364);
				Client.packetWriter.addNode(var14);
			}

			if (var2 == 46) {
				var16 = Client.players[var3];
				if (var16 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = class330.getPacketBufferNode(ClientPacket.field3130, Client.packetWriter.isaacCipher);
					var10.packetBuffer.method9132(var3);
					var10.packetBuffer.method9203(Client.field721.method4229(82) ? 1 : 0);
					Client.packetWriter.addNode(var10);
				}
			}

			if (var2 == 4) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = class330.getPacketBufferNode(ClientPacket.field3147, Client.packetWriter.isaacCipher);
				var14.packetBuffer.method9257(WorldMapData_0.baseX * 64 + var0);
				var14.packetBuffer.method9132(GameObject.baseY * 64 + var1);
				var14.packetBuffer.method9257(var3);
				var14.packetBuffer.method9203(Client.field721.method4229(82) ? 1 : 0);
				Client.packetWriter.addNode(var14);
			}

			if (var2 == 44) {
				var16 = Client.players[var3];
				if (var16 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = class330.getPacketBufferNode(ClientPacket.field3127, Client.packetWriter.isaacCipher);
					var10.packetBuffer.method9203(Client.field721.method4229(82) ? 1 : 0);
					var10.packetBuffer.writeShort(var3);
					Client.packetWriter.addNode(var10);
				}
			}

			if (var2 == 18) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = class330.getPacketBufferNode(ClientPacket.field3182, Client.packetWriter.isaacCipher);
				var14.packetBuffer.method9257(var3);
				var14.packetBuffer.writeShort(GameObject.baseY * 64 + var1);
				var14.packetBuffer.method9086(Client.field721.method4229(82) ? 1 : 0);
				var14.packetBuffer.method9132(WorldMapData_0.baseX * 64 + var0);
				Client.packetWriter.addNode(var14);
			}

			if (var2 == 58) {
				var17 = SoundSystem.getWidgetChild(var1, var0);
				if (var17 != null) {
					if (var17.field3677 != null) {
						ScriptEvent var19 = new ScriptEvent();
						var19.widget = var17;
						var19.opIndex = var3;
						var19.targetName = var6;
						var19.args = var17.field3677;
						HealthBarUpdate.runScriptEvent(var19);
					}

					var10 = class330.getPacketBufferNode(ClientPacket.field3118, Client.packetWriter.isaacCipher);
					var10.packetBuffer.method9132(var0);
					var10.packetBuffer.writeShort(var4);
					var10.packetBuffer.method9109(class236.selectedSpellWidget);
					var10.packetBuffer.method9257(Client.selectedSpellChildIndex);
					var10.packetBuffer.method9043(var1);
					var10.packetBuffer.method9096(Client.selectedSpellItemId);
					Client.packetWriter.addNode(var10);
				}
			}

			if (var2 == 30 && Client.meslayerContinueWidget == null) {
				class81.resumePauseWidget(var1, var0);
				Client.meslayerContinueWidget = SoundSystem.getWidgetChild(var1, var0);
				class144.invalidateWidget(Client.meslayerContinueWidget);
			}

			if (var2 == 26) {
				class148.method3291();
			}

			if (var2 == 15) {
				var16 = Client.players[var3];
				if (var16 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = class330.getPacketBufferNode(ClientPacket.field3145, Client.packetWriter.isaacCipher);
					var10.packetBuffer.method9257(Client.selectedSpellChildIndex);
					var10.packetBuffer.method9096(Client.selectedSpellItemId);
					var10.packetBuffer.method9132(var3);
					var10.packetBuffer.method9086(Client.field721.method4229(82) ? 1 : 0);
					var10.packetBuffer.writeInt(class236.selectedSpellWidget);
					Client.packetWriter.addNode(var10);
				}
			}

			if (var2 == 12) {
				var9 = Client.npcs[var3];
				if (var9 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = class330.getPacketBufferNode(ClientPacket.field3162, Client.packetWriter.isaacCipher);
					var10.packetBuffer.method9096(var3);
					var10.packetBuffer.method9203(Client.field721.method4229(82) ? 1 : 0);
					Client.packetWriter.addNode(var10);
				}
			}

			if (var2 == 1) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = class330.getPacketBufferNode(ClientPacket.field3141, Client.packetWriter.isaacCipher);
				var14.packetBuffer.method9096(var3);
				var14.packetBuffer.method9043(class294.field3364);
				var14.packetBuffer.writeShort(WorldMapSectionType.field2984);
				var14.packetBuffer.method9096(WorldMapData_0.baseX * 64 + var0);
				var14.packetBuffer.method9086(Client.field721.method4229(82) ? 1 : 0);
				var14.packetBuffer.method9096(class144.field1677);
				var14.packetBuffer.method9257(GameObject.baseY * 64 + var1);
				Client.packetWriter.addNode(var14);
			}

			if (var2 == 17) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = class330.getPacketBufferNode(ClientPacket.field3123, Client.packetWriter.isaacCipher);
				var14.packetBuffer.method9086(Client.field721.method4229(82) ? 1 : 0);
				var14.packetBuffer.method9043(class236.selectedSpellWidget);
				var14.packetBuffer.method9257(Client.selectedSpellChildIndex);
				var14.packetBuffer.writeShort(var3);
				var14.packetBuffer.method9132(WorldMapData_0.baseX * 64 + var0);
				var14.packetBuffer.method9096(GameObject.baseY * 64 + var1);
				var14.packetBuffer.method9096(Client.selectedSpellItemId);
				Client.packetWriter.addNode(var14);
			}

			if (var2 == 21) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = class330.getPacketBufferNode(ClientPacket.field3121, Client.packetWriter.isaacCipher);
				var14.packetBuffer.method9096(WorldMapData_0.baseX * 64 + var0);
				var14.packetBuffer.method9086(Client.field721.method4229(82) ? 1 : 0);
				var14.packetBuffer.method9257(GameObject.baseY * 64 + var1);
				var14.packetBuffer.method9132(var3);
				Client.packetWriter.addNode(var14);
			}

			if (var2 == 29) {
				var14 = class330.getPacketBufferNode(ClientPacket.field3131, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeInt(var1);
				Client.packetWriter.addNode(var14);
				var15 = class165.getWidget(var1);
				if (var15 != null && var15.cs1Instructions != null && var15.cs1Instructions[0][0] == 5) {
					var11 = var15.cs1Instructions[0][1];
					if (Varps.Varps_main[var11] != var15.cs1ComparisonValues[0]) {
						Varps.Varps_main[var11] = var15.cs1ComparisonValues[0];
						class7.changeGameOptions(var11);
					}
				}
			}

			if (var2 == 22) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = class330.getPacketBufferNode(ClientPacket.field3117, Client.packetWriter.isaacCipher);
				var14.packetBuffer.method9132(GameObject.baseY * 64 + var1);
				var14.packetBuffer.method9114(Client.field721.method4229(82) ? 1 : 0);
				var14.packetBuffer.writeShort(WorldMapData_0.baseX * 64 + var0);
				var14.packetBuffer.method9132(var3);
				Client.packetWriter.addNode(var14);
			}

			if (var2 == 1004) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				var14 = class330.getPacketBufferNode(ClientPacket.field3176, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeShort(GameObject.baseY * 64 + var1);
				var14.packetBuffer.method9132(var3);
				var14.packetBuffer.method9132(WorldMapData_0.baseX * 64 + var0);
				Client.packetWriter.addNode(var14);
			}

			if (Client.isItemSelected != 0) {
				Client.isItemSelected = 0;
				class144.invalidateWidget(class165.getWidget(class294.field3364));
			}

			if (Client.isSpellSelected) {
				class166.Widget_runOnTargetLeave();
			}

		}
	}
}
