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

public class BlueschistBlocks  {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
            UndergroundBiomesConstructsReworked.MODID
    );

    // ================================
    // Register Blueschist
    // ================================

    // Blocks
    public static final DeferredBlock<Block> BLUESCHIST_BLOCK = registerBlock("blueschist_block",
            () -> new UBCBlocks("blueschist_block", MapColor.COLOR_BLUE, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> BLUESCHIST_COBBLE_BLOCK = registerBlock("blueschist_cobble_block",
            () -> new UBCBlocks("blueschist_cobble_block", MapColor.COLOR_BLUE, 0.7F, 0.54F)
    );
    public static  DeferredBlock<Block> BLUESCHIST_BRICK_BLOCK = registerBlock("blueschist_brick_block",
            () -> new UBCBlocks("blueschist_brick_block", MapColor.COLOR_BLUE, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> BLUESCHIST_COAL_ORE = registerBlock("blueschist_coal_ore",
            () -> new UBCBlocks("blueschist_coal_ore", MapColor.COLOR_BLUE, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> BLUESCHIST_COPPER_ORE = registerBlock("blueschist_copper_ore",
            () -> new UBCBlocks("blueschist_copper_ore", MapColor.COLOR_BLUE, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> BLUESCHIST_IRON_ORE = registerBlock("blueschist_iron_ore",
            () -> new UBCBlocks("blueschist_iron_ore", MapColor.COLOR_BLUE, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> BLUESCHIST_GOLD_ORE = registerBlock("blueschist_gold_ore",
            () -> new UBCBlocks("blueschist_gold_ore", MapColor.COLOR_BLUE, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> BLUESCHIST_REDSTONE_ORE = registerBlock("blueschist_redstone_ore",
            () -> new UBCBlocks("blueschist_redstone_ore", MapColor.COLOR_BLUE, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> BLUESCHIST_LAPIS_ORE = registerBlock("blueschist_lapis_ore",
            () -> new UBCBlocks("blueschist_lapis_ore", MapColor.COLOR_BLUE, 0.7F, 0.54F)
    );

    // Stairs
    public static final DeferredBlock<Block> BLUESCHIST_STAIRS = registerBlock("blueschist_stairs",
            () -> new UBCStairsBlocks("blueschist_stairs", BLUESCHIST_BLOCK, MapColor.COLOR_BLUE)
    );
    public static final DeferredBlock<Block> BLUESCHIST_BRICK_STAIRS = registerBlock("blueschist_brick_stairs",
            () -> new UBCStairsBlocks("blueschist_brick_stairs", BLUESCHIST_BRICK_BLOCK, MapColor.COLOR_BLUE)
    );
    public static final DeferredBlock<Block> BLUESCHIST_COBBLE_STAIRS = registerBlock("blueschist_cobble_stairs",
            () -> new UBCStairsBlocks("blueschist_cobble_stairs", BLUESCHIST_COBBLE_BLOCK,MapColor.COLOR_BLUE)
    );

    // Slabs
    public static final DeferredBlock<Block> BLUESCHIST_BLOCK_SLAB = registerBlock("blueschist_block_slab",
            () -> new UBCSlabBlocks("blueschist_block_slab", MapColor.COLOR_BLUE)
    );
    public static final DeferredBlock<Block> BLUESCHIST_COBBLE_SLAB = registerBlock("blueschist_cobble_slab",
            () -> new UBCSlabBlocks("blueschist_cobble_slab", MapColor.COLOR_BLUE)
    );
    public static final DeferredBlock<Block> BLUESCHIST_BRICK_SLAB = registerBlock("blueschist_brick_slab",
            () -> new UBCSlabBlocks("blueschist_brick_slab", MapColor.COLOR_BLUE)
    );

    // Walls
    public static final DeferredBlock<Block> BLUESCHIST_BLOCK_WALL = registerBlock("blueschist_block_wall",
            () -> new UBCWallBlocks("blueschist_block_wall", MapColor.COLOR_BLUE)
    );
    public static final DeferredBlock<Block> BLUESCHIST_COBBLE_WALL = registerBlock("blueschist_cobble_wall",
            () -> new UBCWallBlocks("blueschist_cobble_wall", MapColor.COLOR_BLUE)
    );
    public static final DeferredBlock<Block> BLUESCHIST_BRICK_WALL = registerBlock("blueschist_brick_wall",
            () -> new UBCWallBlocks("blueschist_brick_wall", MapColor.COLOR_BLUE)
    );

    // Buttons

    public static final DeferredBlock<Block> BLUESCHIST_STONE_BUTTON = registerBlock("blueschist_stone_button",
            () -> new UBCButtonsBlocks("blueschist_stone_button", BlockSetType.IRON, MapColor.STONE)
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
