package com.lays24mc.undergroundbiomesconstructsreworked.block;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.custom.*;
import com.lays24mc.undergroundbiomesconstructsreworked.item.UBCItems;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class QuartziteBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
            UndergroundBiomesConstructsReworked.MODID
    );

    // ================================
    // Register quartzite
    // ================================

    // Blocks
    public static final DeferredBlock<Block> QUARTZITE_BLOCK = registerBlock("quartzite_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static  DeferredBlock<Block> QUARTZITE_COBBLE_BLOCK = registerBlock("quartzite_cobble_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static  DeferredBlock<Block> QUARTZITE_BRICK_BLOCK = registerBlock("quartzite_brick_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE)
    );

    // Stairs
    public static final DeferredBlock<Block> QUARTZITE_STAIRS = registerBlock("quartzite_stairs",
            () -> new UBCStairsBlocks(QUARTZITE_BLOCK, MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> QUARTZITE_BRICK_STAIRS = registerBlock("quartzite_brick_stairs",
            () -> new UBCStairsBlocks(QUARTZITE_BRICK_BLOCK, MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> QUARTZITE_COBBLE_STAIRS = registerBlock("quartzite_cobble_stairs",
            () -> new UBCStairsBlocks(QUARTZITE_COBBLE_BLOCK,MapColor.TERRACOTTA_WHITE)
    );

    // Slabs
    public static final DeferredBlock<Block> QUARTZITE_BLOCK_SLAB = registerBlock("quartzite_block_slab",
            () -> new UBCSlabBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> QUARTZITE_COBBLE_SLAB = registerBlock("quartzite_cobble_slab",
            () -> new UBCSlabBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> QUARTZITE_BRICK_SLAB = registerBlock("quartzite_brick_slab",
            () -> new UBCSlabBlocks(MapColor.TERRACOTTA_WHITE)
    );

    // Walls
    public static final DeferredBlock<Block> QUARTZITE_BLOCK_WALL = registerBlock("quartzite_block_wall",
            () -> new UBCWallBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> QUARTZITE_COBBLE_WALL = registerBlock("quartzite_cobble_wall",
            () -> new UBCWallBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> QUARTZITE_BRICK_WALL = registerBlock("quartzite_brick_wall",
            () -> new UBCWallBlocks(MapColor.TERRACOTTA_WHITE)
    );

    // Buttons

    public static final DeferredBlock<Block> QUARTZITE_STONE_BUTTON = registerBlock("quartzite_stone_button",
            () -> new UBCButtonsBlocks(BlockSetType.IRON, MapColor.STONE)
    );


    private static final <R, T> DeferredBlock<Block> registerBlock(
            String name,
            Supplier<Block> block
    ) {
        DeferredBlock<Block> toReturn = BLOCKS.register(
                name,
                block
        );
        UBCItems.ITEMS.registerSimpleBlockItem(toReturn);
        return toReturn;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
