package com.lays24mc.undergroundbiomesconstructsreworked.block.custom;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UBCBlocks extends Block {

    private static final Logger log = LogManager.getLogger(UBCBlocks.class);

    public UBCBlocks(String name, MapColor color, Float strength, Float explosionResistance) {
        super(
                BlockBehaviour.Properties
                        .of()
                        .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(UndergroundBiomesConstructsReworked.MODID, name)))
                        .strength(strength)
                        .explosionResistance(explosionResistance)
                        .requiresCorrectToolForDrops()
                        .mapColor(color));
    }
}
