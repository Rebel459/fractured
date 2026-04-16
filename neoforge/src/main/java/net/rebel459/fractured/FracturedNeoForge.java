package net.rebel459.fractured;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.rebel459.unified.platform.NeoForgeUnifiedRegistries;

@Mod(Fractured.MOD_ID)
public class FracturedNeoForge {

    public FracturedNeoForge(IEventBus modEventBus) {
        NeoForgeUnifiedRegistries.registerBus(Fractured.MOD_ID, modEventBus);
        Fractured.initRegistries();
        modEventBus.addListener(FracturedNeoForge::commonSetup);
    }

    private static void commonSetup(final FMLCommonSetupEvent event) {
        Fractured.init();
    }
}