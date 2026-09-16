package com.lays24mc.undergroundbiomesconstructsreworked.block;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.custom.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;

public class SiltstoneBlocks {

    private static final StoneBlockRegistrar REGISTRAR = new StoneBlockRegistrar(UndergroundBiomesConstructsReworked.MODID);

    // ================================
    // Register Siltstone
    // ================================

    // Blocks
    public static final DeferredBlock<Block> SILTSTONE_BLOCK = REGISTRAR.registerBlock("siltstone_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_BROWN, 0.6F, 0.4F)
    );
    public static DeferredBlock<Block> SILTSTONE_COAL_ORE = REGISTRAR.registerBlock("siltstone_coal_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_BROWN, 0.6F, 0.4F)
    );
    public static DeferredBlock<Block> SILTSTONE_COPPER_ORE = REGISTRAR.registerBlock("siltstone_copper_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_BROWN, 0.6F, 0.4F)
    );
    public static DeferredBlock<Block> SILTSTONE_IRON_ORE = REGISTRAR.registerBlock("siltstone_iron_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_BROWN, 0.6F, 0.4F)
    );
    public static DeferredBlock<Block> SILTSTONE_GOLD_ORE = REGISTRAR.registerBlock("siltstone_gold_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_BROWN, 0.6F, 0.4F)
    );
    public static DeferredBlock<Block> SILTSTONE_REDSTONE_ORE = REGISTRAR.registerBlock("siltstone_redstone_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_BROWN, 0.6F, 0.4F)
    );
    public static DeferredBlock<Block> SILTSTONE_LAPIS_ORE = REGISTRAR.registerBlock("siltstone_lapis_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_BROWN, 0.6F, 0.4F)
    );

    // Stairs
    public static final DeferredBlock<Block> SILTSTONE_STAIRS = REGISTRAR.registerBlock("siltstone_stairs",
            () -> new UBCStairsBlocks(SILTSTONE_BLOCK)
    );

    // Slabs
    public static final DeferredBlock<Block> SILTSTONE_BLOCK_SLAB = REGISTRAR.registerBlock("siltstone_block_slab",
            () -> new UBCSlabBlocks(SILTSTONE_BLOCK)
    );

    // Walls
    public static final DeferredBlock<Block> SILTSTONE_BLOCK_WALL = REGISTRAR.registerBlock("siltstone_block_wall",
            () -> new UBCWallBlocks(SILTSTONE_BLOCK)
    );

    // Buttons

    public static final DeferredBlock<Block> SILTSTONE_STONE_BUTTON = REGISTRAR.registerBlock("siltstone_stone_button",
            () -> new UBCButtonsBlocks(BlockSetType.IRON, MapColor.STONE)
    );
    public static void register(IEventBus eventBus) {
        REGISTRAR.register(eventBus);
    }
}
