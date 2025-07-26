package net.legacy.fractured;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.legacy.fractured.config.FracturedConfig;
import net.legacy.fractured.registry.FracturedCreativeInventorySorting;
import net.legacy.fractured.registry.FracturedItems;
import net.legacy.fractured.registry.FracturedLootTables;
import net.minecraft.resources.ResourceLocation;

import java.util.Optional;

public class Fractured implements ModInitializer {
	@Override
	public void onInitialize() {
		Optional<ModContainer> modContainer = FabricLoader.getInstance().getModContainer(MOD_ID);

		FracturedItems.init();
		FracturedCreativeInventorySorting.init();
		FracturedLootTables.init();
		FracturedConfig.init();

	}

	public static ResourceLocation id(String path) {
		return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
	}
	public static final String MOD_ID = "fractured";
}