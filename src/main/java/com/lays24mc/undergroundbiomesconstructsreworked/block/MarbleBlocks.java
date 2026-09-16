package com.lays24mc.undergroundbiomesconstructsreworked.block;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.custom.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;

public class MarbleBlocks {
    private static final StoneBlockRegistrar REGISTRAR = new StoneBlockRegistrar(UndergroundBiomesConstructsReworked.MODID);

    // ================================
    // Register Marble
    // ================================

    // Blocks
    public static final DeferredBlock<Block> MARBLE_BLOCK = REGISTRAR.registerBlock("marble_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 1.1F, 1.11F)
    );
    public static  DeferredBlock<Block> MARBLE_COBBLE_BLOCK = REGISTRAR.registerBlock("marble_cobble_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 1.1F, 1.11F)
    );
    public static  DeferredBlock<Block> MARBLE_BRICK_BLOCK = REGISTRAR.registerBlock("marble_brick_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 1.1F, 1.11F)
    );
    public static DeferredBlock<Block> MARBLE_IRON_ORE = REGISTRAR.registerBlock("marble_iron_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 1.1F, 1.11F)
    );
    public static DeferredBlock<Block> MARBLE_GOLD_ORE = REGISTRAR.registerBlock("marble_gold_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 1.1F, 1.11F)
    );
    public static DeferredBlock<Block> MARBLE_REDSTONE_ORE = REGISTRAR.registerBlock("marble_redstone_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 1.1F, 1.11F)
    );
    public static DeferredBlock<Block> MARBLE_LAPIS_ORE = REGISTRAR.registerBlock("marble_lapis_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 1.1F, 1.11F)
    );
    public static DeferredBlock<Block> MARBLE_DIAMOND_ORE = REGISTRAR.registerBlock("marble_diamond_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 1.1F, 1.11F)
    );
    public static DeferredBlock<Block> MARBLE_EMERALD_ORE = REGISTRAR.registerBlock("marble_emerald_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 1.1F, 1.11F)
    );

    // Stairs
    public static final DeferredBlock<Block> MARBLE_STAIRS = REGISTRAR.registerBlock("marble_stairs",
            () -> new UBCStairsBlocks(MARBLE_BLOCK)
    );
    public static final DeferredBlock<Block> MARBLE_BRICK_STAIRS = REGISTRAR.registerBlock("marble_brick_stairs",
            () -> new UBCStairsBlocks(MARBLE_BRICK_BLOCK)
    );
    public static final DeferredBlock<Block> MARBLE_COBBLE_STAIRS = REGISTRAR.registerBlock("marble_cobble_stairs",
            () -> new UBCStairsBlocks(MARBLE_COBBLE_BLOCK)
    );

    // Slabs
    public static final DeferredBlock<Block> MARBLE_BLOCK_SLAB = REGISTRAR.registerBlock("marble_block_slab",
            () -> new UBCSlabBlocks(MARBLE_BLOCK)
    );
    public static final DeferredBlock<Block> MARBLE_COBBLE_SLAB = REGISTRAR.registerBlock("marble_cobble_slab",
            () -> new UBCSlabBlocks(MARBLE_COBBLE_BLOCK)
    );
    public static final DeferredBlock<Block> MARBLE_BRICK_SLAB = REGISTRAR.registerBlock("marble_brick_slab",
            () -> new UBCSlabBlocks(MARBLE_BRICK_BLOCK)
    );

    // Walls
    public static final DeferredBlock<Block> MARBLE_BLOCK_WALL = REGISTRAR.registerBlock("marble_block_wall",
            () -> new UBCWallBlocks(MARBLE_BLOCK)
    );
    public static final DeferredBlock<Block> MARBLE_COBBLE_WALL = REGISTRAR.registerBlock("marble_cobble_wall",
            () -> new UBCWallBlocks(MARBLE_COBBLE_BLOCK)
    );
    public static final DeferredBlock<Block> MARBLE_BRICK_WALL = REGISTRAR.registerBlock("marble_brick_wall",
            () -> new UBCWallBlocks(MARBLE_BRICK_BLOCK)
    );

    // Buttons

    public static final DeferredBlock<Block> MARBLE_STONE_BUTTON = REGISTRAR.registerBlock("marble_stone_button",
            () -> new UBCButtonsBlocks(BlockSetType.IRON, MapColor.STONE)
    );
    public static void register(IEventBus eventBus) {
        REGISTRAR.register(eventBus);
    }
}
