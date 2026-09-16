package com.lays24mc.undergroundbiomesconstructsreworked.block;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.custom.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ChalkBlocks {

    private static final StoneBlockRegistrar REGISTRAR = new StoneBlockRegistrar(UndergroundBiomesConstructsReworked.MODID);

    // ================================
    // Register Chalk
    // ================================

    // Blocks
    public static final DeferredBlock<Block> CHALK_BLOCK = REGISTRAR.registerBlock("chalk_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.5F, 0.29F)
    );
    public static DeferredBlock<Block> CHALK_COAL_ORE = REGISTRAR.registerBlock("chalk_coal_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.5F, 0.29F)
    );
    public static DeferredBlock<Block> CHALK_COPPER_ORE = REGISTRAR.registerBlock("chalk_copper_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.5F, 0.29F)
    );
    public static DeferredBlock<Block> CHALK_IRON_ORE = REGISTRAR.registerBlock("chalk_iron_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.5F, 0.29F)
    );
    public static DeferredBlock<Block> CHALK_GOLD_ORE = REGISTRAR.registerBlock("chalk_gold_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.5F, 0.29F)
    );
    public static DeferredBlock<Block> CHALK_REDSTONE_ORE = REGISTRAR.registerBlock("chalk_redstone_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.5F, 0.29F)
    );
    public static DeferredBlock<Block> CHALK_LAPIS_ORE = REGISTRAR.registerBlock("chalk_lapis_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.5F, 0.29F)
    );

    // Stairs
    public static final DeferredBlock<Block> CHALK_STAIRS = REGISTRAR.registerBlock("chalk_stairs",
            () -> new UBCStairsBlocks(CHALK_BLOCK)
    );

    // Slabs
    public static final DeferredBlock<Block> CHALK_BLOCK_SLAB = REGISTRAR.registerBlock("chalk_block_slab",
            () -> new UBCSlabBlocks(CHALK_BLOCK)
    );

    // Walls
    public static final DeferredBlock<Block> CHALK_BLOCK_WALL = REGISTRAR.registerBlock("chalk_block_wall",
            () -> new UBCWallBlocks(CHALK_BLOCK)
    );

    // Buttons

    public static final DeferredBlock<Block> CHALK_STONE_BUTTON = REGISTRAR.registerBlock("chalk_stone_button",
            () -> new UBCButtonsBlocks(BlockSetType.IRON, MapColor.STONE)
    );
    public static void register(IEventBus eventBus) {
        REGISTRAR.register(eventBus);
    }
}
