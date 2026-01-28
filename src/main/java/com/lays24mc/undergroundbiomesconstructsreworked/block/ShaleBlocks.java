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

public class ShaleBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
            UndergroundBiomesConstructsReworked.MODID
    );

    // ================================
    // Register shale
    // ================================

    // Blocks
    public static final DeferredBlock<Block> SHALE_BLOCK = registerBlock("shale_block",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.5F, 0.29F)
    );
    public static DeferredBlock<Block> SHALE_COAL_ORE = registerBlock("shale_coal_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.5F, 0.29F)
    );
    public static DeferredBlock<Block> SHALE_COPPER_ORE = registerBlock("shale_copper_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.5F, 0.29F)
    );
    public static DeferredBlock<Block> SHALE_IRON_ORE = registerBlock("shale_iron_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.5F, 0.29F)
    );
    public static DeferredBlock<Block> SHALE_GOLD_ORE = registerBlock("shale_gold_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.5F, 0.29F)
    );
    public static DeferredBlock<Block> SHALE_REDSTONE_ORE = registerBlock("shale_redstone_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.5F, 0.29F)
    );
    public static DeferredBlock<Block> SHALE_LAPIS_ORE = registerBlock("shale_lapis_ore",
            () -> new UBCBlocks(MapColor.TERRACOTTA_WHITE, 0.5F, 0.29F)
    );

    // Stairs
    public static final DeferredBlock<Block> SHALE_STAIRS = registerBlock("shale_stairs",
            () -> new UBCStairsBlocks(SHALE_BLOCK, MapColor.TERRACOTTA_WHITE)
    );

    // Slabs
    public static final DeferredBlock<Block> SHALE_BLOCK_SLAB = registerBlock("shale_block_slab",
            () -> new UBCSlabBlocks(MapColor.TERRACOTTA_WHITE)
    );

    // Walls
    public static final DeferredBlock<Block> SHALE_BLOCK_WALL = registerBlock("shale_block_wall",
            () -> new UBCWallBlocks(MapColor.TERRACOTTA_WHITE)
    );

    // Buttons

    public static final DeferredBlock<Block> SHALE_STONE_BUTTON = registerBlock("shale_stone_button",
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
