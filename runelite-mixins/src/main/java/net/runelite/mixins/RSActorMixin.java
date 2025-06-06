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

import com.google.common.collect.ImmutableSet;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.image.BufferedImage;
import java.util.Iterator;
import java.util.Set;
import net.runelite.api.Actor;
import net.runelite.api.ActorSpotAnim;
import net.runelite.api.Hitsplat;
import net.runelite.api.IterableHashTable;
import net.runelite.api.NPC;
import net.runelite.api.NPCComposition;
import net.runelite.api.NpcID;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.SpritePixels;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ActorDeath;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.GraphicChanged;
import net.runelite.api.events.HealthBarUpdated;
import net.runelite.api.events.HitsplatApplied;
import net.runelite.api.events.InteractingChanged;
import net.runelite.api.events.OverheadTextChanged;
import net.runelite.api.mixins.FieldHook;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.MethodHook;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSActor;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSHealthBarConfig;
import net.runelite.rs.api.RSHealthBarDefinition;
import net.runelite.rs.api.RSHealthBarUpdate;
import net.runelite.rs.api.RSIterableNodeDeque;
import net.runelite.rs.api.RSNPC;
import net.runelite.rs.api.RSNode;
import net.runelite.rs.api.RSWorldView;

@Mixin(RSActor.class)
public abstract class RSActorMixin implements RSActor
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	private static final Set<Integer> combatInfoFilter = ImmutableSet.of(0, 2, 16, 17, 18, 19, 20, 21, 22);

	@Inject
	private boolean dead;

	@Inject
	private Actor lastInteracting = null;

	@Inject
	@Override
	public boolean isInteracting()
	{
		return getRSInteracting() != -1;
	}

	@Inject
	@Override
	public Actor getInteracting()
	{
		try
		{
			int index = getRSInteracting();
			if (index == -1 || index == 65535 || index == 16777215)
			{
				return null;
			}

			RSWorldView wv = (RSWorldView) this.getWorldView();
			int var2 = 65536;
			if (index < var2)
			{
				return (Actor) wv.getRSNpcs().get(index);
			}

			index -= var2;
			return (Actor) wv.getRSPlayers().get(index);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			client.getLogger().error("", e);
			return null;
		}
	}

	@Inject
	@Override
	public Actor getLastInteracting()
	{
		return lastInteracting;
	}

	@Inject
	@Override
	public int getHealthRatio()
	{
		RSIterableNodeDeque healthBars = getHealthBars();
		if (healthBars != null)
		{
			RSNode current = healthBars.getCurrent();
			RSNode next = current.getNext();
			if (next instanceof RSHealthBarConfig)
			{
				RSHealthBarConfig wrapper = (RSHealthBarConfig) next;
				RSIterableNodeDeque updates = wrapper.getUpdates();

				RSNode currentUpdate = updates.getCurrent();
				RSNode nextUpdate = currentUpdate.getNext();
				if (nextUpdate instanceof RSHealthBarUpdate)
				{
					RSHealthBarUpdate update = (RSHealthBarUpdate) nextUpdate;
					return update.getHealthRatio();
				}
			}
		}
		return -1;
	}

	@Inject
	@Override
	public int getHealthScale()
	{
		RSIterableNodeDeque healthBars = getHealthBars();
		if (healthBars != null)
		{
			RSNode current = healthBars.getCurrent();
			RSNode next = current.getNext();
			if (next instanceof RSHealthBarConfig)
			{
				RSHealthBarConfig wrapper = (RSHealthBarConfig) next;
				RSHealthBarDefinition definition = wrapper.getDefinition();
				return definition.getHealthScale();
			}
		}
		return -1;
	}

	@Inject
	@Override
	public WorldPoint getWorldLocation()
	{
		return WorldPoint.fromLocal(client,
			this.getPathX()[0] * Perspective.LOCAL_TILE_SIZE + Perspective.LOCAL_TILE_SIZE / 2,
			this.getPathY()[0] * Perspective.LOCAL_TILE_SIZE + Perspective.LOCAL_TILE_SIZE / 2,
			client.getPlane());
	}

	@Inject
	@Override
	public LocalPoint getLocalLocation()
	{
		return new LocalPoint(getX(), getY());
	}

	@Inject
	@Override
	public Polygon getCanvasTilePoly()
	{
		return Perspective.getCanvasTilePoly(client, getLocalLocation());
	}

	@Inject
	@Override
	public Point getCanvasTextLocation(Graphics2D graphics, String text, int zOffset)
	{
		return Perspective.getCanvasTextLocation(client, graphics, getLocalLocation(), text, zOffset);
	}

	@Inject
	@Override
	public Point getCanvasImageLocation(BufferedImage image, int zOffset)
	{
		return Perspective.getCanvasImageLocation(client, getLocalLocation(), image, zOffset);
	}

	@Inject
	@Override
	public Point getCanvasSpriteLocation(SpritePixels spritePixels, int zOffset)
	{
		return Perspective.getCanvasSpriteLocation(client, getLocalLocation(), spritePixels, zOffset);
	}

	@Inject
	@Override
	public Point getMinimapLocation()
	{
		return Perspective.localToMinimap(client, getLocalLocation());
	}

	@FieldHook("sequence")
	@Inject
	public void animationChanged(int idx)
	{
		/*if (this instanceof RSNPC)
		{
			int id = ((RSNPC) this).getId();
			switch (id)
			{
				case 8615:
				case 8616:
				case 8617:
				case 8618:
				case 8619:
				case 8620:
				case 8621:
				case 8622:
					return;
			}
		}*/

		AnimationChanged animationChanged = new AnimationChanged();
		animationChanged.setActor(this);
		client.getCallbacks().post(animationChanged);
	}

	@MethodHook(value = "clearSpotAnimations", end = true)
	@Inject
	public void onGraphicCleared()
	{
		GraphicChanged graphicChanged = new GraphicChanged();
		graphicChanged.setActor(this);
		client.getCallbacks().post(graphicChanged);
	}

	@MethodHook(value = "updateSpotAnimation", end = true)
	@Inject
	public void onGraphicChanged(int idx, int graphicID, int graphicHeight, int graphicStartCycle)
	{
		GraphicChanged graphicChanged = new GraphicChanged();
		graphicChanged.setActor(this);
		client.getCallbacks().post(graphicChanged);
	}

	@Inject
	@Override
	public void createSpotAnim(int id, int spotAnimId, int height, int delay)
	{
		IterableHashTable<ActorSpotAnim> spotAnims = this.getSpotAnims();
		ActorSpotAnim actorSpotAnim = (ActorSpotAnim) spotAnims.get((long) id);
		if (actorSpotAnim != null)
		{
			actorSpotAnim.unlink();
			this.setGraphicsCount(getGraphicsCount() - 1);
		}

		if (spotAnimId != -1)
		{
			byte frame = 0;
			if (delay > 0)
			{
				frame = -1;
			}

			spotAnims.put(newActorSpotAnim(spotAnimId, height, client.getGameCycle() + delay, frame), (long) id);
			this.setGraphicsCount(getGraphicsCount() + 1);
		}
	}

	@Inject
	@Override
	public boolean hasSpotAnim(int spotAnimId)
	{
		Iterator<ActorSpotAnim> iter = this.getSpotAnims().iterator();
		while (iter.hasNext())
		{
			ActorSpotAnim actorSpotAnim = (ActorSpotAnim) iter.next();
			if (actorSpotAnim.getId() == spotAnimId)
			{
				return true;
			}
		}
		return false;
	}

	@Inject
	@Override
	public void removeSpotAnim(int id)
	{
		ActorSpotAnim actorSpotAnim = (ActorSpotAnim) this.getSpotAnims().get(id);
		if (actorSpotAnim != null)
		{
			actorSpotAnim.unlink();
			this.setGraphicsCount(getGraphicsCount() - 1);
		}
	}

	@Inject
	@Override
	public void clearSpotAnims()
	{
		this.getSpotAnims().clear();
		this.setGraphicsCount(0);
	}

	@FieldHook("targetIndex")
	@Inject
	public void interactingChanged(int idx)
	{
		Actor interacting = getInteracting();
		if (interacting != null)
		{
			lastInteracting = interacting;
		}
		InteractingChanged interactingChanged = new InteractingChanged(this, getInteracting());
		client.getCallbacks().post(interactingChanged);
	}

	@FieldHook("overheadText")
	@Inject
	public void overheadTextChanged(int idx)
	{
		String overheadText = getOverheadText();
		if (overheadText != null)
		{
			OverheadTextChanged overheadTextChanged = new OverheadTextChanged(this, overheadText);
			client.getCallbacks().post(overheadTextChanged);
		}
	}

	@Inject
	@Override
	public WorldArea getWorldArea()
	{
		int size = 1;
		if (this instanceof NPC)
		{
			NPCComposition composition = ((NPC) this).getComposition();
			if (composition != null && composition.getConfigs() != null)
			{
				composition = composition.transform();
			}
			if (composition != null)
			{
				size = composition.getSize();
			}
		}

		return new WorldArea(this.getWorldLocation(), size, size);
	}

	@Inject
	@Override
	public boolean isDead()
	{
		return dead;
	}

	@Inject
	@Override
	public void setDead(boolean dead)
	{
		this.dead = dead;
	}

	@Inject
	@MethodHook("addHealthBar")
	public void setCombatInfo(int combatInfoId, int gameCycle, int var3, int var4, int healthRatio, int health)
	{
		final HealthBarUpdated event = new HealthBarUpdated(this, healthRatio);
		client.getCallbacks().post(event);

		if (healthRatio == 0)
		{
			if (isDead())
			{
				return;
			}

			if (!combatInfoFilter.contains(combatInfoId))
			{
				return;
			}

			setDead(true);

			final ActorDeath actorDeath = new ActorDeath(this);
			client.getCallbacks().post(actorDeath);
		}
		else if (healthRatio > 0)
		{
			if (this instanceof RSNPC && ((RSNPC) this).getId() == NpcID.CORPOREAL_BEAST && isDead())
			{
				return;
			}

			setDead(false);
		}
	}

	/**
	 * Called after a hitsplat has been processed on an actor.
	 * Note that this event runs even if the hitsplat didn't show up,
	 * i.e. the actor already had 4 visible hitsplats.
	 *
	 * @param type The hitsplat type (i.e. color)
	 * @param value The value of the hitsplat (i.e. how high the hit was)
	 * @param var3 unknown
	 * @param var4 unknown
	 * @param gameCycle The gamecycle the hitsplat was applied on
	 * @param duration The amount of gamecycles the hitsplat will last for
	 */
	@Inject
	@MethodHook(value = "addHitSplat", end = true)
	public void applyActorHitsplat(int type, int value, int var3, int var4, int gameCycle, int duration)
	{
		final Hitsplat hitsplat = new Hitsplat(type, value, gameCycle + duration);
		final HitsplatApplied event = new HitsplatApplied();
		event.setActor(this);
		event.setHitsplat(hitsplat);
		client.getCallbacks().post(event);
	}

	@Inject
	@Override
	public boolean isMoving()
	{
		return getPathLength() > 0;
	}

	@Inject
	@Override
	public int getGraphic()
	{
		Iterator iter = this.getSpotAnims().iterator();
		if (iter.hasNext())
		{
			ActorSpotAnim actorSpotAnim = (ActorSpotAnim) iter.next();
			return actorSpotAnim.getId();
		}
		else
		{
			return -1;
		}
	}

	@Inject
	@Override
	public void setGraphic(int id)
	{
		if (id == -1)
		{
			this.getSpotAnims().clear();
			this.setGraphicsCount(0);
		}
		else
		{
			Iterator iter = this.getSpotAnims().iterator();
			if (iter.hasNext())
			{
				ActorSpotAnim var3 = (ActorSpotAnim) iter.next();
				var3.setId(id);
			}
			else
			{
				ActorSpotAnim actorSpotAnim = this.newActorSpotAnim(id, 0, 0, 0);
				this.getSpotAnims().put(actorSpotAnim, 0L);
				this.setGraphicsCount(getGraphicsCount() + 1);
			}
		}
	}

	@Inject
	@Override
	public int getGraphicHeight()
	{
		Iterator iter = this.getSpotAnims().iterator();
		if (iter.hasNext())
		{
			ActorSpotAnim actorSpotAnim = (ActorSpotAnim) iter.next();
			return actorSpotAnim.getHeight();
		}
		else
		{
			return 0;
		}
	}

	@Inject
	@Override
	public void setGraphicHeight(int height)
	{
		Iterator iter = this.getSpotAnims().iterator();
		if (iter.hasNext())
		{
			ActorSpotAnim actorSpotAnim = (ActorSpotAnim) iter.next();
			actorSpotAnim.setHeight(height);
		}
	}

	@Inject
	@Override
	public int getSpotAnimFrame()
	{
		Iterator iter = this.getSpotAnims().iterator();
		if (iter.hasNext())
		{
			ActorSpotAnim actorSpotAnim = (ActorSpotAnim) iter.next();
			return actorSpotAnim.getFrame();
		}
		else
		{
			return 0;
		}
	}

	@Inject
	@Override
	public void setSpotAnimFrame(int id)
	{
		Iterator iter = this.getSpotAnims().iterator();
		if (iter.hasNext())
		{
			ActorSpotAnim actorSpotAnim = (ActorSpotAnim) iter.next();
			actorSpotAnim.setFrame(id);
		}
	}

	@Inject
	@Override
	public int getSpotAnimationFrameCycle()
	{
		Iterator iter = this.getSpotAnims().iterator();
		if (iter.hasNext())
		{
			ActorSpotAnim actorSpotAnim = (ActorSpotAnim) iter.next();
			return actorSpotAnim.getCycle();
		}
		else
		{
			return 0;
		}
	}

	@Inject
	@Override
	public int getAnimation()
	{
		int animation = getRSAnimation();
		switch (animation)
		{
			/*case 7592:
			case 7593:
			case 7949:
			case 7950:
			case 7951:
			case 7952:
			case 7957:
			case 7960:
			case 8059:
			case 8123:
			case 8124:
			case 8125:
			case 8126:
			case 8127:
			case 8234:
			case 8235:
			case 8236:
			case 8237:
			case 8238:
			case 8241:
			case 8242:
			case 8243:
			case 8244:
			case 8245:
			case 8248:
			case 8249:
			case 8250:
			case 8251:
			case 8252:
			case 8255:
			case 8256:
			case 8257:
			case 8258:
				return -1;*/
			default:
				return animation;
		}
	}
}
