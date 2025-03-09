package net.legacy.fractured;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.legacy.fractured.config.FracturedConfig;
import net.legacy.fractured.registry.FracturedBlocks;
import net.legacy.fractured.registry.FracturedCreativeInventorySorting;
import net.legacy.fractured.registry.FracturedItems;
import net.legacy.fractured.registry.FracturedLootTables;
import net.minecraft.resources.ResourceLocation;

import java.io.IOException;
import java.util.Optional;

public class Fractured implements ModInitializer {
	@Override
	public void onInitialize() {
		Optional<ModContainer> modContainer = FabricLoader.getInstance().getModContainer(MOD_ID);

		FracturedItems.init();
		FracturedBlocks.init();
		FracturedCreativeInventorySorting.init();
		FracturedLootTables.init();

	}

	public static ResourceLocation id(String path) {
		return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
	}
	public static final String MOD_ID = "fractured";


	//HANGING LEAVES RENDERING STUFF
	/*
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HANGING_LEAVES, RenderLayer.getCutout());


		ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
			if (world != null && pos != null) {
				//causes crash if no checker
				if (world.getBiomeFabric(pos) != null) {
					return world.getBiomeFabric(pos).value().getFoliageColor();
				}
			}
			return FoliageColors.DEFAULT;
		}, ModBlocks.HANGING_LEAVES);
	 */
}