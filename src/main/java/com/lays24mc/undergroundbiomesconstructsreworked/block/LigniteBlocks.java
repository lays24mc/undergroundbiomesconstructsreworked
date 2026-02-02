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

public class LigniteBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
            UndergroundBiomesConstructsReworked.MODID
    );

    // ================================
    // Register Lignite
    // ================================

    // Blocks
    public static final DeferredBlock<Block> LIGNITE_BLOCK = registerBlock("lignite_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_BLACK, 0.5F, 0.29F)
    );
    public static DeferredBlock<Block> LIGNITE_COAL_ORE = registerBlock("lignite_coal_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_BLACK, 0.5F, 0.29F)
    );
    public static DeferredBlock<Block> LIGNITE_COPPER_ORE = registerBlock("lignite_copper_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_BLACK, 0.5F, 0.29F)
    );
    public static DeferredBlock<Block> LIGNITE_IRON_ORE = registerBlock("lignite_iron_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_BLACK, 0.5F, 0.29F)
    );
    public static DeferredBlock<Block> LIGNITE_GOLD_ORE = registerBlock("lignite_gold_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_BLACK, 0.5F, 0.29F)
    );
    public static DeferredBlock<Block> LIGNITE_REDSTONE_ORE = registerBlock("lignite_redstone_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_BLACK, 0.5F, 0.29F)
    );
    public static DeferredBlock<Block> LIGNITE_LAPIS_ORE = registerBlock("lignite_lapis_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_BLACK, 0.5F, 0.29F)
    );

    // Stairs
    public static final DeferredBlock<Block> LIGNITE_STAIRS = registerBlock("lignite_stairs",
            () -> new UBCStairsBlocks(LIGNITE_BLOCK, MapColor.TERRACOTTA_BLACK)
    );

    // Slabs
    public static final DeferredBlock<Block> LIGNITE_BLOCK_SLAB = registerBlock("lignite_block_slab",
            () -> new UBCSlabBlocks(MapColor.TERRACOTTA_BLACK)
    );

    // Walls
    public static final DeferredBlock<Block> LIGNITE_BLOCK_WALL = registerBlock("lignite_block_wall",
            () -> new UBCWallBlocks(MapColor.TERRACOTTA_BLACK)
    );

    // Buttons

    public static final DeferredBlock<Block> LIGNITE_STONE_BUTTON = registerBlock("lignite_stone_button",
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
