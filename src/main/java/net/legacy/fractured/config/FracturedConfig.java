package net.legacy.fractured.config;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.legacy.fractured.Fractured;
import me.shedaniel.autoconfig.annotation.ConfigEntry.Gui.CollapsibleObject;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.nio.file.Path;


@Config(name = Fractured.MOD_ID)
public class FracturedConfig implements ConfigData {

    @Contract(pure = true)
    public static @NotNull Path configPath(boolean json5) {
        return Path.of("./config/" + Fractured.MOD_ID + "." + (json5 ? "json5" : "json"));
    }

    public static FracturedConfig get;

    public static void initClient() {
        AutoConfig.register(FracturedConfig.class, JanksonConfigSerializer::new);
        get = AutoConfig.getConfigHolder(FracturedConfig.class).getConfig();
    }

    @CollapsibleObject
    public final GeneralConfig general = new GeneralConfig();

    @CollapsibleObject
    public EyeChancesConfig eye_chances = new EyeChancesConfig();

    public static class GeneralConfig {
        @ConfigEntry.Category("config")
        @ConfigEntry.Gui.Tooltip
        public boolean stronghold_overhaul = true;
        @ConfigEntry.Category("config")
        @ConfigEntry.Gui.Tooltip
        public boolean stronghold_archaeology = true;
        @ConfigEntry.Category("config")
        @ConfigEntry.Gui.Tooltip
        public boolean generate_eyes_in_frames = true;
        @ConfigEntry.Category("config")
        @ConfigEntry.Gui.Tooltip
        public boolean fractured_eyes = true;
    }

    public static class EyeChancesConfig {
        @ConfigEntry.Category("config")
        public int stronghold = 5;
        @ConfigEntry.Category("config")
        public int abandoned_mineshaft = 25;
        @ConfigEntry.Category("config")
        public int desert_pyramid = 15;
        @ConfigEntry.Category("config")
        public int jungle_temple = 20;
        @ConfigEntry.Category("config")
        public int nether_fortress = 20;
        @ConfigEntry.Category("config")
        public int shipwreck = 5;
        @ConfigEntry.Category("config")
        public int igloo = 25;
        @ConfigEntry.Category("config")
        public int dungeon = 25;
        @ConfigEntry.Category("config")
        public int woodland_mansion = 10;
        @ConfigEntry.Category("config")
        public int pillager_outpost = 5;
        @ConfigEntry.Category("config")
        public int bastion_remnant = 5;
        @ConfigEntry.Category("config")
        public int ocean_ruins = 5;
        @ConfigEntry.Category("config")
        public int ruined_portal = 5;
        @ConfigEntry.Category("config")
        public int ancient_city = 5;
        @ConfigEntry.Category("config")
        public int buried_treasure = 20;
    }

}
