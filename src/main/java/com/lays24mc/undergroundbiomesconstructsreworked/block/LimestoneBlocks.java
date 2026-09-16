package com.lays24mc.undergroundbiomesconstructsreworked.block;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.custom.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;

public class LimestoneBlocks {

    private static final StoneBlockRegistrar REGISTRAR = new StoneBlockRegistrar(UndergroundBiomesConstructsReworked.MODID);

    // ================================
    // Register Limestone
    // ================================

    // Blocks
    public static final DeferredBlock<Block> LIMESTONE_BLOCK = REGISTRAR.registerBlock("limestone_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_YELLOW,0.5F, 0.29F)
    );
    public static DeferredBlock<Block> LIMESTONE_COAL_ORE = REGISTRAR.registerBlock("limestone_coal_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_YELLOW,0.5F, 0.29F)
    );
    public static DeferredBlock<Block> LIMESTONE_COPPER_ORE = REGISTRAR.registerBlock("limestone_copper_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_YELLOW,0.5F, 0.29F)
    );
    public static DeferredBlock<Block> LIMESTONE_IRON_ORE = REGISTRAR.registerBlock("limestone_iron_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_YELLOW,0.5F, 0.29F)
    );
    public static DeferredBlock<Block> LIMESTONE_GOLD_ORE = REGISTRAR.registerBlock("limestone_gold_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_YELLOW,0.5F, 0.29F)
    );
    public static DeferredBlock<Block> LIMESTONE_REDSTONE_ORE = REGISTRAR.registerBlock("limestone_redstone_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_YELLOW,0.5F, 0.29F)
    );
    public static DeferredBlock<Block> LIMESTONE_LAPIS_ORE = REGISTRAR.registerBlock("limestone_lapis_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_YELLOW,0.5F, 0.29F)
    );

    // Stairs
    public static final DeferredBlock<Block> LIMESTONE_STAIRS = REGISTRAR.registerBlock("limestone_stairs",
            () -> new UBCStairsBlocks(LIMESTONE_BLOCK)
    );

    // Slabs
    public static final DeferredBlock<Block> LIMESTONE_BLOCK_SLAB = REGISTRAR.registerBlock("limestone_block_slab",
            () -> new UBCSlabBlocks(LIMESTONE_BLOCK)
    );

    // Walls
    public static final DeferredBlock<Block> LIMESTONE_BLOCK_WALL = REGISTRAR.registerBlock("limestone_block_wall",
            () -> new UBCWallBlocks(LIMESTONE_BLOCK)
    );

    // Buttons

    public static final DeferredBlock<Block> LIMESTONE_STONE_BUTTON = REGISTRAR.registerBlock("limestone_stone_button",
            () -> new UBCButtonsBlocks(BlockSetType.IRON, MapColor.STONE)
    );
    public static void register(IEventBus eventBus) {
        REGISTRAR.register(eventBus);
    }
}
