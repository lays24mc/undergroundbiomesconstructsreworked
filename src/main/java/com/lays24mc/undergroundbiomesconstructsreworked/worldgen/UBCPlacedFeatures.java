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

    // Soapstone
    public static final ResourceKey<PlacedFeature> SOAPSTONE_BLOCK_PLACED_KEY = registerKey("soapstone_block_placed");
    public static final ResourceKey<PlacedFeature> SOAPSTONE_COAL_ORE_PLACED_KEY = registerKey("soapstone_coal_ore_placed");
    public static final ResourceKey<PlacedFeature> SOAPSTONE_COPPER_ORE_SMALL_PLACED_KEY = registerKey("soapstone_copper_ore_small_placed");
    public static final ResourceKey<PlacedFeature> SOAPSTONE_COPPER_ORE_LARGE_PLACED_KEY = registerKey("soapstone_copper_ore_large_placed");
    public static final ResourceKey<PlacedFeature> SOAPSTONE_IRON_ORE_UPPER_PLACED_KEY = registerKey("soapstone_iron_upper_placed");
    public static final ResourceKey<PlacedFeature> SOAPSTONE_IRON_ORE_MIDDLE_PLACED_KEY = registerKey("soapstone_iron_middle_placed");
    public static final ResourceKey<PlacedFeature> SOAPSTONE_IRON_ORE_SMALL_PLACED_KEY = registerKey("soapstone_iron_small_placed");

    public static final ResourceKey<PlacedFeature> RHYOLITE_BLOCK_PLACED_KEY = registerKey("rhyolite_block_placed");
    public static final ResourceKey<PlacedFeature> RED_GRANITE_BLOCK_PLACED_KEY = registerKey("red_granite_placed");
    public static final ResourceKey<PlacedFeature> QUARTZITE_BLOCK_PLACED_KEY = registerKey("quartzite_block_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        // For exampes look into "OrePlacements.java"

        //Soapstone
        register(context, SOAPSTONE_BLOCK_PLACED_KEY, configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_SOAPSTONE_BLOCK_KEY),
                UBCOrePlacements.commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(192))));

        //Soapstone Coal Ore
        register(context, SOAPSTONE_COAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_SOAPSTONE_COAL_ORE_KEY),
                UBCOrePlacements.commonOrePlacement(30, HeightRangePlacement.uniform(VerticalAnchor.absolute(128), VerticalAnchor.top())));

//        //Soapstone Copper Ore
        register(context, SOAPSTONE_COPPER_ORE_SMALL_PLACED_KEY, configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_SOAPSTONE_COPPER_ORE_SMALL_KEY),
                UBCOrePlacements.commonOrePlacement(16, HeightRangePlacement.triangle(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(112))));
        register(context, SOAPSTONE_COPPER_ORE_LARGE_PLACED_KEY, configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_SOAPSTONE_COPPER_ORE_LARGE_KEY),
                UBCOrePlacements.commonOrePlacement(16, HeightRangePlacement.triangle(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(112))));

//        //Soapstone Iron Ore
        register(context, SOAPSTONE_IRON_ORE_UPPER_PLACED_KEY, configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_SOAPSTONE_IRON_ORE_KEY),
                UBCOrePlacements.commonOrePlacement(90, HeightRangePlacement.triangle(VerticalAnchor.absolute(80), VerticalAnchor.absolute(384))));
        register(context, SOAPSTONE_IRON_ORE_MIDDLE_PLACED_KEY, configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_SOAPSTONE_IRON_ORE_KEY),
                UBCOrePlacements.commonOrePlacement(10, HeightRangePlacement.triangle(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(56))));
        register(context, SOAPSTONE_IRON_ORE_SMALL_PLACED_KEY, configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_SOAPSTONE_IRON_ORE_SMALL_KEY),
                UBCOrePlacements.commonOrePlacement(10, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(72))));


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
