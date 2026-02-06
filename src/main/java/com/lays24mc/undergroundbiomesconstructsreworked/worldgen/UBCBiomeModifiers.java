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

    public static final ResourceKey<BiomeModifier> ADD_BLUESCHIST_BLOCK = registerKey("add_blueschist_block");
    public static final ResourceKey<BiomeModifier> ADD_BLUESCHIST_COAL_ORE = registerKey("add_blueschist_coal_ore");
    public static final ResourceKey<BiomeModifier> ADD_BLUESCHIST_COPPER_SMALL_ORE = registerKey("add_blueschist_copper_small_ore");
    public static final ResourceKey<BiomeModifier> ADD_BLUESCHIST_COPPER_ORE_LARGE = registerKey("add_blueschist_copper_ore_large");
    public static final ResourceKey<BiomeModifier> ADD_BLUESCHIST_IRON_ORE_UPPER = registerKey("add_blueschist_iron_ore_upper");
    public static final ResourceKey<BiomeModifier> ADD_BLUESCHIST_IRON_ORE_MIDDLE = registerKey("add_blueschist_iron_ore_middle");
    public static final ResourceKey<BiomeModifier> ADD_BLUESCHIST_IRON_ORE_SMALL = registerKey("add_blueschist_iron_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_BLUESCHIST_GOLD_ORE = registerKey("add_blueschist_gold_ore");
    public static final ResourceKey<BiomeModifier> ADD_BLUESCHIST_GOLD_ORE_EXTRA = registerKey("add_blueschist_gold_ore_extra");
    public static final ResourceKey<BiomeModifier> ADD_BLUESCHIST_REDSTONE_ORE = registerKey("add_blueschist_redstone_ore");
    public static final ResourceKey<BiomeModifier> ADD_BLUESCHIST_REDSTONE_ORE_LOWER = registerKey("add_blueschist_redstone_ore_lower");
    public static final ResourceKey<BiomeModifier> ADD_BLUESCHIST_LAPIS_ORE = registerKey("add_blueschist_lapis_ore");

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

    public static final ResourceKey<BiomeModifier> ADD_CHERT_BLOCK = registerKey("add_chert_block");
    public static final ResourceKey<BiomeModifier> ADD_CHERT_COAL_ORE = registerKey("add_chert_coal_ore");
    public static final ResourceKey<BiomeModifier> ADD_CHERT_COPPER_SMALL_ORE = registerKey("add_chert_copper_small_ore");
    public static final ResourceKey<BiomeModifier> ADD_CHERT_COPPER_ORE_LARGE = registerKey("add_chert_copper_ore_large");
    public static final ResourceKey<BiomeModifier> ADD_CHERT_IRON_ORE_UPPER = registerKey("add_chert_iron_ore_upper");
    public static final ResourceKey<BiomeModifier> ADD_CHERT_IRON_ORE_MIDDLE = registerKey("add_chert_iron_ore_middle");
    public static final ResourceKey<BiomeModifier> ADD_CHERT_IRON_ORE_SMALL = registerKey("add_chert_iron_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_CHERT_GOLD_ORE = registerKey("add_chert_gold_ore");
    public static final ResourceKey<BiomeModifier> ADD_CHERT_GOLD_ORE_EXTRA = registerKey("add_chert_gold_ore_extra");
    public static final ResourceKey<BiomeModifier> ADD_CHERT_REDSTONE_ORE = registerKey("add_chert_redstone_ore");
    public static final ResourceKey<BiomeModifier> ADD_CHERT_REDSTONE_ORE_LOWER = registerKey("add_chert_redstone_ore_lower");
    public static final ResourceKey<BiomeModifier> ADD_CHERT_LAPIS_ORE = registerKey("add_chert_lapis_ore");

    public static final ResourceKey<BiomeModifier> ADD_LIGNITE_BLOCK = registerKey("add_lignite_block");
    public static final ResourceKey<BiomeModifier> ADD_LIGNITE_COAL_ORE = registerKey("add_lignite_coal_ore");
    public static final ResourceKey<BiomeModifier> ADD_LIGNITE_COPPER_SMALL_ORE = registerKey("add_lignite_copper_small_ore");
    public static final ResourceKey<BiomeModifier> ADD_LIGNITE_COPPER_ORE_LARGE = registerKey("add_lignite_copper_ore_large");
    public static final ResourceKey<BiomeModifier> ADD_LIGNITE_IRON_ORE_UPPER = registerKey("add_lignite_iron_ore_upper");
    public static final ResourceKey<BiomeModifier> ADD_LIGNITE_IRON_ORE_MIDDLE = registerKey("add_lignite_iron_ore_middle");
    public static final ResourceKey<BiomeModifier> ADD_LIGNITE_IRON_ORE_SMALL = registerKey("add_lignite_iron_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_LIGNITE_GOLD_ORE = registerKey("add_lignite_gold_ore");
    public static final ResourceKey<BiomeModifier> ADD_LIGNITE_GOLD_ORE_EXTRA = registerKey("add_lignite_gold_ore_extra");
    public static final ResourceKey<BiomeModifier> ADD_LIGNITE_REDSTONE_ORE = registerKey("add_lignite_redstone_ore");
    public static final ResourceKey<BiomeModifier> ADD_LIGNITE_REDSTONE_ORE_LOWER = registerKey("add_lignite_redstone_ore_lower");
    public static final ResourceKey<BiomeModifier> ADD_LIGNITE_LAPIS_ORE = registerKey("add_lignite_lapis_ore");

    public static final ResourceKey<BiomeModifier> ADD_DOLOMITE_BLOCK = registerKey("add_dolomite_block");
    public static final ResourceKey<BiomeModifier> ADD_DOLOMITE_COAL_ORE = registerKey("add_dolomite_coal_ore");
    public static final ResourceKey<BiomeModifier> ADD_DOLOMITE_COPPER_SMALL_ORE = registerKey("add_dolomite_copper_small_ore");
    public static final ResourceKey<BiomeModifier> ADD_DOLOMITE_COPPER_ORE_LARGE = registerKey("add_dolomite_copper_ore_large");
    public static final ResourceKey<BiomeModifier> ADD_DOLOMITE_IRON_ORE_UPPER = registerKey("add_dolomite_iron_ore_upper");
    public static final ResourceKey<BiomeModifier> ADD_DOLOMITE_IRON_ORE_MIDDLE = registerKey("add_dolomite_iron_ore_middle");
    public static final ResourceKey<BiomeModifier> ADD_DOLOMITE_IRON_ORE_SMALL = registerKey("add_dolomite_iron_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_DOLOMITE_GOLD_ORE = registerKey("add_dolomite_gold_ore");
    public static final ResourceKey<BiomeModifier> ADD_DOLOMITE_GOLD_ORE_EXTRA = registerKey("add_dolomite_gold_ore_extra");
    public static final ResourceKey<BiomeModifier> ADD_DOLOMITE_REDSTONE_ORE = registerKey("add_dolomite_redstone_ore");
    public static final ResourceKey<BiomeModifier> ADD_DOLOMITE_REDSTONE_ORE_LOWER = registerKey("add_dolomite_redstone_ore_lower");
    public static final ResourceKey<BiomeModifier> ADD_DOLOMITE_LAPIS_ORE = registerKey("add_dolomite_lapis_ore");

    public static final ResourceKey<BiomeModifier> ADD_ECLOGITE_BLOCK = registerKey("add_eclogite_block");
    public static final ResourceKey<BiomeModifier> ADD_ECLOGITE_COAL_ORE = registerKey("add_eclogite_coal_ore");
    public static final ResourceKey<BiomeModifier> ADD_ECLOGITE_COPPER_SMALL_ORE = registerKey("add_eclogite_copper_small_ore");
    public static final ResourceKey<BiomeModifier> ADD_ECLOGITE_COPPER_ORE_LARGE = registerKey("add_eclogite_copper_ore_large");
    public static final ResourceKey<BiomeModifier> ADD_ECLOGITE_IRON_ORE_UPPER = registerKey("add_eclogite_iron_ore_upper");
    public static final ResourceKey<BiomeModifier> ADD_ECLOGITE_IRON_ORE_MIDDLE = registerKey("add_eclogite_iron_ore_middle");
    public static final ResourceKey<BiomeModifier> ADD_ECLOGITE_IRON_ORE_SMALL = registerKey("add_eclogite_iron_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_ECLOGITE_GOLD_ORE = registerKey("add_eclogite_gold_ore");
    public static final ResourceKey<BiomeModifier> ADD_ECLOGITE_GOLD_ORE_EXTRA = registerKey("add_eclogite_gold_ore_extra");
    public static final ResourceKey<BiomeModifier> ADD_ECLOGITE_REDSTONE_ORE = registerKey("add_eclogite_redstone_ore");
    public static final ResourceKey<BiomeModifier> ADD_ECLOGITE_REDSTONE_ORE_LOWER = registerKey("add_eclogite_redstone_ore_lower");
    public static final ResourceKey<BiomeModifier> ADD_ECLOGITE_LAPIS_ORE = registerKey("add_eclogite_lapis_ore");

    public static final ResourceKey<BiomeModifier> ADD_GREYWACKE_BLOCK = registerKey("add_greywacke_block");
    public static final ResourceKey<BiomeModifier> ADD_GREYWACKE_COAL_ORE = registerKey("add_greywacke_coal_ore");
    public static final ResourceKey<BiomeModifier> ADD_GREYWACKE_COPPER_SMALL_ORE = registerKey("add_greywacke_copper_small_ore");
    public static final ResourceKey<BiomeModifier> ADD_GREYWACKE_COPPER_ORE_LARGE = registerKey("add_greywacke_copper_ore_large");
    public static final ResourceKey<BiomeModifier> ADD_GREYWACKE_IRON_ORE_UPPER = registerKey("add_greywacke_iron_ore_upper");
    public static final ResourceKey<BiomeModifier> ADD_GREYWACKE_IRON_ORE_MIDDLE = registerKey("add_greywacke_iron_ore_middle");
    public static final ResourceKey<BiomeModifier> ADD_GREYWACKE_IRON_ORE_SMALL = registerKey("add_greywacke_iron_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_GREYWACKE_GOLD_ORE = registerKey("add_greywacke_gold_ore");
    public static final ResourceKey<BiomeModifier> ADD_GREYWACKE_GOLD_ORE_EXTRA = registerKey("add_greywacke_gold_ore_extra");
    public static final ResourceKey<BiomeModifier> ADD_GREYWACKE_REDSTONE_ORE = registerKey("add_greywacke_redstone_ore");
    public static final ResourceKey<BiomeModifier> ADD_GREYWACKE_REDSTONE_ORE_LOWER = registerKey("add_greywacke_redstone_ore_lower");
    public static final ResourceKey<BiomeModifier> ADD_GREYWACKE_LAPIS_ORE = registerKey("add_greywacke_lapis_ore");

    public static final ResourceKey<BiomeModifier> ADD_KOMATIITE_BLOCK = registerKey("add_komatiite_block");
    public static final ResourceKey<BiomeModifier> ADD_KOMATIITE_COAL_ORE = registerKey("add_komatiite_coal_ore");
    public static final ResourceKey<BiomeModifier> ADD_KOMATIITE_COPPER_SMALL_ORE = registerKey("add_komatiite_copper_small_ore");
    public static final ResourceKey<BiomeModifier> ADD_KOMATIITE_COPPER_ORE_LARGE = registerKey("add_komatiite_copper_ore_large");
    public static final ResourceKey<BiomeModifier> ADD_KOMATIITE_IRON_ORE_UPPER = registerKey("add_komatiite_iron_ore_upper");
    public static final ResourceKey<BiomeModifier> ADD_KOMATIITE_IRON_ORE_MIDDLE = registerKey("add_komatiite_iron_ore_middle");
    public static final ResourceKey<BiomeModifier> ADD_KOMATIITE_IRON_ORE_SMALL = registerKey("add_komatiite_iron_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_KOMATIITE_GOLD_ORE = registerKey("add_komatiite_gold_ore");
    public static final ResourceKey<BiomeModifier> ADD_KOMATIITE_GOLD_ORE_EXTRA = registerKey("add_komatiite_gold_ore_extra");
    public static final ResourceKey<BiomeModifier> ADD_KOMATIITE_REDSTONE_ORE = registerKey("add_komatiite_redstone_ore");
    public static final ResourceKey<BiomeModifier> ADD_KOMATIITE_REDSTONE_ORE_LOWER = registerKey("add_komatiite_redstone_ore_lower");
    public static final ResourceKey<BiomeModifier> ADD_KOMATIITE_LAPIS_ORE = registerKey("add_komatiite_lapis_ore");

    public static final ResourceKey<BiomeModifier> ADD_DACITE_BLOCK = registerKey("add_dacite_block");
    public static final ResourceKey<BiomeModifier> ADD_DACITE_COAL_ORE = registerKey("add_dacite_coal_ore");
    public static final ResourceKey<BiomeModifier> ADD_DACITE_COPPER_SMALL_ORE = registerKey("add_dacite_copper_small_ore");
    public static final ResourceKey<BiomeModifier> ADD_DACITE_COPPER_ORE_LARGE = registerKey("add_dacite_copper_ore_large");
    public static final ResourceKey<BiomeModifier> ADD_DACITE_IRON_ORE_UPPER = registerKey("add_dacite_iron_ore_upper");
    public static final ResourceKey<BiomeModifier> ADD_DACITE_IRON_ORE_MIDDLE = registerKey("add_dacite_iron_ore_middle");
    public static final ResourceKey<BiomeModifier> ADD_DACITE_IRON_ORE_SMALL = registerKey("add_dacite_iron_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_DACITE_GOLD_ORE = registerKey("add_dacite_gold_ore");
    public static final ResourceKey<BiomeModifier> ADD_DACITE_GOLD_ORE_EXTRA = registerKey("add_dacite_gold_ore_extra");
    public static final ResourceKey<BiomeModifier> ADD_DACITE_REDSTONE_ORE = registerKey("add_dacite_redstone_ore");
    public static final ResourceKey<BiomeModifier> ADD_DACITE_REDSTONE_ORE_LOWER = registerKey("add_dacite_redstone_ore_lower");
    public static final ResourceKey<BiomeModifier> ADD_DACITE_LAPIS_ORE = registerKey("add_dacite_lapis_ore");

    public static final ResourceKey<BiomeModifier> ADD_BLACK_GRANITE_BLOCK = registerKey("add_black_granite_block");
    public static final ResourceKey<BiomeModifier> ADD_BLACK_GRANITE_IRON_ORE_MIDDLE = registerKey("add_black_granite_iron_ore_middle");
    public static final ResourceKey<BiomeModifier> ADD_BLACK_GRANITE_IRON_ORE_SMALL = registerKey("add_black_granite_iron_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_BLACK_GRANITE_GOLD_ORE = registerKey("add_black_granite_gold_ore");
    public static final ResourceKey<BiomeModifier> ADD_BLACK_GRANITE_GOLD_ORE_LOWER = registerKey("add_black_granite_gold_ore_lower");
    public static final ResourceKey<BiomeModifier> ADD_BLACK_GRANITE_REDSTONE_ORE_LOWER = registerKey("add_black_granite_redstone_ore_lower");
    public static final ResourceKey<BiomeModifier> ADD_BLACK_GRANITE_LAPIS_ORE = registerKey("add_black_granite_lapis_ore");
    public static final ResourceKey<BiomeModifier> ADD_BLACK_GRANITE_DIAMOND_ORE_SMALL = registerKey("add_black_granite_diamond_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_BLACK_GRANITE_DIAMOND_ORE_LARGE = registerKey("add_black_granite_diamond_ore_large");
    public static final ResourceKey<BiomeModifier> ADD_BLACK_GRANITE_DIAMOND_ORE_BURIED = registerKey("add_black_granite_diamond_ore_buried");
    public static final ResourceKey<BiomeModifier> ADD_BLACK_GRANITE_DIAMOND_ORE_MEDIUM = registerKey("add_black_granite_diamond_ore_medium");
    public static final ResourceKey<BiomeModifier> ADD_BLACK_GRANITE_EMERALD_ORE = registerKey("add_black_granite_emerald_ore");

    public static final ResourceKey<BiomeModifier> ADD_GABBRO_BLOCK = registerKey("add_gabbro_block");
    public static final ResourceKey<BiomeModifier> ADD_GABBRO_IRON_ORE_MIDDLE = registerKey("add_gabbro_iron_ore_middle");
    public static final ResourceKey<BiomeModifier> ADD_GABBRO_IRON_ORE_SMALL = registerKey("add_gabbro_iron_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_GABBRO_GOLD_ORE = registerKey("add_gabbro_gold_ore");
    public static final ResourceKey<BiomeModifier> ADD_GABBRO_GOLD_ORE_LOWER = registerKey("add_gabbro_gold_ore_lower");
    public static final ResourceKey<BiomeModifier> ADD_GABBRO_REDSTONE_ORE_LOWER = registerKey("add_gabbro_redstone_ore_lower");
    public static final ResourceKey<BiomeModifier> ADD_GABBRO_LAPIS_ORE = registerKey("add_gabbro_lapis_ore");
    public static final ResourceKey<BiomeModifier> ADD_GABBRO_DIAMOND_ORE_SMALL = registerKey("add_gabbro_diamond_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_GABBRO_DIAMOND_ORE_LARGE = registerKey("add_gabbro_diamond_ore_large");
    public static final ResourceKey<BiomeModifier> ADD_GABBRO_DIAMOND_ORE_BURIED = registerKey("add_gabbro_diamond_ore_buried");
    public static final ResourceKey<BiomeModifier> ADD_GABBRO_DIAMOND_ORE_MEDIUM = registerKey("add_gabbro_diamond_ore_medium");
    public static final ResourceKey<BiomeModifier> ADD_GABBRO_EMERALD_ORE = registerKey("add_gabbro_emerald_ore");

    public static final ResourceKey<BiomeModifier> ADD_GNEISS_BLOCK = registerKey("add_gneiss_block");
    public static final ResourceKey<BiomeModifier> ADD_GNEISS_IRON_ORE_MIDDLE = registerKey("add_gneiss_iron_ore_middle");
    public static final ResourceKey<BiomeModifier> ADD_GNEISS_IRON_ORE_SMALL = registerKey("add_gneiss_iron_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_GNEISS_GOLD_ORE = registerKey("add_gneiss_gold_ore");
    public static final ResourceKey<BiomeModifier> ADD_GNEISS_GOLD_ORE_LOWER = registerKey("add_gneiss_gold_ore_lower");
    public static final ResourceKey<BiomeModifier> ADD_GNEISS_REDSTONE_ORE_LOWER = registerKey("add_gneiss_redstone_ore_lower");
    public static final ResourceKey<BiomeModifier> ADD_GNEISS_LAPIS_ORE = registerKey("add_gneiss_lapis_ore");
    public static final ResourceKey<BiomeModifier> ADD_GNEISS_DIAMOND_ORE_SMALL = registerKey("add_gneiss_diamond_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_GNEISS_DIAMOND_ORE_LARGE = registerKey("add_gneiss_diamond_ore_large");
    public static final ResourceKey<BiomeModifier> ADD_GNEISS_DIAMOND_ORE_BURIED = registerKey("add_gneiss_diamond_ore_buried");
    public static final ResourceKey<BiomeModifier> ADD_GNEISS_DIAMOND_ORE_MEDIUM = registerKey("add_gneiss_diamond_ore_medium");
    public static final ResourceKey<BiomeModifier> ADD_GNEISS_EMERALD_ORE = registerKey("add_gneiss_emerald_ore");


    public static void bootstrap(BootstrapContext<BiomeModifier> context) {

        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

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

        //blueschist
        context.register(ADD_BLUESCHIST_BLOCK, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.BLUESCHIST_BLOCK_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLUESCHIST_COAL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.BLUESCHIST_COAL_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLUESCHIST_COPPER_SMALL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.BLUESCHIST_COPPER_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLUESCHIST_COPPER_ORE_LARGE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.BLUESCHIST_COPPER_ORE_LARGE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLUESCHIST_IRON_ORE_UPPER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.BLUESCHIST_IRON_ORE_UPPER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLUESCHIST_IRON_ORE_MIDDLE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.BLUESCHIST_IRON_ORE_MIDDLE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLUESCHIST_IRON_ORE_SMALL, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.BLUESCHIST_IRON_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLUESCHIST_GOLD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.BLUESCHIST_GOLD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLUESCHIST_GOLD_ORE_EXTRA, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.BLUESCHIST_GOLD_ORE_EXTRA_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLUESCHIST_REDSTONE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.BLUESCHIST_REDSTONE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLUESCHIST_REDSTONE_ORE_LOWER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.BLUESCHIST_REDSTONE_ORE_LOWER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLUESCHIST_LAPIS_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.BLUESCHIST_LAPIS_ORE_PLACED_KEY)),
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

        // chert
        context.register(ADD_CHERT_BLOCK, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.CHERT_BLOCK_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_CHERT_COAL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.CHERT_COAL_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_CHERT_COPPER_SMALL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.CHERT_COPPER_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_CHERT_COPPER_ORE_LARGE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.CHERT_COPPER_ORE_LARGE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_CHERT_IRON_ORE_UPPER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.CHERT_IRON_ORE_UPPER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_CHERT_IRON_ORE_MIDDLE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.CHERT_IRON_ORE_MIDDLE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_CHERT_IRON_ORE_SMALL, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.CHERT_IRON_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_CHERT_GOLD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.CHERT_GOLD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_CHERT_GOLD_ORE_EXTRA, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.CHERT_GOLD_ORE_EXTRA_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_CHERT_REDSTONE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.CHERT_REDSTONE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_CHERT_REDSTONE_ORE_LOWER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.CHERT_REDSTONE_ORE_LOWER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_CHERT_LAPIS_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.CHERT_LAPIS_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));


// lignite
        context.register(ADD_LIGNITE_BLOCK, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.LIGNITE_BLOCK_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_LIGNITE_COAL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.LIGNITE_COAL_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_LIGNITE_COPPER_SMALL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.LIGNITE_COPPER_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_LIGNITE_COPPER_ORE_LARGE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.LIGNITE_COPPER_ORE_LARGE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_LIGNITE_IRON_ORE_UPPER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.LIGNITE_IRON_ORE_UPPER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_LIGNITE_IRON_ORE_MIDDLE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.LIGNITE_IRON_ORE_MIDDLE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_LIGNITE_IRON_ORE_SMALL, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.LIGNITE_IRON_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_LIGNITE_GOLD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.LIGNITE_GOLD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_LIGNITE_GOLD_ORE_EXTRA, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.LIGNITE_GOLD_ORE_EXTRA_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_LIGNITE_REDSTONE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.LIGNITE_REDSTONE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_LIGNITE_REDSTONE_ORE_LOWER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.LIGNITE_REDSTONE_ORE_LOWER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_LIGNITE_LAPIS_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.LIGNITE_LAPIS_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));


// dolomite
        context.register(ADD_DOLOMITE_BLOCK, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.DOLOMITE_BLOCK_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DOLOMITE_COAL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.DOLOMITE_COAL_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DOLOMITE_COPPER_SMALL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.DOLOMITE_COPPER_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DOLOMITE_COPPER_ORE_LARGE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.DOLOMITE_COPPER_ORE_LARGE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DOLOMITE_IRON_ORE_UPPER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.DOLOMITE_IRON_ORE_UPPER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DOLOMITE_IRON_ORE_MIDDLE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.DOLOMITE_IRON_ORE_MIDDLE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DOLOMITE_IRON_ORE_SMALL, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.DOLOMITE_IRON_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DOLOMITE_GOLD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.DOLOMITE_GOLD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DOLOMITE_GOLD_ORE_EXTRA, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.DOLOMITE_GOLD_ORE_EXTRA_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DOLOMITE_REDSTONE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.DOLOMITE_REDSTONE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DOLOMITE_REDSTONE_ORE_LOWER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.DOLOMITE_REDSTONE_ORE_LOWER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DOLOMITE_LAPIS_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.DOLOMITE_LAPIS_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));


// eclogite
        context.register(ADD_ECLOGITE_BLOCK, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.ECLOGITE_BLOCK_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_ECLOGITE_COAL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.ECLOGITE_COAL_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_ECLOGITE_COPPER_SMALL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.ECLOGITE_COPPER_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_ECLOGITE_COPPER_ORE_LARGE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.ECLOGITE_COPPER_ORE_LARGE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_ECLOGITE_IRON_ORE_UPPER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.ECLOGITE_IRON_ORE_UPPER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_ECLOGITE_IRON_ORE_MIDDLE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.ECLOGITE_IRON_ORE_MIDDLE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_ECLOGITE_IRON_ORE_SMALL, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.ECLOGITE_IRON_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_ECLOGITE_GOLD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.ECLOGITE_GOLD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_ECLOGITE_GOLD_ORE_EXTRA, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.ECLOGITE_GOLD_ORE_EXTRA_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_ECLOGITE_REDSTONE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.ECLOGITE_REDSTONE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_ECLOGITE_REDSTONE_ORE_LOWER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.ECLOGITE_REDSTONE_ORE_LOWER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_ECLOGITE_LAPIS_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.ECLOGITE_LAPIS_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));


// greywacke
        context.register(ADD_GREYWACKE_BLOCK, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GREYWACKE_BLOCK_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GREYWACKE_COAL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GREYWACKE_COAL_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GREYWACKE_COPPER_SMALL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GREYWACKE_COPPER_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GREYWACKE_COPPER_ORE_LARGE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GREYWACKE_COPPER_ORE_LARGE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GREYWACKE_IRON_ORE_UPPER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GREYWACKE_IRON_ORE_UPPER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GREYWACKE_IRON_ORE_MIDDLE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GREYWACKE_IRON_ORE_MIDDLE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GREYWACKE_IRON_ORE_SMALL, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GREYWACKE_IRON_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GREYWACKE_GOLD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GREYWACKE_GOLD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GREYWACKE_GOLD_ORE_EXTRA, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GREYWACKE_GOLD_ORE_EXTRA_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GREYWACKE_REDSTONE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GREYWACKE_REDSTONE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GREYWACKE_REDSTONE_ORE_LOWER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GREYWACKE_REDSTONE_ORE_LOWER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GREYWACKE_LAPIS_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GREYWACKE_LAPIS_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        // komatiite
        context.register(ADD_KOMATIITE_BLOCK, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.KOMATIITE_BLOCK_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_KOMATIITE_COAL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.KOMATIITE_COAL_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_KOMATIITE_COPPER_SMALL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.KOMATIITE_COPPER_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_KOMATIITE_COPPER_ORE_LARGE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.KOMATIITE_COPPER_ORE_LARGE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_KOMATIITE_IRON_ORE_UPPER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.KOMATIITE_IRON_ORE_UPPER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_KOMATIITE_IRON_ORE_MIDDLE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.KOMATIITE_IRON_ORE_MIDDLE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_KOMATIITE_IRON_ORE_SMALL, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.KOMATIITE_IRON_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_KOMATIITE_GOLD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.KOMATIITE_GOLD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_KOMATIITE_GOLD_ORE_EXTRA, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.KOMATIITE_GOLD_ORE_EXTRA_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_KOMATIITE_REDSTONE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.KOMATIITE_REDSTONE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_KOMATIITE_REDSTONE_ORE_LOWER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.KOMATIITE_REDSTONE_ORE_LOWER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_KOMATIITE_LAPIS_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.KOMATIITE_LAPIS_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        // dacite
        context.register(ADD_DACITE_BLOCK, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.DACITE_BLOCK_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DACITE_COAL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.DACITE_COAL_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DACITE_COPPER_SMALL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.DACITE_COPPER_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DACITE_COPPER_ORE_LARGE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.DACITE_COPPER_ORE_LARGE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DACITE_IRON_ORE_UPPER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.DACITE_IRON_ORE_UPPER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DACITE_IRON_ORE_MIDDLE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.DACITE_IRON_ORE_MIDDLE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DACITE_IRON_ORE_SMALL, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.DACITE_IRON_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DACITE_GOLD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.DACITE_GOLD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DACITE_GOLD_ORE_EXTRA, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.DACITE_GOLD_ORE_EXTRA_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DACITE_REDSTONE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.DACITE_REDSTONE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DACITE_REDSTONE_ORE_LOWER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.DACITE_REDSTONE_ORE_LOWER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DACITE_LAPIS_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.DACITE_LAPIS_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //black granite
        context.register(ADD_BLACK_GRANITE_BLOCK, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.BLACK_GRANITE_BLOCK_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLACK_GRANITE_IRON_ORE_MIDDLE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.BLACK_GRANITE_IRON_ORE_MIDDLE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLACK_GRANITE_IRON_ORE_SMALL, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.BLACK_GRANITE_IRON_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLACK_GRANITE_GOLD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.BLACK_GRANITE_GOLD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLACK_GRANITE_GOLD_ORE_LOWER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.BLACK_GRANITE_GOLD_ORE_LOWER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLACK_GRANITE_REDSTONE_ORE_LOWER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.BLACK_GRANITE_REDSTONE_ORE_LOWER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLACK_GRANITE_LAPIS_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.BLACK_GRANITE_LAPIS_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLACK_GRANITE_DIAMOND_ORE_SMALL, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.BLACK_GRANITE_DIAMOND_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLACK_GRANITE_DIAMOND_ORE_LARGE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.BLACK_GRANITE_DIAMOND_ORE_LARGE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLACK_GRANITE_DIAMOND_ORE_BURIED, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.BLACK_GRANITE_DIAMOND_ORE_BURIED_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLACK_GRANITE_DIAMOND_ORE_MEDIUM, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.BLACK_GRANITE_DIAMOND_ORE_MEDIUM_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLACK_GRANITE_EMERALD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.BLACK_GRANITE_EMERALD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

//gabbro
        context.register(ADD_GABBRO_BLOCK, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GABBRO_BLOCK_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GABBRO_IRON_ORE_MIDDLE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GABBRO_IRON_ORE_MIDDLE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GABBRO_IRON_ORE_SMALL, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GABBRO_IRON_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GABBRO_GOLD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GABBRO_GOLD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GABBRO_GOLD_ORE_LOWER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GABBRO_GOLD_ORE_LOWER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GABBRO_REDSTONE_ORE_LOWER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GABBRO_REDSTONE_ORE_LOWER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GABBRO_LAPIS_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GABBRO_LAPIS_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GABBRO_DIAMOND_ORE_SMALL, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GABBRO_DIAMOND_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GABBRO_DIAMOND_ORE_LARGE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GABBRO_DIAMOND_ORE_LARGE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GABBRO_DIAMOND_ORE_BURIED, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GABBRO_DIAMOND_ORE_BURIED_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GABBRO_DIAMOND_ORE_MEDIUM, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GABBRO_DIAMOND_ORE_MEDIUM_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GABBRO_EMERALD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GABBRO_EMERALD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

//gneiss
        context.register(ADD_GNEISS_BLOCK, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GNEISS_BLOCK_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GNEISS_IRON_ORE_MIDDLE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GNEISS_IRON_ORE_MIDDLE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GNEISS_IRON_ORE_SMALL, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GNEISS_IRON_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GNEISS_GOLD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GNEISS_GOLD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GNEISS_GOLD_ORE_LOWER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GNEISS_GOLD_ORE_LOWER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GNEISS_REDSTONE_ORE_LOWER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GNEISS_REDSTONE_ORE_LOWER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GNEISS_LAPIS_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GNEISS_LAPIS_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GNEISS_DIAMOND_ORE_SMALL, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GNEISS_DIAMOND_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GNEISS_DIAMOND_ORE_LARGE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GNEISS_DIAMOND_ORE_LARGE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GNEISS_DIAMOND_ORE_BURIED, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GNEISS_DIAMOND_ORE_BURIED_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GNEISS_DIAMOND_ORE_MEDIUM, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GNEISS_DIAMOND_ORE_MEDIUM_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GNEISS_EMERALD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.GNEISS_EMERALD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(UndergroundBiomesConstructsReworked.MODID, name));
    }
}
