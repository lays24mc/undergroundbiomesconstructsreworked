package com.lays24mc.undergroundbiomesconstructsreworked.block;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.custom.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ShaleBlocks {

    private static final StoneBlockRegistrar REGISTRAR = new StoneBlockRegistrar(UndergroundBiomesConstructsReworked.MODID);

    // ================================
    // Register Shale
    // ================================

    // Blocks
    public static final DeferredBlock<Block> SHALE_BLOCK = REGISTRAR.registerBlock("shale_block",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 0.5F, 0.29F)
    );
    public static DeferredBlock<Block> SHALE_COAL_ORE = REGISTRAR.registerBlock("shale_coal_ore",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 0.5F, 0.29F)
    );
    public static DeferredBlock<Block> SHALE_COPPER_ORE = REGISTRAR.registerBlock("shale_copper_ore",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 0.5F, 0.29F)
    );
    public static DeferredBlock<Block> SHALE_IRON_ORE = REGISTRAR.registerBlock("shale_iron_ore",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 0.5F, 0.29F)
    );
    public static DeferredBlock<Block> SHALE_GOLD_ORE = REGISTRAR.registerBlock("shale_gold_ore",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 0.5F, 0.29F)
    );
    public static DeferredBlock<Block> SHALE_REDSTONE_ORE = REGISTRAR.registerBlock("shale_redstone_ore",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 0.5F, 0.29F)
    );
    public static DeferredBlock<Block> SHALE_LAPIS_ORE = REGISTRAR.registerBlock("shale_lapis_ore",
            () -> new UBCBlocks(MapColor.COLOR_LIGHT_GRAY, 0.5F, 0.29F)
    );

    // Stairs
    public static final DeferredBlock<Block> SHALE_STAIRS = REGISTRAR.registerBlock("shale_stairs",
            () -> new UBCStairsBlocks(SHALE_BLOCK)
    );

    // Slabs
    public static final DeferredBlock<Block> SHALE_BLOCK_SLAB = REGISTRAR.registerBlock("shale_block_slab",
            () -> new UBCSlabBlocks(SHALE_BLOCK)
    );

    // Walls
    public static final DeferredBlock<Block> SHALE_BLOCK_WALL = REGISTRAR.registerBlock("shale_block_wall",
            () -> new UBCWallBlocks(SHALE_BLOCK)
    );

    // Buttons

    public static final DeferredBlock<Block> SHALE_STONE_BUTTON = REGISTRAR.registerBlock("shale_stone_button",
            () -> new UBCButtonsBlocks(BlockSetType.IRON, MapColor.STONE)
    );
    public static void register(IEventBus eventBus) {
        REGISTRAR.register(eventBus);
    }
}
