package com.lays24mc.undergroundbiomesconstructsreworked.block;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.custom.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;

public class DaciteBlocks {

    private static final StoneBlockRegistrar REGISTRAR = new StoneBlockRegistrar(UndergroundBiomesConstructsReworked.MODID);

    // ================================
    // Register Dacite
    // ================================

    // Blocks
    public static final DeferredBlock<Block> DACITE_BLOCK = REGISTRAR.registerBlock("dacite_block",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 1.2F, 1.0F)
    );
    public static  DeferredBlock<Block> DACITE_COBBLE_BLOCK = REGISTRAR.registerBlock("dacite_cobble_block",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 1.2F, 1.0F)
    );
    public static  DeferredBlock<Block> DACITE_BRICK_BLOCK = REGISTRAR.registerBlock("dacite_brick_block",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 1.2F, 1.0F)
    );
    public static DeferredBlock<Block> DACITE_COAL_ORE = REGISTRAR.registerBlock("dacite_coal_ore",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 1.2F, 1.0F)
    );
    public static DeferredBlock<Block> DACITE_COPPER_ORE = REGISTRAR.registerBlock("dacite_copper_ore",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 1.2F, 1.0F)
    );
    public static DeferredBlock<Block> DACITE_IRON_ORE = REGISTRAR.registerBlock("dacite_iron_ore",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 1.2F, 1.0F)
    );
    public static DeferredBlock<Block> DACITE_GOLD_ORE = REGISTRAR.registerBlock("dacite_gold_ore",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 1.2F, 1.0F)
    );
    public static DeferredBlock<Block> DACITE_REDSTONE_ORE = REGISTRAR.registerBlock("dacite_redstone_ore",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 1.2F, 1.0F)
    );
    public static DeferredBlock<Block> DACITE_LAPIS_ORE = REGISTRAR.registerBlock("dacite_lapis_ore",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 1.2F, 1.0F)
    );

    // Stairs
    public static final DeferredBlock<Block> DACITE_STAIRS = REGISTRAR.registerBlock("dacite_stairs",
            () -> new UBCStairsBlocks(DACITE_BLOCK)
    );
    public static final DeferredBlock<Block> DACITE_BRICK_STAIRS = REGISTRAR.registerBlock("dacite_brick_stairs",
            () -> new UBCStairsBlocks(DACITE_BRICK_BLOCK)
    );
    public static final DeferredBlock<Block> DACITE_COBBLE_STAIRS = REGISTRAR.registerBlock("dacite_cobble_stairs",
            () -> new UBCStairsBlocks(DACITE_COBBLE_BLOCK)
    );

    // Slabs
    public static final DeferredBlock<Block> DACITE_BLOCK_SLAB = REGISTRAR.registerBlock("dacite_block_slab",
            () -> new UBCSlabBlocks(DACITE_BLOCK)
    );
    public static final DeferredBlock<Block> DACITE_COBBLE_SLAB = REGISTRAR.registerBlock("dacite_cobble_slab",
            () -> new UBCSlabBlocks(DACITE_COBBLE_BLOCK)
    );
    public static final DeferredBlock<Block> DACITE_BRICK_SLAB = REGISTRAR.registerBlock("dacite_brick_slab",
            () -> new UBCSlabBlocks(DACITE_BRICK_BLOCK)
    );

    // Walls
    public static final DeferredBlock<Block> DACITE_BLOCK_WALL = REGISTRAR.registerBlock("dacite_block_wall",
            () -> new UBCWallBlocks(DACITE_BLOCK)
    );
    public static final DeferredBlock<Block> DACITE_COBBLE_WALL = REGISTRAR.registerBlock("dacite_cobble_wall",
            () -> new UBCWallBlocks(DACITE_COBBLE_BLOCK)
    );
    public static final DeferredBlock<Block> DACITE_BRICK_WALL = REGISTRAR.registerBlock("dacite_brick_wall",
            () -> new UBCWallBlocks(DACITE_BRICK_BLOCK)
    );

    // Buttons

    public static final DeferredBlock<Block> DACITE_STONE_BUTTON = REGISTRAR.registerBlock("dacite_stone_button",
            () -> new UBCButtonsBlocks(BlockSetType.IRON, MapColor.STONE)
    );
    public static void register(IEventBus eventBus) {
        REGISTRAR.register(eventBus);
    }
}
