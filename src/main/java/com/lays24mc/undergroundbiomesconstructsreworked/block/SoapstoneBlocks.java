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

import java.util.List;
import java.util.function.Supplier;

public class SoapstoneBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
            UndergroundBiomesConstructsReworked.MODID
    );

    // ================================
    // Register Soapstone
    // ================================

    // Blocks
    public static final DeferredBlock<Block> SOAPSTONE_BLOCK = registerBlock("soapstone_block",
            () -> new UBCBlocks("soapstone_block", MapColor.TERRACOTTA_WHITE, 0.4F, 0.2F)
    );
    public static  DeferredBlock<Block> SOAPSTONE_COBBLE_BLOCK = registerBlock("soapstone_cobble_block",
            () -> new UBCBlocks("soapstone_cobble_block", MapColor.TERRACOTTA_WHITE, 0.4F, 0.2F)
    );
    public static  DeferredBlock<Block> SOAPSTONE_BRICK_BLOCK = registerBlock("soapstone_brick_block",
            () -> new UBCBlocks("soapstone_brick_block", MapColor.TERRACOTTA_WHITE, 0.4F, 0.2F)
    );
    public static DeferredBlock<Block> SOAPSTONE_COAL_ORE = registerBlock("soapstone_coal_ore",
            () -> new UBCBlocks("soapstone_coal_ore", MapColor.TERRACOTTA_WHITE, 0.4F, 0.2F)
    );
    public static DeferredBlock<Block> SOAPSTONE_COPPER_ORE = registerBlock("soapstone_copper_ore",
            () -> new UBCBlocks("soapstone_copper_ore", MapColor.TERRACOTTA_WHITE, 0.4F, 0.2F)
    );
    public static DeferredBlock<Block> SOAPSTONE_IRON_ORE = registerBlock("soapstone_iron_ore",
            () -> new UBCBlocks("soapstone_iron_ore", MapColor.TERRACOTTA_WHITE, 0.4F, 0.2F)
    );
    public static DeferredBlock<Block> SOAPSTONE_GOLD_ORE = registerBlock("soapstone_gold_ore",
            () -> new UBCBlocks("soapstone_gold_ore", MapColor.TERRACOTTA_WHITE, 0.4F, 0.2F)
    );
    public static DeferredBlock<Block> SOAPSTONE_REDSTONE_ORE = registerBlock("soapstone_redstone_ore",
            () -> new UBCBlocks("soapstone_redstone_ore", MapColor.TERRACOTTA_WHITE, 0.4F, 0.2F)
    );
    public static DeferredBlock<Block> SOAPSTONE_LAPIS_ORE = registerBlock("soapstone_lapis_ore",
            () -> new UBCBlocks("soapstone_lapis_ore", MapColor.TERRACOTTA_WHITE, 0.4F, 0.2F)
    );

    // Stairs
    public static final DeferredBlock<Block> SOAPSTONE_STAIRS = registerBlock("soapstone_stairs",
            () -> new UBCStairsBlocks("soapstone_stairs", SOAPSTONE_BLOCK, MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> SOAPSTONE_BRICK_STAIRS = registerBlock("soapstone_brick_stairs",
            () -> new UBCStairsBlocks("soapstone_brick_stairs", SOAPSTONE_BRICK_BLOCK, MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> SOAPSTONE_COBBLE_STAIRS = registerBlock("soapstone_cobble_stairs",
            () -> new UBCStairsBlocks("soapstone_cobble_stairs", SOAPSTONE_COBBLE_BLOCK,MapColor.TERRACOTTA_WHITE)
    );

    // Slabs
    public static final DeferredBlock<Block> SOAPSTONE_BLOCK_SLAB = registerBlock("soapstone_block_slab",
            () -> new UBCSlabBlocks("soapstone_block_slab", MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> SOAPSTONE_COBBLE_SLAB = registerBlock("soapstone_cobble_slab",
            () -> new UBCSlabBlocks("soapstone_cobble_slab", MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> SOAPSTONE_BRICK_SLAB = registerBlock("soapstone_brick_slab",
            () -> new UBCSlabBlocks("soapstone_brick_slab", MapColor.TERRACOTTA_WHITE)
    );

    // Walls
    public static final DeferredBlock<Block> SOAPSTONE_BLOCK_WALL = registerBlock("soapstone_block_wall",
            () -> new UBCWallBlocks("soapstone_block_wall", MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> SOAPSTONE_COBBLE_WALL = registerBlock("soapstone_cobble_wall",
            () -> new UBCWallBlocks("soapstone_cobble_wall", MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> SOAPSTONE_BRICK_WALL = registerBlock("soapstone_brick_wall",
            () -> new UBCWallBlocks("soapstone_brick_wall", MapColor.TERRACOTTA_WHITE)
    );

    // Buttons
    public static final DeferredBlock<Block> SOAPSTONE_STONE_BUTTON = registerBlock("soapstone_stone_button",
            () -> new UBCButtonsBlocks("soapstone_stone_button", BlockSetType.IRON, MapColor.STONE)
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
