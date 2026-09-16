package com.lays24mc.undergroundbiomesconstructsreworked.block;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.custom.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;

public class LigniteBlocks {

    private static final StoneBlockRegistrar REGISTRAR = new StoneBlockRegistrar(UndergroundBiomesConstructsReworked.MODID);

    // ================================
    // Register Lignite
    // ================================

    // Blocks
    public static final DeferredBlock<Block> LIGNITE_BLOCK = REGISTRAR.registerBlock("lignite_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_BLACK, 0.5F, 0.29F)
    );
    public static DeferredBlock<Block> LIGNITE_COAL_ORE = REGISTRAR.registerBlock("lignite_coal_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_BLACK, 0.5F, 0.29F)
    );
    public static DeferredBlock<Block> LIGNITE_COPPER_ORE = REGISTRAR.registerBlock("lignite_copper_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_BLACK, 0.5F, 0.29F)
    );
    public static DeferredBlock<Block> LIGNITE_IRON_ORE = REGISTRAR.registerBlock("lignite_iron_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_BLACK, 0.5F, 0.29F)
    );
    public static DeferredBlock<Block> LIGNITE_GOLD_ORE = REGISTRAR.registerBlock("lignite_gold_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_BLACK, 0.5F, 0.29F)
    );
    public static DeferredBlock<Block> LIGNITE_REDSTONE_ORE = REGISTRAR.registerBlock("lignite_redstone_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_BLACK, 0.5F, 0.29F)
    );
    public static DeferredBlock<Block> LIGNITE_LAPIS_ORE = REGISTRAR.registerBlock("lignite_lapis_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_BLACK, 0.5F, 0.29F)
    );

    // Stairs
    public static final DeferredBlock<Block> LIGNITE_STAIRS = REGISTRAR.registerBlock("lignite_stairs",
            () -> new UBCStairsBlocks(LIGNITE_BLOCK)
    );

    // Slabs
    public static final DeferredBlock<Block> LIGNITE_BLOCK_SLAB = REGISTRAR.registerBlock("lignite_block_slab",
            () -> new UBCSlabBlocks(LIGNITE_BLOCK)
    );

    // Walls
    public static final DeferredBlock<Block> LIGNITE_BLOCK_WALL = REGISTRAR.registerBlock("lignite_block_wall",
            () -> new UBCWallBlocks(LIGNITE_BLOCK)
    );

    // Buttons

    public static final DeferredBlock<Block> LIGNITE_STONE_BUTTON = REGISTRAR.registerBlock("lignite_stone_button",
            () -> new UBCButtonsBlocks(BlockSetType.IRON, MapColor.STONE)
    );
    public static void register(IEventBus eventBus) {
        REGISTRAR.register(eventBus);
    }
}
