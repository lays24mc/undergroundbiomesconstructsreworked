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

public class DolomitBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
            UndergroundBiomesConstructsReworked.MODID
    );

    // ================================
    // Register dolomit
    // ================================

    // Blocks
    public static final DeferredBlock<Block> DOLOMIT_BLOCK = registerBlock("dolomit_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.5F, 0.92F)
    );
    public static DeferredBlock<Block> DOLOMIT_COAL_ORE = registerBlock("dolomit_coal_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.5F, 0.92F)
    );
    public static DeferredBlock<Block> DOLOMIT_COPPER_ORE = registerBlock("dolomit_copper_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.5F, 0.92F)
    );
    public static DeferredBlock<Block> DOLOMIT_IRON_ORE = registerBlock("dolomit_iron_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.5F, 0.92F)
    );
    public static DeferredBlock<Block> DOLOMIT_GOLD_ORE = registerBlock("dolomit_gold_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.5F, 0.92F)
    );
    public static DeferredBlock<Block> DOLOMIT_REDSTONE_ORE = registerBlock("dolomit_redstone_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.5F, 0.92F)
    );
    public static DeferredBlock<Block> DOLOMIT_LAPIS_ORE = registerBlock("dolomit_lapis_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.5F, 0.92F)
    );

    // Stairs
    public static final DeferredBlock<Block> DOLOMIT_STAIRS = registerBlock("dolomit_stairs",
            () -> new UBCStairsBlocks(DOLOMIT_BLOCK, MapColor.TERRACOTTA_WHITE)
    );

    // Slabs
    public static final DeferredBlock<Block> DOLOMIT_BLOCK_SLAB = registerBlock("dolomit_block_slab",
            () -> new UBCSlabBlocks(MapColor.TERRACOTTA_WHITE)
    );

    // Walls
    public static final DeferredBlock<Block> DOLOMIT_BLOCK_WALL = registerBlock("dolomit_block_wall",
            () -> new UBCWallBlocks(MapColor.TERRACOTTA_WHITE)
    );

    // Buttons

    public static final DeferredBlock<Block> DOLOMIT_STONE_BUTTON = registerBlock("dolomit_stone_button",
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
