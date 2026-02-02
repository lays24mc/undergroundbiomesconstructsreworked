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

public class EclogiteBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(
            UndergroundBiomesConstructsReworked.MODID
    );

    // ================================
    // Register Eclogite
    // ================================

    // Blocks
    public static final DeferredBlock<Block> ECLOGITE_BLOCK = registerBlock("eclogite_block",
            () -> new UBCBlocks(MapColor.COLOR_BROWN, 1.0F, 1.0F)
    );
    public static DeferredBlock<Block> ECLOGITE_COAL_ORE = registerBlock("eclogite_coal_ore",
            () -> new UBCBlocks(MapColor.COLOR_BROWN, 1.0F, 1.0F)
    );
    public static DeferredBlock<Block> ECLOGITE_COPPER_ORE = registerBlock("eclogite_copper_ore",
            () -> new UBCBlocks(MapColor.COLOR_BROWN, 1.0F, 1.0F)
    );
    public static DeferredBlock<Block> ECLOGITE_IRON_ORE = registerBlock("eclogite_iron_ore",
            () -> new UBCBlocks(MapColor.COLOR_BROWN, 1.0F, 1.0F)
    );
    public static DeferredBlock<Block> ECLOGITE_GOLD_ORE = registerBlock("eclogite_gold_ore",
            () -> new UBCBlocks(MapColor.COLOR_BROWN, 1.0F, 1.0F)
    );
    public static DeferredBlock<Block> ECLOGITE_REDSTONE_ORE = registerBlock("eclogite_redstone_ore",
            () -> new UBCBlocks(MapColor.COLOR_BROWN, 1.0F, 1.0F)
    );
    public static DeferredBlock<Block> ECLOGITE_LAPIS_ORE = registerBlock("eclogite_lapis_ore",
            () -> new UBCBlocks(MapColor.COLOR_BROWN, 1.0F, 1.0F)
    );

    // Stairs
    public static final DeferredBlock<Block> ECLOGITE_STAIRS = registerBlock("eclogite_stairs",
            () -> new UBCStairsBlocks(ECLOGITE_BLOCK, MapColor.COLOR_BROWN)
    );

    // Slabs
    public static final DeferredBlock<Block> ECLOGITE_BLOCK_SLAB = registerBlock("eclogite_block_slab",
            () -> new UBCSlabBlocks(MapColor.COLOR_BROWN)
    );

    // Walls
    public static final DeferredBlock<Block> ECLOGITE_BLOCK_WALL = registerBlock("eclogite_block_wall",
            () -> new UBCWallBlocks(MapColor.COLOR_BROWN)
    );

    // Buttons

    public static final DeferredBlock<Block> ECLOGITE_STONE_BUTTON = registerBlock("eclogite_stone_button",
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
