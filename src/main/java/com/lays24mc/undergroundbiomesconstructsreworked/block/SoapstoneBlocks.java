package com.lays24mc.undergroundbiomesconstructsreworked.block;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.custom.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.List;
public class SoapstoneBlocks {

    private static final StoneBlockRegistrar REGISTRAR = new StoneBlockRegistrar(UndergroundBiomesConstructsReworked.MODID);

    // ================================
    // Register Soapstone
    // ================================

    // Blocks
    public static final DeferredBlock<Block> SOAPSTONE_BLOCK = REGISTRAR.registerBlock("soapstone_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.4F, 0.2F)
    );
    public static  DeferredBlock<Block> SOAPSTONE_COBBLE_BLOCK = REGISTRAR.registerBlock("soapstone_cobble_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.4F, 0.2F)
    );
    public static  DeferredBlock<Block> SOAPSTONE_BRICK_BLOCK = REGISTRAR.registerBlock("soapstone_brick_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.4F, 0.2F)
    );
    public static DeferredBlock<Block> SOAPSTONE_COAL_ORE = REGISTRAR.registerBlock("soapstone_coal_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.4F, 0.2F)
    );
    public static DeferredBlock<Block> SOAPSTONE_COPPER_ORE = REGISTRAR.registerBlock("soapstone_copper_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.4F, 0.2F)
    );
    public static DeferredBlock<Block> SOAPSTONE_IRON_ORE = REGISTRAR.registerBlock("soapstone_iron_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.4F, 0.2F)
    );
    public static DeferredBlock<Block> SOAPSTONE_GOLD_ORE = REGISTRAR.registerBlock("soapstone_gold_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.4F, 0.2F)
    );
    public static DeferredBlock<Block> SOAPSTONE_REDSTONE_ORE = REGISTRAR.registerBlock("soapstone_redstone_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.4F, 0.2F)
    );
    public static DeferredBlock<Block> SOAPSTONE_LAPIS_ORE = REGISTRAR.registerBlock("soapstone_lapis_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.4F, 0.2F)
    );

    // Stairs
    public static final DeferredBlock<Block> SOAPSTONE_STAIRS = REGISTRAR.registerBlock("soapstone_stairs",
            () -> new UBCStairsBlocks(SOAPSTONE_BLOCK)
    );
    public static final DeferredBlock<Block> SOAPSTONE_BRICK_STAIRS = REGISTRAR.registerBlock("soapstone_brick_stairs",
            () -> new UBCStairsBlocks(SOAPSTONE_BRICK_BLOCK)
    );
    public static final DeferredBlock<Block> SOAPSTONE_COBBLE_STAIRS = REGISTRAR.registerBlock("soapstone_cobble_stairs",
            () -> new UBCStairsBlocks(SOAPSTONE_COBBLE_BLOCK)
    );

    // Slabs
    public static final DeferredBlock<Block> SOAPSTONE_BLOCK_SLAB = REGISTRAR.registerBlock("soapstone_block_slab",
            () -> new UBCSlabBlocks(SOAPSTONE_BLOCK)
    );
    public static final DeferredBlock<Block> SOAPSTONE_COBBLE_SLAB = REGISTRAR.registerBlock("soapstone_cobble_slab",
            () -> new UBCSlabBlocks(SOAPSTONE_COBBLE_BLOCK)
    );
    public static final DeferredBlock<Block> SOAPSTONE_BRICK_SLAB = REGISTRAR.registerBlock("soapstone_brick_slab",
            () -> new UBCSlabBlocks(SOAPSTONE_BRICK_BLOCK)
    );

    // Walls
    public static final DeferredBlock<Block> SOAPSTONE_BLOCK_WALL = REGISTRAR.registerBlock("soapstone_block_wall",
            () -> new UBCWallBlocks(SOAPSTONE_BLOCK)
    );
    public static final DeferredBlock<Block> SOAPSTONE_COBBLE_WALL = REGISTRAR.registerBlock("soapstone_cobble_wall",
            () -> new UBCWallBlocks(SOAPSTONE_COBBLE_BLOCK)
    );
    public static final DeferredBlock<Block> SOAPSTONE_BRICK_WALL = REGISTRAR.registerBlock("soapstone_brick_wall",
            () -> new UBCWallBlocks(SOAPSTONE_BRICK_BLOCK)
    );

    // Buttons
    public static final DeferredBlock<Block> SOAPSTONE_STONE_BUTTON = REGISTRAR.registerBlock("soapstone_stone_button",
            () -> new UBCButtonsBlocks(BlockSetType.IRON, MapColor.STONE)
    );
    public static void register(IEventBus eventBus) {
        REGISTRAR.register(eventBus);
    }
}
