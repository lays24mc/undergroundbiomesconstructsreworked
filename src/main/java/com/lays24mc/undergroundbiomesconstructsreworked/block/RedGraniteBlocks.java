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

public class RedGraniteBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
            UndergroundBiomesConstructsReworked.MODID
    );

    // ================================
    // Register Red Granite
    // ================================

    // Blocks
    public static final DeferredBlock<Block> RED_GRANITE_BLOCK = registerBlock("red_granite_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static  DeferredBlock<Block> RED_GRANITE_COBBLE_BLOCK = registerBlock("red_granite_cobble_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static  DeferredBlock<Block> RED_GRANITE_BRICK_BLOCK = registerBlock("red_granite_brick_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static DeferredBlock<Block> RED_GRANITE_IRON_ORE = registerBlock("red_granite_iron_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static DeferredBlock<Block> RED_GRANITE_GOLD_ORE = registerBlock("red_granite_gold_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static DeferredBlock<Block> RED_GRANITE_REDSTONE_ORE = registerBlock("red_granite_redstone_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static DeferredBlock<Block> RED_GRANITE_LAPIS_ORE = registerBlock("red_granite_lapis_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE)
    );

    // Stairs
    public static final DeferredBlock<Block> RED_GRANITE_STAIRS = registerBlock("red_granite_stairs",
            () -> new UBCStairsBlocks(RED_GRANITE_BLOCK, MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> RED_GRANITE_BRICK_STAIRS = registerBlock("red_granite_brick_stairs",
            () -> new UBCStairsBlocks(RED_GRANITE_BRICK_BLOCK, MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> RED_GRANITE_COBBLE_STAIRS = registerBlock("red_granite_cobble_stairs",
            () -> new UBCStairsBlocks(RED_GRANITE_COBBLE_BLOCK,MapColor.TERRACOTTA_WHITE)
    );


    // Slabs
    public static final DeferredBlock<Block> RED_GRANITE_BLOCK_SLAB = registerBlock("red_granite_block_slab",
            () -> new UBCSlabBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> RED_GRANITE_COBBLE_SLAB = registerBlock("red_granite_cobble_slab",
            () -> new UBCSlabBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> RED_GRANITE_BRICK_SLAB = registerBlock("red_granite_brick_slab",
            () -> new UBCSlabBlocks(MapColor.TERRACOTTA_WHITE)
    );

    // Walls
    public static final DeferredBlock<Block> RED_GRANITE_BLOCK_WALL = registerBlock("red_granite_block_wall",
            () -> new UBCWallBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> RED_GRANITE_COBBLE_WALL = registerBlock("red_granite_cobble_wall",
            () -> new UBCWallBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> RED_GRANITE_BRICK_WALL = registerBlock("red_granite_brick_wall",
            () -> new UBCWallBlocks(MapColor.TERRACOTTA_WHITE)
    );

    // Buttons

    public static final DeferredBlock<Block> RED_GRANITE_STONE_BUTTON = registerBlock("red_granite_stone_button",
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
