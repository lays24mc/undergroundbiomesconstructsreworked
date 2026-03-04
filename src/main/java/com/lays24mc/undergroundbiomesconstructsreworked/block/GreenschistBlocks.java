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

public class GreenschistBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
            UndergroundBiomesConstructsReworked.MODID
    );

    // ================================
    // Register Greenschist
    // ================================

    // Blocks
    public static final DeferredBlock<Block> GREENSCHIST_BLOCK = registerBlock("greenschist_block",
            () -> new UBCBlocks("greenschist_block", MapColor.COLOR_GREEN, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> GREENSCHIST_COBBLE_BLOCK = registerBlock("greenschist_cobble_block",
            () -> new UBCBlocks("greenschist_cobble_block", MapColor.COLOR_GREEN, 0.7F, 0.54F)
    );
    public static  DeferredBlock<Block> GREENSCHIST_BRICK_BLOCK = registerBlock("greenschist_brick_block",
            () -> new UBCBlocks("greenschist_brick_block", MapColor.COLOR_GREEN, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> GREENSCHIST_COAL_ORE = registerBlock("greenschist_coal_ore",
            () -> new UBCBlocks("greenschist_coal_ore", MapColor.COLOR_GREEN, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> GREENSCHIST_COPPER_ORE = registerBlock("greenschist_copper_ore",
            () -> new UBCBlocks("greenschist_copper_ore", MapColor.COLOR_GREEN, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> GREENSCHIST_IRON_ORE = registerBlock("greenschist_iron_ore",
            () -> new UBCBlocks("greenschist_iron_ore", MapColor.COLOR_GREEN, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> GREENSCHIST_GOLD_ORE = registerBlock("greenschist_gold_ore",
            () -> new UBCBlocks("greenschist_gold_ore", MapColor.COLOR_GREEN, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> GREENSCHIST_REDSTONE_ORE = registerBlock("greenschist_redstone_ore",
            () -> new UBCBlocks("greenschist_redstone_ore", MapColor.COLOR_GREEN, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> GREENSCHIST_LAPIS_ORE = registerBlock("greenschist_lapis_ore",
            () -> new UBCBlocks("greenschist_lapis_ore",MapColor.COLOR_GREEN, 0.7F, 0.54F)
    );

    // Stairs
    public static final DeferredBlock<Block> GREENSCHIST_STAIRS = registerBlock("greenschist_stairs",
            () -> new UBCStairsBlocks("greenschist_stairs", GREENSCHIST_BLOCK, MapColor.COLOR_GREEN)
    );
    public static final DeferredBlock<Block> GREENSCHIST_BRICK_STAIRS = registerBlock("greenschist_brick_stairs",
            () -> new UBCStairsBlocks("greenschist_brick_stairs", GREENSCHIST_BRICK_BLOCK, MapColor.COLOR_GREEN)
    );
    public static final DeferredBlock<Block> GREENSCHIST_COBBLE_STAIRS = registerBlock("greenschist_cobble_stairs",
            () -> new UBCStairsBlocks("greenschist_cobble_stairs", GREENSCHIST_COBBLE_BLOCK,MapColor.COLOR_GREEN)
    );

    // Slabs
    public static final DeferredBlock<Block> GREENSCHIST_BLOCK_SLAB = registerBlock("greenschist_block_slab",
            () -> new UBCSlabBlocks("greenschist_block_slab", MapColor.COLOR_GREEN)
    );
    public static final DeferredBlock<Block> GREENSCHIST_COBBLE_SLAB = registerBlock("greenschist_cobble_slab",
            () -> new UBCSlabBlocks("greenschist_cobble_slab", MapColor.COLOR_GREEN)
    );
    public static final DeferredBlock<Block> GREENSCHIST_BRICK_SLAB = registerBlock("greenschist_brick_slab",
            () -> new UBCSlabBlocks("greenschist_brick_slab", MapColor.COLOR_GREEN)
    );

    // Walls
    public static final DeferredBlock<Block> GREENSCHIST_BLOCK_WALL = registerBlock("greenschist_block_wall",
            () -> new UBCWallBlocks("greenschist_block_wall", MapColor.COLOR_GREEN)
    );
    public static final DeferredBlock<Block> GREENSCHIST_COBBLE_WALL = registerBlock("greenschist_cobble_wall",
            () -> new UBCWallBlocks("greenschist_cobble_wall", MapColor.COLOR_GREEN)
    );
    public static final DeferredBlock<Block> GREENSCHIST_BRICK_WALL = registerBlock("greenschist_brick_wall",
            () -> new UBCWallBlocks("greenschist_brick_wall", MapColor.COLOR_GREEN)
    );

    // Buttons

    public static final DeferredBlock<Block> GREENSCHIST_STONE_BUTTON = registerBlock("greenschist_stone_button",
            () -> new UBCButtonsBlocks("greenschist_stone_button", BlockSetType.IRON, MapColor.STONE)
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
