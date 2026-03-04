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

public class GabbroBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
            UndergroundBiomesConstructsReworked.MODID
    );

    // ================================
    // Register Gabbro
    // ================================

    // Blocks
    public static final DeferredBlock<Block> GABBRO_BLOCK = registerBlock("gabbro_block",
            () -> new UBCBlocks("gabbro_block", MapColor.COLOR_LIGHT_GRAY, 1.0F, 1.0F)
    );
    public static  DeferredBlock<Block> GABBRO_COBBLE_BLOCK = registerBlock("gabbro_cobble_block",
            () -> new UBCBlocks("gabbro_cobble_block", MapColor.COLOR_LIGHT_GRAY, 1.0F, 1.0F)
    );
    public static  DeferredBlock<Block> GABBRO_BRICK_BLOCK = registerBlock("gabbro_brick_block",
            () -> new UBCBlocks("gabbro_brick_block", MapColor.COLOR_LIGHT_GRAY, 1.0F, 1.0F)
    );
    public static DeferredBlock<Block> GABBRO_IRON_ORE = registerBlock("gabbro_iron_ore",
            () -> new UBCBlocks("gabbro_iron_ore", MapColor.COLOR_LIGHT_GRAY, 1.0F, 1.0F)
    );
    public static DeferredBlock<Block> GABBRO_GOLD_ORE = registerBlock("gabbro_gold_ore",
            () -> new UBCBlocks("gabbro_gold_ore", MapColor.COLOR_LIGHT_GRAY, 1.0F, 1.0F)
    );
    public static DeferredBlock<Block> GABBRO_REDSTONE_ORE = registerBlock("gabbro_redstone_ore",
            () -> new UBCBlocks("gabbro_redstone_ore", MapColor.COLOR_LIGHT_GRAY, 1.0F, 1.0F)
    );
    public static DeferredBlock<Block> GABBRO_LAPIS_ORE = registerBlock("gabbro_lapis_ore",
            () -> new UBCBlocks("gabbro_lapis_ore", MapColor.COLOR_LIGHT_GRAY, 1.0F, 1.0F)
    );
    public static DeferredBlock<Block> GABBRO_DIAMOND_ORE = registerBlock("gabbro_diamond_ore",
            () -> new UBCBlocks("gabbro_diamond_ore", MapColor.COLOR_LIGHT_GRAY, 1.0F, 1.0F)
    );
    public static DeferredBlock<Block> GABBRO_EMERALD_ORE = registerBlock("gabbro_emerald_ore",
            () -> new UBCBlocks("gabbro_emerald_ore", MapColor.COLOR_LIGHT_GRAY, 1.0F, 1.0F)
    );

    // Stairs
    public static final DeferredBlock<Block> GABBRO_STAIRS = registerBlock("gabbro_stairs",
            () -> new UBCStairsBlocks("gabbro_stairs", GABBRO_BLOCK, MapColor.COLOR_LIGHT_GRAY)
    );
    public static final DeferredBlock<Block> GABBRO_BRICK_STAIRS = registerBlock("gabbro_brick_stairs",
            () -> new UBCStairsBlocks("gabbro_brick_stairs", GABBRO_BRICK_BLOCK, MapColor.COLOR_LIGHT_GRAY)
    );
    public static final DeferredBlock<Block> GABBRO_COBBLE_STAIRS = registerBlock("gabbro_cobble_stairs",
            () -> new UBCStairsBlocks("gabbro_cobble_stairs", GABBRO_COBBLE_BLOCK,MapColor.COLOR_LIGHT_GRAY)
    );

    // Slabs
    public static final DeferredBlock<Block> GABBRO_BLOCK_SLAB = registerBlock("gabbro_block_slab",
            () -> new UBCSlabBlocks("gabbro_block_slab", MapColor.COLOR_LIGHT_GRAY)
    );
    public static final DeferredBlock<Block> GABBRO_COBBLE_SLAB = registerBlock("gabbro_cobble_slab",
            () -> new UBCSlabBlocks("gabbro_cobble_slab", MapColor.COLOR_LIGHT_GRAY)
    );
    public static final DeferredBlock<Block> GABBRO_BRICK_SLAB = registerBlock("gabbro_brick_slab",
            () -> new UBCSlabBlocks("gabbro_brick_slab", MapColor.COLOR_LIGHT_GRAY)
    );

    // Walls
    public static final DeferredBlock<Block> GABBRO_BLOCK_WALL = registerBlock("gabbro_block_wall",
            () -> new UBCWallBlocks("gabbro_block_wall", MapColor.COLOR_LIGHT_GRAY)
    );
    public static final DeferredBlock<Block> GABBRO_COBBLE_WALL = registerBlock("gabbro_cobble_wall",
            () -> new UBCWallBlocks("gabbro_cobble_wall", MapColor.COLOR_LIGHT_GRAY)
    );
    public static final DeferredBlock<Block> GABBRO_BRICK_WALL = registerBlock("gabbro_brick_wall",
            () -> new UBCWallBlocks("gabbro_brick_wall", MapColor.COLOR_LIGHT_GRAY)
    );

    // Buttons

    public static final DeferredBlock<Block> GABBRO_STONE_BUTTON = registerBlock("gabbro_stone_button",
            () -> new UBCButtonsBlocks("gabbro_stone_button", BlockSetType.IRON, MapColor.STONE)
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
