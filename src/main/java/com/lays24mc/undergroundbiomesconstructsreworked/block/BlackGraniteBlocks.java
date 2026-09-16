package com.lays24mc.undergroundbiomesconstructsreworked.block;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.custom.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;

public class BlackGraniteBlocks {
    private static final StoneBlockRegistrar REGISTRAR = new StoneBlockRegistrar(UndergroundBiomesConstructsReworked.MODID);

    // ================================
    // Register Black Granite
    // ================================

    // Blocks
    public static final DeferredBlock<Block> BLACK_GRANITE_BLOCK = REGISTRAR.registerBlock("black_granite_block",
            () -> new UBCBlocks(MapColor.COLOR_BLACK, 1.6F, 1.4F)
    );
    public static  DeferredBlock<Block> BLACK_GRANITE_COBBLE_BLOCK = REGISTRAR.registerBlock("black_granite_cobble_block",
            () -> new UBCBlocks(MapColor.COLOR_BLACK, 1.6F, 1.4F)
    );
    public static  DeferredBlock<Block> BLACK_GRANITE_BRICK_BLOCK = REGISTRAR.registerBlock("black_granite_brick_block",
            () -> new UBCBlocks(MapColor.COLOR_BLACK, 1.6F, 1.4F)
    );
    public static DeferredBlock<Block> BLACK_GRANITE_IRON_ORE = REGISTRAR.registerBlock("black_granite_iron_ore",
            () -> new UBCBlocks(MapColor.COLOR_BLACK, 1.6F, 1.4F)
    );
    public static DeferredBlock<Block> BLACK_GRANITE_GOLD_ORE = REGISTRAR.registerBlock("black_granite_gold_ore",
            () -> new UBCBlocks(MapColor.COLOR_BLACK, 1.6F, 1.4F)
    );
    public static DeferredBlock<Block> BLACK_GRANITE_REDSTONE_ORE = REGISTRAR.registerBlock("black_granite_redstone_ore",
            () -> new UBCBlocks(MapColor.COLOR_BLACK, 1.6F, 1.4F)
    );
    public static DeferredBlock<Block> BLACK_GRANITE_LAPIS_ORE = REGISTRAR.registerBlock("black_granite_lapis_ore",
            () -> new UBCBlocks(MapColor.COLOR_BLACK, 1.6F, 1.4F)
    );
    public static DeferredBlock<Block> BLACK_GRANITE_DIAMOND_ORE = REGISTRAR.registerBlock("black_granite_diamond_ore",
            () -> new UBCBlocks(MapColor.COLOR_BLACK, 1.6F, 1.4F)
    );
    public static DeferredBlock<Block> BLACK_GRANITE_EMERALD_ORE = REGISTRAR.registerBlock("black_granite_emerald_ore",
            () -> new UBCBlocks(MapColor.COLOR_BLACK, 1.6F, 1.4F)
    );

    // Stairs
    public static final DeferredBlock<Block> BLACK_GRANITE_STAIRS = REGISTRAR.registerBlock("black_granite_stairs",
            () -> new UBCStairsBlocks(BLACK_GRANITE_BLOCK)
    );
    public static final DeferredBlock<Block> BLACK_GRANITE_BRICK_STAIRS = REGISTRAR.registerBlock("black_granite_brick_stairs",
            () -> new UBCStairsBlocks(BLACK_GRANITE_BRICK_BLOCK)
    );
    public static final DeferredBlock<Block> BLACK_GRANITE_COBBLE_STAIRS = REGISTRAR.registerBlock("black_granite_cobble_stairs",
            () -> new UBCStairsBlocks(BLACK_GRANITE_COBBLE_BLOCK)
    );

    // Slabs
    public static final DeferredBlock<Block> BLACK_GRANITE_BLOCK_SLAB = REGISTRAR.registerBlock("black_granite_block_slab",
            () -> new UBCSlabBlocks(BLACK_GRANITE_BLOCK)
    );
    public static final DeferredBlock<Block> BLACK_GRANITE_COBBLE_SLAB = REGISTRAR.registerBlock("black_granite_cobble_slab",
            () -> new UBCSlabBlocks(BLACK_GRANITE_COBBLE_BLOCK)
    );
    public static final DeferredBlock<Block> BLACK_GRANITE_BRICK_SLAB = REGISTRAR.registerBlock("black_granite_brick_slab",
            () -> new UBCSlabBlocks(BLACK_GRANITE_BRICK_BLOCK)
    );

    // Walls
    public static final DeferredBlock<Block> BLACK_GRANITE_BLOCK_WALL = REGISTRAR.registerBlock("black_granite_block_wall",
            () -> new UBCWallBlocks(BLACK_GRANITE_BLOCK)
    );
    public static final DeferredBlock<Block> BLACK_GRANITE_COBBLE_WALL = REGISTRAR.registerBlock("black_granite_cobble_wall",
            () -> new UBCWallBlocks(BLACK_GRANITE_COBBLE_BLOCK)
    );
    public static final DeferredBlock<Block> BLACK_GRANITE_BRICK_WALL = REGISTRAR.registerBlock("black_granite_brick_wall",
            () -> new UBCWallBlocks(BLACK_GRANITE_BRICK_BLOCK)
    );

    // Buttons

    public static final DeferredBlock<Block> BLACK_GRANITE_STONE_BUTTON = REGISTRAR.registerBlock("black_granite_stone_button",
            () -> new UBCButtonsBlocks(BlockSetType.IRON, MapColor.STONE)
    );
    public static void register(IEventBus eventBus) {
        REGISTRAR.register(eventBus);
    }
}
