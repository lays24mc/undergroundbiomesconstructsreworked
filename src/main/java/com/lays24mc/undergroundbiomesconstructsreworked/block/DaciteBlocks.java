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

public class DaciteBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
            UndergroundBiomesConstructsReworked.MODID
    );

    // ================================
    // Register dacite
    // ================================

    // Blocks
    public static final DeferredBlock<Block> DACITE_BLOCK = registerBlock("dacite_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 1.2F, 1.0F)
    );
    public static  DeferredBlock<Block> DACITE_COBBLE_BLOCK = registerBlock("dacite_cobble_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 1.2F, 1.0F)
    );
    public static  DeferredBlock<Block> DACITE_BRICK_BLOCK = registerBlock("dacite_brick_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 1.2F, 1.0F)
    );
    public static DeferredBlock<Block> DACITE_COAL_ORE = registerBlock("dacite_coal_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 1.2F, 1.0F)
    );
    public static DeferredBlock<Block> DACITE_COPPER_ORE = registerBlock("dacite_copper_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 1.2F, 1.0F)
    );
    public static DeferredBlock<Block> DACITE_IRON_ORE = registerBlock("dacite_iron_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 1.2F, 1.0F)
    );
    public static DeferredBlock<Block> DACITE_GOLD_ORE = registerBlock("dacite_gold_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 1.2F, 1.0F)
    );
    public static DeferredBlock<Block> DACITE_REDSTONE_ORE = registerBlock("dacite_redstone_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 1.2F, 1.0F)
    );
    public static DeferredBlock<Block> DACITE_LAPIS_ORE = registerBlock("dacite_lapis_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 1.2F, 1.0F)
    );

    // Stairs
    public static final DeferredBlock<Block> DACITE_STAIRS = registerBlock("dacite_stairs",
            () -> new UBCStairsBlocks(DACITE_BLOCK, MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> DACITE_BRICK_STAIRS = registerBlock("dacite_brick_stairs",
            () -> new UBCStairsBlocks(DACITE_BRICK_BLOCK, MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> DACITE_COBBLE_STAIRS = registerBlock("dacite_cobble_stairs",
            () -> new UBCStairsBlocks(DACITE_COBBLE_BLOCK,MapColor.TERRACOTTA_WHITE)
    );

    // Slabs
    public static final DeferredBlock<Block> DACITE_BLOCK_SLAB = registerBlock("dacite_block_slab",
            () -> new UBCSlabBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> DACITE_COBBLE_SLAB = registerBlock("dacite_cobble_slab",
            () -> new UBCSlabBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> DACITE_BRICK_SLAB = registerBlock("dacite_brick_slab",
            () -> new UBCSlabBlocks(MapColor.TERRACOTTA_WHITE)
    );

    // Walls
    public static final DeferredBlock<Block> DACITE_BLOCK_WALL = registerBlock("dacite_block_wall",
            () -> new UBCWallBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> DACITE_COBBLE_WALL = registerBlock("dacite_cobble_wall",
            () -> new UBCWallBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static final DeferredBlock<Block> DACITE_BRICK_WALL = registerBlock("dacite_brick_wall",
            () -> new UBCWallBlocks(MapColor.TERRACOTTA_WHITE)
    );

    // Buttons

    public static final DeferredBlock<Block> DACITE_STONE_BUTTON = registerBlock("dacite_stone_button",
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
