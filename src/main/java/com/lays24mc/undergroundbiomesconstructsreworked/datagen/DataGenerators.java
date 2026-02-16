package com.lays24mc.undergroundbiomesconstructsreworked.datagen;


import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

//@EventBusSubscriber(modid = MoreWorldConstructs.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
@EventBusSubscriber(modid = UndergroundBiomesConstructsReworked.MODID)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new UBCDatapackProvider(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new UBCRecipeBuilder(packOutput, lookupProvider));

        BlockTagsProvider blockTagsProvider = new UBCBlockTagProvider(packOutput, lookupProvider, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new UBCItemTagProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));

        generator.addProvider(event.includeClient(), new UBCBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new UBCItemModelProvider(packOutput, existingFileHelper));
    }
}
