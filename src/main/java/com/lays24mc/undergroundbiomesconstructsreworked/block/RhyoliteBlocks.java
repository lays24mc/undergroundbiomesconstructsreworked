package com.lays24mc.undergroundbiomesconstructsreworked.block;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.custom.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;

public class RhyoliteBlocks {
    private static final StoneBlockRegistrar REGISTRAR = new StoneBlockRegistrar(UndergroundBiomesConstructsReworked.MODID);

    // ================================
    // Register Rhyolite
    // ================================

    // Blocks
    public static final DeferredBlock<Block> RHYOLITE_BLOCK = REGISTRAR.registerBlock("rhyolite_block",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 1.3F, 1.26F)
    );
    public static DeferredBlock<Block> RHYOLITE_COBBLE_BLOCK = REGISTRAR.registerBlock("rhyolite_cobble_block",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 1.3F, 1.26F)
    );
    public static DeferredBlock<Block> RHYOLITE_BRICK_BLOCK = REGISTRAR.registerBlock("rhyolite_brick_block",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 1.3F, 1.26F)
    );
    public static DeferredBlock<Block> RHYOLITE_COAL_ORE = REGISTRAR.registerBlock("rhyolite_coal_ore",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 1.3F, 1.26F)
    );
    public static DeferredBlock<Block> RHYOLITE_COPPER_ORE = REGISTRAR.registerBlock("rhyolite_copper_ore",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 1.3F, 1.26F)
    );
    public static DeferredBlock<Block> RHYOLITE_IRON_ORE = REGISTRAR.registerBlock("rhyolite_iron_ore",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 1.3F, 1.26F)
    );
    public static DeferredBlock<Block> RHYOLITE_GOLD_ORE = REGISTRAR.registerBlock("rhyolite_gold_ore",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 1.3F, 1.26F)
    );
    public static DeferredBlock<Block> RHYOLITE_REDSTONE_ORE = REGISTRAR.registerBlock("rhyolite_redstone_ore",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 1.3F, 1.26F)
    );
    public static DeferredBlock<Block> RHYOLITE_LAPIS_ORE = REGISTRAR.registerBlock("rhyolite_lapis_ore",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 1.3F, 1.26F)
    );

    // Stairs
    public static final DeferredBlock<Block> RHYOLITE_STAIRS = REGISTRAR.registerBlock("rhyolite_stairs",
            () -> new UBCStairsBlocks(RHYOLITE_BLOCK)
    );
    public static final DeferredBlock<Block> RHYOLITE_BRICK_STAIRS = REGISTRAR.registerBlock("rhyolite_brick_stairs",
            () -> new UBCStairsBlocks(RHYOLITE_BRICK_BLOCK)
    );
    public static final DeferredBlock<Block> RHYOLITE_COBBLE_STAIRS = REGISTRAR.registerBlock("rhyolite_cobble_stairs",
            () -> new UBCStairsBlocks(RHYOLITE_COBBLE_BLOCK)
    );


    // Slabs
    public static final DeferredBlock<Block> RHYOLITE_BLOCK_SLAB = REGISTRAR.registerBlock("rhyolite_block_slab",
            () -> new UBCSlabBlocks(RHYOLITE_BLOCK)
    );
    public static final DeferredBlock<Block> RHYOLITE_COBBLE_SLAB = REGISTRAR.registerBlock("rhyolite_cobble_slab",
            () -> new UBCSlabBlocks(RHYOLITE_COBBLE_BLOCK)
    );
    public static final DeferredBlock<Block> RHYOLITE_BRICK_SLAB = REGISTRAR.registerBlock("rhyolite_brick_slab",
            () -> new UBCSlabBlocks(RHYOLITE_BRICK_BLOCK)
    );

    // Walls
    public static final DeferredBlock<Block> RHYOLITE_BLOCK_WALL = REGISTRAR.registerBlock("rhyolite_block_wall",
            () -> new UBCWallBlocks(RHYOLITE_BLOCK)
    );
    public static final DeferredBlock<Block> RHYOLITE_COBBLE_WALL = REGISTRAR.registerBlock("rhyolite_cobble_wall",
            () -> new UBCWallBlocks(RHYOLITE_COBBLE_BLOCK)
    );
    public static final DeferredBlock<Block> RHYOLITE_BRICK_WALL = REGISTRAR.registerBlock("rhyolite_brick_wall",
            () -> new UBCWallBlocks(RHYOLITE_BRICK_BLOCK)
    );

    // Buttons

    public static final DeferredBlock<Block> RHYOLITE_STONE_BUTTON = REGISTRAR.registerBlock("rhyolite_stone_button",
            () -> new UBCButtonsBlocks(BlockSetType.IRON, MapColor.STONE)
    );
    public static void register(IEventBus eventBus) {
        REGISTRAR.register(eventBus);
    }
}
