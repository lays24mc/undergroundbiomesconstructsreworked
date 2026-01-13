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

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RHYOLITE_BLOCK_KEY = registerKey("rhyolite_block");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RED_GRANITE_BLOCK_KEY = registerKey("red_granite_block");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_QUARTZITE_BLOCK_KEY = registerKey("quartzite_block");

    //public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SOAPSTONE_BLOCK_KEY = registerKey("soapstone_block");
    //public static final ResourceKey<ConfiguredFeature<?, ?>> END_SOAPSTONE_BLOCK_KEY = registerKey("soapstone_block");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context){

        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);

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



        //Rhyolite
        List<OreConfiguration.TargetBlockState> overworldRhyoliteBlock = List.of(
                OreConfiguration.target(stoneReplaceables, RhyoliteBlocks.RHYOLITE_BLOCK.get().defaultBlockState()));

        register(context, OVERWORLD_RHYOLITE_BLOCK_KEY, Feature.ORE, new OreConfiguration(overworldRhyoliteBlock, 64));

        //Red Granite
        List<OreConfiguration.TargetBlockState> overworldRedGraniteBlock = List.of(
                OreConfiguration.target(stoneReplaceables, RedGraniteBlocks.RED_GRANITE_BLOCK.get().defaultBlockState()));

        register(context, OVERWORLD_RED_GRANITE_BLOCK_KEY, Feature.ORE, new OreConfiguration(overworldRedGraniteBlock, 64));

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
