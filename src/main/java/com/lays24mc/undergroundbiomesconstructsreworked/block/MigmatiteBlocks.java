package com.lays24mc.undergroundbiomesconstructsreworked.block;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.custom.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;

public class MigmatiteBlocks {
    private static final StoneBlockRegistrar REGISTRAR = new StoneBlockRegistrar(UndergroundBiomesConstructsReworked.MODID);

    // ================================
    // Register Migmatite
    // ================================

    // Blocks
    public static final DeferredBlock<Block> MIGMATITE_BLOCK = REGISTRAR.registerBlock("migmatite_block",
            () -> new UBCBlocks(MapColor.COLOR_GRAY, 0.9F, 0.86F)
    );
    public static  DeferredBlock<Block> MIGMATITE_COBBLE_BLOCK = REGISTRAR.registerBlock("migmatite_cobble_block",
            () -> new UBCBlocks(MapColor.COLOR_GRAY, 0.9F, 0.86F)
    );
    public static  DeferredBlock<Block> MIGMATITE_BRICK_BLOCK = REGISTRAR.registerBlock("migmatite_brick_block",
            () -> new UBCBlocks(MapColor.COLOR_GRAY, 0.9F, 0.86F)
    );
    public static DeferredBlock<Block> MIGMATITE_IRON_ORE = REGISTRAR.registerBlock("migmatite_iron_ore",
            () -> new UBCBlocks(MapColor.COLOR_GRAY, 0.9F, 0.86F)
    );
    public static DeferredBlock<Block> MIGMATITE_GOLD_ORE = REGISTRAR.registerBlock("migmatite_gold_ore",
            () -> new UBCBlocks(MapColor.COLOR_GRAY, 0.9F, 0.86F)
    );
    public static DeferredBlock<Block> MIGMATITE_REDSTONE_ORE = REGISTRAR.registerBlock("migmatite_redstone_ore",
            () -> new UBCBlocks(MapColor.COLOR_GRAY, 0.9F, 0.86F)
    );
    public static DeferredBlock<Block> MIGMATITE_LAPIS_ORE = REGISTRAR.registerBlock("migmatite_lapis_ore",
            () -> new UBCBlocks(MapColor.COLOR_GRAY, 0.9F, 0.86F)
    );
    public static DeferredBlock<Block> MIGMATITE_DIAMOND_ORE = REGISTRAR.registerBlock("migmatite_diamond_ore",
            () -> new UBCBlocks(MapColor.COLOR_GRAY, 0.9F, 0.86F)
    );
    public static DeferredBlock<Block> MIGMATITE_EMERALD_ORE = REGISTRAR.registerBlock("migmatite_emerald_ore",
            () -> new UBCBlocks(MapColor.COLOR_GRAY, 0.9F, 0.86F)
    );

    // Stairs
    public static final DeferredBlock<Block> MIGMATITE_STAIRS = REGISTRAR.registerBlock("migmatite_stairs",
            () -> new UBCStairsBlocks(MIGMATITE_BLOCK)
    );
    public static final DeferredBlock<Block> MIGMATITE_BRICK_STAIRS = REGISTRAR.registerBlock("migmatite_brick_stairs",
            () -> new UBCStairsBlocks(MIGMATITE_BRICK_BLOCK)
    );
    public static final DeferredBlock<Block> MIGMATITE_COBBLE_STAIRS = REGISTRAR.registerBlock("migmatite_cobble_stairs",
            () -> new UBCStairsBlocks(MIGMATITE_COBBLE_BLOCK)
    );

    // Slabs
    public static final DeferredBlock<Block> MIGMATITE_BLOCK_SLAB = REGISTRAR.registerBlock("migmatite_block_slab",
            () -> new UBCSlabBlocks(MIGMATITE_BLOCK)
    );
    public static final DeferredBlock<Block> MIGMATITE_COBBLE_SLAB = REGISTRAR.registerBlock("migmatite_cobble_slab",
            () -> new UBCSlabBlocks(MIGMATITE_COBBLE_BLOCK)
    );
    public static final DeferredBlock<Block> MIGMATITE_BRICK_SLAB = REGISTRAR.registerBlock("migmatite_brick_slab",
            () -> new UBCSlabBlocks(MIGMATITE_BRICK_BLOCK)
    );

    // Walls
    public static final DeferredBlock<Block> MIGMATITE_BLOCK_WALL = REGISTRAR.registerBlock("migmatite_block_wall",
            () -> new UBCWallBlocks(MIGMATITE_BLOCK)
    );
    public static final DeferredBlock<Block> MIGMATITE_COBBLE_WALL = REGISTRAR.registerBlock("migmatite_cobble_wall",
            () -> new UBCWallBlocks(MIGMATITE_COBBLE_BLOCK)
    );
    public static final DeferredBlock<Block> MIGMATITE_BRICK_WALL = REGISTRAR.registerBlock("migmatite_brick_wall",
            () -> new UBCWallBlocks(MIGMATITE_BRICK_BLOCK)
    );

    // Buttons

    public static final DeferredBlock<Block> MIGMATITE_STONE_BUTTON = REGISTRAR.registerBlock("migmatite_stone_button",
            () -> new UBCButtonsBlocks(BlockSetType.IRON, MapColor.STONE)
    );
    public static void register(IEventBus eventBus) {
        REGISTRAR.register(eventBus);
    }
}
