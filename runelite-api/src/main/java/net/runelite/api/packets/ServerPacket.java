package net.runelite.api.packets;

import java.util.Map;

public interface ServerPacket
{
	int getId();

	int getLength();

	ServerPacket GRAPHICSOBJECT_SPAWN();

	ServerPacket LOGOUT();

	ServerPacket MESSAGE_FRIENDS_CHAT();

	ServerPacket CAM_RESET();

	ServerPacket PLAYER_INFO();

	ServerPacket HINT_ARROW();

	ServerPacket IF_SETHIDE();

	ServerPacket IF_SETPLAYERHEAD();

	ServerPacket IF_SETSCROLLPOS();

	//ServerPacket NPC_INFO_LARGE_VIEWPORT_1();

	ServerPacket UPDATE_REBOOT_TIMER();

	ServerPacket UPDATE_STOCKMARKET_SLOT();

	//ServerPacket NPC_INFO_SMALL_VIEWPORT_2();

	ServerPacket UPDATE_FRIENDLIST();

	ServerPacket MINIMAP_TOGGLE();

	ServerPacket NPC_INFO_SMALL_VIEWPORT();

	ServerPacket NPC_SPOTANIM();

	ServerPacket RESET_CLIENT_VARCACHE();

	ServerPacket IF_SETOBJECT();

	ServerPacket UPDATE_INV_FULL();

	ServerPacket UPDATE_IGNORELIST();

	ServerPacket UPDATE_ZONE_PARTIAL_ENCLOSED();

	ServerPacket REBUILD_NORMAL();

	ServerPacket IF_MOVESUB();

	ServerPacket REFLECTION_CHECKER();

	ServerPacket PROJECTILE_SPAWN();

	ServerPacket CAM_LOOKAT();

	ServerPacket MINIMAP_FLAG_SET();

	ServerPacket NPC_SET_SEQUENCE();

	ServerPacket MESSAGE_PRIVATE_ECHO();

	ServerPacket UPDATE_ZONE_FULL_FOLLOWS();

	ServerPacket UPDATE_INV_CLEAR();

	ServerPacket LOGOUT_FULL();

	ServerPacket MIDI_SONG();

	ServerPacket TRIGGER_ONDIALOG_ABORT();

	ServerPacket SET_PLAYER_OP();

	ServerPacket IF_SETCOLOUR();

	ServerPacket MESSAGE_PRIVATE();

	ServerPacket REBUILD_REGION();

	ServerPacket UPDATE_STAT();

	ServerPacket IF_CLOSESUB();

	ServerPacket PING_STATISTICS_REQUEST();

	ServerPacket URL_OPEN();

	ServerPacket RUNCLIENTSCRIPT();

	ServerPacket MESSAGE_GAME();

	ServerPacket CAM_SETANGLE();

	ServerPacket PLAYER_SPOTANIM();

	ServerPacket CHAT_FILTER_SETTINGS();

	ServerPacket NPC_INFO_LARGE_VIEWPORT();

	ServerPacket IF_SETPOSITION();

	ServerPacket UPDATE_UID192();

	ServerPacket DYNAMICOBJECT_SPAWN();

	ServerPacket SET_PRIVCHATMODE();

	default Map<ServerPacket, String> getServerPackets()
	{
		return Map.<ServerPacket, String>ofEntries(
				Map.entry(GRAPHICSOBJECT_SPAWN(), "GRAPHICSOBJECT_SPAWN"),
				Map.entry(LOGOUT(), "LOGOUT"),
				Map.entry(MESSAGE_FRIENDS_CHAT(), "MESSAGE_FRIENDS_CHAT"),
				Map.entry(CAM_RESET(), "CAM_RESET"),
				Map.entry(PLAYER_INFO(), "PLAYER_INFO"),
				Map.entry(HINT_ARROW(), "HINT_ARROW"),
				Map.entry(IF_SETHIDE(), "IF_SETHIDE"),
				Map.entry(IF_SETPLAYERHEAD(), "IF_SETPLAYERHEAD"),
				Map.entry(IF_SETSCROLLPOS(), "IF_SETSCROLLPOS"),
				//Map.entry(NPC_INFO_LARGE_VIEWPORT_1(), "NPC_INFO_LARGE_VIEWPORT_1"),
				Map.entry(UPDATE_REBOOT_TIMER(), "UPDATE_REBOOT_TIMER"),
				Map.entry(UPDATE_STOCKMARKET_SLOT(), "UPDATE_STOCKMARKET_SLOT"),
				//Map.entry(NPC_INFO_SMALL_VIEWPORT_2(), "NPC_INFO_SMALL_VIEWPORT_2"),
				Map.entry(UPDATE_FRIENDLIST(), "UPDATE_FRIENDLIST"),
				Map.entry(MINIMAP_TOGGLE(), "MINIMAP_TOGGLE"),
				Map.entry(NPC_INFO_SMALL_VIEWPORT(), "NPC_INFO_SMALL_VIEWPORT"),
				Map.entry(NPC_SPOTANIM(), "NPC_SPOTANIM"),
				Map.entry(RESET_CLIENT_VARCACHE(), "RESET_CLIENT_VARCACHE"),
				Map.entry(IF_SETOBJECT(), "IF_SETOBJECT"),
				Map.entry(UPDATE_INV_FULL(), "UPDATE_INV_FULL"),
				Map.entry(UPDATE_IGNORELIST(), "UPDATE_IGNORELIST"),
				Map.entry(UPDATE_ZONE_PARTIAL_ENCLOSED(), "UPDATE_ZONE_PARTIAL_ENCLOSED"),
				Map.entry(REBUILD_NORMAL(), "REBUILD_NORMAL"),
				Map.entry(IF_MOVESUB(), "IF_MOVESUB"),
				Map.entry(REFLECTION_CHECKER(), "REFLECTION_CHECKER"),
				Map.entry(PROJECTILE_SPAWN(), "PROJECTILE_SPAWN"),
				Map.entry(CAM_LOOKAT(), "CAM_LOOKAT"),
				Map.entry(MINIMAP_FLAG_SET(), "MINIMAP_FLAG_SET"),
				Map.entry(NPC_SET_SEQUENCE(), "NPC_SET_SEQUENCE"),
				Map.entry(MESSAGE_PRIVATE_ECHO(), "MESSAGE_PRIVATE_ECHO"),
				Map.entry(UPDATE_ZONE_FULL_FOLLOWS(), "UPDATE_ZONE_FULL_FOLLOWS"),
				Map.entry(UPDATE_INV_CLEAR(), "UPDATE_INV_CLEAR"),
				Map.entry(LOGOUT_FULL(), "LOGOUT_FULL"),
				Map.entry(MIDI_SONG(), "MIDI_SONG"),
				Map.entry(TRIGGER_ONDIALOG_ABORT(), "TRIGGER_ONDIALOG_ABORT"),
				Map.entry(SET_PLAYER_OP(), "SET_PLAYER_OP"),
				Map.entry(IF_SETCOLOUR(), "IF_SETCOLOUR"),
				Map.entry(MESSAGE_PRIVATE(), "MESSAGE_PRIVATE"),
				Map.entry(REBUILD_REGION(), "REBUILD_REGION"),
				Map.entry(UPDATE_STAT(), "UPDATE_STAT"),
				Map.entry(IF_CLOSESUB(), "IF_CLOSESUB"),
				Map.entry(PING_STATISTICS_REQUEST(), "PING_STATISTICS_REQUEST"),
				Map.entry(URL_OPEN(), "URL_OPEN"),
				Map.entry(RUNCLIENTSCRIPT(), "RUNCLIENTSCRIPT"),
				Map.entry(MESSAGE_GAME(), "MESSAGE_GAME"),
				Map.entry(CAM_SETANGLE(), "CAM_SETANGLE"),
				Map.entry(PLAYER_SPOTANIM(), "PLAYER_SPOTANIM"),
				Map.entry(CHAT_FILTER_SETTINGS(), "CHAT_FILTER_SETTINGS"),
				Map.entry(NPC_INFO_LARGE_VIEWPORT(), "NPC_INFO_LARGE_VIEWPORT"),
				Map.entry(IF_SETPOSITION(), "IF_SETPOSITION"),
				Map.entry(UPDATE_UID192(), "UPDATE_UID192"),
				Map.entry(DYNAMICOBJECT_SPAWN(), "DYNAMICOBJECT_SPAWN"));
	}
}
