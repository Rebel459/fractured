package net.rebel459.fractured;

import net.fabricmc.api.ModInitializer;

public class FracturedFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        Fractured.initRegistries();
        Fractured.init();
    }
}
