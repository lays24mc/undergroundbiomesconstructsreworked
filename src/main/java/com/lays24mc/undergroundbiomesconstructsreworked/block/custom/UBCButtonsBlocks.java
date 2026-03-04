package com.lays24mc.undergroundbiomesconstructsreworked.block.custom;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UBCButtonsBlocks extends ButtonBlock{
    private static final Logger log = LogManager.getLogger(UBCButtonsBlocks.class);

    public UBCButtonsBlocks(String name, BlockSetType blockSetType, MapColor color) {
        super(
                blockSetType, // <- Stone etc
                20, // <- tick to stay pressed
                BlockBehaviour.Properties
                        .of()
                        .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(UndergroundBiomesConstructsReworked.MODID, name)))
                        .strength(0.5f)
                        .explosionResistance(0.5f)
                        .requiresCorrectToolForDrops()
                        //.noCollission()
                        .mapColor(color)
        );
    }
}
