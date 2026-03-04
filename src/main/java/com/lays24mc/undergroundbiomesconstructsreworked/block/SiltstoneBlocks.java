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
    // Register Siltstone
    // ================================

    // Blocks
    public static final DeferredBlock<Block> SILTSTONE_BLOCK = registerBlock("siltstone_block",
            () -> new UBCBlocks("siltstone_block", MapColor.TERRACOTTA_BROWN, 0.6F, 0.4F)
    );
    public static DeferredBlock<Block> SILTSTONE_COAL_ORE = registerBlock("siltstone_coal_ore",
            () -> new UBCBlocks("siltstone_coal_ore", MapColor.TERRACOTTA_BROWN, 0.6F, 0.4F)
    );
    public static DeferredBlock<Block> SILTSTONE_COPPER_ORE = registerBlock("siltstone_copper_ore",
            () -> new UBCBlocks("siltstone_copper_ore", MapColor.TERRACOTTA_BROWN, 0.6F, 0.4F)
    );
    public static DeferredBlock<Block> SILTSTONE_IRON_ORE = registerBlock("siltstone_iron_ore",
            () -> new UBCBlocks("siltstone_iron_ore", MapColor.TERRACOTTA_BROWN, 0.6F, 0.4F)
    );
    public static DeferredBlock<Block> SILTSTONE_GOLD_ORE = registerBlock("siltstone_gold_ore",
            () -> new UBCBlocks("siltstone_gold_ore", MapColor.TERRACOTTA_BROWN, 0.6F, 0.4F)
    );
    public static DeferredBlock<Block> SILTSTONE_REDSTONE_ORE = registerBlock("siltstone_redstone_ore",
            () -> new UBCBlocks("siltstone_redstone_ore", MapColor.TERRACOTTA_BROWN, 0.6F, 0.4F)
    );
    public static DeferredBlock<Block> SILTSTONE_LAPIS_ORE = registerBlock("siltstone_lapis_ore",
            () -> new UBCBlocks("siltstone_lapis_ore", MapColor.TERRACOTTA_BROWN, 0.6F, 0.4F)
    );

    // Stairs
    public static final DeferredBlock<Block> SILTSTONE_STAIRS = registerBlock("siltstone_stairs",
            () -> new UBCStairsBlocks("siltstone_stairs", SILTSTONE_BLOCK, MapColor.TERRACOTTA_BROWN)
    );

    // Slabs
    public static final DeferredBlock<Block> SILTSTONE_BLOCK_SLAB = registerBlock("siltstone_block_slab",
            () -> new UBCSlabBlocks("siltstone_block_slab", MapColor.TERRACOTTA_BROWN)
    );

    // Walls
    public static final DeferredBlock<Block> SILTSTONE_BLOCK_WALL = registerBlock("siltstone_block_wall",
            () -> new UBCWallBlocks("siltstone_block_wall", MapColor.TERRACOTTA_BROWN)
    );

    // Buttons

    public static final DeferredBlock<Block> SILTSTONE_STONE_BUTTON = registerBlock("siltstone_stone_button",
            () -> new UBCButtonsBlocks("siltstone_stone_button", BlockSetType.IRON, MapColor.STONE)
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
