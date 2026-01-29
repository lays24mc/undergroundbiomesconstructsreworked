package com.lays24mc.undergroundbiomesconstructsreworked.worldgen;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.sql.ResultSet;
import java.util.List;

public class UBCConfiguredFeatures {
    // CF -> PF -> BM

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SOAPSTONE_BLOCK_KEY = registerKey("soapstone_block");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SOAPSTONE_COAL_ORE_KEY = registerKey("soapstone_coal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SOAPSTONE_COPPER_ORE_SMALL_KEY = registerKey("soapstone_copper_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SOAPSTONE_COPPER_ORE_LARGE_KEY = registerKey("soapstone_copper_ore_large");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SOAPSTONE_IRON_ORE_KEY = registerKey("soapstone_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SOAPSTONE_IRON_ORE_SMALL_KEY = registerKey("soapstone_iron_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SOAPSTONE_GOLD_ORE_KEY = registerKey("soapstone_gold_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SOAPSTONE_GOLD_ORE_EXTRA_KEY = registerKey("soapstone_gold_ore_extra");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SOAPSTONE_REDSTONE_ORE_KEY = registerKey("soapstone_redstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SOAPSTONE_REDSTONE_ORE_LOWER_KEY = registerKey("soapstone_redstone_ore_lower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SOAPSTONE_LAPIS_ORE_KEY = registerKey("soapstone_lapis_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RHYOLITE_BLOCK_KEY = registerKey("rhyolite_block");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RHYOLITE_COAL_ORE_KEY = registerKey("rhyolite_coal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RHYOLITE_COPPER_ORE_SMALL_KEY = registerKey("rhyolite_copper_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RHYOLITE_COPPER_ORE_LARGE_KEY = registerKey("rhyolite_copper_ore_large");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RHYOLITE_IRON_ORE_KEY = registerKey("rhyolite_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RHYOLITE_IRON_ORE_SMALL_KEY = registerKey("rhyolite_iron_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RHYOLITE_GOLD_ORE_KEY = registerKey("rhyolite_gold_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RHYOLITE_GOLD_ORE_EXTRA_KEY = registerKey("rhyolite_gold_ore_extra");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RHYOLITE_REDSTONE_ORE_KEY = registerKey("rhyolite_redstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RHYOLITE_REDSTONE_ORE_LOWER_KEY = registerKey("rhyolite_redstone_ore_lower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RHYOLITE_LAPIS_ORE_KEY = registerKey("rhyolite_lapis_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RED_GRANITE_BLOCK_KEY = registerKey("red_granite_block");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RED_GRANITE_IRON_ORE_KEY = registerKey("red_granite_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RED_GRANITE_IRON_ORE_SMALL_KEY = registerKey("red_granite_iron_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RED_GRANITE_GOLD_ORE_KEY = registerKey("red_granite_gold_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RED_GRANITE_GOLD_ORE_LOWER_KEY = registerKey("red_granite_gold_ore_lower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RED_GRANITE_REDSTONE_ORE_KEY = registerKey("red_granite_redstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RED_GRANITE_REDSTONE_ORE_LOWER_KEY = registerKey("red_granite_redstone_ore_lower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RED_GRANITE_LAPIS_ORE_KEY = registerKey("red_granite_lapis_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RED_GRANITE_LAPIS_ORE_BURIED_KEY = registerKey("red_granite_lapis_ore_buried");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RED_GRANITE_DIAMOND_ORE_SMALL_KEY = registerKey("red_granite_diamond_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RED_GRANITE_DIAMOND_ORE_LARGE_KEY = registerKey("red_granite_diamond_ore_large");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RED_GRANITE_DIAMOND_ORE_BURIED_KEY = registerKey("red_granite_diamond_ore_buried");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RED_GRANITE_DIAMOND_ORE_MEDIUM_KEY = registerKey("red_granite_diamond_ore_medium");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RED_GRANITE_EMERALD_ORE_KEY = registerKey("red_granite_emerald_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_QUARTZITE_BLOCK_KEY = registerKey("quartzite_block");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_QUARTZITE_IRON_ORE_KEY = registerKey("quartzite_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_QUARTZITE_IRON_ORE_SMALL_KEY = registerKey("quartzite_iron_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_QUARTZITE_GOLD_ORE_KEY = registerKey("quartzite_gold_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_QUARTZITE_GOLD_ORE_LOWER_KEY = registerKey("quartzite_gold_ore_lower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_QUARTZITE_REDSTONE_ORE_KEY = registerKey("quartzite_redstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_QUARTZITE_REDSTONE_ORE_LOWER_KEY = registerKey("quartzite_redstone_ore_lower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_QUARTZITE_LAPIS_ORE_KEY = registerKey("quartzite_lapis_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_QUARTZITE_LAPIS_ORE_BURIED_KEY = registerKey("quartzite_lapis_ore_buried");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_QUARTZITE_DIAMOND_ORE_SMALL_KEY = registerKey("quartzite_diamond_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_QUARTZITE_DIAMOND_ORE_LARGE_KEY = registerKey("quartzite_diamond_ore_large");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_QUARTZITE_DIAMOND_ORE_BURIED_KEY = registerKey("quartzite_diamond_ore_buried");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_QUARTZITE_DIAMOND_ORE_MEDIUM_KEY = registerKey("quartzite_diamond_ore_medium");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_QUARTZITE_EMERALD_ORE_KEY = registerKey("quartzite_emerald_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MIGMATITE_BLOCK_KEY = registerKey("migmatite_block");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MIGMATITE_IRON_ORE_KEY = registerKey("migmatite_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MIGMATITE_IRON_ORE_SMALL_KEY = registerKey("migmatite_iron_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MIGMATITE_GOLD_ORE_KEY = registerKey("migmatite_gold_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MIGMATITE_GOLD_ORE_LOWER_KEY = registerKey("migmatite_gold_ore_lower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MIGMATITE_REDSTONE_ORE_LOWER_KEY = registerKey("migmatite_redstone_ore_lower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MIGMATITE_REDSTONE_ORE_KEY = registerKey("migmatite_redstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MIGMATITE_LAPIS_ORE_KEY = registerKey("migmatite_lapis_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MIGMATITE_LAPIS_ORE_BURIED_KEY = registerKey("migmatite_lapis_ore_buried");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MIGMATITE_DIAMOND_ORE_SMALL_KEY = registerKey("migmatite_diamond_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MIGMATITE_DIAMOND_ORE_LARGE_KEY = registerKey("migmatite_diamond_ore_large");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MIGMATITE_DIAMOND_ORE_BURIED_KEY = registerKey("migmatite_diamond_ore_buried");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MIGMATITE_DIAMOND_ORE_MEDIUM_KEY = registerKey("migmatite_diamond_ore_medium");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MIGMATITE_EMERALD_ORE_KEY = registerKey("migmatite_emerald_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MARBLE_BLOCK_KEY = registerKey("marble_block");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MARBLE_IRON_ORE_KEY = registerKey("marble_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MARBLE_IRON_ORE_SMALL_KEY = registerKey("marble_iron_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MARBLE_GOLD_ORE_KEY = registerKey("marble_gold_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MARBLE_GOLD_ORE_LOWER_KEY = registerKey("marble_gold_ore_lower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MARBLE_REDSTONE_ORE_LOWER_KEY = registerKey("marble_redstone_ore_lower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MARBLE_REDSTONE_ORE_KEY = registerKey("marble_redstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MARBLE_LAPIS_ORE_KEY = registerKey("marble_lapis_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MARBLE_LAPIS_ORE_BURIED_KEY = registerKey("marble_lapis_ore_buried");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MARBLE_DIAMOND_ORE_SMALL_KEY = registerKey("marble_diamond_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MARBLE_DIAMOND_ORE_LARGE_KEY = registerKey("marble_diamond_ore_large");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MARBLE_DIAMOND_ORE_BURIED_KEY = registerKey("marble_diamond_ore_buried");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MARBLE_DIAMOND_ORE_MEDIUM_KEY = registerKey("marble_diamond_ore_medium");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MARBLE_EMERALD_ORE_KEY = registerKey("marble_emerald_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LIMESTONE_BLOCK_KEY = registerKey("limestone_block");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LIMESTONE_COAL_ORE_KEY = registerKey("limestone_coal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LIMESTONE_COPPER_ORE_SMALL_KEY = registerKey("limestone_copper_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LIMESTONE_COPPER_ORE_LARGE_KEY = registerKey("limestone_copper_ore_large");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LIMESTONE_IRON_ORE_KEY = registerKey("limestone_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LIMESTONE_IRON_ORE_SMALL_KEY = registerKey("limestone_iron_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LIMESTONE_GOLD_ORE_KEY = registerKey("limestone_gold_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LIMESTONE_GOLD_ORE_EXTRA_KEY = registerKey("limestone_gold_ore_extra");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LIMESTONE_REDSTONE_ORE_KEY = registerKey("limestone_redstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LIMESTONE_REDSTONE_ORE_LOWER_KEY = registerKey("limestone_redstone_ore_lower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LIMESTONE_LAPIS_ORE_KEY = registerKey("limestone_lapis_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SILTSTONE_BLOCK_KEY = registerKey("siltstone_block");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SILTSTONE_COAL_ORE_KEY = registerKey("siltstone_coal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SILTSTONE_COPPER_ORE_SMALL_KEY = registerKey("siltstone_copper_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SILTSTONE_COPPER_ORE_LARGE_KEY = registerKey("siltstone_copper_ore_large");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SILTSTONE_IRON_ORE_KEY = registerKey("siltstone_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SILTSTONE_IRON_ORE_SMALL_KEY = registerKey("siltstone_iron_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SILTSTONE_GOLD_ORE_KEY = registerKey("siltstone_gold_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SILTSTONE_GOLD_ORE_EXTRA_KEY = registerKey("siltstone_gold_ore_extra");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SILTSTONE_REDSTONE_ORE_KEY = registerKey("siltstone_redstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SILTSTONE_REDSTONE_ORE_LOWER_KEY = registerKey("siltstone_redstone_ore_lower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SILTSTONE_LAPIS_ORE_KEY = registerKey("siltstone_lapis_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BLUESCHIST_BLOCK_KEY = registerKey("blueschist_block");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BLUESCHIST_COAL_ORE_KEY = registerKey("blueschist_coal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BLUESCHIST_COPPER_ORE_SMALL_KEY = registerKey("blueschist_copper_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BLUESCHIST_COPPER_ORE_LARGE_KEY = registerKey("blueschist_copper_ore_large");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BLUESCHIST_IRON_ORE_KEY = registerKey("blueschist_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BLUESCHIST_IRON_ORE_SMALL_KEY = registerKey("blueschist_iron_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BLUESCHIST_GOLD_ORE_KEY = registerKey("blueschist_gold_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BLUESCHIST_GOLD_ORE_EXTRA_KEY = registerKey("blueschist_gold_ore_extra");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BLUESCHIST_REDSTONE_ORE_KEY = registerKey("blueschist_redstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BLUESCHIST_REDSTONE_ORE_LOWER_KEY = registerKey("blueschist_redstone_ore_lower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BLUESCHIST_LAPIS_ORE_KEY = registerKey("blueschist_lapis_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GREENSCHIST_BLOCK_KEY = registerKey("greenschist_block");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GREENSCHIST_COAL_ORE_KEY = registerKey("greenschist_coal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GREENSCHIST_COPPER_ORE_SMALL_KEY = registerKey("greenschist_copper_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GREENSCHIST_COPPER_ORE_LARGE_KEY = registerKey("greenschist_copper_ore_large");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GREENSCHIST_IRON_ORE_KEY = registerKey("greenschist_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GREENSCHIST_IRON_ORE_SMALL_KEY = registerKey("greenschist_iron_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GREENSCHIST_GOLD_ORE_KEY = registerKey("greenschist_gold_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GREENSCHIST_GOLD_ORE_EXTRA_KEY = registerKey("greenschist_gold_ore_extra");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GREENSCHIST_REDSTONE_ORE_KEY = registerKey("greenschist_redstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GREENSCHIST_REDSTONE_ORE_LOWER_KEY = registerKey("greenschist_redstone_ore_lower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GREENSCHIST_LAPIS_ORE_KEY = registerKey("greenschist_lapis_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CHALK_BLOCK_KEY = registerKey("chalk_block");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CHALK_COAL_ORE_KEY = registerKey("chalk_coal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CHALK_COPPER_ORE_SMALL_KEY = registerKey("chalk_copper_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CHALK_COPPER_ORE_LARGE_KEY = registerKey("chalk_copper_ore_large");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CHALK_IRON_ORE_KEY = registerKey("chalk_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CHALK_IRON_ORE_SMALL_KEY = registerKey("chalk_iron_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CHALK_GOLD_ORE_KEY = registerKey("chalk_gold_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CHALK_GOLD_ORE_EXTRA_KEY = registerKey("chalk_gold_ore_extra");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CHALK_REDSTONE_ORE_KEY = registerKey("chalk_redstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CHALK_REDSTONE_ORE_LOWER_KEY = registerKey("chalk_redstone_ore_lower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CHALK_LAPIS_ORE_KEY = registerKey("chalk_lapis_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SHALE_BLOCK_KEY = registerKey("shale_block");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SHALE_COAL_ORE_KEY = registerKey("shale_coal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SHALE_COPPER_ORE_SMALL_KEY = registerKey("shale_copper_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SHALE_COPPER_ORE_LARGE_KEY = registerKey("shale_copper_ore_large");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SHALE_IRON_ORE_KEY = registerKey("shale_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SHALE_IRON_ORE_SMALL_KEY = registerKey("shale_iron_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SHALE_GOLD_ORE_KEY = registerKey("shale_gold_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SHALE_GOLD_ORE_EXTRA_KEY = registerKey("shale_gold_ore_extra");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SHALE_REDSTONE_ORE_KEY = registerKey("shale_redstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SHALE_REDSTONE_ORE_LOWER_KEY = registerKey("shale_redstone_ore_lower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SHALE_LAPIS_ORE_KEY = registerKey("shale_lapis_ore");

    // CHERT
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CHERT_BLOCK_KEY = registerKey("chert_block");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CHERT_COAL_ORE_KEY = registerKey("chert_coal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CHERT_COPPER_ORE_SMALL_KEY = registerKey("chert_copper_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CHERT_COPPER_ORE_LARGE_KEY = registerKey("chert_copper_ore_large");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CHERT_IRON_ORE_KEY = registerKey("chert_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CHERT_IRON_ORE_SMALL_KEY = registerKey("chert_iron_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CHERT_GOLD_ORE_KEY = registerKey("chert_gold_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CHERT_GOLD_ORE_EXTRA_KEY = registerKey("chert_gold_ore_extra");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CHERT_REDSTONE_ORE_KEY = registerKey("chert_redstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CHERT_REDSTONE_ORE_LOWER_KEY = registerKey("chert_redstone_ore_lower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CHERT_LAPIS_ORE_KEY = registerKey("chert_lapis_ore");

    // LIGNITE
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LIGNITE_BLOCK_KEY = registerKey("lignite_block");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LIGNITE_COAL_ORE_KEY = registerKey("lignite_coal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LIGNITE_COPPER_ORE_SMALL_KEY = registerKey("lignite_copper_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LIGNITE_COPPER_ORE_LARGE_KEY = registerKey("lignite_copper_ore_large");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LIGNITE_IRON_ORE_KEY = registerKey("lignite_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LIGNITE_IRON_ORE_SMALL_KEY = registerKey("lignite_iron_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LIGNITE_GOLD_ORE_KEY = registerKey("lignite_gold_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LIGNITE_GOLD_ORE_EXTRA_KEY = registerKey("lignite_gold_ore_extra");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LIGNITE_REDSTONE_ORE_KEY = registerKey("lignite_redstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LIGNITE_REDSTONE_ORE_LOWER_KEY = registerKey("lignite_redstone_ore_lower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LIGNITE_LAPIS_ORE_KEY = registerKey("lignite_lapis_ore");

    // DOLOMIT
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_DOLOMIT_BLOCK_KEY = registerKey("dolomit_block");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_DOLOMIT_COAL_ORE_KEY = registerKey("dolomit_coal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_DOLOMIT_COPPER_ORE_SMALL_KEY = registerKey("dolomit_copper_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_DOLOMIT_COPPER_ORE_LARGE_KEY = registerKey("dolomit_copper_ore_large");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_DOLOMIT_IRON_ORE_KEY = registerKey("dolomit_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_DOLOMIT_IRON_ORE_SMALL_KEY = registerKey("dolomit_iron_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_DOLOMIT_GOLD_ORE_KEY = registerKey("dolomit_gold_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_DOLOMIT_GOLD_ORE_EXTRA_KEY = registerKey("dolomit_gold_ore_extra");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_DOLOMIT_REDSTONE_ORE_KEY = registerKey("dolomit_redstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_DOLOMIT_REDSTONE_ORE_LOWER_KEY = registerKey("dolomit_redstone_ore_lower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_DOLOMIT_LAPIS_ORE_KEY = registerKey("dolomit_lapis_ore");

    // ECLOGITE
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ECLOGITE_BLOCK_KEY = registerKey("eclogite_block");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ECLOGITE_COAL_ORE_KEY = registerKey("eclogite_coal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ECLOGITE_COPPER_ORE_SMALL_KEY = registerKey("eclogite_copper_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ECLOGITE_COPPER_ORE_LARGE_KEY = registerKey("eclogite_copper_ore_large");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ECLOGITE_IRON_ORE_KEY = registerKey("eclogite_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ECLOGITE_IRON_ORE_SMALL_KEY = registerKey("eclogite_iron_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ECLOGITE_GOLD_ORE_KEY = registerKey("eclogite_gold_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ECLOGITE_GOLD_ORE_EXTRA_KEY = registerKey("eclogite_gold_ore_extra");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ECLOGITE_REDSTONE_ORE_KEY = registerKey("eclogite_redstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ECLOGITE_REDSTONE_ORE_LOWER_KEY = registerKey("eclogite_redstone_ore_lower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ECLOGITE_LAPIS_ORE_KEY = registerKey("eclogite_lapis_ore");

    // GREYWACKE
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GREYWACKE_BLOCK_KEY = registerKey("greywacke_block");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GREYWACKE_COAL_ORE_KEY = registerKey("greywacke_coal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GREYWACKE_COPPER_ORE_SMALL_KEY = registerKey("greywacke_copper_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GREYWACKE_COPPER_ORE_LARGE_KEY = registerKey("greywacke_copper_ore_large");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GREYWACKE_IRON_ORE_KEY = registerKey("greywacke_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GREYWACKE_IRON_ORE_SMALL_KEY = registerKey("greywacke_iron_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GREYWACKE_GOLD_ORE_KEY = registerKey("greywacke_gold_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GREYWACKE_GOLD_ORE_EXTRA_KEY = registerKey("greywacke_gold_ore_extra");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GREYWACKE_REDSTONE_ORE_KEY = registerKey("greywacke_redstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GREYWACKE_REDSTONE_ORE_LOWER_KEY = registerKey("greywacke_redstone_ore_lower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GREYWACKE_LAPIS_ORE_KEY = registerKey("greywacke_lapis_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_KOMATIITE_BLOCK_KEY = registerKey("komatiite_block");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_KOMATIITE_COAL_ORE_KEY = registerKey("komatiite_coal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_KOMATIITE_COPPER_ORE_SMALL_KEY = registerKey("komatiite_copper_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_KOMATIITE_COPPER_ORE_LARGE_KEY = registerKey("komatiite_copper_ore_large");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_KOMATIITE_IRON_ORE_KEY = registerKey("komatiite_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_KOMATIITE_IRON_ORE_SMALL_KEY = registerKey("komatiite_iron_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_KOMATIITE_GOLD_ORE_KEY = registerKey("komatiite_gold_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_KOMATIITE_GOLD_ORE_EXTRA_KEY = registerKey("komatiite_gold_ore_extra");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_KOMATIITE_REDSTONE_ORE_KEY = registerKey("komatiite_redstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_KOMATIITE_REDSTONE_ORE_LOWER_KEY = registerKey("komatiite_redstone_ore_lower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_KOMATIITE_LAPIS_ORE_KEY = registerKey("komatiite_lapis_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_DACITE_BLOCK_KEY = registerKey("dacite_block");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_DACITE_COAL_ORE_KEY = registerKey("dacite_coal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_DACITE_COPPER_ORE_SMALL_KEY = registerKey("dacite_copper_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_DACITE_COPPER_ORE_LARGE_KEY = registerKey("dacite_copper_ore_large");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_DACITE_IRON_ORE_KEY = registerKey("dacite_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_DACITE_IRON_ORE_SMALL_KEY = registerKey("dacite_iron_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_DACITE_GOLD_ORE_KEY = registerKey("dacite_gold_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_DACITE_GOLD_ORE_EXTRA_KEY = registerKey("dacite_gold_ore_extra");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_DACITE_REDSTONE_ORE_KEY = registerKey("dacite_redstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_DACITE_REDSTONE_ORE_LOWER_KEY = registerKey("dacite_redstone_ore_lower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_DACITE_LAPIS_ORE_KEY = registerKey("dacite_lapis_ore");



    //public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SOAPSTONE_BLOCK_KEY = registerKey("soapstone_block");
    //public static final ResourceKey<ConfiguredFeature<?, ?>> END_SOAPSTONE_BLOCK_KEY = registerKey("soapstone_block");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context){

        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES); // 0 - -64

        // Take a look always in the OreFeatures Class!

        //Soapstone
        List<OreConfiguration.TargetBlockState> overworldSoapstoneBlock = List.of(
                OreConfiguration.target(stoneReplaceables, SoapstoneBlocks.SOAPSTONE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(new BlockMatchTest(SoapstoneBlocks.SOAPSTONE_BLOCK.get()),
                        SoapstoneBlocks.SOAPSTONE_COAL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> soapstoneCopperTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(SoapstoneBlocks.SOAPSTONE_BLOCK.get()),
                        SoapstoneBlocks.SOAPSTONE_COPPER_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> soapstoneCoalTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(SoapstoneBlocks.SOAPSTONE_BLOCK.get()),
                        SoapstoneBlocks.SOAPSTONE_COAL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> soapstoneIronTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(SoapstoneBlocks.SOAPSTONE_BLOCK.get()),
                        SoapstoneBlocks.SOAPSTONE_IRON_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> soapstoneGoldTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(SoapstoneBlocks.SOAPSTONE_BLOCK.get()),
                        SoapstoneBlocks.SOAPSTONE_GOLD_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> soapstoneRedstoneTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(SoapstoneBlocks.SOAPSTONE_BLOCK.get()),
                        SoapstoneBlocks.SOAPSTONE_REDSTONE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> soapstoneLapisTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(SoapstoneBlocks.SOAPSTONE_BLOCK.get()),
                        SoapstoneBlocks.SOAPSTONE_LAPIS_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_SOAPSTONE_BLOCK_KEY, Feature.ORE, new OreConfiguration(overworldSoapstoneBlock, 64));
        register(context, OVERWORLD_SOAPSTONE_COAL_ORE_KEY, Feature.ORE, new OreConfiguration(soapstoneCoalTargets, 17));
        register(context, OVERWORLD_SOAPSTONE_COPPER_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(soapstoneCopperTargets, 10));
        register(context, OVERWORLD_SOAPSTONE_COPPER_ORE_LARGE_KEY, Feature.ORE, new OreConfiguration(soapstoneCopperTargets, 20));
        register(context, OVERWORLD_SOAPSTONE_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(soapstoneIronTargets, 9));
        register(context, OVERWORLD_SOAPSTONE_IRON_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(soapstoneIronTargets, 4));
        register(context, OVERWORLD_SOAPSTONE_GOLD_ORE_KEY, Feature.ORE, new OreConfiguration(soapstoneGoldTargets, 9));
        register(context, OVERWORLD_SOAPSTONE_GOLD_ORE_EXTRA_KEY, Feature.ORE, new OreConfiguration(soapstoneGoldTargets, 4, 0.5f));
        register(context, OVERWORLD_SOAPSTONE_REDSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(soapstoneRedstoneTargets, 8));
        register(context, OVERWORLD_SOAPSTONE_REDSTONE_ORE_LOWER_KEY, Feature.ORE, new OreConfiguration(soapstoneRedstoneTargets, 8));
        register(context, OVERWORLD_SOAPSTONE_LAPIS_ORE_KEY, Feature.ORE, new OreConfiguration(soapstoneLapisTargets, 7));

        //Rhyolite
        List<OreConfiguration.TargetBlockState> overworldRhyoliteBlock = List.of(
                OreConfiguration.target(stoneReplaceables, RhyoliteBlocks.RHYOLITE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(new BlockMatchTest(RhyoliteBlocks.RHYOLITE_BLOCK.get()),
                        RhyoliteBlocks.RHYOLITE_COAL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> rhyoliteCopperTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(RhyoliteBlocks.RHYOLITE_BLOCK.get()),
                        RhyoliteBlocks.RHYOLITE_COPPER_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> rhyoliteCoalTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(RhyoliteBlocks.RHYOLITE_BLOCK.get()),
                        RhyoliteBlocks.RHYOLITE_COAL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> rhyoliteIronTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(RhyoliteBlocks.RHYOLITE_BLOCK.get()),
                        RhyoliteBlocks.RHYOLITE_IRON_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> rhyoliteGoldTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(RhyoliteBlocks.RHYOLITE_BLOCK.get()),
                        RhyoliteBlocks.RHYOLITE_GOLD_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> rhyoliteRedstoneTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(RhyoliteBlocks.RHYOLITE_BLOCK.get()),
                        RhyoliteBlocks.RHYOLITE_REDSTONE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> rhyoliteLapisTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(RhyoliteBlocks.RHYOLITE_BLOCK.get()),
                        RhyoliteBlocks.RHYOLITE_LAPIS_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_RHYOLITE_BLOCK_KEY, Feature.ORE, new OreConfiguration(overworldRhyoliteBlock, 64));
        register(context, OVERWORLD_RHYOLITE_COAL_ORE_KEY, Feature.ORE, new OreConfiguration(rhyoliteCoalTargets, 17));
        register(context, OVERWORLD_RHYOLITE_COPPER_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(rhyoliteCopperTargets, 10));
        register(context, OVERWORLD_RHYOLITE_COPPER_ORE_LARGE_KEY, Feature.ORE, new OreConfiguration(rhyoliteCopperTargets, 20));
        register(context, OVERWORLD_RHYOLITE_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(rhyoliteIronTargets, 9));
        register(context, OVERWORLD_RHYOLITE_IRON_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(rhyoliteIronTargets, 4));
        register(context, OVERWORLD_RHYOLITE_GOLD_ORE_KEY, Feature.ORE, new OreConfiguration(rhyoliteGoldTargets, 9));
        register(context, OVERWORLD_RHYOLITE_GOLD_ORE_EXTRA_KEY, Feature.ORE, new OreConfiguration(rhyoliteGoldTargets, 4, 0.5f));
        register(context, OVERWORLD_RHYOLITE_REDSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(rhyoliteRedstoneTargets, 8));
        register(context, OVERWORLD_RHYOLITE_REDSTONE_ORE_LOWER_KEY, Feature.ORE, new OreConfiguration(rhyoliteRedstoneTargets, 8));
        register(context, OVERWORLD_RHYOLITE_LAPIS_ORE_KEY, Feature.ORE, new OreConfiguration(rhyoliteLapisTargets, 7));

        //Red Granite

        List<OreConfiguration.TargetBlockState> overworldRedGraniteBlock = List.of(
                OreConfiguration.target(deepslateReplaceables, RedGraniteBlocks.RED_GRANITE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(new BlockMatchTest(RedGraniteBlocks.RED_GRANITE_BLOCK.get()),
                        RedGraniteBlocks.RED_GRANITE_IRON_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> redgraniteIronTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(QuartziteBlocks.QUARTZITE_BLOCK.get()),
                        QuartziteBlocks.QUARTZITE_IRON_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> redgraniteGoldTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(RedGraniteBlocks.RED_GRANITE_BLOCK.get()),
                        RedGraniteBlocks.RED_GRANITE_GOLD_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> redgraniteRedstoneTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(RedGraniteBlocks.RED_GRANITE_BLOCK.get()),
                        RedGraniteBlocks.RED_GRANITE_REDSTONE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> redgraniteLapisTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(SoapstoneBlocks.SOAPSTONE_BLOCK.get()),
                        SoapstoneBlocks.SOAPSTONE_LAPIS_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> redgraniteDiamondTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(RedGraniteBlocks.RED_GRANITE_BLOCK.get()),
                        RedGraniteBlocks.RED_GRANITE_DIAMOND_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> redgraniteEmeraldTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(RedGraniteBlocks.RED_GRANITE_BLOCK.get()),
                        RedGraniteBlocks.RED_GRANITE_EMERALD_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_RED_GRANITE_BLOCK_KEY, Feature.ORE, new OreConfiguration(overworldRedGraniteBlock, 64));
        register(context, OVERWORLD_RED_GRANITE_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(redgraniteIronTargets, 9));
        register(context, OVERWORLD_RED_GRANITE_IRON_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(redgraniteIronTargets, 4));
        register(context, OVERWORLD_RED_GRANITE_GOLD_ORE_KEY, Feature.ORE, new OreConfiguration(redgraniteGoldTargets, 9));
        register(context, OVERWORLD_RED_GRANITE_GOLD_ORE_LOWER_KEY, Feature.ORE, new OreConfiguration(redgraniteGoldTargets, 4, 0.5f));
        register(context, OVERWORLD_RED_GRANITE_REDSTONE_ORE_LOWER_KEY, Feature.ORE, new OreConfiguration(redgraniteRedstoneTargets, 8));
        register(context, OVERWORLD_RED_GRANITE_REDSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(redgraniteRedstoneTargets, 8));
        register(context, OVERWORLD_RED_GRANITE_LAPIS_ORE_KEY, Feature.ORE, new OreConfiguration(redgraniteLapisTargets, 7));
        register(context, OVERWORLD_RED_GRANITE_LAPIS_ORE_BURIED_KEY, Feature.ORE, new OreConfiguration(redgraniteLapisTargets, 7, 1.0F));
        register(context, OVERWORLD_RED_GRANITE_DIAMOND_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(redgraniteDiamondTargets, 4, 0.5F));
        register(context, OVERWORLD_RED_GRANITE_DIAMOND_ORE_LARGE_KEY, Feature.ORE, new OreConfiguration(redgraniteDiamondTargets, 12, 0.7F));
        register(context, OVERWORLD_RED_GRANITE_DIAMOND_ORE_BURIED_KEY, Feature.ORE, new OreConfiguration(redgraniteDiamondTargets, 8, 1.0F));
        register(context, OVERWORLD_RED_GRANITE_DIAMOND_ORE_MEDIUM_KEY, Feature.ORE, new OreConfiguration(redgraniteDiamondTargets, 8, 0.5F));
        register(context, OVERWORLD_RED_GRANITE_EMERALD_ORE_KEY, Feature.ORE, new OreConfiguration(redgraniteEmeraldTargets, 3));

        //Quartzite
        List<OreConfiguration.TargetBlockState> overworldQuartziteBlock = List.of(
                OreConfiguration.target(deepslateReplaceables, QuartziteBlocks.QUARTZITE_BLOCK.get().defaultBlockState()));

        register(context, OVERWORLD_QUARTZITE_BLOCK_KEY, Feature.ORE, new OreConfiguration(overworldQuartziteBlock, 64));

        List<OreConfiguration.TargetBlockState> quartziteIronTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(QuartziteBlocks.QUARTZITE_BLOCK.get()),
                        QuartziteBlocks.QUARTZITE_IRON_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> quartziteGoldTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(QuartziteBlocks.QUARTZITE_BLOCK.get()),
                        QuartziteBlocks.QUARTZITE_GOLD_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> quartziteRedstoneTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(QuartziteBlocks.QUARTZITE_BLOCK.get()),
                        QuartziteBlocks.QUARTZITE_REDSTONE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> quartziteLapisTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(SoapstoneBlocks.SOAPSTONE_BLOCK.get()),
                        SoapstoneBlocks.SOAPSTONE_LAPIS_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> quartziteDiamondTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(QuartziteBlocks.QUARTZITE_BLOCK.get()),
                        QuartziteBlocks.QUARTZITE_DIAMOND_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> quartziteEmeraldTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(QuartziteBlocks.QUARTZITE_BLOCK.get()),
                        QuartziteBlocks.QUARTZITE_EMERALD_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_QUARTZITE_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(quartziteIronTargets, 9));
        register(context, OVERWORLD_QUARTZITE_IRON_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(quartziteIronTargets, 4));
        register(context, OVERWORLD_QUARTZITE_GOLD_ORE_KEY, Feature.ORE, new OreConfiguration(quartziteGoldTargets, 9));
        register(context, OVERWORLD_QUARTZITE_GOLD_ORE_LOWER_KEY, Feature.ORE, new OreConfiguration(quartziteGoldTargets, 4, 0.5f));
        register(context, OVERWORLD_QUARTZITE_REDSTONE_ORE_LOWER_KEY, Feature.ORE, new OreConfiguration(quartziteRedstoneTargets, 8));
        register(context, OVERWORLD_QUARTZITE_REDSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(quartziteRedstoneTargets, 8));

        register(context, OVERWORLD_QUARTZITE_LAPIS_ORE_KEY, Feature.ORE, new OreConfiguration(quartziteLapisTargets, 7));
        register(context, OVERWORLD_QUARTZITE_LAPIS_ORE_BURIED_KEY, Feature.ORE, new OreConfiguration(quartziteLapisTargets, 7, 1.0F));
        register(context, OVERWORLD_QUARTZITE_DIAMOND_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(quartziteDiamondTargets, 4, 0.5F));
        register(context, OVERWORLD_QUARTZITE_DIAMOND_ORE_LARGE_KEY, Feature.ORE, new OreConfiguration(quartziteDiamondTargets, 12, 0.7F));
        register(context, OVERWORLD_QUARTZITE_DIAMOND_ORE_BURIED_KEY, Feature.ORE, new OreConfiguration(quartziteDiamondTargets, 8, 1.0F));
        register(context, OVERWORLD_QUARTZITE_DIAMOND_ORE_MEDIUM_KEY, Feature.ORE, new OreConfiguration(quartziteDiamondTargets, 8, 0.5F));
        register(context, OVERWORLD_QUARTZITE_EMERALD_ORE_KEY, Feature.ORE, new OreConfiguration(quartziteEmeraldTargets, 3));

        //Migmatite
        List<OreConfiguration.TargetBlockState> overworldMigmatiteBlock = List.of(
                OreConfiguration.target(deepslateReplaceables, MigmatiteBlocks.MIGMATITE_BLOCK.get().defaultBlockState()));

        register(context, OVERWORLD_MIGMATITE_BLOCK_KEY, Feature.ORE, new OreConfiguration(overworldMigmatiteBlock, 64));

        List<OreConfiguration.TargetBlockState> migmatiteIronTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(MigmatiteBlocks.MIGMATITE_BLOCK.get()),
                        MigmatiteBlocks.MIGMATITE_IRON_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> migmatiteGoldTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(MigmatiteBlocks.MIGMATITE_BLOCK.get()),
                        MigmatiteBlocks.MIGMATITE_GOLD_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> migmatiteRedstoneTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(MigmatiteBlocks.MIGMATITE_BLOCK.get()),
                        MigmatiteBlocks.MIGMATITE_REDSTONE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> migmatiteLapisTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(SoapstoneBlocks.SOAPSTONE_BLOCK.get()),
                        SoapstoneBlocks.SOAPSTONE_LAPIS_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> migmatiteDiamondTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(MigmatiteBlocks.MIGMATITE_BLOCK.get()),
                        MigmatiteBlocks.MIGMATITE_DIAMOND_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> migmatiteEmeraldTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(MigmatiteBlocks.MIGMATITE_BLOCK.get()),
                        MigmatiteBlocks.MIGMATITE_EMERALD_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_MIGMATITE_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(migmatiteIronTargets, 9));
        register(context, OVERWORLD_MIGMATITE_IRON_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(migmatiteIronTargets, 4));
        register(context, OVERWORLD_MIGMATITE_GOLD_ORE_KEY, Feature.ORE, new OreConfiguration(migmatiteGoldTargets, 9));
        register(context, OVERWORLD_MIGMATITE_GOLD_ORE_LOWER_KEY, Feature.ORE, new OreConfiguration(migmatiteGoldTargets, 4, 0.5f));
        register(context, OVERWORLD_MIGMATITE_REDSTONE_ORE_LOWER_KEY, Feature.ORE, new OreConfiguration(migmatiteRedstoneTargets, 8));
        register(context, OVERWORLD_MIGMATITE_REDSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(migmatiteRedstoneTargets, 8));
        register(context, OVERWORLD_MIGMATITE_LAPIS_ORE_KEY, Feature.ORE, new OreConfiguration(migmatiteLapisTargets, 7));
        register(context, OVERWORLD_MIGMATITE_LAPIS_ORE_BURIED_KEY, Feature.ORE, new OreConfiguration(migmatiteLapisTargets, 7, 1.0F));
        register(context, OVERWORLD_MIGMATITE_DIAMOND_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(migmatiteDiamondTargets, 4, 0.5F));
        register(context, OVERWORLD_MIGMATITE_DIAMOND_ORE_LARGE_KEY, Feature.ORE, new OreConfiguration(migmatiteDiamondTargets, 12, 0.7F));
        register(context, OVERWORLD_MIGMATITE_DIAMOND_ORE_BURIED_KEY, Feature.ORE, new OreConfiguration(migmatiteDiamondTargets, 8, 1.0F));
        register(context, OVERWORLD_MIGMATITE_DIAMOND_ORE_MEDIUM_KEY, Feature.ORE, new OreConfiguration(migmatiteDiamondTargets, 8, 0.5F));
        register(context, OVERWORLD_MIGMATITE_EMERALD_ORE_KEY, Feature.ORE, new OreConfiguration(migmatiteEmeraldTargets, 3));

        //Marble
        List<OreConfiguration.TargetBlockState> overworldMarbleBlock = List.of(
                OreConfiguration.target(deepslateReplaceables, MarbleBlocks.MARBLE_BLOCK.get().defaultBlockState()));

        register(context, OVERWORLD_MARBLE_BLOCK_KEY, Feature.ORE, new OreConfiguration(overworldMarbleBlock, 64));

        List<OreConfiguration.TargetBlockState> marbleIronTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(MarbleBlocks.MARBLE_BLOCK.get()),
                        MarbleBlocks.MARBLE_IRON_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> marbleGoldTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(MarbleBlocks.MARBLE_BLOCK.get()),
                        MarbleBlocks.MARBLE_GOLD_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> marbleRedstoneTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(MarbleBlocks.MARBLE_BLOCK.get()),
                        MarbleBlocks.MARBLE_REDSTONE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> marbleLapisTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(SoapstoneBlocks.SOAPSTONE_BLOCK.get()),
                        SoapstoneBlocks.SOAPSTONE_LAPIS_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> marbleDiamondTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(MarbleBlocks.MARBLE_BLOCK.get()),
                        MarbleBlocks.MARBLE_DIAMOND_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> marbleEmeraldTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(MarbleBlocks.MARBLE_BLOCK.get()),
                        MarbleBlocks.MARBLE_EMERALD_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_MARBLE_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(marbleIronTargets, 9));
        register(context, OVERWORLD_MARBLE_IRON_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(marbleIronTargets, 4));
        register(context, OVERWORLD_MARBLE_GOLD_ORE_KEY, Feature.ORE, new OreConfiguration(marbleGoldTargets, 9));
        register(context, OVERWORLD_MARBLE_GOLD_ORE_LOWER_KEY, Feature.ORE, new OreConfiguration(marbleGoldTargets, 4, 0.5f));
        register(context, OVERWORLD_MARBLE_REDSTONE_ORE_LOWER_KEY, Feature.ORE, new OreConfiguration(marbleRedstoneTargets, 8));
        register(context, OVERWORLD_MARBLE_REDSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(marbleRedstoneTargets, 8));
        register(context, OVERWORLD_MARBLE_LAPIS_ORE_KEY, Feature.ORE, new OreConfiguration(marbleLapisTargets, 7));
        register(context, OVERWORLD_MARBLE_LAPIS_ORE_BURIED_KEY, Feature.ORE, new OreConfiguration(marbleLapisTargets, 7, 1.0F));
        register(context, OVERWORLD_MARBLE_DIAMOND_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(marbleDiamondTargets, 4, 0.5F));
        register(context, OVERWORLD_MARBLE_DIAMOND_ORE_LARGE_KEY, Feature.ORE, new OreConfiguration(marbleDiamondTargets, 12, 0.7F));
        register(context, OVERWORLD_MARBLE_DIAMOND_ORE_BURIED_KEY, Feature.ORE, new OreConfiguration(marbleDiamondTargets, 8, 1.0F));
        register(context, OVERWORLD_MARBLE_DIAMOND_ORE_MEDIUM_KEY, Feature.ORE, new OreConfiguration(marbleDiamondTargets, 8, 0.5F));
        register(context, OVERWORLD_MARBLE_EMERALD_ORE_KEY, Feature.ORE, new OreConfiguration(marbleEmeraldTargets, 3));

        //Limestone
        List<OreConfiguration.TargetBlockState> overworldLimestoneBlock = List.of(
                OreConfiguration.target(stoneReplaceables, LimestoneBlocks.LIMESTONE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(new BlockMatchTest(LimestoneBlocks.LIMESTONE_BLOCK.get()),
                        LimestoneBlocks.LIMESTONE_COAL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> limestoneCopperTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(LimestoneBlocks.LIMESTONE_BLOCK.get()),
                        LimestoneBlocks.LIMESTONE_COPPER_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> limestoneCoalTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(LimestoneBlocks.LIMESTONE_BLOCK.get()),
                        LimestoneBlocks.LIMESTONE_COAL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> limestoneIronTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(LimestoneBlocks.LIMESTONE_BLOCK.get()),
                        LimestoneBlocks.LIMESTONE_IRON_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> limestoneGoldTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(LimestoneBlocks.LIMESTONE_BLOCK.get()),
                        LimestoneBlocks.LIMESTONE_GOLD_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> limestoneRedstoneTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(LimestoneBlocks.LIMESTONE_BLOCK.get()),
                        LimestoneBlocks.LIMESTONE_REDSTONE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> limestoneLapisTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(LimestoneBlocks.LIMESTONE_BLOCK.get()),
                        LimestoneBlocks.LIMESTONE_LAPIS_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_LIMESTONE_BLOCK_KEY, Feature.ORE, new OreConfiguration(overworldLimestoneBlock, 64));
        register(context, OVERWORLD_LIMESTONE_COAL_ORE_KEY, Feature.ORE, new OreConfiguration(limestoneCoalTargets, 17));
        register(context, OVERWORLD_LIMESTONE_COPPER_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(limestoneCopperTargets, 10));
        register(context, OVERWORLD_LIMESTONE_COPPER_ORE_LARGE_KEY, Feature.ORE, new OreConfiguration(limestoneCopperTargets, 20));
        register(context, OVERWORLD_LIMESTONE_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(limestoneIronTargets, 9));
        register(context, OVERWORLD_LIMESTONE_IRON_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(limestoneIronTargets, 4));
        register(context, OVERWORLD_LIMESTONE_GOLD_ORE_KEY, Feature.ORE, new OreConfiguration(limestoneGoldTargets, 9));
        register(context, OVERWORLD_LIMESTONE_GOLD_ORE_EXTRA_KEY, Feature.ORE, new OreConfiguration(limestoneGoldTargets, 4, 0.5f));
        register(context, OVERWORLD_LIMESTONE_REDSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(limestoneRedstoneTargets, 8));
        register(context, OVERWORLD_LIMESTONE_REDSTONE_ORE_LOWER_KEY, Feature.ORE, new OreConfiguration(limestoneRedstoneTargets, 8));
        register(context, OVERWORLD_LIMESTONE_LAPIS_ORE_KEY, Feature.ORE, new OreConfiguration(limestoneLapisTargets, 7));

        //Siltstone
        List<OreConfiguration.TargetBlockState> overworldSiltstoneBlock = List.of(
                OreConfiguration.target(stoneReplaceables, SiltstoneBlocks.SILTSTONE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(new BlockMatchTest(SiltstoneBlocks.SILTSTONE_BLOCK.get()),
                        SiltstoneBlocks.SILTSTONE_COAL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> siltstoneCopperTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(SiltstoneBlocks.SILTSTONE_BLOCK.get()),
                        SiltstoneBlocks.SILTSTONE_COPPER_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> siltstoneCoalTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(SiltstoneBlocks.SILTSTONE_BLOCK.get()),
                        SiltstoneBlocks.SILTSTONE_COAL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> siltstoneIronTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(SiltstoneBlocks.SILTSTONE_BLOCK.get()),
                        SiltstoneBlocks.SILTSTONE_IRON_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> siltstoneGoldTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(SiltstoneBlocks.SILTSTONE_BLOCK.get()),
                        SiltstoneBlocks.SILTSTONE_GOLD_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> siltstoneRedstoneTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(SiltstoneBlocks.SILTSTONE_BLOCK.get()),
                        SiltstoneBlocks.SILTSTONE_REDSTONE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> siltstoneLapisTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(SiltstoneBlocks.SILTSTONE_BLOCK.get()),
                        SiltstoneBlocks.SILTSTONE_LAPIS_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_SILTSTONE_BLOCK_KEY, Feature.ORE, new OreConfiguration(overworldSiltstoneBlock, 64));
        register(context, OVERWORLD_SILTSTONE_COAL_ORE_KEY, Feature.ORE, new OreConfiguration(siltstoneCoalTargets, 17));
        register(context, OVERWORLD_SILTSTONE_COPPER_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(siltstoneCopperTargets, 10));
        register(context, OVERWORLD_SILTSTONE_COPPER_ORE_LARGE_KEY, Feature.ORE, new OreConfiguration(siltstoneCopperTargets, 20));
        register(context, OVERWORLD_SILTSTONE_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(siltstoneIronTargets, 9));
        register(context, OVERWORLD_SILTSTONE_IRON_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(siltstoneIronTargets, 4));
        register(context, OVERWORLD_SILTSTONE_GOLD_ORE_KEY, Feature.ORE, new OreConfiguration(siltstoneGoldTargets, 9));
        register(context, OVERWORLD_SILTSTONE_GOLD_ORE_EXTRA_KEY, Feature.ORE, new OreConfiguration(siltstoneGoldTargets, 4, 0.5f));
        register(context, OVERWORLD_SILTSTONE_REDSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(siltstoneRedstoneTargets, 8));
        register(context, OVERWORLD_SILTSTONE_REDSTONE_ORE_LOWER_KEY, Feature.ORE, new OreConfiguration(siltstoneRedstoneTargets, 8));
        register(context, OVERWORLD_SILTSTONE_LAPIS_ORE_KEY, Feature.ORE, new OreConfiguration(siltstoneLapisTargets, 7));

        //Blueschist
        List<OreConfiguration.TargetBlockState> overworldBlueschistBlock = List.of(
                OreConfiguration.target(stoneReplaceables, BlueschistBlocks.BLUESCHIST_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(new BlockMatchTest(BlueschistBlocks.BLUESCHIST_BLOCK.get()),
                        BlueschistBlocks.BLUESCHIST_COAL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> blueschistCopperTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(BlueschistBlocks.BLUESCHIST_BLOCK.get()),
                        BlueschistBlocks.BLUESCHIST_COPPER_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> blueschistCoalTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(BlueschistBlocks.BLUESCHIST_BLOCK.get()),
                        BlueschistBlocks.BLUESCHIST_COAL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> blueschistIronTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(BlueschistBlocks.BLUESCHIST_BLOCK.get()),
                        BlueschistBlocks.BLUESCHIST_IRON_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> blueschistGoldTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(BlueschistBlocks.BLUESCHIST_BLOCK.get()),
                        BlueschistBlocks.BLUESCHIST_GOLD_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> blueschistRedstoneTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(BlueschistBlocks.BLUESCHIST_BLOCK.get()),
                        BlueschistBlocks.BLUESCHIST_REDSTONE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> blueschistLapisTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(BlueschistBlocks.BLUESCHIST_BLOCK.get()),
                        BlueschistBlocks.BLUESCHIST_LAPIS_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_BLUESCHIST_BLOCK_KEY, Feature.ORE, new OreConfiguration(overworldBlueschistBlock, 64));
        register(context, OVERWORLD_BLUESCHIST_COAL_ORE_KEY, Feature.ORE, new OreConfiguration(blueschistCoalTargets, 17));
        register(context, OVERWORLD_BLUESCHIST_COPPER_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(blueschistCopperTargets, 10));
        register(context, OVERWORLD_BLUESCHIST_COPPER_ORE_LARGE_KEY, Feature.ORE, new OreConfiguration(blueschistCopperTargets, 20));
        register(context, OVERWORLD_BLUESCHIST_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(blueschistIronTargets, 9));
        register(context, OVERWORLD_BLUESCHIST_IRON_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(blueschistIronTargets, 4));
        register(context, OVERWORLD_BLUESCHIST_GOLD_ORE_KEY, Feature.ORE, new OreConfiguration(blueschistGoldTargets, 9));
        register(context, OVERWORLD_BLUESCHIST_GOLD_ORE_EXTRA_KEY, Feature.ORE, new OreConfiguration(blueschistGoldTargets, 4, 0.5f));
        register(context, OVERWORLD_BLUESCHIST_REDSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(blueschistRedstoneTargets, 8));
        register(context, OVERWORLD_BLUESCHIST_REDSTONE_ORE_LOWER_KEY, Feature.ORE, new OreConfiguration(blueschistRedstoneTargets, 8));
        register(context, OVERWORLD_BLUESCHIST_LAPIS_ORE_KEY, Feature.ORE, new OreConfiguration(blueschistLapisTargets, 7));

        //Greenschist
        List<OreConfiguration.TargetBlockState> overworldGreenschistBlock = List.of(
                OreConfiguration.target(stoneReplaceables, GreenschistBlocks.GREENSCHIST_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(new BlockMatchTest(GreenschistBlocks.GREENSCHIST_BLOCK.get()),
                        GreenschistBlocks.GREENSCHIST_COAL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> greenschistCopperTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(GreenschistBlocks.GREENSCHIST_BLOCK.get()),
                        GreenschistBlocks.GREENSCHIST_COPPER_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> greenschistCoalTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(GreenschistBlocks.GREENSCHIST_BLOCK.get()),
                        GreenschistBlocks.GREENSCHIST_COAL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> greenschistIronTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(GreenschistBlocks.GREENSCHIST_BLOCK.get()),
                        GreenschistBlocks.GREENSCHIST_IRON_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> greenschistGoldTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(GreenschistBlocks.GREENSCHIST_BLOCK.get()),
                        GreenschistBlocks.GREENSCHIST_GOLD_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> greenschistRedstoneTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(GreenschistBlocks.GREENSCHIST_BLOCK.get()),
                        GreenschistBlocks.GREENSCHIST_REDSTONE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> greenschistLapisTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(GreenschistBlocks.GREENSCHIST_BLOCK.get()),
                        GreenschistBlocks.GREENSCHIST_LAPIS_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_GREENSCHIST_BLOCK_KEY, Feature.ORE, new OreConfiguration(overworldGreenschistBlock, 64));
        register(context, OVERWORLD_GREENSCHIST_COAL_ORE_KEY, Feature.ORE, new OreConfiguration(greenschistCoalTargets, 17));
        register(context, OVERWORLD_GREENSCHIST_COPPER_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(greenschistCopperTargets, 10));
        register(context, OVERWORLD_GREENSCHIST_COPPER_ORE_LARGE_KEY, Feature.ORE, new OreConfiguration(greenschistCopperTargets, 20));
        register(context, OVERWORLD_GREENSCHIST_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(greenschistIronTargets, 9));
        register(context, OVERWORLD_GREENSCHIST_IRON_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(greenschistIronTargets, 4));
        register(context, OVERWORLD_GREENSCHIST_GOLD_ORE_KEY, Feature.ORE, new OreConfiguration(greenschistGoldTargets, 9));
        register(context, OVERWORLD_GREENSCHIST_GOLD_ORE_EXTRA_KEY, Feature.ORE, new OreConfiguration(greenschistGoldTargets, 4, 0.5f));
        register(context, OVERWORLD_GREENSCHIST_REDSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(greenschistRedstoneTargets, 8));
        register(context, OVERWORLD_GREENSCHIST_REDSTONE_ORE_LOWER_KEY, Feature.ORE, new OreConfiguration(greenschistRedstoneTargets, 8));
        register(context, OVERWORLD_GREENSCHIST_LAPIS_ORE_KEY, Feature.ORE, new OreConfiguration(greenschistLapisTargets, 7));

        //Chalk
        List<OreConfiguration.TargetBlockState> overworldChalkBlock = List.of(
                OreConfiguration.target(stoneReplaceables, ChalkBlocks.CHALK_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(new BlockMatchTest(ChalkBlocks.CHALK_BLOCK.get()),
                        ChalkBlocks.CHALK_COAL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> chalkCopperTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(ChalkBlocks.CHALK_BLOCK.get()),
                        ChalkBlocks.CHALK_COPPER_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> chalkCoalTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(ChalkBlocks.CHALK_BLOCK.get()),
                        ChalkBlocks.CHALK_COAL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> chalkIronTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(ChalkBlocks.CHALK_BLOCK.get()),
                        ChalkBlocks.CHALK_IRON_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> chalkGoldTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(ChalkBlocks.CHALK_BLOCK.get()),
                        ChalkBlocks.CHALK_GOLD_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> chalkRedstoneTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(ChalkBlocks.CHALK_BLOCK.get()),
                        ChalkBlocks.CHALK_REDSTONE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> chalkLapisTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(ChalkBlocks.CHALK_BLOCK.get()),
                        ChalkBlocks.CHALK_LAPIS_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_CHALK_BLOCK_KEY, Feature.ORE, new OreConfiguration(overworldChalkBlock, 64));
        register(context, OVERWORLD_CHALK_COAL_ORE_KEY, Feature.ORE, new OreConfiguration(chalkCoalTargets, 17));
        register(context, OVERWORLD_CHALK_COPPER_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(chalkCopperTargets, 10));
        register(context, OVERWORLD_CHALK_COPPER_ORE_LARGE_KEY, Feature.ORE, new OreConfiguration(chalkCopperTargets, 20));
        register(context, OVERWORLD_CHALK_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(chalkIronTargets, 9));
        register(context, OVERWORLD_CHALK_IRON_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(chalkIronTargets, 4));
        register(context, OVERWORLD_CHALK_GOLD_ORE_KEY, Feature.ORE, new OreConfiguration(chalkGoldTargets, 9));
        register(context, OVERWORLD_CHALK_GOLD_ORE_EXTRA_KEY, Feature.ORE, new OreConfiguration(chalkGoldTargets, 4, 0.5f));
        register(context, OVERWORLD_CHALK_REDSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(chalkRedstoneTargets, 8));
        register(context, OVERWORLD_CHALK_REDSTONE_ORE_LOWER_KEY, Feature.ORE, new OreConfiguration(chalkRedstoneTargets, 8));
        register(context, OVERWORLD_CHALK_LAPIS_ORE_KEY, Feature.ORE, new OreConfiguration(chalkLapisTargets, 7));

        //Shale
        List<OreConfiguration.TargetBlockState> overworldShaleBlock = List.of(
                OreConfiguration.target(stoneReplaceables, ShaleBlocks.SHALE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(new BlockMatchTest(ShaleBlocks.SHALE_BLOCK.get()),
                        ShaleBlocks.SHALE_COAL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> shaleCopperTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(ShaleBlocks.SHALE_BLOCK.get()),
                        ShaleBlocks.SHALE_COPPER_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> shaleCoalTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(ShaleBlocks.SHALE_BLOCK.get()),
                        ShaleBlocks.SHALE_COAL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> shaleIronTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(ShaleBlocks.SHALE_BLOCK.get()),
                        ShaleBlocks.SHALE_IRON_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> shaleGoldTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(ShaleBlocks.SHALE_BLOCK.get()),
                        ShaleBlocks.SHALE_GOLD_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> shaleRedstoneTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(ShaleBlocks.SHALE_BLOCK.get()),
                        ShaleBlocks.SHALE_REDSTONE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> shaleLapisTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(ShaleBlocks.SHALE_BLOCK.get()),
                        ShaleBlocks.SHALE_LAPIS_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_SHALE_BLOCK_KEY, Feature.ORE, new OreConfiguration(overworldShaleBlock, 64));
        register(context, OVERWORLD_SHALE_COAL_ORE_KEY, Feature.ORE, new OreConfiguration(shaleCoalTargets, 17));
        register(context, OVERWORLD_SHALE_COPPER_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(shaleCopperTargets, 10));
        register(context, OVERWORLD_SHALE_COPPER_ORE_LARGE_KEY, Feature.ORE, new OreConfiguration(shaleCopperTargets, 20));
        register(context, OVERWORLD_SHALE_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(shaleIronTargets, 9));
        register(context, OVERWORLD_SHALE_IRON_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(shaleIronTargets, 4));
        register(context, OVERWORLD_SHALE_GOLD_ORE_KEY, Feature.ORE, new OreConfiguration(shaleGoldTargets, 9));
        register(context, OVERWORLD_SHALE_GOLD_ORE_EXTRA_KEY, Feature.ORE, new OreConfiguration(shaleGoldTargets, 4, 0.5f));
        register(context, OVERWORLD_SHALE_REDSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(shaleRedstoneTargets, 8));
        register(context, OVERWORLD_SHALE_REDSTONE_ORE_LOWER_KEY, Feature.ORE, new OreConfiguration(shaleRedstoneTargets, 8));
        register(context, OVERWORLD_SHALE_LAPIS_ORE_KEY, Feature.ORE, new OreConfiguration(shaleLapisTargets, 7));

        //====================================================
        // CHERT
        //====================================================
        List<OreConfiguration.TargetBlockState> overworldChertBlock = List.of(
                OreConfiguration.target(stoneReplaceables, ChertBlocks.CHERT_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(new BlockMatchTest(ChertBlocks.CHERT_BLOCK.get()),
                        ChertBlocks.CHERT_COAL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> chertCopperTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(ChertBlocks.CHERT_BLOCK.get()),
                        ChertBlocks.CHERT_COPPER_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> chertCoalTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(ChertBlocks.CHERT_BLOCK.get()),
                        ChertBlocks.CHERT_COAL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> chertIronTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(ChertBlocks.CHERT_BLOCK.get()),
                        ChertBlocks.CHERT_IRON_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> chertGoldTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(ChertBlocks.CHERT_BLOCK.get()),
                        ChertBlocks.CHERT_GOLD_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> chertRedstoneTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(ChertBlocks.CHERT_BLOCK.get()),
                        ChertBlocks.CHERT_REDSTONE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> chertLapisTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(ChertBlocks.CHERT_BLOCK.get()),
                        ChertBlocks.CHERT_LAPIS_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_CHERT_BLOCK_KEY, Feature.ORE, new OreConfiguration(overworldChertBlock, 64));
        register(context, OVERWORLD_CHERT_COAL_ORE_KEY, Feature.ORE, new OreConfiguration(chertCoalTargets, 17));
        register(context, OVERWORLD_CHERT_COPPER_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(chertCopperTargets, 10));
        register(context, OVERWORLD_CHERT_COPPER_ORE_LARGE_KEY, Feature.ORE, new OreConfiguration(chertCopperTargets, 20));
        register(context, OVERWORLD_CHERT_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(chertIronTargets, 9));
        register(context, OVERWORLD_CHERT_IRON_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(chertIronTargets, 4));
        register(context, OVERWORLD_CHERT_GOLD_ORE_KEY, Feature.ORE, new OreConfiguration(chertGoldTargets, 9));
        register(context, OVERWORLD_CHERT_GOLD_ORE_EXTRA_KEY, Feature.ORE, new OreConfiguration(chertGoldTargets, 4, 0.5f));
        register(context, OVERWORLD_CHERT_REDSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(chertRedstoneTargets, 8));
        register(context, OVERWORLD_CHERT_REDSTONE_ORE_LOWER_KEY, Feature.ORE, new OreConfiguration(chertRedstoneTargets, 8));
        register(context, OVERWORLD_CHERT_LAPIS_ORE_KEY, Feature.ORE, new OreConfiguration(chertLapisTargets, 7));


        //====================================================
        // LIGNITE
        //====================================================
        List<OreConfiguration.TargetBlockState> overworldLigniteBlock = List.of(
                OreConfiguration.target(stoneReplaceables, LigniteBlocks.LIGNITE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(new BlockMatchTest(LigniteBlocks.LIGNITE_BLOCK.get()),
                        LigniteBlocks.LIGNITE_COAL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> ligniteCopperTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(LigniteBlocks.LIGNITE_BLOCK.get()),
                        LigniteBlocks.LIGNITE_COPPER_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> ligniteCoalTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(LigniteBlocks.LIGNITE_BLOCK.get()),
                        LigniteBlocks.LIGNITE_COAL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> ligniteIronTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(LigniteBlocks.LIGNITE_BLOCK.get()),
                        LigniteBlocks.LIGNITE_IRON_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> ligniteGoldTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(LigniteBlocks.LIGNITE_BLOCK.get()),
                        LigniteBlocks.LIGNITE_GOLD_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> ligniteRedstoneTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(LigniteBlocks.LIGNITE_BLOCK.get()),
                        LigniteBlocks.LIGNITE_REDSTONE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> ligniteLapisTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(LigniteBlocks.LIGNITE_BLOCK.get()),
                        LigniteBlocks.LIGNITE_LAPIS_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_LIGNITE_BLOCK_KEY, Feature.ORE, new OreConfiguration(overworldLigniteBlock, 64));
        register(context, OVERWORLD_LIGNITE_COAL_ORE_KEY, Feature.ORE, new OreConfiguration(ligniteCoalTargets, 17));
        register(context, OVERWORLD_LIGNITE_COPPER_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(ligniteCopperTargets, 10));
        register(context, OVERWORLD_LIGNITE_COPPER_ORE_LARGE_KEY, Feature.ORE, new OreConfiguration(ligniteCopperTargets, 20));
        register(context, OVERWORLD_LIGNITE_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(ligniteIronTargets, 9));
        register(context, OVERWORLD_LIGNITE_IRON_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(ligniteIronTargets, 4));
        register(context, OVERWORLD_LIGNITE_GOLD_ORE_KEY, Feature.ORE, new OreConfiguration(ligniteGoldTargets, 9));
        register(context, OVERWORLD_LIGNITE_GOLD_ORE_EXTRA_KEY, Feature.ORE, new OreConfiguration(ligniteGoldTargets, 4, 0.5f));
        register(context, OVERWORLD_LIGNITE_REDSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(ligniteRedstoneTargets, 8));
        register(context, OVERWORLD_LIGNITE_REDSTONE_ORE_LOWER_KEY, Feature.ORE, new OreConfiguration(ligniteRedstoneTargets, 8));
        register(context, OVERWORLD_LIGNITE_LAPIS_ORE_KEY, Feature.ORE, new OreConfiguration(ligniteLapisTargets, 7));


        //====================================================
        // DOLOMIT
        //====================================================
        List<OreConfiguration.TargetBlockState> overworldDolomitBlock = List.of(
                OreConfiguration.target(stoneReplaceables, DolomitBlocks.DOLOMIT_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(new BlockMatchTest(DolomitBlocks.DOLOMIT_BLOCK.get()),
                        DolomitBlocks.DOLOMIT_COAL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> dolomitCopperTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(DolomitBlocks.DOLOMIT_BLOCK.get()),
                        DolomitBlocks.DOLOMIT_COPPER_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> dolomitCoalTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(DolomitBlocks.DOLOMIT_BLOCK.get()),
                        DolomitBlocks.DOLOMIT_COAL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> dolomitIronTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(DolomitBlocks.DOLOMIT_BLOCK.get()),
                        DolomitBlocks.DOLOMIT_IRON_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> dolomitGoldTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(DolomitBlocks.DOLOMIT_BLOCK.get()),
                        DolomitBlocks.DOLOMIT_GOLD_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> dolomitRedstoneTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(DolomitBlocks.DOLOMIT_BLOCK.get()),
                        DolomitBlocks.DOLOMIT_REDSTONE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> dolomitLapisTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(DolomitBlocks.DOLOMIT_BLOCK.get()),
                        DolomitBlocks.DOLOMIT_LAPIS_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_DOLOMIT_BLOCK_KEY, Feature.ORE, new OreConfiguration(overworldDolomitBlock, 64));
        register(context, OVERWORLD_DOLOMIT_COAL_ORE_KEY, Feature.ORE, new OreConfiguration(dolomitCoalTargets, 17));
        register(context, OVERWORLD_DOLOMIT_COPPER_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(dolomitCopperTargets, 10));
        register(context, OVERWORLD_DOLOMIT_COPPER_ORE_LARGE_KEY, Feature.ORE, new OreConfiguration(dolomitCopperTargets, 20));
        register(context, OVERWORLD_DOLOMIT_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(dolomitIronTargets, 9));
        register(context, OVERWORLD_DOLOMIT_IRON_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(dolomitIronTargets, 4));
        register(context, OVERWORLD_DOLOMIT_GOLD_ORE_KEY, Feature.ORE, new OreConfiguration(dolomitGoldTargets, 9));
        register(context, OVERWORLD_DOLOMIT_GOLD_ORE_EXTRA_KEY, Feature.ORE, new OreConfiguration(dolomitGoldTargets, 4, 0.5f));
        register(context, OVERWORLD_DOLOMIT_REDSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(dolomitRedstoneTargets, 8));
        register(context, OVERWORLD_DOLOMIT_REDSTONE_ORE_LOWER_KEY, Feature.ORE, new OreConfiguration(dolomitRedstoneTargets, 8));
        register(context, OVERWORLD_DOLOMIT_LAPIS_ORE_KEY, Feature.ORE, new OreConfiguration(dolomitLapisTargets, 7));


        //====================================================
        // ECLOGITE
        //====================================================
        List<OreConfiguration.TargetBlockState> overworldEclogiteBlock = List.of(
                OreConfiguration.target(stoneReplaceables, EclogiteBlocks.ECLOGITE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(new BlockMatchTest(EclogiteBlocks.ECLOGITE_BLOCK.get()),
                        EclogiteBlocks.ECLOGITE_COAL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> eclogiteCopperTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(EclogiteBlocks.ECLOGITE_BLOCK.get()),
                        EclogiteBlocks.ECLOGITE_COPPER_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> eclogiteCoalTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(EclogiteBlocks.ECLOGITE_BLOCK.get()),
                        EclogiteBlocks.ECLOGITE_COAL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> eclogiteIronTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(EclogiteBlocks.ECLOGITE_BLOCK.get()),
                        EclogiteBlocks.ECLOGITE_IRON_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> eclogiteGoldTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(EclogiteBlocks.ECLOGITE_BLOCK.get()),
                        EclogiteBlocks.ECLOGITE_GOLD_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> eclogiteRedstoneTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(EclogiteBlocks.ECLOGITE_BLOCK.get()),
                        EclogiteBlocks.ECLOGITE_REDSTONE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> eclogiteLapisTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(EclogiteBlocks.ECLOGITE_BLOCK.get()),
                        EclogiteBlocks.ECLOGITE_LAPIS_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_ECLOGITE_BLOCK_KEY, Feature.ORE, new OreConfiguration(overworldEclogiteBlock, 64));
        register(context, OVERWORLD_ECLOGITE_COAL_ORE_KEY, Feature.ORE, new OreConfiguration(eclogiteCoalTargets, 17));
        register(context, OVERWORLD_ECLOGITE_COPPER_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(eclogiteCopperTargets, 10));
        register(context, OVERWORLD_ECLOGITE_COPPER_ORE_LARGE_KEY, Feature.ORE, new OreConfiguration(eclogiteCopperTargets, 20));
        register(context, OVERWORLD_ECLOGITE_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(eclogiteIronTargets, 9));
        register(context, OVERWORLD_ECLOGITE_IRON_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(eclogiteIronTargets, 4));
        register(context, OVERWORLD_ECLOGITE_GOLD_ORE_KEY, Feature.ORE, new OreConfiguration(eclogiteGoldTargets, 9));
        register(context, OVERWORLD_ECLOGITE_GOLD_ORE_EXTRA_KEY, Feature.ORE, new OreConfiguration(eclogiteGoldTargets, 4, 0.5f));
        register(context, OVERWORLD_ECLOGITE_REDSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(eclogiteRedstoneTargets, 8));
        register(context, OVERWORLD_ECLOGITE_REDSTONE_ORE_LOWER_KEY, Feature.ORE, new OreConfiguration(eclogiteRedstoneTargets, 8));
        register(context, OVERWORLD_ECLOGITE_LAPIS_ORE_KEY, Feature.ORE, new OreConfiguration(eclogiteLapisTargets, 7));


        //====================================================
        // GREYWACKE
        //====================================================
        List<OreConfiguration.TargetBlockState> overworldGreywackeBlock = List.of(
                OreConfiguration.target(stoneReplaceables, GreywackeBlocks.GREYWACKE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(new BlockMatchTest(GreywackeBlocks.GREYWACKE_BLOCK.get()),
                        GreywackeBlocks.GREYWACKE_COAL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> greywackeCopperTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(GreywackeBlocks.GREYWACKE_BLOCK.get()),
                        GreywackeBlocks.GREYWACKE_COPPER_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> greywackeCoalTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(GreywackeBlocks.GREYWACKE_BLOCK.get()),
                        GreywackeBlocks.GREYWACKE_COAL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> greywackeIronTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(GreywackeBlocks.GREYWACKE_BLOCK.get()),
                        GreywackeBlocks.GREYWACKE_IRON_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> greywackeGoldTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(GreywackeBlocks.GREYWACKE_BLOCK.get()),
                        GreywackeBlocks.GREYWACKE_GOLD_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> greywackeRedstoneTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(GreywackeBlocks.GREYWACKE_BLOCK.get()),
                        GreywackeBlocks.GREYWACKE_REDSTONE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> greywackeLapisTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(GreywackeBlocks.GREYWACKE_BLOCK.get()),
                        GreywackeBlocks.GREYWACKE_LAPIS_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_GREYWACKE_BLOCK_KEY, Feature.ORE, new OreConfiguration(overworldGreywackeBlock, 64));
        register(context, OVERWORLD_GREYWACKE_COAL_ORE_KEY, Feature.ORE, new OreConfiguration(greywackeCoalTargets, 17));
        register(context, OVERWORLD_GREYWACKE_COPPER_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(greywackeCopperTargets, 10));
        register(context, OVERWORLD_GREYWACKE_COPPER_ORE_LARGE_KEY, Feature.ORE, new OreConfiguration(greywackeCopperTargets, 20));
        register(context, OVERWORLD_GREYWACKE_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(greywackeIronTargets, 9));
        register(context, OVERWORLD_GREYWACKE_IRON_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(greywackeIronTargets, 4));
        register(context, OVERWORLD_GREYWACKE_GOLD_ORE_KEY, Feature.ORE, new OreConfiguration(greywackeGoldTargets, 9));
        register(context, OVERWORLD_GREYWACKE_GOLD_ORE_EXTRA_KEY, Feature.ORE, new OreConfiguration(greywackeGoldTargets, 4, 0.5f));
        register(context, OVERWORLD_GREYWACKE_REDSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(greywackeRedstoneTargets, 8));
        register(context, OVERWORLD_GREYWACKE_REDSTONE_ORE_LOWER_KEY, Feature.ORE, new OreConfiguration(greywackeRedstoneTargets, 8));
        register(context, OVERWORLD_GREYWACKE_LAPIS_ORE_KEY, Feature.ORE, new OreConfiguration(greywackeLapisTargets, 7));

        // Komatiite
        List<OreConfiguration.TargetBlockState> overworldKomatiiteBlock = List.of(
                OreConfiguration.target(stoneReplaceables, KomatiiteBlocks.KOMATIITE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(new BlockMatchTest(KomatiiteBlocks.KOMATIITE_BLOCK.get()),
                        KomatiiteBlocks.KOMATIITE_COAL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> komatiiteCopperTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(KomatiiteBlocks.KOMATIITE_BLOCK.get()),
                        KomatiiteBlocks.KOMATIITE_COPPER_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> komatiiteCoalTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(KomatiiteBlocks.KOMATIITE_BLOCK.get()),
                        KomatiiteBlocks.KOMATIITE_COAL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> komatiiteIronTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(KomatiiteBlocks.KOMATIITE_BLOCK.get()),
                        KomatiiteBlocks.KOMATIITE_IRON_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> komatiiteGoldTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(KomatiiteBlocks.KOMATIITE_BLOCK.get()),
                        KomatiiteBlocks.KOMATIITE_GOLD_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> komatiiteRedstoneTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(KomatiiteBlocks.KOMATIITE_BLOCK.get()),
                        KomatiiteBlocks.KOMATIITE_REDSTONE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> komatiiteLapisTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(KomatiiteBlocks.KOMATIITE_BLOCK.get()),
                        KomatiiteBlocks.KOMATIITE_LAPIS_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_KOMATIITE_BLOCK_KEY, Feature.ORE, new OreConfiguration(overworldKomatiiteBlock, 64));
        register(context, OVERWORLD_KOMATIITE_COAL_ORE_KEY, Feature.ORE, new OreConfiguration(komatiiteCoalTargets, 17));
        register(context, OVERWORLD_KOMATIITE_COPPER_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(komatiiteCopperTargets, 10));
        register(context, OVERWORLD_KOMATIITE_COPPER_ORE_LARGE_KEY, Feature.ORE, new OreConfiguration(komatiiteCopperTargets, 20));
        register(context, OVERWORLD_KOMATIITE_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(komatiiteIronTargets, 9));
        register(context, OVERWORLD_KOMATIITE_IRON_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(komatiiteIronTargets, 4));
        register(context, OVERWORLD_KOMATIITE_GOLD_ORE_KEY, Feature.ORE, new OreConfiguration(komatiiteGoldTargets, 9));
        register(context, OVERWORLD_KOMATIITE_GOLD_ORE_EXTRA_KEY, Feature.ORE, new OreConfiguration(komatiiteGoldTargets, 4, 0.5f));
        register(context, OVERWORLD_KOMATIITE_REDSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(komatiiteRedstoneTargets, 8));
        register(context, OVERWORLD_KOMATIITE_REDSTONE_ORE_LOWER_KEY, Feature.ORE, new OreConfiguration(komatiiteRedstoneTargets, 8));
        register(context, OVERWORLD_KOMATIITE_LAPIS_ORE_KEY, Feature.ORE, new OreConfiguration(komatiiteLapisTargets, 7));

        // Dacite
        List<OreConfiguration.TargetBlockState> overworldDaciteBlock = List.of(
                OreConfiguration.target(stoneReplaceables, DaciteBlocks.DACITE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(new BlockMatchTest(DaciteBlocks.DACITE_BLOCK.get()),
                        DaciteBlocks.DACITE_COAL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> daciteCopperTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(DaciteBlocks.DACITE_BLOCK.get()),
                        DaciteBlocks.DACITE_COPPER_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> daciteCoalTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(DaciteBlocks.DACITE_BLOCK.get()),
                        DaciteBlocks.DACITE_COAL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> daciteIronTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(DaciteBlocks.DACITE_BLOCK.get()),
                        DaciteBlocks.DACITE_IRON_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> daciteGoldTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(DaciteBlocks.DACITE_BLOCK.get()),
                        DaciteBlocks.DACITE_GOLD_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> daciteRedstoneTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(DaciteBlocks.DACITE_BLOCK.get()),
                        DaciteBlocks.DACITE_REDSTONE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> daciteLapisTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(DaciteBlocks.DACITE_BLOCK.get()),
                        DaciteBlocks.DACITE_LAPIS_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_DACITE_BLOCK_KEY, Feature.ORE, new OreConfiguration(overworldDaciteBlock, 64));
        register(context, OVERWORLD_DACITE_COAL_ORE_KEY, Feature.ORE, new OreConfiguration(daciteCoalTargets, 17));
        register(context, OVERWORLD_DACITE_COPPER_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(daciteCopperTargets, 10));
        register(context, OVERWORLD_DACITE_COPPER_ORE_LARGE_KEY, Feature.ORE, new OreConfiguration(daciteCopperTargets, 20));
        register(context, OVERWORLD_DACITE_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(daciteIronTargets, 9));
        register(context, OVERWORLD_DACITE_IRON_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(daciteIronTargets, 4));
        register(context, OVERWORLD_DACITE_GOLD_ORE_KEY, Feature.ORE, new OreConfiguration(daciteGoldTargets, 9));
        register(context, OVERWORLD_DACITE_GOLD_ORE_EXTRA_KEY, Feature.ORE, new OreConfiguration(daciteGoldTargets, 4, 0.5f));
        register(context, OVERWORLD_DACITE_REDSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(daciteRedstoneTargets, 8));
        register(context, OVERWORLD_DACITE_REDSTONE_ORE_LOWER_KEY, Feature.ORE, new OreConfiguration(daciteRedstoneTargets, 8));
        register(context, OVERWORLD_DACITE_LAPIS_ORE_KEY, Feature.ORE, new OreConfiguration(daciteLapisTargets, 7));


    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(UndergroundBiomesConstructsReworked.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
