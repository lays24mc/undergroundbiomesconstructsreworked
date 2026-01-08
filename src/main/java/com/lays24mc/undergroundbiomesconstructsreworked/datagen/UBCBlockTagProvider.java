package com.lays24mc.undergroundbiomesconstructsreworked.datagen;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.QuartziteBlocks;
import com.lays24mc.undergroundbiomesconstructsreworked.block.RedGraniteBlocks;
import com.lays24mc.undergroundbiomesconstructsreworked.block.RhyoliteBlocks;
import com.lays24mc.undergroundbiomesconstructsreworked.block.SoapstoneBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class UBCBlockTagProvider extends BlockTagsProvider {
    public UBCBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, UndergroundBiomesConstructsReworked.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        // ------------------------------------------------------------
        // Tags
        // ------------------------------------------------------------

        // All blocks that should be mined with a pickaxe
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(SoapstoneBlocks.SOAPSTONE_BLOCK.get())
                .add(SoapstoneBlocks.SOAPSTONE_COBBLE_BLOCK.get())
                .add(SoapstoneBlocks.SOAPSTONE_BRICK_BLOCK.get())
                .add(SoapstoneBlocks.SOAPSTONE_COAL_ORE.get())

                .add(RhyoliteBlocks.RHYOLITE_BLOCK.get())
                .add(RhyoliteBlocks.RHYOLITE_COBBLE_BLOCK.get())
                .add(RhyoliteBlocks.RHYOLITE_BRICK_BLOCK.get())

                .add(RedGraniteBlocks.RED_GRANITE_BLOCK.get())
                .add(RedGraniteBlocks.RED_GRANITE_COBBLE_BLOCK.get())
                .add(RedGraniteBlocks.RED_GRANITE_BRICK_BLOCK.get())

                .add(QuartziteBlocks.QUARTZITE_BLOCK.get())
                .add(QuartziteBlocks.QUARTZITE_COBBLE_BLOCK.get())
                .add(QuartziteBlocks.QUARTZITE_BRICK_BLOCK.get())

                // Slabs
                .add(SoapstoneBlocks.SOAPSTONE_BLOCK_SLAB.get())
                .add(SoapstoneBlocks.SOAPSTONE_COBBLE_SLAB.get())
                .add(SoapstoneBlocks.SOAPSTONE_BRICK_SLAB.get())

                .add(RhyoliteBlocks.RHYOLITE_BLOCK_SLAB.get())
                .add(RhyoliteBlocks.RHYOLITE_COBBLE_SLAB.get())
                .add(RhyoliteBlocks.RHYOLITE_BRICK_SLAB.get())

                .add(RedGraniteBlocks.RED_GRANITE_BLOCK_SLAB.get())
                .add(RedGraniteBlocks.RED_GRANITE_COBBLE_SLAB.get())
                .add(RedGraniteBlocks.RED_GRANITE_BRICK_SLAB.get())

                .add(QuartziteBlocks.QUARTZITE_BLOCK_SLAB.get())
                .add(QuartziteBlocks.QUARTZITE_COBBLE_SLAB.get())
                .add(QuartziteBlocks.QUARTZITE_BRICK_SLAB.get())

                // Stairs
                .add(SoapstoneBlocks.SOAPSTONE_STAIRS.get())
                .add(SoapstoneBlocks.SOAPSTONE_BRICK_STAIRS.get())
                .add(SoapstoneBlocks.SOAPSTONE_COBBLE_STAIRS.get())

                .add(RhyoliteBlocks.RHYOLITE_STAIRS.get())
                .add(RhyoliteBlocks.RHYOLITE_COBBLE_STAIRS.get())
                .add(RhyoliteBlocks.RHYOLITE_BRICK_STAIRS.get())

                .add(RedGraniteBlocks.RED_GRANITE_STAIRS.get())
                .add(RedGraniteBlocks.RED_GRANITE_COBBLE_STAIRS.get())
                .add(RedGraniteBlocks.RED_GRANITE_BRICK_STAIRS.get())

                .add(QuartziteBlocks.QUARTZITE_STAIRS.get())
                .add(QuartziteBlocks.QUARTZITE_COBBLE_STAIRS.get())
                .add(QuartziteBlocks.QUARTZITE_BRICK_STAIRS.get())

                // Walls
                .add(SoapstoneBlocks.SOAPSTONE_BLOCK_WALL.get())
                .add(SoapstoneBlocks.SOAPSTONE_COBBLE_WALL.get())
                .add(SoapstoneBlocks.SOAPSTONE_BRICK_WALL.get())

                .add(RhyoliteBlocks.RHYOLITE_BLOCK_WALL.get())
                .add(RhyoliteBlocks.RHYOLITE_COBBLE_WALL.get())
                .add(RhyoliteBlocks.RHYOLITE_BRICK_WALL.get())

                .add(RedGraniteBlocks.RED_GRANITE_BLOCK_WALL.get())
                .add(RedGraniteBlocks.RED_GRANITE_COBBLE_WALL.get())
                .add(RedGraniteBlocks.RED_GRANITE_BRICK_WALL.get())

                .add(QuartziteBlocks.QUARTZITE_BLOCK_WALL.get())
                .add(QuartziteBlocks.QUARTZITE_COBBLE_WALL.get())
                .add(QuartziteBlocks.QUARTZITE_BRICK_WALL.get());

        // Defines blocks considered as overworld base stone for generation purposes
        tag(BlockTags.BASE_STONE_OVERWORLD)
                .add(SoapstoneBlocks.SOAPSTONE_BLOCK.get())
                .add(RhyoliteBlocks.RHYOLITE_BLOCK.get())
                .add(RedGraniteBlocks.RED_GRANITE_BLOCK.get())
                .add(QuartziteBlocks.QUARTZITE_BLOCK.get());

        // Identifies all stairs
        tag(BlockTags.STAIRS)
                .add(SoapstoneBlocks.SOAPSTONE_STAIRS.get())
                .add(SoapstoneBlocks.SOAPSTONE_BRICK_STAIRS.get())
                .add(SoapstoneBlocks.SOAPSTONE_COBBLE_STAIRS.get())

                .add(RhyoliteBlocks.RHYOLITE_STAIRS.get())
                .add(RhyoliteBlocks.RHYOLITE_BRICK_STAIRS.get())
                .add(RhyoliteBlocks.RHYOLITE_COBBLE_STAIRS.get())

                .add(RedGraniteBlocks.RED_GRANITE_STAIRS.get())
                .add(RedGraniteBlocks.RED_GRANITE_BRICK_STAIRS.get())
                .add(RedGraniteBlocks.RED_GRANITE_COBBLE_STAIRS.get())

                .add(QuartziteBlocks.QUARTZITE_STAIRS.get())
                .add(QuartziteBlocks.QUARTZITE_BRICK_STAIRS.get())
                .add(QuartziteBlocks.QUARTZITE_COBBLE_STAIRS.get());

        // Identifies all slabs
        tag(BlockTags.SLABS)
                .add(SoapstoneBlocks.SOAPSTONE_BLOCK_SLAB.get())
                .add(SoapstoneBlocks.SOAPSTONE_COBBLE_SLAB.get())
                .add(SoapstoneBlocks.SOAPSTONE_BRICK_SLAB.get())

                .add(RedGraniteBlocks.RED_GRANITE_BLOCK_SLAB.get())
                .add(RedGraniteBlocks.RED_GRANITE_COBBLE_SLAB.get())
                .add(RedGraniteBlocks.RED_GRANITE_BRICK_SLAB.get())

                .add(RhyoliteBlocks.RHYOLITE_BLOCK_SLAB.get())
                .add(RhyoliteBlocks.RHYOLITE_COBBLE_SLAB.get())
                .add(RhyoliteBlocks.RHYOLITE_BRICK_SLAB.get())

                .add(QuartziteBlocks.QUARTZITE_BLOCK_SLAB.get())
                .add(QuartziteBlocks.QUARTZITE_COBBLE_SLAB.get())
                .add(QuartziteBlocks.QUARTZITE_BRICK_SLAB.get());

        // Identifies all walls
        tag(BlockTags.WALLS)
                .add(SoapstoneBlocks.SOAPSTONE_BLOCK_WALL.get())
                .add(SoapstoneBlocks.SOAPSTONE_COBBLE_WALL.get())
                .add(SoapstoneBlocks.SOAPSTONE_BRICK_WALL.get())

                .add(RhyoliteBlocks.RHYOLITE_BLOCK_WALL.get())
                .add(RhyoliteBlocks.RHYOLITE_COBBLE_WALL.get())
                .add(RhyoliteBlocks.RHYOLITE_BRICK_WALL.get())

                .add(RedGraniteBlocks.RED_GRANITE_BLOCK_WALL.get())
                .add(RedGraniteBlocks.RED_GRANITE_COBBLE_WALL.get())
                .add(RedGraniteBlocks.RED_GRANITE_BRICK_WALL.get())

                .add(QuartziteBlocks.QUARTZITE_BLOCK_WALL.get())
                .add(QuartziteBlocks.QUARTZITE_COBBLE_WALL.get())
                .add(QuartziteBlocks.QUARTZITE_BRICK_WALL.get());

        // Identifies all buttons
        tag(BlockTags.BUTTONS)
                .add(SoapstoneBlocks.SOAPSTONE_STONE_BUTTON.get())
                .add(RhyoliteBlocks.RHYOLITE_BLOCK_SLAB.get())
                .add(RedGraniteBlocks.RED_GRANITE_STONE_BUTTON.get())
                .add(QuartziteBlocks.QUARTZITE_STONE_BUTTON.get());
    }
}
