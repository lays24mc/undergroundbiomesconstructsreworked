package com.lays24mc.undergroundbiomesconstructsreworked.block;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.custom.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;

public class DolomiteBlocks {

    private static final StoneBlockRegistrar REGISTRAR = new StoneBlockRegistrar(UndergroundBiomesConstructsReworked.MODID);

    // ================================
    // Register Dolomite
    // ================================

    // Blocks
    public static final DeferredBlock<Block> DOLOMITE_BLOCK = REGISTRAR.registerBlock("dolomite_block",
            () -> new UBCBlocks(MapColor.COLOR_BROWN, 0.5F, 0.92F)
    );
    public static DeferredBlock<Block> DOLOMITE_COAL_ORE = REGISTRAR.registerBlock("dolomite_coal_ore",
            () -> new UBCBlocks(MapColor.COLOR_BROWN, 0.5F, 0.92F)
    );
    public static DeferredBlock<Block> DOLOMITE_COPPER_ORE = REGISTRAR.registerBlock("dolomite_copper_ore",
            () -> new UBCBlocks(MapColor.COLOR_BROWN, 0.5F, 0.92F)
    );
    public static DeferredBlock<Block> DOLOMITE_IRON_ORE = REGISTRAR.registerBlock("dolomite_iron_ore",
            () -> new UBCBlocks(MapColor.COLOR_BROWN, 0.5F, 0.92F)
    );
    public static DeferredBlock<Block> DOLOMITE_GOLD_ORE = REGISTRAR.registerBlock("dolomite_gold_ore",
            () -> new UBCBlocks(MapColor.COLOR_BROWN, 0.5F, 0.92F)
    );
    public static DeferredBlock<Block> DOLOMITE_REDSTONE_ORE = REGISTRAR.registerBlock("dolomite_redstone_ore",
            () -> new UBCBlocks(MapColor.COLOR_BROWN, 0.5F, 0.92F)
    );
    public static DeferredBlock<Block> DOLOMITE_LAPIS_ORE = REGISTRAR.registerBlock("dolomite_lapis_ore",
            () -> new UBCBlocks(MapColor.COLOR_BROWN, 0.5F, 0.92F)
    );

    // Stairs
    public static final DeferredBlock<Block> DOLOMITE_STAIRS = REGISTRAR.registerBlock("dolomite_stairs",
            () -> new UBCStairsBlocks(DOLOMITE_BLOCK)
    );

    // Slabs
    public static final DeferredBlock<Block> DOLOMITE_BLOCK_SLAB = REGISTRAR.registerBlock("dolomite_block_slab",
            () -> new UBCSlabBlocks(DOLOMITE_BLOCK)
    );

    // Walls
    public static final DeferredBlock<Block> DOLOMITE_BLOCK_WALL = REGISTRAR.registerBlock("dolomite_block_wall",
            () -> new UBCWallBlocks(DOLOMITE_BLOCK)
    );

    // Buttons

    public static final DeferredBlock<Block> DOLOMITE_STONE_BUTTON = REGISTRAR.registerBlock("dolomite_stone_button",
            () -> new UBCButtonsBlocks(BlockSetType.IRON, MapColor.STONE)
    );
    public static void register(IEventBus eventBus) {
        REGISTRAR.register(eventBus);
    }
}
