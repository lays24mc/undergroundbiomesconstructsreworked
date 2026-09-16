package com.lays24mc.undergroundbiomesconstructsreworked.block;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.custom.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;

public class GreywackeBlocks {

    private static final StoneBlockRegistrar REGISTRAR = new StoneBlockRegistrar(UndergroundBiomesConstructsReworked.MODID);

    // ================================
    // Register Greywacke
    // ================================

    // Blocks
    public static final DeferredBlock<Block> GREYWACKE_BLOCK = REGISTRAR.registerBlock("greywacke_block",
            () -> new UBCBlocks(MapColor.COLOR_GRAY, 1.0F, 1.0F)
    );
    public static DeferredBlock<Block> GREYWACKE_COAL_ORE = REGISTRAR.registerBlock("greywacke_coal_ore",
            () -> new UBCBlocks(MapColor.COLOR_GRAY, 1.0F, 1.0F)
    );
    public static DeferredBlock<Block> GREYWACKE_COPPER_ORE = REGISTRAR.registerBlock("greywacke_copper_ore",
            () -> new UBCBlocks(MapColor.COLOR_GRAY, 1.0F, 1.0F)
    );
    public static DeferredBlock<Block> GREYWACKE_IRON_ORE = REGISTRAR.registerBlock("greywacke_iron_ore",
            () -> new UBCBlocks(MapColor.COLOR_GRAY, 1.0F, 1.0F)
    );
    public static DeferredBlock<Block> GREYWACKE_GOLD_ORE = REGISTRAR.registerBlock("greywacke_gold_ore",
            () -> new UBCBlocks(MapColor.COLOR_GRAY, 1.0F, 1.0F)
    );
    public static DeferredBlock<Block> GREYWACKE_REDSTONE_ORE = REGISTRAR.registerBlock("greywacke_redstone_ore",
            () -> new UBCBlocks(MapColor.COLOR_GRAY, 1.0F, 1.0F)
    );
    public static DeferredBlock<Block> GREYWACKE_LAPIS_ORE = REGISTRAR.registerBlock("greywacke_lapis_ore",
            () -> new UBCBlocks(MapColor.COLOR_GRAY, 1.0F, 1.0F)
    );

    // Stairs
    public static final DeferredBlock<Block> GREYWACKE_STAIRS = REGISTRAR.registerBlock("greywacke_stairs",
            () -> new UBCStairsBlocks(GREYWACKE_BLOCK)
    );

    // Slabs
    public static final DeferredBlock<Block> GREYWACKE_BLOCK_SLAB = REGISTRAR.registerBlock("greywacke_block_slab",
            () -> new UBCSlabBlocks(GREYWACKE_BLOCK)
    );

    // Walls
    public static final DeferredBlock<Block> GREYWACKE_BLOCK_WALL = REGISTRAR.registerBlock("greywacke_block_wall",
            () -> new UBCWallBlocks(GREYWACKE_BLOCK)
    );

    // Buttons

    public static final DeferredBlock<Block> GREYWACKE_STONE_BUTTON = REGISTRAR.registerBlock("greywacke_stone_button",
            () -> new UBCButtonsBlocks(BlockSetType.IRON, MapColor.STONE)
    );
    public static void register(IEventBus eventBus) {
        REGISTRAR.register(eventBus);
    }
}
