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

public class MigmatiteBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
            UndergroundBiomesConstructsReworked.MODID
    );

    // ================================
    // Register Migmatite
    // ================================

    // Blocks
    public static final DeferredBlock<Block> MIGMATITE_BLOCK = registerBlock("migmatite_block",
            () -> new UBCBlocks("migmatite_block", MapColor.COLOR_GRAY, 0.9F, 0.86F)
    );
    public static  DeferredBlock<Block> MIGMATITE_COBBLE_BLOCK = registerBlock("migmatite_cobble_block",
            () -> new UBCBlocks("migmatite_cobble_block", MapColor.COLOR_GRAY, 0.9F, 0.86F)
    );
    public static  DeferredBlock<Block> MIGMATITE_BRICK_BLOCK = registerBlock("migmatite_brick_block",
            () -> new UBCBlocks("migmatite_brick_block", MapColor.COLOR_GRAY, 0.9F, 0.86F)
    );
    public static DeferredBlock<Block> MIGMATITE_IRON_ORE = registerBlock("migmatite_iron_ore",
            () -> new UBCBlocks("migmatite_iron_ore", MapColor.COLOR_GRAY, 0.9F, 0.86F)
    );
    public static DeferredBlock<Block> MIGMATITE_GOLD_ORE = registerBlock("migmatite_gold_ore",
            () -> new UBCBlocks("migmatite_gold_ore", MapColor.COLOR_GRAY, 0.9F, 0.86F)
    );
    public static DeferredBlock<Block> MIGMATITE_REDSTONE_ORE = registerBlock("migmatite_redstone_ore",
            () -> new UBCBlocks("migmatite_redstone_ore", MapColor.COLOR_GRAY, 0.9F, 0.86F)
    );
    public static DeferredBlock<Block> MIGMATITE_LAPIS_ORE = registerBlock("migmatite_lapis_ore",
            () -> new UBCBlocks("migmatite_lapis_ore", MapColor.COLOR_GRAY, 0.9F, 0.86F)
    );
    public static DeferredBlock<Block> MIGMATITE_DIAMOND_ORE = registerBlock("migmatite_diamond_ore",
            () -> new UBCBlocks("migmatite_diamond_ore", MapColor.COLOR_GRAY, 0.9F, 0.86F)
    );
    public static DeferredBlock<Block> MIGMATITE_EMERALD_ORE = registerBlock("migmatite_emerald_ore",
            () -> new UBCBlocks("migmatite_emerald_ore", MapColor.COLOR_GRAY, 0.9F, 0.86F)
    );

    // Stairs
    public static final DeferredBlock<Block> MIGMATITE_STAIRS = registerBlock("migmatite_stairs",
            () -> new UBCStairsBlocks("migmatite_stairs", MIGMATITE_BLOCK, MapColor.COLOR_GRAY)
    );
    public static final DeferredBlock<Block> MIGMATITE_BRICK_STAIRS = registerBlock("migmatite_brick_stairs",
            () -> new UBCStairsBlocks("migmatite_brick_stairs", MIGMATITE_BRICK_BLOCK, MapColor.COLOR_GRAY)
    );
    public static final DeferredBlock<Block> MIGMATITE_COBBLE_STAIRS = registerBlock("migmatite_cobble_stairs",
            () -> new UBCStairsBlocks("migmatite_cobble_stairs", MIGMATITE_COBBLE_BLOCK,MapColor.COLOR_GRAY)
    );

    // Slabs
    public static final DeferredBlock<Block> MIGMATITE_BLOCK_SLAB = registerBlock("migmatite_block_slab",
            () -> new UBCSlabBlocks("migmatite_block_slab", MapColor.COLOR_GRAY)
    );
    public static final DeferredBlock<Block> MIGMATITE_COBBLE_SLAB = registerBlock("migmatite_cobble_slab",
            () -> new UBCSlabBlocks("migmatite_cobble_slab", MapColor.COLOR_GRAY)
    );
    public static final DeferredBlock<Block> MIGMATITE_BRICK_SLAB = registerBlock("migmatite_brick_slab",
            () -> new UBCSlabBlocks("migmatite_brick_slab", MapColor.COLOR_GRAY)
    );

    // Walls
    public static final DeferredBlock<Block> MIGMATITE_BLOCK_WALL = registerBlock("migmatite_block_wall",
            () -> new UBCWallBlocks("migmatite_block_wall", MapColor.COLOR_GRAY)
    );
    public static final DeferredBlock<Block> MIGMATITE_COBBLE_WALL = registerBlock("migmatite_cobble_wall",
            () -> new UBCWallBlocks("migmatite_cobble_wall", MapColor.COLOR_GRAY)
    );
    public static final DeferredBlock<Block> MIGMATITE_BRICK_WALL = registerBlock("migmatite_brick_wall",
            () -> new UBCWallBlocks("migmatite_brick_wall", MapColor.COLOR_GRAY)
    );

    // Buttons

    public static final DeferredBlock<Block> MIGMATITE_STONE_BUTTON = registerBlock("migmatite_stone_button",
            () -> new UBCButtonsBlocks("migmatite_stone_button", BlockSetType.IRON, MapColor.STONE)
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
