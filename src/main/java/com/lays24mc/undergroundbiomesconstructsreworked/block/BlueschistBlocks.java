package com.lays24mc.undergroundbiomesconstructsreworked.block;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.custom.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;

public class BlueschistBlocks  {
    private static final StoneBlockRegistrar REGISTRAR = new StoneBlockRegistrar(UndergroundBiomesConstructsReworked.MODID);

    // ================================
    // Register Blueschist
    // ================================

    // Blocks
    public static final DeferredBlock<Block> BLUESCHIST_BLOCK = REGISTRAR.registerBlock("blueschist_block",
            () -> new UBCBlocks(MapColor.COLOR_BLUE, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> BLUESCHIST_COBBLE_BLOCK = REGISTRAR.registerBlock("blueschist_cobble_block",
            () -> new UBCBlocks(MapColor.COLOR_BLUE, 0.7F, 0.54F)
    );
    public static  DeferredBlock<Block> BLUESCHIST_BRICK_BLOCK = REGISTRAR.registerBlock("blueschist_brick_block",
            () -> new UBCBlocks(MapColor.COLOR_BLUE, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> BLUESCHIST_COAL_ORE = REGISTRAR.registerBlock("blueschist_coal_ore",
            () -> new UBCBlocks(MapColor.COLOR_BLUE, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> BLUESCHIST_COPPER_ORE = REGISTRAR.registerBlock("blueschist_copper_ore",
            () -> new UBCBlocks(MapColor.COLOR_BLUE, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> BLUESCHIST_IRON_ORE = REGISTRAR.registerBlock("blueschist_iron_ore",
            () -> new UBCBlocks(MapColor.COLOR_BLUE, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> BLUESCHIST_GOLD_ORE = REGISTRAR.registerBlock("blueschist_gold_ore",
            () -> new UBCBlocks(MapColor.COLOR_BLUE, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> BLUESCHIST_REDSTONE_ORE = REGISTRAR.registerBlock("blueschist_redstone_ore",
            () -> new UBCBlocks(MapColor.COLOR_BLUE, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> BLUESCHIST_LAPIS_ORE = REGISTRAR.registerBlock("blueschist_lapis_ore",
            () -> new UBCBlocks(MapColor.COLOR_BLUE, 0.7F, 0.54F)
    );

    // Stairs
    public static final DeferredBlock<Block> BLUESCHIST_STAIRS = REGISTRAR.registerBlock("blueschist_stairs",
            () -> new UBCStairsBlocks(BLUESCHIST_BLOCK)
    );
    public static final DeferredBlock<Block> BLUESCHIST_BRICK_STAIRS = REGISTRAR.registerBlock("blueschist_brick_stairs",
            () -> new UBCStairsBlocks(BLUESCHIST_BRICK_BLOCK)
    );
    public static final DeferredBlock<Block> BLUESCHIST_COBBLE_STAIRS = REGISTRAR.registerBlock("blueschist_cobble_stairs",
            () -> new UBCStairsBlocks(BLUESCHIST_COBBLE_BLOCK)
    );

    // Slabs
    public static final DeferredBlock<Block> BLUESCHIST_BLOCK_SLAB = REGISTRAR.registerBlock("blueschist_block_slab",
            () -> new UBCSlabBlocks(BLUESCHIST_BLOCK)
    );
    public static final DeferredBlock<Block> BLUESCHIST_COBBLE_SLAB = REGISTRAR.registerBlock("blueschist_cobble_slab",
            () -> new UBCSlabBlocks(BLUESCHIST_COBBLE_BLOCK)
    );
    public static final DeferredBlock<Block> BLUESCHIST_BRICK_SLAB = REGISTRAR.registerBlock("blueschist_brick_slab",
            () -> new UBCSlabBlocks(BLUESCHIST_BRICK_BLOCK)
    );

    // Walls
    public static final DeferredBlock<Block> BLUESCHIST_BLOCK_WALL = REGISTRAR.registerBlock("blueschist_block_wall",
            () -> new UBCWallBlocks(BLUESCHIST_BLOCK)
    );
    public static final DeferredBlock<Block> BLUESCHIST_COBBLE_WALL = REGISTRAR.registerBlock("blueschist_cobble_wall",
            () -> new UBCWallBlocks(BLUESCHIST_COBBLE_BLOCK)
    );
    public static final DeferredBlock<Block> BLUESCHIST_BRICK_WALL = REGISTRAR.registerBlock("blueschist_brick_wall",
            () -> new UBCWallBlocks(BLUESCHIST_BRICK_BLOCK)
    );

    // Buttons

    public static final DeferredBlock<Block> BLUESCHIST_STONE_BUTTON = REGISTRAR.registerBlock("blueschist_stone_button",
            () -> new UBCButtonsBlocks(BlockSetType.IRON, MapColor.STONE)
    );
    public static void register(IEventBus eventBus) {
        REGISTRAR.register(eventBus);
    }
}
