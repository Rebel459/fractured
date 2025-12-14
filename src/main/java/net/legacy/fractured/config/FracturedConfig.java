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

    public static void init() {
        AutoConfig.register(FracturedConfig.class, JanksonConfigSerializer::new);
        get = AutoConfig.getConfigHolder(FracturedConfig.class).getConfig();
    }

    @CollapsibleObject
    public final GeneralConfig general = new GeneralConfig();

    @CollapsibleObject
    public VanillaLootConfig vanilla_loot = new VanillaLootConfig();

    @CollapsibleObject
    public IntegrationLootConfig integration_loot = new IntegrationLootConfig();

    public static class GeneralConfig {
        @ConfigEntry.Category("config")
        @ConfigEntry.Gui.Tooltip
        @ConfigEntry.BoundedDiscrete(max=100L)
        public int eye_break_chance = 20;
        @ConfigEntry.Category("config")
        @ConfigEntry.Gui.Tooltip
        public boolean broken_eyes_fracture = true;
        @ConfigEntry.Category("config")
        @ConfigEntry.Gui.Tooltip
        public boolean generate_eyes_in_frames = true;
        @ConfigEntry.Category("config")
        @ConfigEntry.Gui.Tooltip
        public boolean fractured_eyes = true;
    }

    public static class VanillaLootConfig {
        @ConfigEntry.Category("config")
        @ConfigEntry.BoundedDiscrete(max=100L)
        public int stronghold = 5;
        @ConfigEntry.Category("config")
        @ConfigEntry.BoundedDiscrete(max=100L)
        public int abandoned_mineshaft = 25;
        @ConfigEntry.Category("config")
        @ConfigEntry.BoundedDiscrete(max=100L)
        public int desert_pyramid = 15;
        @ConfigEntry.Category("config")
        @ConfigEntry.BoundedDiscrete(max=100L)
        public int jungle_temple = 20;
        @ConfigEntry.Category("config")
        @ConfigEntry.BoundedDiscrete(max=100L)
        public int nether_fortress = 20;
        @ConfigEntry.Category("config")
        @ConfigEntry.BoundedDiscrete(max=100L)
        public int shipwreck = 5;
        @ConfigEntry.Category("config")
        @ConfigEntry.BoundedDiscrete(max=100L)
        public int igloo = 25;
        @ConfigEntry.Category("config")
        @ConfigEntry.BoundedDiscrete(max=100L)
        public int dungeon = 25;
        @ConfigEntry.Category("config")
        @ConfigEntry.BoundedDiscrete(max=100L)
        public int woodland_mansion = 10;
        @ConfigEntry.Category("config")
        @ConfigEntry.BoundedDiscrete(max=100L)
        public int pillager_outpost = 5;
        @ConfigEntry.Category("config")
        @ConfigEntry.BoundedDiscrete(max=100L)
        public int bastion_remnant = 5;
        @ConfigEntry.Category("config")
        @ConfigEntry.BoundedDiscrete(max=100L)
        public int ocean_ruins = 5;
        @ConfigEntry.Category("config")
        @ConfigEntry.BoundedDiscrete(max=100L)
        public int ruined_portal = 5;
        @ConfigEntry.Category("config")
        @ConfigEntry.BoundedDiscrete(max=100L)
        public int ancient_city = 5;
        @ConfigEntry.Category("config")
        @ConfigEntry.BoundedDiscrete(max=100L)
        public int buried_treasure = 20;
    }

    public static class IntegrationLootConfig {
        @ConfigEntry.Category("config")
        @ConfigEntry.BoundedDiscrete(max=100L)
        public int lal_dungeons = 20;
        @ConfigEntry.Category("config")
        @ConfigEntry.BoundedDiscrete(max=100L)
        public int lal_ruined_library = 5;
        @ConfigEntry.Category("config")
        @ConfigEntry.BoundedDiscrete(max=100L)
        public int lal_pale_cabin = 5;
        @ConfigEntry.Category("config")
        @ConfigEntry.BoundedDiscrete(max=100L)
        public int lal_underground_cabins = 5;
        @ConfigEntry.Category("config")
        @ConfigEntry.BoundedDiscrete(max=100L)
        public int lal_spire = 5;
        @ConfigEntry.Category("config")
        @ConfigEntry.BoundedDiscrete(max=100L)
        public int lal_ruined_aether_portal = 5;
        @ConfigEntry.Category("config")
        @ConfigEntry.BoundedDiscrete(max=100L)
        public int dnt_stronghold = 5;
        @ConfigEntry.Category("config")
        @ConfigEntry.BoundedDiscrete(max=100L)
        public int ii_illager_fort = 20;
        @ConfigEntry.Category("config")
        @ConfigEntry.BoundedDiscrete(max=100L)
        public int ii_illusioner_tower = 10;
        @ConfigEntry.Category("config")
        @ConfigEntry.BoundedDiscrete(max=100L)
        public int ii_labyrinth = 5;
    }
}
