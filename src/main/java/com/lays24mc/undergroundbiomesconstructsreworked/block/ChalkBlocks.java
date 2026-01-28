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

public class ChalkBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
            UndergroundBiomesConstructsReworked.MODID
    );

    // ================================
    // Register chalk
    // ================================

    // Blocks
    public static final DeferredBlock<Block> CHALK_BLOCK = registerBlock("chalk_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.5F, 0.29F)
    );
    public static DeferredBlock<Block> CHALK_COAL_ORE = registerBlock("chalk_coal_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.5F, 0.29F)
    );
    public static DeferredBlock<Block> CHALK_COPPER_ORE = registerBlock("chalk_copper_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.5F, 0.29F)
    );
    public static DeferredBlock<Block> CHALK_IRON_ORE = registerBlock("chalk_iron_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.5F, 0.29F)
    );
    public static DeferredBlock<Block> CHALK_GOLD_ORE = registerBlock("chalk_gold_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.5F, 0.29F)
    );
    public static DeferredBlock<Block> CHALK_REDSTONE_ORE = registerBlock("chalk_redstone_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.5F, 0.29F)
    );
    public static DeferredBlock<Block> CHALK_LAPIS_ORE = registerBlock("chalk_lapis_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.5F, 0.29F)
    );

    // Stairs
    public static final DeferredBlock<Block> CHALK_STAIRS = registerBlock("chalk_stairs",
            () -> new UBCStairsBlocks(CHALK_BLOCK, MapColor.TERRACOTTA_WHITE)
    );

    // Slabs
    public static final DeferredBlock<Block> CHALK_BLOCK_SLAB = registerBlock("chalk_block_slab",
            () -> new UBCSlabBlocks(MapColor.TERRACOTTA_WHITE)
    );

    // Walls
    public static final DeferredBlock<Block> CHALK_BLOCK_WALL = registerBlock("chalk_block_wall",
            () -> new UBCWallBlocks(MapColor.TERRACOTTA_WHITE)
    );

    // Buttons

    public static final DeferredBlock<Block> CHALK_STONE_BUTTON = registerBlock("chalk_stone_button",
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
