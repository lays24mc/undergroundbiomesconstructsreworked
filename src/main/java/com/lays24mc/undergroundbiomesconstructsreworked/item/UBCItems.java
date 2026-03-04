package com.lays24mc.undergroundbiomesconstructsreworked.item;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.item.custom.FuelItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class UBCItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(UndergroundBiomesConstructsReworked.MODID);

    public static final DeferredItem<Item> LIGNITE_COAL = ITEMS.registerItem("lignite_coal",
            (properties) -> new FuelItem(properties, 1600));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
