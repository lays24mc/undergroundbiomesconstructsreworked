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

public class ChertBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
            UndergroundBiomesConstructsReworked.MODID
    );

    // ================================
    // Register Chert
    // ================================

    // Blocks
    public static final DeferredBlock<Block> CHERT_BLOCK = registerBlock("chert_block",
            () -> new UBCBlocks(MapColor.COLOR_BROWN, 0.9F, 0.85F)
    );
    public static DeferredBlock<Block> CHERT_COAL_ORE = registerBlock("chert_coal_ore",
            () -> new UBCBlocks(MapColor.COLOR_BROWN, 0.9F, 0.85F)
    );
    public static DeferredBlock<Block> CHERT_COPPER_ORE = registerBlock("chert_copper_ore",
            () -> new UBCBlocks(MapColor.COLOR_BROWN, 0.9F, 0.85F)
    );
    public static DeferredBlock<Block> CHERT_IRON_ORE = registerBlock("chert_iron_ore",
            () -> new UBCBlocks(MapColor.COLOR_BROWN, 0.9F, 0.85F)
    );
    public static DeferredBlock<Block> CHERT_GOLD_ORE = registerBlock("chert_gold_ore",
            () -> new UBCBlocks(MapColor.COLOR_BROWN, 0.9F, 0.85F)
    );
    public static DeferredBlock<Block> CHERT_REDSTONE_ORE = registerBlock("chert_redstone_ore",
            () -> new UBCBlocks(MapColor.COLOR_BROWN, 0.9F, 0.85F)
    );
    public static DeferredBlock<Block> CHERT_LAPIS_ORE = registerBlock("chert_lapis_ore",
            () -> new UBCBlocks(MapColor.COLOR_BROWN, 0.9F, 0.85F)
    );

    // Stairs
    public static final DeferredBlock<Block> CHERT_STAIRS = registerBlock("chert_stairs",
            () -> new UBCStairsBlocks(CHERT_BLOCK, MapColor.COLOR_BROWN)
    );

    // Slabs
    public static final DeferredBlock<Block> CHERT_BLOCK_SLAB = registerBlock("chert_block_slab",
            () -> new UBCSlabBlocks(MapColor.COLOR_BROWN)
    );

    // Walls
    public static final DeferredBlock<Block> CHERT_BLOCK_WALL = registerBlock("chert_block_wall",
            () -> new UBCWallBlocks(MapColor.COLOR_BROWN)
    );

    // Buttons

    public static final DeferredBlock<Block> CHERT_STONE_BUTTON = registerBlock("chert_stone_button",
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
