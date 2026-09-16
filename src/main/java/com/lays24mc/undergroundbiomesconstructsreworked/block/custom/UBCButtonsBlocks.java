package com.lays24mc.undergroundbiomesconstructsreworked.block.custom;

import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;

public class UBCButtonsBlocks extends ButtonBlock {

    public UBCButtonsBlocks(BlockSetType blockSetType, MapColor color) {
        super(
                blockSetType, // <- Stone etc
                20, // <- tick to stay pressed
                BlockBehaviour.Properties.of()
                        .strength(0.5f)
                        .explosionResistance(0.5f)
                        .requiresCorrectToolForDrops()
                        .noCollission()
                        .mapColor(color)
        );
    }
}
