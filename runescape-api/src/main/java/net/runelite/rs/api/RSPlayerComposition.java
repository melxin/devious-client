package net.runelite.rs.api;

import net.runelite.api.PlayerComposition;
import net.runelite.mapping.Import;

public interface RSPlayerComposition extends PlayerComposition
{
	@Import("isFemale")
	boolean isFemale();

	@Import("gender")
	int getGender();

	@Import("bodyColors")
	int[] getColors();

	@Import("hash")
	long getHash();

	@Import("equipment")
	@Override
	int[] getEquipmentIds();

	@Import("npcTransformId")
	@Override
	int getTransformedNpcId();

	@Import("npcTransformId")
	@Override
	void setTransformedNpcId(int id);

	@Import("setHash")
	@Override
	void setHash();

	@Import("playerCompositionColorTextureOverrides")
	RSPlayerCompositionColorTextureOverride[] getColorTextureOverrides();
}
