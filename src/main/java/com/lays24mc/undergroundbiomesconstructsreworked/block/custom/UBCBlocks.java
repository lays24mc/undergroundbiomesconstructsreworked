package com.lays24mc.undergroundbiomesconstructsreworked.block.custom;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UBCBlocks extends Block {

    private static final Logger log = LogManager.getLogger(UBCBlocks.class);

    public UBCBlocks(MapColor color) {
        super(
                BlockBehaviour.Properties
                        .of()
                        .strength(2f)
                        .explosionResistance(6f)
                        .requiresCorrectToolForDrops()
                        .mapColor(color));
    }
}
