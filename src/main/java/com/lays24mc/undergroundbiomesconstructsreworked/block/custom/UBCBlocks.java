package com.lays24mc.undergroundbiomesconstructsreworked.block.custom;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class UBCBlocks extends Block {

    public UBCBlocks(MapColor color, Float strength, Float explosionResistance) {
        super(
                BlockBehaviour.Properties
                        .of()
                        .strength(strength)
                        .explosionResistance(explosionResistance)
                        .requiresCorrectToolForDrops()
                        .mapColor(color));
    }
}
