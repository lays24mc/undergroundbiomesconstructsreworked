package com.lays24mc.undergroundbiomesconstructsreworked.worldgen;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class UBCBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_SOAPSTONE_BLOCK = registerKey("add_soapstone_block");
    public static final ResourceKey<BiomeModifier> ADD_SOAPSTONE_COAL_ORE = registerKey("add_soapstone_coal_ore");
    public static final ResourceKey<BiomeModifier> ADD_SOAPSTONE_COPPER_SMALL_ORE = registerKey("add_soapstone_copper_small_ore");
    public static final ResourceKey<BiomeModifier> ADD_SOAPSTONE_COPPER_ORE_LARGE = registerKey("add_soapstone_copper_ore_large");
    public static final ResourceKey<BiomeModifier> ADD_SOAPSTONE_IRON_ORE_UPPER = registerKey("add_soapstone_iron_ore_upper");
    public static final ResourceKey<BiomeModifier> ADD_SOAPSTONE_IRON_ORE_MIDDLE = registerKey("add_soapstone_iron_ore_middle");
    public static final ResourceKey<BiomeModifier> ADD_SOAPSTONE_IRON_ORE_SMALL = registerKey("add_soapstone_iron_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_SOAPSTONE_GOLD_ORE = registerKey("add_soapstone_gold_ore");
    public static final ResourceKey<BiomeModifier> ADD_SOAPSTONE_GOLD_ORE_EXTRA = registerKey("add_soapstone_gold_ore_extra");
    public static final ResourceKey<BiomeModifier> ADD_SOAPSTONE_REDSTONE_ORE = registerKey("add_soapstone_redstone_ore");
    public static final ResourceKey<BiomeModifier> ADD_SOAPSTONE_REDSTONE_ORE_LOWER = registerKey("add_soapstone_redstone_ore_lower");
    public static final ResourceKey<BiomeModifier> ADD_SOAPSTONE_LAPIS_ORE = registerKey("add_soapstone_lapis_ore");

    public static final ResourceKey<BiomeModifier> ADD_RHYOLITE_BLOCK = registerKey("add_rhyolite_block");
    public static final ResourceKey<BiomeModifier> ADD_RHYOLITE_COAL_ORE = registerKey("add_rhyolite_coal_ore");
    public static final ResourceKey<BiomeModifier> ADD_RHYOLITE_COPPER_SMALL_ORE = registerKey("add_rhyolite_copper_small_ore");
    public static final ResourceKey<BiomeModifier> ADD_RHYOLITE_COPPER_ORE_LARGE = registerKey("add_rhyolite_copper_ore_large");
    public static final ResourceKey<BiomeModifier> ADD_RHYOLITE_IRON_ORE_UPPER = registerKey("add_rhyolite_iron_ore_upper");
    public static final ResourceKey<BiomeModifier> ADD_RHYOLITE_IRON_ORE_MIDDLE = registerKey("add_rhyolite_iron_ore_middle");
    public static final ResourceKey<BiomeModifier> ADD_RHYOLITE_IRON_ORE_SMALL = registerKey("add_rhyolite_iron_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_RHYOLITE_GOLD_ORE = registerKey("add_rhyolite_gold_ore");
    public static final ResourceKey<BiomeModifier> ADD_RHYOLITE_GOLD_ORE_EXTRA = registerKey("add_rhyolite_gold_ore_extra");
    public static final ResourceKey<BiomeModifier> ADD_RHYOLITE_REDSTONE_ORE = registerKey("add_rhyolite_redstone_ore");
    public static final ResourceKey<BiomeModifier> ADD_RHYOLITE_REDSTONE_ORE_LOWER = registerKey("add_rhyolite_redstone_ore_lower");
    public static final ResourceKey<BiomeModifier> ADD_RHYOLITE_LAPIS_ORE = registerKey("add_rhyolite_lapis_ore");

    public static final ResourceKey<BiomeModifier> ADD_RED_GRANITE_BLOCK = registerKey("add_red_granite_block");
    public static final ResourceKey<BiomeModifier> ADD_RED_GRANITE_IRON_ORE_MIDDLE = registerKey("add_red_granite_iron_ore_middle");
    public static final ResourceKey<BiomeModifier> ADD_RED_GRANITE_IRON_ORE_SMALL = registerKey("add_red_granite_iron_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_RED_GRANITE_GOLD_ORE = registerKey("add_red_granite_gold_ore");
    public static final ResourceKey<BiomeModifier> ADD_RED_GRANITE_GOLD_ORE_LOWER = registerKey("add_red_granite_gold_ore_lower");
    public static final ResourceKey<BiomeModifier> ADD_RED_GRANITE_REDSTONE_ORE_LOWER = registerKey("add_red_granite_redstone_ore_lower");
    public static final ResourceKey<BiomeModifier> ADD_RED_GRANITE_LAPIS_ORE = registerKey("add_red_granite_lapis_ore");
    public static final ResourceKey<BiomeModifier> ADD_RED_GRANITE_DIAMOND_ORE_SMALL = registerKey("add_red_granite_diamond_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_RED_GRANITE_DIAMOND_ORE_LARGE = registerKey("add_red_granite_diamond_ore_large");
    public static final ResourceKey<BiomeModifier> ADD_RED_GRANITE_DIAMOND_ORE_BURIED = registerKey("add_red_granite_diamond_ore_buried");
    public static final ResourceKey<BiomeModifier> ADD_RED_GRANITE_DIAMOND_ORE_MEDIUM = registerKey("add_red_granite_diamond_ore_medium");
    public static final ResourceKey<BiomeModifier> ADD_RED_GRANITE_EMERALD_ORE = registerKey("add_red_granite_emerald_ore");

    public static final ResourceKey<BiomeModifier> ADD_QUARTZITE_BLOCK = registerKey("add_quartzite_block");
    public static final ResourceKey<BiomeModifier> ADD_QUARTZITE_IRON_ORE_MIDDLE = registerKey("add_quartzite_iron_ore_middle");
    public static final ResourceKey<BiomeModifier> ADD_QUARTZITE_IRON_ORE_SMALL = registerKey("add_quartzite_iron_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_QUARTZITE_GOLD_ORE = registerKey("add_quartzite_gold_ore");
    public static final ResourceKey<BiomeModifier> ADD_QUARTZITE_GOLD_ORE_LOWER = registerKey("add_quartzite_gold_ore_lower");
    public static final ResourceKey<BiomeModifier> ADD_QUARTZITE_REDSTONE_ORE_LOWER = registerKey("add_quartzite_redstone_ore_lower");
    public static final ResourceKey<BiomeModifier> ADD_QUARTZITE_LAPIS_ORE = registerKey("add_quartzite_lapis_ore");
    public static final ResourceKey<BiomeModifier> ADD_QUARTZITE_DIAMOND_ORE_SMALL = registerKey("add_quartzite_diamond_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_QUARTZITE_DIAMOND_ORE_LARGE = registerKey("add_quartzite_diamond_ore_large");
    public static final ResourceKey<BiomeModifier> ADD_QUARTZITE_DIAMOND_ORE_BURIED = registerKey("add_quartzite_diamond_ore_buried");
    public static final ResourceKey<BiomeModifier> ADD_QUARTZITE_DIAMOND_ORE_MEDIUM = registerKey("add_quartzite_diamond_ore_medium");
    public static final ResourceKey<BiomeModifier> ADD_QUARTZITE_EMERALD_ORE = registerKey("add_quartzite_emerald_ore");

    public static final ResourceKey<BiomeModifier> ADD_MIGMATITE_BLOCK = registerKey("add_migmatite_block");
    public static final ResourceKey<BiomeModifier> ADD_MIGMATITE_IRON_ORE_MIDDLE = registerKey("add_migmatite_iron_ore_middle");
    public static final ResourceKey<BiomeModifier> ADD_MIGMATITE_IRON_ORE_SMALL = registerKey("add_migmatite_iron_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_MIGMATITE_GOLD_ORE = registerKey("add_migmatite_gold_ore");
    public static final ResourceKey<BiomeModifier> ADD_MIGMATITE_GOLD_ORE_LOWER = registerKey("add_migmatite_gold_ore_lower");
    public static final ResourceKey<BiomeModifier> ADD_MIGMATITE_REDSTONE_ORE_LOWER = registerKey("add_migmatite_redstone_ore_lower");
    public static final ResourceKey<BiomeModifier> ADD_MIGMATITE_LAPIS_ORE = registerKey("add_migmatite_lapis_ore");
    public static final ResourceKey<BiomeModifier> ADD_MIGMATITE_DIAMOND_ORE_SMALL = registerKey("add_migmatite_diamond_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_MIGMATITE_DIAMOND_ORE_LARGE = registerKey("add_migmatite_diamond_ore_large");
    public static final ResourceKey<BiomeModifier> ADD_MIGMATITE_DIAMOND_ORE_BURIED = registerKey("add_migmatite_diamond_ore_buried");
    public static final ResourceKey<BiomeModifier> ADD_MIGMATITE_DIAMOND_ORE_MEDIUM = registerKey("add_migmatite_diamond_ore_medium");
    public static final ResourceKey<BiomeModifier> ADD_MIGMATITE_EMERALD_ORE = registerKey("add_migmatite_emerald_ore");

    public static final ResourceKey<BiomeModifier> ADD_MARBLE_BLOCK = registerKey("add_marble_block");
    public static final ResourceKey<BiomeModifier> ADD_MARBLE_IRON_ORE_MIDDLE = registerKey("add_marble_iron_ore_middle");
    public static final ResourceKey<BiomeModifier> ADD_MARBLE_IRON_ORE_SMALL = registerKey("add_marble_iron_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_MARBLE_GOLD_ORE = registerKey("add_marble_gold_ore");
    public static final ResourceKey<BiomeModifier> ADD_MARBLE_GOLD_ORE_LOWER = registerKey("add_marble_gold_ore_lower");
    public static final ResourceKey<BiomeModifier> ADD_MARBLE_REDSTONE_ORE_LOWER = registerKey("add_marble_redstone_ore_lower");
    public static final ResourceKey<BiomeModifier> ADD_MARBLE_LAPIS_ORE = registerKey("add_marble_lapis_ore");
    public static final ResourceKey<BiomeModifier> ADD_MARBLE_DIAMOND_ORE_SMALL = registerKey("add_marble_diamond_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_MARBLE_DIAMOND_ORE_LARGE = registerKey("add_marble_diamond_ore_large");
    public static final ResourceKey<BiomeModifier> ADD_MARBLE_DIAMOND_ORE_BURIED = registerKey("add_marble_diamond_ore_buried");
    public static final ResourceKey<BiomeModifier> ADD_MARBLE_DIAMOND_ORE_MEDIUM = registerKey("add_marble_diamond_ore_medium");
    public static final ResourceKey<BiomeModifier> ADD_MARBLE_EMERALD_ORE = registerKey("add_marble_emerald_ore");

    public static final ResourceKey<BiomeModifier> ADD_LIMESTONE_BLOCK = registerKey("add_limestone_block");
    public static final ResourceKey<BiomeModifier> ADD_LIMESTONE_COAL_ORE = registerKey("add_limestone_coal_ore");
    public static final ResourceKey<BiomeModifier> ADD_LIMESTONE_COPPER_SMALL_ORE = registerKey("add_limestone_copper_small_ore");
    public static final ResourceKey<BiomeModifier> ADD_LIMESTONE_COPPER_ORE_LARGE = registerKey("add_limestone_copper_ore_large");
    public static final ResourceKey<BiomeModifier> ADD_LIMESTONE_IRON_ORE_UPPER = registerKey("add_limestone_iron_ore_upper");
    public static final ResourceKey<BiomeModifier> ADD_LIMESTONE_IRON_ORE_MIDDLE = registerKey("add_limestone_iron_ore_middle");
    public static final ResourceKey<BiomeModifier> ADD_LIMESTONE_IRON_ORE_SMALL = registerKey("add_limestone_iron_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_LIMESTONE_GOLD_ORE = registerKey("add_limestone_gold_ore");
    public static final ResourceKey<BiomeModifier> ADD_LIMESTONE_GOLD_ORE_EXTRA = registerKey("add_limestone_gold_ore_extra");
    public static final ResourceKey<BiomeModifier> ADD_LIMESTONE_REDSTONE_ORE = registerKey("add_limestone_redstone_ore");
    public static final ResourceKey<BiomeModifier> ADD_LIMESTONE_REDSTONE_ORE_LOWER = registerKey("add_limestone_redstone_ore_lower");
    public static final ResourceKey<BiomeModifier> ADD_LIMESTONE_LAPIS_ORE = registerKey("add_limestone_lapis_ore");

    public static final ResourceKey<BiomeModifier> ADD_SILTSTONE_BLOCK = registerKey("add_siltstone_block");
    public static final ResourceKey<BiomeModifier> ADD_SILTSTONE_COAL_ORE = registerKey("add_siltstone_coal_ore");
    public static final ResourceKey<BiomeModifier> ADD_SILTSTONE_COPPER_SMALL_ORE = registerKey("add_siltstone_copper_small_ore");
    public static final ResourceKey<BiomeModifier> ADD_SILTSTONE_COPPER_ORE_LARGE = registerKey("add_siltstone_copper_ore_large");
    public static final ResourceKey<BiomeModifier> ADD_SILTSTONE_IRON_ORE_UPPER = registerKey("add_siltstone_iron_ore_upper");
    public static final ResourceKey<BiomeModifier> ADD_SILTSTONE_IRON_ORE_MIDDLE = registerKey("add_siltstone_iron_ore_middle");
    public static final ResourceKey<BiomeModifier> ADD_SILTSTONE_IRON_ORE_SMALL = registerKey("add_siltstone_iron_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_SILTSTONE_GOLD_ORE = registerKey("add_siltstone_gold_ore");
    public static final ResourceKey<BiomeModifier> ADD_SILTSTONE_GOLD_ORE_EXTRA = registerKey("add_siltstone_gold_ore_extra");
    public static final ResourceKey<BiomeModifier> ADD_SILTSTONE_REDSTONE_ORE = registerKey("add_siltstone_redstone_ore");
    public static final ResourceKey<BiomeModifier> ADD_SILTSTONE_REDSTONE_ORE_LOWER = registerKey("add_siltstone_redstone_ore_lower");
    public static final ResourceKey<BiomeModifier> ADD_SILTSTONE_LAPIS_ORE = registerKey("add_siltstone_lapis_ore");

    public static final ResourceKey<BiomeModifier> ADD_BLUECHIST_BLOCK = registerKey("add_bluechist_block");
    public static final ResourceKey<BiomeModifier> ADD_BLUECHIST_COAL_ORE = registerKey("add_bluechist_coal_ore");
    public static final ResourceKey<BiomeModifier> ADD_BLUECHIST_COPPER_SMALL_ORE = registerKey("add_bluechist_copper_small_ore");
    public static final ResourceKey<BiomeModifier> ADD_BLUECHIST_COPPER_ORE_LARGE = registerKey("add_bluechist_copper_ore_large");
    public static final ResourceKey<BiomeModifier> ADD_BLUECHIST_IRON_ORE_UPPER = registerKey("add_bluechist_iron_ore_upper");
    public static final ResourceKey<BiomeModifier> ADD_BLUECHIST_IRON_ORE_MIDDLE = registerKey("add_bluechist_iron_ore_middle");
    public static final ResourceKey<BiomeModifier> ADD_BLUECHIST_IRON_ORE_SMALL = registerKey("add_bluechist_iron_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_BLUECHIST_GOLD_ORE = registerKey("add_bluechist_gold_ore");
    public static final ResourceKey<BiomeModifier> ADD_BLUECHIST_GOLD_ORE_EXTRA = registerKey("add_bluechist_gold_ore_extra");
    public static final ResourceKey<BiomeModifier> ADD_BLUECHIST_REDSTONE_ORE = registerKey("add_bluechist_redstone_ore");
    public static final ResourceKey<BiomeModifier> ADD_BLUECHIST_REDSTONE_ORE_LOWER = registerKey("add_bluechist_redstone_ore_lower");
    public static final ResourceKey<BiomeModifier> ADD_BLUECHIST_LAPIS_ORE = registerKey("add_bluechist_lapis_ore");

    public static final ResourceKey<BiomeModifier> ADD_GREENSCHIST_BLOCK = registerKey("add_greenschist_block");
    public static final ResourceKey<BiomeModifier> ADD_GREENSCHIST_COAL_ORE = registerKey("add_greenschist_coal_ore");
    public static final ResourceKey<BiomeModifier> ADD_GREENSCHIST_COPPER_SMALL_ORE = registerKey("add_greenschist_copper_small_ore");
    public static final ResourceKey<BiomeModifier> ADD_GREENSCHIST_COPPER_ORE_LARGE = registerKey("add_greenschist_copper_ore_large");
    public static final ResourceKey<BiomeModifier> ADD_GREENSCHIST_IRON_ORE_UPPER = registerKey("add_greenschist_iron_ore_upper");
    public static final ResourceKey<BiomeModifier> ADD_GREENSCHIST_IRON_ORE_MIDDLE = registerKey("add_greenschist_iron_ore_middle");
    public static final ResourceKey<BiomeModifier> ADD_GREENSCHIST_IRON_ORE_SMALL = registerKey("add_greenschist_iron_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_GREENSCHIST_GOLD_ORE = registerKey("add_greenschist_gold_ore");
    public static final ResourceKey<BiomeModifier> ADD_GREENSCHIST_GOLD_ORE_EXTRA = registerKey("add_greenschist_gold_ore_extra");
    public static final ResourceKey<BiomeModifier> ADD_GREENSCHIST_REDSTONE_ORE = registerKey("add_greenschist_redstone_ore");
    public static final ResourceKey<BiomeModifier> ADD_GREENSCHIST_REDSTONE_ORE_LOWER = registerKey("add_greenschist_redstone_ore_lower");
    public static final ResourceKey<BiomeModifier> ADD_GREENSCHIST_LAPIS_ORE = registerKey("add_greenschist_lapis_ore");

    public static final ResourceKey<BiomeModifier> ADD_CHALK_BLOCK = registerKey("add_chalk_block");
    public static final ResourceKey<BiomeModifier> ADD_CHALK_COAL_ORE = registerKey("add_chalk_coal_ore");
    public static final ResourceKey<BiomeModifier> ADD_CHALK_COPPER_SMALL_ORE = registerKey("add_chalk_copper_small_ore");
    public static final ResourceKey<BiomeModifier> ADD_CHALK_COPPER_ORE_LARGE = registerKey("add_chalk_copper_ore_large");
    public static final ResourceKey<BiomeModifier> ADD_CHALK_IRON_ORE_UPPER = registerKey("add_chalk_iron_ore_upper");
    public static final ResourceKey<BiomeModifier> ADD_CHALK_IRON_ORE_MIDDLE = registerKey("add_chalk_iron_ore_middle");
    public static final ResourceKey<BiomeModifier> ADD_CHALK_IRON_ORE_SMALL = registerKey("add_chalk_iron_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_CHALK_GOLD_ORE = registerKey("add_chalk_gold_ore");
    public static final ResourceKey<BiomeModifier> ADD_CHALK_GOLD_ORE_EXTRA = registerKey("add_chalk_gold_ore_extra");
    public static final ResourceKey<BiomeModifier> ADD_CHALK_REDSTONE_ORE = registerKey("add_chalk_redstone_ore");
    public static final ResourceKey<BiomeModifier> ADD_CHALK_REDSTONE_ORE_LOWER = registerKey("add_chalk_redstone_ore_lower");
    public static final ResourceKey<BiomeModifier> ADD_CHALK_LAPIS_ORE = registerKey("add_chalk_lapis_ore");

    public static final ResourceKey<BiomeModifier> ADD_SHALE_BLOCK = registerKey("add_shale_block");
    public static final ResourceKey<BiomeModifier> ADD_SHALE_COAL_ORE = registerKey("add_shale_coal_ore");
    public static final ResourceKey<BiomeModifier> ADD_SHALE_COPPER_SMALL_ORE = registerKey("add_shale_copper_small_ore");
    public static final ResourceKey<BiomeModifier> ADD_SHALE_COPPER_ORE_LARGE = registerKey("add_shale_copper_ore_large");
    public static final ResourceKey<BiomeModifier> ADD_SHALE_IRON_ORE_UPPER = registerKey("add_shale_iron_ore_upper");
    public static final ResourceKey<BiomeModifier> ADD_SHALE_IRON_ORE_MIDDLE = registerKey("add_shale_iron_ore_middle");
    public static final ResourceKey<BiomeModifier> ADD_SHALE_IRON_ORE_SMALL = registerKey("add_shale_iron_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_SHALE_GOLD_ORE = registerKey("add_shale_gold_ore");
    public static final ResourceKey<BiomeModifier> ADD_SHALE_GOLD_ORE_EXTRA = registerKey("add_shale_gold_ore_extra");
    public static final ResourceKey<BiomeModifier> ADD_SHALE_REDSTONE_ORE = registerKey("add_shale_redstone_ore");
    public static final ResourceKey<BiomeModifier> ADD_SHALE_REDSTONE_ORE_LOWER = registerKey("add_shale_redstone_ore_lower");
    public static final ResourceKey<BiomeModifier> ADD_SHALE_LAPIS_ORE = registerKey("add_shale_lapis_ore");

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        // CF -> PF -> BM
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        // Example for individual Biomes!
        // context.register(ADD_BISMUTH_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
        //         HolderSet.direct(biomes.getOrThrow(Biomes.PLAINS), biomes.getOrThrow(Biomes.SAVANNA)),
        //         HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.BISMUTH_ORE_PLACED_KEY)),
        //         GenerationStep.Decoration.UNDERGROUND_ORES));

        //vegetation
        //context.register(ADD_SOAPSTONE_MOSSY_COBBLE, new BiomeModifiers.AddFeaturesBiomeModifier(
        //        HolderSet.direct(biomes.getOrThrow(Biomes.PLAINS), biomes.getOrThrow(Biomes.BIRCH_FOREST), biomes.getOrThrow(Biomes.FOREST), biomes.getOrThrow(Biomes.MEADOW)),
        //        HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.SOAPSTONE_MOSSY_COBBLE_PLACED_KEY)),
        //        GenerationStep.Decoration.VEGETAL_DECORATION));

        //soapstone
        context.register(ADD_SOAPSTONE_BLOCK, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SOAPSTONE_BLOCK_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SOAPSTONE_COAL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SOAPSTONE_COAL_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SOAPSTONE_COPPER_SMALL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SOAPSTONE_COPPER_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SOAPSTONE_COPPER_ORE_LARGE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SOAPSTONE_COPPER_ORE_LARGE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SOAPSTONE_IRON_ORE_UPPER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SOAPSTONE_IRON_ORE_UPPER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SOAPSTONE_IRON_ORE_MIDDLE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SOAPSTONE_IRON_ORE_MIDDLE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SOAPSTONE_IRON_ORE_SMALL, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SOAPSTONE_IRON_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SOAPSTONE_GOLD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SOAPSTONE_GOLD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SOAPSTONE_GOLD_ORE_EXTRA, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SOAPSTONE_GOLD_ORE_EXTRA_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SOAPSTONE_REDSTONE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SOAPSTONE_REDSTONE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SOAPSTONE_REDSTONE_ORE_LOWER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SOAPSTONE_REDSTONE_ORE_LOWER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SOAPSTONE_LAPIS_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SOAPSTONE_LAPIS_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //rhyolite
        context.register(ADD_RHYOLITE_BLOCK, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.RHYOLITE_BLOCK_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));

        context.register(ADD_RHYOLITE_COAL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.RHYOLITE_COAL_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_RHYOLITE_COPPER_SMALL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.RHYOLITE_COPPER_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_RHYOLITE_COPPER_ORE_LARGE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.RHYOLITE_COPPER_ORE_LARGE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_RHYOLITE_IRON_ORE_UPPER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.RHYOLITE_IRON_ORE_UPPER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_RHYOLITE_IRON_ORE_MIDDLE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.RHYOLITE_IRON_ORE_MIDDLE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_RHYOLITE_IRON_ORE_SMALL, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.RHYOLITE_IRON_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_RHYOLITE_GOLD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.RHYOLITE_GOLD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_RHYOLITE_GOLD_ORE_EXTRA, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.RHYOLITE_GOLD_ORE_EXTRA_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_RHYOLITE_REDSTONE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.RHYOLITE_REDSTONE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_RHYOLITE_REDSTONE_ORE_LOWER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.RHYOLITE_REDSTONE_ORE_LOWER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_RHYOLITE_LAPIS_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.RHYOLITE_LAPIS_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //red granite
        context.register(ADD_RED_GRANITE_BLOCK, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.RED_GRANITE_BLOCK_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_RED_GRANITE_IRON_ORE_MIDDLE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.RED_GRANITE_IRON_ORE_MIDDLE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_RED_GRANITE_IRON_ORE_SMALL, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.RED_GRANITE_IRON_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_RED_GRANITE_GOLD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.RED_GRANITE_GOLD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_RED_GRANITE_GOLD_ORE_LOWER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.RED_GRANITE_GOLD_ORE_LOWER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_RED_GRANITE_REDSTONE_ORE_LOWER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.RED_GRANITE_REDSTONE_ORE_LOWER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_RED_GRANITE_LAPIS_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.RED_GRANITE_LAPIS_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_RED_GRANITE_DIAMOND_ORE_SMALL, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.RED_GRANITE_DIAMOND_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_RED_GRANITE_DIAMOND_ORE_LARGE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.RED_GRANITE_DIAMOND_ORE_LARGE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_RED_GRANITE_DIAMOND_ORE_BURIED, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.RED_GRANITE_DIAMOND_ORE_BURIED_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_RED_GRANITE_DIAMOND_ORE_MEDIUM, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.RED_GRANITE_DIAMOND_ORE_MEDIUM_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_RED_GRANITE_EMERALD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.RED_GRANITE_EMERALD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //quartzite
        context.register(ADD_QUARTZITE_BLOCK, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.QUARTZITE_BLOCK_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_QUARTZITE_IRON_ORE_MIDDLE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.QUARTZITE_IRON_ORE_MIDDLE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_QUARTZITE_IRON_ORE_SMALL, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.QUARTZITE_IRON_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_QUARTZITE_GOLD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.QUARTZITE_GOLD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_QUARTZITE_GOLD_ORE_LOWER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.QUARTZITE_GOLD_ORE_LOWER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_QUARTZITE_REDSTONE_ORE_LOWER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.QUARTZITE_REDSTONE_ORE_LOWER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_QUARTZITE_LAPIS_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.QUARTZITE_LAPIS_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_QUARTZITE_DIAMOND_ORE_SMALL, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.QUARTZITE_DIAMOND_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_QUARTZITE_DIAMOND_ORE_LARGE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.QUARTZITE_DIAMOND_ORE_LARGE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_QUARTZITE_DIAMOND_ORE_BURIED, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.QUARTZITE_DIAMOND_ORE_BURIED_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_QUARTZITE_DIAMOND_ORE_MEDIUM, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.QUARTZITE_DIAMOND_ORE_MEDIUM_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_QUARTZITE_EMERALD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.QUARTZITE_EMERALD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //migmatite
        context.register(ADD_MIGMATITE_BLOCK, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.MIGMATITE_BLOCK_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_MIGMATITE_IRON_ORE_MIDDLE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.MIGMATITE_IRON_ORE_MIDDLE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_MIGMATITE_IRON_ORE_SMALL, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.MIGMATITE_IRON_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_MIGMATITE_GOLD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.MIGMATITE_GOLD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_MIGMATITE_GOLD_ORE_LOWER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.MIGMATITE_GOLD_ORE_LOWER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_MIGMATITE_REDSTONE_ORE_LOWER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.MIGMATITE_REDSTONE_ORE_LOWER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_MIGMATITE_LAPIS_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.MIGMATITE_LAPIS_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_MIGMATITE_DIAMOND_ORE_SMALL, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.MIGMATITE_DIAMOND_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_MIGMATITE_DIAMOND_ORE_LARGE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.MIGMATITE_DIAMOND_ORE_LARGE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_MIGMATITE_DIAMOND_ORE_BURIED, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.MIGMATITE_DIAMOND_ORE_BURIED_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_MIGMATITE_DIAMOND_ORE_MEDIUM, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.MIGMATITE_DIAMOND_ORE_MEDIUM_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_MIGMATITE_EMERALD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.MIGMATITE_EMERALD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //marble
        context.register(ADD_MARBLE_BLOCK, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.MARBLE_BLOCK_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_MARBLE_IRON_ORE_MIDDLE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.MARBLE_IRON_ORE_MIDDLE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_MARBLE_IRON_ORE_SMALL, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.MARBLE_IRON_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_MARBLE_GOLD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.MARBLE_GOLD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_MARBLE_GOLD_ORE_LOWER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.MARBLE_GOLD_ORE_LOWER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_MARBLE_REDSTONE_ORE_LOWER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.MARBLE_REDSTONE_ORE_LOWER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_MARBLE_LAPIS_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.MARBLE_LAPIS_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_MARBLE_DIAMOND_ORE_SMALL, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.MARBLE_DIAMOND_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_MARBLE_DIAMOND_ORE_LARGE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.MARBLE_DIAMOND_ORE_LARGE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_MARBLE_DIAMOND_ORE_BURIED, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.MARBLE_DIAMOND_ORE_BURIED_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_MARBLE_DIAMOND_ORE_MEDIUM, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.MARBLE_DIAMOND_ORE_MEDIUM_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_MARBLE_EMERALD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.MARBLE_EMERALD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //limestone
        context.register(ADD_LIMESTONE_BLOCK, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.LIMESTONE_BLOCK_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_LIMESTONE_COAL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.LIMESTONE_COAL_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_LIMESTONE_COPPER_SMALL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.LIMESTONE_COPPER_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_LIMESTONE_COPPER_ORE_LARGE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.LIMESTONE_COPPER_ORE_LARGE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_LIMESTONE_IRON_ORE_UPPER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.LIMESTONE_IRON_ORE_UPPER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_LIMESTONE_IRON_ORE_MIDDLE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.LIMESTONE_IRON_ORE_MIDDLE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_LIMESTONE_IRON_ORE_SMALL, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.LIMESTONE_IRON_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_LIMESTONE_GOLD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.LIMESTONE_GOLD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_LIMESTONE_GOLD_ORE_EXTRA, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.LIMESTONE_GOLD_ORE_EXTRA_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_LIMESTONE_REDSTONE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.LIMESTONE_REDSTONE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_LIMESTONE_REDSTONE_ORE_LOWER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.LIMESTONE_REDSTONE_ORE_LOWER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_LIMESTONE_LAPIS_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.LIMESTONE_LAPIS_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //siltstone
        context.register(ADD_SILTSTONE_BLOCK, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SILTSTONE_BLOCK_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SILTSTONE_COAL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SILTSTONE_COAL_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SILTSTONE_COPPER_SMALL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SILTSTONE_COPPER_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SILTSTONE_COPPER_ORE_LARGE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SILTSTONE_COPPER_ORE_LARGE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SILTSTONE_IRON_ORE_UPPER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SILTSTONE_IRON_ORE_UPPER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SILTSTONE_IRON_ORE_MIDDLE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SILTSTONE_IRON_ORE_MIDDLE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SILTSTONE_IRON_ORE_SMALL, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SILTSTONE_IRON_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SILTSTONE_GOLD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SILTSTONE_GOLD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SILTSTONE_GOLD_ORE_EXTRA, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SILTSTONE_GOLD_ORE_EXTRA_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SILTSTONE_REDSTONE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SILTSTONE_REDSTONE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SILTSTONE_REDSTONE_ORE_LOWER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SILTSTONE_REDSTONE_ORE_LOWER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SILTSTONE_LAPIS_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SILTSTONE_LAPIS_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //bluechist
        context.register(ADD_BLUECHIST_BLOCK, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.BLUECHIST_BLOCK_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLUECHIST_COAL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.BLUECHIST_COAL_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLUECHIST_COPPER_SMALL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.BLUECHIST_COPPER_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLUECHIST_COPPER_ORE_LARGE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.BLUECHIST_COPPER_ORE_LARGE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLUECHIST_IRON_ORE_UPPER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.BLUECHIST_IRON_ORE_UPPER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLUECHIST_IRON_ORE_MIDDLE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.BLUECHIST_IRON_ORE_MIDDLE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLUECHIST_IRON_ORE_SMALL, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.BLUECHIST_IRON_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLUECHIST_GOLD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.BLUECHIST_GOLD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLUECHIST_GOLD_ORE_EXTRA, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.BLUECHIST_GOLD_ORE_EXTRA_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLUECHIST_REDSTONE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.BLUECHIST_REDSTONE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLUECHIST_REDSTONE_ORE_LOWER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.BLUECHIST_REDSTONE_ORE_LOWER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLUECHIST_LAPIS_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.BLUECHIST_LAPIS_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //greenschist
        context.register(ADD_GREENSCHIST_BLOCK, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GREENSCHIST_BLOCK_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GREENSCHIST_COAL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GREENSCHIST_COAL_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GREENSCHIST_COPPER_SMALL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GREENSCHIST_COPPER_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GREENSCHIST_COPPER_ORE_LARGE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GREENSCHIST_COPPER_ORE_LARGE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GREENSCHIST_IRON_ORE_UPPER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GREENSCHIST_IRON_ORE_UPPER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GREENSCHIST_IRON_ORE_MIDDLE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GREENSCHIST_IRON_ORE_MIDDLE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GREENSCHIST_IRON_ORE_SMALL, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GREENSCHIST_IRON_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GREENSCHIST_GOLD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GREENSCHIST_GOLD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GREENSCHIST_GOLD_ORE_EXTRA, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GREENSCHIST_GOLD_ORE_EXTRA_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GREENSCHIST_REDSTONE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GREENSCHIST_REDSTONE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GREENSCHIST_REDSTONE_ORE_LOWER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GREENSCHIST_REDSTONE_ORE_LOWER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GREENSCHIST_LAPIS_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GREENSCHIST_LAPIS_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //chalk
        context.register(ADD_CHALK_BLOCK, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.CHALK_BLOCK_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_CHALK_COAL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.CHALK_COAL_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_CHALK_COPPER_SMALL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.CHALK_COPPER_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_CHALK_COPPER_ORE_LARGE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.CHALK_COPPER_ORE_LARGE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_CHALK_IRON_ORE_UPPER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.CHALK_IRON_ORE_UPPER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_CHALK_IRON_ORE_MIDDLE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.CHALK_IRON_ORE_MIDDLE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_CHALK_IRON_ORE_SMALL, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.CHALK_IRON_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_CHALK_GOLD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.CHALK_GOLD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_CHALK_GOLD_ORE_EXTRA, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.CHALK_GOLD_ORE_EXTRA_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_CHALK_REDSTONE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.CHALK_REDSTONE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_CHALK_REDSTONE_ORE_LOWER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.CHALK_REDSTONE_ORE_LOWER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_CHALK_LAPIS_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.CHALK_LAPIS_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //shale
        context.register(ADD_SHALE_BLOCK, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SHALE_BLOCK_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SHALE_COAL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SHALE_COAL_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SHALE_COPPER_SMALL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SHALE_COPPER_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SHALE_COPPER_ORE_LARGE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SHALE_COPPER_ORE_LARGE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SHALE_IRON_ORE_UPPER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SHALE_IRON_ORE_UPPER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SHALE_IRON_ORE_MIDDLE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SHALE_IRON_ORE_MIDDLE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SHALE_IRON_ORE_SMALL, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SHALE_IRON_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SHALE_GOLD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SHALE_GOLD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SHALE_GOLD_ORE_EXTRA, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SHALE_GOLD_ORE_EXTRA_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SHALE_REDSTONE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SHALE_REDSTONE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SHALE_REDSTONE_ORE_LOWER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SHALE_REDSTONE_ORE_LOWER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SHALE_LAPIS_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SHALE_LAPIS_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

    }


    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(UndergroundBiomesConstructsReworked.MODID, name));
    }
}
