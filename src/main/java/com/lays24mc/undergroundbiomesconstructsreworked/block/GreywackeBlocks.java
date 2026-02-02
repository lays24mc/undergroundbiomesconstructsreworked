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

public class GreywackeBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
            UndergroundBiomesConstructsReworked.MODID
    );

    // ================================
    // Register Greywacke
    // ================================

    // Blocks
    public static final DeferredBlock<Block> GREYWACKE_BLOCK = registerBlock("greywacke_block",
            () -> new UBCBlocks(MapColor.COLOR_GRAY, 1.0F, 1.0F)
    );
    public static DeferredBlock<Block> GREYWACKE_COAL_ORE = registerBlock("greywacke_coal_ore",
            () -> new UBCBlocks(MapColor.COLOR_GRAY, 1.0F, 1.0F)
    );
    public static DeferredBlock<Block> GREYWACKE_COPPER_ORE = registerBlock("greywacke_copper_ore",
            () -> new UBCBlocks(MapColor.COLOR_GRAY, 1.0F, 1.0F)
    );
    public static DeferredBlock<Block> GREYWACKE_IRON_ORE = registerBlock("greywacke_iron_ore",
            () -> new UBCBlocks(MapColor.COLOR_GRAY, 1.0F, 1.0F)
    );
    public static DeferredBlock<Block> GREYWACKE_GOLD_ORE = registerBlock("greywacke_gold_ore",
            () -> new UBCBlocks(MapColor.COLOR_GRAY, 1.0F, 1.0F)
    );
    public static DeferredBlock<Block> GREYWACKE_REDSTONE_ORE = registerBlock("greywacke_redstone_ore",
            () -> new UBCBlocks(MapColor.COLOR_GRAY, 1.0F, 1.0F)
    );
    public static DeferredBlock<Block> GREYWACKE_LAPIS_ORE = registerBlock("greywacke_lapis_ore",
            () -> new UBCBlocks(MapColor.COLOR_GRAY, 1.0F, 1.0F)
    );

    // Stairs
    public static final DeferredBlock<Block> GREYWACKE_STAIRS = registerBlock("greywacke_stairs",
            () -> new UBCStairsBlocks(GREYWACKE_BLOCK, MapColor.COLOR_GRAY)
    );

    // Slabs
    public static final DeferredBlock<Block> GREYWACKE_BLOCK_SLAB = registerBlock("greywacke_block_slab",
            () -> new UBCSlabBlocks(MapColor.COLOR_GRAY)
    );

    // Walls
    public static final DeferredBlock<Block> GREYWACKE_BLOCK_WALL = registerBlock("greywacke_block_wall",
            () -> new UBCWallBlocks(MapColor.COLOR_GRAY)
    );

    // Buttons

    public static final DeferredBlock<Block> GREYWACKE_STONE_BUTTON = registerBlock("greywacke_stone_button",
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
