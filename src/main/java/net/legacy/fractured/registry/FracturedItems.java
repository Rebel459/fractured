package net.legacy.fractured.registry;

import net.legacy.fractured.Fractured;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item.Properties;
import org.jetbrains.annotations.NotNull;

import java.util.function.Function;

import static net.minecraft.world.item.Items.registerBlock;

public final class FracturedItems {

    // Items
    public static final Item FRACTURED_EYE = register("fractured_eye",
            Item::new,
            new Properties()
                    .stacksTo(64)
    );

    public static void init() {
    }

    private static @NotNull <T extends Item> T register(String name, @NotNull Function<Properties, Item> function, @NotNull Properties properties) {
        return (T) Items.registerItem(ResourceKey.create(Registries.ITEM, Fractured.id(name)), function, properties);
    }

}
