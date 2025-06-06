import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("he")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("ae")
	static final float field2223;
	@ObfuscatedName("av")
	static boolean[] field2227;
	@ObfuscatedName("am")
	static boolean[] field2228;
	@ObfuscatedName("aa")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("ap")
	@Export("modelViewportYs")
	static int[] modelViewportYs;
	@ObfuscatedName("ax")
	static float[] field2231;
	@ObfuscatedName("aw")
	static int[] field2245;
	@ObfuscatedName("ar")
	static int[] field2233;
	@ObfuscatedName("au")
	static int[] field2234;
	@ObfuscatedName("aj")
	static int[] field2235;
	@ObfuscatedName("al")
	static char[] field2283;
	@ObfuscatedName("ac")
	static char[][] field2237;
	@ObfuscatedName("ay")
	static int[] field2238;
	@ObfuscatedName("ak")
	static int[][] field2230;
	@ObfuscatedName("ag")
	static int[] field2265;
	@ObfuscatedName("ai")
	static int[] field2241;
	@ObfuscatedName("ad")
	static int[] field2242;
	@ObfuscatedName("ah")
	static boolean field2243;
	@ObfuscatedName("az")
	static int[] field2264;
	@ObfuscatedName("at")
	static int[] field2285;
	@ObfuscatedName("ab")
	static int[] field2292;
	@ObfuscatedName("br")
	static int[] field2247;
	@ObfuscatedName("bp")
	static float[] field2248;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("bb")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("bw")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	static TransformationMatrix field2253;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	static TransformationMatrix field2257;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	static TransformationMatrix field2255;
	@ObfuscatedName("bd")
	static int[] field2256;
	@ObfuscatedName("bu")
	static int[] field2290;
	@ObfuscatedName("bc")
	static int[] field2258;
	@ObfuscatedName("bs")
	static float[] field2259;
	@ObfuscatedName("bx")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("bj")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("bv")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("be")
	@Export("verticesCount")
	public int verticesCount;
	@ObfuscatedName("bm")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("bq")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("bt")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("bn")
	@Export("indicesCount")
	public int indicesCount;
	@ObfuscatedName("bo")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("bg")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("by")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("bf")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("bi")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("ci")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("cg")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("cq")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("cp")
	@Export("textureFaces")
	byte[] textureFaces;
	@ObfuscatedName("cs")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("cc")
	public byte field2278;
	@ObfuscatedName("cd")
	@Export("texIndicesCount")
	public int texIndicesCount;
	@ObfuscatedName("ca")
	@Export("texIndices1")
	int[] texIndices1;
	@ObfuscatedName("cl")
	@Export("texIndices2")
	int[] texIndices2;
	@ObfuscatedName("cf")
	@Export("texIndices3")
	int[] texIndices3;
	@ObfuscatedName("cw")
	int[][] field2222;
	@ObfuscatedName("cv")
	int[][] field2244;
	@ObfuscatedName("cu")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("ct")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("ck")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("cj")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("cr")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("cb")
	@Export("radius")
	int radius;
	@ObfuscatedName("cx")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("co")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	@Export("aabb")
	AABB aabb;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	ModelColorOverride field2294;
	@ObfuscatedName("cn")
	short field2295;

	static {
		field2223 = class503.method9561(50);
		field2227 = new boolean[6500];
		field2228 = new boolean[6500];
		modelViewportXs = new int[6500];
		modelViewportYs = new int[6500];
		field2231 = new float[6500];
		field2245 = new int[6500];
		field2233 = new int[6500];
		field2234 = new int[6500];
		field2235 = new int[6500];
		field2283 = new char[6000];
		field2237 = new char[6000][512];
		field2238 = new int[12];
		field2230 = new int[12][2000];
		field2265 = new int[2000];
		field2241 = new int[2000];
		field2242 = new int[12];
		field2243 = true;
		field2264 = Rasterizer3D.Rasterizer3D_sine;
		field2285 = Rasterizer3D.Rasterizer3D_cosine;
		field2292 = Rasterizer3D.Rasterizer3D_colorPalette;
		field2247 = Rasterizer3D.field1996;
		field2248 = new float[3];
		Model_sharedSequenceModel = new Model();
		Model_sharedSequenceModelFaceAlphas = new byte[1];
		Model_sharedSpotAnimationModel = new Model();
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1];
		field2253 = new TransformationMatrix();
		field2257 = new TransformationMatrix();
		field2255 = new TransformationMatrix();
		field2256 = new int[10];
		field2290 = new int[10];
		field2258 = new int[10];
		field2259 = new float[10];
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2278 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.field2294 = null;
	}

	public Model(int var1, int var2, int var3, byte var4) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2278 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.field2294 = null;
		this.method4389(var1, var2, var3);
		this.field2278 = var4;
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Lhe;)V"
	)
	Model(Model var1) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2278 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.field2294 = null;
		this.verticesCount = var1.verticesCount;
		this.indicesCount = var1.indicesCount;
		this.texIndicesCount = var1.texIndicesCount;
		this.verticesX = var1.verticesX;
		this.verticesY = var1.verticesY;
		this.verticesZ = var1.verticesZ;
		this.indices1 = var1.indices1;
		this.indices2 = var1.indices2;
		this.indices3 = var1.indices3;
		this.faceColors1 = var1.faceColors1;
		this.faceColors2 = var1.faceColors2;
		this.faceColors3 = var1.faceColors3;
		this.faceRenderPriorities = var1.faceRenderPriorities;
		this.faceAlphas = var1.faceAlphas;
		this.textureFaces = var1.textureFaces;
		this.faceTextures = var1.faceTextures;
		this.field2278 = var1.field2278;
		this.texIndices1 = var1.texIndices1;
		this.texIndices2 = var1.texIndices2;
		this.texIndices3 = var1.texIndices3;
		this.vertexLabels = var1.vertexLabels;
		this.faceLabelsAlpha = var1.faceLabelsAlpha;
		this.isSingleTile = var1.isSingleTile;
	}

	@ObfuscatedSignature(
		descriptor = "([Lhe;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2278 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.field2294 = null;
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;
		this.field2278 = -1;

		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			Model var4 = var1[var3];
			if (var4 != null) {
				this.verticesCount += var4.verticesCount;
				this.indicesCount += var4.indicesCount;
				this.texIndicesCount += var4.texIndicesCount;
				if (this.field2278 == -1) {
					this.field2278 = var4.field2278;
				}
			}
		}

		this.method4389(this.verticesCount, this.indicesCount, this.texIndicesCount);
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;

		for (var3 = 0; var3 < var2; ++var3) {
			this.method4391(var1[var3]);
		}

	}

	@ObfuscatedName("ao")
	void method4389(int var1, int var2, int var3) {
		this.verticesX = new int[var1];
		this.verticesY = new int[var1];
		this.verticesZ = new int[var1];
		this.indices1 = new int[var2];
		this.indices2 = new int[var2];
		this.indices3 = new int[var2];
		this.faceColors1 = new int[var2];
		this.faceColors2 = new int[var2];
		this.faceColors3 = new int[var2];
		if (var3 > 0) {
			this.texIndices1 = new int[var3];
			this.texIndices2 = new int[var3];
			this.texIndices3 = new int[var3];
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lhe;)V"
	)
	void method4393(Model var1) {
		int var2 = this.indices1.length;
		if (this.faceRenderPriorities == null && (var1.faceRenderPriorities != null || this.field2278 != var1.field2278)) {
			this.faceRenderPriorities = new byte[var2];
			Arrays.fill(this.faceRenderPriorities, this.field2278);
		}

		if (this.faceAlphas == null && var1.faceAlphas != null) {
			this.faceAlphas = new byte[var2];
			Arrays.fill(this.faceAlphas, (byte)0);
		}

		if (this.faceTextures == null && var1.faceTextures != null) {
			this.faceTextures = new short[var2];
			Arrays.fill(this.faceTextures, (short)-1);
		}

		if (this.textureFaces == null && var1.textureFaces != null) {
			this.textureFaces = new byte[var2];
			Arrays.fill(this.textureFaces, (byte)-1);
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lhe;)V"
	)
	public void method4391(Model var1) {
		if (var1 != null) {
			this.method4393(var1);

			int var2;
			for (var2 = 0; var2 < var1.indicesCount; ++var2) {
				this.indices1[this.indicesCount] = this.verticesCount + var1.indices1[var2];
				this.indices2[this.indicesCount] = this.verticesCount + var1.indices2[var2];
				this.indices3[this.indicesCount] = this.verticesCount + var1.indices3[var2];
				this.faceColors1[this.indicesCount] = var1.faceColors1[var2];
				this.faceColors2[this.indicesCount] = var1.faceColors2[var2];
				this.faceColors3[this.indicesCount] = var1.faceColors3[var2];
				if (this.faceRenderPriorities != null) {
					this.faceRenderPriorities[this.indicesCount] = var1.faceRenderPriorities != null ? var1.faceRenderPriorities[var2] : var1.field2278;
				}

				if (this.faceAlphas != null && var1.faceAlphas != null) {
					this.faceAlphas[this.indicesCount] = var1.faceAlphas[var2];
				}

				if (this.faceTextures != null) {
					this.faceTextures[this.indicesCount] = var1.faceTextures != null ? var1.faceTextures[var2] : -1;
				}

				if (this.textureFaces != null) {
					if (var1.textureFaces != null && var1.textureFaces[var2] != -1) {
						this.textureFaces[this.indicesCount] = (byte)(var1.textureFaces[var2] + this.texIndicesCount);
					} else {
						this.textureFaces[this.indicesCount] = -1;
					}
				}

				++this.indicesCount;
			}

			for (var2 = 0; var2 < var1.texIndicesCount; ++var2) {
				this.texIndices1[this.texIndicesCount] = this.verticesCount + var1.texIndices1[var2];
				this.texIndices2[this.texIndicesCount] = this.verticesCount + var1.texIndices2[var2];
				this.texIndices3[this.texIndicesCount] = this.verticesCount + var1.texIndices3[var2];
				++this.texIndicesCount;
			}

			for (var2 = 0; var2 < var1.verticesCount; ++var2) {
				this.verticesX[this.verticesCount] = var1.verticesX[var2];
				this.verticesY[this.verticesCount] = var1.verticesY[var2];
				this.verticesZ[this.verticesCount] = var1.verticesZ[var2];
				++this.verticesCount;
			}

		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Lhe;"
	)
	@Export("contourGround")
	public Model contourGround(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.calculateBoundsCylinder();
		int var7 = var2 - this.xzRadius;
		int var8 = var2 + this.xzRadius;
		int var9 = var4 - this.xzRadius;
		int var10 = var4 + this.xzRadius;
		if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
			var7 >>= 7;
			var8 = var8 + 127 >> 7;
			var9 >>= 7;
			var10 = var10 + 127 >> 7;
			if (var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10] && var3 == var1[var8][var10]) {
				return this;
			} else {
				Model var11;
				if (var5) {
					var11 = new Model(this);
					var11.verticesY = new int[var11.verticesCount];
				} else {
					var11 = this;
				}

				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var20;
				int var21;
				if (var6 == 0) {
					for (var12 = 0; var12 < var11.verticesCount; ++var12) {
						var13 = var2 + this.verticesX[var12];
						var14 = var4 + this.verticesZ[var12];
						var15 = var13 & 127;
						var16 = var14 & 127;
						var17 = var13 >> 7;
						var18 = var14 >> 7;
						var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
						var20 = var1[var17][var18 + 1] * (128 - var15) + var15 * var1[var17 + 1][var18 + 1] >> 7;
						var21 = var19 * (128 - var16) + var20 * var16 >> 7;
						var11.verticesY[var12] = var21 + this.verticesY[var12] - var3;
					}
				} else {
					for (var12 = 0; var12 < var11.verticesCount; ++var12) {
						var13 = (-this.verticesY[var12] << 16) / super.height;
						if (var13 < var6) {
							var14 = var2 + this.verticesX[var12];
							var15 = var4 + this.verticesZ[var12];
							var16 = var14 & 127;
							var17 = var15 & 127;
							var18 = var14 >> 7;
							var19 = var15 >> 7;
							var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
							var21 = var1[var18][var19 + 1] * (128 - var16) + var16 * var1[var18 + 1][var19 + 1] >> 7;
							int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
							var11.verticesY[var12] = (var6 - var13) * (var22 - var3) / var6 + this.verticesY[var12];
						} else {
							var11.verticesY[var12] = this.verticesY[var12];
						}
					}
				}

				var11.resetBounds();
				return var11;
			}
		} else {
			return this;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Z)Lhe;"
	)
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Z)Lhe;"
	)
	@Export("toSharedSpotAnimationModel")
	public Model toSharedSpotAnimationModel(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ZLhe;[B)Lhe;"
	)
	@Export("buildSharedModel")
	Model buildSharedModel(boolean var1, Model var2, byte[] var3) {
		var2.verticesCount = this.verticesCount;
		var2.indicesCount = this.indicesCount;
		var2.texIndicesCount = this.texIndicesCount;
		if (var2.verticesX == null || var2.verticesX.length < this.verticesCount) {
			var2.verticesX = new int[this.verticesCount + 100];
			var2.verticesY = new int[this.verticesCount + 100];
			var2.verticesZ = new int[this.verticesCount + 100];
		}

		int var4;
		for (var4 = 0; var4 < this.verticesCount; ++var4) {
			var2.verticesX[var4] = this.verticesX[var4];
			var2.verticesY[var4] = this.verticesY[var4];
			var2.verticesZ[var4] = this.verticesZ[var4];
		}

		if (var1) {
			var2.faceAlphas = this.faceAlphas;
		} else {
			var2.faceAlphas = var3;
			if (this.faceAlphas == null) {
				for (var4 = 0; var4 < this.indicesCount; ++var4) {
					var2.faceAlphas[var4] = 0;
				}
			} else {
				for (var4 = 0; var4 < this.indicesCount; ++var4) {
					var2.faceAlphas[var4] = this.faceAlphas[var4];
				}
			}
		}

		var2.indices1 = this.indices1;
		var2.indices2 = this.indices2;
		var2.indices3 = this.indices3;
		var2.faceColors1 = this.faceColors1;
		var2.faceColors2 = this.faceColors2;
		var2.faceColors3 = this.faceColors3;
		var2.faceRenderPriorities = this.faceRenderPriorities;
		var2.textureFaces = this.textureFaces;
		var2.faceTextures = this.faceTextures;
		var2.field2278 = this.field2278;
		var2.texIndices1 = this.texIndices1;
		var2.texIndices2 = this.texIndices2;
		var2.texIndices3 = this.texIndices3;
		var2.vertexLabels = this.vertexLabels;
		var2.faceLabelsAlpha = this.faceLabelsAlpha;
		var2.field2222 = this.field2222;
		var2.field2244 = this.field2244;
		var2.isSingleTile = this.isSingleTile;
		var2.field2294 = this.field2294;
		var2.field2295 = this.field2295;
		var2.resetBounds();
		return var2;
	}

	@ObfuscatedName("ap")
	@Export("calculateBoundingBox")
	void calculateBoundingBox(int var1) {
		AABB var2 = this.getAABB(var1);
		if (var2 == null) {
			int var3 = 0;
			int var4 = 0;
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			int var8 = 0;
			int var9 = field2285[var1];
			int var10 = field2264[var1];

			for (int var11 = 0; var11 < this.verticesCount; ++var11) {
				int var13 = this.verticesX[var11];
				int var14 = this.verticesZ[var11];
				int var12 = var9 * var13 + var14 * var10 >> 16;
				int var16 = this.verticesY[var11];
				int var17 = class267.method5631(this.verticesX[var11], this.verticesZ[var11], var9, var10);
				if (var12 < var3) {
					var3 = var12;
				}

				if (var12 > var6) {
					var6 = var12;
				}

				if (var16 < var4) {
					var4 = var16;
				}

				if (var16 > var7) {
					var7 = var16;
				}

				if (var17 < var5) {
					var5 = var17;
				}

				if (var17 > var8) {
					var8 = var17;
				}
			}

			var2 = new AABB(var1, (var6 + var3) / 2, (var7 + var4) / 2, (var8 + var5) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2, (var8 - var5 + 1) / 2);
			boolean var18 = true;
			if (var2.xMidOffset < 32) {
				var2.xMidOffset = 32;
			}

			if (var2.zMidOffset < 32) {
				var2.zMidOffset = 32;
			}

			if (this.isSingleTile) {
				boolean var19 = true;
				var2.xMidOffset += 8;
				var2.zMidOffset += 8;
			}

			var2.aabb = this.aabb;
			this.aabb = var2;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Lhq;"
	)
	@Export("getAABB")
	AABB getAABB(int var1) {
		for (AABB var2 = this.aabb; var2 != null; var2 = var2.aabb) {
			if (var2.orientation == var1) {
				return var2;
			}
		}

		return null;
	}

	@ObfuscatedName("aw")
	@Export("calculateBoundsCylinder")
	public void calculateBoundsCylinder() {
		if (this.boundsType != 1) {
			this.boundsType = 1;
			super.height = 0;
			this.bottomY = 0;
			this.xzRadius = 0;

			for (int var1 = 0; var1 < this.verticesCount; ++var1) {
				int var2 = this.verticesX[var1];
				int var3 = this.verticesY[var1];
				int var4 = this.verticesZ[var1];
				if (-var3 > super.height) {
					super.height = -var3;
				}

				if (var3 > this.bottomY) {
					this.bottomY = var3;
				}

				int var5 = var2 * var2 + var4 * var4;
				if (var5 > this.xzRadius) {
					this.xzRadius = var5;
				}
			}

			this.xzRadius = (int)(Math.sqrt((double)this.xzRadius) + 0.99D);
			this.radius = (int)(Math.sqrt((double)(this.xzRadius * this.xzRadius + super.height * super.height)) + 0.99D);
			this.diameter = this.radius + (int)(Math.sqrt((double)(this.xzRadius * this.xzRadius + this.bottomY * this.bottomY)) + 0.99D);
		}
	}

	@ObfuscatedName("ar")
	void method4399() {
		if (this.boundsType != 2) {
			this.boundsType = 2;
			this.xzRadius = 0;

			for (int var1 = 0; var1 < this.verticesCount; ++var1) {
				int var2 = this.verticesX[var1];
				int var3 = this.verticesY[var1];
				int var4 = this.verticesZ[var1];
				int var5 = var2 * var2 + var4 * var4 + var3 * var3;
				if (var5 > this.xzRadius) {
					this.xzRadius = var5;
				}
			}

			this.xzRadius = (int)(Math.sqrt((double)this.xzRadius) + 0.99D);
			this.radius = this.xzRadius;
			this.diameter = this.xzRadius + this.xzRadius;
		}
	}

	@ObfuscatedName("au")
	public int method4505() {
		this.calculateBoundsCylinder();
		return this.xzRadius;
	}

	@ObfuscatedName("aj")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0;
		this.aabb = null;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lhf;I)V"
	)
	@Export("animate")
	public void animate(Frames var1, int var2) {
		if (this.vertexLabels != null) {
			if (var2 != -1) {
				Animation var3 = var1.frames[var2];
				Skeleton var4 = var3.skeleton;
				Model_transformTempX = 0;
				Model_transformTempY = 0;
				Model_transformTempZ = 0;

				for (int var5 = 0; var5 < var3.transformCount; ++var5) {
					int var6 = var3.transformSkeletonLabels[var5];
					this.transform(var4.transformTypes[var6], var4.labels[var6], var3.transformXs[var5], var3.transformYs[var5], var3.transformZs[var5]);
				}

				this.resetBounds();
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lfy;I)V"
	)
	public void method4403(class142 var1, int var2) {
		Skeleton var3 = var1.field1661;
		class182 var4 = var3.method4046();
		if (var4 != null) {
			var3.method4046().method3982(var1, var2);
			this.method4405(var3.method4046(), var1.method3421());
		}

		if (var1.method3399()) {
			this.method4404(var1, var2);
		}

		this.resetBounds();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lfy;I)V"
	)
	void method4404(class142 var1, int var2) {
		Skeleton var3 = var1.field1661;

		for (int var4 = 0; var4 < var3.count; ++var4) {
			int var5 = var3.transformTypes[var4];
			if (var5 == 5 && var1.field1660 != null && var1.field1660[var4] != null && var1.field1660[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) {
				class135 var6 = var1.field1660[var4][0];
				int[] var7 = var3.labels[var4];
				int var8 = var7.length;

				for (int var9 = 0; var9 < var8; ++var9) {
					int var10 = var7[var9];
					if (var10 < this.faceLabelsAlpha.length) {
						int[] var11 = this.faceLabelsAlpha[var10];

						for (int var12 = 0; var12 < var11.length; ++var12) {
							int var13 = var11[var12];
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method3321(var2) * 255.0F);
							if (var14 < 0) {
								var14 = 0;
							} else if (var14 > 255) {
								var14 = 255;
							}

							this.faceAlphas[var13] = (byte)var14;
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lhs;I)V"
	)
	void method4405(class182 var1, int var2) {
		this.method4387(var1, var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lhf;ILhf;I[I)V"
	)
	@Export("animate2")
	public void animate2(Frames var1, int var2, Frames var3, int var4, int[] var5) {
		if (var2 != -1) {
			if (var5 != null && var4 != -1) {
				Animation var6 = var1.frames[var2];
				Animation var7 = var3.frames[var4];
				Skeleton var8 = var6.skeleton;
				Model_transformTempX = 0;
				Model_transformTempY = 0;
				Model_transformTempZ = 0;
				byte var9 = 0;
				int var13 = var9 + 1;
				int var10 = var5[var9];

				int var11;
				int var12;
				for (var11 = 0; var11 < var6.transformCount; ++var11) {
					for (var12 = var6.transformSkeletonLabels[var11]; var12 > var10; var10 = var5[var13++]) {
					}

					if (var12 != var10 || var8.transformTypes[var12] == 0) {
						this.transform(var8.transformTypes[var12], var8.labels[var12], var6.transformXs[var11], var6.transformYs[var11], var6.transformZs[var11]);
					}
				}

				Model_transformTempX = 0;
				Model_transformTempY = 0;
				Model_transformTempZ = 0;
				var9 = 0;
				var13 = var9 + 1;
				var10 = var5[var9];

				for (var11 = 0; var11 < var7.transformCount; ++var11) {
					for (var12 = var7.transformSkeletonLabels[var11]; var12 > var10; var10 = var5[var13++]) {
					}

					if (var12 == var10 || var8.transformTypes[var12] == 0) {
						this.transform(var8.transformTypes[var12], var8.labels[var12], var7.transformXs[var11], var7.transformYs[var11], var7.transformZs[var11]);
					}
				}

				this.resetBounds();
			} else {
				this.animate(var1, var2);
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lhl;Lfy;I[ZZZ)V"
	)
	public void method4413(Skeleton var1, class142 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class182 var7 = var1.method4046();
		if (var7 != null) {
			var7.method3978(var2, var3, var4, var5);
			if (var6) {
				this.method4405(var7, var2.method3421());
			}
		}

		if (!var5 && var2.method3399()) {
			this.method4404(var2, var3);
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lhf;I[IZ)V"
	)
	public void method4408(Frames var1, int var2, int[] var3, boolean var4) {
		if (var3 == null) {
			this.animate(var1, var2);
		} else {
			Animation var5 = var1.frames[var2];
			Skeleton var6 = var5.skeleton;
			byte var7 = 0;
			int var11 = var7 + 1;
			int var8 = var3[var7];
			Model_transformTempX = 0;
			Model_transformTempY = 0;
			Model_transformTempZ = 0;

			for (int var9 = 0; var9 < var5.transformCount; ++var9) {
				int var10;
				for (var10 = var5.transformSkeletonLabels[var9]; var10 > var8; var8 = var3[var11++]) {
				}

				if (var4) {
					if (var10 == var8 || var6.transformTypes[var10] == 0) {
						this.transform(var6.transformTypes[var10], var6.labels[var10], var5.transformXs[var9], var5.transformYs[var9], var5.transformZs[var9]);
					}
				} else if (var10 != var8 || var6.transformTypes[var10] == 0) {
					this.transform(var6.transformTypes[var10], var6.labels[var10], var5.transformXs[var9], var5.transformYs[var9], var5.transformZs[var9]);
				}
			}

		}
	}

	@ObfuscatedName("ah")
	@Export("transform")
	void transform(int var1, int[] var2, int var3, int var4, int var5) {
		int var6 = var2.length;
		int var7;
		int var8;
		int var11;
		int var12;
		if (var1 == 0) {
			var7 = 0;
			Model_transformTempX = 0;
			Model_transformTempY = 0;
			Model_transformTempZ = 0;

			for (var8 = 0; var8 < var6; ++var8) {
				int var18 = var2[var8];
				if (var18 < this.vertexLabels.length) {
					int[] var19 = this.vertexLabels[var18];

					for (var11 = 0; var11 < var19.length; ++var11) {
						var12 = var19[var11];
						Model_transformTempX += this.verticesX[var12];
						Model_transformTempY += this.verticesY[var12];
						Model_transformTempZ += this.verticesZ[var12];
						++var7;
					}
				}
			}

			if (var7 > 0) {
				Model_transformTempX = var3 + Model_transformTempX / var7;
				Model_transformTempY = var4 + Model_transformTempY / var7;
				Model_transformTempZ = var5 + Model_transformTempZ / var7;
			} else {
				Model_transformTempX = var3;
				Model_transformTempY = var4;
				Model_transformTempZ = var5;
			}

		} else {
			int[] var9;
			int var10;
			int[] var10000;
			if (var1 == 1) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.vertexLabels.length) {
						var9 = this.vertexLabels[var8];

						for (var10 = 0; var10 < var9.length; ++var10) {
							var11 = var9[var10];
							var10000 = this.verticesX;
							var10000[var11] += var3;
							var10000 = this.verticesY;
							var10000[var11] += var4;
							var10000 = this.verticesZ;
							var10000[var11] += var5;
						}
					}
				}

			} else if (var1 == 2) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.vertexLabels.length) {
						var9 = this.vertexLabels[var8];

						for (var10 = 0; var10 < var9.length; ++var10) {
							var11 = var9[var10];
							var10000 = this.verticesX;
							var10000[var11] -= Model_transformTempX;
							var10000 = this.verticesY;
							var10000[var11] -= Model_transformTempY;
							var10000 = this.verticesZ;
							var10000[var11] -= Model_transformTempZ;
							var12 = (var3 & 255) * 8;
							int var13 = (var4 & 255) * 8;
							int var14 = (var5 & 255) * 8;
							int var15;
							int var16;
							int var17;
							if (var14 != 0) {
								var15 = field2264[var14];
								var16 = field2285[var14];
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16;
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16;
								this.verticesX[var11] = var17;
							}

							if (var12 != 0) {
								var15 = field2264[var12];
								var16 = field2285[var12];
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16;
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16;
								this.verticesY[var11] = var17;
							}

							if (var13 != 0) {
								var15 = field2264[var13];
								var16 = field2285[var13];
								var17 = var15 * this.verticesZ[var11] + var16 * this.verticesX[var11] >> 16;
								this.verticesZ[var11] = var16 * this.verticesZ[var11] - var15 * this.verticesX[var11] >> 16;
								this.verticesX[var11] = var17;
							}

							var10000 = this.verticesX;
							var10000[var11] += Model_transformTempX;
							var10000 = this.verticesY;
							var10000[var11] += Model_transformTempY;
							var10000 = this.verticesZ;
							var10000[var11] += Model_transformTempZ;
						}
					}
				}

			} else if (var1 == 3) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.vertexLabels.length) {
						var9 = this.vertexLabels[var8];

						for (var10 = 0; var10 < var9.length; ++var10) {
							var11 = var9[var10];
							var10000 = this.verticesX;
							var10000[var11] -= Model_transformTempX;
							var10000 = this.verticesY;
							var10000[var11] -= Model_transformTempY;
							var10000 = this.verticesZ;
							var10000[var11] -= Model_transformTempZ;
							this.verticesX[var11] = var3 * this.verticesX[var11] / 128;
							this.verticesY[var11] = var4 * this.verticesY[var11] / 128;
							this.verticesZ[var11] = var5 * this.verticesZ[var11] / 128;
							var10000 = this.verticesX;
							var10000[var11] += Model_transformTempX;
							var10000 = this.verticesY;
							var10000[var11] += Model_transformTempY;
							var10000 = this.verticesZ;
							var10000[var11] += Model_transformTempZ;
						}
					}
				}

			} else if (var1 == 5) {
				if (this.faceLabelsAlpha != null && this.faceAlphas != null) {
					for (var7 = 0; var7 < var6; ++var7) {
						var8 = var2[var7];
						if (var8 < this.faceLabelsAlpha.length) {
							var9 = this.faceLabelsAlpha[var8];

							for (var10 = 0; var10 < var9.length; ++var10) {
								var11 = var9[var10];
								var12 = (this.faceAlphas[var11] & 255) + var3 * 8;
								if (var12 < 0) {
									var12 = 0;
								} else if (var12 > 255) {
									var12 = 255;
								}

								this.faceAlphas[var11] = (byte)var12;
							}
						}
					}
				}

			}
		}
	}

	@ObfuscatedName("az")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			int var2 = this.verticesX[var1];
			this.verticesX[var1] = this.verticesZ[var1];
			this.verticesZ[var1] = -var2;
		}

		this.resetBounds();
	}

	@ObfuscatedName("at")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			this.verticesX[var1] = -this.verticesX[var1];
			this.verticesZ[var1] = -this.verticesZ[var1];
		}

		this.resetBounds();
	}

	@ObfuscatedName("ab")
	@Export("rotateY270Ccw")
	public void rotateY270Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			int var2 = this.verticesZ[var1];
			this.verticesZ[var1] = this.verticesX[var1];
			this.verticesX[var1] = -var2;
		}

		this.resetBounds();
	}

	@ObfuscatedName("br")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = field2264[var1];
		int var3 = field2285[var1];

		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16;
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16;
			this.verticesY[var4] = var5;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bp")
	@Export("offsetBy")
	public void offsetBy(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			int[] var10000 = this.verticesX;
			var10000[var4] += var1;
			var10000 = this.verticesY;
			var10000[var4] += var2;
			var10000 = this.verticesZ;
			var10000[var4] += var3;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bz")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128;
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128;
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bb")
	@Export("drawFrustum")
	public final void drawFrustum(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.boundsType != 2) {
			this.method4399();
		}

		int var8 = Rasterizer3D.getClipMidX();
		int var9 = Rasterizer3D.getClipMidY();
		int var10 = field2264[var1];
		int var11 = field2285[var1];
		int var12 = field2264[var2];
		int var13 = field2285[var2];
		int var14 = field2264[var3];
		int var15 = field2285[var3];
		int var16 = field2264[var4];
		int var17 = field2285[var4];
		int var18 = var16 * var6 + var17 * var7 >> 16;

		for (int var19 = 0; var19 < this.verticesCount; ++var19) {
			int var20 = this.verticesX[var19];
			int var21 = this.verticesY[var19];
			int var22 = this.verticesZ[var19];
			int var23;
			if (var3 != 0) {
				var23 = var21 * var14 + var20 * var15 >> 16;
				var21 = var21 * var15 - var20 * var14 >> 16;
				var20 = var23;
			}

			if (var1 != 0) {
				var23 = var21 * var11 - var22 * var10 >> 16;
				var22 = var21 * var10 + var22 * var11 >> 16;
				var21 = var23;
			}

			if (var2 != 0) {
				var23 = var22 * var12 + var20 * var13 >> 16;
				var22 = var22 * var13 - var20 * var12 >> 16;
				var20 = var23;
			}

			var20 += var5;
			var21 += var6;
			var22 += var7;
			var23 = var21 * var17 - var22 * var16 >> 16;
			var22 = var21 * var16 + var22 * var17 >> 16;
			field2245[var19] = var22 - var18;
			modelViewportXs[var19] = var8 + var20 * Rasterizer3D.get3dZoom() / var22;
			modelViewportYs[var19] = var9 + var23 * Rasterizer3D.get3dZoom() / var22;
			field2231[var19] = class503.method9561(var22);
			if (this.faceTextures != null) {
				field2233[var19] = var20;
				field2234[var19] = var23;
				field2235[var19] = var22;
			}
		}

		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var25) {
		}

	}

	@ObfuscatedName("bl")
	@Export("drawOrtho")
	public final void drawOrtho(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.boundsType != 2) {
			this.method4399();
		}

		int var9 = Rasterizer3D.getClipMidX();
		int var10 = Rasterizer3D.getClipMidY();
		int var11 = field2264[var1];
		int var12 = field2285[var1];
		int var13 = field2264[var2];
		int var14 = field2285[var2];
		int var15 = field2264[var3];
		int var16 = field2285[var3];
		int var17 = field2264[var4];
		int var18 = field2285[var4];
		int var19 = var17 * var6 + var18 * var7 >> 16;

		for (int var20 = 0; var20 < this.verticesCount; ++var20) {
			int var21 = this.verticesX[var20];
			int var22 = this.verticesY[var20];
			int var23 = this.verticesZ[var20];
			int var24;
			if (var3 != 0) {
				var24 = var22 * var15 + var21 * var16 >> 16;
				var22 = var22 * var16 - var21 * var15 >> 16;
				var21 = var24;
			}

			if (var1 != 0) {
				var24 = var22 * var12 - var23 * var11 >> 16;
				var23 = var22 * var11 + var23 * var12 >> 16;
				var22 = var24;
			}

			if (var2 != 0) {
				var24 = var23 * var13 + var21 * var14 >> 16;
				var23 = var23 * var14 - var21 * var13 >> 16;
				var21 = var24;
			}

			var21 += var5;
			var22 += var6;
			var23 += var7;
			var24 = var22 * var18 - var23 * var17 >> 16;
			var23 = var22 * var17 + var23 * var18 >> 16;
			field2245[var20] = var23 - var19;
			modelViewportXs[var20] = var9 + var21 * Rasterizer3D.get3dZoom() / var8;
			modelViewportYs[var20] = var10 + var24 * Rasterizer3D.get3dZoom() / var8;
			field2231[var20] = class503.method9561(var8);
			if (this.faceTextures != null) {
				field2233[var20] = var21;
				field2234[var20] = var24;
				field2235[var20] = var23;
			}
		}

		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var26) {
		}

	}

	@ObfuscatedName("bw")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		if (this.boundsType != 1) {
			this.calculateBoundsCylinder();
		}

		this.calculateBoundingBox(var1);
		int var11 = var5 * var8 - var4 * var6 >> 16;
		int var12 = var2 * var7 + var3 * var11 >> 16;
		int var13 = var3 * this.xzRadius >> 16;
		int var14 = var12 + var13;
		if (var14 > 50 && var12 < AbstractRasterizer.method4001()) {
			int var15 = var8 * var4 + var5 * var6 >> 16;
			int var16 = (var15 - this.xzRadius) * Rasterizer3D.get3dZoom();
			if (var16 / var14 < Rasterizer3D.Rasterizer3D_clipMidY2()) {
				int var17 = (var15 + this.xzRadius) * Rasterizer3D.get3dZoom();
				if (var17 / var14 > Rasterizer3D.Rasterizer3D_clipMidX2()) {
					int var18 = var3 * var7 - var11 * var2 >> 16;
					int var19 = var2 * this.xzRadius >> 16;
					int var20 = (var3 * this.bottomY >> 16) + var19;
					int var21 = (var18 + var20) * Rasterizer3D.get3dZoom();
					if (var21 / var14 > Rasterizer3D.method3876()) {
						int var22 = (var3 * super.height >> 16) + var19;
						int var23 = (var18 - var22) * Rasterizer3D.get3dZoom();
						if (var23 / var14 < Rasterizer3D.method3875()) {
							int var24 = var13 + (var2 * super.height >> 16);
							boolean var25 = false;
							boolean var26 = false;
							if (var12 - var24 <= 50) {
								var26 = true;
							}

							boolean var27 = var26 || this.faceTextures != null;
							int var28 = Script.method2356();
							int var29 = class232.method5028();
							boolean var30 = ViewportMouse.ViewportMouse_isInViewport;
							boolean var32 = class241.method5142(var9);
							boolean var33 = false;
							int var43;
							int var49;
							int var50;
							if (var32 && var30) {
								boolean var34 = false;
								if (field2243) {
									boolean var37 = ViewportMouse.ViewportMouse_isInViewport;
									boolean var35;
									if (!var37) {
										var35 = false;
									} else {
										class376.method7548(var2, var3, var4, var5);
										var35 = class59.method1163(this, var1, var6, var7, var8);
									}

									var34 = var35;
								} else {
									var49 = var12 - var13;
									if (var49 <= 50) {
										var49 = 50;
									}

									if (var15 > 0) {
										var16 /= var14;
										var17 /= var49;
									} else {
										var17 /= var14;
										var16 /= var49;
									}

									if (var18 > 0) {
										var23 /= var14;
										var21 /= var49;
									} else {
										var21 /= var14;
										var23 /= var49;
									}

									var43 = var28 - Rasterizer3D.getClipMidX();
									var50 = var29 - Rasterizer3D.getClipMidY();
									if (var43 > var16 && var43 < var17 && var50 > var23 && var50 < var21) {
										var34 = true;
									}
								}

								if (var34) {
									if (this.isSingleTile) {
										ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var9;
									} else {
										var33 = true;
									}
								}
							}

							int var48 = Rasterizer3D.getClipMidX();
							var49 = Rasterizer3D.getClipMidY();
							var43 = 0;
							var50 = 0;
							if (var1 != 0) {
								var43 = field2264[var1];
								var50 = field2285[var1];
							}

							for (int var38 = 0; var38 < this.verticesCount; ++var38) {
								int var39 = this.verticesX[var38];
								int var40 = this.verticesY[var38];
								int var41 = this.verticesZ[var38];
								int var42;
								if (var1 != 0) {
									var42 = var41 * var43 + var39 * var50 >> 16;
									var41 = var41 * var50 - var39 * var43 >> 16;
									var39 = var42;
								}

								var39 += var6;
								var40 += var7;
								var41 += var8;
								var42 = var41 * var4 + var5 * var39 >> 16;
								var41 = var5 * var41 - var39 * var4 >> 16;
								var39 = var42;
								var42 = var3 * var40 - var41 * var2 >> 16;
								var41 = var40 * var2 + var3 * var41 >> 16;
								var25 |= this.method4421(var38, var39, var42, var41, var12, var48, var49, var27);
							}

							try {
								this.draw0(var25, var33, this.isSingleTile, var9);
							} catch (Exception var47) {
							}

						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bh")
	boolean method4421(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
		field2245[var1] = var4 - var5;
		if (var8) {
			field2233[var1] = var2;
			field2234[var1] = var3;
			field2235[var1] = var4;
		}

		if (var4 >= 50) {
			modelViewportXs[var1] = var6 + var2 * Rasterizer3D.get3dZoom() / var4;
			modelViewportYs[var1] = var7 + var3 * Rasterizer3D.get3dZoom() / var4;
			field2231[var1] = class503.method9561(var4);
			return false;
		} else {
			modelViewportXs[var1] = -5000;
			return true;
		}
	}

	@ObfuscatedName("ba")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 6000) {
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) {
				field2283[var6] = 0;
			}

			var6 = var3 ? 20 : 5;

			int var9;
			int var10;
			int var11;
			int var12;
			int var13;
			int var14;
			int var17;
			int var18;
			int var20;
			int var28;
			for (char var7 = 0; var7 < this.indicesCount; ++var7) {
				if (this.faceColors3[var7] != -2) {
					int var8 = this.indices1[var7];
					var9 = this.indices2[var7];
					var10 = this.indices3[var7];
					var11 = modelViewportXs[var8];
					var12 = modelViewportXs[var9];
					var13 = modelViewportXs[var10];
					int var29;
					if (!var1 || var11 != -5000 && var12 != -5000 && var13 != -5000) {
						if (var2) {
							var28 = modelViewportYs[var8];
							var29 = modelViewportYs[var9];
							var17 = modelViewportYs[var10];
							var18 = var6 + ViewportMouse.ViewportMouse_y;
							boolean var37;
							if (var18 < var28 && var18 < var29 && var18 < var17) {
								var37 = false;
							} else {
								var18 = ViewportMouse.ViewportMouse_y - var6;
								if (var18 > var28 && var18 > var29 && var18 > var17) {
									var37 = false;
								} else {
									var18 = var6 + ViewportMouse.ViewportMouse_x;
									if (var18 < var11 && var18 < var12 && var18 < var13) {
										var37 = false;
									} else {
										var18 = ViewportMouse.ViewportMouse_x - var6;
										if (var18 > var11 && var18 > var12 && var18 > var13) {
											var37 = false;
										} else {
											var37 = true;
										}
									}
								}
							}

							if (var37) {
								ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var4;
								var2 = false;
							}
						}

						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var13 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) {
							field2228[var7] = false;
							var14 = Rasterizer3D.method3870();
							if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= var14 && var12 <= var14 && var13 <= var14) {
								field2227[var7] = false;
							} else {
								field2227[var7] = true;
							}

							var28 = (field2245[var8] + field2245[var9] + field2245[var10]) / 3 + this.radius;
							field2237[var28][field2283[var28]++] = var7;
						}
					} else {
						var14 = field2233[var8];
						var28 = field2233[var9];
						var29 = field2233[var10];
						var17 = field2234[var8];
						var18 = field2234[var9];
						int var30 = field2234[var10];
						var20 = field2235[var8];
						int var21 = field2235[var9];
						int var22 = field2235[var10];
						var14 -= var28;
						var29 -= var28;
						var17 -= var18;
						var30 -= var18;
						var20 -= var21;
						var22 -= var21;
						int var23 = var17 * var22 - var20 * var30;
						int var24 = var20 * var29 - var14 * var22;
						int var25 = var14 * var30 - var17 * var29;
						if (var28 * var23 + var18 * var24 + var21 * var25 > 0) {
							field2228[var7] = true;
							int var26 = (field2245[var8] + field2245[var9] + field2245[var10]) / 3 + this.radius;
							field2237[var26][field2283[var26]++] = var7;
						}
					}
				}
			}

			boolean var33 = this.field2294 != null && this.field2294.method4575() && !Rasterizer3D.clips.field2344.method4575();
			short var34 = this.field2295;
			if (var33) {
				Rasterizer3D.clips.field2344.method4581(this.field2294);
			} else {
				this.field2295 = (short)this.indicesCount;
			}

			char[] var27;
			char var35;
			if (this.faceRenderPriorities == null) {
				for (var9 = this.diameter - 1; var9 >= 0; --var9) {
					var35 = field2283[var9];
					if (var35 > 0) {
						var27 = field2237[var9];

						for (var12 = 0; var12 < var35; ++var12) {
							this.drawFace(var27[var12]);
						}
					}
				}

				this.field2295 = var34;
				if (var33) {
					Rasterizer3D.clips.field2344.method4585();
				}

			} else {
				for (var9 = 0; var9 < 12; ++var9) {
					field2238[var9] = 0;
					field2242[var9] = 0;
				}

				for (var9 = this.diameter - 1; var9 >= 0; --var9) {
					var35 = field2283[var9];
					if (var35 > 0) {
						var27 = field2237[var9];

						for (var12 = 0; var12 < var35; ++var12) {
							char var36 = var27[var12];
							byte var38 = this.faceRenderPriorities[var36];
							var28 = field2238[var38]++;
							field2230[var38][var28] = var36;
							if (var38 < 10) {
								int[] var39 = field2242;
								var39[var38] += var9;
							} else if (var38 == 10) {
								field2265[var28] = var9;
							} else {
								field2241[var28] = var9;
							}
						}
					}
				}

				var9 = 0;
				if (field2238[1] > 0 || field2238[2] > 0) {
					var9 = (field2242[1] + field2242[2]) / (field2238[1] + field2238[2]);
				}

				var10 = 0;
				if (field2238[3] > 0 || field2238[4] > 0) {
					var10 = (field2242[3] + field2242[4]) / (field2238[3] + field2238[4]);
				}

				var11 = 0;
				if (field2238[6] > 0 || field2238[8] > 0) {
					var11 = (field2242[8] + field2242[6]) / (field2238[8] + field2238[6]);
				}

				var13 = 0;
				var14 = field2238[10];
				int[] var15 = field2230[10];
				int[] var16 = field2265;
				if (var13 == var14) {
					var13 = 0;
					var14 = field2238[11];
					var15 = field2230[11];
					var16 = field2241;
				}

				if (var13 < var14) {
					var12 = var16[var13];
				} else {
					var12 = -1000;
				}

				for (var17 = 0; var17 < 10; ++var17) {
					while (var17 == 0 && var12 > var9) {
						this.drawFace(var15[var13++]);
						if (var13 == var14 && var15 != field2230[11]) {
							var13 = 0;
							var14 = field2238[11];
							var15 = field2230[11];
							var16 = field2241;
						}

						if (var13 < var14) {
							var12 = var16[var13];
						} else {
							var12 = -1000;
						}
					}

					while (var17 == 3 && var12 > var10) {
						this.drawFace(var15[var13++]);
						if (var13 == var14 && var15 != field2230[11]) {
							var13 = 0;
							var14 = field2238[11];
							var15 = field2230[11];
							var16 = field2241;
						}

						if (var13 < var14) {
							var12 = var16[var13];
						} else {
							var12 = -1000;
						}
					}

					while (var17 == 5 && var12 > var11) {
						this.drawFace(var15[var13++]);
						if (var13 == var14 && var15 != field2230[11]) {
							var13 = 0;
							var14 = field2238[11];
							var15 = field2230[11];
							var16 = field2241;
						}

						if (var13 < var14) {
							var12 = var16[var13];
						} else {
							var12 = -1000;
						}
					}

					var18 = field2238[var17];
					int[] var19 = field2230[var17];

					for (var20 = 0; var20 < var18; ++var20) {
						this.drawFace(var19[var20]);
					}
				}

				while (var12 != -1000) {
					this.drawFace(var15[var13++]);
					if (var13 == var14 && var15 != field2230[11]) {
						var13 = 0;
						var15 = field2230[11];
						var14 = field2238[11];
						var16 = field2241;
					}

					if (var13 < var14) {
						var12 = var16[var13];
					} else {
						var12 = -1000;
					}
				}

				this.field2295 = var34;
				if (var33) {
					Rasterizer3D.clips.field2344.method4585();
				}

			}
		}
	}

	@ObfuscatedName("bk")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field2228[var1]) {
			this.method4426(var1);
		} else {
			int var2 = this.indices1[var1];
			int var3 = this.indices2[var1];
			int var4 = this.indices3[var1];
			Rasterizer3D.clips.clipping = field2227[var1];
			if (this.faceAlphas == null) {
				Rasterizer3D.clips.currentFaceAlpha = 0;
			} else {
				Rasterizer3D.clips.currentFaceAlpha = (this.faceAlphas[var1] == -1 ? 253 : this.faceAlphas[var1]) & 255;
			}

			this.method4425(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], field2231[var2], field2231[var3], field2231[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]);
		}
	}

	@ObfuscatedName("bd")
	boolean method4424(int var1) {
		return var1 < this.field2295;
	}

	@ObfuscatedName("bu")
	final void method4425(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
		if (this.faceTextures != null && this.faceTextures[var1] != -1) {
			int var15;
			int var16;
			int var18;
			if (this.textureFaces != null && this.textureFaces[var1] != -1) {
				int var17 = this.textureFaces[var1] & 255;
				var18 = this.texIndices1[var17];
				var15 = this.texIndices2[var17];
				var16 = this.texIndices3[var17];
			} else {
				var18 = this.indices1[var1];
				var15 = this.indices2[var1];
				var16 = this.indices3[var1];
			}

			if (this.faceColors3[var1] == -1) {
				Rasterizer3D.rasterTextureWithShadingAndLighting(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field2233[var18], field2233[var15], field2233[var16], field2234[var18], field2234[var15], field2234[var16], field2235[var18], field2235[var15], field2235[var16], this.faceTextures[var1]);
			} else {
				Rasterizer3D.rasterTextureWithShadingAndLighting(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field2233[var18], field2233[var15], field2233[var16], field2234[var18], field2234[var15], field2234[var16], field2235[var18], field2235[var15], field2235[var16], this.faceTextures[var1]);
			}
		} else {
			boolean var14 = this.method4424(var1);
			if (this.faceColors3[var1] == -1 && var14) {
				Rasterizer3D.rasterTriangle(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2292[this.faceColors1[var1]]);
			} else if (this.faceColors3[var1] == -1) {
				Rasterizer3D.rasterFlat(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2292[this.faceColors1[var1]]);
			} else if (var14) {
				Rasterizer3D.rasterTriangleWithGradient(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
			} else {
				Rasterizer3D.rasterGouraud(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
			}
		}

	}

	@ObfuscatedName("bc")
	final void method4426(int var1) {
		int var2 = Rasterizer3D.getClipMidX();
		int var3 = Rasterizer3D.getClipMidY();
		int var4 = 0;
		int var5 = this.indices1[var1];
		int var6 = this.indices2[var1];
		int var7 = this.indices3[var1];
		int var8 = field2235[var5];
		int var9 = field2235[var6];
		int var10 = field2235[var7];
		if (this.faceAlphas == null) {
			Rasterizer3D.clips.currentFaceAlpha = 0;
		} else {
			Rasterizer3D.clips.currentFaceAlpha = this.faceAlphas[var1] & 255;
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) {
			field2256[var4] = modelViewportXs[var5];
			field2290[var4] = modelViewportYs[var5];
			field2259[var4] = field2231[var7];
			field2258[var4++] = this.faceColors1[var1];
		} else {
			var11 = field2233[var5];
			var12 = field2234[var5];
			var13 = this.faceColors1[var1];
			if (var10 >= 50) {
				var14 = field2247[var10 - var8] * (50 - var8);
				field2256[var4] = var2 + (var11 + ((field2233[var7] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2290[var4] = var3 + (var12 + ((field2234[var7] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2259[var4] = field2223;
				field2258[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}

			if (var9 >= 50) {
				var14 = field2247[var9 - var8] * (50 - var8);
				field2256[var4] = var2 + (var11 + ((field2233[var6] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2290[var4] = var3 + (var12 + ((field2234[var6] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2259[var4] = field2223;
				field2258[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}
		}

		if (var9 >= 50) {
			field2256[var4] = modelViewportXs[var6];
			field2290[var4] = modelViewportYs[var6];
			field2259[var4] = field2231[var7];
			field2258[var4++] = this.faceColors2[var1];
		} else {
			var11 = field2233[var6];
			var12 = field2234[var6];
			var13 = this.faceColors2[var1];
			if (var8 >= 50) {
				var14 = field2247[var8 - var9] * (50 - var9);
				field2256[var4] = var2 + (var11 + ((field2233[var5] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2290[var4] = var3 + (var12 + ((field2234[var5] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2259[var4] = field2223;
				field2258[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}

			if (var10 >= 50) {
				var14 = field2247[var10 - var9] * (50 - var9);
				field2256[var4] = var2 + (var11 + ((field2233[var7] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2290[var4] = var3 + (var12 + ((field2234[var7] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2258[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}
		}

		if (var10 >= 50) {
			field2256[var4] = modelViewportXs[var7];
			field2290[var4] = modelViewportYs[var7];
			field2259[var4] = field2231[var7];
			field2258[var4++] = this.faceColors3[var1];
		} else {
			var11 = field2233[var7];
			var12 = field2234[var7];
			var13 = this.faceColors3[var1];
			if (var9 >= 50) {
				var14 = field2247[var9 - var10] * (50 - var10);
				field2256[var4] = var2 + (var11 + ((field2233[var6] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2290[var4] = var3 + (var12 + ((field2234[var6] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2259[var4] = field2223;
				field2258[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}

			if (var8 >= 50) {
				var14 = field2247[var8 - var10] * (50 - var10);
				field2256[var4] = var2 + (var11 + ((field2233[var5] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2290[var4] = var3 + (var12 + ((field2234[var5] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2259[var4] = field2223;
				field2258[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}
		}

		var11 = field2256[0];
		var12 = field2256[1];
		var13 = field2256[2];
		var14 = field2290[0];
		int var15 = field2290[1];
		int var16 = field2290[2];
		float var17 = field2259[0];
		float var18 = field2259[1];
		float var19 = field2259[2];
		Rasterizer3D.clips.clipping = false;
		int var20 = Rasterizer3D.method3870();
		if (var4 == 3) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) {
				Rasterizer3D.clips.clipping = true;
			}

			this.method4425(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, field2258[0], field2258[1], field2258[2]);
		}

		if (var4 == 4) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || field2256[3] < 0 || field2256[3] > var20) {
				Rasterizer3D.clips.clipping = true;
			}

			int var22;
			if (this.faceTextures != null && this.faceTextures[var1] != -1) {
				int var23;
				int var25;
				if (this.textureFaces != null && this.textureFaces[var1] != -1) {
					int var24 = this.textureFaces[var1] & 255;
					var25 = this.texIndices1[var24];
					var22 = this.texIndices2[var24];
					var23 = this.texIndices3[var24];
				} else {
					var25 = var5;
					var22 = var6;
					var23 = var7;
				}

				short var26 = this.faceTextures[var1];
				if (this.faceColors3[var1] == -1) {
					Rasterizer3D.rasterTextureWithShadingAndLighting(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2233[var25], field2233[var22], field2233[var23], field2234[var25], field2234[var22], field2234[var23], field2235[var25], field2235[var22], field2235[var23], var26);
					Rasterizer3D.rasterTextureWithShadingAndLighting(var14, var16, field2290[3], var11, var13, field2256[3], var17, var19, field2259[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2233[var25], field2233[var22], field2233[var23], field2234[var25], field2234[var22], field2234[var23], field2235[var25], field2235[var22], field2235[var23], var26);
				} else {
					Rasterizer3D.rasterTextureWithShadingAndLighting(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2258[0], field2258[1], field2258[2], field2233[var25], field2233[var22], field2233[var23], field2234[var25], field2234[var22], field2234[var23], field2235[var25], field2235[var22], field2235[var23], var26);
					Rasterizer3D.rasterTextureWithShadingAndLighting(var14, var16, field2290[3], var11, var13, field2256[3], var17, var19, field2259[3], field2258[0], field2258[2], field2258[3], field2233[var25], field2233[var22], field2233[var23], field2234[var25], field2234[var22], field2234[var23], field2235[var25], field2235[var22], field2235[var23], var26);
				}
			} else {
				boolean var21 = this.method4424(var1);
				if (this.faceColors3[var1] == -1 && var21) {
					var22 = field2292[this.faceColors1[var1]];
					Rasterizer3D.rasterTriangle(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22);
					Rasterizer3D.rasterTriangle(var14, var16, field2290[3], var11, var13, field2256[3], var17, var19, field2259[3], var22);
				} else if (this.faceColors3[var1] == -1) {
					var22 = field2292[this.faceColors1[var1]];
					Rasterizer3D.rasterFlat(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22);
					Rasterizer3D.rasterFlat(var14, var16, field2290[3], var11, var13, field2256[3], var17, var19, field2259[3], var22);
				} else if (var21) {
					Rasterizer3D.rasterTriangleWithGradient(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2258[0], field2258[1], field2258[2]);
					Rasterizer3D.rasterTriangleWithGradient(var14, var16, field2290[3], var11, var13, field2256[3], 0.0F, 0.0F, 0.0F, field2258[0], field2258[2], field2258[3]);
				} else {
					Rasterizer3D.rasterGouraud(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2258[0], field2258[1], field2258[2]);
					Rasterizer3D.rasterGouraud(var14, var16, field2290[3], var11, var13, field2256[3], var17, var19, field2259[3], field2258[0], field2258[2], field2258[3]);
				}
			}
		}

	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ILrm;)V"
	)
	void method4395(int var1, TransformationMatrix var2) {
		float var3 = (float)this.verticesX[var1];
		float var4 = (float)(-this.verticesY[var1]);
		float var5 = (float)(-this.verticesZ[var1]);
		float var6 = 1.0F;
		this.verticesX[var1] = (int)(var2.field4936[0] * var3 + var2.field4936[4] * var4 + var2.field4936[8] * var5 + var2.field4936[12] * var6);
		this.verticesY[var1] = -((int)(var2.field4936[1] * var3 + var2.field4936[5] * var4 + var2.field4936[9] * var5 + var2.field4936[13] * var6));
		this.verticesZ[var1] = -((int)(var2.field4936[2] * var3 + var2.field4936[6] * var4 + var2.field4936[10] * var5 + var2.field4936[14] * var6));
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lhs;I)V"
	)
	void method4387(class182 var1, int var2) {
		if (this.field2222 != null) {
			for (int var3 = 0; var3 < this.verticesCount; ++var3) {
				int[] var4 = this.field2222[var3];
				if (var4 != null && var4.length != 0) {
					int[] var5 = this.field2244[var3];
					field2253.method8429();

					for (int var6 = 0; var6 < var4.length; ++var6) {
						int var7 = var4[var6];
						class132 var8 = var1.method3995(var7);
						if (var8 != null) {
							field2257.method8431((float)var5[var6] / 255.0F);
							field2255.method8430(var8.method3273(var2));
							field2255.method8450(field2257);
							field2253.method8433(field2255);
						}
					}

					this.method4395(var3, field2253);
				}
			}

		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lhv;S)V"
	)
	public void method4491(ModelColorOverride var1, short var2) {
		if (this.field2294 == null) {
			this.field2294 = new ModelColorOverride();
		}

		this.field2294.method4581(var1);
		this.field2295 = var2;
	}

	@ObfuscatedName("bv")
	public void method4442() {
		this.field2294 = null;
	}

	@ObfuscatedName("ep")
	void vmethod4418(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		int var15 = Rasterizer3D.Rasterizer3D_sine[var2];
		int var16 = Rasterizer3D.Rasterizer3D_cosine[var2];
		int var17 = Rasterizer3D.Rasterizer3D_sine[var3];
		int var18 = Rasterizer3D.Rasterizer3D_cosine[var3];
		this.draw(var1, var15, var16, var17, var18, var4 - var7, var5 - var8, var6 - var9, var10);
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(ILrm;IIIJ)V"
	)
	@Export("draw")
	void draw(int var1, TransformationMatrix var2, int var3, int var4, int var5, long var6) {
		if (this.boundsType != 1) {
			this.calculateBoundsCylinder();
		}

		this.calculateBoundingBox(var1);
		class438 var8 = new class438();
		var8.field4899.method8399((float)var1 * 0.0030679614F, 0.0F, 0.0F);
		var8.field4902.method8340(1.0F, 1.0F, 1.0F);
		var8.field4900.method8340((float)var3, (float)var4, (float)var5);
		TransformationMatrix var9 = class331.method6572();
		var9.method8435(var8);
		var9.method8450(var2);
		int var10 = (int)var9.method8445(0.0F, 0.0F, 0.0F);
		boolean var11 = false;
		int var12 = var10 - this.radius;
		boolean var13 = var12 <= 50 || this.faceTextures != null;
		boolean var14 = class241.method5142(var6);
		boolean var15 = false;
		if (var14) {
			boolean var16 = ViewportMouse.ViewportMouse_isInViewport;
			if (var16) {
				boolean var19 = ViewportMouse.ViewportMouse_isInViewport;
				boolean var17;
				if (!var19) {
					var17 = false;
				} else {
					WorldMapSprite.method6347(var2);
					var17 = class59.method1163(this, var1, var3, var4, var5);
				}

				if (var17) {
					if (this.isSingleTile) {
						ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var6;
					} else {
						var15 = true;
					}
				}
			}
		}

		int var25 = Rasterizer3D.getClipMidX();
		int var26 = Rasterizer3D.getClipMidY();

		for (int var22 = 0; var22 < this.verticesCount; ++var22) {
			int var27 = this.verticesX[var22];
			int var23 = this.verticesY[var22];
			int var21 = this.verticesZ[var22];
			var9.transformPoint((float)var27, (float)var23, (float)var21, field2248);
			var27 = (int)field2248[0];
			var23 = (int)field2248[1];
			var21 = (int)field2248[2];
			var11 |= this.method4421(var22, var27, var23, var21, var10, var25, var26, var13);
		}

		var8.method8292();
		var9.method8500();

		try {
			this.draw0(var11, var15, this.isSingleTile, var6);
		} catch (Exception var24) {
		}

	}
}
