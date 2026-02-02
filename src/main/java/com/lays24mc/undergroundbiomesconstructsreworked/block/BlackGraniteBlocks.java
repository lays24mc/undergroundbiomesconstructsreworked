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

public class BlackGraniteBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
            UndergroundBiomesConstructsReworked.MODID
    );

    // ================================
    // Register Black Granite
    // ================================

    // Blocks
    public static final DeferredBlock<Block> BLACK_GRANITE_BLOCK = registerBlock("black_granite_block",
            () -> new UBCBlocks(MapColor.COLOR_BLACK, 1.6F, 1.4F)
    );
    public static  DeferredBlock<Block> BLACK_GRANITE_COBBLE_BLOCK = registerBlock("black_granite_cobble_block",
            () -> new UBCBlocks(MapColor.COLOR_BLACK, 1.6F, 1.4F)
    );
    public static  DeferredBlock<Block> BLACK_GRANITE_BRICK_BLOCK = registerBlock("black_granite_brick_block",
            () -> new UBCBlocks(MapColor.COLOR_BLACK, 1.6F, 1.4F)
    );
    public static DeferredBlock<Block> BLACK_GRANITE_IRON_ORE = registerBlock("black_granite_iron_ore",
            () -> new UBCBlocks(MapColor.COLOR_BLACK, 1.6F, 1.4F)
    );
    public static DeferredBlock<Block> BLACK_GRANITE_GOLD_ORE = registerBlock("black_granite_gold_ore",
            () -> new UBCBlocks(MapColor.COLOR_BLACK, 1.6F, 1.4F)
    );
    public static DeferredBlock<Block> BLACK_GRANITE_REDSTONE_ORE = registerBlock("black_granite_redstone_ore",
            () -> new UBCBlocks(MapColor.COLOR_BLACK, 1.6F, 1.4F)
    );
    public static DeferredBlock<Block> BLACK_GRANITE_LAPIS_ORE = registerBlock("black_granite_lapis_ore",
            () -> new UBCBlocks(MapColor.COLOR_BLACK, 1.6F, 1.4F)
    );
    public static DeferredBlock<Block> BLACK_GRANITE_DIAMOND_ORE = registerBlock("black_granite_diamond_ore",
            () -> new UBCBlocks(MapColor.COLOR_BLACK, 1.6F, 1.4F)
    );
    public static DeferredBlock<Block> BLACK_GRANITE_EMERALD_ORE = registerBlock("black_granite_emerald_ore",
            () -> new UBCBlocks(MapColor.COLOR_BLACK, 1.6F, 1.4F)
    );

    // Stairs
    public static final DeferredBlock<Block> BLACK_GRANITE_STAIRS = registerBlock("black_granite_stairs",
            () -> new UBCStairsBlocks(BLACK_GRANITE_BLOCK, MapColor.COLOR_BLACK)
    );
    public static final DeferredBlock<Block> BLACK_GRANITE_BRICK_STAIRS = registerBlock("black_granite_brick_stairs",
            () -> new UBCStairsBlocks(BLACK_GRANITE_BRICK_BLOCK, MapColor.COLOR_BLACK)
    );
    public static final DeferredBlock<Block> BLACK_GRANITE_COBBLE_STAIRS = registerBlock("black_granite_cobble_stairs",
            () -> new UBCStairsBlocks(BLACK_GRANITE_COBBLE_BLOCK,MapColor.COLOR_BLACK)
    );

    // Slabs
    public static final DeferredBlock<Block> BLACK_GRANITE_BLOCK_SLAB = registerBlock("black_granite_block_slab",
            () -> new UBCSlabBlocks(MapColor.COLOR_BLACK)
    );
    public static final DeferredBlock<Block> BLACK_GRANITE_COBBLE_SLAB = registerBlock("black_granite_cobble_slab",
            () -> new UBCSlabBlocks(MapColor.COLOR_BLACK)
    );
    public static final DeferredBlock<Block> BLACK_GRANITE_BRICK_SLAB = registerBlock("black_granite_brick_slab",
            () -> new UBCSlabBlocks(MapColor.COLOR_BLACK)
    );

    // Walls
    public static final DeferredBlock<Block> BLACK_GRANITE_BLOCK_WALL = registerBlock("black_granite_block_wall",
            () -> new UBCWallBlocks(MapColor.COLOR_BLACK)
    );
    public static final DeferredBlock<Block> BLACK_GRANITE_COBBLE_WALL = registerBlock("black_granite_cobble_wall",
            () -> new UBCWallBlocks(MapColor.COLOR_BLACK)
    );
    public static final DeferredBlock<Block> BLACK_GRANITE_BRICK_WALL = registerBlock("black_granite_brick_wall",
            () -> new UBCWallBlocks(MapColor.COLOR_BLACK)
    );

    // Buttons

    public static final DeferredBlock<Block> BLACK_GRANITE_STONE_BUTTON = registerBlock("black_granite_stone_button",
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
