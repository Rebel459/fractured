package net.legacy.fractured;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

import java.io.IOException;
import java.util.Optional;

public class Fractured implements ModInitializer {
	@Override
	public void onInitialize() {
		Optional<ModContainer> modContainer = FabricLoader.getInstance().getModContainer("fractured");

		try {
			FracturedConfig.main();
		} catch (IOException var3) {
			IOException e = var3;
			throw new RuntimeException(e);
		}

		FracturedItems.init();
		FracturedCreativeInventorySorting.init();
		FracturedLootTables.init();

	}

	public static ResourceLocation id(String path) {
		return ResourceLocation.fromNamespaceAndPath("fractured", path);
	}
}