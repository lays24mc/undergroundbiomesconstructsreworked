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

public class LimestoneBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
            UndergroundBiomesConstructsReworked.MODID
    );

    // ================================
    // Register limestone
    // ================================

    // Blocks
    public static final DeferredBlock<Block> LIMESTONE_BLOCK = registerBlock("limestone_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE,0.5F, 0.29F)
    );
    public static DeferredBlock<Block> LIMESTONE_COAL_ORE = registerBlock("limestone_coal_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE,0.5F, 0.29F)
    );
    public static DeferredBlock<Block> LIMESTONE_COPPER_ORE = registerBlock("limestone_copper_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE,0.5F, 0.29F)
    );
    public static DeferredBlock<Block> LIMESTONE_IRON_ORE = registerBlock("limestone_iron_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE,0.5F, 0.29F)
    );
    public static DeferredBlock<Block> LIMESTONE_GOLD_ORE = registerBlock("limestone_gold_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE,0.5F, 0.29F)
    );
    public static DeferredBlock<Block> LIMESTONE_REDSTONE_ORE = registerBlock("limestone_redstone_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE,0.5F, 0.29F)
    );
    public static DeferredBlock<Block> LIMESTONE_LAPIS_ORE = registerBlock("limestone_lapis_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE,0.5F, 0.29F)
    );

    // Stairs
    public static final DeferredBlock<Block> LIMESTONE_STAIRS = registerBlock("limestone_stairs",
            () -> new UBCStairsBlocks(LIMESTONE_BLOCK, MapColor.TERRACOTTA_WHITE)
    );

    // Slabs
    public static final DeferredBlock<Block> LIMESTONE_BLOCK_SLAB = registerBlock("limestone_block_slab",
            () -> new UBCSlabBlocks(MapColor.TERRACOTTA_WHITE)
    );

    // Walls
    public static final DeferredBlock<Block> LIMESTONE_BLOCK_WALL = registerBlock("limestone_block_wall",
            () -> new UBCWallBlocks(MapColor.TERRACOTTA_WHITE)
    );

    // Buttons

    public static final DeferredBlock<Block> LIMESTONE_STONE_BUTTON = registerBlock("limestone_stone_button",
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
