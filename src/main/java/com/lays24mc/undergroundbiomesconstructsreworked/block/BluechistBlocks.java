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

public class BluechistBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
            UndergroundBiomesConstructsReworked.MODID
    );

    // ================================
    // Register bluechist
    // ================================

    // Blocks
    public static final DeferredBlock<Block> BLUECHIST_BLOCK = registerBlock("bluechist_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> BLUECHIST_COBBLE_BLOCK = registerBlock("bluechist_cobble_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.7F, 0.54F)
    );
    public static  DeferredBlock<Block> BLUECHIST_BRICK_BLOCK = registerBlock("bluechist_brick_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> BLUECHIST_COAL_ORE = registerBlock("bluechist_coal_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> BLUECHIST_COPPER_ORE = registerBlock("bluechist_copper_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> BLUECHIST_IRON_ORE = registerBlock("bluechist_iron_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> BLUECHIST_GOLD_ORE = registerBlock("bluechist_gold_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> BLUECHIST_REDSTONE_ORE = registerBlock("bluechist_redstone_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> BLUECHIST_LAPIS_ORE = registerBlock("bluechist_lapis_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.7F, 0.54F)
    );

    // Stairs
    public static final DeferredBlock<Block> BLUECHIST_STAIRS = registerBlock("bluechist_stairs",
            () -> new UBCStairsBlocks(BLUECHIST_BLOCK, MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> BLUECHIST_BRICK_STAIRS = registerBlock("bluechist_brick_stairs",
            () -> new UBCStairsBlocks(BLUECHIST_BRICK_BLOCK, MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> BLUECHIST_COBBLE_STAIRS = registerBlock("bluechist_cobble_stairs",
            () -> new UBCStairsBlocks(BLUECHIST_COBBLE_BLOCK,MapColor.TERRACOTTA_WHITE)
    );

    // Slabs
    public static final DeferredBlock<Block> BLUECHIST_BLOCK_SLAB = registerBlock("bluechist_block_slab",
            () -> new UBCSlabBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> BLUECHIST_COBBLE_SLAB = registerBlock("bluechist_cobble_slab",
            () -> new UBCSlabBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> BLUECHIST_BRICK_SLAB = registerBlock("bluechist_brick_slab",
            () -> new UBCSlabBlocks(MapColor.TERRACOTTA_WHITE)
    );

    // Walls
    public static final DeferredBlock<Block> BLUECHIST_BLOCK_WALL = registerBlock("bluechist_block_wall",
            () -> new UBCWallBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> BLUECHIST_COBBLE_WALL = registerBlock("bluechist_cobble_wall",
            () -> new UBCWallBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> BLUECHIST_BRICK_WALL = registerBlock("bluechist_brick_wall",
            () -> new UBCWallBlocks(MapColor.TERRACOTTA_WHITE)
    );

    // Buttons

    public static final DeferredBlock<Block> BLUECHIST_STONE_BUTTON = registerBlock("bluechist_stone_button",
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
