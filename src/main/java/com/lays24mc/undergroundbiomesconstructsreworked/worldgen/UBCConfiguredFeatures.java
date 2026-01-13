package com.lays24mc.undergroundbiomesconstructsreworked.worldgen;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.QuartziteBlocks;
import com.lays24mc.undergroundbiomesconstructsreworked.block.RedGraniteBlocks;
import com.lays24mc.undergroundbiomesconstructsreworked.block.RhyoliteBlocks;
import com.lays24mc.undergroundbiomesconstructsreworked.block.SoapstoneBlocks;
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
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RED_GRANITE_REDSTONE_ORE_LOWER_KEY = registerKey("red_granite_redstone_ore_lower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RED_GRANITE_LAPIS_ORE_KEY = registerKey("red_granite_lapis_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RED_GRANITE_LAPIS_ORE_BURIED_KEY = registerKey("red_granite_lapis_ore_buried");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RED_GRANITE_DIAMOND_ORE_SMALL_KEY = registerKey("red_granite_diamond_ore_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RED_GRANITE_DIAMOND_ORE_LARGE_KEY = registerKey("red_granite_diamond_ore_large");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RED_GRANITE_DIAMOND_ORE_BURIED_KEY = registerKey("red_granite_diamond_ore_buried");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RED_GRANITE_DIAMOND_ORE_MEDIUM_KEY = registerKey("red_granite_diamond_ore_medium");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RED_GRANITE_EMERALD_ORE_KEY = registerKey("red_granite_emerald_ore");




    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_QUARTZITE_BLOCK_KEY = registerKey("quartzite_block");

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
                OreConfiguration.target(deepslateReplaceables, RedGraniteBlocks.RED_GRANITE_BLOCK.get().defaultBlockState()));

        register(context, OVERWORLD_RED_GRANITE_BLOCK_KEY, Feature.ORE, new OreConfiguration(overworldRedGraniteBlock, 64));

        List<OreConfiguration.TargetBlockState> redgraniteIronTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(RedGraniteBlocks.RED_GRANITE_BLOCK.get()),
                        RedGraniteBlocks.RED_GRANITE_IRON_ORE.get().defaultBlockState()));

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



        register(context, OVERWORLD_RED_GRANITE_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(redgraniteIronTargets, 9));
        register(context, OVERWORLD_RED_GRANITE_IRON_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(redgraniteIronTargets, 4));
        register(context, OVERWORLD_RED_GRANITE_GOLD_ORE_KEY, Feature.ORE, new OreConfiguration(redgraniteGoldTargets, 9));
        register(context, OVERWORLD_RED_GRANITE_GOLD_ORE_LOWER_KEY, Feature.ORE, new OreConfiguration(redgraniteGoldTargets, 4, 0.5f));
        register(context, OVERWORLD_RED_GRANITE_REDSTONE_ORE_LOWER_KEY, Feature.ORE, new OreConfiguration(redgraniteRedstoneTargets, 8));
        register(context, OVERWORLD_RED_GRANITE_LAPIS_ORE_KEY, Feature.ORE, new OreConfiguration(redgraniteLapisTargets, 7));
        register(context, OVERWORLD_RED_GRANITE_LAPIS_ORE_BURIED_KEY, Feature.ORE, new OreConfiguration(redgraniteLapisTargets, 7, 1.0F));
        register(context, OVERWORLD_RED_GRANITE_DIAMOND_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(redgraniteDiamondTargets, 4, 0.5F));
        register(context, OVERWORLD_RED_GRANITE_DIAMOND_ORE_LARGE_KEY, Feature.ORE, new OreConfiguration(redgraniteDiamondTargets, 12, 0.7F));
        register(context, OVERWORLD_RED_GRANITE_DIAMOND_ORE_BURIED_KEY, Feature.ORE, new OreConfiguration(redgraniteDiamondTargets, 8, 1.0F));
        register(context, OVERWORLD_RED_GRANITE_DIAMOND_ORE_MEDIUM_KEY, Feature.ORE, new OreConfiguration(redgraniteDiamondTargets, 8, 0.5F));
        register(context, OVERWORLD_RED_GRANITE_EMERALD_ORE_KEY, Feature.ORE, new OreConfiguration(redgraniteEmeraldTargets, 3));

        //Quartzite
        List<OreConfiguration.TargetBlockState> overworldQuartziteBlock = List.of(
                OreConfiguration.target(stoneReplaceables, QuartziteBlocks.QUARTZITE_BLOCK.get().defaultBlockState()));

        register(context, OVERWORLD_QUARTZITE_BLOCK_KEY, Feature.ORE, new OreConfiguration(overworldQuartziteBlock, 64));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(UndergroundBiomesConstructsReworked.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
