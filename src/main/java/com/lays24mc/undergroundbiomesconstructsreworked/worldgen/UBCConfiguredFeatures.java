package com.lays24mc.undergroundbiomesconstructsreworked.worldgen;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.RhyoliteBlocks;
import com.lays24mc.undergroundbiomesconstructsreworked.block.SoapstoneBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.BlockStateConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.neoforged.neoforge.common.Tags;

import java.util.List;

public class UBCConfiguredFeatures {
    // CF -> PF -> BM

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SOAPSTONE_BLOCK_KEY = registerKey("soapstone_block");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RHYOLITE_BLOCK_KEY = registerKey("rhyolite_block");

    //public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SOAPSTONE_BLOCK_KEY = registerKey("soapstone_block");
    //public static final ResourceKey<ConfiguredFeature<?, ?>> END_SOAPSTONE_BLOCK_KEY = registerKey("soapstone_block");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context){

        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);

        // Take a look always in the OreFeatures Class!

        //Soapstone
        List<OreConfiguration.TargetBlockState> overworldSoapstoneBlock = List.of(
                OreConfiguration.target(stoneReplaceables, SoapstoneBlocks.SOAPSTONE_BLOCK.get().defaultBlockState()));

        register(context, OVERWORLD_SOAPSTONE_BLOCK_KEY, Feature.ORE, new OreConfiguration(overworldSoapstoneBlock, 64));

        //Rhyolite
        List<OreConfiguration.TargetBlockState> overworldRhyoliteBlock = List.of(
                OreConfiguration.target(stoneReplaceables, RhyoliteBlocks.RHYOLITE_BLOCK.get().defaultBlockState()));

        register(context, OVERWORLD_RHYOLITE_BLOCK_KEY, Feature.ORE, new OreConfiguration(overworldRhyoliteBlock, 64));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(UndergroundBiomesConstructsReworked.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
