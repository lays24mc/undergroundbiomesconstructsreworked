package com.lays24mc.undergroundbiomesconstructsreworked.datagen;


import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

//@EventBusSubscriber(modid = MoreWorldConstructs.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
@EventBusSubscriber(modid = UndergroundBiomesConstructsReworked.MODID)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherClientData(GatherDataEvent.Client event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(true, new UBCDatapackProvider(packOutput, lookupProvider));
        generator.addProvider(true, new UBCRecipeProvider.Runner(packOutput, lookupProvider));

        BlockTagsProvider blockTagsProvider = new UBCBlockTagProvider(packOutput, lookupProvider);
        generator.addProvider(true, blockTagsProvider);
        generator.addProvider(true, new UBCItemTagProvider(packOutput, lookupProvider));
        generator.addProvider(true, new UBCModelProvider(packOutput));
    }

    @SubscribeEvent
    public static void gatherServerData(GatherDataEvent.Server event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(true, new UBCDatapackProvider(packOutput, lookupProvider));
        generator.addProvider(true, new UBCRecipeProvider.Runner(packOutput, lookupProvider));

        BlockTagsProvider blockTagsProvider = new UBCBlockTagProvider(packOutput, lookupProvider);
        generator.addProvider(true, blockTagsProvider);
        generator.addProvider(true, new UBCItemTagProvider(packOutput, lookupProvider));

        generator.addProvider(true, new UBCModelProvider(packOutput));
    }
}
