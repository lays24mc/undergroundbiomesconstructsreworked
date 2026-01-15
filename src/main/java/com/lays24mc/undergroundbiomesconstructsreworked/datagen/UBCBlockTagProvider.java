package com.lays24mc.undergroundbiomesconstructsreworked.datagen;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.*;
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
                .add(SoapstoneBlocks.SOAPSTONE_COPPER_ORE.get())
                .add(SoapstoneBlocks.SOAPSTONE_IRON_ORE.get())
                .add(SoapstoneBlocks.SOAPSTONE_GOLD_ORE.get())
                .add(SoapstoneBlocks.SOAPSTONE_REDSTONE_ORE.get())
                .add(SoapstoneBlocks.SOAPSTONE_LAPIS_ORE.get())

                .add(RhyoliteBlocks.RHYOLITE_BLOCK.get())
                .add(RhyoliteBlocks.RHYOLITE_COBBLE_BLOCK.get())
                .add(RhyoliteBlocks.RHYOLITE_BRICK_BLOCK.get())
                .add(RhyoliteBlocks.RHYOLITE_COAL_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_COPPER_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_IRON_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_GOLD_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_REDSTONE_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_LAPIS_ORE.get())

                .add(RedGraniteBlocks.RED_GRANITE_BLOCK.get())
                .add(RedGraniteBlocks.RED_GRANITE_COBBLE_BLOCK.get())
                .add(RedGraniteBlocks.RED_GRANITE_BRICK_BLOCK.get())
                .add(RedGraniteBlocks.RED_GRANITE_IRON_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_GOLD_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_REDSTONE_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_LAPIS_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_DIAMOND_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_EMERALD_ORE.get())

                .add(QuartziteBlocks.QUARTZITE_BLOCK.get())
                .add(QuartziteBlocks.QUARTZITE_COBBLE_BLOCK.get())
                .add(QuartziteBlocks.QUARTZITE_BRICK_BLOCK.get())
                .add(QuartziteBlocks.QUARTZITE_IRON_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_GOLD_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_REDSTONE_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_LAPIS_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_DIAMOND_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_EMERALD_ORE.get())

                .add(MigmatiteBlocks.MIGMATITE_BLOCK.get())
                .add(MigmatiteBlocks.MIGMATITE_COBBLE_BLOCK.get())
                .add(MigmatiteBlocks.MIGMATITE_BRICK_BLOCK.get())
                .add(MigmatiteBlocks.MIGMATITE_IRON_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_GOLD_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_REDSTONE_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_LAPIS_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_DIAMOND_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_EMERALD_ORE.get())

                .add(MarbleBlocks.MARBLE_BLOCK.get())
                .add(MarbleBlocks.MARBLE_COBBLE_BLOCK.get())
                .add(MarbleBlocks.MARBLE_BRICK_BLOCK.get())
                .add(MarbleBlocks.MARBLE_COAL_ORE.get())
                .add(MarbleBlocks.MARBLE_COPPER_ORE.get())
                .add(MarbleBlocks.MARBLE_IRON_ORE.get())
                .add(MarbleBlocks.MARBLE_GOLD_ORE.get())
                .add(MarbleBlocks.MARBLE_REDSTONE_ORE.get())
                .add(MarbleBlocks.MARBLE_LAPIS_ORE.get())

                .add(LimestoneBlocks.LIMESTONE_BLOCK.get())
                .add(LimestoneBlocks.LIMESTONE_COAL_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_COPPER_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_IRON_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_GOLD_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_REDSTONE_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_LAPIS_ORE.get())

                .add(SiltstoneBlocks.SILTSTONE_BLOCK.get())
                .add(SiltstoneBlocks.SILTSTONE_COAL_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_COPPER_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_IRON_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_GOLD_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_REDSTONE_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_LAPIS_ORE.get())

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

                .add(MigmatiteBlocks.MIGMATITE_BLOCK_SLAB.get())
                .add(MigmatiteBlocks.MIGMATITE_COBBLE_SLAB.get())
                .add(MigmatiteBlocks.MIGMATITE_BRICK_SLAB.get())

                .add(MarbleBlocks.MARBLE_BLOCK_SLAB.get())
                .add(MarbleBlocks.MARBLE_COBBLE_SLAB.get())
                .add(MarbleBlocks.MARBLE_BRICK_SLAB.get())

                .add(LimestoneBlocks.LIMESTONE_BLOCK_SLAB.get())

                .add(SiltstoneBlocks.SILTSTONE_BLOCK_SLAB.get())

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

                .add(MigmatiteBlocks.MIGMATITE_STAIRS.get())
                .add(MigmatiteBlocks.MIGMATITE_COBBLE_STAIRS.get())
                .add(MigmatiteBlocks.MIGMATITE_BRICK_STAIRS.get())

                .add(MarbleBlocks.MARBLE_STAIRS.get())
                .add(MarbleBlocks.MARBLE_COBBLE_STAIRS.get())
                .add(MarbleBlocks.MARBLE_BRICK_STAIRS.get())

                .add(LimestoneBlocks.LIMESTONE_STAIRS.get())

                .add(SiltstoneBlocks.SILTSTONE_STAIRS.get())

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
                .add(QuartziteBlocks.QUARTZITE_BRICK_WALL.get())

                .add(MigmatiteBlocks.MIGMATITE_BLOCK_WALL.get())
                .add(MigmatiteBlocks.MIGMATITE_COBBLE_WALL.get())
                .add(MigmatiteBlocks.MIGMATITE_BRICK_WALL.get())

                .add(MarbleBlocks.MARBLE_BLOCK_WALL.get())
                .add(MarbleBlocks.MARBLE_COBBLE_WALL.get())
                .add(MarbleBlocks.MARBLE_BRICK_WALL.get())

                .add(LimestoneBlocks.LIMESTONE_BLOCK_WALL.get())

                .add(SiltstoneBlocks.SILTSTONE_BLOCK_WALL.get());

        //tools tag
        tag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(RedGraniteBlocks.RED_GRANITE_DIAMOND_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_DIAMOND_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_DIAMOND_ORE.get())
                .add(SoapstoneBlocks.SOAPSTONE_GOLD_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_GOLD_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_GOLD_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_GOLD_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_GOLD_ORE.get())
                .add(MarbleBlocks.MARBLE_GOLD_ORE.get())
                .add(SoapstoneBlocks.SOAPSTONE_REDSTONE_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_REDSTONE_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_REDSTONE_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_REDSTONE_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_REDSTONE_ORE.get())
                .add(MarbleBlocks.MARBLE_REDSTONE_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_REDSTONE_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_GOLD_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_REDSTONE_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_GOLD_ORE.get());

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(RedGraniteBlocks.RED_GRANITE_LAPIS_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_LAPIS_ORE.get())
                .add(SoapstoneBlocks.SOAPSTONE_LAPIS_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_LAPIS_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_LAPIS_ORE.get())
                .add(MarbleBlocks.MARBLE_LAPIS_ORE.get())
                .add(SoapstoneBlocks.SOAPSTONE_IRON_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_IRON_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_IRON_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_IRON_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_IRON_ORE.get())
                .add(MarbleBlocks.MARBLE_IRON_ORE.get())
                .add(SoapstoneBlocks.SOAPSTONE_COPPER_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_COPPER_ORE.get())
                .add(MarbleBlocks.MARBLE_COPPER_ORE.get())
                .add(SoapstoneBlocks.SOAPSTONE_COAL_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_COAL_ORE.get())
                .add(MarbleBlocks.MARBLE_COAL_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_COAL_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_LAPIS_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_IRON_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_COPPER_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_COAL_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_LAPIS_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_IRON_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_COPPER_ORE.get());

        tag(BlockTags.INCORRECT_FOR_STONE_TOOL)
                .add(RedGraniteBlocks.RED_GRANITE_DIAMOND_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_DIAMOND_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_DIAMOND_ORE.get())
                .add(SoapstoneBlocks.SOAPSTONE_GOLD_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_GOLD_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_GOLD_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_GOLD_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_GOLD_ORE.get())
                .add(MarbleBlocks.MARBLE_GOLD_ORE.get())
                .add(SoapstoneBlocks.SOAPSTONE_REDSTONE_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_REDSTONE_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_REDSTONE_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_REDSTONE_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_REDSTONE_ORE.get())
                .add(MarbleBlocks.MARBLE_REDSTONE_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_GOLD_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_REDSTONE_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_GOLD_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_REDSTONE_ORE.get());

        tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
                .add(RedGraniteBlocks.RED_GRANITE_DIAMOND_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_DIAMOND_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_DIAMOND_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_LAPIS_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_LAPIS_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_LAPIS_ORE.get())
                .add(SoapstoneBlocks.SOAPSTONE_GOLD_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_GOLD_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_GOLD_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_GOLD_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_GOLD_ORE.get())
                .add(MarbleBlocks.MARBLE_GOLD_ORE.get())
                .add(SoapstoneBlocks.SOAPSTONE_REDSTONE_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_REDSTONE_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_REDSTONE_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_REDSTONE_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_REDSTONE_ORE.get())
                .add(MarbleBlocks.MARBLE_REDSTONE_ORE.get())
                .add(SoapstoneBlocks.SOAPSTONE_IRON_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_IRON_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_IRON_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_IRON_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_IRON_ORE.get())
                .add(MarbleBlocks.MARBLE_IRON_ORE.get())
                .add(SoapstoneBlocks.SOAPSTONE_COPPER_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_COPPER_ORE.get())
                .add(MarbleBlocks.MARBLE_COPPER_ORE.get())
                .add(SoapstoneBlocks.SOAPSTONE_COAL_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_COAL_ORE.get())
                .add(MarbleBlocks.MARBLE_COAL_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_GOLD_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_REDSTONE_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_IRON_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_COPPER_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_COAL_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_GOLD_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_REDSTONE_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_IRON_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_COPPER_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_COAL_ORE.get());

        tag(BlockTags.INCORRECT_FOR_IRON_TOOL);

        tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
                .add(RedGraniteBlocks.RED_GRANITE_DIAMOND_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_DIAMOND_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_DIAMOND_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_LAPIS_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_LAPIS_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_LAPIS_ORE.get())
                .add(SoapstoneBlocks.SOAPSTONE_GOLD_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_GOLD_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_GOLD_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_GOLD_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_GOLD_ORE.get())
                .add(MarbleBlocks.MARBLE_GOLD_ORE.get())
                .add(SoapstoneBlocks.SOAPSTONE_REDSTONE_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_REDSTONE_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_REDSTONE_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_REDSTONE_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_REDSTONE_ORE.get())
                .add(MarbleBlocks.MARBLE_REDSTONE_ORE.get())
                .add(SoapstoneBlocks.SOAPSTONE_IRON_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_IRON_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_IRON_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_IRON_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_IRON_ORE.get())
                .add(MarbleBlocks.MARBLE_IRON_ORE.get())
                .add(SoapstoneBlocks.SOAPSTONE_COPPER_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_COPPER_ORE.get())
                .add(MarbleBlocks.MARBLE_COPPER_ORE.get())
                .add(SoapstoneBlocks.SOAPSTONE_COAL_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_COAL_ORE.get())
                .add(MarbleBlocks.MARBLE_COAL_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_GOLD_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_REDSTONE_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_IRON_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_COPPER_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_COAL_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_GOLD_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_REDSTONE_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_IRON_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_COPPER_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_COAL_ORE.get());

        tag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL);

        tag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL);

        // Ore tags
        tag(BlockTags.COAL_ORES)
                .add(SoapstoneBlocks.SOAPSTONE_COAL_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_COAL_ORE.get())
                .add(MarbleBlocks.MARBLE_COAL_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_COAL_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_COAL_ORE.get());

        tag(BlockTags.COPPER_ORES)
                .add(SoapstoneBlocks.SOAPSTONE_COPPER_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_COPPER_ORE.get())
                .add(MarbleBlocks.MARBLE_COPPER_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_COPPER_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_COPPER_ORE.get());

        tag(BlockTags.IRON_ORES)
                .add(SoapstoneBlocks.SOAPSTONE_IRON_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_IRON_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_IRON_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_IRON_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_IRON_ORE.get())
                .add(MarbleBlocks.MARBLE_IRON_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_IRON_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_IRON_ORE.get());

        tag(BlockTags.GOLD_ORES)
                .add(SoapstoneBlocks.SOAPSTONE_GOLD_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_GOLD_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_GOLD_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_GOLD_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_GOLD_ORE.get())
                .add(MarbleBlocks.MARBLE_GOLD_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_GOLD_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_GOLD_ORE.get());

        tag(BlockTags.DIAMOND_ORES)
                .add(RedGraniteBlocks.RED_GRANITE_DIAMOND_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_DIAMOND_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_DIAMOND_ORE.get());

        tag(BlockTags.EMERALD_ORES)
                .add(RedGraniteBlocks.RED_GRANITE_EMERALD_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_EMERALD_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_EMERALD_ORE.get());

        tag(BlockTags.LAPIS_ORES)
                .add(RedGraniteBlocks.RED_GRANITE_LAPIS_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_LAPIS_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_LAPIS_ORE.get());

        tag(BlockTags.REDSTONE_ORES)
                .add(RedGraniteBlocks.RED_GRANITE_REDSTONE_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_REDSTONE_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_REDSTONE_ORE.get());

        // Defines blocks considered as overworld base stone for generation purposes
        tag(BlockTags.BASE_STONE_OVERWORLD)
                .add(SoapstoneBlocks.SOAPSTONE_BLOCK.get())
                .add(RhyoliteBlocks.RHYOLITE_BLOCK.get())
                .add(RedGraniteBlocks.RED_GRANITE_BLOCK.get())
                .add(QuartziteBlocks.QUARTZITE_BLOCK.get())
                .add(MigmatiteBlocks.MIGMATITE_BLOCK.get())
                .add(MarbleBlocks.MARBLE_BLOCK.get())
                .add(LimestoneBlocks.LIMESTONE_BLOCK.get())
                .add(SiltstoneBlocks.SILTSTONE_BLOCK.get());

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
                .add(QuartziteBlocks.QUARTZITE_COBBLE_STAIRS.get())

                .add(MigmatiteBlocks.MIGMATITE_STAIRS.get())
                .add(MigmatiteBlocks.MIGMATITE_BRICK_STAIRS.get())
                .add(MigmatiteBlocks.MIGMATITE_COBBLE_STAIRS.get())

                .add(MarbleBlocks.MARBLE_STAIRS.get())
                .add(MarbleBlocks.MARBLE_BRICK_STAIRS.get())
                .add(MarbleBlocks.MARBLE_COBBLE_STAIRS.get())

                .add(LimestoneBlocks.LIMESTONE_STAIRS.get())

                .add(SiltstoneBlocks.SILTSTONE_STAIRS.get());

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
                .add(QuartziteBlocks.QUARTZITE_BRICK_SLAB.get())

                .add(MigmatiteBlocks.MIGMATITE_BLOCK_SLAB.get())
                .add(MigmatiteBlocks.MIGMATITE_COBBLE_SLAB.get())
                .add(MigmatiteBlocks.MIGMATITE_BRICK_SLAB.get())

                .add(MarbleBlocks.MARBLE_BLOCK_SLAB.get())
                .add(MarbleBlocks.MARBLE_COBBLE_SLAB.get())
                .add(MarbleBlocks.MARBLE_BRICK_SLAB.get())

                .add(LimestoneBlocks.LIMESTONE_BLOCK_SLAB.get())

                .add(SiltstoneBlocks.SILTSTONE_BLOCK_SLAB.get());

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
                .add(QuartziteBlocks.QUARTZITE_BRICK_WALL.get())

                .add(MigmatiteBlocks.MIGMATITE_BLOCK_WALL.get())
                .add(MigmatiteBlocks.MIGMATITE_COBBLE_WALL.get())
                .add(MigmatiteBlocks.MIGMATITE_BRICK_WALL.get())

                .add(MarbleBlocks.MARBLE_BLOCK_WALL.get())
                .add(MarbleBlocks.MARBLE_COBBLE_WALL.get())
                .add(MarbleBlocks.MARBLE_BRICK_WALL.get())

                .add(LimestoneBlocks.LIMESTONE_BLOCK_WALL.get())

                .add(SiltstoneBlocks.SILTSTONE_BLOCK_WALL.get());

        // Identifies all buttons
        tag(BlockTags.BUTTONS)
                .add(SoapstoneBlocks.SOAPSTONE_STONE_BUTTON.get())
                .add(RhyoliteBlocks.RHYOLITE_BLOCK_SLAB.get())
                .add(RedGraniteBlocks.RED_GRANITE_STONE_BUTTON.get())
                .add(QuartziteBlocks.QUARTZITE_STONE_BUTTON.get())
                .add(MigmatiteBlocks.MIGMATITE_STONE_BUTTON.get())
                .add(MarbleBlocks.MARBLE_STONE_BUTTON.get())
                .add(LimestoneBlocks.LIMESTONE_STONE_BUTTON.get())
                .add(SiltstoneBlocks.SILTSTONE_STONE_BUTTON.get());
    }
}
