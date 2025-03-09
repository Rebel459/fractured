package net.legacy.fractured.registry;

import net.frozenblock.lib.shadow.org.jetbrains.annotations.NotNull;
import net.legacy.fractured.Fractured;
import net.legacy.fractured.registry.blocks.HangingLeavesBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Function;

public class FracturedBlocks {

    // Blocks
    public static final Block HANGING_LEAVES = register("hanging_leaves",
            Block::new,
            new HangingLeavesBlock.properties()
                    .stacksTo(64)
    );

    //HANGING LEAVES BLOCK REGISTRY STUFF
    /*
        public static final Block HANGING_LEAVES = registerBlock("hanging_leaves",
            new HangingLeavesBlock(HangingLeavesBlock.Settings.create().burnable().mapColor(MapColor.DARK_GREEN).noCollision().sounds(BlockSoundGroup.MOSS_CARPET).pistonBehavior(PistonBehavior.DESTROY)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(StrongholdReworked.MOD_ID, "hanging_leaves")))));
     */

    public static void init() {

    }

    private static @NotNull <T extends Block> T register(String name, @NotNull Function<Block.Properties, Block> function, @NotNull Block.Properties properties) {
        return (T) Blocks.register(ResourceKey.create(Registries.BLOCK, Fractured.id(name)), function, properties);
    }
}
