/*
 * Copyright (c) 2024, Melxin <https://github.com/melxin>
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
package net.runelite.deob.deobfuscators.mapping.packets;

import com.google.common.base.Stopwatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import net.runelite.asm.Annotation;
import net.runelite.asm.ClassFile;
import net.runelite.asm.ClassGroup;
import net.runelite.asm.Field;
import net.runelite.asm.Method;
import net.runelite.asm.Type;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.instruction.types.PushConstantInstruction;
import net.runelite.asm.attributes.code.instructions.PutStatic;
import net.runelite.deob.DeobAnnotations;
import net.runelite.deob.DeobProperties;
import net.runelite.deob.deobfuscators.Renamer;
import net.runelite.deob.deobfuscators.mapping.ParallelExecutorMapping;
import net.runelite.deob.util.NameMappings;

/**
 * Map server & client packets
 *
 * Thanks to mod weath for providing the mapped server and client packets
 */
public class ModWeathPacketsParser implements Runnable
{
	// Update COMPATIBLE_REVISION, SERVER_PACKETS and CLIENT_PACKETS each revision
	private static final String COMPATIBLE_REVISION = "235";

	private static final Map<String, String> SERVER_PACKETS = List.of(
		"SERVER_TICK_END,0",
		"SET_PLAYER_OP,1",
		"UPDATE_REBOOT_TIMER,3",
		"REFLECTION_CHECKER,5",
		"URL_OPEN,6",
		"SET_PRIVCHATMODE,7",
		"LOC_DEL,8",
		"UPDATE_INV_CLEAR,9",
		"IF_OPENSUB,11",
		"MESSAGE_PRIVATE,12",
		"CAM_LOOKAT,15",
		"CAM_TARGET,16",
		"CAM_SETANGLE,17",
		"IF_SETCOLOUR,18",
		"UPDATE_IGNORELIST,19",
		"MIDI_SONG,20",
		"NPC_INFO_SMALL_VIEWPORT,21",
		"NPC_SET_SEQUENCE,22",
		"VARP_SMALL,24",
		"CAM_LOOKAT_EASED_COORD,25",
		"SYNTH_SOUND,26",
		"GRAPHICSOBJECT_SPAWN,27",
		"CAM_LOOKAT_EASED_ANGLE_RELATIVE,28",
		"MINIMAP_TOGGLE,30",
		"UPDATE_INV_STOP_TRANSIT,31",
		"MIDI_JINGLE,32",
		"PLAYER_SPOTANIM,33",
		"IF_SET_PLAYERMODEL_BASECOLOUR,34",
		"UPDATE_STAT,35",
		"IF_SETANIM,36",
		"MESSAGE_GAME,37",
		"LOGOUT,38",
		"MESSAGE_CLAN_CHANNEL_SYSTEM,39",
		"IF_RESYNC,40",
		"FRIENDS_LIST_LOADED,41",
		"TRIGGER_ONDIALOG_ABORT,42",
		"IF_SETPOSITION,43",
		"CAM_MODE,44",
		"IF_OPENTOP,45",
		"IF_SETSCROLLPOS,46",
		"MIDI_SWAP,47",
		"UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL,48",
		"IF_SETHIDE,49",
		"IF_MOVESUB,50",
		"HINT_ARROW,52",
		"UPDATE_FRIENDLIST,53",
		"LOC_ADD_CHANGE,54",
		"UPDATE_TRADING_POST,55",
		"NPC_INFO_LARGE_VIEWPORT,56",
		"IF_CLOSESUB,57",
		"UPDATE_STOCKMARKET_SLOT,58",
		"IF_SETMODEL,59",
		"RESET_INTERACTION_MODE,60",
		"IF_SET_ROTATE_SPEED,61",
		"UNKNOWN_STRING,62",
		"UPDATE_RUN_ENERGY,63",
		"CLAN_CHANNEL_DELTA,64",
		"IF_SETNPCHEAD_ACTIVE,65",
		"LOGOUT_FULL,66",
		"PROJECTILE_SPAWN,67",
		"CLAN_CHANNEL_FULL,68",
		"UPDATE_SITE_SETTINGS,69",
		"MINIMAP_FLAG_SET,70",
		"MESSAGE_FRIENDS_CHAT,71",
		"VAR_CLAN_ENABLE,72",
		"CLAN_SETTINGS_FULL,73",
		"SYNC_CLIENT_VARCACHE,74",
		"PLAYER_ANIM_SPECIFIC,75",
		"RESET_ANIMS,76",
		"NPC_SPOTANIM,77",
		"UPDATE_UID192,78",
		"REBUILD_NORMAL,79",
		"MESSAGE_PRIVATE_ECHO,80",
		"RESET_CLIENT_VARCACHE,81",
		"IF_SET_TEXT,82",
		"MIDI_SONG_WITH_SECONDARY,83",
		"SET_ACTIVE_WORLD,84",
		"IF_SETOBJECT,85",
		"LOC_ANIM,86",
		"IF_SET_PLAYERMODEL_SELF,87",
		"REBUILD_WORLDENTITY,88",
		"VAR_CLAN_DISABLE,90",
		"DYNAMICOBJECT_SPAWN,91",
		"HEAT_MAP,92",
		"UPDATE_INV_FULL,93",
		"UPDATE_ZONE_FULL_FOLLOWS,94",
		"CAM_SMOOTH_RESET,95",
		"CAM_SHAKE,96",
		"PLAYER_INFO,97",
		"CAM_RESET,98",
		"NPC_HEADICON_SPECIFIC,99",
		"SET_NPC_UPDATE_ORIGIN,100",
		"UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1,101",
		"MESSAGE_FRIEND_PRIVATE,102",
		"CLAN_SETTINGS_DELTA,103",
		"REBUILD_REGION,104",
		"UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER,105",
		"CAM_MOVETO,106",
		"EVENT_WORLDHOP,107",
		"CAM_MOVETO_EASED_CIRCULAR,108",
		"UPDATE_ZONE_PARTIAL_ENCLOSED,109",
		"IF_SET_PLAYERMODEL_OBJ,110",
		"CAM_MOVE_TO,111",
		"UPDATE_RUN_WEIGHT,112",
		"PING_STATISTICS_REQUEST,113",
		"IF_SETPLAYERHEAD,114",
		"IF_SETANGLE,115",
		"VAR_CLAN,116",
		"MIDI_SONG_STOP,117",
		"IF_SET_PLAYERMODEL_BODYTYPE,119",
		"MAP_ANIM,120",
		"IF_SETNPCHEAD,121",
		"OCULUS_SYNC,122",
		"UPDATE_INV_PARTIAL,123",
		"CHAT_FILTER_SETTINGS,124",
		"LOC_MERGEPLAYER,125",
		"RUNCLIENTSCRIPT,126",
		"VARP_LARGE,127",
		"WORLDENTITY_INFO,133",
		"IF_SET_EVENTS,134"
	).stream()
		.map(s -> s.split(","))
		.filter(s -> s.length >= 2)
		.collect(Collectors.toMap(s -> s[1].trim(), s -> s[0].trim()));

	private static final Map<String, String> CLIENT_PACKETS = List.of(
		"OPLOC2,0",
		"EVENT_KEYBOARD,1",
		"RESUME_COUNTDIALOG,2",
		"CLAN_SETTINGS_SET_MUTED_FROM_CHANNEL,3",
		"RESUME_OBJDIALOG,4",
		"MUSIC_PLAYING,5",
		"OPPLAYER2,6",
		"EVENT_APPLET_FOCUS,7",
		"OPLOCU,8",
		"WIDGET_TYPE,9",
		"CHAT_SENDABUSEREPORT,10",
		"OPPLAYER4,11",
		"CLICK_WORLD_MAP,12",
		"OPPLAYER1,14",
		"OPWORLDENTITY2,15",
		"OPWORLDENTITYU,16",
		"OPLOC3,17",
		"OPWORLDENTITY5,19",
		"RESUME_NAMEDIALOG,21",
		"CLOSE_MODAL,22",
		"OPNPC1,23",
		"MINIMAP_CLICK,24",
		"DOCHEAT,25",
		"OPNPC2,26",
		"FRIEND_DELUSER,27",
		"OPLOC4,28",
		"OPPLAYER7,29",
		"IF_RUNSCRIPT,30",
		"OPOBJ1,31",
		"RESUME_STRINGDIALOG,32",
		"MOUSE_WHEEL,33",
		"CLAN_SETTINGS_FULL_REQUEST,34",
		"BUG_REPORT,35",
		"MAP_BUILD_COMPLETE,36",
		"FRIEND_CHAT_JOIN_LEAVE,37",
		"LOGIN_TIMINGS,38",
		"IF_BUTTONX,39",
		"TELEPORT,40",
		"OPWORLDENTITY4,41",
		"PING_STATISTICS,42",
		"OPNPC5,43",
		"EVENT_MOUSE_IDLE,44",
		"IF_CRMVIEW,45",
		"OPOBJT,46",
		"CHAT_SETFILTER,47",
		"OPPLAYER8,48",
		"EVENT_CAMERA_POSITION,49",
		"OPLOCE,50",
		"OPWORLDENTITY1,51",
		"OPPLAYERU,52",
		"REFLECTION_CHECK_REPLY,53",
		"OPLOC5,54",
		"NO_TIMEOUT,55",
		"OPOBJ3,56",
		"OPNPCE,57",
		"MESSAGE_PUBLIC,58",
		"OPNPC4,59",
		"OPPLAYERT,60",
		"OPLOCT,61",
		"IGNORE_DELUSER,62",
		"OPWORLDENTITYT,63",
		"OPWORLDENTITY3,64",
		"CHAT_SENDPRIVATE,65",
		"IGNORE_LIST_ADD,66",
		"FRIEND_ADDUSER,67",
		"IF_BUTTONT,68",
		"OPPLAYER3,69",
		"MOUSE_MOVE,70",
		"RESUME_PAUSEBUTTON,71",
		"EVENT_MOUSE_CLICK,72",
		"CLAN_CHANNEL_KICK_USER,73",
		"FRIEND_CHAT_SETRANK,74",
		"OPNPCU,75",
		"MOVE_GAMECLICK,76",
		"OPOBJ2,77",
		"IF_SUBOP,78",
		"OPOBJE,79",
		"OPNPC3,80",
		"OPOBJU,82",
		"CLAN_CHANNEL_FULL_REQUEST,84",
		"OPHELDD,85",
		"UPDATE_PLAYER_MODEL,86",
		"OPPLAYER5,87",
		"SET_HEADING,88",
		"OPNPCT,90",
		"OPOBJ5,91",
		"EVENT_WINDOW_SETTING,93",
		"CLAN_SETTINGS_ADD_BANNED_FROM_CHANNEL,95",
		"OPLOC1,96",
		"CLAN_KICKUSER,97",
		"OPWORLDENTITYE,98",
		"OPPLAYER6,99",
		"OPOBJ4,100"
	).stream()
		.map(s -> s.split(","))
		.filter(s -> s.length >= 2)
		.collect(Collectors.toMap(s -> s[1].trim(), s -> s[0].trim()));

	private static final Logger logger = LoggerFactory.getLogger(ModWeathPacketsParser.class);

	private final ParallelExecutorMapping mapping;
	private final ClassGroup namedGroup;
	private final ClassGroup targetGroup;

	private final ClassFile namedServerPacketCF;
	private final ClassFile targetServerPacketCF;

	private final ClassFile namedClientPacketCF;
	private final ClassFile targetClientPacketCF;

	private final Type SERVER_PACKET_TYPE;
	private final Type CLIENT_PACKET_TYPE;

	private final NameMappings newNameMappings;

	public ModWeathPacketsParser(ParallelExecutorMapping mapping, ClassGroup group1, ClassGroup group2)
	{
		this.mapping = mapping;
		this.namedGroup = group1;
		this.targetGroup = group2;

		this.namedServerPacketCF = namedGroup.findClass("ServerPacket");
		this.targetServerPacketCF = (ClassFile) mapping.getMap().get(namedServerPacketCF);

		this.namedClientPacketCF = namedGroup.findClass("ClientPacket");
		this.targetClientPacketCF = (ClassFile) mapping.getMap().get(namedClientPacketCF);

		this.SERVER_PACKET_TYPE = new Type("LServerPacket;");
		this.CLIENT_PACKET_TYPE = new Type("LClientPacket;");

		this.newNameMappings = new NameMappings();
	}

	@Override
	public void run()
	{
		if (!DeobProperties.getRevision().equals(COMPATIBLE_REVISION))
		{
			logger.warn("Invalid packet data, update required!");
			return;
		}

		Stopwatch stopwatch = Stopwatch.createStarted();

		// Server packets
		if (!SERVER_PACKETS.isEmpty())
		{
			final Method clinit = targetServerPacketCF.findStaticMethod("<clinit>");
			final List<Instruction> ins = clinit.getCode().getInstructions().getInstructions();
			final Map<String, Field> idToPacketMap = new HashMap<>();
			String id = null;
			Field packet = null;
			for (Instruction in : ins)
			{
				if (id == null)
				{
					if (in instanceof PushConstantInstruction)
					{
						final PushConstantInstruction pci = (PushConstantInstruction) in;
						id = String.valueOf(pci.getConstant());
						continue;
					}
				}

				if (id != null && packet == null)
				{
					if (in instanceof PutStatic)
					{
						final Field targetServerPacketField = ((PutStatic) in).getMyField();
						if (targetServerPacketField.getType().equals(SERVER_PACKET_TYPE))
						{
							packet = targetServerPacketField;
						}
					}
				}

				if (id != null && packet != null)
				{
					idToPacketMap.put(id, packet);
					id = null;
					packet = null;
				}
			}

			SERVER_PACKETS.entrySet().forEach(entry ->
			{
				final String packetId = entry.getKey();
				final String named = entry.getValue();
				final Field targetServerPacketField = idToPacketMap.get(packetId);
				if (targetServerPacketField != null)
				{
					logger.info("Mapping server packet: {} -> {}", targetServerPacketField.getName(), named);
					newNameMappings.map(targetServerPacketField.getPoolField(), named);
				}
			});
		}

		// Client packets
		if (!CLIENT_PACKETS.isEmpty())
		{
			final Method clinit = targetClientPacketCF.findStaticMethod("<clinit>");
			final List<Instruction> ins = clinit.getCode().getInstructions().getInstructions();
			final Map<String, Field> idToPacketMap = new HashMap<>();
			String id = null;
			Field packet = null;
			for (Instruction in : ins)
			{
				if (id == null)
				{
					if (in instanceof PushConstantInstruction)
					{
						final PushConstantInstruction pci = (PushConstantInstruction) in;
						id = String.valueOf(pci.getConstant());
						continue;
					}
				}

				if (id != null && packet == null)
				{
					if (in instanceof PutStatic)
					{
						final Field targetClientPacketField = ((PutStatic) in).getMyField();
						if (targetClientPacketField.getType().equals(CLIENT_PACKET_TYPE))
						{
							packet = targetClientPacketField;
						}
					}
				}

				if (id != null && packet != null)
				{
					idToPacketMap.put(id, packet);
					id = null;
					packet = null;
				}
			}

			CLIENT_PACKETS.entrySet().forEach(entry ->
			{
				final String packetId = entry.getKey();
				final String named = entry.getValue();
				final Field targetClientPacketField = idToPacketMap.get(packetId);
				if (targetClientPacketField != null)
				{
					logger.info("Mapping client packet: {} -> {}", targetClientPacketField.getName(), named);
					newNameMappings.map(targetClientPacketField.getPoolField(), named);
				}
			});
		}

		/**
		 * Renamer
		 */
		new Renamer(newNameMappings).run(targetGroup);

		/**
		 * Remove export annotations
		 */
		targetServerPacketCF.getFields().stream().filter(f -> f.isStatic() && f.getType().equals(new Type("L" + targetServerPacketCF.getName() + ";"))).forEach(clp ->
		{
			Map<Type, Annotation> cfAnnotations = clp.getAnnotations();
			cfAnnotations.keySet().stream().filter(k -> k.equals(DeobAnnotations.EXPORT)).collect(Collectors.toList()).forEach(cfAnnotations::remove);
		});

		targetClientPacketCF.getFields().stream().filter(f -> f.isStatic() && f.getType().equals(new Type("L" + targetClientPacketCF.getName() + ";"))).forEach(clp ->
		{
			Map<Type, Annotation> cfAnnotations = clp.getAnnotations();
			cfAnnotations.keySet().stream().filter(k -> k.equals(DeobAnnotations.EXPORT)).collect(Collectors.toList()).forEach(cfAnnotations::remove);
		});

		/**
		 * Unable to map
		 */
		for (Field f : namedServerPacketCF.getFields())
		{
			if (f.getName().startsWith("field") || !f.getType().equals(SERVER_PACKET_TYPE))
			{
				continue;
			}
			if (!newNameMappings.getMap().containsValue(f.getName()))
			{
				logger.error("Unable to map server packet: {}", f.getName());
			}
		}

		for (Field f : namedClientPacketCF.getFields())
		{
			if (f.getName().startsWith("field") || !f.getType().equals(CLIENT_PACKET_TYPE))
			{
				continue;
			}
			if (!newNameMappings.getMap().containsValue(f.getName()))
			{
				logger.error("Unable to map client packet: {}", f.getName());
			}
		}

		logger.info("Took: {}", stopwatch);
	}
}