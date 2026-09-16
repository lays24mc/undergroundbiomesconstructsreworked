package com.lays24mc.undergroundbiomesconstructsreworked.block.custom;

import com.lays24mc.undergroundbiomesconstructsreworked.item.UBCItems;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class StoneBlockRegistrar {
    private final DeferredRegister.Blocks blocks;

    public StoneBlockRegistrar(String modId) {
        this.blocks = DeferredRegister.createBlocks(modId);
    }

    public DeferredBlock<Block> registerBlock(String name, Supplier<Block> block) {
        DeferredBlock<Block> toReturn = blocks.register(name, block);
        UBCItems.ITEMS.registerSimpleBlockItem(toReturn);
        return toReturn;
    }

    public void register(IEventBus eventBus) {
        blocks.register(eventBus);
    }
}
