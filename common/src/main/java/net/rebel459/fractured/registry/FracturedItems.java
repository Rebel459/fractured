package net.rebel459.fractured.registry;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.rebel459.fractured.Fractured;
import net.rebel459.unified.platform.UnifiedRegistries;
import net.rebel459.unified.util.SuppliedItem;

public final class FracturedItems {

    public static UnifiedRegistries.Items ITEMS = UnifiedRegistries.Items.create(Fractured.MOD_ID);

    // Items
    public static final SuppliedItem FRACTURED_EYE = ITEMS.register("fractured_eye",
            Item::new,
            () -> new Properties()
                    .stacksTo(64)
    );

    public static void init() {}
}
