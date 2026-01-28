package com.lays24mc.undergroundbiomesconstructsreworked.worldgen;

// Mod main class (used for MODID)
import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;

// Minecraft / Worldgen imports
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

import static com.lays24mc.undergroundbiomesconstructsreworked.worldgen.UBCOrePlacements.commonOrePlacement;
import static com.lays24mc.undergroundbiomesconstructsreworked.worldgen.UBCOrePlacements.rareOrePlacement;

/**
 * Registers all PlacedFeatures for Underground Biomes Constructs Reworked.
 **/
public class UBCPlacedFeatures {

    /* ------------------------------------------------------------
     * PlacedFeature ResourceKeys
     * ------------------------------------------------------------ */

    public static final ResourceKey<PlacedFeature> SOAPSTONE_BLOCK_PLACED_KEY = registerKey("soapstone_block_placed");
    public static final ResourceKey<PlacedFeature> SOAPSTONE_COAL_ORE_PLACED_KEY = registerKey("soapstone_coal_ore_placed");
    public static final ResourceKey<PlacedFeature> SOAPSTONE_COPPER_ORE_SMALL_PLACED_KEY = registerKey("soapstone_copper_ore_small_placed");
    public static final ResourceKey<PlacedFeature> SOAPSTONE_COPPER_ORE_LARGE_PLACED_KEY = registerKey("soapstone_copper_ore_large_placed");
    public static final ResourceKey<PlacedFeature> SOAPSTONE_IRON_ORE_UPPER_PLACED_KEY = registerKey("soapstone_iron_upper_placed");
    public static final ResourceKey<PlacedFeature> SOAPSTONE_IRON_ORE_MIDDLE_PLACED_KEY = registerKey("soapstone_iron_middle_placed");
    public static final ResourceKey<PlacedFeature> SOAPSTONE_IRON_ORE_SMALL_PLACED_KEY = registerKey("soapstone_iron_small_placed");
    public static final ResourceKey<PlacedFeature> SOAPSTONE_GOLD_ORE_PLACED_KEY = registerKey("soapstone_gold_ore_placed");
    public static final ResourceKey<PlacedFeature> SOAPSTONE_GOLD_ORE_EXTRA_PLACED_KEY = registerKey("soapstone_gold_ore_extra_placed");
    public static final ResourceKey<PlacedFeature> SOAPSTONE_REDSTONE_ORE_PLACED_KEY = registerKey("soapstone_redstone_ore_placed");
    public static final ResourceKey<PlacedFeature> SOAPSTONE_REDSTONE_ORE_LOWER_PLACED_KEY = registerKey("soapstone_redstone_ore_lower_placed");
    public static final ResourceKey<PlacedFeature> SOAPSTONE_LAPIS_ORE_PLACED_KEY = registerKey("soapstone_lapis_ore_placed");

    public static final ResourceKey<PlacedFeature> RHYOLITE_BLOCK_PLACED_KEY = registerKey("rhyolite_block_placed");
    public static final ResourceKey<PlacedFeature> RHYOLITE_COAL_ORE_PLACED_KEY = registerKey("rhyolite_coal_ore_placed");
    public static final ResourceKey<PlacedFeature> RHYOLITE_COPPER_ORE_SMALL_PLACED_KEY = registerKey("rhyolite_copper_ore_small_placed");
    public static final ResourceKey<PlacedFeature> RHYOLITE_COPPER_ORE_LARGE_PLACED_KEY = registerKey("rhyolite_copper_ore_large_placed");
    public static final ResourceKey<PlacedFeature> RHYOLITE_IRON_ORE_UPPER_PLACED_KEY = registerKey("rhyolite_iron_upper_placed");
    public static final ResourceKey<PlacedFeature> RHYOLITE_IRON_ORE_MIDDLE_PLACED_KEY = registerKey("rhyolite_iron_middle_placed");
    public static final ResourceKey<PlacedFeature> RHYOLITE_IRON_ORE_SMALL_PLACED_KEY = registerKey("rhyolite_iron_small_placed");
    public static final ResourceKey<PlacedFeature> RHYOLITE_GOLD_ORE_PLACED_KEY = registerKey("rhyolite_gold_ore_placed");
    public static final ResourceKey<PlacedFeature> RHYOLITE_GOLD_ORE_EXTRA_PLACED_KEY = registerKey("rhyolite_gold_ore_extra_placed");
    public static final ResourceKey<PlacedFeature> RHYOLITE_REDSTONE_ORE_PLACED_KEY = registerKey("rhyolite_redstone_ore_placed");
    public static final ResourceKey<PlacedFeature> RHYOLITE_REDSTONE_ORE_LOWER_PLACED_KEY = registerKey("rhyolite_redstone_ore_lower_placed");
    public static final ResourceKey<PlacedFeature> RHYOLITE_LAPIS_ORE_PLACED_KEY = registerKey("rhyolite_lapis_ore_placed");

    public static final ResourceKey<PlacedFeature> RED_GRANITE_BLOCK_PLACED_KEY = registerKey("red_granite_placed");
    public static final ResourceKey<PlacedFeature> RED_GRANITE_IRON_ORE_MIDDLE_PLACED_KEY = registerKey("red_granite_iron_middle_placed");
    public static final ResourceKey<PlacedFeature> RED_GRANITE_IRON_ORE_SMALL_PLACED_KEY = registerKey("red_granite_iron_small_placed");
    public static final ResourceKey<PlacedFeature> RED_GRANITE_GOLD_ORE_PLACED_KEY = registerKey("red_granite_gold_ore_placed");
    public static final ResourceKey<PlacedFeature> RED_GRANITE_GOLD_ORE_LOWER_PLACED_KEY = registerKey("red_granite_gold_ore_lower_placed");
    public static final ResourceKey<PlacedFeature> RED_GRANITE_REDSTONE_ORE_PLACED_KEY = registerKey("red_granite_redstone_ore_placed");
    public static final ResourceKey<PlacedFeature> RED_GRANITE_REDSTONE_ORE_LOWER_PLACED_KEY = registerKey("red_granite_redstone_ore_lower_placed");
    public static final ResourceKey<PlacedFeature> RED_GRANITE_LAPIS_ORE_PLACED_KEY = registerKey("red_granite_lapis_ore_placed");
    public static final ResourceKey<PlacedFeature> RED_GRANITE_LAPIS_ORE_BURIED_PLACED_KEY = registerKey("red_granite_lapis_ore_buried_placed");
    public static final ResourceKey<PlacedFeature> RED_GRANITE_DIAMOND_ORE_SMALL_PLACED_KEY = registerKey("red_granite_diamond_ore_small_placed");
    public static final ResourceKey<PlacedFeature> RED_GRANITE_DIAMOND_ORE_LARGE_PLACED_KEY = registerKey("red_granite_diamond_ore_large_placed");
    public static final ResourceKey<PlacedFeature> RED_GRANITE_DIAMOND_ORE_BURIED_PLACED_KEY = registerKey("red_granite_diamond_ore_buried_placed");
    public static final ResourceKey<PlacedFeature> RED_GRANITE_DIAMOND_ORE_MEDIUM_PLACED_KEY = registerKey("red_granite_diamond_ore_medium_placed");
    public static final ResourceKey<PlacedFeature> RED_GRANITE_EMERALD_ORE_PLACED_KEY = registerKey("red_granite_ermerald_ore_placed");

    public static final ResourceKey<PlacedFeature> QUARTZITE_BLOCK_PLACED_KEY = registerKey("quartzite_block_placed");
    public static final ResourceKey<PlacedFeature> QUARTZITE_IRON_ORE_MIDDLE_PLACED_KEY = registerKey("quartzite_iron_middle_placed");
    public static final ResourceKey<PlacedFeature> QUARTZITE_IRON_ORE_SMALL_PLACED_KEY = registerKey("quartzite_iron_small_placed");
    public static final ResourceKey<PlacedFeature> QUARTZITE_GOLD_ORE_PLACED_KEY = registerKey("quartzite_gold_ore_placed");
    public static final ResourceKey<PlacedFeature> QUARTZITE_GOLD_ORE_LOWER_PLACED_KEY = registerKey("quartzite_gold_ore_lower_placed");
    public static final ResourceKey<PlacedFeature> QUARTZITE_REDSTONE_ORE_PLACED_KEY = registerKey("quartzite_redstone_ore_placed");
    public static final ResourceKey<PlacedFeature> QUARTZITE_REDSTONE_ORE_LOWER_PLACED_KEY = registerKey("quartzite_redstone_ore_lower_placed");
    public static final ResourceKey<PlacedFeature> QUARTZITE_LAPIS_ORE_PLACED_KEY = registerKey("quartzite_lapis_ore_placed");
    public static final ResourceKey<PlacedFeature> QUARTZITE_LAPIS_ORE_BURIED_PLACED_KEY = registerKey("quartzite_lapis_ore_buried_placed");
    public static final ResourceKey<PlacedFeature> QUARTZITE_DIAMOND_ORE_SMALL_PLACED_KEY = registerKey("quartzite_diamond_ore_small_placed");
    public static final ResourceKey<PlacedFeature> QUARTZITE_DIAMOND_ORE_LARGE_PLACED_KEY = registerKey("quartzite_diamond_ore_large_placed");
    public static final ResourceKey<PlacedFeature> QUARTZITE_DIAMOND_ORE_BURIED_PLACED_KEY = registerKey("quartzite_diamond_ore_buried_placed");
    public static final ResourceKey<PlacedFeature> QUARTZITE_DIAMOND_ORE_MEDIUM_PLACED_KEY = registerKey("quartzite_diamond_ore_medium_placed");
    public static final ResourceKey<PlacedFeature> QUARTZITE_EMERALD_ORE_PLACED_KEY = registerKey("quartzite_ermerald_ore_placed");

    public static final ResourceKey<PlacedFeature> MIGMATITE_BLOCK_PLACED_KEY = registerKey("migmatite_block_placed");
    public static final ResourceKey<PlacedFeature> MIGMATITE_IRON_ORE_MIDDLE_PLACED_KEY = registerKey("migmatite_iron_middle_placed");
    public static final ResourceKey<PlacedFeature> MIGMATITE_IRON_ORE_SMALL_PLACED_KEY = registerKey("migmatite_iron_small_placed");
    public static final ResourceKey<PlacedFeature> MIGMATITE_GOLD_ORE_PLACED_KEY = registerKey("migmatite_gold_ore_placed");
    public static final ResourceKey<PlacedFeature> MIGMATITE_GOLD_ORE_LOWER_PLACED_KEY = registerKey("migmatite_gold_ore_lower_placed");
    public static final ResourceKey<PlacedFeature> MIGMATITE_REDSTONE_ORE_PLACED_KEY = registerKey("migmatite_redstone_ore_placed");
    public static final ResourceKey<PlacedFeature> MIGMATITE_REDSTONE_ORE_LOWER_PLACED_KEY = registerKey("migmatite_redstone_ore_lower_placed");
    public static final ResourceKey<PlacedFeature> MIGMATITE_LAPIS_ORE_PLACED_KEY = registerKey("migmatite_lapis_ore_placed");
    public static final ResourceKey<PlacedFeature> MIGMATITE_LAPIS_ORE_BURIED_PLACED_KEY = registerKey("migmatite_lapis_ore_buried_placed");
    public static final ResourceKey<PlacedFeature> MIGMATITE_DIAMOND_ORE_SMALL_PLACED_KEY = registerKey("migmatite_diamond_ore_small_placed");
    public static final ResourceKey<PlacedFeature> MIGMATITE_DIAMOND_ORE_LARGE_PLACED_KEY = registerKey("migmatite_diamond_ore_large_placed");
    public static final ResourceKey<PlacedFeature> MIGMATITE_DIAMOND_ORE_BURIED_PLACED_KEY = registerKey("migmatite_diamond_ore_buried_placed");
    public static final ResourceKey<PlacedFeature> MIGMATITE_DIAMOND_ORE_MEDIUM_PLACED_KEY = registerKey("migmatite_diamond_ore_medium_placed");
    public static final ResourceKey<PlacedFeature> MIGMATITE_EMERALD_ORE_PLACED_KEY = registerKey("migmatite_ermerald_ore_placed");

    public static final ResourceKey<PlacedFeature> MARBLE_BLOCK_PLACED_KEY = registerKey("marble_block_placed");
    public static final ResourceKey<PlacedFeature> MARBLE_IRON_ORE_MIDDLE_PLACED_KEY = registerKey("marble_iron_middle_placed");
    public static final ResourceKey<PlacedFeature> MARBLE_IRON_ORE_SMALL_PLACED_KEY = registerKey("marble_iron_small_placed");
    public static final ResourceKey<PlacedFeature> MARBLE_GOLD_ORE_PLACED_KEY = registerKey("marble_gold_ore_placed");
    public static final ResourceKey<PlacedFeature> MARBLE_GOLD_ORE_LOWER_PLACED_KEY = registerKey("marble_gold_ore_lower_placed");
    public static final ResourceKey<PlacedFeature> MARBLE_REDSTONE_ORE_PLACED_KEY = registerKey("marble_redstone_ore_placed");
    public static final ResourceKey<PlacedFeature> MARBLE_REDSTONE_ORE_LOWER_PLACED_KEY = registerKey("marble_redstone_ore_lower_placed");
    public static final ResourceKey<PlacedFeature> MARBLE_LAPIS_ORE_PLACED_KEY = registerKey("marble_lapis_ore_placed");
    public static final ResourceKey<PlacedFeature> MARBLE_LAPIS_ORE_BURIED_PLACED_KEY = registerKey("marble_lapis_ore_buried_placed");
    public static final ResourceKey<PlacedFeature> MARBLE_DIAMOND_ORE_SMALL_PLACED_KEY = registerKey("marble_diamond_ore_small_placed");
    public static final ResourceKey<PlacedFeature> MARBLE_DIAMOND_ORE_LARGE_PLACED_KEY = registerKey("marble_diamond_ore_large_placed");
    public static final ResourceKey<PlacedFeature> MARBLE_DIAMOND_ORE_BURIED_PLACED_KEY = registerKey("marble_diamond_ore_buried_placed");
    public static final ResourceKey<PlacedFeature> MARBLE_DIAMOND_ORE_MEDIUM_PLACED_KEY = registerKey("marble_diamond_ore_medium_placed");
    public static final ResourceKey<PlacedFeature> MARBLE_EMERALD_ORE_PLACED_KEY = registerKey("marble_ermerald_ore_placed");

    public static final ResourceKey<PlacedFeature> LIMESTONE_BLOCK_PLACED_KEY = registerKey("limestone_block_placed");
    public static final ResourceKey<PlacedFeature> LIMESTONE_COAL_ORE_PLACED_KEY = registerKey("limestone_coal_ore_placed");
    public static final ResourceKey<PlacedFeature> LIMESTONE_COPPER_ORE_SMALL_PLACED_KEY = registerKey("limestone_copper_ore_small_placed");
    public static final ResourceKey<PlacedFeature> LIMESTONE_COPPER_ORE_LARGE_PLACED_KEY = registerKey("limestone_copper_ore_large_placed");
    public static final ResourceKey<PlacedFeature> LIMESTONE_IRON_ORE_UPPER_PLACED_KEY = registerKey("limestone_iron_upper_placed");
    public static final ResourceKey<PlacedFeature> LIMESTONE_IRON_ORE_MIDDLE_PLACED_KEY = registerKey("limestone_iron_middle_placed");
    public static final ResourceKey<PlacedFeature> LIMESTONE_IRON_ORE_SMALL_PLACED_KEY = registerKey("limestone_iron_small_placed");
    public static final ResourceKey<PlacedFeature> LIMESTONE_GOLD_ORE_PLACED_KEY = registerKey("limestone_gold_ore_placed");
    public static final ResourceKey<PlacedFeature> LIMESTONE_GOLD_ORE_EXTRA_PLACED_KEY = registerKey("limestone_gold_ore_extra_placed");
    public static final ResourceKey<PlacedFeature> LIMESTONE_REDSTONE_ORE_PLACED_KEY = registerKey("limestone_redstone_ore_placed");
    public static final ResourceKey<PlacedFeature> LIMESTONE_REDSTONE_ORE_LOWER_PLACED_KEY = registerKey("limestone_redstone_ore_lower_placed");
    public static final ResourceKey<PlacedFeature> LIMESTONE_LAPIS_ORE_PLACED_KEY = registerKey("limestone_lapis_ore_placed");

    public static final ResourceKey<PlacedFeature> SILTSTONE_BLOCK_PLACED_KEY = registerKey("siltstone_block_placed");
    public static final ResourceKey<PlacedFeature> SILTSTONE_COAL_ORE_PLACED_KEY = registerKey("siltstone_coal_ore_placed");
    public static final ResourceKey<PlacedFeature> SILTSTONE_COPPER_ORE_SMALL_PLACED_KEY = registerKey("siltstone_copper_ore_small_placed");
    public static final ResourceKey<PlacedFeature> SILTSTONE_COPPER_ORE_LARGE_PLACED_KEY = registerKey("siltstone_copper_ore_large_placed");
    public static final ResourceKey<PlacedFeature> SILTSTONE_IRON_ORE_UPPER_PLACED_KEY = registerKey("siltstone_iron_upper_placed");
    public static final ResourceKey<PlacedFeature> SILTSTONE_IRON_ORE_MIDDLE_PLACED_KEY = registerKey("siltstone_iron_middle_placed");
    public static final ResourceKey<PlacedFeature> SILTSTONE_IRON_ORE_SMALL_PLACED_KEY = registerKey("siltstone_iron_small_placed");
    public static final ResourceKey<PlacedFeature> SILTSTONE_GOLD_ORE_PLACED_KEY = registerKey("siltstone_gold_ore_placed");
    public static final ResourceKey<PlacedFeature> SILTSTONE_GOLD_ORE_EXTRA_PLACED_KEY = registerKey("siltstone_gold_ore_extra_placed");
    public static final ResourceKey<PlacedFeature> SILTSTONE_REDSTONE_ORE_PLACED_KEY = registerKey("siltstone_redstone_ore_placed");
    public static final ResourceKey<PlacedFeature> SILTSTONE_REDSTONE_ORE_LOWER_PLACED_KEY = registerKey("siltstone_redstone_ore_lower_placed");
    public static final ResourceKey<PlacedFeature> SILTSTONE_LAPIS_ORE_PLACED_KEY = registerKey("siltstone_lapis_ore_placed");

    public static final ResourceKey<PlacedFeature> BLUECHIST_BLOCK_PLACED_KEY = registerKey("bluechist_block_placed");
    public static final ResourceKey<PlacedFeature> BLUECHIST_COAL_ORE_PLACED_KEY = registerKey("bluechist_coal_ore_placed");
    public static final ResourceKey<PlacedFeature> BLUECHIST_COPPER_ORE_SMALL_PLACED_KEY = registerKey("bluechist_copper_ore_small_placed");
    public static final ResourceKey<PlacedFeature> BLUECHIST_COPPER_ORE_LARGE_PLACED_KEY = registerKey("bluechist_copper_ore_large_placed");
    public static final ResourceKey<PlacedFeature> BLUECHIST_IRON_ORE_UPPER_PLACED_KEY = registerKey("bluechist_iron_upper_placed");
    public static final ResourceKey<PlacedFeature> BLUECHIST_IRON_ORE_MIDDLE_PLACED_KEY = registerKey("bluechist_iron_middle_placed");
    public static final ResourceKey<PlacedFeature> BLUECHIST_IRON_ORE_SMALL_PLACED_KEY = registerKey("bluechist_iron_small_placed");
    public static final ResourceKey<PlacedFeature> BLUECHIST_GOLD_ORE_PLACED_KEY = registerKey("bluechist_gold_ore_placed");
    public static final ResourceKey<PlacedFeature> BLUECHIST_GOLD_ORE_EXTRA_PLACED_KEY = registerKey("bluechist_gold_ore_extra_placed");
    public static final ResourceKey<PlacedFeature> BLUECHIST_REDSTONE_ORE_PLACED_KEY = registerKey("bluechist_redstone_ore_placed");
    public static final ResourceKey<PlacedFeature> BLUECHIST_REDSTONE_ORE_LOWER_PLACED_KEY = registerKey("bluechist_redstone_ore_lower_placed");
    public static final ResourceKey<PlacedFeature> BLUECHIST_LAPIS_ORE_PLACED_KEY = registerKey("bluechist_lapis_ore_placed");

    public static final ResourceKey<PlacedFeature> GREENSCHIST_BLOCK_PLACED_KEY = registerKey("greenschist_block_placed");
    public static final ResourceKey<PlacedFeature> GREENSCHIST_COAL_ORE_PLACED_KEY = registerKey("greenschist_coal_ore_placed");
    public static final ResourceKey<PlacedFeature> GREENSCHIST_COPPER_ORE_SMALL_PLACED_KEY = registerKey("greenschist_copper_ore_small_placed");
    public static final ResourceKey<PlacedFeature> GREENSCHIST_COPPER_ORE_LARGE_PLACED_KEY = registerKey("greenschist_copper_ore_large_placed");
    public static final ResourceKey<PlacedFeature> GREENSCHIST_IRON_ORE_UPPER_PLACED_KEY = registerKey("greenschist_iron_upper_placed");
    public static final ResourceKey<PlacedFeature> GREENSCHIST_IRON_ORE_MIDDLE_PLACED_KEY = registerKey("greenschist_iron_middle_placed");
    public static final ResourceKey<PlacedFeature> GREENSCHIST_IRON_ORE_SMALL_PLACED_KEY = registerKey("greenschist_iron_small_placed");
    public static final ResourceKey<PlacedFeature> GREENSCHIST_GOLD_ORE_PLACED_KEY = registerKey("greenschist_gold_ore_placed");
    public static final ResourceKey<PlacedFeature> GREENSCHIST_GOLD_ORE_EXTRA_PLACED_KEY = registerKey("greenschist_gold_ore_extra_placed");
    public static final ResourceKey<PlacedFeature> GREENSCHIST_REDSTONE_ORE_PLACED_KEY = registerKey("greenschist_redstone_ore_placed");
    public static final ResourceKey<PlacedFeature> GREENSCHIST_REDSTONE_ORE_LOWER_PLACED_KEY = registerKey("greenschist_redstone_ore_lower_placed");
    public static final ResourceKey<PlacedFeature> GREENSCHIST_LAPIS_ORE_PLACED_KEY = registerKey("greenschist_lapis_ore_placed");

    public static final ResourceKey<PlacedFeature> CHALK_BLOCK_PLACED_KEY = registerKey("chalk_block_placed");
    public static final ResourceKey<PlacedFeature> CHALK_COAL_ORE_PLACED_KEY = registerKey("chalk_coal_ore_placed");
    public static final ResourceKey<PlacedFeature> CHALK_COPPER_ORE_SMALL_PLACED_KEY = registerKey("chalk_copper_ore_small_placed");
    public static final ResourceKey<PlacedFeature> CHALK_COPPER_ORE_LARGE_PLACED_KEY = registerKey("chalk_copper_ore_large_placed");
    public static final ResourceKey<PlacedFeature> CHALK_IRON_ORE_UPPER_PLACED_KEY = registerKey("chalk_iron_upper_placed");
    public static final ResourceKey<PlacedFeature> CHALK_IRON_ORE_MIDDLE_PLACED_KEY = registerKey("chalk_iron_middle_placed");
    public static final ResourceKey<PlacedFeature> CHALK_IRON_ORE_SMALL_PLACED_KEY = registerKey("chalk_iron_small_placed");
    public static final ResourceKey<PlacedFeature> CHALK_GOLD_ORE_PLACED_KEY = registerKey("chalk_gold_ore_placed");
    public static final ResourceKey<PlacedFeature> CHALK_GOLD_ORE_EXTRA_PLACED_KEY = registerKey("chalk_gold_ore_extra_placed");
    public static final ResourceKey<PlacedFeature> CHALK_REDSTONE_ORE_PLACED_KEY = registerKey("chalk_redstone_ore_placed");
    public static final ResourceKey<PlacedFeature> CHALK_REDSTONE_ORE_LOWER_PLACED_KEY = registerKey("chalk_redstone_ore_lower_placed");
    public static final ResourceKey<PlacedFeature> CHALK_LAPIS_ORE_PLACED_KEY = registerKey("chalk_lapis_ore_placed");

    /**
     * Bootstrap method.
     * Called during worldgen setup to register all PlacedFeatures.
     */
    public static void bootstrap(BootstrapContext<PlacedFeature> context) {

        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        // For examples, see vanilla "OrePlacements.java"

        /* ------------------------------------------------------------
         * SOAPSTONE – Base stone
         * ------------------------------------------------------------ */

        // Soapstone base rock (rare, spans most of the world height)
        register(context, SOAPSTONE_BLOCK_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_SOAPSTONE_BLOCK_KEY),
                commonOrePlacement(
                        2,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(-17),
                                VerticalAnchor.absolute(384)
                        )
                )
        );

        // Soapstone coal ore (very common, high Y-levels)
        register(context, SOAPSTONE_COAL_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_SOAPSTONE_COAL_ORE_KEY),
                commonOrePlacement(
                        30,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(128),
                                VerticalAnchor.top()
                        )
                )
        );

        // Small copper veins
        register(context, SOAPSTONE_COPPER_ORE_SMALL_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_SOAPSTONE_COPPER_ORE_SMALL_KEY),
                commonOrePlacement(
                        16,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(112)
                        )
                )
        );

        // Large copper veins
        register(context, SOAPSTONE_COPPER_ORE_LARGE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_SOAPSTONE_COPPER_ORE_LARGE_KEY),
                commonOrePlacement(
                        16,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(112)
                        )
                )
        );

        // Iron ore – upper layer
        register(context, SOAPSTONE_IRON_ORE_UPPER_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_SOAPSTONE_IRON_ORE_KEY),
                commonOrePlacement(
                        90,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(80),
                                VerticalAnchor.absolute(384)
                        )
                )
        );

        // Iron ore – middle layer
        register(context, SOAPSTONE_IRON_ORE_MIDDLE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_SOAPSTONE_IRON_ORE_KEY),
                commonOrePlacement(
                        10,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(56)
                        )
                )
        );

        // Iron ore – small veins
        register(context, SOAPSTONE_IRON_ORE_SMALL_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_SOAPSTONE_IRON_ORE_SMALL_KEY),
                commonOrePlacement(
                        10,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.bottom(),
                                VerticalAnchor.absolute(72)
                        )
                )
        );

        // Gold ore – standard distribution
        register(context, SOAPSTONE_GOLD_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_SOAPSTONE_GOLD_ORE_KEY),
                commonOrePlacement(
                        4,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(32)
                        )
                )
        );

        // Gold ore – extra distribution (badlands-like, higher Y-levels)
        register(context, SOAPSTONE_GOLD_ORE_EXTRA_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_SOAPSTONE_GOLD_ORE_EXTRA_KEY),
                commonOrePlacement(
                        50,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(32),
                                VerticalAnchor.absolute(256)
                        )
                )
        );

        // Redstone ore – standard distribution
        register(context, SOAPSTONE_REDSTONE_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_SOAPSTONE_REDSTONE_ORE_KEY),
                commonOrePlacement(
                        4,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.bottom(),
                                VerticalAnchor.absolute(15)
                        )
                )
        );

        // Redstone ore – deep distribution
        register(context, SOAPSTONE_REDSTONE_ORE_LOWER_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_SOAPSTONE_GOLD_ORE_EXTRA_KEY),
                commonOrePlacement(
                        8,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.aboveBottom(-16),
                                VerticalAnchor.aboveBottom(32)
                        )
                )
        );

        // Lapis ore
        register(context, SOAPSTONE_LAPIS_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_SOAPSTONE_LAPIS_ORE_KEY),
                commonOrePlacement(
                        2,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(32)
                        )
                )
        );

        /* ------------------------------------------------------------
         * RHYOLITE – Base stone
         * ------------------------------------------------------------ */

        // Rhyolite base rock (rare, spans most of the world height)
        register(context, RHYOLITE_BLOCK_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_RHYOLITE_BLOCK_KEY),
                commonOrePlacement(
                        2,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(-17),
                                VerticalAnchor.absolute(384)
                        )
                )
        );

        // Rhyolite coal ore (very common, high Y-levels)
        register(context, RHYOLITE_COAL_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_RHYOLITE_COAL_ORE_KEY),
                commonOrePlacement(
                        30,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(128),
                                VerticalAnchor.top()
                        )
                )
        );

        // Small copper veins
        register(context, RHYOLITE_COPPER_ORE_SMALL_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_RHYOLITE_COPPER_ORE_SMALL_KEY),
                commonOrePlacement(
                        16,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(112)
                        )
                )
        );

        // Large copper veins
        register(context, RHYOLITE_COPPER_ORE_LARGE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_RHYOLITE_COPPER_ORE_LARGE_KEY),
                commonOrePlacement(
                        16,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(112)
                        )
                )
        );

        // Iron ore – upper layer
        register(context, RHYOLITE_IRON_ORE_UPPER_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_RHYOLITE_IRON_ORE_KEY),
                commonOrePlacement(
                        90,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(80),
                                VerticalAnchor.absolute(384)
                        )
                )
        );

        // Iron ore – middle layer
        register(context, RHYOLITE_IRON_ORE_MIDDLE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_RHYOLITE_IRON_ORE_KEY),
                commonOrePlacement(
                        10,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(56)
                        )
                )
        );

        // Iron ore – small veins
        register(context, RHYOLITE_IRON_ORE_SMALL_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_RHYOLITE_IRON_ORE_SMALL_KEY),
                commonOrePlacement(
                        10,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.bottom(),
                                VerticalAnchor.absolute(72)
                        )
                )
        );

        // Gold ore – standard distribution
        register(context, RHYOLITE_GOLD_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_RHYOLITE_GOLD_ORE_KEY),
                commonOrePlacement(
                        4,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(32)
                        )
                )
        );

        // Gold ore – extra distribution (badlands-like, higher Y-levels)
        register(context, RHYOLITE_GOLD_ORE_EXTRA_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_RHYOLITE_GOLD_ORE_EXTRA_KEY),
                commonOrePlacement(
                        50,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(32),
                                VerticalAnchor.absolute(256)
                        )
                )
        );

        // Redstone ore – standard distribution
        register(context, RHYOLITE_REDSTONE_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_RHYOLITE_REDSTONE_ORE_KEY),
                commonOrePlacement(
                        4,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.bottom(),
                                VerticalAnchor.absolute(15)
                        )
                )
        );

        // Redstone ore – deep distribution
        register(context, RHYOLITE_REDSTONE_ORE_LOWER_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_RHYOLITE_REDSTONE_ORE_LOWER_KEY),
                commonOrePlacement(
                        8,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.aboveBottom(-16),
                                VerticalAnchor.aboveBottom(32)
                        )
                )
        );

        // Lapis ore
        register(context, RHYOLITE_LAPIS_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_RHYOLITE_LAPIS_ORE_KEY),
                commonOrePlacement(
                        2,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(32)
                        )
                )
        );

        /* ------------------------------------------------------------
         * RED GRANITE
         * ------------------------------------------------------------ */

        register(context, RED_GRANITE_BLOCK_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_RED_GRANITE_BLOCK_KEY),
                commonOrePlacement(
                        2,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(-64),
                                VerticalAnchor.absolute(0)
                        )
                )
        );

        // Iron ore – middle layer
        register(context, RED_GRANITE_IRON_ORE_MIDDLE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_RED_GRANITE_IRON_ORE_KEY),
                commonOrePlacement(
                        10,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-24),
                                VerticalAnchor.absolute(0)
                        )
                )
        );

        // Iron ore – small veins
        register(context, RED_GRANITE_IRON_ORE_SMALL_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_RED_GRANITE_IRON_ORE_SMALL_KEY),
                commonOrePlacement(
                        10,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.bottom(),
                                VerticalAnchor.absolute(0)
                        )
                )
        );

        // Gold ore – standard distribution
        register(context, RED_GRANITE_GOLD_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_RED_GRANITE_GOLD_ORE_KEY),
                commonOrePlacement(
                        4,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-64),
                                VerticalAnchor.absolute(0)
                        )
                )
        );

        // Gold ore – lower distribution (badlands-like, higher Y-levels)
        register(context, RED_GRANITE_GOLD_ORE_LOWER_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_RED_GRANITE_GOLD_ORE_LOWER_KEY),
                UBCOrePlacements.orePlacement(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(-64),
                                VerticalAnchor.absolute(-48)
                        )
                )
        );

        // Redstone ore
        register(context, RED_GRANITE_REDSTONE_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_RED_GRANITE_REDSTONE_ORE_KEY),
                commonOrePlacement(
                        4,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.bottom(),
                                VerticalAnchor.absolute(15)
                        )
                )
        );


        // Redstone ore – deep distribution
        register(context, RED_GRANITE_REDSTONE_ORE_LOWER_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_RED_GRANITE_REDSTONE_ORE_LOWER_KEY),
                commonOrePlacement(
                        8,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.aboveBottom(-32),
                                VerticalAnchor.aboveBottom(0)
                        )
                )
        );

        // Lapis ore
        register(context, RED_GRANITE_LAPIS_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_RED_GRANITE_LAPIS_ORE_KEY),
                commonOrePlacement(
                        2,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-32),
                                VerticalAnchor.absolute(0)
                        )
                )
        );

        // Lapis ore buried
        register(context, RED_GRANITE_LAPIS_ORE_BURIED_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_RED_GRANITE_LAPIS_ORE_KEY),
                commonOrePlacement(
                        4,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.bottom(),
                                VerticalAnchor.absolute(64)
                        )
                )
        );

        // Diamond ore small
        register(context, RED_GRANITE_DIAMOND_ORE_SMALL_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_RED_GRANITE_DIAMOND_ORE_SMALL_KEY),
                commonOrePlacement(
                        7,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.aboveBottom(-80),
                                VerticalAnchor.aboveBottom(0)
                        )
                )
        );

        // Diamond ore large
        register(context, RED_GRANITE_DIAMOND_ORE_LARGE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_RED_GRANITE_DIAMOND_ORE_LARGE_KEY),
                rareOrePlacement(
                        9,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.aboveBottom(-80),
                                VerticalAnchor.aboveBottom(0)
                        )
                )
        );

        // Diamond ore buried
        register(context, RED_GRANITE_DIAMOND_ORE_BURIED_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_RED_GRANITE_DIAMOND_ORE_BURIED_KEY),
                commonOrePlacement(
                        4,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.aboveBottom(-80),
                                VerticalAnchor.aboveBottom(0)
                        )
                )
        );

        // Diamond ore medium
        register(context, RED_GRANITE_DIAMOND_ORE_MEDIUM_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_RED_GRANITE_DIAMOND_ORE_MEDIUM_KEY),
                commonOrePlacement(
                        2,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-64),
                                VerticalAnchor.absolute(-4)
                        )
                )
        );

        // Emerald ore
        register(context, RED_GRANITE_EMERALD_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_RED_GRANITE_EMERALD_ORE_KEY),
                commonOrePlacement(
                        2,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(0)
                        )
                )
        );

        /* ------------------------------------------------------------
         * QUARTZITE
         * ------------------------------------------------------------ */

        register(context, QUARTZITE_BLOCK_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_QUARTZITE_BLOCK_KEY),
                commonOrePlacement(
                        2,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(-64),
                                VerticalAnchor.absolute(0)
                        )
                )
        );

        // Iron ore – middle layer
        register(context, QUARTZITE_IRON_ORE_MIDDLE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_QUARTZITE_IRON_ORE_KEY),
                commonOrePlacement(
                        10,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-24),
                                VerticalAnchor.absolute(0)
                        )
                )
        );

        // Iron ore – small veins
        register(context, QUARTZITE_IRON_ORE_SMALL_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_QUARTZITE_IRON_ORE_SMALL_KEY),
                commonOrePlacement(
                        10,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.bottom(),
                                VerticalAnchor.absolute(0)
                        )
                )
        );

        // Gold ore – standard distribution
        register(context, QUARTZITE_GOLD_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_QUARTZITE_GOLD_ORE_KEY),
                commonOrePlacement(
                        4,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-64),
                                VerticalAnchor.absolute(0)
                        )
                )
        );

        // Gold ore – lower distribution (badlands-like, higher Y-levels)
        register(context, QUARTZITE_GOLD_ORE_LOWER_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_QUARTZITE_GOLD_ORE_LOWER_KEY),
                UBCOrePlacements.orePlacement(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(-64),
                                VerticalAnchor.absolute(-48)
                        )
                )
        );

        // Redstone ore
        register(context, QUARTZITE_REDSTONE_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_QUARTZITE_REDSTONE_ORE_KEY),
                commonOrePlacement(
                        4,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.bottom(),
                                VerticalAnchor.absolute(15)
                        )
                )
        );

        // Redstone ore – deep distribution
        register(context, QUARTZITE_REDSTONE_ORE_LOWER_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_QUARTZITE_REDSTONE_ORE_LOWER_KEY),
                commonOrePlacement(
                        8,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.aboveBottom(-32),
                                VerticalAnchor.aboveBottom(0)
                        )
                )
        );

        // Lapis ore
        register(context, QUARTZITE_LAPIS_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_QUARTZITE_LAPIS_ORE_KEY),
                commonOrePlacement(
                        2,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-32),
                                VerticalAnchor.absolute(0)
                        )
                )
        );

        // Lapis ore buried
        register(context, QUARTZITE_LAPIS_ORE_BURIED_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_QUARTZITE_LAPIS_ORE_KEY),
                commonOrePlacement(
                        4,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.bottom(),
                                VerticalAnchor.absolute(64)
                        )
                )
        );

        // Diamond ore small
        register(context, QUARTZITE_DIAMOND_ORE_SMALL_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_QUARTZITE_DIAMOND_ORE_SMALL_KEY),
                commonOrePlacement(
                        7,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.aboveBottom(-80),
                                VerticalAnchor.aboveBottom(0)
                        )
                )
        );

        // Diamond ore large
        register(context, QUARTZITE_DIAMOND_ORE_LARGE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_QUARTZITE_DIAMOND_ORE_LARGE_KEY),
                rareOrePlacement(
                        9,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.aboveBottom(-80),
                                VerticalAnchor.aboveBottom(0)
                        )
                )
        );

        // Diamond ore buried
        register(context, QUARTZITE_DIAMOND_ORE_BURIED_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_QUARTZITE_DIAMOND_ORE_BURIED_KEY),
                commonOrePlacement(
                        4,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.aboveBottom(-80),
                                VerticalAnchor.aboveBottom(0)
                        )
                )
        );

        // Diamond ore medium
        register(context, QUARTZITE_DIAMOND_ORE_MEDIUM_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_QUARTZITE_DIAMOND_ORE_MEDIUM_KEY),
                commonOrePlacement(
                        2,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-64),
                                VerticalAnchor.absolute(-4)
                        )
                )
        );

        // Emerald ore
        register(context, QUARTZITE_EMERALD_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_QUARTZITE_EMERALD_ORE_KEY),
                commonOrePlacement(
                        2,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(0)
                        )
                )
        );

        /* ------------------------------------------------------------
         * MIGMATITE
         * ------------------------------------------------------------ */

        register(context, MIGMATITE_BLOCK_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_MIGMATITE_BLOCK_KEY),
                commonOrePlacement(
                        2,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(-64),
                                VerticalAnchor.absolute(0)
                        )
                )
        );

        // Iron ore – middle layer
        register(context, MIGMATITE_IRON_ORE_MIDDLE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_MIGMATITE_IRON_ORE_KEY),
                commonOrePlacement(
                        10,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-24),
                                VerticalAnchor.absolute(0)
                        )
                )
        );

        // Iron ore – small veins
        register(context, MIGMATITE_IRON_ORE_SMALL_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_MIGMATITE_IRON_ORE_SMALL_KEY),
                commonOrePlacement(
                        10,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.bottom(),
                                VerticalAnchor.absolute(0)
                        )
                )
        );

        // Gold ore – standard distribution
        register(context, MIGMATITE_GOLD_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_MIGMATITE_GOLD_ORE_KEY),
                commonOrePlacement(
                        4,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-64),
                                VerticalAnchor.absolute(0)
                        )
                )
        );

        // Gold ore – lower distribution (badlands-like, higher Y-levels)
        register(context, MIGMATITE_GOLD_ORE_LOWER_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_MIGMATITE_GOLD_ORE_LOWER_KEY),
                UBCOrePlacements.orePlacement(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(-64),
                                VerticalAnchor.absolute(-48)
                        )
                )
        );

        // Redstone ore
        register(context, MIGMATITE_REDSTONE_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_MIGMATITE_REDSTONE_ORE_KEY),
                commonOrePlacement(
                        4,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.bottom(),
                                VerticalAnchor.absolute(15)
                        )
                )
        );

        // Redstone ore – deep distribution
        register(context, MIGMATITE_REDSTONE_ORE_LOWER_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_MIGMATITE_REDSTONE_ORE_LOWER_KEY),
                commonOrePlacement(
                        8,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.aboveBottom(-32),
                                VerticalAnchor.aboveBottom(0)
                        )
                )
        );

        // Lapis ore
        register(context, MIGMATITE_LAPIS_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_MIGMATITE_LAPIS_ORE_KEY),
                commonOrePlacement(
                        2,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-32),
                                VerticalAnchor.absolute(0)
                        )
                )
        );

        // Lapis ore buried
        register(context, MIGMATITE_LAPIS_ORE_BURIED_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_MIGMATITE_LAPIS_ORE_KEY),
                commonOrePlacement(
                        4,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.bottom(),
                                VerticalAnchor.absolute(64)
                        )
                )
        );

        // Diamond ore small
        register(context, MIGMATITE_DIAMOND_ORE_SMALL_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_MIGMATITE_DIAMOND_ORE_SMALL_KEY),
                commonOrePlacement(
                        7,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.aboveBottom(-80),
                                VerticalAnchor.aboveBottom(0)
                        )
                )
        );

        // Diamond ore large
        register(context, MIGMATITE_DIAMOND_ORE_LARGE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_MIGMATITE_DIAMOND_ORE_LARGE_KEY),
                rareOrePlacement(
                        9,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.aboveBottom(-80),
                                VerticalAnchor.aboveBottom(0)
                        )
                )
        );

        // Diamond ore buried
        register(context, MIGMATITE_DIAMOND_ORE_BURIED_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_MIGMATITE_DIAMOND_ORE_BURIED_KEY),
                commonOrePlacement(
                        4,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.aboveBottom(-80),
                                VerticalAnchor.aboveBottom(0)
                        )
                )
        );

        // Diamond ore medium
        register(context, MIGMATITE_DIAMOND_ORE_MEDIUM_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_MIGMATITE_DIAMOND_ORE_MEDIUM_KEY),
                commonOrePlacement(
                        2,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-64),
                                VerticalAnchor.absolute(-4)
                        )
                )
        );

        // Emerald ore
        register(context, MIGMATITE_EMERALD_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_MIGMATITE_EMERALD_ORE_KEY),
                commonOrePlacement(
                        2,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(0)
                        )
                )
        );

        /* ------------------------------------------------------------
         * MARBLE – Base stone
         * ------------------------------------------------------------ */

        register(context, MARBLE_BLOCK_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_MARBLE_BLOCK_KEY),
                commonOrePlacement(
                        2,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(-64),
                                VerticalAnchor.absolute(0)
                        )
                )
        );

        // Iron ore – middle layer
        register(context, MARBLE_IRON_ORE_MIDDLE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_MARBLE_IRON_ORE_KEY),
                commonOrePlacement(
                        10,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-24),
                                VerticalAnchor.absolute(0)
                        )
                )
        );

        // Iron ore – small veins
        register(context, MARBLE_IRON_ORE_SMALL_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_MARBLE_IRON_ORE_SMALL_KEY),
                commonOrePlacement(
                        10,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.bottom(),
                                VerticalAnchor.absolute(0)
                        )
                )
        );

        // Gold ore – standard distribution
        register(context, MARBLE_GOLD_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_MARBLE_GOLD_ORE_KEY),
                commonOrePlacement(
                        4,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-64),
                                VerticalAnchor.absolute(0)
                        )
                )
        );

        // Gold ore – lower distribution (badlands-like, higher Y-levels)
        register(context, MARBLE_GOLD_ORE_LOWER_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_MARBLE_GOLD_ORE_LOWER_KEY),
                UBCOrePlacements.orePlacement(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(-64),
                                VerticalAnchor.absolute(-48)
                        )
                )
        );

        // Redstone ore
        register(context, MARBLE_REDSTONE_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_MARBLE_REDSTONE_ORE_KEY),
                commonOrePlacement(
                        4,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.bottom(),
                                VerticalAnchor.absolute(15)
                        )
                )
        );

        // Redstone ore – deep distribution
        register(context, MARBLE_REDSTONE_ORE_LOWER_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_MARBLE_REDSTONE_ORE_LOWER_KEY),
                commonOrePlacement(
                        8,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.aboveBottom(-32),
                                VerticalAnchor.aboveBottom(0)
                        )
                )
        );

        // Lapis ore
        register(context, MARBLE_LAPIS_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_MARBLE_LAPIS_ORE_KEY),
                commonOrePlacement(
                        2,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-32),
                                VerticalAnchor.absolute(0)
                        )
                )
        );

        // Lapis ore buried
        register(context, MARBLE_LAPIS_ORE_BURIED_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_MARBLE_LAPIS_ORE_KEY),
                commonOrePlacement(
                        4,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.bottom(),
                                VerticalAnchor.absolute(64)
                        )
                )
        );

        // Diamond ore small
        register(context, MARBLE_DIAMOND_ORE_SMALL_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_MARBLE_DIAMOND_ORE_SMALL_KEY),
                commonOrePlacement(
                        7,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.aboveBottom(-80),
                                VerticalAnchor.aboveBottom(0)
                        )
                )
        );

        // Diamond ore large
        register(context, MARBLE_DIAMOND_ORE_LARGE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_MARBLE_DIAMOND_ORE_LARGE_KEY),
                rareOrePlacement(
                        9,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.aboveBottom(-80),
                                VerticalAnchor.aboveBottom(0)
                        )
                )
        );

        // Diamond ore buried
        register(context, MARBLE_DIAMOND_ORE_BURIED_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_MARBLE_DIAMOND_ORE_BURIED_KEY),
                commonOrePlacement(
                        4,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.aboveBottom(-80),
                                VerticalAnchor.aboveBottom(0)
                        )
                )
        );

        // Diamond ore medium
        register(context, MARBLE_DIAMOND_ORE_MEDIUM_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_MARBLE_DIAMOND_ORE_MEDIUM_KEY),
                commonOrePlacement(
                        2,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-64),
                                VerticalAnchor.absolute(-4)
                        )
                )
        );

        // Emerald ore
        register(context, MARBLE_EMERALD_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_MARBLE_EMERALD_ORE_KEY),
                commonOrePlacement(
                        2,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(0)
                        )
                )
        );

        /* ------------------------------------------------------------
         * LIMESTONE – Base stone
         * ------------------------------------------------------------ */

        // Limestone base rock (rare, spans most of the world height)
        register(context, LIMESTONE_BLOCK_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_LIMESTONE_BLOCK_KEY),
                commonOrePlacement(
                        2,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(-17),
                                VerticalAnchor.absolute(384)
                        )
                )
        );

        // Limestone coal ore (very common, high Y-levels)
        register(context, LIMESTONE_COAL_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_LIMESTONE_COAL_ORE_KEY),
                commonOrePlacement(
                        30,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(128),
                                VerticalAnchor.top()
                        )
                )
        );

        // Small copper veins
        register(context, LIMESTONE_COPPER_ORE_SMALL_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_LIMESTONE_COPPER_ORE_SMALL_KEY),
                commonOrePlacement(
                        16,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(112)
                        )
                )
        );

        // Large copper veins
        register(context, LIMESTONE_COPPER_ORE_LARGE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_LIMESTONE_COPPER_ORE_LARGE_KEY),
                commonOrePlacement(
                        16,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(112)
                        )
                )
        );

        // Iron ore – upper layer
        register(context, LIMESTONE_IRON_ORE_UPPER_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_LIMESTONE_IRON_ORE_KEY),
                commonOrePlacement(
                        90,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(80),
                                VerticalAnchor.absolute(384)
                        )
                )
        );

        // Iron ore – middle layer
        register(context, LIMESTONE_IRON_ORE_MIDDLE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_LIMESTONE_IRON_ORE_KEY),
                commonOrePlacement(
                        10,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(56)
                        )
                )
        );

        // Iron ore – small veins
        register(context, LIMESTONE_IRON_ORE_SMALL_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_LIMESTONE_IRON_ORE_SMALL_KEY),
                commonOrePlacement(
                        10,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.bottom(),
                                VerticalAnchor.absolute(72)
                        )
                )
        );

        // Gold ore – standard distribution
        register(context, LIMESTONE_GOLD_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_LIMESTONE_GOLD_ORE_KEY),
                commonOrePlacement(
                        4,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(32)
                        )
                )
        );

        // Gold ore – extra distribution (badlands-like, higher Y-levels)
        register(context, LIMESTONE_GOLD_ORE_EXTRA_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_LIMESTONE_GOLD_ORE_EXTRA_KEY),
                commonOrePlacement(
                        50,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(32),
                                VerticalAnchor.absolute(256)
                        )
                )
        );

        // Redstone ore – standard distribution
        register(context, LIMESTONE_REDSTONE_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_LIMESTONE_REDSTONE_ORE_KEY),
                commonOrePlacement(
                        4,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.bottom(),
                                VerticalAnchor.absolute(15)
                        )
                )
        );

        // Redstone ore – deep distribution
        register(context, LIMESTONE_REDSTONE_ORE_LOWER_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_LIMESTONE_GOLD_ORE_EXTRA_KEY),
                commonOrePlacement(
                        8,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.aboveBottom(-16),
                                VerticalAnchor.aboveBottom(32)
                        )
                )
        );

        // Lapis ore
        register(context, LIMESTONE_LAPIS_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_LIMESTONE_LAPIS_ORE_KEY),
                commonOrePlacement(
                        2,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(32)
                        )
                )
        );

        /* ------------------------------------------------------------
         * SILTSTONE – Base stone
         * ------------------------------------------------------------ */

        // Siltstone base rock (rare, spans most of the world height)
        register(context, SILTSTONE_BLOCK_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_SILTSTONE_BLOCK_KEY),
                commonOrePlacement(
                        2,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(-17),
                                VerticalAnchor.absolute(384)
                        )
                )
        );

        // Siltstone coal ore (very common, high Y-levels)
        register(context, SILTSTONE_COAL_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_SILTSTONE_COAL_ORE_KEY),
                commonOrePlacement(
                        30,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(128),
                                VerticalAnchor.top()
                        )
                )
        );

        // Small copper veins
        register(context, SILTSTONE_COPPER_ORE_SMALL_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_SILTSTONE_COPPER_ORE_SMALL_KEY),
                commonOrePlacement(
                        16,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(112)
                        )
                )
        );

        // Large copper veins
        register(context, SILTSTONE_COPPER_ORE_LARGE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_SILTSTONE_COPPER_ORE_LARGE_KEY),
                commonOrePlacement(
                        16,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(112)
                        )
                )
        );

        // Iron ore – upper layer
        register(context, SILTSTONE_IRON_ORE_UPPER_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_SILTSTONE_IRON_ORE_KEY),
                commonOrePlacement(
                        90,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(80),
                                VerticalAnchor.absolute(384)
                        )
                )
        );

        // Iron ore – middle layer
        register(context, SILTSTONE_IRON_ORE_MIDDLE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_SILTSTONE_IRON_ORE_KEY),
                commonOrePlacement(
                        10,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(56)
                        )
                )
        );

        // Iron ore – small veins
        register(context, SILTSTONE_IRON_ORE_SMALL_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_SILTSTONE_IRON_ORE_SMALL_KEY),
                commonOrePlacement(
                        10,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.bottom(),
                                VerticalAnchor.absolute(72)
                        )
                )
        );

        // Gold ore – standard distribution
        register(context, SILTSTONE_GOLD_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_SILTSTONE_GOLD_ORE_KEY),
                commonOrePlacement(
                        4,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(32)
                        )
                )
        );

        // Gold ore – extra distribution (badlands-like, higher Y-levels)
        register(context, SILTSTONE_GOLD_ORE_EXTRA_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_SILTSTONE_GOLD_ORE_EXTRA_KEY),
                commonOrePlacement(
                        50,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(32),
                                VerticalAnchor.absolute(256)
                        )
                )
        );

        // Redstone ore – standard distribution
        register(context, SILTSTONE_REDSTONE_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_SILTSTONE_REDSTONE_ORE_KEY),
                commonOrePlacement(
                        4,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.bottom(),
                                VerticalAnchor.absolute(15)
                        )
                )
        );

        // Redstone ore – deep distribution
        register(context, SILTSTONE_REDSTONE_ORE_LOWER_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_SILTSTONE_GOLD_ORE_EXTRA_KEY),
                commonOrePlacement(
                        8,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.aboveBottom(-16),
                                VerticalAnchor.aboveBottom(32)
                        )
                )
        );

        // Lapis ore
        register(context, SILTSTONE_LAPIS_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_SILTSTONE_LAPIS_ORE_KEY),
                commonOrePlacement(
                        2,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(32)
                        )
                )
        );

        /* ------------------------------------------------------------
         * BLUECHIST – Base stone
         * ------------------------------------------------------------ */

        // Bluechist base rock (rare, spans most of the world height)
        register(context, BLUECHIST_BLOCK_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_BLUECHIST_BLOCK_KEY),
                commonOrePlacement(
                        2,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(-17),
                                VerticalAnchor.absolute(384)
                        )
                )
        );

        // Bluechist coal ore (very common, high Y-levels)
        register(context, BLUECHIST_COAL_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_BLUECHIST_COAL_ORE_KEY),
                commonOrePlacement(
                        30,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(128),
                                VerticalAnchor.top()
                        )
                )
        );

        // Small copper veins
        register(context, BLUECHIST_COPPER_ORE_SMALL_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_BLUECHIST_COPPER_ORE_SMALL_KEY),
                commonOrePlacement(
                        16,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(112)
                        )
                )
        );

        // Large copper veins
        register(context, BLUECHIST_COPPER_ORE_LARGE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_BLUECHIST_COPPER_ORE_LARGE_KEY),
                commonOrePlacement(
                        16,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(112)
                        )
                )
        );

        // Iron ore – upper layer
        register(context, BLUECHIST_IRON_ORE_UPPER_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_BLUECHIST_IRON_ORE_KEY),
                commonOrePlacement(
                        90,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(80),
                                VerticalAnchor.absolute(384)
                        )
                )
        );

        // Iron ore – middle layer
        register(context, BLUECHIST_IRON_ORE_MIDDLE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_BLUECHIST_IRON_ORE_KEY),
                commonOrePlacement(
                        10,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(56)
                        )
                )
        );

        // Iron ore – small veins
        register(context, BLUECHIST_IRON_ORE_SMALL_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_BLUECHIST_IRON_ORE_SMALL_KEY),
                commonOrePlacement(
                        10,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.bottom(),
                                VerticalAnchor.absolute(72)
                        )
                )
        );

        // Gold ore – standard distribution
        register(context, BLUECHIST_GOLD_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_BLUECHIST_GOLD_ORE_KEY),
                commonOrePlacement(
                        4,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(32)
                        )
                )
        );

        // Gold ore – extra distribution (badlands-like, higher Y-levels)
        register(context, BLUECHIST_GOLD_ORE_EXTRA_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_BLUECHIST_GOLD_ORE_EXTRA_KEY),
                commonOrePlacement(
                        50,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(32),
                                VerticalAnchor.absolute(256)
                        )
                )
        );

        // Redstone ore – standard distribution
        register(context, BLUECHIST_REDSTONE_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_BLUECHIST_REDSTONE_ORE_KEY),
                commonOrePlacement(
                        4,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.bottom(),
                                VerticalAnchor.absolute(15)
                        )
                )
        );

        // Redstone ore – deep distribution
        register(context, BLUECHIST_REDSTONE_ORE_LOWER_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_BLUECHIST_GOLD_ORE_EXTRA_KEY),
                commonOrePlacement(
                        8,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.aboveBottom(-16),
                                VerticalAnchor.aboveBottom(32)
                        )
                )
        );

        // Lapis ore
        register(context, BLUECHIST_LAPIS_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_BLUECHIST_LAPIS_ORE_KEY),
                commonOrePlacement(
                        2,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(32)
                        )
                )
        );

        /* ------------------------------------------------------------
         * GREENSCHIST – Base stone
         * ------------------------------------------------------------ */

        // Greenschist base rock (rare, spans most of the world height)
        register(context, GREENSCHIST_BLOCK_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_GREENSCHIST_BLOCK_KEY),
                commonOrePlacement(
                        2,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(-17),
                                VerticalAnchor.absolute(384)
                        )
                )
        );

        // Greenschist coal ore (very common, high Y-levels)
        register(context, GREENSCHIST_COAL_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_GREENSCHIST_COAL_ORE_KEY),
                commonOrePlacement(
                        30,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(128),
                                VerticalAnchor.top()
                        )
                )
        );

        // Small copper veins
        register(context, GREENSCHIST_COPPER_ORE_SMALL_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_GREENSCHIST_COPPER_ORE_SMALL_KEY),
                commonOrePlacement(
                        16,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(112)
                        )
                )
        );

        // Large copper veins
        register(context, GREENSCHIST_COPPER_ORE_LARGE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_GREENSCHIST_COPPER_ORE_LARGE_KEY),
                commonOrePlacement(
                        16,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(112)
                        )
                )
        );

        // Iron ore – upper layer
        register(context, GREENSCHIST_IRON_ORE_UPPER_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_GREENSCHIST_IRON_ORE_KEY),
                commonOrePlacement(
                        90,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(80),
                                VerticalAnchor.absolute(384)
                        )
                )
        );

        // Iron ore – middle layer
        register(context, GREENSCHIST_IRON_ORE_MIDDLE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_GREENSCHIST_IRON_ORE_KEY),
                commonOrePlacement(
                        10,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(56)
                        )
                )
        );

        // Iron ore – small veins
        register(context, GREENSCHIST_IRON_ORE_SMALL_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_GREENSCHIST_IRON_ORE_SMALL_KEY),
                commonOrePlacement(
                        10,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.bottom(),
                                VerticalAnchor.absolute(72)
                        )
                )
        );

        // Gold ore – standard distribution
        register(context, GREENSCHIST_GOLD_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_GREENSCHIST_GOLD_ORE_KEY),
                commonOrePlacement(
                        4,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(32)
                        )
                )
        );

        // Gold ore – extra distribution (badlands-like, higher Y-levels)
        register(context, GREENSCHIST_GOLD_ORE_EXTRA_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_GREENSCHIST_GOLD_ORE_EXTRA_KEY),
                commonOrePlacement(
                        50,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(32),
                                VerticalAnchor.absolute(256)
                        )
                )
        );

        // Redstone ore – standard distribution
        register(context, GREENSCHIST_REDSTONE_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_GREENSCHIST_REDSTONE_ORE_KEY),
                commonOrePlacement(
                        4,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.bottom(),
                                VerticalAnchor.absolute(15)
                        )
                )
        );

        // Redstone ore – deep distribution
        register(context, GREENSCHIST_REDSTONE_ORE_LOWER_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_GREENSCHIST_GOLD_ORE_EXTRA_KEY),
                commonOrePlacement(
                        8,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.aboveBottom(-16),
                                VerticalAnchor.aboveBottom(32)
                        )
                )
        );

        // Lapis ore
        register(context, GREENSCHIST_LAPIS_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_GREENSCHIST_LAPIS_ORE_KEY),
                commonOrePlacement(
                        2,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(32)
                        )
                )
        );

        /* ------------------------------------------------------------
         * CHALK – Base stone
         * ------------------------------------------------------------ */

        // Chalk base rock (rare, spans most of the world height)
        register(context, CHALK_BLOCK_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_CHALK_BLOCK_KEY),
                commonOrePlacement(
                        2,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(-17),
                                VerticalAnchor.absolute(384)
                        )
                )
        );

        // Chalk coal ore (very common, high Y-levels)
        register(context, CHALK_COAL_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_CHALK_COAL_ORE_KEY),
                commonOrePlacement(
                        30,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(128),
                                VerticalAnchor.top()
                        )
                )
        );

        // Small copper veins
        register(context, CHALK_COPPER_ORE_SMALL_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_CHALK_COPPER_ORE_SMALL_KEY),
                commonOrePlacement(
                        16,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(112)
                        )
                )
        );

        // Large copper veins
        register(context, CHALK_COPPER_ORE_LARGE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_CHALK_COPPER_ORE_LARGE_KEY),
                commonOrePlacement(
                        16,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(112)
                        )
                )
        );

        // Iron ore – upper layer
        register(context, CHALK_IRON_ORE_UPPER_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_CHALK_IRON_ORE_KEY),
                commonOrePlacement(
                        90,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(80),
                                VerticalAnchor.absolute(384)
                        )
                )
        );

        // Iron ore – middle layer
        register(context, CHALK_IRON_ORE_MIDDLE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_CHALK_IRON_ORE_KEY),
                commonOrePlacement(
                        10,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(56)
                        )
                )
        );

        // Iron ore – small veins
        register(context, CHALK_IRON_ORE_SMALL_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_CHALK_IRON_ORE_SMALL_KEY),
                commonOrePlacement(
                        10,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.bottom(),
                                VerticalAnchor.absolute(72)
                        )
                )
        );

        // Gold ore – standard distribution
        register(context, CHALK_GOLD_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_CHALK_GOLD_ORE_KEY),
                commonOrePlacement(
                        4,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(32)
                        )
                )
        );

        // Gold ore – extra distribution (badlands-like, higher Y-levels)
        register(context, CHALK_GOLD_ORE_EXTRA_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_CHALK_GOLD_ORE_EXTRA_KEY),
                commonOrePlacement(
                        50,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(32),
                                VerticalAnchor.absolute(256)
                        )
                )
        );

        // Redstone ore – standard distribution
        register(context, CHALK_REDSTONE_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_CHALK_REDSTONE_ORE_KEY),
                commonOrePlacement(
                        4,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.bottom(),
                                VerticalAnchor.absolute(15)
                        )
                )
        );

        // Redstone ore – deep distribution
        register(context, CHALK_REDSTONE_ORE_LOWER_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_CHALK_GOLD_ORE_EXTRA_KEY),
                commonOrePlacement(
                        8,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.aboveBottom(-16),
                                VerticalAnchor.aboveBottom(32)
                        )
                )
        );

        // Lapis ore
        register(context, CHALK_LAPIS_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(UBCConfiguredFeatures.OVERWORLD_CHALK_LAPIS_ORE_KEY),
                commonOrePlacement(
                        2,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-16),
                                VerticalAnchor.absolute(32)
                        )
                )
        );

    }

    /**
     * Creates a ResourceKey for a PlacedFeature
     */
    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(
                Registries.PLACED_FEATURE,
                ResourceLocation.fromNamespaceAndPath(
                        UndergroundBiomesConstructsReworked.MODID,
                        name
                )
        );

    }

    /**
     * Registers a PlacedFeature with its configuration and placement modifiers
     */
    private static void register(
            BootstrapContext<PlacedFeature> context,
            ResourceKey<PlacedFeature> key,
            Holder<ConfiguredFeature<?, ?>> configuration,
            List<PlacementModifier> modifiers
    ) {
        context.register(
                key,
                new PlacedFeature(configuration, List.copyOf(modifiers))
        );
    }
}