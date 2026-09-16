package com.lays24mc.undergroundbiomesconstructsreworked.block;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.custom.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;

public class GneissBlocks {
    private static final StoneBlockRegistrar REGISTRAR = new StoneBlockRegistrar(UndergroundBiomesConstructsReworked.MODID);

    // ================================
    // Register Gneiss
    // ================================

    // Blocks
    public static final DeferredBlock<Block> GNEISS_BLOCK = REGISTRAR.registerBlock("gneiss_block",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 1.1F, 1.11F)
    );
    public static  DeferredBlock<Block> GNEISS_COBBLE_BLOCK = REGISTRAR.registerBlock("gneiss_cobble_block",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 1.1F, 1.11F)
    );
    public static  DeferredBlock<Block> GNEISS_BRICK_BLOCK = REGISTRAR.registerBlock("gneiss_brick_block",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 1.1F, 1.11F)
    );
    public static DeferredBlock<Block> GNEISS_IRON_ORE = REGISTRAR.registerBlock("gneiss_iron_ore",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 1.1F, 1.11F)
    );
    public static DeferredBlock<Block> GNEISS_GOLD_ORE = REGISTRAR.registerBlock("gneiss_gold_ore",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 1.1F, 1.11F)
    );
    public static DeferredBlock<Block> GNEISS_REDSTONE_ORE = REGISTRAR.registerBlock("gneiss_redstone_ore",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 1.1F, 1.11F)
    );
    public static DeferredBlock<Block> GNEISS_LAPIS_ORE = REGISTRAR.registerBlock("gneiss_lapis_ore",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 1.1F, 1.11F)
    );
    public static DeferredBlock<Block> GNEISS_DIAMOND_ORE = REGISTRAR.registerBlock("gneiss_diamond_ore",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 1.1F, 1.11F)
    );
    public static DeferredBlock<Block> GNEISS_EMERALD_ORE = REGISTRAR.registerBlock("gneiss_emerald_ore",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 1.1F, 1.11F)
    );

    // Stairs
    public static final DeferredBlock<Block> GNEISS_STAIRS = REGISTRAR.registerBlock("gneiss_stairs",
            () -> new UBCStairsBlocks(GNEISS_BLOCK)
    );
    public static final DeferredBlock<Block> GNEISS_BRICK_STAIRS = REGISTRAR.registerBlock("gneiss_brick_stairs",
            () -> new UBCStairsBlocks(GNEISS_BRICK_BLOCK)
    );
    public static final DeferredBlock<Block> GNEISS_COBBLE_STAIRS = REGISTRAR.registerBlock("gneiss_cobble_stairs",
            () -> new UBCStairsBlocks(GNEISS_COBBLE_BLOCK)
    );

    // Slabs
    public static final DeferredBlock<Block> GNEISS_BLOCK_SLAB = REGISTRAR.registerBlock("gneiss_block_slab",
            () -> new UBCSlabBlocks(GNEISS_BLOCK)
    );
    public static final DeferredBlock<Block> GNEISS_COBBLE_SLAB = REGISTRAR.registerBlock("gneiss_cobble_slab",
            () -> new UBCSlabBlocks(GNEISS_COBBLE_BLOCK)
    );
    public static final DeferredBlock<Block> GNEISS_BRICK_SLAB = REGISTRAR.registerBlock("gneiss_brick_slab",
            () -> new UBCSlabBlocks(GNEISS_BRICK_BLOCK)
    );

    // Walls
    public static final DeferredBlock<Block> GNEISS_BLOCK_WALL = REGISTRAR.registerBlock("gneiss_block_wall",
            () -> new UBCWallBlocks(GNEISS_BLOCK)
    );
    public static final DeferredBlock<Block> GNEISS_COBBLE_WALL = REGISTRAR.registerBlock("gneiss_cobble_wall",
            () -> new UBCWallBlocks(GNEISS_COBBLE_BLOCK)
    );
    public static final DeferredBlock<Block> GNEISS_BRICK_WALL = REGISTRAR.registerBlock("gneiss_brick_wall",
            () -> new UBCWallBlocks(GNEISS_BRICK_BLOCK)
    );

    // Buttons

    public static final DeferredBlock<Block> GNEISS_STONE_BUTTON = REGISTRAR.registerBlock("gneiss_stone_button",
            () -> new UBCButtonsBlocks(BlockSetType.IRON, MapColor.STONE)
    );
    public static void register(IEventBus eventBus) {
        REGISTRAR.register(eventBus);
    }
}
