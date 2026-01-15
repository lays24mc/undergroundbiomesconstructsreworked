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

public class SiltstoneBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
            UndergroundBiomesConstructsReworked.MODID
    );

    // ================================
    // Register siltstone
    // ================================

    // Blocks
    public static final DeferredBlock<Block> SILTSTONE_BLOCK = registerBlock("siltstone_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static DeferredBlock<Block> SILTSTONE_COAL_ORE = registerBlock("siltstone_coal_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static DeferredBlock<Block> SILTSTONE_COPPER_ORE = registerBlock("siltstone_copper_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static DeferredBlock<Block> SILTSTONE_IRON_ORE = registerBlock("siltstone_iron_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static DeferredBlock<Block> SILTSTONE_GOLD_ORE = registerBlock("siltstone_gold_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static DeferredBlock<Block> SILTSTONE_REDSTONE_ORE = registerBlock("siltstone_redstone_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE)
    );
    public static DeferredBlock<Block> SILTSTONE_LAPIS_ORE = registerBlock("siltstone_lapis_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE)
    );

    // Stairs
    public static final DeferredBlock<Block> SILTSTONE_STAIRS = registerBlock("siltstone_stairs",
            () -> new UBCStairsBlocks(SILTSTONE_BLOCK, MapColor.TERRACOTTA_WHITE)
    );

    // Slabs
    public static final DeferredBlock<Block> SILTSTONE_BLOCK_SLAB = registerBlock("siltstone_block_slab",
            () -> new UBCSlabBlocks(MapColor.TERRACOTTA_WHITE)
    );

    // Walls
    public static final DeferredBlock<Block> SILTSTONE_BLOCK_WALL = registerBlock("siltstone_block_wall",
            () -> new UBCWallBlocks(MapColor.TERRACOTTA_WHITE)
    );

    // Buttons

    public static final DeferredBlock<Block> SILTSTONE_STONE_BUTTON = registerBlock("siltstone_stone_button",
            () -> new UBCButtonsBlocks(BlockSetType.IRON, MapColor.STONE)
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
