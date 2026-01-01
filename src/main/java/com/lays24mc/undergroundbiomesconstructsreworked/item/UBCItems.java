package com.lays24mc.undergroundbiomesconstructsreworked.item;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class UBCItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(UndergroundBiomesConstructsReworked.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
