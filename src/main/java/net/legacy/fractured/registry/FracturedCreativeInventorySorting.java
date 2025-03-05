package net.legacy.fractured.registry;

import net.frozenblock.lib.item.api.FrozenCreativeTabs;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;

public class FracturedCreativeInventorySorting {

    public static void init() {
        addBeforeInIngredients(Items.ENDER_EYE, FracturedItems.FRACTURED_EYE);
    }

    private static void addBeforeInIngredients(ItemLike comparedItem, ItemLike item) {
        FrozenCreativeTabs.addBefore(comparedItem, item, CreativeModeTabs.INGREDIENTS);
    }

}

