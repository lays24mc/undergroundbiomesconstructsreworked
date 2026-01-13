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

public class RhyoliteBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
            UndergroundBiomesConstructsReworked.MODID
    );

    // ================================
    // Register RHYOLITE
    // ================================

    // Blocks
    public static final DeferredBlock<Block> RHYOLITE_BLOCK = registerBlock("rhyolite_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static DeferredBlock<Block> RHYOLITE_COBBLE_BLOCK = registerBlock("rhyolite_cobble_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static DeferredBlock<Block> RHYOLITE_BRICK_BLOCK = registerBlock("rhyolite_brick_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static DeferredBlock<Block> RHYOLITE_COAL_ORE = registerBlock("rhyolite_coal_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static DeferredBlock<Block> RHYOLITE_COPPER_ORE = registerBlock("rhyolite_copper_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static DeferredBlock<Block> RHYOLITE_IRON_ORE = registerBlock("rhyolite_iron_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static DeferredBlock<Block> RHYOLITE_GOLD_ORE = registerBlock("rhyolite_gold_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static DeferredBlock<Block> RHYOLITE_REDSTONE_ORE = registerBlock("rhyolite_redstone_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static DeferredBlock<Block> RHYOLITE_LAPIS_ORE = registerBlock("rhyolite_lapis_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE)
    );

    // Stairs
    public static final DeferredBlock<Block> RHYOLITE_STAIRS = registerBlock("rhyolite_stairs",
            () -> new UBCStairsBlocks(RHYOLITE_BLOCK, MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> RHYOLITE_BRICK_STAIRS = registerBlock("rhyolite_brick_stairs",
            () -> new UBCStairsBlocks(RHYOLITE_BRICK_BLOCK, MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> RHYOLITE_COBBLE_STAIRS = registerBlock("rhyolite_cobble_stairs",
            () -> new UBCStairsBlocks(RHYOLITE_COBBLE_BLOCK, MapColor.TERRACOTTA_WHITE)
    );


    // Slabs
    public static final DeferredBlock<Block> RHYOLITE_BLOCK_SLAB = registerBlock("rhyolite_block_slab",
            () -> new UBCSlabBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> RHYOLITE_COBBLE_SLAB = registerBlock("rhyolite_cobble_slab",
            () -> new UBCSlabBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> RHYOLITE_BRICK_SLAB = registerBlock("rhyolite_brick_slab",
            () -> new UBCSlabBlocks(MapColor.TERRACOTTA_WHITE)
    );

    // Walls
    public static final DeferredBlock<Block> RHYOLITE_BLOCK_WALL = registerBlock("rhyolite_block_wall",
            () -> new UBCWallBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> RHYOLITE_COBBLE_WALL = registerBlock("rhyolite_cobble_wall",
            () -> new UBCWallBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> RHYOLITE_BRICK_WALL = registerBlock("rhyolite_brick_wall",
            () -> new UBCWallBlocks(MapColor.TERRACOTTA_WHITE)
    );

    // Buttons

    public static final DeferredBlock<Block> RHYOLITE_STONE_BUTTON = registerBlock("rhyolite_stone_button",
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
