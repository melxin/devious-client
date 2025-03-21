/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.mixins;

import java.awt.Polygon;
import java.awt.Shape;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.api.ActorSpotAnim;
import net.runelite.api.HeadIcon;
import net.runelite.api.Model;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.OverheadPrayerChanged;
import net.runelite.api.events.PlayerChanged;
import net.runelite.api.events.PlayerCompositionChanged;
import net.runelite.api.events.PlayerSkullChanged;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.FieldHook;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.MethodHook;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSBuffer;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSModel;
import net.runelite.rs.api.RSPlayer;
import net.runelite.rs.api.RSUsername;

@Mixin(RSPlayer.class)
public abstract class RSPlayerMixin implements RSPlayer
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	private boolean friended;

	@Inject
	private int oldHeadIcon = -2;

	@Inject
	private int oldSkullIcon = -2;

	@Inject
	@Override
	public int getPlayerId()
	{
		return this.getId();
	}

	@Inject
	@Override
	public String getName()
	{
		final RSUsername rsName = getRsName();

		if (rsName == null)
		{
			return null;
		}

		String name = rsName.getName();

		if (name == null)
		{
			return null;
		}

		return name.replace('\u00A0', ' ');
	}

	@Inject
	@FieldHook("headIconPrayer")
	public void prayerChanged(int idx)
	{
		if (getRsOverheadIcon() != oldHeadIcon)
		{
			final HeadIcon headIcon = getHeadIcon(getRsOverheadIcon());
			client.getCallbacks().post(
				new OverheadPrayerChanged(this, getHeadIcon(oldHeadIcon), headIcon));
		}
		oldHeadIcon = getRsOverheadIcon();
	}

	/*@Inject
	@Override
	public HeadIcon getOverheadIcon()
	{
		return getHeadIcon(getRsOverheadIcon());
	}*/

	@Inject
	@Override
	public HeadIcon getOverheadIcon()
	{
		switch (this.getRsOverheadIcon())
		{
			case 0:
				return HeadIcon.MELEE;
			case 1:
				return HeadIcon.RANGED;
			case 2:
				return HeadIcon.MAGIC;
			case 3:
				return HeadIcon.RETRIBUTION;
			case 4:
				return HeadIcon.SMITE;
			case 5:
				return HeadIcon.REDEMPTION;
			case 6:
				return HeadIcon.RANGE_MAGE;
			case 7:
				return HeadIcon.RANGE_MELEE;
			case 8:
				return HeadIcon.MAGE_MELEE;
			case 9:
				return HeadIcon.RANGE_MAGE_MELEE;
			case 10:
				return HeadIcon.WRATH;
			case 11:
				return HeadIcon.SOUL_SPLIT;
			case 12:
				return HeadIcon.DEFLECT_MELEE;
			case 13:
				return HeadIcon.DEFLECT_RANGE;
			case 14:
				return HeadIcon.DEFLECT_MAGE;
			default:
				return null;
		}
	}

	@Inject
	@FieldHook("headIconPk")
	public void skullChanged(int idx)
	{
		final int skullIcon = getRsSkullIcon();
		if (skullIcon != oldSkullIcon)
		{
			client.getCallbacks().post(
				new PlayerSkullChanged(this, oldSkullIcon, skullIcon));
		}
		oldSkullIcon = skullIcon;
	}

	@Inject
	@Override
	public int getSkullIcon()
	{
		return this.getRsSkullIcon();
	}

	@Inject
	@Override
	public void setSkullIcon(int skullIcon)
	{
		this.setRsSkullIcon(skullIcon);
	}

	@Inject
	private HeadIcon getHeadIcon(int overheadIcon)
	{
		if (overheadIcon == -1)
		{
			return null;
		}

		return HeadIcon.values()[overheadIcon];
	}

	@Inject
	@Override
	public Polygon[] getPolygons()
	{
		Model model = getModel();

		if (model == null)
		{
			return null;
		}

		int[] x2d = new int[model.getVerticesCount()];
		int[] y2d = new int[model.getVerticesCount()];

		int localX = getX();
		int localY = getY();

		final int tileHeight = Perspective.getTileHeight(client, new LocalPoint(localX, localY), client.getPlane());

		Perspective.modelToCanvas(client, model.getVerticesCount(), localX, localY, tileHeight, getCurrentOrientation(), model.getVerticesX(), model.getVerticesZ(), model.getVerticesY(), x2d, y2d);
		ArrayList polys = new ArrayList(model.getFaceCount());

		int[] trianglesX = model.getFaceIndices1();
		int[] trianglesY = model.getFaceIndices2();
		int[] trianglesZ = model.getFaceIndices3();

		for (int triangle = 0; triangle < model.getFaceCount(); ++triangle)
		{
			int[] xx =
				{
					x2d[trianglesX[triangle]], x2d[trianglesY[triangle]], x2d[trianglesZ[triangle]]
				};

			int[] yy =
				{
					y2d[trianglesX[triangle]], y2d[trianglesY[triangle]], y2d[trianglesZ[triangle]]
				};

			polys.add(new Polygon(xx, yy, 3));
		}

		return (Polygon[]) polys.toArray(new Polygon[0]);
	}

	@Inject
	@Override
	public Shape getConvexHull()
	{
		RSModel model = getModel();
		if (model == null)
		{
			return null;
		}

		int tileHeight = Perspective.getTileHeight(client, new LocalPoint(getX(), getY()), client.getPlane());

		return model.getConvexHull(getX(), getY(), getCurrentOrientation(), tileHeight);
	}

	@SuppressWarnings("InfiniteRecursion")
	@Copy("getModel")
	@Replace("getModel")
	public RSModel copy$getModel()
	{
		if (client.getAnimationInterpolationFilter() == null || !client.getAnimationInterpolationFilter().test(this.getAnimation()))
		{
			return copy$getModel();
		}
		int actionFrame = getActionFrame();
		int poseFrame = getPoseFrame();
		int spotAnimFrame = getSpotAnimFrame();
		try
		{
			// combine the frames with the frame cycle so we can access this information in the sequence methods
			// without having to change method calls
			setActionFrame(Integer.MIN_VALUE | Math.max(getActionFrameCycle() - 1, 0) << 16 | actionFrame);
			setPoseFrame(Integer.MIN_VALUE | Math.max(getPoseFrameCycle() - 1, 0) << 16 | poseFrame);
			setSpotAnimFrame(Integer.MIN_VALUE | Math.max(getSpotAnimationFrameCycle() - 1, 0) << 16 | spotAnimFrame);
			Iterator iter = getSpotAnims().iterator();
			while (iter.hasNext())
			{
				ActorSpotAnim actorSpotAnim = (ActorSpotAnim) iter.next();
				int frame = actorSpotAnim.getFrame();
				if (frame != -1)
				{
					actorSpotAnim.setFrame(Integer.MIN_VALUE | Math.max(actorSpotAnim.getCycle() - 1, 0) << 16 | frame);
				}
			}
			return copy$getModel();
		}
		finally
		{
			// reset frames
			setActionFrame(actionFrame);
			setPoseFrame(poseFrame);
			setSpotAnimFrame(spotAnimFrame);
			Iterator iter = getSpotAnims().iterator();
			while (iter.hasNext())
			{
				ActorSpotAnim actorSpotAnim = (ActorSpotAnim) iter.next();
				int frame = actorSpotAnim.getFrame();
				if (frame != -1)
				{
					actorSpotAnim.setFrame(frame & '\uFFFF');
				}
			}
		}
	}

	@Inject
	public boolean isFriended()
	{
		return isFriend() || friended;
	}

	@Inject
	@MethodHook(value = "checkIsFriend", end = true)
	void updateFriended()
	{
		friended = client.getFriendManager().isFriended(getRsName(), false);
	}

	@Inject
	@MethodHook(value = "read", end = true)
	void postRead(RSBuffer var1)
	{
		client.getCallbacks().post(new PlayerChanged(this));
	}

	@Copy("read")
	@Replace("read")
	@SuppressWarnings("InfiniteRecursion")
	public void copy$read(RSBuffer buffer)
	{
		final long appearanceHash = getPlayerComposition() == null ? 0 : getPlayerComposition().getHash();

		this.copy$read(buffer);

		if (client.isComparingAppearance() && getPlayerComposition().getHash() != appearanceHash)
		{
			client.getCallbacks().post(new PlayerCompositionChanged(this));
		}
	}
}
