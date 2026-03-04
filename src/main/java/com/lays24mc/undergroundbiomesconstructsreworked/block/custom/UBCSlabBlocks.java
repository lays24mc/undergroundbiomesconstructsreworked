package com.lays24mc.undergroundbiomesconstructsreworked.block.custom;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UBCSlabBlocks extends SlabBlock {
    private static final Logger log = LogManager.getLogger(UBCSlabBlocks.class);

    public UBCSlabBlocks(String name, MapColor color) {
        super(
                BlockBehaviour.Properties
                        .of()
                        .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(UndergroundBiomesConstructsReworked.MODID, name)))
                        .strength(2f)
                        .explosionResistance(6f)
                        .requiresCorrectToolForDrops()
                        .mapColor(color));
    }
}
