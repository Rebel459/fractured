package net.legacy.fractured;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.world.level.ItemLike;

import static net.minecraft.world.item.Items.registerBlock;

public final class FracturedItems {
    private FracturedItems() {}

    public static final Item FRACTURED_EYE = new Item(new Item.Properties().stacksTo(64));

    public static void register() {
        registerItemBefore(Items.ENDER_EYE, FRACTURED_EYE, "fractured_eye", CreativeModeTabs.INGREDIENTS);

    }

    @SafeVarargs
    private static void registerItemBefore(@FracturedNotNull ItemLike comparedItem, @FracturedNotNull Item item, @FracturedNotNull String path, @FracturedNotNull ResourceKey<CreativeModeTab>... tabs) {
        registerItemBefore(comparedItem, item, path, CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS, tabs);
    }

    @SafeVarargs
    private static void registerItemBefore(@FracturedNotNull ItemLike comparedItem, @FracturedNotNull Item item, @FracturedNotNull String path, @FracturedNotNull CreativeModeTab.TabVisibility tabVisibility, @FracturedNotNull ResourceKey<CreativeModeTab>... tabs) {
        actualRegister(item, path);
        FracturedCreativeTabs.addBefore(comparedItem, item, tabVisibility, tabs);
    }


    @SafeVarargs
    private static void registerItemAfter(@FracturedNotNull ItemLike comparedItem, @FracturedNotNull Item item, @FracturedNotNull String path, @FracturedNotNull ResourceKey<CreativeModeTab>... tabs) {
        registerItemAfter(comparedItem, item, path, CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS, tabs);
    }

    @SafeVarargs
    private static void registerItemAfter(@FracturedNotNull ItemLike comparedItem, @FracturedNotNull Item item, @FracturedNotNull String path, @FracturedNotNull CreativeModeTab.TabVisibility tabVisibility, @FracturedNotNull ResourceKey<CreativeModeTab>... tabs) {
        actualRegister(item, path);
        FracturedCreativeTabs.addAfter(comparedItem, item, tabVisibility, tabs);
    }

    private static void actualRegister(@FracturedNotNull Item item, @FracturedNotNull String path) {
        if (BuiltInRegistries.ITEM.getOptional(Fractured.id(path)).isEmpty()) {
            Registry.register(BuiltInRegistries.ITEM, Fractured.id(path), item);
        }
    }
}