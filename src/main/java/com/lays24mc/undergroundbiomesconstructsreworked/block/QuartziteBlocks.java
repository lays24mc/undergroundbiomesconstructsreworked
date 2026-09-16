package com.lays24mc.undergroundbiomesconstructsreworked.block;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.custom.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;

public class QuartziteBlocks {
    private static final StoneBlockRegistrar REGISTRAR = new StoneBlockRegistrar(UndergroundBiomesConstructsReworked.MODID);

    // ================================
    // Register Quartzite
    // ================================

    // Blocks
    public static final DeferredBlock<Block> QUARTZITE_BLOCK = REGISTRAR.registerBlock("quartzite_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 1.3F, 1.26F)
    );
    public static  DeferredBlock<Block> QUARTZITE_COBBLE_BLOCK = REGISTRAR.registerBlock("quartzite_cobble_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 1.3F, 1.26F)
    );
    public static  DeferredBlock<Block> QUARTZITE_BRICK_BLOCK = REGISTRAR.registerBlock("quartzite_brick_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 1.3F, 1.26F)
    );
    public static DeferredBlock<Block> QUARTZITE_IRON_ORE = REGISTRAR.registerBlock("quartzite_iron_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 1.3F, 1.26F)
    );
    public static DeferredBlock<Block> QUARTZITE_GOLD_ORE = REGISTRAR.registerBlock("quartzite_gold_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 1.3F, 1.26F)
    );
    public static DeferredBlock<Block> QUARTZITE_REDSTONE_ORE = REGISTRAR.registerBlock("quartzite_redstone_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 1.3F, 1.26F)
    );
    public static DeferredBlock<Block> QUARTZITE_LAPIS_ORE = REGISTRAR.registerBlock("quartzite_lapis_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 1.3F, 1.26F)
    );
    public static DeferredBlock<Block> QUARTZITE_DIAMOND_ORE = REGISTRAR.registerBlock("quartzite_diamond_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 1.3F, 1.26F)
    );
    public static DeferredBlock<Block> QUARTZITE_EMERALD_ORE = REGISTRAR.registerBlock("quartzite_emerald_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 1.3F, 1.26F)
    );

    // Stairs
    public static final DeferredBlock<Block> QUARTZITE_STAIRS = REGISTRAR.registerBlock("quartzite_stairs",
            () -> new UBCStairsBlocks(QUARTZITE_BLOCK)
    );
    public static final DeferredBlock<Block> QUARTZITE_BRICK_STAIRS = REGISTRAR.registerBlock("quartzite_brick_stairs",
            () -> new UBCStairsBlocks(QUARTZITE_BRICK_BLOCK)
    );
    public static final DeferredBlock<Block> QUARTZITE_COBBLE_STAIRS = REGISTRAR.registerBlock("quartzite_cobble_stairs",
            () -> new UBCStairsBlocks(QUARTZITE_COBBLE_BLOCK)
    );

    // Slabs
    public static final DeferredBlock<Block> QUARTZITE_BLOCK_SLAB = REGISTRAR.registerBlock("quartzite_block_slab",
            () -> new UBCSlabBlocks(QUARTZITE_BLOCK)
    );
    public static final DeferredBlock<Block> QUARTZITE_COBBLE_SLAB = REGISTRAR.registerBlock("quartzite_cobble_slab",
            () -> new UBCSlabBlocks(QUARTZITE_COBBLE_BLOCK)
    );
    public static final DeferredBlock<Block> QUARTZITE_BRICK_SLAB = REGISTRAR.registerBlock("quartzite_brick_slab",
            () -> new UBCSlabBlocks(QUARTZITE_BRICK_BLOCK)
    );

    // Walls
    public static final DeferredBlock<Block> QUARTZITE_BLOCK_WALL = REGISTRAR.registerBlock("quartzite_block_wall",
            () -> new UBCWallBlocks(QUARTZITE_BLOCK)
    );
    public static final DeferredBlock<Block> QUARTZITE_COBBLE_WALL = REGISTRAR.registerBlock("quartzite_cobble_wall",
            () -> new UBCWallBlocks(QUARTZITE_COBBLE_BLOCK)
    );
    public static final DeferredBlock<Block> QUARTZITE_BRICK_WALL = REGISTRAR.registerBlock("quartzite_brick_wall",
            () -> new UBCWallBlocks(QUARTZITE_BRICK_BLOCK)
    );

    // Buttons

    public static final DeferredBlock<Block> QUARTZITE_STONE_BUTTON = REGISTRAR.registerBlock("quartzite_stone_button",
            () -> new UBCButtonsBlocks(BlockSetType.IRON, MapColor.STONE)
    );
    public static void register(IEventBus eventBus) {
        REGISTRAR.register(eventBus);
    }
}
