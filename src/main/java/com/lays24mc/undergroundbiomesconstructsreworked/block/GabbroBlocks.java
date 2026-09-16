package com.lays24mc.undergroundbiomesconstructsreworked.block;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.custom.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;

public class GabbroBlocks {
    private static final StoneBlockRegistrar REGISTRAR = new StoneBlockRegistrar(UndergroundBiomesConstructsReworked.MODID);

    // ================================
    // Register Gabbro
    // ================================

    // Blocks
    public static final DeferredBlock<Block> GABBRO_BLOCK = REGISTRAR.registerBlock("gabbro_block",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 1.0F, 1.0F)
    );
    public static  DeferredBlock<Block> GABBRO_COBBLE_BLOCK = REGISTRAR.registerBlock("gabbro_cobble_block",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 1.0F, 1.0F)
    );
    public static  DeferredBlock<Block> GABBRO_BRICK_BLOCK = REGISTRAR.registerBlock("gabbro_brick_block",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 1.0F, 1.0F)
    );
    public static DeferredBlock<Block> GABBRO_IRON_ORE = REGISTRAR.registerBlock("gabbro_iron_ore",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 1.0F, 1.0F)
    );
    public static DeferredBlock<Block> GABBRO_GOLD_ORE = REGISTRAR.registerBlock("gabbro_gold_ore",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 1.0F, 1.0F)
    );
    public static DeferredBlock<Block> GABBRO_REDSTONE_ORE = REGISTRAR.registerBlock("gabbro_redstone_ore",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 1.0F, 1.0F)
    );
    public static DeferredBlock<Block> GABBRO_LAPIS_ORE = REGISTRAR.registerBlock("gabbro_lapis_ore",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 1.0F, 1.0F)
    );
    public static DeferredBlock<Block> GABBRO_DIAMOND_ORE = REGISTRAR.registerBlock("gabbro_diamond_ore",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 1.0F, 1.0F)
    );
    public static DeferredBlock<Block> GABBRO_EMERALD_ORE = REGISTRAR.registerBlock("gabbro_emerald_ore",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 1.0F, 1.0F)
    );

    // Stairs
    public static final DeferredBlock<Block> GABBRO_STAIRS = REGISTRAR.registerBlock("gabbro_stairs",
            () -> new UBCStairsBlocks(GABBRO_BLOCK)
    );
    public static final DeferredBlock<Block> GABBRO_BRICK_STAIRS = REGISTRAR.registerBlock("gabbro_brick_stairs",
            () -> new UBCStairsBlocks(GABBRO_BRICK_BLOCK)
    );
    public static final DeferredBlock<Block> GABBRO_COBBLE_STAIRS = REGISTRAR.registerBlock("gabbro_cobble_stairs",
            () -> new UBCStairsBlocks(GABBRO_COBBLE_BLOCK)
    );

    // Slabs
    public static final DeferredBlock<Block> GABBRO_BLOCK_SLAB = REGISTRAR.registerBlock("gabbro_block_slab",
            () -> new UBCSlabBlocks(GABBRO_BLOCK)
    );
    public static final DeferredBlock<Block> GABBRO_COBBLE_SLAB = REGISTRAR.registerBlock("gabbro_cobble_slab",
            () -> new UBCSlabBlocks(GABBRO_COBBLE_BLOCK)
    );
    public static final DeferredBlock<Block> GABBRO_BRICK_SLAB = REGISTRAR.registerBlock("gabbro_brick_slab",
            () -> new UBCSlabBlocks(GABBRO_BRICK_BLOCK)
    );

    // Walls
    public static final DeferredBlock<Block> GABBRO_BLOCK_WALL = REGISTRAR.registerBlock("gabbro_block_wall",
            () -> new UBCWallBlocks(GABBRO_BLOCK)
    );
    public static final DeferredBlock<Block> GABBRO_COBBLE_WALL = REGISTRAR.registerBlock("gabbro_cobble_wall",
            () -> new UBCWallBlocks(GABBRO_COBBLE_BLOCK)
    );
    public static final DeferredBlock<Block> GABBRO_BRICK_WALL = REGISTRAR.registerBlock("gabbro_brick_wall",
            () -> new UBCWallBlocks(GABBRO_BRICK_BLOCK)
    );

    // Buttons

    public static final DeferredBlock<Block> GABBRO_STONE_BUTTON = REGISTRAR.registerBlock("gabbro_stone_button",
            () -> new UBCButtonsBlocks(BlockSetType.IRON, MapColor.STONE)
    );
    public static void register(IEventBus eventBus) {
        REGISTRAR.register(eventBus);
    }
}
