package net.legacy.fractured;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.EmptyLootItem;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

public final class FracturedLootTables {
    public FracturedLootTables() {
    }

    public static void init() {
        LootTableEvents.MODIFY.register((id, tableBuilder, source, registries) -> {
            LootPool.Builder pool;

            // Stronghold
            if (BuiltInLootTables.STRONGHOLD_CORRIDOR.equals(id) && FracturedConfig.stronghold_eye_chance > 0 && FracturedConfig.stronghold_eye_chance < 100) {
                pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(EmptyLootItem.emptyItem().setWeight(100 - FracturedConfig.stronghold_eye_chance))
                        .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(FracturedConfig.stronghold_eye_chance)
                        );tableBuilder.withPool(pool);
            }
            else if (BuiltInLootTables.STRONGHOLD_CORRIDOR.equals(id) && FracturedConfig.stronghold_eye_chance >= 100) {
                pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                        );tableBuilder.withPool(pool);
            }
            if (BuiltInLootTables.STRONGHOLD_CROSSING.equals(id) && FracturedConfig.stronghold_eye_chance > 0 && FracturedConfig.stronghold_eye_chance < 100) {
                pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(EmptyLootItem.emptyItem().setWeight(100-FracturedConfig.stronghold_eye_chance))
                        .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(FracturedConfig.stronghold_eye_chance)
                        );tableBuilder.withPool(pool);
            }
            else if (BuiltInLootTables.STRONGHOLD_CORRIDOR.equals(id) && FracturedConfig.stronghold_eye_chance >= 100) {
                pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                        );tableBuilder.withPool(pool);
            }

            // Abandoned Mineshaft
            if (BuiltInLootTables.ABANDONED_MINESHAFT.equals(id) && FracturedConfig.abandoned_mineshaft_eye_chance > 0 && FracturedConfig.abandoned_mineshaft_eye_chance < 100) {
                pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(EmptyLootItem.emptyItem().setWeight(100-FracturedConfig.abandoned_mineshaft_eye_chance))
                        .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(FracturedConfig.abandoned_mineshaft_eye_chance)
                        );tableBuilder.withPool(pool);
            }
            else if (BuiltInLootTables.ABANDONED_MINESHAFT.equals(id) && FracturedConfig.abandoned_mineshaft_eye_chance >= 100) {
                pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                        );tableBuilder.withPool(pool);
            }

            if (BuiltInLootTables.DESERT_PYRAMID.equals(id) && FracturedConfig.desert_pyramid_eye_chance > 0 && FracturedConfig.desert_pyramid_eye_chance < 100) {
                pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(EmptyLootItem.emptyItem().setWeight(100-FracturedConfig.desert_pyramid_eye_chance))
                        .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(FracturedConfig.desert_pyramid_eye_chance)
                        );tableBuilder.withPool(pool);
            }
            else if (BuiltInLootTables.DESERT_PYRAMID.equals(id) && FracturedConfig.desert_pyramid_eye_chance >= 100) {
                pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                        );tableBuilder.withPool(pool);
            }

            // Jungle Temple
            if (BuiltInLootTables.JUNGLE_TEMPLE.equals(id) && FracturedConfig.jungle_temple_eye_chance > 0 && FracturedConfig.jungle_temple_eye_chance < 100) {
                pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(EmptyLootItem.emptyItem().setWeight(100-FracturedConfig.jungle_temple_eye_chance))
                        .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(FracturedConfig.jungle_temple_eye_chance)
                        );tableBuilder.withPool(pool);
            }
            else if (BuiltInLootTables.JUNGLE_TEMPLE.equals(id) && FracturedConfig.jungle_temple_eye_chance >= 100) {
                pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                        );tableBuilder.withPool(pool);
            }

            // Nether Bridge
            if (BuiltInLootTables.NETHER_BRIDGE.equals(id) && FracturedConfig.nether_fortress_eye_chance > 0 && FracturedConfig.nether_fortress_eye_chance < 100) {
                pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(EmptyLootItem.emptyItem().setWeight(100-FracturedConfig.nether_fortress_eye_chance))
                        .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(FracturedConfig.nether_fortress_eye_chance)
                        );tableBuilder.withPool(pool);
            }
            else if (BuiltInLootTables.NETHER_BRIDGE.equals(id) && FracturedConfig.nether_fortress_eye_chance >= 100) {
                pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                        );tableBuilder.withPool(pool);
            }

            // Shipwreck Treasure
            if (BuiltInLootTables.SHIPWRECK_TREASURE.equals(id) && FracturedConfig.shipwreck_eye_chance > 0 && FracturedConfig.shipwreck_eye_chance < 100) {
                pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(EmptyLootItem.emptyItem().setWeight(100-FracturedConfig.shipwreck_eye_chance))
                        .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(FracturedConfig.shipwreck_eye_chance)
                        );tableBuilder.withPool(pool);
            }
            else if (BuiltInLootTables.SHIPWRECK_TREASURE.equals(id) && FracturedConfig.shipwreck_eye_chance >= 100) {
                pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                        );tableBuilder.withPool(pool);
            }

            // Igloo
            if (BuiltInLootTables.IGLOO_CHEST.equals(id) && FracturedConfig.igloo_eye_chance > 0 && FracturedConfig.igloo_eye_chance < 100) {
                pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(EmptyLootItem.emptyItem().setWeight(100-FracturedConfig.igloo_eye_chance))
                        .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(FracturedConfig.igloo_eye_chance)
                        );tableBuilder.withPool(pool);
            }
            else if (BuiltInLootTables.IGLOO_CHEST.equals(id) && FracturedConfig.igloo_eye_chance >= 100) {
                pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                        );tableBuilder.withPool(pool);
            }

            // Dungeon
            if (BuiltInLootTables.SIMPLE_DUNGEON.equals(id) && FracturedConfig.dungeon_eye_chance > 0 && FracturedConfig.dungeon_eye_chance < 100) {
                pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(EmptyLootItem.emptyItem().setWeight(100-FracturedConfig.dungeon_eye_chance))
                        .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(FracturedConfig.dungeon_eye_chance)
                        );tableBuilder.withPool(pool);
            }
            else if (BuiltInLootTables.SIMPLE_DUNGEON.equals(id) && FracturedConfig.dungeon_eye_chance >= 100) {
                pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                        );tableBuilder.withPool(pool);
            }

            // Woodland Mansion
            if (BuiltInLootTables.WOODLAND_MANSION.equals(id) && FracturedConfig.woodland_mansion_eye_chance > 0 && FracturedConfig.woodland_mansion_eye_chance < 100) {
                pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(EmptyLootItem.emptyItem().setWeight(100-FracturedConfig.woodland_mansion_eye_chance))
                        .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(FracturedConfig.woodland_mansion_eye_chance)
                        );tableBuilder.withPool(pool);
            }
            else if (BuiltInLootTables.WOODLAND_MANSION.equals(id) && FracturedConfig.woodland_mansion_eye_chance >= 100) {
                pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                        );tableBuilder.withPool(pool);
            }

            // Pillager Outpost
            if (BuiltInLootTables.PILLAGER_OUTPOST.equals(id) && FracturedConfig.pillager_outpost_eye_chance > 0 && FracturedConfig.pillager_outpost_eye_chance < 100) {
                pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(EmptyLootItem.emptyItem().setWeight(100-FracturedConfig.pillager_outpost_eye_chance))
                        .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(FracturedConfig.pillager_outpost_eye_chance)
                        );tableBuilder.withPool(pool);
            }
            else if (BuiltInLootTables.PILLAGER_OUTPOST.equals(id) && FracturedConfig.pillager_outpost_eye_chance >= 100) {
                pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                        );tableBuilder.withPool(pool);
            }

            // Bastion Remnant
            if (BuiltInLootTables.BASTION_BRIDGE.equals(id) && FracturedConfig.bastion_remnant_eye_chance > 0 && FracturedConfig.bastion_remnant_eye_chance < 100) {
                pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(EmptyLootItem.emptyItem().setWeight(100-FracturedConfig.bastion_remnant_eye_chance))
                        .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(FracturedConfig.bastion_remnant_eye_chance)
                        );tableBuilder.withPool(pool);
            }
            else if (BuiltInLootTables.BASTION_BRIDGE.equals(id) && FracturedConfig.bastion_remnant_eye_chance >= 100) {
                pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                        );tableBuilder.withPool(pool);
            }
            if (BuiltInLootTables.BASTION_OTHER.equals(id) && FracturedConfig.bastion_remnant_eye_chance > 0 && FracturedConfig.bastion_remnant_eye_chance < 100) {
                pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(EmptyLootItem.emptyItem().setWeight(100-FracturedConfig.bastion_remnant_eye_chance))
                        .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(FracturedConfig.bastion_remnant_eye_chance)
                        );tableBuilder.withPool(pool);
            }
            else if (BuiltInLootTables.BASTION_OTHER.equals(id) && FracturedConfig.bastion_remnant_eye_chance >= 100) {
                pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                        );tableBuilder.withPool(pool);
            }

            // Ocean Ruin
            if (BuiltInLootTables.UNDERWATER_RUIN_BIG.equals(id) && FracturedConfig.ocean_ruins_eye_chance > 0 && FracturedConfig.ocean_ruins_eye_chance < 100) {
                pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(EmptyLootItem.emptyItem().setWeight(100-FracturedConfig.ocean_ruins_eye_chance))
                        .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(FracturedConfig.ocean_ruins_eye_chance)
                        );tableBuilder.withPool(pool);
            }
            else if (BuiltInLootTables.UNDERWATER_RUIN_BIG.equals(id) && FracturedConfig.ocean_ruins_eye_chance >= 100) {
                pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                        );tableBuilder.withPool(pool);
            }
            if (BuiltInLootTables.UNDERWATER_RUIN_SMALL.equals(id) && FracturedConfig.ocean_ruins_eye_chance > 0 && FracturedConfig.ocean_ruins_eye_chance < 100) {
                pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(EmptyLootItem.emptyItem().setWeight(100-FracturedConfig.ocean_ruins_eye_chance))
                        .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(FracturedConfig.ocean_ruins_eye_chance)
                        );tableBuilder.withPool(pool);
            }
            else if (BuiltInLootTables.UNDERWATER_RUIN_SMALL.equals(id) && FracturedConfig.ocean_ruins_eye_chance >= 100) {
                pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                        );tableBuilder.withPool(pool);
            }

            // Ruined Portal
            if (BuiltInLootTables.RUINED_PORTAL.equals(id) && FracturedConfig.ruined_portal_eye_chance > 0 && FracturedConfig.ruined_portal_eye_chance < 100) {
                pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(EmptyLootItem.emptyItem().setWeight(100-FracturedConfig.ruined_portal_eye_chance))
                        .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(FracturedConfig.ruined_portal_eye_chance)
                        );tableBuilder.withPool(pool);
            }
            else if (BuiltInLootTables.RUINED_PORTAL.equals(id) && FracturedConfig.ruined_portal_eye_chance >= 100) {
                pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                        );tableBuilder.withPool(pool);
            }

            if (BuiltInLootTables.ANCIENT_CITY.equals(id) && FracturedConfig.ancient_city_eye_chance > 0 && FracturedConfig.ancient_city_eye_chance < 100) {
                pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(EmptyLootItem.emptyItem().setWeight(100-FracturedConfig.ancient_city_eye_chance))
                        .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(FracturedConfig.ancient_city_eye_chance)
                        );tableBuilder.withPool(pool);
            }
            else if (BuiltInLootTables.ANCIENT_CITY.equals(id) && FracturedConfig.ancient_city_eye_chance >= 100) {
                pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                        );tableBuilder.withPool(pool);
            }

            if (BuiltInLootTables.BURIED_TREASURE.equals(id) && FracturedConfig.buried_treasure_eye_chance > 0 && FracturedConfig.buried_treasure_eye_chance < 100) {
                pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(EmptyLootItem.emptyItem().setWeight(100-FracturedConfig.buried_treasure_eye_chance))
                        .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(FracturedConfig.buried_treasure_eye_chance)
                        );tableBuilder.withPool(pool);
            }
            else if (BuiltInLootTables.BURIED_TREASURE.equals(id) && FracturedConfig.buried_treasure_eye_chance >= 100) {
                pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                        );tableBuilder.withPool(pool);
            }
        });
    }
}