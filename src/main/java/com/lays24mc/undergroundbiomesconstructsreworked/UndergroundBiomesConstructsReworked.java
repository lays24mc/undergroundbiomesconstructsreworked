package com.lays24mc.undergroundbiomesconstructsreworked;

import com.lays24mc.undergroundbiomesconstructsreworked.block.*;
import com.lays24mc.undergroundbiomesconstructsreworked.item.UBCItems;
import com.mojang.logging.LogUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.Collection;

@Mod(UndergroundBiomesConstructsReworked.MODID)
public class UndergroundBiomesConstructsReworked {
    public static final String MODID = "undergroundbiomesconstructsreworked";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.createItems(MODID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public UndergroundBiomesConstructsReworked(IEventBus modEventBus, ModContainer modContainer) {
        LOGGER.info("SETUP More World Constructs");
        modEventBus.addListener(this::commonSetup);

        //register event
        UBCItems.register(modEventBus);

        SoapstoneBlocks.register(modEventBus);
        RhyoliteBlocks.register(modEventBus);
        RedGraniteBlocks.register(modEventBus);
        QuartziteBlocks.register(modEventBus);
        MigmatiteBlocks.register(modEventBus);
        MarbleBlocks.register(modEventBus);
        LimestoneBlocks.register(modEventBus);
        SiltstoneBlocks.register(modEventBus);
        BluechistBlocks.register(modEventBus);
        GreenschistBlocks.register(modEventBus);
        ChalkBlocks.register(modEventBus);

        CREATIVE_MODE_TABS.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);
    }

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CREACTIVE_TAB = CREATIVE_MODE_TABS.register(
            "undergroundbiomesconstructsreworked",
            () ->
                    CreativeModeTab
                            .builder()
                            .withTabsBefore(CreativeModeTabs.COMBAT)
                            .icon(() -> new ItemStack(SoapstoneBlocks.SOAPSTONE_BLOCK.get()))
                            .displayItems((parameters, output) -> {
                                output.acceptAll(buildCreativeTabList());
                            })
                            .title(Component.translatable("itemGroup.undergroundbiomesconstructsreworked"))
                            .build()
    );

    private void commonSetup(final FMLCommonSetupEvent event) {}

    private static final Collection<ItemStack> buildCreativeTabList() {
        Collection<ItemStack> tabEntries = new ArrayList<ItemStack>();
        UBCItems.ITEMS
                .getEntries()
                .forEach(item -> tabEntries.add(new ItemStack(item.get())));
        return tabEntries;
    }

    @EventBusSubscriber(modid = MODID, value = Dist.CLIENT)
    public class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {}

}
