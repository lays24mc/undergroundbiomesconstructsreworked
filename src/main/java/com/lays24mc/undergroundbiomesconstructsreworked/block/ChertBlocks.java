package com.lays24mc.undergroundbiomesconstructsreworked.block;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.custom.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ChertBlocks {

    private static final StoneBlockRegistrar REGISTRAR = new StoneBlockRegistrar(UndergroundBiomesConstructsReworked.MODID);

    // ================================
    // Register Chert
    // ================================

    // Blocks
    public static final DeferredBlock<Block> CHERT_BLOCK = REGISTRAR.registerBlock("chert_block",
            () -> new UBCBlocks(MapColor.COLOR_BROWN, 0.9F, 0.85F)
    );
    public static DeferredBlock<Block> CHERT_COAL_ORE = REGISTRAR.registerBlock("chert_coal_ore",
            () -> new UBCBlocks(MapColor.COLOR_BROWN, 0.9F, 0.85F)
    );
    public static DeferredBlock<Block> CHERT_COPPER_ORE = REGISTRAR.registerBlock("chert_copper_ore",
            () -> new UBCBlocks(MapColor.COLOR_BROWN, 0.9F, 0.85F)
    );
    public static DeferredBlock<Block> CHERT_IRON_ORE = REGISTRAR.registerBlock("chert_iron_ore",
            () -> new UBCBlocks(MapColor.COLOR_BROWN, 0.9F, 0.85F)
    );
    public static DeferredBlock<Block> CHERT_GOLD_ORE = REGISTRAR.registerBlock("chert_gold_ore",
            () -> new UBCBlocks(MapColor.COLOR_BROWN, 0.9F, 0.85F)
    );
    public static DeferredBlock<Block> CHERT_REDSTONE_ORE = REGISTRAR.registerBlock("chert_redstone_ore",
            () -> new UBCBlocks(MapColor.COLOR_BROWN, 0.9F, 0.85F)
    );
    public static DeferredBlock<Block> CHERT_LAPIS_ORE = REGISTRAR.registerBlock("chert_lapis_ore",
            () -> new UBCBlocks(MapColor.COLOR_BROWN, 0.9F, 0.85F)
    );

    // Stairs
    public static final DeferredBlock<Block> CHERT_STAIRS = REGISTRAR.registerBlock("chert_stairs",
            () -> new UBCStairsBlocks(CHERT_BLOCK)
    );

    // Slabs
    public static final DeferredBlock<Block> CHERT_BLOCK_SLAB = REGISTRAR.registerBlock("chert_block_slab",
            () -> new UBCSlabBlocks(CHERT_BLOCK)
    );

    // Walls
    public static final DeferredBlock<Block> CHERT_BLOCK_WALL = REGISTRAR.registerBlock("chert_block_wall",
            () -> new UBCWallBlocks(CHERT_BLOCK)
    );

    // Buttons

    public static final DeferredBlock<Block> CHERT_STONE_BUTTON = REGISTRAR.registerBlock("chert_stone_button",
            () -> new UBCButtonsBlocks(BlockSetType.IRON, MapColor.STONE)
    );
    public static void register(IEventBus eventBus) {
        REGISTRAR.register(eventBus);
    }
}
