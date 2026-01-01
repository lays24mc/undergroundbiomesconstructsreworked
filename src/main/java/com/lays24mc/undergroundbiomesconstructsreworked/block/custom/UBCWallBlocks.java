package com.lays24mc.undergroundbiomesconstructsreworked.block.custom;

import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UBCWallBlocks extends WallBlock {

    private static final Logger log = LogManager.getLogger(UBCWallBlocks.class);

    public UBCWallBlocks(MapColor color) {
        super(
                BlockBehaviour.Properties
                        .of()
                        .strength(2f)
                        .explosionResistance(6f)
                        .requiresCorrectToolForDrops()
                        .mapColor(color));
    }
}
