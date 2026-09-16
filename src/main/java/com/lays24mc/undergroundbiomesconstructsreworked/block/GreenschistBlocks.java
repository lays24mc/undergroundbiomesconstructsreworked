package com.lays24mc.undergroundbiomesconstructsreworked.block;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.custom.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;

public class GreenschistBlocks {
    private static final StoneBlockRegistrar REGISTRAR = new StoneBlockRegistrar(UndergroundBiomesConstructsReworked.MODID);

    // ================================
    // Register Greenschist
    // ================================

    // Blocks
    public static final DeferredBlock<Block> GREENSCHIST_BLOCK = REGISTRAR.registerBlock("greenschist_block",
            () -> new UBCBlocks(MapColor.COLOR_GREEN, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> GREENSCHIST_COBBLE_BLOCK = REGISTRAR.registerBlock("greenschist_cobble_block",
            () -> new UBCBlocks(MapColor.COLOR_GREEN, 0.7F, 0.54F)
    );
    public static  DeferredBlock<Block> GREENSCHIST_BRICK_BLOCK = REGISTRAR.registerBlock("greenschist_brick_block",
            () -> new UBCBlocks(MapColor.COLOR_GREEN, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> GREENSCHIST_COAL_ORE = REGISTRAR.registerBlock("greenschist_coal_ore",
            () -> new UBCBlocks(MapColor.COLOR_GREEN, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> GREENSCHIST_COPPER_ORE = REGISTRAR.registerBlock("greenschist_copper_ore",
            () -> new UBCBlocks(MapColor.COLOR_GREEN, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> GREENSCHIST_IRON_ORE = REGISTRAR.registerBlock("greenschist_iron_ore",
            () -> new UBCBlocks(MapColor.COLOR_GREEN, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> GREENSCHIST_GOLD_ORE = REGISTRAR.registerBlock("greenschist_gold_ore",
            () -> new UBCBlocks(MapColor.COLOR_GREEN, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> GREENSCHIST_REDSTONE_ORE = REGISTRAR.registerBlock("greenschist_redstone_ore",
            () -> new UBCBlocks(MapColor.COLOR_GREEN, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> GREENSCHIST_LAPIS_ORE = REGISTRAR.registerBlock("greenschist_lapis_ore",
            () -> new UBCBlocks(MapColor.COLOR_GREEN, 0.7F, 0.54F)
    );

    // Stairs
    public static final DeferredBlock<Block> GREENSCHIST_STAIRS = REGISTRAR.registerBlock("greenschist_stairs",
            () -> new UBCStairsBlocks(GREENSCHIST_BLOCK)
    );
    public static final DeferredBlock<Block> GREENSCHIST_BRICK_STAIRS = REGISTRAR.registerBlock("greenschist_brick_stairs",
            () -> new UBCStairsBlocks(GREENSCHIST_BRICK_BLOCK)
    );
    public static final DeferredBlock<Block> GREENSCHIST_COBBLE_STAIRS = REGISTRAR.registerBlock("greenschist_cobble_stairs",
            () -> new UBCStairsBlocks(GREENSCHIST_COBBLE_BLOCK)
    );

    // Slabs
    public static final DeferredBlock<Block> GREENSCHIST_BLOCK_SLAB = REGISTRAR.registerBlock("greenschist_block_slab",
            () -> new UBCSlabBlocks(GREENSCHIST_BLOCK)
    );
    public static final DeferredBlock<Block> GREENSCHIST_COBBLE_SLAB = REGISTRAR.registerBlock("greenschist_cobble_slab",
            () -> new UBCSlabBlocks(GREENSCHIST_COBBLE_BLOCK)
    );
    public static final DeferredBlock<Block> GREENSCHIST_BRICK_SLAB = REGISTRAR.registerBlock("greenschist_brick_slab",
            () -> new UBCSlabBlocks(GREENSCHIST_BRICK_BLOCK)
    );

    // Walls
    public static final DeferredBlock<Block> GREENSCHIST_BLOCK_WALL = REGISTRAR.registerBlock("greenschist_block_wall",
            () -> new UBCWallBlocks(GREENSCHIST_BLOCK)
    );
    public static final DeferredBlock<Block> GREENSCHIST_COBBLE_WALL = REGISTRAR.registerBlock("greenschist_cobble_wall",
            () -> new UBCWallBlocks(GREENSCHIST_COBBLE_BLOCK)
    );
    public static final DeferredBlock<Block> GREENSCHIST_BRICK_WALL = REGISTRAR.registerBlock("greenschist_brick_wall",
            () -> new UBCWallBlocks(GREENSCHIST_BRICK_BLOCK)
    );

    // Buttons

    public static final DeferredBlock<Block> GREENSCHIST_STONE_BUTTON = REGISTRAR.registerBlock("greenschist_stone_button",
            () -> new UBCButtonsBlocks(BlockSetType.IRON, MapColor.STONE)
    );
    public static void register(IEventBus eventBus) {
        REGISTRAR.register(eventBus);
    }
}
