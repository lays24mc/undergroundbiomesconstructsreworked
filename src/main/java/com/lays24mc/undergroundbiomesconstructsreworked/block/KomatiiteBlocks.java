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

public class KomatiiteBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
            UndergroundBiomesConstructsReworked.MODID
    );

    // ================================
    // Register Komatiite
    // ================================

    // Blocks
    public static final DeferredBlock<Block> KOMATIITE_BLOCK = registerBlock("komatiite_block",
            () -> new UBCBlocks("komatiite_block", MapColor.TERRACOTTA_YELLOW, 1.5F, 1.3F)
    );
    public static  DeferredBlock<Block> KOMATIITE_COBBLE_BLOCK = registerBlock("komatiite_cobble_block",
            () -> new UBCBlocks("komatiite_cobble_block", MapColor.TERRACOTTA_YELLOW, 1.5F, 1.3F)
    );
    public static  DeferredBlock<Block> KOMATIITE_BRICK_BLOCK = registerBlock("komatiite_brick_block",
            () -> new UBCBlocks("komatiite_brick_block", MapColor.TERRACOTTA_YELLOW, 1.5F, 1.3F)
    );
    public static DeferredBlock<Block> KOMATIITE_COAL_ORE = registerBlock("komatiite_coal_ore",
            () -> new UBCBlocks("komatiite_coal_ore", MapColor.TERRACOTTA_YELLOW, 1.5F, 1.3F)
    );
    public static DeferredBlock<Block> KOMATIITE_COPPER_ORE = registerBlock("komatiite_copper_ore",
            () -> new UBCBlocks("komatiite_copper_ore",MapColor.TERRACOTTA_YELLOW, 1.5F, 1.3F)
    );
    public static DeferredBlock<Block> KOMATIITE_IRON_ORE = registerBlock("komatiite_iron_ore",
            () -> new UBCBlocks("komatiite_iron_ore", MapColor.TERRACOTTA_YELLOW, 1.5F, 1.3F)
    );
    public static DeferredBlock<Block> KOMATIITE_GOLD_ORE = registerBlock("komatiite_gold_ore",
            () -> new UBCBlocks("komatiite_gold_ore", MapColor.TERRACOTTA_YELLOW, 1.5F, 1.3F)
    );
    public static DeferredBlock<Block> KOMATIITE_REDSTONE_ORE = registerBlock("komatiite_redstone_ore",
            () -> new UBCBlocks("komatiite_redstone_ore", MapColor.TERRACOTTA_YELLOW, 1.5F, 1.3F)
    );
    public static DeferredBlock<Block> KOMATIITE_LAPIS_ORE = registerBlock("komatiite_lapis_ore",
            () -> new UBCBlocks("komatiite_lapis_ore", MapColor.TERRACOTTA_YELLOW, 1.5F, 1.3F)
    );

    // Stairs
    public static final DeferredBlock<Block> KOMATIITE_STAIRS = registerBlock("komatiite_stairs",
            () -> new UBCStairsBlocks("komatiite_stairs", KOMATIITE_BLOCK, MapColor.TERRACOTTA_YELLOW)
    );
    public static final DeferredBlock<Block> KOMATIITE_BRICK_STAIRS = registerBlock("komatiite_brick_stairs",
            () -> new UBCStairsBlocks("komatiite_brick_stairs", KOMATIITE_BRICK_BLOCK, MapColor.TERRACOTTA_YELLOW)
    );
    public static final DeferredBlock<Block> KOMATIITE_COBBLE_STAIRS = registerBlock("komatiite_cobble_stairs",
            () -> new UBCStairsBlocks("komatiite_cobble_stairs", KOMATIITE_COBBLE_BLOCK,MapColor.TERRACOTTA_YELLOW)
    );

    // Slabs
    public static final DeferredBlock<Block> KOMATIITE_BLOCK_SLAB = registerBlock("komatiite_block_slab",
            () -> new UBCSlabBlocks("komatiite_block_slab", MapColor.TERRACOTTA_YELLOW)
    );
    public static final DeferredBlock<Block> KOMATIITE_COBBLE_SLAB = registerBlock("komatiite_cobble_slab",
            () -> new UBCSlabBlocks("komatiite_cobble_slab", MapColor.TERRACOTTA_YELLOW)
    );
    public static final DeferredBlock<Block> KOMATIITE_BRICK_SLAB = registerBlock("komatiite_brick_slab",
            () -> new UBCSlabBlocks("komatiite_brick_slab", MapColor.TERRACOTTA_YELLOW)
    );

    // Walls
    public static final DeferredBlock<Block> KOMATIITE_BLOCK_WALL = registerBlock("komatiite_block_wall",
            () -> new UBCWallBlocks("komatiite_block_wall", MapColor.TERRACOTTA_YELLOW)
    );
    public static final DeferredBlock<Block> KOMATIITE_COBBLE_WALL = registerBlock("komatiite_cobble_wall",
            () -> new UBCWallBlocks("komatiite_cobble_wall", MapColor.TERRACOTTA_YELLOW)
    );
    public static final DeferredBlock<Block> KOMATIITE_BRICK_WALL = registerBlock("komatiite_brick_wall",
            () -> new UBCWallBlocks("komatiite_brick_wall", MapColor.TERRACOTTA_YELLOW)
    );

    // Buttons

    public static final DeferredBlock<Block> KOMATIITE_STONE_BUTTON = registerBlock("komatiite_stone_button",
            () -> new UBCButtonsBlocks("komatiite_stone_button", BlockSetType.IRON, MapColor.STONE)
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
