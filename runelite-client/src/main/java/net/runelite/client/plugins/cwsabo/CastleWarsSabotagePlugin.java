package net.runelite.client.plugins.cwsabo;

import com.google.inject.Provides;
import lombok.extern.slf4j.Slf4j;
import org.pf4j.Extension;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.time.Instant;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.MessageNode;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Tile;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.ConfigButtonClicked;
import net.runelite.api.events.Draw;
import net.runelite.api.widgets.Widget;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.cwsabo.utils.TimeUtils;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.GlobalCollisionMap;
import net.unethicalite.api.plugins.LoopedPlugin;
import net.unethicalite.api.scene.Tiles;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import static net.unethicalite.api.commons.Time.sleepTicks;
import static net.unethicalite.api.commons.Time.sleepUntil;

@Extension
@PluginDescriptor(
	name = "CastleWars sabotage",
	description = "Sabotages at castle-wars",
	enabledByDefault = false,
	tags =
		{
			"castlewars",
			"minigame",
			"sabotage",
			"barricades",
			"saradomin",
			"zamorak",
			"guthix",
			"king tachy"
		}
)
@Slf4j
public class CastleWarsSabotagePlugin extends LoopedPlugin
{
	@Inject
	private Client client;

	@Inject
	private CastleWarsSabotageConfig config;

	@Provides
	private CastleWarsSabotageConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(CastleWarsSabotageConfig.class);
	}

	@Inject
	private GlobalCollisionMap collisionMap;

	private boolean inZamorak;
	private boolean inSaradomin;

	private State currentState;

	private int won;
	private int lost;

	private Instant scriptStartTime;
	protected String getTimeRunning()
	{
		return scriptStartTime != null ? TimeUtils.getTimeBetween(scriptStartTime, Instant.now()) : "";
	}

	private List<Tile> barricadeArea;

	@Override
	protected void startUp()
	{
	}

	@Override
	protected void shutDown()
	{
		reset();
	}

	/**
	 * Reset/stop
	 */
	private void reset()
	{
		this.inSaradomin = false;
		this.inZamorak = false;
		this.currentState = null;
		this.won = 0;
		this.lost = 0;
		this.scriptStartTime = null;
	}

	@Subscribe
	public void onConfigButtonPressed(ConfigButtonClicked event)
	{
		if (!event.getGroup().contains("sabotage") || !event.getKey().toLowerCase().contains("start"))
		{
			return;
		}

		if (scriptStartTime != null)
		{
			reset();
		}
		else
		{
			this.scriptStartTime = Instant.now();
		}
	}

	@Subscribe
	public void onChatMessage(ChatMessage chatMessage)
	{
		ChatMessageType chatMessageType = chatMessage.getType();
		MessageNode messageNode = chatMessage.getMessageNode();

		if (!isInCastleWarsRegion())
		{
			return;
		}

		/*if (messageNode.getValue().startsWith("You have gained a supply crate"))
		{
			won++;
		}

		if (messageNode.getValue().startsWith("You did not earn enough points"))
		{
			lost++;
		}*/

		if (messageNode.getValue().equals("You can't set up a barricade here."))
		{
			WorldPoint p = Tiles.getSurrounding(client.getLocalPlayer().getWorldLocation(), 10).stream().filter(t -> t != null && isEmptyTile(t)).map(Tile::getWorldLocation).findFirst().get();
			if (p != null)
			{
				walkTo(p);
			}
		}

		if (messageNode.getValue().equals("Your team has already set up 10 barricades."))
		{
		}
	}

	@Subscribe
	public void onDraw(Draw event)
	{
		Graphics graphics = event.getGraphics();
		if (graphics != null && scriptStartTime != null && config.overlayEnabled())
		{
			graphics.setColor(Color.RED);
			graphics.drawString("Time running: " + this.getTimeRunning(), 10, 20);
			graphics.drawString("State: " + this.currentState, 10, 35);
			String team = this.inSaradomin ? "Saradomin" : this.inZamorak ? "Zamorak" : "N/A";
			graphics.drawString("Team: " + team, 10, 50);
			graphics.drawString("Games won: " + this.won, 10, 65);
			graphics.drawString("Games lost: " + this.lost, 10, 80);

			if (config.drawTiles() && barricadeArea != null && !barricadeArea.isEmpty())
			{
				for (Tile t : barricadeArea)
				{
					t.getWorldLocation().outline(client, (Graphics2D) graphics, Color.green);
				}
			}
		}
	}

	private boolean isInLobby()
	{
		Player localPlayer = client.getLocalPlayer();
		return localPlayer != null && localPlayer.getWorldLocation().getRegionID() == 9776;
	}

	private boolean isInCastleWarsRegion()
	{
		Player localPlayer = client.getLocalPlayer();
		int regionId = localPlayer != null ? localPlayer.getWorldLocation().getRegionID() : 0;
		return regionId == 9520 || regionId == 9620;
	}

	private boolean isGameStarted()
	{
			Widget s = Widgets.get(58, 2); // Saradomin
		        Widget z = Widgets.get(59, 2); // Zamorak
		        Widget w = s != null ? s : z != null ? z : null;

		        if (s != null)
		        {
		        	this.inSaradomin = true;
		        }
		        else if (z != null)
		        {
		        	this.inZamorak = true;
		        }
		        else
		        {
		        	this.inSaradomin = false;
		        	this.inZamorak = false;
		        }

			return isInCastleWarsRegion() && w != null && w.getText().endsWith("Min");
	}

	private boolean isInRespawnRoom()
	{
		Widget s = Widgets.get(58, 23); // Saradomin
		Widget z = Widgets.get(59, 23); // Zamorak
		Widget w = s != null ? s : z != null ? z : null;
		return isInCastleWarsRegion() && w != null && w.getText().contains("respawn");
	}

	private enum State
	{
		ENTER_PORTAL,
		WAIT_FOR_GAME,
		LEAVE_RESPAWN,
		CLIMB_DOWN,
		TAKE_EXPLOSIVES,
		TAKE_BARRICADES,
		SET_BARRICADES,
		SLEEP
	}

	private State getState()
	{
		Player localPlayer = client.getLocalPlayer();

		if (isInLobby())
		{
			return State.ENTER_PORTAL;
		}
		else if (isInCastleWarsRegion()
			&& !isGameStarted())
		{
			return State.WAIT_FOR_GAME;
		}

		if (isInCastleWarsRegion() && isGameStarted())
		{
			if (isInRespawnRoom())
			{
				return State.LEAVE_RESPAWN;
			}
			else if (TileObjects.getNearest("Energy Barrier") != null && TileObjects.getNearest("Ladder") != null)
			{
				return State.CLIMB_DOWN;
			}

			if (client.getPlane() == 0)
			{
				TileObject explosiveTable = TileObjects.getNearest(4463); // Saradomin & Zamorak
				if (Inventory.getCount("Explosive potion") == 0 && explosiveTable != null)
				{
					return State.TAKE_EXPLOSIVES;
				}

				if (Inventory.getCount("Barricade") == 0)
				{
					return State.TAKE_BARRICADES;
				}

				TileObject barricadeTable = TileObjects.getNearest(4461); // Saradomin & Zamorak
				if (barricadeTable != null && barricadeTable.distanceTo(localPlayer.getWorldLocation()) <= 2 && Inventory.getCount("Barricade") < 20 && !Inventory.isFull())
				{
						return State.TAKE_BARRICADES;
				}

				return State.SET_BARRICADES;
			}
		}

		return State.SLEEP;
	}

	@Override
	protected int loop()
	{
		if (scriptStartTime == null || client.getGameState() == GameState.LOGIN_SCREEN)
		{
			return -1;
		}

		if (client.getLocalPlayer() == null)
		{
			return -1;
		}

		if (Dialog.isOpen())
		{
			if (getState() == State.WAIT_FOR_GAME)
			{
				Keyboard.type(1);
			}
			else
			{
				Dialog.continueSpace();
			}
		}

		if (!Movement.isRunEnabled() && Movement.getRunEnergy() > 10)
		{
			Movement.toggleRun();
		}

		if (config.spamMessage() != null && config.spamMessage().length() > 1)
		{
			Keyboard.type(config.spamMessage(), true);
			System.gc();
		}
		this.currentState = getState();
		switch (getState())
		{
			case ENTER_PORTAL:
				TileObject portal = TileObjects.getFirstSurrounding(client.getLocalPlayer().getWorldLocation(), 25, obj -> obj.hasAction(config.portal().getAction()) && obj.getId() == config.portal().getId());
				if (portal != null)
				{
					portal.interact(config.portal().getAction());
					sleepUntil(() -> !isInLobby(), 3000);
				}
				this.barricadeArea = null;
				return -1;

			case WAIT_FOR_GAME:
				return -1;

			case LEAVE_RESPAWN:
				if (isInRespawnRoom())
				{
					TileObject s = TileObjects.getFirstAt(new WorldPoint(2422, 3076, client.getLocalPlayer().getPlane()), "Energy Barrier"); // Saradomin
					TileObject z = TileObjects.getFirstAt(new WorldPoint(2377, 3131, client.getLocalPlayer().getPlane()), "Energy Barrier"); // Zamorak
					TileObject energyBarrier = s != null ? s : z != null ? z : null;
					if (energyBarrier != null)
					{
						energyBarrier.interact("Pass");
					}
				}
				this.barricadeArea = null;
				return -1;

			case CLIMB_DOWN:
				TileObject ladder = TileObjects.getNearest("Ladder");
				if (ladder != null && ladder.hasAction("Climb-down"))
				{
					ladder.interact("Climb-down");
				}
				return -1;

			case TAKE_EXPLOSIVES:
				TileObject explosiveTable = TileObjects.getNearest(4463); // Saradomin & Zamorak
				if (explosiveTable != null)
				{
					explosiveTable.interact("Take-5");
				}
				return -1;

			case TAKE_BARRICADES:
				TileObject barricadeTable = TileObjects.getNearest(4461); // Saradomin & Zamorak
				if (barricadeTable != null)
				{
					if (barricadeTable.getWorldLocation().distanceTo(client.getLocalPlayer().getWorldLocation()) > 1)
					{
						walkTo(barricadeTable.getWorldLocation());
					}
					else
					{
						barricadeTable.interact("Take-5");
						sleepUntil(() -> Inventory.contains("Barricade"), 2000);
						if (!Inventory.contains("Barricade") && NPCs.getNearest("Barricade") != null && Inventory.contains("Explosive potion"))
						{
							Inventory.getFirst("Explosive potion").useOn(NPCs.getNearest("Barricade"));
						}
					}
				}
				else
				{
					if (inSaradomin)
					{
						walkTo(new WorldPoint(2376, 3024, 0)); // Saradomin
					}
					else if (inZamorak)
					{
						walkTo(new WorldPoint(2372, 3131, 0)); // Zamorak
					}
				}
				return -1;

			/*case SET_BARRICADES:
				int randomX = (int) (Math.random() * (2396 - 2294)) + 2294; // 2390
				int randomY = (int) (Math.random() * (3080 - 3072)) + 3072; // 3073
				walkTo(new WorldPoint(randomX, randomY, 0));
				sleepTicks(1);
				Inventory.getFirst("Barricade").interact("Set-up");
				return -1;*/

			case SET_BARRICADES:
				WorldPoint start = inSaradomin ? new WorldPoint(2390, 3073, 0) : new WorldPoint(2368, 3100, 0);
				if (client.getLocalPlayer().getWorldLocation().distanceTo(start) > 15)
				{
					walkTo(start);
					//sleepTicks(1);
					if (Inventory.contains("Barricade"))
					{
						Inventory.getFirst("Barricade").interact("Set-up");
					}
					return -1;
				}

				if (barricadeArea == null || barricadeArea.isEmpty())
				{
					this.barricadeArea = generateBarricadeArea(10);
				}
				walkTo(barricadeArea.get(0).getWorldLocation());
				barricadeArea.remove(0);
				//sleepTicks(1);
				if (Inventory.contains("Barricade"))
				{
					Inventory.getFirst("Barricade").interact("Set-up");
				}
				return -1;

			case SLEEP:
				return -1;
		}
		return -1;
	}

	private WorldPoint lastPosition;
	private Instant lastMovementTime;
	private void walkTo(WorldPoint worldPoint)
	{
		lastPosition = Players.getLocal().getWorldLocation();

		Movement.walkTo(worldPoint);
		sleepTicks(1);

		WorldPoint localWP = Players.getLocal().getWorldLocation();
		if (hasMoved(localWP, lastPosition))
		{
			lastMovementTime = Instant.now();
			return;
		}

		//List<WorldPoint> p = Tiles.getSurrounding(localWP, 1).stream().filter(t -> t != null && isEmptyTile(t)).map(Tile::getWorldLocation).collect(Collectors.toList());
		List<WorldPoint> wps = new java.util.ArrayList<>(List.of(
			new WorldPoint(localWP.getWorldLocation().getX() - 1, localWP.getWorldLocation().getY(), localWP.getWorldLocation().getPlane()),
			new WorldPoint(localWP.getWorldLocation().getX(), localWP.getWorldLocation().getY() - 1, localWP.getWorldLocation().getPlane()),
			new WorldPoint(localWP.getWorldLocation().getX() + 1, localWP.getWorldLocation().getY(), localWP.getWorldLocation().getPlane()),
			new WorldPoint(localWP.getWorldLocation().getX(), localWP.getWorldLocation().getY() + 1, localWP.getWorldLocation().getPlane())));

		//log.info("wp: {}", p);
		wps.forEach(wp ->
		{
			Movement.walkTo(wp);
			sleepTicks(1);
		});
		//Walker.stepAlong(wps);

		if (hasMoved(Players.getLocal().getWorldLocation(), lastPosition))
		{
			lastMovementTime = Instant.now();
			return;
		}

		Collections.reverse(wps);
		wps.forEach(wp ->
		{
			Movement.walkTo(wp);
			sleepTicks(2);
		});

		if (hasMoved(Players.getLocal().getWorldLocation(), lastPosition))
		{
			lastMovementTime = Instant.now();
			return;
		}

		NPC barricade = NPCs.getAll("Barricade").stream()
			.filter(b -> b.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()) == 1)
			.findFirst()
			.orElse(null);

		if (barricade != null)
		{
			Movement.walkNextTo(barricade);
			sleepTicks(2);

			if (hasMoved(Players.getLocal().getWorldLocation(), lastPosition))
			{
				lastMovementTime = Instant.now();
				return;
			}
		}

		Player nearbyPlayer = Players.getAll().stream()
			.filter(p -> !p.getName().equals(Players.getLocal().getName()) && p.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()) <= 3)
			.findAny()
			.orElse(null);

		if (nearbyPlayer != null || currentState == State.TAKE_BARRICADES)
		{
			if (lastMovementTime == null || lastMovementTime.plusSeconds(30).isAfter(Instant.now()))
			{
				if (Inventory.contains("Explosive potion"))
				{
					//log.info("Should use explosive");
					//NPC blockedBarricade = NPCs.query().filter(n -> n.getName().startsWith("Barricade") && n.distanceTo(localWP) <= 1 && localWP != n.getWorldLocation()).results().first();
					List<NPC> blockedBarricades = NPCs.getAll("Barricade").stream()
						.filter(n -> n.getWorldLocation().getX() == Players.getLocal().getWorldLocation().getX() + 1 || n.getWorldLocation().getX() == Players.getLocal().getWorldLocation().getWorldLocation().getX() - 1 || n.getWorldLocation().getY() == Players.getLocal().getWorldLocation().getY() - 1 || n.getWorldLocation().getY() == Players.getLocal().getWorldLocation().getY() + 1)
						.collect(Collectors.toList());

					for (NPC blockedBarricade : blockedBarricades)
					{
						Inventory.getFirst("Explosive potion").useOn(blockedBarricade);
					}
				}
			}
		}
	}

	private boolean isEmptyTile(Tile tile)
	{
		WorldPoint wp = tile.getWorldLocation();
		return !collisionMap.fullBlock(wp) && Reachable.isWalkable(wp) && NPCs.query().filter(n -> n.getName().equals("Barricade") && n.getWorldLocation() == wp).results().first() == null;
	}

	private List<Tile> generateBarricadeArea(int radius)
	{
		return Tiles.getSurrounding(Players.getLocal().getWorldLocation(), radius).stream()
			.filter(tile -> tile != null && isEmptyTile(tile))
			.collect(Collectors.toList());
	}

	private boolean hasMoved(WorldPoint currentPosition, WorldPoint lastPosition)
	{
		return !currentPosition.equals(lastPosition);
	}
}
