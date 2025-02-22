package net.runelite.mixins;

import net.runelite.api.Actor;
import net.runelite.api.IndexedObjectSet;
import net.runelite.api.NPC;
import net.runelite.api.Perspective;
import net.runelite.api.Player;
import net.runelite.api.Projectile;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSIndexedObjectSet;
import net.runelite.rs.api.RSProjectile;
import net.runelite.rs.api.RSScene;
import net.runelite.rs.api.RSTile;
import net.runelite.rs.api.RSWorldView;

@Mixin(RSWorldView.class)
public abstract class RSWorldViewMixin implements RSWorldView
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	@Override
	public boolean isTopLevel()
	{
		return getId() == -1;
	}

	@Inject
	public static RSIndexedObjectSet cachedPlayers = client.newIndexedObjectSet(512);

	@Inject
	public static RSIndexedObjectSet cachedNpcs = client.newIndexedObjectSet(128);

	@Inject
	@Override
	public void setCachedPlayers(RSIndexedObjectSet players)
	{
		cachedPlayers = players;
	}

	@Inject
	@Override
	public void setCachedNpcs(RSIndexedObjectSet npcs)
	{
		cachedNpcs = npcs;
	}

	@Inject
	@Override
	public IndexedObjectSet players()
	{
		return client.isClientThread() ? getPlayers() : cachedPlayers;
	}

	@Inject
	@Override
	public IndexedObjectSet npcs()
	{
		return client.isClientThread() ? getNpcs() : cachedNpcs;
	}

	@Inject
	@Override
	public IndexedObjectSet worldEntities()
	{
		return getWorldEntities();
	}

	@Inject
	@Override
	public RSTile getSelectedSceneTile()
	{
		RSScene scene = this.getScene();
		int x = scene.getBaseX();
		int y = scene.getBaseY();
		return x != -1 && y != -1 ? scene.getTiles()[this.getPlane()][x][y] : null;
	}

	@Inject
	@Override
	public Projectile createProjectile(int id, int plane, int startX, int startY, int startZ, int startCycle, int endCycle, int slope, int startHeight, int endHeight, Actor target, int targetX, int targetY)
	{
		int targetIndex = 0;
		if (target instanceof NPC)
		{
			targetIndex = ((NPC) target).getIndex() + 1;
		}
		else if (target instanceof Player)
		{
			targetIndex = -(((Player) target).getId() + 1);
		}

		RSProjectile projectile = this.newProjectile(id, plane, startX, startY, startZ, startCycle, endCycle, slope, startHeight, targetIndex, endHeight);
		projectile.setWorldView(this);
		projectile.setDestination(targetX, targetY, Perspective.getTileHeight(client, new LocalPoint(targetX, targetY, this), plane), startCycle);
		return projectile;
	}

	@Inject
	@Override
	public int[] getMapRegions()
	{
		return client.getMapRegions();
	}
}