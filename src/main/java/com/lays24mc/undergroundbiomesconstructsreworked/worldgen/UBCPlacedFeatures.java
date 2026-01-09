package com.lays24mc.undergroundbiomesconstructsreworked.worldgen;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class UBCPlacedFeatures {
    public static final ResourceKey<PlacedFeature> SOAPSTONE_BLOCK_PLACED_KEY = registerKey("soapstone_block_placed");
    public static final ResourceKey<PlacedFeature> SOAPSTONE_COAL_ORE_PLACED_KEY = registerKey("soapstone_ore_placed");

    public static final ResourceKey<PlacedFeature> RHYOLITE_BLOCK_PLACED_KEY = registerKey("rhyolite_block_placed");
    public static final ResourceKey<PlacedFeature> RED_GRANITE_BLOCK_PLACED_KEY = registerKey("red_granite_placed");
    public static final ResourceKey<PlacedFeature> QUARTZITE_BLOCK_PLACED_KEY = registerKey("quartzite_block_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        // For exampes look into "OrePlacements.java"

        //Soapstone
        register(context, SOAPSTONE_BLOCK_PLACED_KEY, configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_SOAPSTONE_BLOCK_KEY),
                UBCOrePlacements.commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128))));

        //Soapstone Coal Ore
        register(context, SOAPSTONE_COAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_SOAPSTONE_COAL_ORE_KEY),
                UBCOrePlacements.commonOrePlacement(30, HeightRangePlacement.uniform(VerticalAnchor.absolute(128), VerticalAnchor.top())));


        //Rhyolite
        register(context, RHYOLITE_BLOCK_PLACED_KEY, configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_RHYOLITE_BLOCK_KEY),
                UBCOrePlacements.commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128))));

        //Red Granite
        register(context, RED_GRANITE_BLOCK_PLACED_KEY, configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_RED_GRANITE_BLOCK_KEY),
                UBCOrePlacements.commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128))));

        //Quartzite
        register(context, QUARTZITE_BLOCK_PLACED_KEY, configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_QUARTZITE_BLOCK_KEY),
                UBCOrePlacements.commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128))));

    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(UndergroundBiomesConstructsReworked.MODID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
