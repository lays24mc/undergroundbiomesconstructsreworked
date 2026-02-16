package com.lays24mc.undergroundbiomesconstructsreworked.datagen;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.item.UBCItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class UBCItemModelProvider extends ItemModelProvider {
    public UBCItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, UndergroundBiomesConstructsReworked.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(UBCItems.LIGNITE_COAL.get());
    }
}
