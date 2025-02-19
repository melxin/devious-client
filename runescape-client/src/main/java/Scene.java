import java.util.Arrays;
import java.util.BitSet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
@Implements("Scene")
public class Scene extends TileItem {
	@ObfuscatedName("ay")
	@Export("Scene_isLowDetail")
	public static boolean Scene_isLowDetail;
	@ObfuscatedName("cg")
	static final int[] field2749;
	@ObfuscatedName("cw")
	static final int[] field2725;
	@ObfuscatedName("ce")
	static final int[] field2751;
	@ObfuscatedName("cn")
	static final int[] field2750;
	@ObfuscatedName("ci")
	static final int[] field2753;
	@ObfuscatedName("cl")
	static final int[] field2752;
	@ObfuscatedName("cc")
	static final int[] field2755;
	@ObfuscatedName("ab")
	final int field2754;
	@ObfuscatedName("au")
	@Export("baseY")
	public int baseY;
	@ObfuscatedName("ad")
	@Export("tempGameObjectsCount")
	int tempGameObjectsCount;
	@ObfuscatedName("ah")
	@Export("Scene_cameraYTileMin")
	int Scene_cameraYTileMin;
	@ObfuscatedName("ac")
	@Export("Scene_cameraY")
	int Scene_cameraY;
	@ObfuscatedName("ao")
	@Export("tileHeights")
	int[][][] tileHeights;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[[[Lju;"
	)
	@Export("tiles")
	Tile[][][] tiles;
	@ObfuscatedName("aa")
	@Export("xSize")
	int xSize;
	@ObfuscatedName("as")
	@Export("Scene_cameraXTileMin")
	int Scene_cameraXTileMin;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lkf;"
	)
	GameObject[] field2780;
	@ObfuscatedName("ax")
	int[][][] field2748;
	@ObfuscatedName("ag")
	int field2738;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	class232 field2700;
	@ObfuscatedName("am")
	int field2743;
	@ObfuscatedName("aq")
	int field2709;
	@ObfuscatedName("aw")
	int field2706;
	@ObfuscatedName("an")
	@Export("Scene_plane")
	public int Scene_plane;
	@ObfuscatedName("at")
	@Export("Scene_drawnCount")
	int Scene_drawnCount;
	@ObfuscatedName("ap")
	int field2745;
	@ObfuscatedName("al")
	int field2707;
	@ObfuscatedName("bw")
	int field2708;
	@ObfuscatedName("bo")
	int field2758;
	@ObfuscatedName("bs")
	@Export("Scene_cameraX")
	int Scene_cameraX;
	@ObfuscatedName("bz")
	int field2711;
	@ObfuscatedName("bt")
	@Export("Scene_cameraZ")
	int Scene_cameraZ;
	@ObfuscatedName("ba")
	int field2713;
	@ObfuscatedName("bg")
	int field2770;
	@ObfuscatedName("bv")
	int field2715;
	@ObfuscatedName("bk")
	int field2716;
	@ObfuscatedName("bu")
	int field2717;
	@ObfuscatedName("by")
	int field2718;
	@ObfuscatedName("bh")
	@Export("baseX")
	public int baseX;
	@ObfuscatedName("be")
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("bj")
	public int field2686;
	@ObfuscatedName("bq")
	public float field2722;
	@ObfuscatedName("bx")
	public boolean field2684;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	public final class258 field2724;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	final class258 field2741;
	@ObfuscatedName("bb")
	int field2734;
	@ObfuscatedName("bi")
	int field2727;
	@ObfuscatedName("bn")
	int field2728;
	@ObfuscatedName("bl")
	int field2774;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "[Lkf;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("br")
	@Export("checkClick")
	boolean checkClick;
	@ObfuscatedName("bm")
	@Export("scenePlanesCount")
	int scenePlanesCount;
	@ObfuscatedName("bp")
	int field2785;
	@ObfuscatedName("ch")
	int field2702;
	@ObfuscatedName("cd")
	int field2735;
	@ObfuscatedName("cp")
	int field2699;
	@ObfuscatedName("ca")
	public float field2737;
	@ObfuscatedName("cs")
	public int field2714;
	@ObfuscatedName("cj")
	public int field2739;
	@ObfuscatedName("cy")
	@Export("viewportWalking")
	boolean viewportWalking;
	@ObfuscatedName("ct")
	@Export("Scene_selectedPlane")
	int Scene_selectedPlane;
	@ObfuscatedName("cv")
	@Export("Scene_planeOccluderCounts")
	int[] Scene_planeOccluderCounts;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "[[Ljn;"
	)
	Occluder[][] field2729;
	@ObfuscatedName("ck")
	int field2682;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "[Ljn;"
	)
	Occluder[] field2747;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	@Export("Scene_tilesDeque")
	NodeDeque Scene_tilesDeque;
	@ObfuscatedName("dc")
	int[][] field2760;
	@ObfuscatedName("dd")
	int[][] field2761;
	@ObfuscatedName("dy")
	int[] field2692;
	@ObfuscatedName("dj")
	int field2763;
	@ObfuscatedName("dr")
	int field2764;
	@ObfuscatedName("dq")
	int field2765;
	@ObfuscatedName("ds")
	int field2766;
	@ObfuscatedName("dk")
	final int field2767;
	@ObfuscatedName("du")
	BitSet field2768;
	@ObfuscatedName("dl")
	BitSet field2769;
	@ObfuscatedName("dn")
	@Export("worldViewId")
	final int worldViewId;
	@ObfuscatedName("dh")
	final int field2771;
	@ObfuscatedName("di")
	final int field2772;
	@ObfuscatedName("dw")
	final int field2773;
	@ObfuscatedName("db")
	BitSet field2721;
	@ObfuscatedName("dt")
	BitSet field2775;
	@ObfuscatedName("dm")
	final int field2776;
	@ObfuscatedName("do")
	final int field2777;
	@ObfuscatedName("dx")
	final int field2778;
	@ObfuscatedName("dv")
	int field2779;
	@ObfuscatedName("df")
	int field2736;
	@ObfuscatedName("de")
	@Export("planes")
	int planes;
	@ObfuscatedName("da")
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("dz")
	@Export("ySize")
	int ySize;
	@ObfuscatedName("dp")
	@Export("Scene_cameraXTileMax")
	int Scene_cameraXTileMax;
	@ObfuscatedName("dg")
	@Export("tileUpdateCount")
	int tileUpdateCount;
	@ObfuscatedName("ew")
	@Export("Scene_cameraYTileMax")
	int Scene_cameraYTileMax;

	static {
		Scene_isLowDetail = false;
		field2749 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
		field2725 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
		field2751 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
		field2750 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
		field2753 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
		field2752 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
		field2755 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
	}

	@ObfuscatedSignature(
		descriptor = "(IIIIILio;[[[I)V"
	)
	public Scene(int var1, int var2, int var3, int var4, int var5, class232 var6, int[][][] var7) {
		this.xSize = 0;
		this.Scene_cameraXTileMin = 0;
		this.field2780 = new GameObject[32];
		this.field2738 = 0;
		this.field2700 = class232.field2516;
		this.field2743 = 0;
		this.field2709 = 0;
		this.field2706 = 0;
		this.Scene_plane = 0;
		this.baseX = 0;
		this.cycle = 0;
		this.field2686 = 0;
		this.field2722 = 1.0F;
		this.field2684 = true;
		this.field2724 = new class258();
		this.field2741 = new class258();
		this.gameObjects = new GameObject[5];
		this.checkClick = false;
		this.scenePlanesCount = 0;
		this.field2785 = 0;
		this.field2702 = 0;
		this.field2735 = -1;
		this.field2699 = -1;
		this.field2737 = -1.0F;
		this.field2714 = -1;
		this.field2739 = -1;
		this.viewportWalking = false;
		this.Scene_selectedPlane = 4;
		this.Scene_planeOccluderCounts = new int[this.Scene_selectedPlane];
		this.field2729 = new Occluder[this.Scene_selectedPlane][500];
		this.field2682 = 0;
		this.field2747 = new Occluder[500];
		this.Scene_tilesDeque = new NodeDeque();
		this.field2760 = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
		this.field2761 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
		this.field2692 = new int[9];
		this.tempGameObjectsCount = var2;
		this.Scene_cameraYTileMin = var3;
		this.Scene_cameraY = var4;
		this.tiles = new Tile[var2][var3][var4];
		this.field2748 = new int[var2][var3 + 1][var4 + 1];
		this.tileHeights = var7;
		this.field2738 = var5;
		this.field2700 = var6;
		this.field2754 = var1;
		if (var1 != -1) {
			this.field2767 = 0;
			this.field2768 = null;
			this.field2769 = null;
			this.worldViewId = 0;
			this.field2771 = 0;
			this.field2772 = 0;
			this.field2773 = 0;
			this.field2721 = null;
			this.field2775 = null;
			this.field2776 = 0;
			this.field2777 = 0;
			this.field2778 = 0;
		} else {
			this.field2767 = 8386816;
			this.field2768 = new BitSet(this.field2767);
			this.field2769 = new BitSet(this.field2767);
			this.worldViewId = 1048352;
			this.field2771 = 32761;
			this.field2772 = 181;
			this.field2773 = 9644832;
			this.field2721 = new BitSet(this.field2773);
			this.field2775 = new BitSet(this.field2773);
			this.field2776 = 1071648;
			this.field2777 = 33489;
			this.field2778 = 183;
		}

		AbstractRasterizer.method4868(var5);
		this.clearTempGameObjects();
	}

	@ObfuscatedName("ab")
	@Export("clearTempGameObjects")
	public void clearTempGameObjects() {
		int var1;
		int var2;
		for (var1 = 0; var1 < this.tempGameObjectsCount; ++var1) {
			for (var2 = 0; var2 < this.Scene_cameraYTileMin; ++var2) {
				for (int var3 = 0; var3 < this.Scene_cameraY; ++var3) {
					this.tiles[var1][var2][var3] = null;
				}
			}
		}

		for (var1 = 0; var1 < this.Scene_selectedPlane; ++var1) {
			for (var2 = 0; var2 < this.Scene_planeOccluderCounts[var1]; ++var2) {
				this.field2729[var1][var2] = null;
			}

			this.Scene_planeOccluderCounts[var1] = 0;
		}

		for (var1 = 0; var1 < this.Scene_cameraXTileMin; ++var1) {
			this.field2780[var1] = null;
		}

		this.Scene_cameraXTileMin = 0;

		for (var1 = 0; var1 < this.gameObjects.length; ++var1) {
			this.gameObjects[var1] = null;
		}

	}

	@ObfuscatedName("au")
	@Export("init")
	public void init(int var1) {
		this.xSize = var1;

		for (int var2 = 0; var2 < this.Scene_cameraYTileMin; ++var2) {
			for (int var3 = 0; var3 < this.Scene_cameraY; ++var3) {
				if (this.tiles[var1][var2][var3] == null) {
					this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
				}
			}
		}

	}

	@ObfuscatedName("ad")
	@Export("setLinkBelow")
	public void setLinkBelow(int var1, int var2) {
		Tile var3 = this.tiles[0][var1][var2];

		for (int var4 = 0; var4 < 3; ++var4) {
			Tile var5 = this.tiles[var4][var1][var2] = this.tiles[var4 + 1][var1][var2];
			if (var5 != null) {
				--var5.plane;

				for (int var6 = 0; var6 < var5.gameObjectsCount; ++var6) {
					GameObject var7 = var5.gameObjects[var6];
					long var9 = var7.tag;
					int var11 = (int)(var9 >>> 14 & 7L);
					boolean var8 = var11 == 2;
					if (var8 && var7.startX == var1 && var2 == var7.startY) {
						--var7.plane;
					}
				}
			}
		}

		if (this.tiles[0][var1][var2] == null) {
			this.tiles[0][var1][var2] = new Tile(0, var1, var2);
		}

		this.tiles[0][var1][var2].linkedBelowTile = var3;
		this.tiles[3][var1][var2] = null;
	}

	@ObfuscatedName("ah")
	@Export("Scene_addOccluder")
	public void Scene_addOccluder(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Occluder var9 = new Occluder();
		var9.minTileX = var3 / 128;
		var9.maxTileX = var4 / 128;
		var9.minTileY = var5 / 128;
		var9.maxTileY = var6 / 128;
		var9.type = var2;
		var9.minX = var3;
		var9.maxX = var4;
		var9.minZ = var5;
		var9.maxZ = var6;
		var9.minY = var7;
		var9.maxY = var8;
		this.field2729[var1][this.Scene_planeOccluderCounts[var1]++] = var9;
	}

	@ObfuscatedName("ac")
	@Export("setTileMinPlane")
	public void setTileMinPlane(int var1, int var2, int var3, int var4) {
		Tile var5 = this.tiles[var1][var2][var3];
		if (var5 != null) {
			this.tiles[var1][var2][var3].field2627 = var4;
		}
	}

	@ObfuscatedName("as")
	@Export("addTile")
	public void addTile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
		SceneTilePaint var21;
		int var22;
		if (var4 == 0) {
			var21 = new SceneTilePaint(var11, var12, var13, var14, -1, var19, false);

			for (var22 = var1; var22 >= 0; --var22) {
				if (this.tiles[var22][var2][var3] == null) {
					this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].paint = var21;
		} else if (var4 != 1) {
			SceneTileModel var23 = new SceneTileModel(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

			for (var22 = var1; var22 >= 0; --var22) {
				if (this.tiles[var22][var2][var3] == null) {
					this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].model = var23;
		} else {
			var21 = new SceneTilePaint(var15, var16, var17, var18, var6, var20, var8 == var7 && var7 == var9 && var10 == var7);

			for (var22 = var1; var22 >= 0; --var22) {
				if (this.tiles[var22][var2][var3] == null) {
					this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].paint = var21;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIILjc;JI)V"
	)
	@Export("newFloorDecoration")
	public void newFloorDecoration(int var1, int var2, int var3, int var4, TileItem var5, long var6, int var8) {
		if (var5 != null) {
			FloorDecoration var9 = new FloorDecoration();
			var9.renderable = var5;
			var9.x = var2 * 8192 + 4096;
			var9.y = var3 * 8192 + 4096;
			var9.z = var4;
			var9.tag = var6;
			var9.flags = var8;
			if (this.tiles[var1][var2][var3] == null) {
				this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
			}

			this.tiles[var1][var2][var3].floorDecoration = var9;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIILjc;JLjc;Ljc;)V"
	)
	@Export("newGroundItemPile")
	public void newGroundItemPile(int var1, int var2, int var3, int var4, TileItem var5, long var6, TileItem var8, TileItem var9) {
		ItemLayer var10 = new ItemLayer();
		var10.first = var5;
		var10.x = var2 * 128 + 64;
		var10.y = var3 * 128 + 64;
		var10.z = var4;
		var10.tag = var6;
		var10.second = var8;
		var10.third = var9;
		int var11 = 0;
		Tile var12 = this.tiles[var1][var2][var3];
		if (var12 != null) {
			for (int var13 = 0; var13 < var12.gameObjectsCount; ++var13) {
				if ((var12.gameObjects[var13].flags & 256) == 256 && var12.gameObjects[var13].renderable instanceof Model) {
					Model var14 = (Model)var12.gameObjects[var13].renderable;
					var14.calculateBoundsCylinder();
					if (var14.height > var11) {
						var11 = var14.height;
					}
				}
			}
		}

		var10.height = var11;
		if (this.tiles[var1][var2][var3] == null) {
			this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
		}

		this.tiles[var1][var2][var3].itemLayer = var10;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIILjc;Ljc;IIJI)V"
	)
	@Export("newBoundaryObject")
	public void newBoundaryObject(int var1, int var2, int var3, int var4, TileItem var5, TileItem var6, int var7, int var8, long var9, int var11) {
		if (var5 != null || var6 != null) {
			BoundaryObject var12 = new BoundaryObject();
			var12.tag = var9;
			var12.flags = var11;
			var12.x = var2 * 128 + 64;
			var12.y = var3 * 128 + 64;
			var12.z = var4;
			var12.renderable1 = var5;
			var12.renderable2 = var6;
			var12.orientationA = var7;
			var12.orientationB = var8;

			for (int var13 = var1; var13 >= 0; --var13) {
				if (this.tiles[var13][var2][var3] == null) {
					this.tiles[var13][var2][var3] = new Tile(var13, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].boundaryObject = var12;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIILjc;Ljc;IIIIJI)V"
	)
	@Export("newWallDecoration")
	public void newWallDecoration(int var1, int var2, int var3, int var4, TileItem var5, TileItem var6, int var7, int var8, int var9, int var10, long var11, int var13) {
		if (var5 != null) {
			WallDecoration var14 = new WallDecoration();
			var14.tag = var11;
			var14.flags = var13;
			var14.x = var2 * 8192 + 4096;
			var14.y = var3 * 8192 + 4096;
			var14.z = var4;
			var14.renderable1 = var5;
			var14.renderable2 = var6;
			var14.orientation = var7;
			var14.orientation2 = var8;
			var14.xOffset = var9;
			var14.yOffset = var10;

			for (int var15 = var1; var15 >= 0; --var15) {
				if (this.tiles[var15][var2][var3] == null) {
					this.tiles[var15][var2][var3] = new Tile(var15, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].wallDecoration = var14;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILjc;IJI)Z"
	)
	public boolean method5088(int var1, int var2, int var3, int var4, int var5, int var6, TileItem var7, int var8, long var9, int var11) {
		if (var7 == null) {
			return true;
		} else {
			int var12 = var5 * 64 + var2 * 128;
			int var13 = var6 * 64 + var3 * 128;
			return this.newGameObject(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIIILjc;IJZ)Z"
	)
	@Export("drawEntity")
	public boolean drawEntity(int var1, int var2, int var3, int var4, int var5, TileItem var6, int var7, long var8, boolean var10) {
		if (var6 == null) {
			return true;
		} else {
			int var11 = var2 - var5;
			int var12 = var3 - var5;
			int var13 = var5 + var2;
			int var14 = var3 + var5;
			if (var10) {
				if (var7 > 640 && var7 < 1408) {
					var14 += 128;
				}

				if (var7 > 1152 && var7 < 1920) {
					var13 += 128;
				}

				if (var7 > 1664 || var7 < 384) {
					var12 -= 128;
				}

				if (var7 > 128 && var7 < 896) {
					var11 -= 128;
				}
			}

			var11 /= 128;
			var12 /= 128;
			var13 /= 128;
			var14 /= 128;
			return this.newGameObject(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIIILjc;IJIIII)Z"
	)
	@Export("addNullableObject")
	public boolean addNullableObject(int var1, int var2, int var3, int var4, int var5, TileItem var6, int var7, long var8, int var10, int var11, int var12, int var13) {
		return var6 == null ? true : this.newGameObject(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILjc;IZJI)Z"
	)
	@Export("newGameObject")
	boolean newGameObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, TileItem var9, int var10, boolean var11, long var12, int var14) {
		int var16;
		for (int var15 = var2; var15 < var2 + var4; ++var15) {
			for (var16 = var3; var16 < var3 + var5; ++var16) {
				if (var15 < 0 || var16 < 0 || var15 >= this.Scene_cameraYTileMin || var16 >= this.Scene_cameraY) {
					return false;
				}

				Tile var23 = this.tiles[var1][var15][var16];
				if (var23 != null && var23.gameObjectsCount >= 5) {
					return false;
				}
			}
		}

		GameObject var21 = new GameObject();
		var21.tag = var12;
		var21.flags = var14;
		var21.plane = var1;
		var21.centerX = var6;
		var21.centerY = var7;
		var21.z = var8;
		var21.renderable = var9;
		var21.orientation = var10;
		var21.startX = var2;
		var21.startY = var3;
		var21.endX = var2 + var4 - 1;
		var21.endY = var3 + var5 - 1;

		for (var16 = var2; var16 < var2 + var4; ++var16) {
			for (int var17 = var3; var17 < var3 + var5; ++var17) {
				int var18 = 0;
				if (var16 > var2) {
					++var18;
				}

				if (var16 < var2 + var4 - 1) {
					var18 += 4;
				}

				if (var17 > var3) {
					var18 += 8;
				}

				if (var17 < var3 + var5 - 1) {
					var18 += 2;
				}

				for (int var19 = var1; var19 >= 0; --var19) {
					if (this.tiles[var19][var16][var17] == null) {
						this.tiles[var19][var16][var17] = new Tile(var19, var16, var17);
					}
				}

				Tile var22 = this.tiles[var1][var16][var17];
				var22.gameObjects[var22.gameObjectsCount] = var21;
				var22.gameObjectEdgeMasks[var22.gameObjectsCount] = var18;
				var22.gameObjectsEdgeMask |= var18;
				++var22.gameObjectsCount;
			}
		}

		if (var11) {
			if (this.Scene_cameraXTileMin >= this.field2780.length) {
				this.field2780 = (GameObject[])((GameObject[])Arrays.copyOf(this.field2780, this.field2780.length * 2));
			}

			this.field2780[this.Scene_cameraXTileMin++] = var21;
		}

		return true;
	}

	@ObfuscatedName("az")
	@Export("setViewportWalking")
	public void setViewportWalking() {
		for (int var1 = 0; var1 < this.Scene_cameraXTileMin; ++var1) {
			GameObject var2 = this.field2780[var1];
			this.removeGameObject(var2);
			this.field2780[var1] = null;
		}

		this.Scene_cameraXTileMin = 0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lkf;)V"
	)
	@Export("removeGameObject")
	void removeGameObject(GameObject var1) {
		for (int var2 = var1.startX; var2 <= var1.endX; ++var2) {
			for (int var3 = var1.startY; var3 <= var1.endY; ++var3) {
				Tile var4 = this.tiles[var1.plane][var2][var3];
				if (var4 != null) {
					int var5;
					for (var5 = 0; var5 < var4.gameObjectsCount; ++var5) {
						if (var4.gameObjects[var5] == var1) {
							--var4.gameObjectsCount;

							for (int var6 = var5; var6 < var4.gameObjectsCount; ++var6) {
								var4.gameObjects[var6] = var4.gameObjects[var6 + 1];
								var4.gameObjectEdgeMasks[var6] = var4.gameObjectEdgeMasks[var6 + 1];
							}

							var4.gameObjects[var4.gameObjectsCount] = null;
							break;
						}
					}

					var4.gameObjectsEdgeMask = 0;

					for (var5 = 0; var5 < var4.gameObjectsCount; ++var5) {
						var4.gameObjectsEdgeMask |= var4.gameObjectEdgeMasks[var5];
					}
				}
			}
		}

	}

	@ObfuscatedName("aq")
	public void method4920(int var1, int var2, int var3, int var4) {
		Tile var5 = this.tiles[var1][var2][var3];
		if (var5 != null) {
			WallDecoration var6 = var5.wallDecoration;
			if (var6 != null) {
				var6.xOffset = var4 * var6.xOffset / 16;
				var6.yOffset = var4 * var6.yOffset / 16;
			}
		}
	}

	@ObfuscatedName("aw")
	@Export("removeBoundaryObject")
	public void removeBoundaryObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 != null) {
			var4.boundaryObject = null;
		}
	}

	@ObfuscatedName("an")
	@Export("removeWallDecoration")
	public void removeWallDecoration(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 != null) {
			var4.wallDecoration = null;
		}
	}

	@ObfuscatedName("at")
	@Export("removeGameObject")
	public void removeGameObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 != null) {
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) {
				GameObject var6 = var4.gameObjects[var5];
				long var8 = var6.tag;
				int var10 = (int)(var8 >>> 14 & 7L);
				boolean var7 = var10 == 2;
				if (var7 && var2 == var6.startX && var3 == var6.startY) {
					this.removeGameObject(var6);
					return;
				}
			}

		}
	}

	@ObfuscatedName("ap")
	@Export("removeFloorDecoration")
	public void removeFloorDecoration(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 != null) {
			var4.floorDecoration = null;
		}
	}

	@ObfuscatedName("al")
	@Export("removeGroundItemPile")
	public void removeGroundItemPile(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 != null) {
			var4.itemLayer = null;
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(III)Lkm;"
	)
	@Export("getBoundaryObject")
	public BoundaryObject getBoundaryObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		return var4 == null ? null : var4.boundaryObject;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(III)Lkk;"
	)
	@Export("getWallDecoration")
	public WallDecoration getWallDecoration(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		return var4 == null ? null : var4.wallDecoration;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(III)Lkf;"
	)
	@Export("getGameObject")
	public GameObject getGameObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 == null) {
			return null;
		} else {
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) {
				GameObject var6 = var4.gameObjects[var5];
				long var8 = var6.tag;
				int var10 = (int)(var8 >>> 14 & 7L);
				boolean var7 = var10 == 2;
				if (var7 && var2 == var6.startX && var3 == var6.startY) {
					return var6;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(III)Ljw;"
	)
	@Export("getFloorDecoration")
	public FloorDecoration getFloorDecoration(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		return var4 != null && var4.floorDecoration != null ? var4.floorDecoration : null;
	}

	@ObfuscatedName("bt")
	@Export("getBoundaryObjectTag")
	public long getBoundaryObjectTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		return var4 != null && var4.boundaryObject != null ? var4.boundaryObject.tag : 0L;
	}

	@ObfuscatedName("ba")
	@Export("getWallDecorationTag")
	public long getWallDecorationTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		return var4 != null && var4.wallDecoration != null ? var4.wallDecoration.tag : 0L;
	}

	@ObfuscatedName("bg")
	@Export("getGameObjectTag")
	public long getGameObjectTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 == null) {
			return 0L;
		} else {
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) {
				GameObject var6 = var4.gameObjects[var5];
				long var8 = var6.tag;
				int var10 = (int)(var8 >>> 14 & 7L);
				boolean var7 = var10 == 2;
				if (var7 && var2 == var6.startX && var3 == var6.startY) {
					return var6.tag;
				}
			}

			return 0L;
		}
	}

	@ObfuscatedName("bv")
	@Export("getFloorDecorationTag")
	public long getFloorDecorationTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		return var4 != null && var4.floorDecoration != null ? var4.floorDecoration.tag : 0L;
	}

	@ObfuscatedName("bk")
	@Export("getObjectFlags")
	public int getObjectFlags(int var1, int var2, int var3, long var4) {
		Tile var6 = this.tiles[var1][var2][var3];
		if (var6 == null) {
			return -1;
		} else if (var6.boundaryObject != null && var6.boundaryObject.tag == var4) {
			return var6.boundaryObject.flags & 255;
		} else if (var6.wallDecoration != null && var6.wallDecoration.tag == var4) {
			return var6.wallDecoration.flags & 255;
		} else if (var6.floorDecoration != null && var6.floorDecoration.tag == var4) {
			return var6.floorDecoration.flags & 255;
		} else {
			for (int var7 = 0; var7 < var6.gameObjectsCount; ++var7) {
				if (var6.gameObjects[var7].tag == var4) {
					return var6.gameObjects[var7].flags & 255;
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("bu")
	public void method4935(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.tempGameObjectsCount; ++var4) {
			for (int var5 = 0; var5 < this.Scene_cameraYTileMin; ++var5) {
				for (int var6 = 0; var6 < this.Scene_cameraY; ++var6) {
					Tile var7 = this.tiles[var4][var5][var6];
					if (var7 != null) {
						BoundaryObject var8 = var7.boundaryObject;
						ModelData var10;
						if (var8 != null && var8.renderable1 instanceof ModelData) {
							ModelData var9 = (ModelData)var8.renderable1;
							this.method4937(var9, var4, var5, var6, 1, 1);
							if (var8.renderable2 instanceof ModelData) {
								var10 = (ModelData)var8.renderable2;
								this.method4937(var10, var4, var5, var6, 1, 1);
								ModelData.method4690(var9, var10, 0, 0, 0, false);
								var8.renderable2 = var10.toModel(var10.field2562, var10.field2563, var1, var2, var3);
							}

							var8.renderable1 = var9.toModel(var9.field2562, var9.field2563, var1, var2, var3);
						}

						for (int var12 = 0; var12 < var7.gameObjectsCount; ++var12) {
							GameObject var14 = var7.gameObjects[var12];
							if (var14 != null && var14.renderable instanceof ModelData) {
								ModelData var11 = (ModelData)var14.renderable;
								this.method4937(var11, var4, var5, var6, var14.endX - var14.startX + 1, var14.endY - var14.startY + 1);
								var14.renderable = var11.toModel(var11.field2562, var11.field2563, var1, var2, var3);
							}
						}

						FloorDecoration var13 = var7.floorDecoration;
						if (var13 != null && var13.renderable instanceof ModelData) {
							var10 = (ModelData)var13.renderable;
							this.method4912(var10, var4, var5, var6);
							var13.renderable = var10.toModel(var10.field2562, var10.field2563, var1, var2, var3);
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Ljk;III)V"
	)
	void method4912(ModelData var1, int var2, int var3, int var4) {
		int var6 = var3 + 1;
		int var7 = var4 - 1;
		int var8 = var4 + 1;

		for (int var9 = var3; var9 <= var6; ++var9) {
			if (var9 >= 0 && var9 < this.Scene_cameraYTileMin) {
				for (int var10 = var7; var10 <= var8; ++var10) {
					if (var10 >= 0 && var10 < this.Scene_cameraY && (var9 >= var6 || var10 >= var8)) {
						Tile var11 = this.tiles[var2][var9][var10];
						if (var11 != null && var11.floorDecoration != null && var11.floorDecoration.renderable instanceof ModelData) {
							int var12 = this.method5049(var2, var9, var10, var2, var3, var4);
							ModelData var13 = (ModelData)var11.floorDecoration.renderable;
							ModelData.method4690(var1, var13, (var9 - var3) * 128, var12, (var10 - var4) * 128, true);
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ljk;IIIII)V"
	)
	void method4937(ModelData var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true;
		int var8 = var3;
		int var9 = var3 + var5;
		int var10 = var4 - 1;
		int var11 = var4 + var6;

		for (int var12 = var2; var12 <= var2 + 1; ++var12) {
			if (var12 != this.tempGameObjectsCount) {
				for (int var13 = var8; var13 <= var9; ++var13) {
					if (var13 >= 0 && var13 < this.Scene_cameraYTileMin) {
						for (int var14 = var10; var14 <= var11; ++var14) {
							if (var14 >= 0 && var14 < this.Scene_cameraY && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var3 != var13)) {
								Tile var15 = this.tiles[var12][var13][var14];
								if (var15 != null) {
									int var16 = this.method5049(var12, var13, var14, var2, var3, var4);
									BoundaryObject var17 = var15.boundaryObject;
									if (var17 != null) {
										ModelData var18;
										if (var17.renderable1 instanceof ModelData) {
											var18 = (ModelData)var17.renderable1;
											ModelData.method4690(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
										}

										if (var17.renderable2 instanceof ModelData) {
											var18 = (ModelData)var17.renderable2;
											ModelData.method4690(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
										}
									}

									for (int var23 = 0; var23 < var15.gameObjectsCount; ++var23) {
										GameObject var19 = var15.gameObjects[var23];
										if (var19 != null && var19.renderable instanceof ModelData) {
											ModelData var20 = (ModelData)var19.renderable;
											int var21 = var19.endX - var19.startX + 1;
											int var22 = var19.endY - var19.startY + 1;
											ModelData.method4690(var1, var20, (var21 - var5) * 64 + (var19.startX - var3) * 128, var16, (var19.startY - var4) * 128 + (var22 - var6) * 64, var7);
										}
									}
								}
							}
						}
					}
				}

				--var8;
				var7 = false;
			}
		}

	}

	@ObfuscatedName("be")
	int method5049(int var1, int var2, int var3, int var4, int var5, int var6) {
		return this.method4939(var1, var2, var3) - this.method4939(var4, var5, var6);
	}

	@ObfuscatedName("bj")
	int method4939(int var1, int var2, int var3) {
		return (this.tileHeights[var1][var2 + 1][var3 + 1] + this.tileHeights[var1][var2][var3] + this.tileHeights[var1][var2][var3 + 1] + this.tileHeights[var1][var2 + 1][var3]) / 4;
	}

	@ObfuscatedName("bq")
	@Export("drawTileMinimap")
	public void drawTileMinimap(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		Tile var7 = this.tiles[var4][var5][var6];
		if (var7 != null) {
			SceneTilePaint var8 = var7.paint;
			int var10;
			if (var8 != null) {
				int var18 = var8.rgb;
				if (var18 != 0) {
					for (var10 = 0; var10 < 4; ++var10) {
						var1[var2] = var18;
						var1[var2 + 1] = var18;
						var1[var2 + 2] = var18;
						var1[var2 + 3] = var18;
						var2 += var3;
					}

				}
			} else {
				SceneTileModel var9 = var7.model;
				if (var9 != null) {
					var10 = var9.shape;
					int var11 = var9.rotation;
					int var12 = var9.underlayRgb;
					int var13 = var9.overlayRgb;
					int[] var14 = this.field2760[var10];
					int[] var15 = this.field2761[var11];
					int var16 = 0;
					int var17;
					if (var12 != 0) {
						for (var17 = 0; var17 < 4; ++var17) {
							var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
							var2 += var3;
						}
					} else {
						for (var17 = 0; var17 < 4; ++var17) {
							if (var14[var15[var16++]] != 0) {
								var1[var2] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 1] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 2] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 3] = var13;
							}

							var2 += var3;
						}
					}

				}
			}
		}
	}

	@ObfuscatedName("bx")
	public void method4941(int var1) {
		int var2 = Math.max(25, Math.min(var1, 90));
		this.field2738 = var2;
		AbstractRasterizer.method4868(this.field2738);
		if (this.field2692 != null && this.field2692.length > 0) {
			this.method4955(this.field2692, this.field2763, this.field2764, this.field2765, this.field2766);
		}

	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lio;)V"
	)
	public void method4982(class232 var1) {
		if (var1 != this.field2700) {
			this.field2700 = var1;
			this.method4955(this.field2692, this.field2763, this.field2764, this.field2765, this.field2766);
		}

	}

	@ObfuscatedName("bc")
	boolean method4943(BitSet var1, int var2, int var3, int var4, int var5) {
		return var1.get(var5 + var4 * this.field2772 + var2 * this.worldViewId + var3 * this.field2771);
	}

	@ObfuscatedName("bb")
	boolean method5046(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
		var1.set(var5 + var4 * this.field2772 + var2 * this.worldViewId + var3 * this.field2771, var6);
		return var6;
	}

	@ObfuscatedName("bi")
	boolean method4945(int var1, int var2, int var3, int var4) {
		return this.method4943(this.field2768, var1, var2, var3, var4);
	}

	@ObfuscatedName("bn")
	boolean method4946(int var1, int var2, int var3, int var4, boolean var5) {
		return this.method5046(this.field2768, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("bl")
	boolean method5112(int var1, int var2, int var3, int var4) {
		return this.method4943(this.field2769, var1, var2, var3, var4);
	}

	@ObfuscatedName("bd")
	boolean method4948(int var1, int var2, int var3, int var4, boolean var5) {
		return this.method5046(this.field2769, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("br")
	boolean method4949(BitSet var1, int var2, int var3, int var4, int var5) {
		return var1.get(var5 + var4 * this.field2778 + var2 * this.field2776 + var3 * this.field2777);
	}

	@ObfuscatedName("bm")
	boolean method4950(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
		var1.set(var5 + var4 * this.field2778 + var2 * this.field2776 + var3 * this.field2777, var6);
		return var6;
	}

	@ObfuscatedName("bp")
	boolean method4951(int var1, int var2, int var3, int var4) {
		return this.method4949(this.field2721, var1, var2, var3, var4);
	}

	@ObfuscatedName("ch")
	boolean method4952(int var1, int var2, int var3, int var4, boolean var5) {
		return this.method4950(this.field2721, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("cd")
	boolean method4953(int var1, int var2, int var3, int var4) {
		return this.method4949(this.field2775, var1, var2, var3, var4);
	}

	@ObfuscatedName("cp")
	boolean method5107(int var1, int var2, int var3, int var4, boolean var5) {
		return this.method4950(this.field2775, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("ca")
	public void method4955(int[] var1, int var2, int var3, int var4, int var5) {
		this.field2692 = var1;
		this.field2763 = var2;
		this.field2764 = var3;
		this.field2765 = var4;
		this.field2766 = var5;
		this.ySize = 0;
		this.Scene_cameraXTileMax = 0;
		this.tileUpdateCount = var4;
		this.Scene_cameraYTileMax = var5;
		this.planes = var4 / 2;
		this.minPlane = var5 / 2;
		this.field2769.set(0, this.field2769.size());
		this.field2775.set(0, this.field2775.size());
	}

	@ObfuscatedName("cs")
	@Export("visibilityMap")
	void visibilityMap(int var1, int var2) {
		this.field2779 = var1;
		this.field2736 = var2;
	}

	@ObfuscatedName("cj")
	@Export("visibleTiles")
	boolean visibleTiles(int var1, int var2) {
		if (!this.method5112(this.field2779, this.field2736, var1, var2)) {
			return this.method4945(this.field2779, this.field2736, var1, var2);
		} else {
			this.method4948(this.field2779, this.field2736, var1, var2, false);
			boolean var3 = false;

			for (int var4 = -1; var4 <= 1; ++var4) {
				for (int var5 = -1; var5 <= 1; ++var5) {
					if (this.method4958(this.field2779, this.field2736, var4 + var1 + 1, var5 + var2 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (this.method4958(this.field2779, (this.field2736 + 1) % 31, var4 + var1 + 1, var5 + var2 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (this.method4958(this.field2779 + 1, this.field2736, var4 + var1 + 1, var5 + var2 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (this.method4958(this.field2779 + 1, (this.field2736 + 1) % 31, var4 + var1 + 1, var5 + var2 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}
				}
			}

			return this.method4946(this.field2779, this.field2736, var1, var2, var3);
		}
	}

	@ObfuscatedName("cy")
	boolean method4958(int var1, int var2, int var3, int var4) {
		if (!this.method4953(var1, var2, var3, var4)) {
			return this.method4951(var1, var2, var3, var4);
		} else {
			this.method5107(var1, var2, var3, var4, false);
			int var5 = var1 * 32 + 128;
			int var6 = var2 * 64;
			int var7 = (var3 - this.field2738 - this.field2743 - 1) * 128;
			int var8 = (var4 - this.field2738 - this.field2709 - 1) * 128;

			for (int var9 = -this.field2763; var9 <= this.field2764; var9 += 128) {
				if (this.method4959(var7, var9 + this.field2692[var1], var8, var5, var6)) {
					return this.method4952(var1, var2, var3, var4, true);
				}
			}

			return this.method4952(var1, var2, var3, var4, false);
		}
	}

	@ObfuscatedName("cb")
	boolean method4959(int var1, int var2, int var3, int var4, int var5) {
		int[] var6 = Rasterizer3D.Rasterizer3D_sine;
		int[] var7 = Rasterizer3D.Rasterizer3D_cosine;
		int var8 = var6[var4];
		int var9 = var7[var4];
		int var10 = var6[var5];
		int var11 = var7[var5];
		int var12 = var11 * var1 + var3 * var10 >> 16;
		int var13 = var3 * var11 - var10 * var1 >> 16;
		int var14 = var13 * var9 + var8 * var2 >> 16;
		int var15 = var9 * var2 - var13 * var8 >> 16;
		if (var14 >= 50 && var14 <= AbstractRasterizer.method4881()) {
			int var16 = var12 * 128 / var14 + this.planes;
			int var17 = var15 * 128 / var14 + this.minPlane;
			return var16 >= this.ySize && var16 <= this.tileUpdateCount && var17 >= this.Scene_cameraXTileMax && var17 <= this.Scene_cameraYTileMax;
		} else {
			return false;
		}
	}

	@ObfuscatedName("co")
	@Export("menuOpen")
	public void menuOpen(boolean var1) {
		if (!this.shouldSendWalk() || var1) {
			this.checkClick = true;
			this.viewportWalking = var1;
			this.field2714 = -1;
			this.field2739 = -1;
		}
	}

	@ObfuscatedName("ct")
	public void method5070(int var1, int var2, int var3) {
		this.scenePlanesCount = var1;
		this.field2785 = var2;
		this.field2702 = var3;
	}

	@ObfuscatedName("cv")
	public void method5043() {
		this.viewportWalking = true;
	}

	@ObfuscatedName("cf")
	@Export("shouldSendWalk")
	public boolean shouldSendWalk() {
		return this.viewportWalking && this.field2714 != -1;
	}

	@ObfuscatedName("ck")
	@Export("processWalkClick")
	void processWalkClick() {
		if (this.checkClick) {
			this.checkClick = false;
			this.field2714 = this.field2735;
			this.field2739 = this.field2699;
		}

	}

	@ObfuscatedName("cx")
	public void method4965() {
		this.field2714 = -1;
		this.viewportWalking = false;
	}

	@ObfuscatedName("cu")
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		if (var1 < 0) {
			var1 = 0;
		} else if (var1 >= this.Scene_cameraYTileMin * 128) {
			var1 = this.Scene_cameraYTileMin * 128 - 1;
		}

		if (var3 < 0) {
			var3 = 0;
		} else if (var3 >= this.Scene_cameraY * 128) {
			var3 = this.Scene_cameraY * 128 - 1;
		}

		if (var4 < 128) {
			var4 = 128;
		} else if (var4 > 383) {
			var4 = 383;
		}

		this.field2734 = Rasterizer3D.Rasterizer3D_sine[var4];
		this.field2727 = Rasterizer3D.Rasterizer3D_cosine[var4];
		this.field2728 = Rasterizer3D.Rasterizer3D_sine[var5];
		this.field2774 = Rasterizer3D.Rasterizer3D_cosine[var5];
		this.visibilityMap((var4 - 128) / 32, var5 / 64);
		class443.method8380(this.field2734, this.field2727, this.field2728, this.field2774);
		this.Scene_cameraX = var1;
		this.field2711 = var2;
		this.Scene_cameraZ = var3;
		this.field2713 = var1 / 128;
		this.field2770 = var3 / 128;
		this.field2715 = var7 / 128;
		this.field2716 = var8 / 128;
		this.Scene_plane = var6;
		IntProjection var10 = new IntProjection(var1, var2, var3, var4, var5, var7, var8);
		this.updateVisibleTilesAndOccluders(var10, var9);
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Ljx;Z)V"
	)
	@Export("updateVisibleTilesAndOccluders")
	void updateVisibleTilesAndOccluders(Projection var1, boolean var2) {
		++this.Scene_drawnCount;
		this.field2735 = -1;
		this.field2699 = -1;
		this.field2737 = -1.0F;
		this.field2741.method5434(Rasterizer3D.clips.field3000);
		Rasterizer3D.clips.field3000.method5434(this.field2724);
		boolean var3 = this.field2754 == -1;
		this.field2717 = !var2 && this.field2700 != class232.field2516 ? this.field2715 : this.field2713;
		this.field2718 = !var2 && this.field2700 != class232.field2516 ? this.field2716 : this.field2770;
		if (var3) {
			this.field2745 = this.field2717 - this.field2738;
			if (this.field2745 < 0) {
				this.field2745 = 0;
			}

			this.field2708 = this.field2718 - this.field2738;
			if (this.field2708 < 0) {
				this.field2708 = 0;
			}

			this.field2707 = this.field2717 + this.field2738;
			if (this.field2707 > this.Scene_cameraYTileMin) {
				this.field2707 = this.Scene_cameraYTileMin;
			}

			this.field2758 = this.field2718 + this.field2738;
			if (this.field2758 > this.Scene_cameraY) {
				this.field2758 = this.Scene_cameraY;
			}
		} else {
			this.field2745 = 0;
			this.field2708 = 0;
			this.field2707 = this.Scene_cameraYTileMin;
			this.field2758 = this.Scene_cameraY;
			this.field2717 = this.Scene_cameraYTileMin / 2;
			this.field2718 = this.Scene_cameraY / 2;
			this.field2738 = Math.max(this.field2717, this.field2718);
		}

		this.field2743 = this.field2713 - this.field2717;
		this.field2709 = this.field2770 - this.field2718;
		if (var3) {
			this.occlude();
		}

		this.field2706 = 0;

		int var4;
		int var6;
		for (var4 = this.xSize; var4 < this.tempGameObjectsCount; ++var4) {
			Tile[][] var15 = this.tiles[var4];

			for (var6 = this.field2745; var6 < this.field2707; ++var6) {
				for (int var16 = this.field2708; var16 < this.field2758; ++var16) {
					Tile var17 = var15[var6][var16];
					if (var17 != null) {
						if (var17.field2627 > this.Scene_plane || var3 && !this.visibleTiles(var6 - this.field2713 + this.field2743 + this.field2738, var16 - this.field2770 + this.field2709 + this.field2738) && this.tileHeights[var4][var6][var16] - this.field2711 < 2000) {
							var17.drawPrimary = false;
							var17.drawSecondary = false;
							var17.drawGameObjectEdges = 0;
						} else {
							var17.drawPrimary = true;
							var17.drawSecondary = true;
							if (var17.gameObjectsCount > 0) {
								var17.drawGameObjects = true;
							} else {
								var17.drawGameObjects = false;
							}

							++this.field2706;
						}
					}
				}
			}
		}

		var4 = Math.abs(this.field2743);
		int var5 = Math.abs(this.field2709);

		Tile[][] var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		Tile var14;
		for (var6 = this.xSize; var6 < this.tempGameObjectsCount; ++var6) {
			var7 = this.tiles[var6];

			for (var8 = -(var4 + this.field2738); var8 <= 0; ++var8) {
				var9 = var8 + this.field2713;
				var10 = this.field2713 - var8;
				if (var9 >= this.field2745 || var10 < this.field2707) {
					for (var11 = -(var5 + this.field2738); var11 <= 0; ++var11) {
						var12 = var11 + this.field2770;
						var13 = this.field2770 - var11;
						if (var9 >= this.field2745 && var9 < this.field2707) {
							if (var12 >= this.field2708 && var12 < this.field2758) {
								var14 = var7[var9][var12];
								if (var14 != null && var14.drawPrimary) {
									this.drawTile(var1, var14, true);
								}
							}

							if (var13 >= this.field2708 && var13 < this.field2758) {
								var14 = var7[var9][var13];
								if (var14 != null && var14.drawPrimary) {
									this.drawTile(var1, var14, true);
								}
							}
						}

						if (var10 >= this.field2745 && var10 < this.field2707) {
							if (var12 >= this.field2708 && var12 < this.field2758) {
								var14 = var7[var10][var12];
								if (var14 != null && var14.drawPrimary) {
									this.drawTile(var1, var14, true);
								}
							}

							if (var13 >= this.field2708 && var13 < this.field2758) {
								var14 = var7[var10][var13];
								if (var14 != null && var14.drawPrimary) {
									this.drawTile(var1, var14, true);
								}
							}
						}

						if (this.field2706 == 0) {
							this.processWalkClick();
							Rasterizer3D.clips.field3000.method5434(this.field2741);
							return;
						}
					}
				}
			}
		}

		for (var6 = this.xSize; var6 < this.tempGameObjectsCount; ++var6) {
			var7 = this.tiles[var6];

			for (var8 = -(var4 + this.field2738); var8 <= 0; ++var8) {
				var9 = var8 + this.field2717;
				var10 = this.field2717 - var8;
				if (var9 >= this.field2745 || var10 < this.field2707) {
					for (var11 = -(var5 + this.field2738); var11 <= 0; ++var11) {
						var12 = var11 + this.field2718;
						var13 = this.field2718 - var11;
						if (var9 >= this.field2745 && var9 < this.field2707) {
							if (var12 >= this.field2708 && var12 < this.field2758) {
								var14 = var7[var9][var12];
								if (var14 != null && var14.drawPrimary) {
									this.drawTile(var1, var14, false);
								}
							}

							if (var13 >= this.field2708 && var13 < this.field2758) {
								var14 = var7[var9][var13];
								if (var14 != null && var14.drawPrimary) {
									this.drawTile(var1, var14, false);
								}
							}
						}

						if (var10 >= this.field2745 && var10 < this.field2707) {
							if (var12 >= this.field2708 && var12 < this.field2758) {
								var14 = var7[var10][var12];
								if (var14 != null && var14.drawPrimary) {
									this.drawTile(var1, var14, false);
								}
							}

							if (var13 >= this.field2708 && var13 < this.field2758) {
								var14 = var7[var10][var13];
								if (var14 != null && var14.drawPrimary) {
									this.drawTile(var1, var14, false);
								}
							}
						}

						if (this.field2706 == 0) {
							this.processWalkClick();
							Rasterizer3D.clips.field3000.method5434(this.field2741);
							return;
						}
					}
				}
			}
		}

		Rasterizer3D.clips.field3000.method5434(this.field2741);
		this.processWalkClick();
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(Ljx;Lju;Z)V"
	)
	@Export("drawTile")
	void drawTile(Projection var1, Tile var2, boolean var3) {
		this.Scene_tilesDeque.addFirst(var2);

		while (true) {
			Tile var4;
			int var5;
			int var6;
			int var7;
			int var8;
			Tile[][] var9;
			Tile var10;
			int var12;
			int var15;
			int var16;
			int var24;
			int var25;
			do {
				do {
					do {
						do {
							do {
								label596:
								do {
									while (true) {
										BoundaryObject var11;
										GameObject var13;
										int var17;
										int var18;
										int var19;
										boolean var20;
										int var21;
										Tile var36;
										while (true) {
											do {
												var4 = (Tile)this.Scene_tilesDeque.removeLast();
												if (var4 == null) {
													return;
												}
											} while(!var4.drawSecondary);

											var5 = var4.x;
											var6 = var4.y;
											var7 = var4.plane;
											var8 = var4.originalPlane;
											var9 = this.tiles[var7];
											if (!var4.drawPrimary) {
												break;
											}

											if (var3) {
												if (var7 > 0) {
													var10 = this.tiles[var7 - 1][var5][var6];
													if (var10 != null && var10.drawSecondary) {
														continue;
													}
												}

												if (var5 <= this.field2713 && var5 > this.field2745) {
													var10 = var9[var5 - 1][var6];
													if (var10 != null && var10.drawSecondary && (var10.drawPrimary || (var4.gameObjectsEdgeMask & 1) == 0)) {
														continue;
													}
												}

												if (var5 >= this.field2713 && var5 < this.field2707 - 1) {
													var10 = var9[var5 + 1][var6];
													if (var10 != null && var10.drawSecondary && (var10.drawPrimary || (var4.gameObjectsEdgeMask & 4) == 0)) {
														continue;
													}
												}

												if (var6 <= this.field2770 && var6 > this.field2708) {
													var10 = var9[var5][var6 - 1];
													if (var10 != null && var10.drawSecondary && (var10.drawPrimary || (var4.gameObjectsEdgeMask & 8) == 0)) {
														continue;
													}
												}

												if (var6 >= this.field2770 && var6 < this.field2758 - 1) {
													var10 = var9[var5][var6 + 1];
													if (var10 != null && var10.drawSecondary && (var10.drawPrimary || (var4.gameObjectsEdgeMask & 2) == 0)) {
														continue;
													}
												}
											} else {
												var3 = true;
											}

											var4.drawPrimary = false;
											if (var4.linkedBelowTile != null) {
												var10 = var4.linkedBelowTile;
												if (var10.paint != null) {
													if (!this.method5096(0, var5, var6)) {
														var1.drawTileUnderlay(this, var10.paint, 0, var5, var6);
													}
												} else if (var10.model != null && !this.method5096(0, var5, var6)) {
													var1.drawTileOverlay(this, var10.model, var5, var6);
												}

												var11 = var10.boundaryObject;
												if (var11 != null) {
													var1.draw(var11.renderable1, 0, var11.x * 4096, var11.z, var11.y * 4096, var11.tag);
												}

												for (var12 = 0; var12 < var10.gameObjectsCount; ++var12) {
													var13 = var10.gameObjects[var12];
													if (var13 != null) {
														var1.draw(var13.renderable, var13.orientation, var13.centerX, var13.z, var13.centerY, var13.tag);
													}
												}
											}

											var20 = false;
											if (var4.paint != null) {
												if (!this.method5096(var8, var5, var6)) {
													var20 = true;
													if (var4.paint.neColor != 12345678 || var7 <= this.scenePlanesCount) {
														var1.drawTileUnderlay(this, var4.paint, var8, var5, var6);
													}
												}
											} else if (var4.model != null && !this.method5096(var8, var5, var6)) {
												var20 = true;
												var1.drawTileOverlay(this, var4.model, var5, var6);
											}

											var21 = 0;
											var12 = 0;
											BoundaryObject var31 = var4.boundaryObject;
											WallDecoration var14 = var4.wallDecoration;
											if (var31 != null || var14 != null) {
												if (var5 == this.field2713) {
													++var21;
												} else if (this.field2713 < var5) {
													var21 += 2;
												}

												if (var6 == this.field2770) {
													var21 += 3;
												} else if (this.field2770 > var6) {
													var21 += 6;
												}

												var12 = field2749[var21];
												var4.minPlane = field2751[var21];
											}

											if (var31 != null) {
												if ((var31.orientationA & field2725[var21]) != 0) {
													if (var31.orientationA == 16) {
														var4.drawGameObjectEdges = 3;
														var4.field2633 = field2750[var21];
														var4.field2622 = 3 - var4.field2633;
													} else if (var31.orientationA == 32) {
														var4.drawGameObjectEdges = 6;
														var4.field2633 = field2753[var21];
														var4.field2622 = 6 - var4.field2633;
													} else if (var31.orientationA == 64) {
														var4.drawGameObjectEdges = 12;
														var4.field2633 = field2752[var21];
														var4.field2622 = 12 - var4.field2633;
													} else {
														var4.drawGameObjectEdges = 9;
														var4.field2633 = field2755[var21];
														var4.field2622 = 9 - var4.field2633;
													}
												} else {
													var4.drawGameObjectEdges = 0;
												}

												if ((var31.orientationA & var12) != 0 && !this.method4973(var8, var5, var6, var31.orientationA)) {
													var1.draw(var31.renderable1, 0, var31.x * 4096, var31.z, var31.y * 4096, var31.tag);
												}

												if ((var31.orientationB & var12) != 0 && !this.method4973(var8, var5, var6, var31.orientationB)) {
													var1.draw(var31.renderable2, 0, var31.x * 4096, var31.z, var31.y * 4096, var31.tag);
												}
											}

											if (var14 != null && !this.method4974(var8, var5, var6, var14.renderable1.height)) {
												if ((var14.orientation & var12) != 0) {
													var1.draw(var14.renderable1, 0, var14.x * 64 + var14.xOffset, var14.z, var14.y * 64 + var14.yOffset, var14.tag);
												} else if (var14.orientation == 256) {
													var15 = var14.x * 64 - this.Scene_cameraX;
													var16 = var14.y * 64 - this.Scene_cameraZ;
													var17 = var14.orientation2;
													if (var17 != 1 && var17 != 2) {
														var18 = var15;
													} else {
														var18 = -var15;
													}

													if (var17 != 2 && var17 != 3) {
														var19 = var16;
													} else {
														var19 = -var16;
													}

													if (var19 < var18) {
														var1.draw(var14.renderable1, 0, var14.x * 64 + var14.xOffset, var14.z, var14.y * 64 + var14.yOffset, var14.tag);
													} else if (var14.renderable2 != null) {
														var1.draw(var14.renderable2, 0, var14.x * 64, var14.z, var14.y * 64, var14.tag);
													}
												}
											}

											if (var20) {
												FloorDecoration var22 = var4.floorDecoration;
												if (var22 != null) {
													var1.draw(var22.renderable, 0, var22.x * 64, var22.z, var22.y * 64, var22.tag);
												}

												ItemLayer var23 = var4.itemLayer;
												if (var23 != null && var23.height == 0) {
													if (var23.second != null) {
														var1.draw(var23.second, 0, var23.x * 4096, var23.z, var23.y * 4096, var23.tag);
													}

													if (var23.third != null) {
														var1.draw(var23.third, 0, var23.x * 4096, var23.z, var23.y * 4096, var23.tag);
													}

													if (var23.first != null) {
														var1.draw(var23.first, 0, var23.x * 4096, var23.z, var23.y * 4096, var23.tag);
													}
												}
											}

											var15 = var4.gameObjectsEdgeMask;
											if (var15 != 0) {
												if (var5 < this.field2713 && var5 >= this.field2745 && var5 < this.field2707 - 1 && (var15 & 4) != 0) {
													var36 = var9[var5 + 1][var6];
													if (var36 != null && var36.drawSecondary) {
														this.Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var6 < this.field2770 && var6 >= this.field2708 && var6 < this.field2758 - 1 && (var15 & 2) != 0) {
													var36 = var9[var5][var6 + 1];
													if (var36 != null && var36.drawSecondary) {
														this.Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var5 > this.field2713 && var5 > this.field2745 && var5 < this.field2707 && (var15 & 1) != 0) {
													var36 = var9[var5 - 1][var6];
													if (var36 != null && var36.drawSecondary) {
														this.Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var6 > this.field2770 && var6 > this.field2708 && var6 < this.field2758 && (var15 & 8) != 0) {
													var36 = var9[var5][var6 - 1];
													if (var36 != null && var36.drawSecondary) {
														this.Scene_tilesDeque.addFirst(var36);
													}
												}
											}
											break;
										}

										if (var4.drawGameObjectEdges != 0) {
											var20 = true;

											for (var21 = 0; var21 < var4.gameObjectsCount; ++var21) {
												if (var4.gameObjects[var21].lastDrawn != this.Scene_drawnCount && (var4.gameObjectEdgeMasks[var21] & var4.drawGameObjectEdges) == var4.field2633) {
													var20 = false;
													break;
												}
											}

											if (var20) {
												var11 = var4.boundaryObject;
												if (!this.method4973(var8, var5, var6, var11.orientationA)) {
													var1.draw(var11.renderable1, 0, var11.x * 4096, var11.z, var11.y * 4096, var11.tag);
												}

												var4.drawGameObjectEdges = 0;
											}
										}

										if (!var4.drawGameObjects) {
											break;
										}

										try {
											int var34 = var4.gameObjectsCount;
											var4.drawGameObjects = false;
											var21 = 0;

											label588:
											for (var12 = 0; var12 < var34; ++var12) {
												var13 = var4.gameObjects[var12];
												if (var13.lastDrawn != this.Scene_drawnCount) {
													for (var24 = var13.startX; var24 <= var13.endX; ++var24) {
														for (var15 = var13.startY; var15 <= var13.endY; ++var15) {
															var36 = var9[var24][var15];
															if (var36.drawPrimary) {
																var4.drawGameObjects = true;
																continue label588;
															}

															if (var36.drawGameObjectEdges != 0) {
																var17 = 0;
																if (var24 > var13.startX) {
																	++var17;
																}

																if (var24 < var13.endX) {
																	var17 += 4;
																}

																if (var15 > var13.startY) {
																	var17 += 8;
																}

																if (var15 < var13.endY) {
																	var17 += 2;
																}

																if ((var17 & var36.drawGameObjectEdges) == var4.field2622) {
																	var4.drawGameObjects = true;
																	continue label588;
																}
															}
														}
													}

													this.gameObjects[var21++] = var13;
													var24 = this.field2713 - var13.startX;
													var15 = var13.endX - this.field2713;
													if (var15 > var24) {
														var24 = var15;
													}

													var16 = this.field2770 - var13.startY;
													var17 = var13.endY - this.field2770;
													if (var17 > var16) {
														var13.field3035 = var24 + var17;
													} else {
														var13.field3035 = var24 + var16;
													}
												}
											}

											while (true) {
												var12 = -50;
												var25 = -1;

												for (var24 = 0; var24 < var21; ++var24) {
													GameObject var35 = this.gameObjects[var24];
													if (var35.lastDrawn != this.Scene_drawnCount) {
														if (var35.field3035 > var12) {
															var12 = var35.field3035;
															var25 = var24;
														} else if (var12 == var35.field3035) {
															var16 = var35.centerX - this.Scene_cameraX;
															var17 = var35.centerY - this.Scene_cameraZ;
															var18 = this.gameObjects[var25].centerX - this.Scene_cameraX;
															var19 = this.gameObjects[var25].centerY - this.Scene_cameraZ;
															if (var16 * var16 + var17 * var17 > var18 * var18 + var19 * var19) {
																var25 = var24;
															}
														}
													}
												}

												if (var25 == -1) {
													if (var4.drawGameObjects) {
														break;
													}
													continue label596;
												}

												GameObject var33 = this.gameObjects[var25];
												var33.lastDrawn = this.Scene_drawnCount;
												if (!this.method4975(var8, var33.startX, var33.endX, var33.startY, var33.endY, var33.renderable.height)) {
													var1.draw(var33.renderable, var33.orientation, var33.centerX, var33.z, var33.centerY, var33.tag);
												}

												for (var15 = var33.startX; var15 <= var33.endX; ++var15) {
													for (var16 = var33.startY; var16 <= var33.endY; ++var16) {
														Tile var26 = var9[var15][var16];
														if (var26.drawGameObjectEdges != 0) {
															this.Scene_tilesDeque.addFirst(var26);
														} else if ((var15 != var5 || var16 != var6) && var26.drawSecondary) {
															this.Scene_tilesDeque.addFirst(var26);
														}
													}
												}
											}
										} catch (Exception var28) {
											var4.drawGameObjects = false;
											break;
										}
									}
								} while(!var4.drawSecondary);
							} while(var4.drawGameObjectEdges != 0);

							if (var5 > this.field2713 || var5 <= this.field2745) {
								break;
							}

							var10 = var9[var5 - 1][var6];
						} while(var10 != null && var10.drawSecondary);

						if (var5 < this.field2713 || var5 >= this.field2707 - 1) {
							break;
						}

						var10 = var9[var5 + 1][var6];
					} while(var10 != null && var10.drawSecondary);

					if (var6 > this.field2770 || var6 <= this.field2708) {
						break;
					}

					var10 = var9[var5][var6 - 1];
				} while(var10 != null && var10.drawSecondary);

				if (var6 < this.field2770 || var6 >= this.field2758 - 1) {
					break;
				}

				var10 = var9[var5][var6 + 1];
			} while(var10 != null && var10.drawSecondary);

			var4.drawSecondary = false;
			--this.field2706;
			ItemLayer var32 = var4.itemLayer;
			if (var32 != null && var32.height != 0) {
				if (var32.second != null) {
					var1.draw(var32.second, 0, var32.x * 4096, var32.z - var32.height, var32.y * 4096, var32.tag);
				}

				if (var32.third != null) {
					var1.draw(var32.third, 0, var32.x * 4096, var32.z - var32.height, var32.y * 4096, var32.tag);
				}

				if (var32.first != null) {
					var1.draw(var32.first, 0, var32.x * 4096, var32.z - var32.height, var32.y * 4096, var32.tag);
				}
			}

			if (var4.minPlane != 0) {
				WallDecoration var29 = var4.wallDecoration;
				if (var29 != null && !this.method4974(var8, var5, var6, var29.renderable1.height)) {
					if ((var29.orientation & var4.minPlane) != 0) {
						var1.draw(var29.renderable1, 0, var29.x * 64 + var29.xOffset, var29.z, var29.y * 64 + var29.yOffset, var29.tag);
					} else if (var29.orientation == 256) {
						var12 = var29.x * 64 - this.Scene_cameraX;
						var25 = var29.y * 64 - this.Scene_cameraZ;
						var24 = var29.orientation2;
						if (var24 != 1 && var24 != 2) {
							var15 = var12;
						} else {
							var15 = -var12;
						}

						if (var24 != 2 && var24 != 3) {
							var16 = var25;
						} else {
							var16 = -var25;
						}

						if (var16 >= var15) {
							var1.draw(var29.renderable1, 0, var29.x * 64 + var29.xOffset, var29.z, var29.y * 64 + var29.yOffset, var29.tag);
						} else if (var29.renderable2 != null) {
							var1.draw(var29.renderable2, 0, var29.x * 64, var29.z, var29.y * 64, var29.tag);
						}
					}
				}

				BoundaryObject var27 = var4.boundaryObject;
				if (var27 != null) {
					if ((var27.orientationB & var4.minPlane) != 0 && !this.method4973(var8, var5, var6, var27.orientationB)) {
						var1.draw(var27.renderable2, 0, var27.x * 4096, var27.z, var27.y * 4096, var27.tag);
					}

					if ((var27.orientationA & var4.minPlane) != 0 && !this.method4973(var8, var5, var6, var27.orientationA)) {
						var1.draw(var27.renderable1, 0, var27.x * 4096, var27.z, var27.y * 4096, var27.tag);
					}
				}
			}

			Tile var30;
			if (var7 < this.tempGameObjectsCount - 1) {
				var30 = this.tiles[var7 + 1][var5][var6];
				if (var30 != null && var30.drawSecondary) {
					this.Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var5 < this.field2713 && var5 >= this.field2745 && var5 < this.field2707 - 1) {
				var30 = var9[var5 + 1][var6];
				if (var30 != null && var30.drawSecondary) {
					this.Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var6 < this.field2770 && var6 >= this.field2708 && var6 < this.field2758 - 1) {
				var30 = var9[var5][var6 + 1];
				if (var30 != null && var30.drawSecondary) {
					this.Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var5 > this.field2713 && var5 > this.field2745 && var5 < this.field2707) {
				var30 = var9[var5 - 1][var6];
				if (var30 != null && var30.drawSecondary) {
					this.Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var6 > this.field2770 && var6 > this.field2708 && var6 < this.field2758) {
				var30 = var9[var5][var6 - 1];
				if (var30 != null && var30.drawSecondary) {
					this.Scene_tilesDeque.addFirst(var30);
				}
			}
		}
	}

	@ObfuscatedName("ci")
	@Export("occlude")
	void occlude() {
		int var1 = this.Scene_planeOccluderCounts[this.Scene_plane];
		Occluder[] var2 = this.field2729[this.Scene_plane];
		this.field2682 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			Occluder var4 = var2[var3];
			int var5;
			int var6;
			int var7;
			int var9;
			boolean var13;
			if (var4.type == 1) {
				var5 = var4.minTileX - this.field2713 + this.field2738;
				if (var5 >= 0 && var5 <= this.field2738 + this.field2738) {
					var6 = var4.minTileY - this.field2770 + this.field2738;
					if (var6 < 0) {
						var6 = 0;
					}

					var7 = var4.maxTileY - this.field2770 + this.field2738;
					if (var7 > this.field2738 + this.field2738) {
						var7 = this.field2738 + this.field2738;
					}

					var13 = false;

					while (var6 <= var7) {
						if (this.visibleTiles(var5, var6++)) {
							var13 = true;
							break;
						}
					}

					if (var13) {
						var9 = this.Scene_cameraX - var4.minX;
						if (var9 > 32) {
							var4.field2828 = 1;
						} else {
							if (var9 >= -32) {
								continue;
							}

							var4.field2828 = 2;
							var9 = -var9;
						}

						var4.field2826 = (var4.minZ - this.Scene_cameraZ << 8) / var9;
						var4.field2832 = (var4.maxZ - this.Scene_cameraZ << 8) / var9;
						var4.field2824 = (var4.minY - this.field2711 << 8) / var9;
						var4.field2829 = (var4.maxY - this.field2711 << 8) / var9;
						this.field2747[this.field2682++] = var4;
					}
				}
			} else if (var4.type == 2) {
				var5 = var4.minTileY - this.field2770 + this.field2738;
				if (var5 >= 0 && var5 <= this.field2738 + this.field2738) {
					var6 = var4.minTileX - this.field2713 + this.field2738;
					if (var6 < 0) {
						var6 = 0;
					}

					var7 = var4.maxTileX - this.field2713 + this.field2738;
					if (var7 > this.field2738 + this.field2738) {
						var7 = this.field2738 + this.field2738;
					}

					var13 = false;

					while (var6 <= var7) {
						if (this.visibleTiles(var6++, var5)) {
							var13 = true;
							break;
						}
					}

					if (var13) {
						var9 = this.Scene_cameraZ - var4.minZ;
						if (var9 > 32) {
							var4.field2828 = 3;
						} else {
							if (var9 >= -32) {
								continue;
							}

							var4.field2828 = 4;
							var9 = -var9;
						}

						var4.field2823 = (var4.minX - this.Scene_cameraX << 8) / var9;
						var4.field2830 = (var4.maxX - this.Scene_cameraX << 8) / var9;
						var4.field2824 = (var4.minY - this.field2711 << 8) / var9;
						var4.field2829 = (var4.maxY - this.field2711 << 8) / var9;
						this.field2747[this.field2682++] = var4;
					}
				}
			} else if (var4.type == 4) {
				var5 = var4.minY - this.field2711;
				if (var5 > 128) {
					var6 = var4.minTileY - this.field2770 + this.field2738;
					if (var6 < 0) {
						var6 = 0;
					}

					var7 = var4.maxTileY - this.field2770 + this.field2738;
					if (var7 > this.field2738 + this.field2738) {
						var7 = this.field2738 + this.field2738;
					}

					if (var6 <= var7) {
						int var8 = var4.minTileX - this.field2713 + this.field2738;
						if (var8 < 0) {
							var8 = 0;
						}

						var9 = var4.maxTileX - this.field2713 + this.field2738;
						if (var9 > this.field2738 + this.field2738) {
							var9 = this.field2738 + this.field2738;
						}

						boolean var10 = false;

						label150:
						for (int var11 = var8; var11 <= var9; ++var11) {
							for (int var12 = var6; var12 <= var7; ++var12) {
								if (this.visibleTiles(var11, var12)) {
									var10 = true;
									break label150;
								}
							}
						}

						if (var10) {
							var4.field2828 = 5;
							var4.field2823 = (var4.minX - this.Scene_cameraX << 8) / var5;
							var4.field2830 = (var4.maxX - this.Scene_cameraX << 8) / var5;
							var4.field2826 = (var4.minZ - this.Scene_cameraZ << 8) / var5;
							var4.field2832 = (var4.maxZ - this.Scene_cameraZ << 8) / var5;
							this.field2747[this.field2682++] = var4;
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("cl")
	boolean method5096(int var1, int var2, int var3) {
		int var4 = this.field2748[var1][var2][var3];
		if (var4 == -this.Scene_drawnCount) {
			return false;
		} else if (var4 == this.Scene_drawnCount) {
			return true;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			if (this.method4976(var5 + 1, this.tileHeights[var1][var2][var3], var6 + 1) && this.method4976(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3], var6 + 1) && this.method4976(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method4976(var5 + 1, this.tileHeights[var1][var2][var3 + 1], var6 + 128 - 1)) {
				this.field2748[var1][var2][var3] = this.Scene_drawnCount;
				return true;
			} else {
				this.field2748[var1][var2][var3] = -this.Scene_drawnCount;
				return false;
			}
		}
	}

	@ObfuscatedName("cc")
	boolean method4973(int var1, int var2, int var3, int var4) {
		if (!this.method5096(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			int var7 = this.tileHeights[var1][var2][var3] - 1;
			int var8 = var7 - 120;
			int var9 = var7 - 230;
			int var10 = var7 - 238;
			if (var4 < 16) {
				if (var4 == 1) {
					if (var5 > this.Scene_cameraX) {
						if (!this.method4976(var5, var7, var6)) {
							return false;
						}

						if (!this.method4976(var5, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method4976(var5, var8, var6)) {
							return false;
						}

						if (!this.method4976(var5, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.method4976(var5, var9, var6)) {
						return false;
					}

					if (!this.method4976(var5, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 2) {
					if (var6 < this.Scene_cameraZ) {
						if (!this.method4976(var5, var7, var6 + 128)) {
							return false;
						}

						if (!this.method4976(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method4976(var5, var8, var6 + 128)) {
							return false;
						}

						if (!this.method4976(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.method4976(var5, var9, var6 + 128)) {
						return false;
					}

					if (!this.method4976(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 4) {
					if (var5 < this.Scene_cameraX) {
						if (!this.method4976(var5 + 128, var7, var6)) {
							return false;
						}

						if (!this.method4976(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method4976(var5 + 128, var8, var6)) {
							return false;
						}

						if (!this.method4976(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.method4976(var5 + 128, var9, var6)) {
						return false;
					}

					if (!this.method4976(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 8) {
					if (var6 > this.Scene_cameraZ) {
						if (!this.method4976(var5, var7, var6)) {
							return false;
						}

						if (!this.method4976(var5 + 128, var7, var6)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method4976(var5, var8, var6)) {
							return false;
						}

						if (!this.method4976(var5 + 128, var8, var6)) {
							return false;
						}
					}

					if (!this.method4976(var5, var9, var6)) {
						return false;
					}

					if (!this.method4976(var5 + 128, var9, var6)) {
						return false;
					}

					return true;
				}
			}

			if (!this.method4976(var5 + 64, var10, var6 + 64)) {
				return false;
			} else if (var4 == 16) {
				return this.method4976(var5, var9, var6 + 128);
			} else if (var4 == 32) {
				return this.method4976(var5 + 128, var9, var6 + 128);
			} else if (var4 == 64) {
				return this.method4976(var5 + 128, var9, var6);
			} else if (var4 == 128) {
				return this.method4976(var5, var9, var6);
			} else {
				return true;
			}
		}
	}

	@ObfuscatedName("cq")
	boolean method4974(int var1, int var2, int var3, int var4) {
		if (!this.method5096(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			return this.method4976(var5 + 1, this.tileHeights[var1][var2][var3] - var4, var6 + 1) && this.method4976(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3] - var4, var6 + 1) && this.method4976(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method4976(var5 + 1, this.tileHeights[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
		}
	}

	@ObfuscatedName("cz")
	boolean method4975(int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		int var8;
		if (var3 == var2 && var5 == var4) {
			if (!this.method5096(var1, var2, var4)) {
				return false;
			} else {
				var7 = var2 << 7;
				var8 = var4 << 7;
				return this.method4976(var7 + 1, this.tileHeights[var1][var2][var4] - var6, var8 + 1) && this.method4976(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4] - var6, var8 + 1) && this.method4976(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method4976(var7 + 1, this.tileHeights[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
			}
		} else {
			for (var7 = var2; var7 <= var3; ++var7) {
				for (var8 = var4; var8 <= var5; ++var8) {
					if (this.field2748[var1][var7][var8] == -this.Scene_drawnCount) {
						return false;
					}
				}
			}

			var7 = (var2 << 7) + 1;
			var8 = (var4 << 7) + 2;
			int var9 = this.tileHeights[var1][var2][var4] - var6;
			if (!this.method4976(var7, var9, var8)) {
				return false;
			} else {
				int var10 = (var3 << 7) - 1;
				if (!this.method4976(var10, var9, var8)) {
					return false;
				} else {
					int var11 = (var5 << 7) - 1;
					if (!this.method4976(var7, var9, var11)) {
						return false;
					} else if (!this.method4976(var10, var9, var11)) {
						return false;
					} else {
						return true;
					}
				}
			}
		}
	}

	@ObfuscatedName("cm")
	boolean method4976(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field2682; ++var4) {
			Occluder var5 = this.field2747[var4];
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			if (var5.field2828 == 1) {
				var6 = var5.minX - var1;
				if (var6 > 0) {
					var7 = (var6 * var5.field2826 >> 8) + var5.minZ;
					var8 = (var6 * var5.field2832 >> 8) + var5.maxZ;
					var9 = (var6 * var5.field2824 >> 8) + var5.minY;
					var10 = (var6 * var5.field2829 >> 8) + var5.maxY;
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field2828 == 2) {
				var6 = var1 - var5.minX;
				if (var6 > 0) {
					var7 = (var6 * var5.field2826 >> 8) + var5.minZ;
					var8 = (var6 * var5.field2832 >> 8) + var5.maxZ;
					var9 = (var6 * var5.field2824 >> 8) + var5.minY;
					var10 = (var6 * var5.field2829 >> 8) + var5.maxY;
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field2828 == 3) {
				var6 = var5.minZ - var3;
				if (var6 > 0) {
					var7 = (var6 * var5.field2823 >> 8) + var5.minX;
					var8 = (var6 * var5.field2830 >> 8) + var5.maxX;
					var9 = (var6 * var5.field2824 >> 8) + var5.minY;
					var10 = (var6 * var5.field2829 >> 8) + var5.maxY;
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field2828 == 4) {
				var6 = var3 - var5.minZ;
				if (var6 > 0) {
					var7 = (var6 * var5.field2823 >> 8) + var5.minX;
					var8 = (var6 * var5.field2830 >> 8) + var5.maxX;
					var9 = (var6 * var5.field2824 >> 8) + var5.minY;
					var10 = (var6 * var5.field2829 >> 8) + var5.maxY;
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field2828 == 5) {
				var6 = var2 - var5.minY;
				if (var6 > 0) {
					var7 = (var6 * var5.field2823 >> 8) + var5.minX;
					var8 = (var6 * var5.field2830 >> 8) + var5.maxX;
					var9 = (var6 * var5.field2826 >> 8) + var5.minZ;
					var10 = (var6 * var5.field2832 >> 8) + var5.maxZ;
					if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
						return true;
					}
				}
			}
		}

		return false;
	}

	@ObfuscatedName("fu")
	void vmethod5284(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		TransformationMatrix var15 = class148.method3476();
		float var16 = 0.0F;
		float var17 = 0.0F;
		if (this.field2684) {
			int var18 = this.baseY % 300;
			float var19 = (float)var18 / 300.0F * 3.1415927F * 2.0F;
			float var20 = (float)Math.sin((double)var19);
			float var21 = (float)Math.cos((double)var19);
			var16 = (float)((double)var20 * 3.141592653589793D) / 100.0F;
			var17 = (float)((double)var21 * 3.141592653589793D) / 100.0F;
		}

		class438 var25 = new class438();
		var25.field4882.method8363(class138.method3387(var1), var16, var17);
		var25.field4881.method8296((float)var4, (float)var5, (float)var6);
		class438 var26 = new class438();
		var26.field4881.method8296((float)(-(this.Scene_cameraYTileMin * 64) - this.baseX), (float)this.cycle, (float)(-(this.Scene_cameraY * 64) - this.field2686));
		TransformationMatrix var27 = class148.method3476();
		var27.method8435(var26);
		var15.method8405(1.0F, this.field2722, 1.0F, 1.0F);
		var27.method8399(var15);
		var15.method8435(var25);
		var27.method8399(var15);
		class445 var28 = new class445();
		TransformationMatrix var22 = class148.method3476();
		var28.method8481(class138.method3387(-var2));
		var28.method8482(class138.method3387(-var3));
		var28.method8483((float)var7, (float)var8, (float)var9);
		var22.method8402(var28);
		var22.method8419();
		TransformationMatrix var23 = class148.method3476();
		var23.method8435(var25);
		var23.method8419();
		this.Scene_cameraX = (int)var23.method8408((float)var7, (float)var8, (float)var9);
		this.field2711 = (int)var23.method8409((float)var7, (float)var8, (float)var9);
		this.Scene_cameraZ = (int)var23.method8410((float)var7, (float)var8, (float)var9);
		this.field2713 = this.Scene_cameraX / 128;
		this.field2770 = this.Scene_cameraZ / 128;
		this.field2715 = (int)var23.method8408((float)var12, 0.0F, (float)var13) / 128;
		this.field2716 = (int)var23.method8410((float)var12, 0.0F, (float)var13) / 128;
		var25.method8243();
		var26.method8243();
		var15.method8413();
		var23.method8413();
		var27.method8399(var22);
		FloatProjection var24 = new FloatProjection(var27);
		this.updateVisibleTilesAndOccluders(var24, var14);
		var22.method8413();
		var27.method8413();
	}

	@ObfuscatedName("ce")
	static final int method4969(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	@ObfuscatedName("cn")
	@Export("containsBounds")
	static boolean containsBounds(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var1 < var2 && var1 < var3 && var1 < var4) {
			return false;
		} else if (var1 > var2 && var1 > var3 && var1 > var4) {
			return false;
		} else if (var0 < var5 && var0 < var6 && var0 < var7) {
			return false;
		} else if (var0 > var5 && var0 > var6 && var0 > var7) {
			return false;
		} else {
			int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
			int var9 = (var7 - var6) * (var1 - var3) - (var0 - var6) * (var4 - var3);
			int var10 = (var5 - var7) * (var1 - var4) - (var2 - var4) * (var0 - var7);
			if (var8 == 0) {
				if (var9 != 0) {
					return var9 < 0 ? var10 <= 0 : var10 >= 0;
				} else {
					return true;
				}
			} else {
				return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0;
			}
		}
	}
}
