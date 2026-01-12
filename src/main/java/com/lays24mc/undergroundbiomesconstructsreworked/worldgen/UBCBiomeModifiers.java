package com.lays24mc.undergroundbiomesconstructsreworked.worldgen;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biomes;
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

    public static final ResourceKey<BiomeModifier> ADD_RHYOLITE_BLOCK = registerKey("add_rhyolite_block");
    public static final ResourceKey<BiomeModifier> ADD_RED_GRANITE_BLOCK = registerKey("add_red_granite_block");
    public static final ResourceKey<BiomeModifier> ADD_QUARTZITE_BLOCK = registerKey("add_quartzite_block");

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
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.SOAPSTONE_COPPER_ORE_SMALL_PLACED_KEY)),
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


        //rhyolite
        context.register(ADD_RHYOLITE_BLOCK, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.RHYOLITE_BLOCK_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));

        //red granite
        context.register(ADD_RED_GRANITE_BLOCK, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.RED_GRANITE_BLOCK_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));

        //quartzite
        context.register(ADD_QUARTZITE_BLOCK, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(UBCPlacedFeatures.QUARTZITE_BLOCK_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));

    }


    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(UndergroundBiomesConstructsReworked.MODID, name));
    }
}
