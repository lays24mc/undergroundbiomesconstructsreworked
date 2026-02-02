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
            () -> new UBCBlocks(MapColor.COLOR_GREEN, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> GREENSCHIST_COBBLE_BLOCK = registerBlock("greenschist_cobble_block",
            () -> new UBCBlocks(MapColor.COLOR_GREEN, 0.7F, 0.54F)
    );
    public static  DeferredBlock<Block> GREENSCHIST_BRICK_BLOCK = registerBlock("greenschist_brick_block",
            () -> new UBCBlocks(MapColor.COLOR_GREEN, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> GREENSCHIST_COAL_ORE = registerBlock("greenschist_coal_ore",
            () -> new UBCBlocks(MapColor.COLOR_GREEN, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> GREENSCHIST_COPPER_ORE = registerBlock("greenschist_copper_ore",
            () -> new UBCBlocks(MapColor.COLOR_GREEN, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> GREENSCHIST_IRON_ORE = registerBlock("greenschist_iron_ore",
            () -> new UBCBlocks(MapColor.COLOR_GREEN, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> GREENSCHIST_GOLD_ORE = registerBlock("greenschist_gold_ore",
            () -> new UBCBlocks(MapColor.COLOR_GREEN, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> GREENSCHIST_REDSTONE_ORE = registerBlock("greenschist_redstone_ore",
            () -> new UBCBlocks(MapColor.COLOR_GREEN, 0.7F, 0.54F)
    );
    public static DeferredBlock<Block> GREENSCHIST_LAPIS_ORE = registerBlock("greenschist_lapis_ore",
            () -> new UBCBlocks(MapColor.COLOR_GREEN, 0.7F, 0.54F)
    );

    // Stairs
    public static final DeferredBlock<Block> GREENSCHIST_STAIRS = registerBlock("greenschist_stairs",
            () -> new UBCStairsBlocks(GREENSCHIST_BLOCK, MapColor.COLOR_GREEN)
    );
    public static final DeferredBlock<Block> GREENSCHIST_BRICK_STAIRS = registerBlock("greenschist_brick_stairs",
            () -> new UBCStairsBlocks(GREENSCHIST_BRICK_BLOCK, MapColor.COLOR_GREEN)
    );
    public static final DeferredBlock<Block> GREENSCHIST_COBBLE_STAIRS = registerBlock("greenschist_cobble_stairs",
            () -> new UBCStairsBlocks(GREENSCHIST_COBBLE_BLOCK,MapColor.COLOR_GREEN)
    );

    // Slabs
    public static final DeferredBlock<Block> GREENSCHIST_BLOCK_SLAB = registerBlock("greenschist_block_slab",
            () -> new UBCSlabBlocks(MapColor.COLOR_GREEN)
    );
    public static final DeferredBlock<Block> GREENSCHIST_COBBLE_SLAB = registerBlock("greenschist_cobble_slab",
            () -> new UBCSlabBlocks(MapColor.COLOR_GREEN)
    );
    public static final DeferredBlock<Block> GREENSCHIST_BRICK_SLAB = registerBlock("greenschist_brick_slab",
            () -> new UBCSlabBlocks(MapColor.COLOR_GREEN)
    );

    // Walls
    public static final DeferredBlock<Block> GREENSCHIST_BLOCK_WALL = registerBlock("greenschist_block_wall",
            () -> new UBCWallBlocks(MapColor.COLOR_GREEN)
    );
    public static final DeferredBlock<Block> GREENSCHIST_COBBLE_WALL = registerBlock("greenschist_cobble_wall",
            () -> new UBCWallBlocks(MapColor.COLOR_GREEN)
    );
    public static final DeferredBlock<Block> GREENSCHIST_BRICK_WALL = registerBlock("greenschist_brick_wall",
            () -> new UBCWallBlocks(MapColor.COLOR_GREEN)
    );

    // Buttons

    public static final DeferredBlock<Block> GREENSCHIST_STONE_BUTTON = registerBlock("greenschist_stone_button",
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
