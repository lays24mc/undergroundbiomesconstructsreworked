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

public class GneissBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
            UndergroundBiomesConstructsReworked.MODID
    );

    // ================================
    // Register Gneiss
    // ================================

    // Blocks
    public static final DeferredBlock<Block> GNEISS_BLOCK = registerBlock("gneiss_block",
            () -> new UBCBlocks("gneiss_block", MapColor.COLOR_LIGHT_GRAY, 1.1F, 1.11F)
    );
    public static  DeferredBlock<Block> GNEISS_COBBLE_BLOCK = registerBlock("gneiss_cobble_block",
            () -> new UBCBlocks("gneiss_cobble_block", MapColor.COLOR_LIGHT_GRAY, 1.1F, 1.11F)
    );
    public static  DeferredBlock<Block> GNEISS_BRICK_BLOCK = registerBlock("gneiss_brick_block",
            () -> new UBCBlocks("gneiss_brick_block", MapColor.COLOR_LIGHT_GRAY, 1.1F, 1.11F)
    );
    public static DeferredBlock<Block> GNEISS_IRON_ORE = registerBlock("gneiss_iron_ore",
            () -> new UBCBlocks("gneiss_iron_ore", MapColor.COLOR_LIGHT_GRAY, 1.1F, 1.11F)
    );
    public static DeferredBlock<Block> GNEISS_GOLD_ORE = registerBlock("gneiss_gold_ore",
            () -> new UBCBlocks("gneiss_gold_ore", MapColor.COLOR_LIGHT_GRAY, 1.1F, 1.11F)
    );
    public static DeferredBlock<Block> GNEISS_REDSTONE_ORE = registerBlock("gneiss_redstone_ore",
            () -> new UBCBlocks("gneiss_redstone_ore", MapColor.COLOR_LIGHT_GRAY, 1.1F, 1.11F)
    );
    public static DeferredBlock<Block> GNEISS_LAPIS_ORE = registerBlock("gneiss_lapis_ore",
            () -> new UBCBlocks("gneiss_lapis_ore", MapColor.COLOR_LIGHT_GRAY, 1.1F, 1.11F)
    );
    public static DeferredBlock<Block> GNEISS_DIAMOND_ORE = registerBlock("gneiss_diamond_ore",
            () -> new UBCBlocks("gneiss_diamond_ore", MapColor.COLOR_LIGHT_GRAY, 1.1F, 1.11F)
    );
    public static DeferredBlock<Block> GNEISS_EMERALD_ORE = registerBlock("gneiss_emerald_ore",
            () -> new UBCBlocks("gneiss_emerald_ore", MapColor.COLOR_LIGHT_GRAY, 1.1F, 1.11F)
    );

    // Stairs
    public static final DeferredBlock<Block> GNEISS_STAIRS = registerBlock("gneiss_stairs",
            () -> new UBCStairsBlocks("gneiss_stairs", GNEISS_BLOCK, MapColor.COLOR_LIGHT_GRAY)
    );
    public static final DeferredBlock<Block> GNEISS_BRICK_STAIRS = registerBlock("gneiss_brick_stairs",
            () -> new UBCStairsBlocks("gneiss_brick_stairs", GNEISS_BRICK_BLOCK, MapColor.COLOR_LIGHT_GRAY)
    );
    public static final DeferredBlock<Block> GNEISS_COBBLE_STAIRS = registerBlock("gneiss_cobble_stairs",
            () -> new UBCStairsBlocks("gneiss_cobble_stairs", GNEISS_COBBLE_BLOCK,MapColor.COLOR_LIGHT_GRAY)
    );

    // Slabs
    public static final DeferredBlock<Block> GNEISS_BLOCK_SLAB = registerBlock("gneiss_block_slab",
            () -> new UBCSlabBlocks("gneiss_block_slab", MapColor.COLOR_LIGHT_GRAY)
    );
    public static final DeferredBlock<Block> GNEISS_COBBLE_SLAB = registerBlock("gneiss_cobble_slab",
            () -> new UBCSlabBlocks("gneiss_cobble_slab", MapColor.COLOR_LIGHT_GRAY)
    );
    public static final DeferredBlock<Block> GNEISS_BRICK_SLAB = registerBlock("gneiss_brick_slab",
            () -> new UBCSlabBlocks("gneiss_brick_slab", MapColor.COLOR_LIGHT_GRAY)
    );

    // Walls
    public static final DeferredBlock<Block> GNEISS_BLOCK_WALL = registerBlock("gneiss_block_wall",
            () -> new UBCWallBlocks("gneiss_block_wall", MapColor.COLOR_LIGHT_GRAY)
    );
    public static final DeferredBlock<Block> GNEISS_COBBLE_WALL = registerBlock("gneiss_cobble_wall",
            () -> new UBCWallBlocks("gneiss_cobble_wall", MapColor.COLOR_LIGHT_GRAY)
    );
    public static final DeferredBlock<Block> GNEISS_BRICK_WALL = registerBlock("gneiss_brick_wall",
            () -> new UBCWallBlocks("gneiss_brick_wall", MapColor.COLOR_LIGHT_GRAY)
    );

    // Buttons

    public static final DeferredBlock<Block> GNEISS_STONE_BUTTON = registerBlock("gneiss_stone_button",
            () -> new UBCButtonsBlocks("gneiss_stone_button", BlockSetType.IRON, MapColor.STONE)
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
