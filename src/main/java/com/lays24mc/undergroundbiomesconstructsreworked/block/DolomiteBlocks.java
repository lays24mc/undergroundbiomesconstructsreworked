package com.lays24mc.undergroundbiomesconstructsreworked.block;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.custom.*;
import com.lays24mc.undergroundbiomesconstructsreworked.item.UBCItems;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class DolomiteBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
            UndergroundBiomesConstructsReworked.MODID
    );

    // ================================
    // Register dolomite
    // ================================

    // Blocks
    public static final DeferredBlock<Block> DOLOMITE_BLOCK = registerBlock("dolomite_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.5F, 0.92F)
    );
    public static DeferredBlock<Block> DOLOMITE_COAL_ORE = registerBlock("dolomite_coal_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.5F, 0.92F)
    );
    public static DeferredBlock<Block> DOLOMITE_COPPER_ORE = registerBlock("dolomite_copper_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.5F, 0.92F)
    );
    public static DeferredBlock<Block> DOLOMITE_IRON_ORE = registerBlock("dolomite_iron_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.5F, 0.92F)
    );
    public static DeferredBlock<Block> DOLOMITE_GOLD_ORE = registerBlock("dolomite_gold_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.5F, 0.92F)
    );
    public static DeferredBlock<Block> DOLOMITE_REDSTONE_ORE = registerBlock("dolomite_redstone_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.5F, 0.92F)
    );
    public static DeferredBlock<Block> DOLOMITE_LAPIS_ORE = registerBlock("dolomite_lapis_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.5F, 0.92F)
    );

    // Stairs
    public static final DeferredBlock<Block> DOLOMITE_STAIRS = registerBlock("dolomite_stairs",
            () -> new UBCStairsBlocks(DOLOMITE_BLOCK, MapColor.TERRACOTTA_WHITE)
    );

    // Slabs
    public static final DeferredBlock<Block> DOLOMITE_BLOCK_SLAB = registerBlock("dolomite_block_slab",
            () -> new UBCSlabBlocks(MapColor.TERRACOTTA_WHITE)
    );

    // Walls
    public static final DeferredBlock<Block> DOLOMITE_BLOCK_WALL = registerBlock("dolomite_block_wall",
            () -> new UBCWallBlocks(MapColor.TERRACOTTA_WHITE)
    );

    // Buttons

    public static final DeferredBlock<Block> DOLOMITE_STONE_BUTTON = registerBlock("dolomite_stone_button",
            () -> new UBCButtonsBlocks(BlockSetType.IRON, MapColor.STONE)
    );


    private static final <R, T> DeferredBlock<Block> registerBlock(
            String name,
            Supplier<Block> block
    ) {
        DeferredBlock<Block> toReturn = BLOCKS.register(
                name,
                block
        );
        UBCItems.ITEMS.registerSimpleBlockItem(toReturn);
        return toReturn;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
