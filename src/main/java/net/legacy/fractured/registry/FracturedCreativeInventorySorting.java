package net.legacy.fractured.registry;

import net.frozenblock.lib.item.api.FrozenCreativeTabs;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;

public class FracturedCreativeInventorySorting {

    public static void init() {
        addBeforeInIngredients(Items.ENDER_EYE, FracturedItems.FRACTURED_EYE);
        addBeforeInNature(Items.VINE, FracturedBlocks.HANGING_LEAVES);
    }

    private static void addBeforeInIngredients(ItemLike comparedItem, ItemLike item) {
        FrozenCreativeTabs.addBefore(comparedItem, item, CreativeModeTabs.INGREDIENTS);
    }

    private static void addBeforeInNature(ItemLike comparedItem, ItemLike item) {
        FrozenCreativeTabs.addBefore(comparedItem, item, CreativeModeTabs.INGREDIENTS);
    }

}

