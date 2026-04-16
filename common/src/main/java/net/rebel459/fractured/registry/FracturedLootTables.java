package net.rebel459.fractured.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.EmptyLootItem;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.rebel459.fractured.config.FracturedConfig;
import net.rebel459.unified.platform.EventsImpl;
import net.rebel459.unified.platform.UnifiedEvents;
import org.jetbrains.annotations.NotNull;

public final class FracturedLootTables {

    public static final ResourceKey<LootTable> DUNGEON_CHEST = registerLegaciesAndLegends("chests/dungeon/chest");
    public static final ResourceKey<LootTable> RUINED_LIBRARY = registerLegaciesAndLegends("chests/ruined_library");
    public static final ResourceKey<LootTable> PALE_CABIN = registerLegaciesAndLegends("chests/pale_cabin/chest");
    public static final ResourceKey<LootTable> UNDERGOUND_CABIN = registerLegaciesAndLegends("chests/cabin/underground");
    public static final ResourceKey<LootTable> DEEP_CABIN = registerLegaciesAndLegends("chests/cabin/deep");
    public static final ResourceKey<LootTable> SPIRE = registerLegaciesAndLegends("chests/spire");
    public static final ResourceKey<LootTable> RUINED_AETHER_PORTAL = registerLegaciesAndLegends("chests/ruined_aether_portal");

    public static final ResourceKey<LootTable> ENDERSCAPE_STRONGHOLD = registerEnderscape("stronghold/chest/altar");

    public static final ResourceKey<LootTable> DNT_STRONGHOLD = registerVanilla("chests/stronghold/base");

    public static final ResourceKey<LootTable> ILLAGER_FORT = registerIllagerInvasion("chests/illager_fort_tower");
    public static final ResourceKey<LootTable> ILLUSIONER_TOWER = registerIllagerInvasion("chests/illusioner_tower_stairs");
    public static final ResourceKey<LootTable> LABYRINTH = registerIllagerInvasion("chests/labyrinth");
    public static final ResourceKey<LootTable> LABYRINTH_MAP = registerIllagerInvasion("chests/labyrinth_map");

    public static void init() {
        UnifiedEvents.LootTables.modify((table, id, provider) -> {
            LootPool.Builder pool;
            if (FracturedConfig.get.general.fractured_eyes) {

                // VANILLA

                addFracturedEye(table, id, BuiltInLootTables.STRONGHOLD_CORRIDOR, FracturedConfig.get.vanilla_loot.stronghold);
                addFracturedEye(table, id, BuiltInLootTables.STRONGHOLD_CROSSING, FracturedConfig.get.vanilla_loot.stronghold);

                addFracturedEye(table, id, BuiltInLootTables.ABANDONED_MINESHAFT, FracturedConfig.get.vanilla_loot.abandoned_mineshaft);

                addFracturedEye(table, id, BuiltInLootTables.DESERT_PYRAMID, FracturedConfig.get.vanilla_loot.desert_pyramid);

                addFracturedEye(table, id, BuiltInLootTables.JUNGLE_TEMPLE, FracturedConfig.get.vanilla_loot.jungle_temple);

                addFracturedEye(table, id, BuiltInLootTables.NETHER_BRIDGE, FracturedConfig.get.vanilla_loot.nether_fortress);

                addFracturedEye(table, id, BuiltInLootTables.SHIPWRECK_TREASURE, FracturedConfig.get.vanilla_loot.shipwreck);

                addFracturedEye(table, id, BuiltInLootTables.IGLOO_CHEST, FracturedConfig.get.vanilla_loot.igloo);

                addFracturedEye(table, id, BuiltInLootTables.SIMPLE_DUNGEON, FracturedConfig.get.vanilla_loot.dungeon);

                addFracturedEye(table, id, BuiltInLootTables.WOODLAND_MANSION, FracturedConfig.get.vanilla_loot.woodland_mansion);

                addFracturedEye(table, id, BuiltInLootTables.PILLAGER_OUTPOST, FracturedConfig.get.vanilla_loot.pillager_outpost);

                addFracturedEye(table, id, BuiltInLootTables.BASTION_BRIDGE, FracturedConfig.get.vanilla_loot.bastion_remnant);
                addFracturedEye(table, id, BuiltInLootTables.BASTION_OTHER, FracturedConfig.get.vanilla_loot.bastion_remnant);

                addFracturedEye(table, id, BuiltInLootTables.UNDERWATER_RUIN_BIG, FracturedConfig.get.vanilla_loot.ocean_ruins);
                addFracturedEye(table, id, BuiltInLootTables.UNDERWATER_RUIN_SMALL, FracturedConfig.get.vanilla_loot.ocean_ruins);

                addFracturedEye(table, id, BuiltInLootTables.RUINED_PORTAL, FracturedConfig.get.vanilla_loot.ruined_portal);

                addFracturedEye(table, id, BuiltInLootTables.ANCIENT_CITY, FracturedConfig.get.vanilla_loot.ancient_city);

                addFracturedEye(table, id, BuiltInLootTables.BURIED_TREASURE, FracturedConfig.get.vanilla_loot.buried_treasure);

                // INTEGRATION

                addFracturedEye(table, id, DUNGEON_CHEST, FracturedConfig.get.integration_loot.lal_dungeons);
                addFracturedEye(table, id, RUINED_LIBRARY, FracturedConfig.get.integration_loot.lal_ruined_library);
                addFracturedEye(table, id, PALE_CABIN, FracturedConfig.get.integration_loot.lal_pale_cabin);
                addFracturedEye(table, id, UNDERGOUND_CABIN, FracturedConfig.get.integration_loot.lal_underground_cabins);
                addFracturedEye(table, id, DEEP_CABIN, FracturedConfig.get.integration_loot.lal_underground_cabins);
                addFracturedEye(table, id, SPIRE, FracturedConfig.get.integration_loot.lal_spire);
                addFracturedEye(table, id, RUINED_AETHER_PORTAL, FracturedConfig.get.integration_loot.lal_ruined_aether_portal);

                addFracturedEye(table, id, ENDERSCAPE_STRONGHOLD, FracturedConfig.get.integration_loot.enderscape_stronghold);

                addFracturedEye(table, id, DNT_STRONGHOLD, FracturedConfig.get.integration_loot.dnt_stronghold);

                addFracturedEye(table, id, ILLAGER_FORT, FracturedConfig.get.integration_loot.ii_illager_fort);
                addFracturedEye(table, id, ILLUSIONER_TOWER, FracturedConfig.get.integration_loot.ii_illusioner_tower);
                addFracturedEye(table, id, LABYRINTH, FracturedConfig.get.integration_loot.ii_labyrinth);
                addFracturedEye(table, id, LABYRINTH_MAP, FracturedConfig.get.integration_loot.ii_labyrinth);
            }
        });
    }

    public static void addFracturedEye(EventsImpl.LootTables.LootTable table, ResourceKey<LootTable> tableId, ResourceKey<LootTable> targetId, int config) {
        if (!targetId.equals(tableId) || config == 0) return;
        LootPool.Builder pool;
        if (config == 100) {
            pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                    .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                    );
        }
        else {
            pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                    .add(EmptyLootItem.emptyItem().setWeight(100 - config))
                    .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(config)
                    );
        }
        table.addPool(pool);
    }

    private static @NotNull ResourceKey<LootTable> registerLegaciesAndLegends(String path) {
        return ResourceKey.create(Registries.LOOT_TABLE, Identifier.fromNamespaceAndPath("legacies_and_legends", path));
    }

    private static @NotNull ResourceKey<LootTable> registerEnderscape(String path) {
        return ResourceKey.create(Registries.LOOT_TABLE, Identifier.fromNamespaceAndPath("enderscape", path));
    }

    private static @NotNull ResourceKey<LootTable> registerVanilla(String path) {
        return ResourceKey.create(Registries.LOOT_TABLE, Identifier.withDefaultNamespace(path));
    }

    private static @NotNull ResourceKey<LootTable> registerIllagerInvasion(String path) {
        return ResourceKey.create(Registries.LOOT_TABLE, Identifier.fromNamespaceAndPath("illagerinvasion", path));
    }
}