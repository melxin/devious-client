package net.runelite.client.plugins.cwsabo;

import net.runelite.client.config.Button;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("sabotage")
public interface CastleWarsSabotageConfig extends Config
{
    @ConfigItem(keyName = "Portal", name = "Portal", description = "The portal to use", position = 1)
    default Portals portal()
    {
        return Portals.SARADOMIN_PORTAL;
    }

    @ConfigItem(keyName = "Overlay enabled", name = "Overlay enabled", description = "Enables overlay", position = 2)
    default boolean overlayEnabled()
    {
        return true;
    }

    @ConfigItem(keyName = "Draw tiles", name = "Draw tiles", description = "Draw barricade area tiles", position = 3)
    default boolean drawTiles()
    {
        return false;
    }

    @ConfigItem(keyName = "Spam message", name = "Spam message", description = "Spam a message", position = 4)
    default String spamMessage()
    {
        return "";
    }

    @ConfigItem(keyName = "Start", name = "Start/Stop", description = "Start/Stop button", position = 5)
    default Button startStopButton()
    {
        return new Button();
    }
}
