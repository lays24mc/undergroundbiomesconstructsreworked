package com.lays24mc.undergroundbiomesconstructsreworked.block.custom;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public class UBCStairsBlocks extends StairBlock {

    public UBCStairsBlocks(Supplier<Block> baseBlock) {
        super(
                baseBlock.get().defaultBlockState(),
                BlockBehaviour.Properties.ofFullCopy(baseBlock.get()));
    }
}
