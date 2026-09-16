package com.lays24mc.undergroundbiomesconstructsreworked.block;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.custom.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;

public class RedGraniteBlocks {
    private static final StoneBlockRegistrar REGISTRAR = new StoneBlockRegistrar(UndergroundBiomesConstructsReworked.MODID);

    // ================================
    // Register Red Granite
    // ================================

    // Blocks
    public static final DeferredBlock<Block> RED_GRANITE_BLOCK = REGISTRAR.registerBlock("red_granite_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_RED, 1.7F, 1.42F)
    );
    public static  DeferredBlock<Block> RED_GRANITE_COBBLE_BLOCK = REGISTRAR.registerBlock("red_granite_cobble_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_RED, 1.7F, 1.42F)
    );
    public static  DeferredBlock<Block> RED_GRANITE_BRICK_BLOCK = REGISTRAR.registerBlock("red_granite_brick_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_RED, 1.7F, 1.42F)
    );
    public static DeferredBlock<Block> RED_GRANITE_IRON_ORE = REGISTRAR.registerBlock("red_granite_iron_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_RED, 1.7F, 1.42F)
    );
    public static DeferredBlock<Block> RED_GRANITE_GOLD_ORE = REGISTRAR.registerBlock("red_granite_gold_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_RED, 1.7F, 1.42F)
    );
    public static DeferredBlock<Block> RED_GRANITE_REDSTONE_ORE = REGISTRAR.registerBlock("red_granite_redstone_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_RED, 1.7F, 1.42F)
    );
    public static DeferredBlock<Block> RED_GRANITE_LAPIS_ORE = REGISTRAR.registerBlock("red_granite_lapis_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_RED, 1.7F, 1.42F)
    );
    public static DeferredBlock<Block> RED_GRANITE_DIAMOND_ORE = REGISTRAR.registerBlock("red_granite_diamond_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_RED, 1.7F, 1.42F)
    );
    public static DeferredBlock<Block> RED_GRANITE_EMERALD_ORE = REGISTRAR.registerBlock("red_granite_emerald_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_RED, 1.7F, 1.42F)
    );

    // Stairs
    public static final DeferredBlock<Block> RED_GRANITE_STAIRS = REGISTRAR.registerBlock("red_granite_stairs",
            () -> new UBCStairsBlocks(RED_GRANITE_BLOCK)
    );
    public static final DeferredBlock<Block> RED_GRANITE_BRICK_STAIRS = REGISTRAR.registerBlock("red_granite_brick_stairs",
            () -> new UBCStairsBlocks(RED_GRANITE_BRICK_BLOCK)
    );
    public static final DeferredBlock<Block> RED_GRANITE_COBBLE_STAIRS = REGISTRAR.registerBlock("red_granite_cobble_stairs",
            () -> new UBCStairsBlocks(RED_GRANITE_COBBLE_BLOCK)
    );


    // Slabs
    public static final DeferredBlock<Block> RED_GRANITE_BLOCK_SLAB = REGISTRAR.registerBlock("red_granite_block_slab",
            () -> new UBCSlabBlocks(RED_GRANITE_BLOCK)
    );
    public static final DeferredBlock<Block> RED_GRANITE_COBBLE_SLAB = REGISTRAR.registerBlock("red_granite_cobble_slab",
            () -> new UBCSlabBlocks(RED_GRANITE_COBBLE_BLOCK)
    );
    public static final DeferredBlock<Block> RED_GRANITE_BRICK_SLAB = REGISTRAR.registerBlock("red_granite_brick_slab",
            () -> new UBCSlabBlocks(RED_GRANITE_BRICK_BLOCK)
    );

    // Walls
    public static final DeferredBlock<Block> RED_GRANITE_BLOCK_WALL = REGISTRAR.registerBlock("red_granite_block_wall",
            () -> new UBCWallBlocks(RED_GRANITE_BLOCK)
    );
    public static final DeferredBlock<Block> RED_GRANITE_COBBLE_WALL = REGISTRAR.registerBlock("red_granite_cobble_wall",
            () -> new UBCWallBlocks(RED_GRANITE_COBBLE_BLOCK)
    );
    public static final DeferredBlock<Block> RED_GRANITE_BRICK_WALL = REGISTRAR.registerBlock("red_granite_brick_wall",
            () -> new UBCWallBlocks(RED_GRANITE_BRICK_BLOCK)
    );

    // Buttons

    public static final DeferredBlock<Block> RED_GRANITE_STONE_BUTTON = REGISTRAR.registerBlock("red_granite_stone_button",
            () -> new UBCButtonsBlocks(BlockSetType.IRON, MapColor.STONE)
    );
    public static void register(IEventBus eventBus) {
        REGISTRAR.register(eventBus);
    }
}
