package com.lays24mc.undergroundbiomesconstructsreworked.worldgen;

import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class UBCOrePlacements {
    public static List<PlacementModifier> orePlacement(PlacementModifier pCountModifier, PlacementModifier pHeightRange){
        return List.of(pCountModifier, InSquarePlacement.spread(),pHeightRange, BiomeFilter.biome());
    }
    public static List<PlacementModifier> commonOrePlacement(int pCount, PlacementModifier pHeightRange) {
        return orePlacement(CountPlacement.of(pCount), pHeightRange);
    }

    public static List<PlacementModifier> rareOrePlacement(int pChance, PlacementModifier pHeightRange) {
        return orePlacement(RarityFilter.onAverageOnceEvery(pChance), pHeightRange);
    }
}
