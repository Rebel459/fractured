package net.legacy.fractured.registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class FracturedCreativeInventorySorting {

    public static void init() {
        addBeforeInIngredients(Items.ENDER_EYE, FracturedItems.FRACTURED_EYE);
    }

    private static void addBeforeInIngredients(ItemLike comparedItem, ItemLike item) {
        addBefore(comparedItem, item, CreativeModeTabs.INGREDIENTS);
    }

    public static void addBefore(ItemLike comparedItem, ItemLike item, ResourceKey<CreativeModeTab>... tabs) {
        addBefore(comparedItem, item, CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS, tabs);
    }

    public static void addBefore(ItemLike comparedItem, ItemLike item, CreativeModeTab.TabVisibility tabVisibility, @NotNull ResourceKey<CreativeModeTab>... tabs) {
        if (comparedItem != null && item != null) {
            for(ResourceKey<CreativeModeTab> tab : tabs) {
                ItemStack stack = new ItemStack(item);
                stack.setCount(1);
                List<ItemStack> list = List.of(stack);
                ItemGroupEvents.modifyEntriesEvent(tab).register((entries) -> entries.addBefore(comparedItem, list, tabVisibility));
            }
        }
    }
}

