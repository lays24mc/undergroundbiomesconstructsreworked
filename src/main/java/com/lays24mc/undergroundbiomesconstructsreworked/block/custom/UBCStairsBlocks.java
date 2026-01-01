package com.lays24mc.undergroundbiomesconstructsreworked.block.custom;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Supplier;

public class UBCStairsBlocks extends StairBlock {

    private static final Logger log = LogManager.getLogger(UBCStairsBlocks.class);

    public UBCStairsBlocks(Supplier<Block> baseBlock, MapColor color) {
        super(
                baseBlock.get().defaultBlockState(),
                BlockBehaviour.Properties
                        .of()
                        .strength(2f)
                        .explosionResistance(6f)
                        .requiresCorrectToolForDrops()
                        .mapColor(color));
    }
}
