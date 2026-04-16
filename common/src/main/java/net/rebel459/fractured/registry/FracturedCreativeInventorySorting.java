package net.rebel459.fractured.registry;

import net.minecraft.world.item.Items;
import net.rebel459.unified.platform.UnifiedHelpers;
import net.rebel459.unified.util.CreativeModeTabs;

public class FracturedCreativeInventorySorting {

    public static void init() {
        UnifiedHelpers.CREATIVE_ENTRIES.insertBefore(CreativeModeTabs.INGREDIENTS, Items.ENDER_EYE, FracturedItems.FRACTURED_EYE);
    }
}

