package com.lays24mc.undergroundbiomesconstructsreworked.block.custom;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public class UBCWallBlocks extends WallBlock {

    public UBCWallBlocks(Supplier<Block> baseBlock) {
        super(BlockBehaviour.Properties.ofFullCopy(baseBlock.get()));
    }
}
