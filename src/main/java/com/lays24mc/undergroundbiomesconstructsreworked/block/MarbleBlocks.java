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

public class MarbleBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
            UndergroundBiomesConstructsReworked.MODID
    );

    // ================================
    // Register Marble
    // ================================

    // Blocks
    public static final DeferredBlock<Block> MARBLE_BLOCK = registerBlock("marble_block",
            () -> new UBCBlocks("marble_block", MapColor.TERRACOTTA_WHITE, 1.1F, 1.11F)
    );
    public static  DeferredBlock<Block> MARBLE_COBBLE_BLOCK = registerBlock("marble_cobble_block",
            () -> new UBCBlocks("marble_cobble_block", MapColor.TERRACOTTA_WHITE, 1.1F, 1.11F)
    );
    public static  DeferredBlock<Block> MARBLE_BRICK_BLOCK = registerBlock("marble_brick_block",
            () -> new UBCBlocks("marble_brick_block", MapColor.TERRACOTTA_WHITE, 1.1F, 1.11F)
    );
    public static DeferredBlock<Block> MARBLE_IRON_ORE = registerBlock("marble_iron_ore",
            () -> new UBCBlocks("marble_iron_ore", MapColor.TERRACOTTA_WHITE, 1.1F, 1.11F)
    );
    public static DeferredBlock<Block> MARBLE_GOLD_ORE = registerBlock("marble_gold_ore",
            () -> new UBCBlocks("marble_gold_ore", MapColor.TERRACOTTA_WHITE, 1.1F, 1.11F)
    );
    public static DeferredBlock<Block> MARBLE_REDSTONE_ORE = registerBlock("marble_redstone_ore",
            () -> new UBCBlocks("marble_redstone_ore", MapColor.TERRACOTTA_WHITE, 1.1F, 1.11F)
    );
    public static DeferredBlock<Block> MARBLE_LAPIS_ORE = registerBlock("marble_lapis_ore",
            () -> new UBCBlocks("marble_lapis_ore", MapColor.TERRACOTTA_WHITE, 1.1F, 1.11F)
    );
    public static DeferredBlock<Block> MARBLE_DIAMOND_ORE = registerBlock("marble_diamond_ore",
            () -> new UBCBlocks("marble_diamond_ore",  MapColor.TERRACOTTA_WHITE, 1.1F, 1.11F)
    );
    public static DeferredBlock<Block> MARBLE_EMERALD_ORE = registerBlock("marble_emerald_ore",
            () -> new UBCBlocks("marble_emerald_ore", MapColor.TERRACOTTA_WHITE, 1.1F, 1.11F)
    );

    // Stairs
    public static final DeferredBlock<Block> MARBLE_STAIRS = registerBlock("marble_stairs",
            () -> new UBCStairsBlocks("marble_stairs", MARBLE_BLOCK, MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> MARBLE_BRICK_STAIRS = registerBlock("marble_brick_stairs",
            () -> new UBCStairsBlocks("marble_brick_stairs", MARBLE_BRICK_BLOCK, MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> MARBLE_COBBLE_STAIRS = registerBlock("marble_cobble_stairs",
            () -> new UBCStairsBlocks("marble_cobble_stairs", MARBLE_COBBLE_BLOCK,MapColor.TERRACOTTA_WHITE)
    );

    // Slabs
    public static final DeferredBlock<Block> MARBLE_BLOCK_SLAB = registerBlock("marble_block_slab",
            () -> new UBCSlabBlocks("marble_block_slab", MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> MARBLE_COBBLE_SLAB = registerBlock("marble_cobble_slab",
            () -> new UBCSlabBlocks("marble_cobble_slab", MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> MARBLE_BRICK_SLAB = registerBlock("marble_brick_slab",
            () -> new UBCSlabBlocks("marble_brick_slab", MapColor.TERRACOTTA_WHITE)
    );

    // Walls
    public static final DeferredBlock<Block> MARBLE_BLOCK_WALL = registerBlock("marble_block_wall",
            () -> new UBCWallBlocks("marble_block_wall", MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> MARBLE_COBBLE_WALL = registerBlock("marble_cobble_wall",
            () -> new UBCWallBlocks("marble_cobble_wall", MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> MARBLE_BRICK_WALL = registerBlock("marble_brick_wall",
            () -> new UBCWallBlocks("marble_brick_wall", MapColor.TERRACOTTA_WHITE)
    );

    // Buttons

    public static final DeferredBlock<Block> MARBLE_STONE_BUTTON = registerBlock("marble_stone_button",
            () -> new UBCButtonsBlocks("marble_stone_button", BlockSetType.IRON, MapColor.STONE)
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
