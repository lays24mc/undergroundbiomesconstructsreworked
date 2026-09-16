package com.lays24mc.undergroundbiomesconstructsreworked.block;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.custom.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;

public class KomatiiteBlocks {

    private static final StoneBlockRegistrar REGISTRAR = new StoneBlockRegistrar(UndergroundBiomesConstructsReworked.MODID);

    // ================================
    // Register Komatiite
    // ================================

    // Blocks
    public static final DeferredBlock<Block> KOMATIITE_BLOCK = REGISTRAR.registerBlock("komatiite_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_YELLOW, 1.5F, 1.3F)
    );
    public static  DeferredBlock<Block> KOMATIITE_COBBLE_BLOCK = REGISTRAR.registerBlock("komatiite_cobble_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_YELLOW, 1.5F, 1.3F)
    );
    public static  DeferredBlock<Block> KOMATIITE_BRICK_BLOCK = REGISTRAR.registerBlock("komatiite_brick_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_YELLOW, 1.5F, 1.3F)
    );
    public static DeferredBlock<Block> KOMATIITE_COAL_ORE = REGISTRAR.registerBlock("komatiite_coal_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_YELLOW, 1.5F, 1.3F)
    );
    public static DeferredBlock<Block> KOMATIITE_COPPER_ORE = REGISTRAR.registerBlock("komatiite_copper_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_YELLOW, 1.5F, 1.3F)
    );
    public static DeferredBlock<Block> KOMATIITE_IRON_ORE = REGISTRAR.registerBlock("komatiite_iron_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_YELLOW, 1.5F, 1.3F)
    );
    public static DeferredBlock<Block> KOMATIITE_GOLD_ORE = REGISTRAR.registerBlock("komatiite_gold_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_YELLOW, 1.5F, 1.3F)
    );
    public static DeferredBlock<Block> KOMATIITE_REDSTONE_ORE = REGISTRAR.registerBlock("komatiite_redstone_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_YELLOW, 1.5F, 1.3F)
    );
    public static DeferredBlock<Block> KOMATIITE_LAPIS_ORE = REGISTRAR.registerBlock("komatiite_lapis_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_YELLOW, 1.5F, 1.3F)
    );

    // Stairs
    public static final DeferredBlock<Block> KOMATIITE_STAIRS = REGISTRAR.registerBlock("komatiite_stairs",
            () -> new UBCStairsBlocks(KOMATIITE_BLOCK)
    );
    public static final DeferredBlock<Block> KOMATIITE_BRICK_STAIRS = REGISTRAR.registerBlock("komatiite_brick_stairs",
            () -> new UBCStairsBlocks(KOMATIITE_BRICK_BLOCK)
    );
    public static final DeferredBlock<Block> KOMATIITE_COBBLE_STAIRS = REGISTRAR.registerBlock("komatiite_cobble_stairs",
            () -> new UBCStairsBlocks(KOMATIITE_COBBLE_BLOCK)
    );

    // Slabs
    public static final DeferredBlock<Block> KOMATIITE_BLOCK_SLAB = REGISTRAR.registerBlock("komatiite_block_slab",
            () -> new UBCSlabBlocks(KOMATIITE_BLOCK)
    );
    public static final DeferredBlock<Block> KOMATIITE_COBBLE_SLAB = REGISTRAR.registerBlock("komatiite_cobble_slab",
            () -> new UBCSlabBlocks(KOMATIITE_COBBLE_BLOCK)
    );
    public static final DeferredBlock<Block> KOMATIITE_BRICK_SLAB = REGISTRAR.registerBlock("komatiite_brick_slab",
            () -> new UBCSlabBlocks(KOMATIITE_BRICK_BLOCK)
    );

    // Walls
    public static final DeferredBlock<Block> KOMATIITE_BLOCK_WALL = REGISTRAR.registerBlock("komatiite_block_wall",
            () -> new UBCWallBlocks(KOMATIITE_BLOCK)
    );
    public static final DeferredBlock<Block> KOMATIITE_COBBLE_WALL = REGISTRAR.registerBlock("komatiite_cobble_wall",
            () -> new UBCWallBlocks(KOMATIITE_COBBLE_BLOCK)
    );
    public static final DeferredBlock<Block> KOMATIITE_BRICK_WALL = REGISTRAR.registerBlock("komatiite_brick_wall",
            () -> new UBCWallBlocks(KOMATIITE_BRICK_BLOCK)
    );

    // Buttons

    public static final DeferredBlock<Block> KOMATIITE_STONE_BUTTON = REGISTRAR.registerBlock("komatiite_stone_button",
            () -> new UBCButtonsBlocks(BlockSetType.IRON, MapColor.STONE)
    );
    public static void register(IEventBus eventBus) {
        REGISTRAR.register(eventBus);
    }
}
