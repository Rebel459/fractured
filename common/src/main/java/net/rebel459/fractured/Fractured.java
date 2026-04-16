package net.rebel459.fractured;

import net.rebel459.fractured.config.FracturedConfig;
import net.rebel459.fractured.registry.FracturedCreativeInventorySorting;
import net.rebel459.fractured.registry.FracturedItems;
import net.rebel459.fractured.registry.FracturedLootTables;
import net.minecraft.resources.Identifier;

import java.util.Optional;

public class Fractured {

	public static void initRegistries() {
		FracturedConfig.init();
		FracturedItems.init();
	}

	public static void init() {
		FracturedCreativeInventorySorting.init();
		FracturedLootTables.init();
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
	public static final String MOD_ID = "fractured";
}