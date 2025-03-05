package net.legacy.fractured.registry;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.legacy.fractured.config.FracturedConfig;
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
            if (FracturedConfig.get.general.fractured_eyes) {
                // Stronghold
                if (BuiltInLootTables.STRONGHOLD_CORRIDOR.equals(id) && FracturedConfig.get.eye_chances.stronghold > 0 && FracturedConfig.get.eye_chances.stronghold < 100) {
                    pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                            .add(EmptyLootItem.emptyItem().setWeight(100 - FracturedConfig.get.eye_chances.stronghold))
                            .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(FracturedConfig.get.eye_chances.stronghold)
                            );
                    tableBuilder.withPool(pool);
                } else if (BuiltInLootTables.STRONGHOLD_CORRIDOR.equals(id) && FracturedConfig.get.eye_chances.stronghold >= 100) {
                    pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                            .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                            );
                    tableBuilder.withPool(pool);
                }
                if (BuiltInLootTables.STRONGHOLD_CROSSING.equals(id) && FracturedConfig.get.eye_chances.stronghold > 0 && FracturedConfig.get.eye_chances.stronghold < 100) {
                    pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                            .add(EmptyLootItem.emptyItem().setWeight(100 - FracturedConfig.get.eye_chances.stronghold))
                            .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(FracturedConfig.get.eye_chances.stronghold)
                            );
                    tableBuilder.withPool(pool);
                } else if (BuiltInLootTables.STRONGHOLD_CORRIDOR.equals(id) && FracturedConfig.get.eye_chances.stronghold >= 100) {
                    pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                            .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                            );
                    tableBuilder.withPool(pool);
                }

                // Abandoned Mineshaft
                if (BuiltInLootTables.ABANDONED_MINESHAFT.equals(id) && FracturedConfig.get.eye_chances.abandoned_mineshaft > 0 && FracturedConfig.get.eye_chances.abandoned_mineshaft < 100) {
                    pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                            .add(EmptyLootItem.emptyItem().setWeight(100 - FracturedConfig.get.eye_chances.abandoned_mineshaft))
                            .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(FracturedConfig.get.eye_chances.abandoned_mineshaft)
                            );
                    tableBuilder.withPool(pool);
                } else if (BuiltInLootTables.ABANDONED_MINESHAFT.equals(id) && FracturedConfig.get.eye_chances.abandoned_mineshaft >= 100) {
                    pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                            .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                            );
                    tableBuilder.withPool(pool);
                }

                if (BuiltInLootTables.DESERT_PYRAMID.equals(id) && FracturedConfig.get.eye_chances.desert_pyramid > 0 && FracturedConfig.get.eye_chances.desert_pyramid < 100) {
                    pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                            .add(EmptyLootItem.emptyItem().setWeight(100 - FracturedConfig.get.eye_chances.desert_pyramid))
                            .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(FracturedConfig.get.eye_chances.desert_pyramid)
                            );
                    tableBuilder.withPool(pool);
                } else if (BuiltInLootTables.DESERT_PYRAMID.equals(id) && FracturedConfig.get.eye_chances.desert_pyramid >= 100) {
                    pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                            .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                            );
                    tableBuilder.withPool(pool);
                }

                // Jungle Temple
                if (BuiltInLootTables.JUNGLE_TEMPLE.equals(id) && FracturedConfig.get.eye_chances.jungle_temple > 0 && FracturedConfig.get.eye_chances.jungle_temple < 100) {
                    pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                            .add(EmptyLootItem.emptyItem().setWeight(100 - FracturedConfig.get.eye_chances.jungle_temple))
                            .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(FracturedConfig.get.eye_chances.jungle_temple)
                            );
                    tableBuilder.withPool(pool);
                } else if (BuiltInLootTables.JUNGLE_TEMPLE.equals(id) && FracturedConfig.get.eye_chances.jungle_temple >= 100) {
                    pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                            .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                            );
                    tableBuilder.withPool(pool);
                }

                // Nether Bridge
                if (BuiltInLootTables.NETHER_BRIDGE.equals(id) && FracturedConfig.get.eye_chances.nether_fortress > 0 && FracturedConfig.get.eye_chances.nether_fortress < 100) {
                    pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                            .add(EmptyLootItem.emptyItem().setWeight(100 - FracturedConfig.get.eye_chances.nether_fortress))
                            .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(FracturedConfig.get.eye_chances.nether_fortress)
                            );
                    tableBuilder.withPool(pool);
                } else if (BuiltInLootTables.NETHER_BRIDGE.equals(id) && FracturedConfig.get.eye_chances.nether_fortress >= 100) {
                    pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                            .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                            );
                    tableBuilder.withPool(pool);
                }

                // Shipwreck Treasure
                if (BuiltInLootTables.SHIPWRECK_TREASURE.equals(id) && FracturedConfig.get.eye_chances.shipwreck > 0 && FracturedConfig.get.eye_chances.shipwreck < 100) {
                    pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                            .add(EmptyLootItem.emptyItem().setWeight(100 - FracturedConfig.get.eye_chances.shipwreck))
                            .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(FracturedConfig.get.eye_chances.shipwreck)
                            );
                    tableBuilder.withPool(pool);
                } else if (BuiltInLootTables.SHIPWRECK_TREASURE.equals(id) && FracturedConfig.get.eye_chances.shipwreck >= 100) {
                    pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                            .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                            );
                    tableBuilder.withPool(pool);
                }

                // Igloo
                if (BuiltInLootTables.IGLOO_CHEST.equals(id) && FracturedConfig.get.eye_chances.igloo > 0 && FracturedConfig.get.eye_chances.igloo < 100) {
                    pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                            .add(EmptyLootItem.emptyItem().setWeight(100 - FracturedConfig.get.eye_chances.igloo))
                            .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(FracturedConfig.get.eye_chances.igloo)
                            );
                    tableBuilder.withPool(pool);
                } else if (BuiltInLootTables.IGLOO_CHEST.equals(id) && FracturedConfig.get.eye_chances.igloo >= 100) {
                    pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                            .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                            );
                    tableBuilder.withPool(pool);
                }

                // Dungeon
                if (BuiltInLootTables.SIMPLE_DUNGEON.equals(id) && FracturedConfig.get.eye_chances.dungeon > 0 && FracturedConfig.get.eye_chances.dungeon < 100) {
                    pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                            .add(EmptyLootItem.emptyItem().setWeight(100 - FracturedConfig.get.eye_chances.dungeon))
                            .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(FracturedConfig.get.eye_chances.dungeon)
                            );
                    tableBuilder.withPool(pool);
                } else if (BuiltInLootTables.SIMPLE_DUNGEON.equals(id) && FracturedConfig.get.eye_chances.dungeon >= 100) {
                    pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                            .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                            );
                    tableBuilder.withPool(pool);
                }

                // Woodland Mansion
                if (BuiltInLootTables.WOODLAND_MANSION.equals(id) && FracturedConfig.get.eye_chances.woodland_mansion > 0 && FracturedConfig.get.eye_chances.woodland_mansion < 100) {
                    pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                            .add(EmptyLootItem.emptyItem().setWeight(100 - FracturedConfig.get.eye_chances.woodland_mansion))
                            .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(FracturedConfig.get.eye_chances.woodland_mansion)
                            );
                    tableBuilder.withPool(pool);
                } else if (BuiltInLootTables.WOODLAND_MANSION.equals(id) && FracturedConfig.get.eye_chances.woodland_mansion >= 100) {
                    pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                            .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                            );
                    tableBuilder.withPool(pool);
                }

                // Pillager Outpost
                if (BuiltInLootTables.PILLAGER_OUTPOST.equals(id) && FracturedConfig.get.eye_chances.pillager_outpost > 0 && FracturedConfig.get.eye_chances.pillager_outpost < 100) {
                    pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                            .add(EmptyLootItem.emptyItem().setWeight(100 - FracturedConfig.get.eye_chances.pillager_outpost))
                            .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(FracturedConfig.get.eye_chances.pillager_outpost)
                            );
                    tableBuilder.withPool(pool);
                } else if (BuiltInLootTables.PILLAGER_OUTPOST.equals(id) && FracturedConfig.get.eye_chances.pillager_outpost >= 100) {
                    pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                            .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                            );
                    tableBuilder.withPool(pool);
                }

                // Bastion Remnant
                if (BuiltInLootTables.BASTION_BRIDGE.equals(id) && FracturedConfig.get.eye_chances.bastion_remnant > 0 && FracturedConfig.get.eye_chances.bastion_remnant < 100) {
                    pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                            .add(EmptyLootItem.emptyItem().setWeight(100 - FracturedConfig.get.eye_chances.bastion_remnant))
                            .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(FracturedConfig.get.eye_chances.bastion_remnant)
                            );
                    tableBuilder.withPool(pool);
                } else if (BuiltInLootTables.BASTION_BRIDGE.equals(id) && FracturedConfig.get.eye_chances.bastion_remnant >= 100) {
                    pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                            .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                            );
                    tableBuilder.withPool(pool);
                }
                if (BuiltInLootTables.BASTION_OTHER.equals(id) && FracturedConfig.get.eye_chances.bastion_remnant > 0 && FracturedConfig.get.eye_chances.bastion_remnant < 100) {
                    pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                            .add(EmptyLootItem.emptyItem().setWeight(100 - FracturedConfig.get.eye_chances.bastion_remnant))
                            .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(FracturedConfig.get.eye_chances.bastion_remnant)
                            );
                    tableBuilder.withPool(pool);
                } else if (BuiltInLootTables.BASTION_OTHER.equals(id) && FracturedConfig.get.eye_chances.bastion_remnant >= 100) {
                    pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                            .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                            );
                    tableBuilder.withPool(pool);
                }

                // Ocean Ruin
                if (BuiltInLootTables.UNDERWATER_RUIN_BIG.equals(id) && FracturedConfig.get.eye_chances.ocean_ruins > 0 && FracturedConfig.get.eye_chances.ocean_ruins < 100) {
                    pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                            .add(EmptyLootItem.emptyItem().setWeight(100 - FracturedConfig.get.eye_chances.ocean_ruins))
                            .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(FracturedConfig.get.eye_chances.ocean_ruins)
                            );
                    tableBuilder.withPool(pool);
                } else if (BuiltInLootTables.UNDERWATER_RUIN_BIG.equals(id) && FracturedConfig.get.eye_chances.ocean_ruins >= 100) {
                    pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                            .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                            );
                    tableBuilder.withPool(pool);
                }
                if (BuiltInLootTables.UNDERWATER_RUIN_SMALL.equals(id) && FracturedConfig.get.eye_chances.ocean_ruins > 0 && FracturedConfig.get.eye_chances.ocean_ruins < 100) {
                    pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                            .add(EmptyLootItem.emptyItem().setWeight(100 - FracturedConfig.get.eye_chances.ocean_ruins))
                            .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(FracturedConfig.get.eye_chances.ocean_ruins)
                            );
                    tableBuilder.withPool(pool);
                } else if (BuiltInLootTables.UNDERWATER_RUIN_SMALL.equals(id) && FracturedConfig.get.eye_chances.ocean_ruins >= 100) {
                    pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                            .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                            );
                    tableBuilder.withPool(pool);
                }

                // Ruined Portal
                if (BuiltInLootTables.RUINED_PORTAL.equals(id) && FracturedConfig.get.eye_chances.ruined_portal > 0 && FracturedConfig.get.eye_chances.ruined_portal < 100) {
                    pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                            .add(EmptyLootItem.emptyItem().setWeight(100 - FracturedConfig.get.eye_chances.ruined_portal))
                            .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(FracturedConfig.get.eye_chances.ruined_portal)
                            );
                    tableBuilder.withPool(pool);
                } else if (BuiltInLootTables.RUINED_PORTAL.equals(id) && FracturedConfig.get.eye_chances.ruined_portal >= 100) {
                    pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                            .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                            );
                    tableBuilder.withPool(pool);
                }

                if (BuiltInLootTables.ANCIENT_CITY.equals(id) && FracturedConfig.get.eye_chances.ancient_city > 0 && FracturedConfig.get.eye_chances.ancient_city < 100) {
                    pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                            .add(EmptyLootItem.emptyItem().setWeight(100 - FracturedConfig.get.eye_chances.ancient_city))
                            .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(FracturedConfig.get.eye_chances.ancient_city)
                            );
                    tableBuilder.withPool(pool);
                } else if (BuiltInLootTables.ANCIENT_CITY.equals(id) && FracturedConfig.get.eye_chances.ancient_city >= 100) {
                    pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                            .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                            );
                    tableBuilder.withPool(pool);
                }

                if (BuiltInLootTables.BURIED_TREASURE.equals(id) && FracturedConfig.get.eye_chances.buried_treasure > 0 && FracturedConfig.get.eye_chances.buried_treasure < 100) {
                    pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                            .add(EmptyLootItem.emptyItem().setWeight(100 - FracturedConfig.get.eye_chances.buried_treasure))
                            .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(FracturedConfig.get.eye_chances.buried_treasure)
                            );
                    tableBuilder.withPool(pool);
                } else if (BuiltInLootTables.BURIED_TREASURE.equals(id) && FracturedConfig.get.eye_chances.buried_treasure >= 100) {
                    pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                            .add(LootItem.lootTableItem(FracturedItems.FRACTURED_EYE).setWeight(1)
                            );
                    tableBuilder.withPool(pool);
                }
            }
        });
    }
}