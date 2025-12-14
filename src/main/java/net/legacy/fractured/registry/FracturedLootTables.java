package net.legacy.fractured.registry;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.legacy.fractured.config.FracturedConfig;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.EmptyLootItem;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import org.jetbrains.annotations.NotNull;

public final class FracturedLootTables {

    public static final ResourceKey<LootTable> DUNGEON_CHEST = registerLegaciesAndLegends("chests/dungeon/chest");
    public static final ResourceKey<LootTable> RUINED_LIBRARY = registerLegaciesAndLegends("chests/ruined_library");
    public static final ResourceKey<LootTable> PALE_CABIN = registerLegaciesAndLegends("chests/pale_cabin/chest");
    public static final ResourceKey<LootTable> UNDERGOUND_CABIN = registerLegaciesAndLegends("chests/cabin/underground");
    public static final ResourceKey<LootTable> DEEP_CABIN = registerLegaciesAndLegends("chests/cabin/deep");
    public static final ResourceKey<LootTable> SPIRE = registerLegaciesAndLegends("chests/spire");
    public static final ResourceKey<LootTable> RUINED_AETHER_PORTAL = registerLegaciesAndLegends("chests/ruined_aether_portal");

    public static final ResourceKey<LootTable> DNT_STRONGHOLD = registerDungeonsAndTavernsVanilla("chests/stronghold/base");

    public static final ResourceKey<LootTable> ILLAGER_FORT = registerIllagerInvasion("chests/illager_fort_tower");
    public static final ResourceKey<LootTable> ILLUSIONER_TOWER = registerIllagerInvasion("chests/illusioner_tower_stairs");
    public static final ResourceKey<LootTable> LABYRINTH = registerIllagerInvasion("chests/labyrinth");
    public static final ResourceKey<LootTable> LABYRINTH_MAP = registerIllagerInvasion("chests/labyrinth_map");

    public static void init() {
        LootTableEvents.MODIFY.register((id, tableBuilder, source, registries) -> {
            LootPool.Builder pool;
            if (FracturedConfig.get.general.fractured_eyes) {

                // VANILLA

                addFracturedEye(tableBuilder, id, BuiltInLootTables.STRONGHOLD_CORRIDOR, FracturedConfig.get.vanilla_loot.stronghold);
                addFracturedEye(tableBuilder, id, BuiltInLootTables.STRONGHOLD_CROSSING, FracturedConfig.get.vanilla_loot.stronghold);

                addFracturedEye(tableBuilder, id, BuiltInLootTables.ABANDONED_MINESHAFT, FracturedConfig.get.vanilla_loot.abandoned_mineshaft);

                addFracturedEye(tableBuilder, id, BuiltInLootTables.DESERT_PYRAMID, FracturedConfig.get.vanilla_loot.desert_pyramid);

                addFracturedEye(tableBuilder, id, BuiltInLootTables.JUNGLE_TEMPLE, FracturedConfig.get.vanilla_loot.jungle_temple);

                addFracturedEye(tableBuilder, id, BuiltInLootTables.NETHER_BRIDGE, FracturedConfig.get.vanilla_loot.nether_fortress);

                addFracturedEye(tableBuilder, id, BuiltInLootTables.SHIPWRECK_TREASURE, FracturedConfig.get.vanilla_loot.shipwreck);

                addFracturedEye(tableBuilder, id, BuiltInLootTables.IGLOO_CHEST, FracturedConfig.get.vanilla_loot.igloo);

                addFracturedEye(tableBuilder, id, BuiltInLootTables.SIMPLE_DUNGEON, FracturedConfig.get.vanilla_loot.dungeon);

                addFracturedEye(tableBuilder, id, BuiltInLootTables.WOODLAND_MANSION, FracturedConfig.get.vanilla_loot.woodland_mansion);

                addFracturedEye(tableBuilder, id, BuiltInLootTables.PILLAGER_OUTPOST, FracturedConfig.get.vanilla_loot.pillager_outpost);

                addFracturedEye(tableBuilder, id, BuiltInLootTables.BASTION_BRIDGE, FracturedConfig.get.vanilla_loot.bastion_remnant);
                addFracturedEye(tableBuilder, id, BuiltInLootTables.BASTION_OTHER, FracturedConfig.get.vanilla_loot.bastion_remnant);

                addFracturedEye(tableBuilder, id, BuiltInLootTables.UNDERWATER_RUIN_BIG, FracturedConfig.get.vanilla_loot.ocean_ruins);
                addFracturedEye(tableBuilder, id, BuiltInLootTables.UNDERWATER_RUIN_SMALL, FracturedConfig.get.vanilla_loot.ocean_ruins);

                addFracturedEye(tableBuilder, id, BuiltInLootTables.RUINED_PORTAL, FracturedConfig.get.vanilla_loot.ruined_portal);

                addFracturedEye(tableBuilder, id, BuiltInLootTables.ANCIENT_CITY, FracturedConfig.get.vanilla_loot.ancient_city);

                addFracturedEye(tableBuilder, id, BuiltInLootTables.BURIED_TREASURE, FracturedConfig.get.vanilla_loot.buried_treasure);

                // INTEGRATION

                addFracturedEye(tableBuilder, id, DUNGEON_CHEST, FracturedConfig.get.integration_loot.lal_dungeons);
                addFracturedEye(tableBuilder, id, RUINED_LIBRARY, FracturedConfig.get.integration_loot.lal_ruined_library);
                addFracturedEye(tableBuilder, id, PALE_CABIN, FracturedConfig.get.integration_loot.lal_pale_cabin);
                addFracturedEye(tableBuilder, id, UNDERGOUND_CABIN, FracturedConfig.get.integration_loot.lal_underground_cabins);
                addFracturedEye(tableBuilder, id, DEEP_CABIN, FracturedConfig.get.integration_loot.lal_underground_cabins);
                addFracturedEye(tableBuilder, id, SPIRE, FracturedConfig.get.integration_loot.lal_spire);
                addFracturedEye(tableBuilder, id, RUINED_AETHER_PORTAL, FracturedConfig.get.integration_loot.lal_ruined_aether_portal);

                addFracturedEye(tableBuilder, id, DNT_STRONGHOLD, FracturedConfig.get.integration_loot.dnt_stronghold);

                addFracturedEye(tableBuilder, id, ILLAGER_FORT, FracturedConfig.get.integration_loot.ii_illager_fort);
                addFracturedEye(tableBuilder, id, ILLUSIONER_TOWER, FracturedConfig.get.integration_loot.ii_illusioner_tower);
                addFracturedEye(tableBuilder, id, LABYRINTH, FracturedConfig.get.integration_loot.ii_labyrinth);
                addFracturedEye(tableBuilder, id, LABYRINTH_MAP, FracturedConfig.get.integration_loot.ii_labyrinth);
            }
        });
    }

    public static void addFracturedEye(LootTable.Builder builder, ResourceKey<LootTable> id, ResourceKey<LootTable> table, int config) {
        if (!table.equals(id) || config == 0) return;
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
        builder.withPool(pool);
    }

    private static @NotNull ResourceKey<LootTable> registerLegaciesAndLegends(String path) {
        return ResourceKey.create(Registries.LOOT_TABLE, Identifier.fromNamespaceAndPath("legacies_and_legends", path));
    }

    private static @NotNull ResourceKey<LootTable> registerDungeonsAndTaverns(String path) {
        return ResourceKey.create(Registries.LOOT_TABLE, Identifier.fromNamespaceAndPath("nova_structures", path));
    }
    private static @NotNull ResourceKey<LootTable> registerDungeonsAndTavernsVanilla(String path) {
        return ResourceKey.create(Registries.LOOT_TABLE, Identifier.fromNamespaceAndPath("minecraft", path));
    }

    private static @NotNull ResourceKey<LootTable> registerIllagerInvasion(String path) {
        return ResourceKey.create(Registries.LOOT_TABLE, Identifier.fromNamespaceAndPath("illagerinvasion", path));
    }
}