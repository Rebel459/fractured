package net.rebel459.fractured;

import me.shedaniel.autoconfig.AutoConfigClient;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import net.rebel459.fractured.config.FracturedConfig;

@Mod(value = Fractured.MOD_ID, dist = Dist.CLIENT)
public class FracturedNeoForgeClient {

    public FracturedNeoForgeClient(IEventBus modEventBus) {
        ModLoadingContext.get().registerExtensionPoint(
                IConfigScreenFactory.class,
                () -> (modContainer, parent) ->
                        AutoConfigClient.getConfigScreen(FracturedConfig.class, parent).get()
        );
    }
}