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
    // Register Rhyolite
    // ================================

    // Blocks
    public static final DeferredBlock<Block> RHYOLITE_BLOCK = registerBlock("rhyolite_block",
            () -> new UBCBlocks("rhyolite_block", MapColor.COLOR_LIGHT_GRAY, 1.3F, 1.26F)
    );
    public static DeferredBlock<Block> RHYOLITE_COBBLE_BLOCK = registerBlock("rhyolite_cobble_block",
            () -> new UBCBlocks("rhyolite_cobble_block", MapColor.COLOR_LIGHT_GRAY, 1.3F, 1.26F)
    );
    public static DeferredBlock<Block> RHYOLITE_BRICK_BLOCK = registerBlock("rhyolite_brick_block",
            () -> new UBCBlocks("rhyolite_brick_block", MapColor.COLOR_LIGHT_GRAY, 1.3F, 1.26F)
    );
    public static DeferredBlock<Block> RHYOLITE_COAL_ORE = registerBlock("rhyolite_coal_ore",
            () -> new UBCBlocks("rhyolite_coal_ore", MapColor.COLOR_LIGHT_GRAY, 1.3F, 1.26F)
    );
    public static DeferredBlock<Block> RHYOLITE_COPPER_ORE = registerBlock("rhyolite_copper_ore",
            () -> new UBCBlocks("rhyolite_copper_ore", MapColor.COLOR_LIGHT_GRAY, 1.3F, 1.26F)
    );
    public static DeferredBlock<Block> RHYOLITE_IRON_ORE = registerBlock("rhyolite_iron_ore",
            () -> new UBCBlocks("rhyolite_iron_ore", MapColor.COLOR_LIGHT_GRAY, 1.3F, 1.26F)
    );
    public static DeferredBlock<Block> RHYOLITE_GOLD_ORE = registerBlock("rhyolite_gold_ore",
            () -> new UBCBlocks("rhyolite_gold_ore", MapColor.COLOR_LIGHT_GRAY, 1.3F, 1.26F)
    );
    public static DeferredBlock<Block> RHYOLITE_REDSTONE_ORE = registerBlock("rhyolite_redstone_ore",
            () -> new UBCBlocks("rhyolite_redstone_ore", MapColor.COLOR_LIGHT_GRAY, 1.3F, 1.26F)
    );
    public static DeferredBlock<Block> RHYOLITE_LAPIS_ORE = registerBlock("rhyolite_lapis_ore",
            () -> new UBCBlocks("rhyolite_lapis_ore", MapColor.COLOR_LIGHT_GRAY, 1.3F, 1.26F)
    );

    // Stairs
    public static final DeferredBlock<Block> RHYOLITE_STAIRS = registerBlock("rhyolite_stairs",
            () -> new UBCStairsBlocks("rhyolite_stairs", RHYOLITE_BLOCK, MapColor.COLOR_LIGHT_GRAY)
    );
    public static final DeferredBlock<Block> RHYOLITE_BRICK_STAIRS = registerBlock("rhyolite_brick_stairs",
            () -> new UBCStairsBlocks("rhyolite_brick_stairs", RHYOLITE_BRICK_BLOCK, MapColor.COLOR_LIGHT_GRAY)
    );
    public static final DeferredBlock<Block> RHYOLITE_COBBLE_STAIRS = registerBlock("rhyolite_cobble_stairs",
            () -> new UBCStairsBlocks("rhyolite_cobble_stairs", RHYOLITE_COBBLE_BLOCK, MapColor.COLOR_LIGHT_GRAY)
    );


    // Slabs
    public static final DeferredBlock<Block> RHYOLITE_BLOCK_SLAB = registerBlock("rhyolite_block_slab",
            () -> new UBCSlabBlocks("rhyolite_block_slab", MapColor.COLOR_LIGHT_GRAY)
    );
    public static final DeferredBlock<Block> RHYOLITE_COBBLE_SLAB = registerBlock("rhyolite_cobble_slab",
            () -> new UBCSlabBlocks("rhyolite_cobble_slab", MapColor.COLOR_LIGHT_GRAY)
    );
    public static final DeferredBlock<Block> RHYOLITE_BRICK_SLAB = registerBlock("rhyolite_brick_slab",
            () -> new UBCSlabBlocks("rhyolite_brick_slab", MapColor.COLOR_LIGHT_GRAY)
    );

    // Walls
    public static final DeferredBlock<Block> RHYOLITE_BLOCK_WALL = registerBlock("rhyolite_block_wall",
            () -> new UBCWallBlocks("rhyolite_block_wall", MapColor.COLOR_LIGHT_GRAY)
    );
    public static final DeferredBlock<Block> RHYOLITE_COBBLE_WALL = registerBlock("rhyolite_cobble_wall",
            () -> new UBCWallBlocks("rhyolite_cobble_wall", MapColor.COLOR_LIGHT_GRAY)
    );
    public static final DeferredBlock<Block> RHYOLITE_BRICK_WALL = registerBlock("rhyolite_brick_wall",
            () -> new UBCWallBlocks("rhyolite_brick_wall", MapColor.COLOR_LIGHT_GRAY)
    );

    // Buttons

    public static final DeferredBlock<Block> RHYOLITE_STONE_BUTTON = registerBlock("rhyolite_stone_button",
            () -> new UBCButtonsBlocks("rhyolite_stone_button", BlockSetType.IRON, MapColor.STONE)
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
