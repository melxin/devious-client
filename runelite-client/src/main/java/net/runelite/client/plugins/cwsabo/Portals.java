package net.runelite.client.plugins.cwsabo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.api.coords.WorldPoint;

@AllArgsConstructor(access = AccessLevel.PACKAGE)
@Getter
public enum Portals
{
	SARADOMIN_PORTAL("Saradomin Portal", "Enter", 4387, new WorldPoint(2436, 3096, 0)),
	ZAMORAK_PORTAL("Zamorak Portal", "Enter", 4388, new WorldPoint(2436, 3082, 0)),
	GUTHIX_PORTAL("Guthix Portal", "Enter", 4408, new WorldPoint(2436, 3089, 0)),
	;

	private String name;
	private String action;
	private int id;
	private WorldPoint worldPoint;
}
