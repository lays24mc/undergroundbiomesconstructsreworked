package com.lays24mc.undergroundbiomesconstructsreworked.block;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.custom.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;

public class EclogiteBlocks {

    private static final StoneBlockRegistrar REGISTRAR = new StoneBlockRegistrar(UndergroundBiomesConstructsReworked.MODID);

    // ================================
    // Register Eclogite
    // ================================

    // Blocks
    public static final DeferredBlock<Block> ECLOGITE_BLOCK = REGISTRAR.registerBlock("eclogite_block",
            () -> new UBCBlocks(MapColor.COLOR_BROWN, 1.0F, 1.0F)
    );
    public static DeferredBlock<Block> ECLOGITE_COAL_ORE = REGISTRAR.registerBlock("eclogite_coal_ore",
            () -> new UBCBlocks(MapColor.COLOR_BROWN, 1.0F, 1.0F)
    );
    public static DeferredBlock<Block> ECLOGITE_COPPER_ORE = REGISTRAR.registerBlock("eclogite_copper_ore",
            () -> new UBCBlocks(MapColor.COLOR_BROWN, 1.0F, 1.0F)
    );
    public static DeferredBlock<Block> ECLOGITE_IRON_ORE = REGISTRAR.registerBlock("eclogite_iron_ore",
            () -> new UBCBlocks(MapColor.COLOR_BROWN, 1.0F, 1.0F)
    );
    public static DeferredBlock<Block> ECLOGITE_GOLD_ORE = REGISTRAR.registerBlock("eclogite_gold_ore",
            () -> new UBCBlocks(MapColor.COLOR_BROWN, 1.0F, 1.0F)
    );
    public static DeferredBlock<Block> ECLOGITE_REDSTONE_ORE = REGISTRAR.registerBlock("eclogite_redstone_ore",
            () -> new UBCBlocks(MapColor.COLOR_BROWN, 1.0F, 1.0F)
    );
    public static DeferredBlock<Block> ECLOGITE_LAPIS_ORE = REGISTRAR.registerBlock("eclogite_lapis_ore",
            () -> new UBCBlocks(MapColor.COLOR_BROWN, 1.0F, 1.0F)
    );

    // Stairs
    public static final DeferredBlock<Block> ECLOGITE_STAIRS = REGISTRAR.registerBlock("eclogite_stairs",
            () -> new UBCStairsBlocks(ECLOGITE_BLOCK)
    );

    // Slabs
    public static final DeferredBlock<Block> ECLOGITE_BLOCK_SLAB = REGISTRAR.registerBlock("eclogite_block_slab",
            () -> new UBCSlabBlocks(ECLOGITE_BLOCK)
    );

    // Walls
    public static final DeferredBlock<Block> ECLOGITE_BLOCK_WALL = REGISTRAR.registerBlock("eclogite_block_wall",
            () -> new UBCWallBlocks(ECLOGITE_BLOCK)
    );

    // Buttons

    public static final DeferredBlock<Block> ECLOGITE_STONE_BUTTON = REGISTRAR.registerBlock("eclogite_stone_button",
            () -> new UBCButtonsBlocks(BlockSetType.IRON, MapColor.STONE)
    );
    public static void register(IEventBus eventBus) {
        REGISTRAR.register(eventBus);
    }
}
