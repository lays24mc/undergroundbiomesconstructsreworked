package com.lays24mc.undergroundbiomesconstructsreworked.datagen;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.*;
import net.minecraft.core.HolderLookup;
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
        // Tags: All blocks that should be mined with a pickaxe
        // ------------------------------------------------------------
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
                .add(RedGraniteBlocks.RED_GRANITE_DIAMOND_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_EMERALD_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_IRON_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_GOLD_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_REDSTONE_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_LAPIS_ORE.get())

                .add(MigmatiteBlocks.MIGMATITE_BLOCK.get())
                .add(MigmatiteBlocks.MIGMATITE_COBBLE_BLOCK.get())
                .add(MigmatiteBlocks.MIGMATITE_BRICK_BLOCK.get())
                .add(MigmatiteBlocks.MIGMATITE_IRON_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_GOLD_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_REDSTONE_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_LAPIS_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_DIAMOND_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_EMERALD_ORE.get())

                .add(LigniteBlocks.LIGNITE_GOLD_ORE.get())
                .add(LigniteBlocks.LIGNITE_REDSTONE_ORE.get())
                .add(LigniteBlocks.LIGNITE_LAPIS_ORE.get())

                .add(DolomiteBlocks.DOLOMITE_BLOCK.get())
                .add(DolomiteBlocks.DOLOMITE_COAL_ORE.get())
                .add(DolomiteBlocks.DOLOMITE_COPPER_ORE.get())
                .add(DolomiteBlocks.DOLOMITE_IRON_ORE.get())
                .add(DolomiteBlocks.DOLOMITE_GOLD_ORE.get())
                .add(DolomiteBlocks.DOLOMITE_REDSTONE_ORE.get())
                .add(DolomiteBlocks.DOLOMITE_LAPIS_ORE.get())

                .add(EclogiteBlocks.ECLOGITE_BLOCK.get())
                .add(EclogiteBlocks.ECLOGITE_COAL_ORE.get())
                .add(EclogiteBlocks.ECLOGITE_COPPER_ORE.get())
                .add(EclogiteBlocks.ECLOGITE_IRON_ORE.get())
                .add(EclogiteBlocks.ECLOGITE_GOLD_ORE.get())
                .add(EclogiteBlocks.ECLOGITE_REDSTONE_ORE.get())
                .add(EclogiteBlocks.ECLOGITE_LAPIS_ORE.get())

                .add(GreywackeBlocks.GREYWACKE_BLOCK.get())
                .add(GreywackeBlocks.GREYWACKE_COAL_ORE.get())
                .add(GreywackeBlocks.GREYWACKE_COPPER_ORE.get())
                .add(GreywackeBlocks.GREYWACKE_IRON_ORE.get())
                .add(GreywackeBlocks.GREYWACKE_GOLD_ORE.get())
                .add(GreywackeBlocks.GREYWACKE_REDSTONE_ORE.get())
                .add(GreywackeBlocks.GREYWACKE_LAPIS_ORE.get())

                .add(KomatiiteBlocks.KOMATIITE_BLOCK.get())
                .add(KomatiiteBlocks.KOMATIITE_COBBLE_BLOCK.get())
                .add(KomatiiteBlocks.KOMATIITE_BRICK_BLOCK.get())
                .add(KomatiiteBlocks.KOMATIITE_COAL_ORE.get())
                .add(KomatiiteBlocks.KOMATIITE_COPPER_ORE.get())
                .add(KomatiiteBlocks.KOMATIITE_IRON_ORE.get())
                .add(KomatiiteBlocks.KOMATIITE_GOLD_ORE.get())
                .add(KomatiiteBlocks.KOMATIITE_REDSTONE_ORE.get())
                .add(KomatiiteBlocks.KOMATIITE_LAPIS_ORE.get())

                .add(DaciteBlocks.DACITE_BLOCK.get())
                .add(DaciteBlocks.DACITE_COBBLE_BLOCK.get())
                .add(DaciteBlocks.DACITE_BRICK_BLOCK.get())
                .add(DaciteBlocks.DACITE_COAL_ORE.get())
                .add(DaciteBlocks.DACITE_COPPER_ORE.get())
                .add(DaciteBlocks.DACITE_IRON_ORE.get())
                .add(DaciteBlocks.DACITE_GOLD_ORE.get())
                .add(DaciteBlocks.DACITE_REDSTONE_ORE.get())
                .add(DaciteBlocks.DACITE_LAPIS_ORE.get())

                .add(BlackGraniteBlocks.BLACK_GRANITE_BLOCK.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_COBBLE_BLOCK.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_BRICK_BLOCK.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_IRON_ORE.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_GOLD_ORE.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_REDSTONE_ORE.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_LAPIS_ORE.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_DIAMOND_ORE.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_EMERALD_ORE.get())

                .add(QuartziteBlocks.QUARTZITE_BLOCK.get())
                .add(QuartziteBlocks.QUARTZITE_COBBLE_BLOCK.get())
                .add(QuartziteBlocks.QUARTZITE_BRICK_BLOCK.get())
                .add(QuartziteBlocks.QUARTZITE_IRON_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_GOLD_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_REDSTONE_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_LAPIS_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_DIAMOND_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_EMERALD_ORE.get())

                .add(MarbleBlocks.MARBLE_BLOCK.get())
                .add(MarbleBlocks.MARBLE_COBBLE_BLOCK.get())
                .add(MarbleBlocks.MARBLE_BRICK_BLOCK.get())
                .add(MarbleBlocks.MARBLE_IRON_ORE.get())
                .add(MarbleBlocks.MARBLE_GOLD_ORE.get())
                .add(MarbleBlocks.MARBLE_REDSTONE_ORE.get())
                .add(MarbleBlocks.MARBLE_LAPIS_ORE.get())
                .add(MarbleBlocks.MARBLE_DIAMOND_ORE.get())
                .add(MarbleBlocks.MARBLE_EMERALD_ORE.get())

                .add(GabbroBlocks.GABBRO_BLOCK.get())
                .add(GabbroBlocks.GABBRO_COBBLE_BLOCK.get())
                .add(GabbroBlocks.GABBRO_BRICK_BLOCK.get())
                .add(GabbroBlocks.GABBRO_IRON_ORE.get())
                .add(GabbroBlocks.GABBRO_GOLD_ORE.get())
                .add(GabbroBlocks.GABBRO_REDSTONE_ORE.get())
                .add(GabbroBlocks.GABBRO_LAPIS_ORE.get())
                .add(GabbroBlocks.GABBRO_DIAMOND_ORE.get())
                .add(GabbroBlocks.GABBRO_EMERALD_ORE.get())

                .add(GneissBlocks.GNEISS_BLOCK.get())
                .add(GneissBlocks.GNEISS_COBBLE_BLOCK.get())
                .add(GneissBlocks.GNEISS_BRICK_BLOCK.get())
                .add(GneissBlocks.GNEISS_IRON_ORE.get())
                .add(GneissBlocks.GNEISS_GOLD_ORE.get())
                .add(GneissBlocks.GNEISS_REDSTONE_ORE.get())
                .add(GneissBlocks.GNEISS_LAPIS_ORE.get())
                .add(GneissBlocks.GNEISS_DIAMOND_ORE.get())
                .add(GneissBlocks.GNEISS_EMERALD_ORE.get())

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

                .add(BlueschistBlocks.BLUESCHIST_BLOCK_SLAB.get())
                .add(BlueschistBlocks.BLUESCHIST_COBBLE_SLAB.get())
                .add(BlueschistBlocks.BLUESCHIST_BRICK_SLAB.get())

                .add(GreenschistBlocks.GREENSCHIST_BLOCK_SLAB.get())
                .add(GreenschistBlocks.GREENSCHIST_COBBLE_SLAB.get())
                .add(GreenschistBlocks.GREENSCHIST_BRICK_SLAB.get())

                .add(ChalkBlocks.CHALK_BLOCK_SLAB.get())

                .add(ShaleBlocks.SHALE_BLOCK_SLAB.get())

                .add(ChertBlocks.CHERT_BLOCK_SLAB.get())

                .add(LigniteBlocks.LIGNITE_BLOCK_SLAB.get())

                .add(DolomiteBlocks.DOLOMITE_BLOCK_SLAB.get())

                .add(EclogiteBlocks.ECLOGITE_BLOCK_SLAB.get())

                .add(GreywackeBlocks.GREYWACKE_BLOCK_SLAB.get())

                .add(KomatiiteBlocks.KOMATIITE_BLOCK_SLAB.get())
                .add(KomatiiteBlocks.KOMATIITE_COBBLE_SLAB.get())
                .add(KomatiiteBlocks.KOMATIITE_BRICK_SLAB.get())

                .add(DaciteBlocks.DACITE_BLOCK_SLAB.get())
                .add(DaciteBlocks.DACITE_COBBLE_SLAB.get())
                .add(DaciteBlocks.DACITE_BRICK_SLAB.get())

                .add(BlackGraniteBlocks.BLACK_GRANITE_BLOCK_SLAB.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_COBBLE_SLAB.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_BRICK_SLAB.get())

                .add(GabbroBlocks.GABBRO_BLOCK_SLAB.get())
                .add(GabbroBlocks.GABBRO_COBBLE_SLAB.get())
                .add(GabbroBlocks.GABBRO_BRICK_SLAB.get())

                .add(GneissBlocks.GNEISS_BLOCK_SLAB.get())
                .add(GneissBlocks.GNEISS_COBBLE_SLAB.get())
                .add(GneissBlocks.GNEISS_BRICK_SLAB.get())

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

                .add(BlueschistBlocks.BLUESCHIST_STAIRS.get())
                .add(BlueschistBlocks.BLUESCHIST_BRICK_STAIRS.get())
                .add(BlueschistBlocks.BLUESCHIST_COBBLE_STAIRS.get())

                .add(GreenschistBlocks.GREENSCHIST_STAIRS.get())
                .add(GreenschistBlocks.GREENSCHIST_BRICK_STAIRS.get())
                .add(GreenschistBlocks.GREENSCHIST_COBBLE_STAIRS.get())

                .add(ChalkBlocks.CHALK_STAIRS.get())

                .add(ShaleBlocks.SHALE_STAIRS.get())

                .add(ChertBlocks.CHERT_STAIRS.get())

                .add(LigniteBlocks.LIGNITE_STAIRS.get())

                .add(DolomiteBlocks.DOLOMITE_STAIRS.get())

                .add(EclogiteBlocks.ECLOGITE_STAIRS.get())

                .add(GreywackeBlocks.GREYWACKE_STAIRS.get())

                .add(KomatiiteBlocks.KOMATIITE_STAIRS.get())
                .add(KomatiiteBlocks.KOMATIITE_BRICK_STAIRS.get())
                .add(KomatiiteBlocks.KOMATIITE_COBBLE_STAIRS.get())

                .add(DaciteBlocks.DACITE_STAIRS.get())
                .add(DaciteBlocks.DACITE_BRICK_STAIRS.get())
                .add(DaciteBlocks.DACITE_COBBLE_STAIRS.get())

                .add(BlackGraniteBlocks.BLACK_GRANITE_STAIRS.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_COBBLE_STAIRS.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_BRICK_STAIRS.get())

                .add(GabbroBlocks.GABBRO_STAIRS.get())
                .add(GabbroBlocks.GABBRO_COBBLE_STAIRS.get())
                .add(GabbroBlocks.GABBRO_BRICK_STAIRS.get())

                .add(GneissBlocks.GNEISS_STAIRS.get())
                .add(GneissBlocks.GNEISS_COBBLE_STAIRS.get())
                .add(GneissBlocks.GNEISS_BRICK_STAIRS.get())

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

                .add(SiltstoneBlocks.SILTSTONE_BLOCK_WALL.get())

                .add(BlueschistBlocks.BLUESCHIST_BLOCK_WALL.get())
                .add(BlueschistBlocks.BLUESCHIST_COBBLE_WALL.get())
                .add(BlueschistBlocks.BLUESCHIST_BRICK_WALL.get())

                .add(GreenschistBlocks.GREENSCHIST_BLOCK_WALL.get())
                .add(GreenschistBlocks.GREENSCHIST_COBBLE_WALL.get())
                .add(GreenschistBlocks.GREENSCHIST_BRICK_WALL.get())

                .add(ChalkBlocks.CHALK_BLOCK_WALL.get())

                .add(ShaleBlocks.SHALE_BLOCK_WALL.get())

                .add(ChertBlocks.CHERT_BLOCK_WALL.get())

                .add(LigniteBlocks.LIGNITE_BLOCK_WALL.get())

                .add(DolomiteBlocks.DOLOMITE_BLOCK_WALL.get())

                .add(EclogiteBlocks.ECLOGITE_BLOCK_WALL.get())

                .add(GreywackeBlocks.GREYWACKE_BLOCK_WALL.get())

                .add(KomatiiteBlocks.KOMATIITE_BLOCK_WALL.get())
                .add(KomatiiteBlocks.KOMATIITE_COBBLE_WALL.get())
                .add(KomatiiteBlocks.KOMATIITE_BRICK_WALL.get())

                .add(DaciteBlocks.DACITE_BLOCK_WALL.get())
                .add(DaciteBlocks.DACITE_COBBLE_WALL.get())
                .add(DaciteBlocks.DACITE_BRICK_WALL.get())

                .add(BlackGraniteBlocks.BLACK_GRANITE_BLOCK_WALL.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_COBBLE_WALL.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_BRICK_WALL.get())

                .add(GabbroBlocks.GABBRO_BLOCK_WALL.get())
                .add(GabbroBlocks.GABBRO_COBBLE_WALL.get())
                .add(GabbroBlocks.GABBRO_BRICK_WALL.get())

                .add(GneissBlocks.GNEISS_BLOCK_WALL.get())
                .add(GneissBlocks.GNEISS_COBBLE_WALL.get())
                .add(GneissBlocks.GNEISS_BRICK_WALL.get())

                .add(SoapstoneBlocks.SOAPSTONE_STONE_BUTTON.get())
                .add(RhyoliteBlocks.RHYOLITE_STONE_BUTTON.get())
                .add(RedGraniteBlocks.RED_GRANITE_STONE_BUTTON.get())
                .add(QuartziteBlocks.QUARTZITE_STONE_BUTTON.get())
                .add(MigmatiteBlocks.MIGMATITE_STONE_BUTTON.get())
                .add(MarbleBlocks.MARBLE_STONE_BUTTON.get())
                .add(LimestoneBlocks.LIMESTONE_STONE_BUTTON.get())
                .add(SiltstoneBlocks.SILTSTONE_STONE_BUTTON.get())
                .add(BlueschistBlocks.BLUESCHIST_STONE_BUTTON.get())
                .add(GreenschistBlocks.GREENSCHIST_STONE_BUTTON.get())
                .add(ChalkBlocks.CHALK_STONE_BUTTON.get())
                .add(ShaleBlocks.SHALE_STONE_BUTTON.get())
                .add(ChertBlocks.CHERT_STONE_BUTTON.get())
                .add(LigniteBlocks.LIGNITE_STONE_BUTTON.get())
                .add(DolomiteBlocks.DOLOMITE_STONE_BUTTON.get())
                .add(EclogiteBlocks.ECLOGITE_STONE_BUTTON.get())
                .add(GreywackeBlocks.GREYWACKE_STONE_BUTTON.get())
                .add(KomatiiteBlocks.KOMATIITE_STONE_BUTTON.get())
                .add(DaciteBlocks.DACITE_STONE_BUTTON.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_STONE_BUTTON.get())
                .add(GabbroBlocks.GABBRO_STONE_BUTTON.get())
                .add(GneissBlocks.GNEISS_STONE_BUTTON.get());

        // ------------------------------------------------------------
        // Tool requirement tags
        // ------------------------------------------------------------

        tag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(RedGraniteBlocks.RED_GRANITE_DIAMOND_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_GOLD_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_REDSTONE_ORE.get())

                .add(QuartziteBlocks.QUARTZITE_DIAMOND_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_GOLD_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_REDSTONE_ORE.get())

                .add(MigmatiteBlocks.MIGMATITE_DIAMOND_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_GOLD_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_REDSTONE_ORE.get())

                .add(SoapstoneBlocks.SOAPSTONE_GOLD_ORE.get())
                .add(SoapstoneBlocks.SOAPSTONE_REDSTONE_ORE.get())

                .add(RhyoliteBlocks.RHYOLITE_GOLD_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_REDSTONE_ORE.get())

                .add(MarbleBlocks.MARBLE_GOLD_ORE.get())
                .add(MarbleBlocks.MARBLE_REDSTONE_ORE.get())

                .add(LimestoneBlocks.LIMESTONE_GOLD_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_REDSTONE_ORE.get())

                .add(SiltstoneBlocks.SILTSTONE_GOLD_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_REDSTONE_ORE.get())

                .add(BlueschistBlocks.BLUESCHIST_GOLD_ORE.get())
                .add(BlueschistBlocks.BLUESCHIST_REDSTONE_ORE.get())

                .add(GreenschistBlocks.GREENSCHIST_GOLD_ORE.get())
                .add(GreenschistBlocks.GREENSCHIST_REDSTONE_ORE.get())

                .add(ChalkBlocks.CHALK_GOLD_ORE.get())
                .add(ChalkBlocks.CHALK_REDSTONE_ORE.get())

                .add(ShaleBlocks.SHALE_GOLD_ORE.get())
                .add(ShaleBlocks.SHALE_REDSTONE_ORE.get())

                .add(ChertBlocks.CHERT_GOLD_ORE.get())
                .add(ChertBlocks.CHERT_REDSTONE_ORE.get())

                .add(LigniteBlocks.LIGNITE_GOLD_ORE.get())
                .add(LigniteBlocks.LIGNITE_REDSTONE_ORE.get())

                .add(DolomiteBlocks.DOLOMITE_GOLD_ORE.get())
                .add(DolomiteBlocks.DOLOMITE_REDSTONE_ORE.get())

                .add(EclogiteBlocks.ECLOGITE_GOLD_ORE.get())
                .add(EclogiteBlocks.ECLOGITE_REDSTONE_ORE.get())

                .add(GreywackeBlocks.GREYWACKE_GOLD_ORE.get())
                .add(GreywackeBlocks.GREYWACKE_REDSTONE_ORE.get())

                .add(KomatiiteBlocks.KOMATIITE_GOLD_ORE.get())
                .add(KomatiiteBlocks.KOMATIITE_REDSTONE_ORE.get())

                .add(DaciteBlocks.DACITE_GOLD_ORE.get())
                .add(DaciteBlocks.DACITE_REDSTONE_ORE.get())

                .add(BlackGraniteBlocks.BLACK_GRANITE_DIAMOND_ORE.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_GOLD_ORE.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_REDSTONE_ORE.get())

                .add(GabbroBlocks.GABBRO_DIAMOND_ORE.get())
                .add(GabbroBlocks.GABBRO_GOLD_ORE.get())
                .add(GabbroBlocks.GABBRO_REDSTONE_ORE.get())

                .add(GneissBlocks.GNEISS_DIAMOND_ORE.get())
                .add(GneissBlocks.GNEISS_GOLD_ORE.get())
                .add(GneissBlocks.GNEISS_REDSTONE_ORE.get());

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(RedGraniteBlocks.RED_GRANITE_LAPIS_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_IRON_ORE.get())

                .add(RhyoliteBlocks.RHYOLITE_LAPIS_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_IRON_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_COPPER_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_COAL_ORE.get())

                .add(SoapstoneBlocks.SOAPSTONE_LAPIS_ORE.get())
                .add(SoapstoneBlocks.SOAPSTONE_IRON_ORE.get())
                .add(SoapstoneBlocks.SOAPSTONE_COPPER_ORE.get())
                .add(SoapstoneBlocks.SOAPSTONE_COAL_ORE.get())

                .add(QuartziteBlocks.QUARTZITE_LAPIS_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_IRON_ORE.get())

                .add(MigmatiteBlocks.MIGMATITE_LAPIS_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_IRON_ORE.get())

                .add(MarbleBlocks.MARBLE_LAPIS_ORE.get())
                .add(MarbleBlocks.MARBLE_IRON_ORE.get())

                .add(LimestoneBlocks.LIMESTONE_COAL_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_LAPIS_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_IRON_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_COPPER_ORE.get())

                .add(SiltstoneBlocks.SILTSTONE_COAL_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_LAPIS_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_IRON_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_COPPER_ORE.get())

                .add(BlueschistBlocks.BLUESCHIST_LAPIS_ORE.get())
                .add(BlueschistBlocks.BLUESCHIST_IRON_ORE.get())
                .add(BlueschistBlocks.BLUESCHIST_COPPER_ORE.get())
                .add(BlueschistBlocks.BLUESCHIST_COAL_ORE.get())

                .add(GreenschistBlocks.GREENSCHIST_LAPIS_ORE.get())
                .add(GreenschistBlocks.GREENSCHIST_IRON_ORE.get())
                .add(GreenschistBlocks.GREENSCHIST_COPPER_ORE.get())
                .add(GreenschistBlocks.GREENSCHIST_COAL_ORE.get())

                .add(ChalkBlocks.CHALK_COAL_ORE.get())
                .add(ChalkBlocks.CHALK_LAPIS_ORE.get())
                .add(ChalkBlocks.CHALK_IRON_ORE.get())
                .add(ChalkBlocks.CHALK_COPPER_ORE.get())

                .add(ShaleBlocks.SHALE_COAL_ORE.get())
                .add(ShaleBlocks.SHALE_LAPIS_ORE.get())
                .add(ShaleBlocks.SHALE_IRON_ORE.get())
                .add(ShaleBlocks.SHALE_COPPER_ORE.get())

                .add(ChertBlocks.CHERT_COAL_ORE.get())
                .add(ChertBlocks.CHERT_LAPIS_ORE.get())
                .add(ChertBlocks.CHERT_IRON_ORE.get())
                .add(ChertBlocks.CHERT_COPPER_ORE.get())

                .add(LigniteBlocks.LIGNITE_COAL_ORE.get())
                .add(LigniteBlocks.LIGNITE_LAPIS_ORE.get())
                .add(LigniteBlocks.LIGNITE_IRON_ORE.get())
                .add(LigniteBlocks.LIGNITE_COPPER_ORE.get())

                .add(DolomiteBlocks.DOLOMITE_COAL_ORE.get())
                .add(DolomiteBlocks.DOLOMITE_LAPIS_ORE.get())
                .add(DolomiteBlocks.DOLOMITE_IRON_ORE.get())
                .add(DolomiteBlocks.DOLOMITE_COPPER_ORE.get())

                .add(EclogiteBlocks.ECLOGITE_COAL_ORE.get())
                .add(EclogiteBlocks.ECLOGITE_LAPIS_ORE.get())
                .add(EclogiteBlocks.ECLOGITE_IRON_ORE.get())
                .add(EclogiteBlocks.ECLOGITE_COPPER_ORE.get())

                .add(GreywackeBlocks.GREYWACKE_COAL_ORE.get())
                .add(GreywackeBlocks.GREYWACKE_LAPIS_ORE.get())
                .add(GreywackeBlocks.GREYWACKE_IRON_ORE.get())
                .add(GreywackeBlocks.GREYWACKE_COPPER_ORE.get())

                .add(KomatiiteBlocks.KOMATIITE_LAPIS_ORE.get())
                .add(KomatiiteBlocks.KOMATIITE_IRON_ORE.get())
                .add(KomatiiteBlocks.KOMATIITE_COPPER_ORE.get())
                .add(KomatiiteBlocks.KOMATIITE_COAL_ORE.get())
                .add(DaciteBlocks.DACITE_LAPIS_ORE.get())
                .add(DaciteBlocks.DACITE_IRON_ORE.get())
                .add(DaciteBlocks.DACITE_COPPER_ORE.get())
                .add(DaciteBlocks.DACITE_COAL_ORE.get())

                .add(BlackGraniteBlocks.BLACK_GRANITE_LAPIS_ORE.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_IRON_ORE.get())

                .add(GabbroBlocks.GABBRO_LAPIS_ORE.get())
                .add(GabbroBlocks.GABBRO_IRON_ORE.get())

                .add(GneissBlocks.GNEISS_LAPIS_ORE.get())
                .add(GneissBlocks.GNEISS_IRON_ORE.get());

        // Tool tags
        tag(BlockTags.INCORRECT_FOR_STONE_TOOL)
                .add(RedGraniteBlocks.RED_GRANITE_DIAMOND_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_GOLD_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_REDSTONE_ORE.get())

                .add(QuartziteBlocks.QUARTZITE_DIAMOND_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_GOLD_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_REDSTONE_ORE.get())

                .add(MigmatiteBlocks.MIGMATITE_DIAMOND_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_GOLD_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_REDSTONE_ORE.get())

                .add(MarbleBlocks.MARBLE_DIAMOND_ORE.get())
                .add(MarbleBlocks.MARBLE_GOLD_ORE.get())
                .add(MarbleBlocks.MARBLE_REDSTONE_ORE.get())

                .add(SoapstoneBlocks.SOAPSTONE_GOLD_ORE.get())
                .add(SoapstoneBlocks.SOAPSTONE_REDSTONE_ORE.get())

                .add(RhyoliteBlocks.RHYOLITE_GOLD_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_REDSTONE_ORE.get())

                .add(LimestoneBlocks.LIMESTONE_GOLD_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_REDSTONE_ORE.get())

                .add(SiltstoneBlocks.SILTSTONE_GOLD_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_REDSTONE_ORE.get())

                .add(BlueschistBlocks.BLUESCHIST_GOLD_ORE.get())
                .add(BlueschistBlocks.BLUESCHIST_REDSTONE_ORE.get())

                .add(GreenschistBlocks.GREENSCHIST_GOLD_ORE.get())
                .add(GreenschistBlocks.GREENSCHIST_REDSTONE_ORE.get())

                .add(ChalkBlocks.CHALK_GOLD_ORE.get())
                .add(ChalkBlocks.CHALK_REDSTONE_ORE.get())

                .add(ShaleBlocks.SHALE_GOLD_ORE.get())
                .add(ShaleBlocks.SHALE_REDSTONE_ORE.get())

                .add(ChertBlocks.CHERT_GOLD_ORE.get())
                .add(ChertBlocks.CHERT_REDSTONE_ORE.get())

                .add(LigniteBlocks.LIGNITE_GOLD_ORE.get())
                .add(LigniteBlocks.LIGNITE_REDSTONE_ORE.get())

                .add(DolomiteBlocks.DOLOMITE_GOLD_ORE.get())
                .add(DolomiteBlocks.DOLOMITE_REDSTONE_ORE.get())

                .add(EclogiteBlocks.ECLOGITE_GOLD_ORE.get())
                .add(EclogiteBlocks.ECLOGITE_REDSTONE_ORE.get())

                .add(GreywackeBlocks.GREYWACKE_GOLD_ORE.get())
                .add(GreywackeBlocks.GREYWACKE_REDSTONE_ORE.get())

                .add(KomatiiteBlocks.KOMATIITE_GOLD_ORE.get())
                .add(KomatiiteBlocks.KOMATIITE_REDSTONE_ORE.get())

                .add(DaciteBlocks.DACITE_GOLD_ORE.get())
                .add(DaciteBlocks.DACITE_REDSTONE_ORE.get())

                .add(BlackGraniteBlocks.BLACK_GRANITE_DIAMOND_ORE.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_GOLD_ORE.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_REDSTONE_ORE.get())

                .add(GabbroBlocks.GABBRO_DIAMOND_ORE.get())
                .add(GabbroBlocks.GABBRO_GOLD_ORE.get())
                .add(GabbroBlocks.GABBRO_REDSTONE_ORE.get())

                .add(GneissBlocks.GNEISS_DIAMOND_ORE.get())
                .add(GneissBlocks.GNEISS_GOLD_ORE.get())
                .add(GneissBlocks.GNEISS_REDSTONE_ORE.get());

        tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
                .add(RedGraniteBlocks.RED_GRANITE_DIAMOND_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_LAPIS_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_GOLD_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_REDSTONE_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_IRON_ORE.get())

                .add(QuartziteBlocks.QUARTZITE_DIAMOND_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_LAPIS_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_GOLD_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_REDSTONE_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_IRON_ORE.get())

                .add(MigmatiteBlocks.MIGMATITE_DIAMOND_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_LAPIS_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_GOLD_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_REDSTONE_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_IRON_ORE.get())

                .add(MarbleBlocks.MARBLE_DIAMOND_ORE.get())
                .add(MarbleBlocks.MARBLE_LAPIS_ORE.get())
                .add(MarbleBlocks.MARBLE_GOLD_ORE.get())
                .add(MarbleBlocks.MARBLE_REDSTONE_ORE.get())
                .add(MarbleBlocks.MARBLE_IRON_ORE.get())

                .add(SoapstoneBlocks.SOAPSTONE_GOLD_ORE.get())
                .add(SoapstoneBlocks.SOAPSTONE_REDSTONE_ORE.get())
                .add(SoapstoneBlocks.SOAPSTONE_IRON_ORE.get())
                .add(SoapstoneBlocks.SOAPSTONE_COPPER_ORE.get())
                .add(SoapstoneBlocks.SOAPSTONE_COAL_ORE.get())

                .add(RhyoliteBlocks.RHYOLITE_GOLD_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_REDSTONE_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_IRON_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_COPPER_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_COAL_ORE.get())

                .add(LimestoneBlocks.LIMESTONE_GOLD_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_REDSTONE_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_IRON_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_COPPER_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_COAL_ORE.get())

                .add(SiltstoneBlocks.SILTSTONE_GOLD_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_REDSTONE_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_IRON_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_COPPER_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_COAL_ORE.get())

                .add(BlueschistBlocks.BLUESCHIST_GOLD_ORE.get())
                .add(BlueschistBlocks.BLUESCHIST_REDSTONE_ORE.get())
                .add(BlueschistBlocks.BLUESCHIST_IRON_ORE.get())
                .add(BlueschistBlocks.BLUESCHIST_COPPER_ORE.get())
                .add(BlueschistBlocks.BLUESCHIST_COAL_ORE.get())

                .add(GreenschistBlocks.GREENSCHIST_GOLD_ORE.get())
                .add(GreenschistBlocks.GREENSCHIST_REDSTONE_ORE.get())
                .add(GreenschistBlocks.GREENSCHIST_IRON_ORE.get())
                .add(GreenschistBlocks.GREENSCHIST_COPPER_ORE.get())
                .add(GreenschistBlocks.GREENSCHIST_COAL_ORE.get())

                .add(ChalkBlocks.CHALK_GOLD_ORE.get())
                .add(ChalkBlocks.CHALK_REDSTONE_ORE.get())
                .add(ChalkBlocks.CHALK_IRON_ORE.get())
                .add(ChalkBlocks.CHALK_COPPER_ORE.get())
                .add(ChalkBlocks.CHALK_COAL_ORE.get())

                .add(ShaleBlocks.SHALE_GOLD_ORE.get())
                .add(ShaleBlocks.SHALE_REDSTONE_ORE.get())
                .add(ShaleBlocks.SHALE_IRON_ORE.get())
                .add(ShaleBlocks.SHALE_COPPER_ORE.get())
                .add(ShaleBlocks.SHALE_COAL_ORE.get())

                .add(ChertBlocks.CHERT_GOLD_ORE.get())
                .add(ChertBlocks.CHERT_REDSTONE_ORE.get())
                .add(ChertBlocks.CHERT_IRON_ORE.get())
                .add(ChertBlocks.CHERT_COPPER_ORE.get())
                .add(ChertBlocks.CHERT_COAL_ORE.get())

                .add(LigniteBlocks.LIGNITE_GOLD_ORE.get())
                .add(LigniteBlocks.LIGNITE_REDSTONE_ORE.get())
                .add(LigniteBlocks.LIGNITE_IRON_ORE.get())
                .add(LigniteBlocks.LIGNITE_COPPER_ORE.get())
                .add(LigniteBlocks.LIGNITE_COAL_ORE.get())

                .add(DolomiteBlocks.DOLOMITE_GOLD_ORE.get())
                .add(DolomiteBlocks.DOLOMITE_REDSTONE_ORE.get())
                .add(DolomiteBlocks.DOLOMITE_IRON_ORE.get())
                .add(DolomiteBlocks.DOLOMITE_COPPER_ORE.get())
                .add(DolomiteBlocks.DOLOMITE_COAL_ORE.get())

                .add(EclogiteBlocks.ECLOGITE_GOLD_ORE.get())
                .add(EclogiteBlocks.ECLOGITE_REDSTONE_ORE.get())
                .add(EclogiteBlocks.ECLOGITE_IRON_ORE.get())
                .add(EclogiteBlocks.ECLOGITE_COPPER_ORE.get())
                .add(EclogiteBlocks.ECLOGITE_COAL_ORE.get())

                .add(GreywackeBlocks.GREYWACKE_GOLD_ORE.get())
                .add(GreywackeBlocks.GREYWACKE_REDSTONE_ORE.get())
                .add(GreywackeBlocks.GREYWACKE_IRON_ORE.get())
                .add(GreywackeBlocks.GREYWACKE_COPPER_ORE.get())
                .add(GreywackeBlocks.GREYWACKE_COAL_ORE.get())

                .add(KomatiiteBlocks.KOMATIITE_GOLD_ORE.get())
                .add(KomatiiteBlocks.KOMATIITE_REDSTONE_ORE.get())
                .add(KomatiiteBlocks.KOMATIITE_IRON_ORE.get())
                .add(KomatiiteBlocks.KOMATIITE_COPPER_ORE.get())
                .add(KomatiiteBlocks.KOMATIITE_COAL_ORE.get())

                .add(DaciteBlocks.DACITE_GOLD_ORE.get())
                .add(DaciteBlocks.DACITE_REDSTONE_ORE.get())
                .add(DaciteBlocks.DACITE_IRON_ORE.get())
                .add(DaciteBlocks.DACITE_COPPER_ORE.get())
                .add(DaciteBlocks.DACITE_COAL_ORE.get())

                .add(BlackGraniteBlocks.BLACK_GRANITE_DIAMOND_ORE.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_LAPIS_ORE.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_GOLD_ORE.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_REDSTONE_ORE.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_IRON_ORE.get())

                .add(GabbroBlocks.GABBRO_DIAMOND_ORE.get())
                .add(GabbroBlocks.GABBRO_LAPIS_ORE.get())
                .add(GabbroBlocks.GABBRO_GOLD_ORE.get())
                .add(GabbroBlocks.GABBRO_REDSTONE_ORE.get())
                .add(GabbroBlocks.GABBRO_IRON_ORE.get())

                .add(GneissBlocks.GNEISS_DIAMOND_ORE.get())
                .add(GneissBlocks.GNEISS_LAPIS_ORE.get())
                .add(GneissBlocks.GNEISS_GOLD_ORE.get())
                .add(GneissBlocks.GNEISS_REDSTONE_ORE.get())
                .add(GneissBlocks.GNEISS_IRON_ORE.get());

        tag(BlockTags.INCORRECT_FOR_IRON_TOOL);

        tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
                .add(RedGraniteBlocks.RED_GRANITE_DIAMOND_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_LAPIS_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_GOLD_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_REDSTONE_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_IRON_ORE.get())

                .add(QuartziteBlocks.QUARTZITE_DIAMOND_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_LAPIS_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_GOLD_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_REDSTONE_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_IRON_ORE.get())

                .add(MigmatiteBlocks.MIGMATITE_DIAMOND_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_LAPIS_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_GOLD_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_REDSTONE_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_IRON_ORE.get())

                .add(MarbleBlocks.MARBLE_DIAMOND_ORE.get())
                .add(MarbleBlocks.MARBLE_LAPIS_ORE.get())
                .add(MarbleBlocks.MARBLE_GOLD_ORE.get())
                .add(MarbleBlocks.MARBLE_REDSTONE_ORE.get())
                .add(MarbleBlocks.MARBLE_IRON_ORE.get())

                .add(SoapstoneBlocks.SOAPSTONE_GOLD_ORE.get())
                .add(SoapstoneBlocks.SOAPSTONE_REDSTONE_ORE.get())
                .add(SoapstoneBlocks.SOAPSTONE_IRON_ORE.get())
                .add(SoapstoneBlocks.SOAPSTONE_COPPER_ORE.get())
                .add(SoapstoneBlocks.SOAPSTONE_COAL_ORE.get())

                .add(RhyoliteBlocks.RHYOLITE_GOLD_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_REDSTONE_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_IRON_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_COPPER_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_COAL_ORE.get())

                .add(LimestoneBlocks.LIMESTONE_GOLD_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_REDSTONE_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_IRON_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_COPPER_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_COAL_ORE.get())

                .add(SiltstoneBlocks.SILTSTONE_GOLD_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_REDSTONE_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_IRON_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_COPPER_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_COAL_ORE.get())

                .add(BlueschistBlocks.BLUESCHIST_GOLD_ORE.get())
                .add(BlueschistBlocks.BLUESCHIST_REDSTONE_ORE.get())
                .add(BlueschistBlocks.BLUESCHIST_IRON_ORE.get())
                .add(BlueschistBlocks.BLUESCHIST_COPPER_ORE.get())
                .add(BlueschistBlocks.BLUESCHIST_COAL_ORE.get())

                .add(GreenschistBlocks.GREENSCHIST_GOLD_ORE.get())
                .add(GreenschistBlocks.GREENSCHIST_REDSTONE_ORE.get())
                .add(GreenschistBlocks.GREENSCHIST_IRON_ORE.get())
                .add(GreenschistBlocks.GREENSCHIST_COPPER_ORE.get())
                .add(GreenschistBlocks.GREENSCHIST_COAL_ORE.get())

                .add(ChalkBlocks.CHALK_GOLD_ORE.get())
                .add(ChalkBlocks.CHALK_REDSTONE_ORE.get())
                .add(ChalkBlocks.CHALK_IRON_ORE.get())
                .add(ChalkBlocks.CHALK_COPPER_ORE.get())
                .add(ChalkBlocks.CHALK_COAL_ORE.get())

                .add(ShaleBlocks.SHALE_GOLD_ORE.get())
                .add(ShaleBlocks.SHALE_REDSTONE_ORE.get())
                .add(ShaleBlocks.SHALE_IRON_ORE.get())
                .add(ShaleBlocks.SHALE_COPPER_ORE.get())
                .add(ShaleBlocks.SHALE_COAL_ORE.get())

                .add(ChertBlocks.CHERT_GOLD_ORE.get())
                .add(ChertBlocks.CHERT_REDSTONE_ORE.get())
                .add(ChertBlocks.CHERT_IRON_ORE.get())
                .add(ChertBlocks.CHERT_COPPER_ORE.get())
                .add(ChertBlocks.CHERT_COAL_ORE.get())

                .add(LigniteBlocks.LIGNITE_GOLD_ORE.get())
                .add(LigniteBlocks.LIGNITE_REDSTONE_ORE.get())
                .add(LigniteBlocks.LIGNITE_IRON_ORE.get())
                .add(LigniteBlocks.LIGNITE_COPPER_ORE.get())
                .add(LigniteBlocks.LIGNITE_COAL_ORE.get())

                .add(DolomiteBlocks.DOLOMITE_GOLD_ORE.get())
                .add(DolomiteBlocks.DOLOMITE_REDSTONE_ORE.get())
                .add(DolomiteBlocks.DOLOMITE_IRON_ORE.get())
                .add(DolomiteBlocks.DOLOMITE_COPPER_ORE.get())
                .add(DolomiteBlocks.DOLOMITE_COAL_ORE.get())

                .add(EclogiteBlocks.ECLOGITE_GOLD_ORE.get())
                .add(EclogiteBlocks.ECLOGITE_REDSTONE_ORE.get())
                .add(EclogiteBlocks.ECLOGITE_IRON_ORE.get())
                .add(EclogiteBlocks.ECLOGITE_COPPER_ORE.get())
                .add(EclogiteBlocks.ECLOGITE_COAL_ORE.get())

                .add(GreywackeBlocks.GREYWACKE_GOLD_ORE.get())
                .add(GreywackeBlocks.GREYWACKE_REDSTONE_ORE.get())
                .add(GreywackeBlocks.GREYWACKE_IRON_ORE.get())
                .add(GreywackeBlocks.GREYWACKE_COPPER_ORE.get())
                .add(GreywackeBlocks.GREYWACKE_COAL_ORE.get())

                .add(KomatiiteBlocks.KOMATIITE_GOLD_ORE.get())
                .add(KomatiiteBlocks.KOMATIITE_REDSTONE_ORE.get())
                .add(KomatiiteBlocks.KOMATIITE_IRON_ORE.get())
                .add(KomatiiteBlocks.KOMATIITE_COPPER_ORE.get())
                .add(KomatiiteBlocks.KOMATIITE_COAL_ORE.get())

                .add(DaciteBlocks.DACITE_GOLD_ORE.get())
                .add(DaciteBlocks.DACITE_REDSTONE_ORE.get())
                .add(DaciteBlocks.DACITE_IRON_ORE.get())
                .add(DaciteBlocks.DACITE_COPPER_ORE.get())
                .add(DaciteBlocks.DACITE_COAL_ORE.get())

                .add(BlackGraniteBlocks.BLACK_GRANITE_DIAMOND_ORE.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_LAPIS_ORE.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_GOLD_ORE.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_REDSTONE_ORE.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_IRON_ORE.get())

                .add(GabbroBlocks.GABBRO_DIAMOND_ORE.get())
                .add(GabbroBlocks.GABBRO_LAPIS_ORE.get())
                .add(GabbroBlocks.GABBRO_GOLD_ORE.get())
                .add(GabbroBlocks.GABBRO_REDSTONE_ORE.get())
                .add(GabbroBlocks.GABBRO_IRON_ORE.get())

                .add(GneissBlocks.GNEISS_DIAMOND_ORE.get())
                .add(GneissBlocks.GNEISS_LAPIS_ORE.get())
                .add(GneissBlocks.GNEISS_GOLD_ORE.get())
                .add(GneissBlocks.GNEISS_REDSTONE_ORE.get())
                .add(GneissBlocks.GNEISS_IRON_ORE.get());

        tag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL);

        tag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL);

        // ------------------------------------------------------------
        // Ore tags
        // ------------------------------------------------------------
        tag(BlockTags.COAL_ORES)
                .add(SoapstoneBlocks.SOAPSTONE_COAL_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_COAL_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_COAL_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_COAL_ORE.get())
                .add(BlueschistBlocks.BLUESCHIST_COAL_ORE.get())
                .add(GreenschistBlocks.GREENSCHIST_COAL_ORE.get())
                .add(ChalkBlocks.CHALK_COAL_ORE.get())
                .add(ShaleBlocks.SHALE_COAL_ORE.get())
                .add(ChertBlocks.CHERT_COAL_ORE.get())
                .add(LigniteBlocks.LIGNITE_COAL_ORE.get())
                .add(DolomiteBlocks.DOLOMITE_COAL_ORE.get())
                .add(EclogiteBlocks.ECLOGITE_COAL_ORE.get())
                .add(GreywackeBlocks.GREYWACKE_COAL_ORE.get())
                .add(KomatiiteBlocks.KOMATIITE_COAL_ORE.get())
                .add(DaciteBlocks.DACITE_COAL_ORE.get());

        tag(BlockTags.COPPER_ORES)
                .add(SoapstoneBlocks.SOAPSTONE_COPPER_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_COPPER_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_COPPER_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_COPPER_ORE.get())
                .add(BlueschistBlocks.BLUESCHIST_COPPER_ORE.get())
                .add(GreenschistBlocks.GREENSCHIST_COPPER_ORE.get())
                .add(ChalkBlocks.CHALK_COPPER_ORE.get())
                .add(ShaleBlocks.SHALE_COPPER_ORE.get())
                .add(ChertBlocks.CHERT_COPPER_ORE.get())
                .add(LigniteBlocks.LIGNITE_COPPER_ORE.get())
                .add(DolomiteBlocks.DOLOMITE_COPPER_ORE.get())
                .add(EclogiteBlocks.ECLOGITE_COPPER_ORE.get())
                .add(GreywackeBlocks.GREYWACKE_COPPER_ORE.get())
                .add(KomatiiteBlocks.KOMATIITE_COPPER_ORE.get())
                .add(DaciteBlocks.DACITE_COPPER_ORE.get());

        tag(BlockTags.IRON_ORES)
                .add(SoapstoneBlocks.SOAPSTONE_IRON_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_IRON_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_IRON_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_IRON_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_IRON_ORE.get())
                .add(MarbleBlocks.MARBLE_IRON_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_IRON_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_IRON_ORE.get())
                .add(BlueschistBlocks.BLUESCHIST_IRON_ORE.get())
                .add(GreenschistBlocks.GREENSCHIST_IRON_ORE.get())
                .add(ChalkBlocks.CHALK_IRON_ORE.get())
                .add(ShaleBlocks.SHALE_IRON_ORE.get())
                .add(ChertBlocks.CHERT_IRON_ORE.get())
                .add(LigniteBlocks.LIGNITE_IRON_ORE.get())
                .add(DolomiteBlocks.DOLOMITE_IRON_ORE.get())
                .add(EclogiteBlocks.ECLOGITE_IRON_ORE.get())
                .add(GreywackeBlocks.GREYWACKE_IRON_ORE.get())
                .add(KomatiiteBlocks.KOMATIITE_IRON_ORE.get())
                .add(DaciteBlocks.DACITE_IRON_ORE.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_IRON_ORE.get())
                .add(GabbroBlocks.GABBRO_IRON_ORE.get())
                .add(GneissBlocks.GNEISS_IRON_ORE.get());

        tag(BlockTags.GOLD_ORES)
                .add(SoapstoneBlocks.SOAPSTONE_GOLD_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_GOLD_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_GOLD_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_GOLD_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_GOLD_ORE.get())
                .add(MarbleBlocks.MARBLE_GOLD_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_GOLD_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_GOLD_ORE.get())
                .add(BlueschistBlocks.BLUESCHIST_GOLD_ORE.get())
                .add(GreenschistBlocks.GREENSCHIST_GOLD_ORE.get())
                .add(ChalkBlocks.CHALK_GOLD_ORE.get())
                .add(ShaleBlocks.SHALE_GOLD_ORE.get())
                .add(ChertBlocks.CHERT_GOLD_ORE.get())
                .add(LigniteBlocks.LIGNITE_GOLD_ORE.get())
                .add(DolomiteBlocks.DOLOMITE_GOLD_ORE.get())
                .add(EclogiteBlocks.ECLOGITE_GOLD_ORE.get())
                .add(GreywackeBlocks.GREYWACKE_GOLD_ORE.get())
                .add(KomatiiteBlocks.KOMATIITE_GOLD_ORE.get())
                .add(DaciteBlocks.DACITE_GOLD_ORE.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_GOLD_ORE.get())
                .add(GabbroBlocks.GABBRO_GOLD_ORE.get())
                .add(GneissBlocks.GNEISS_GOLD_ORE.get());

        tag(BlockTags.DIAMOND_ORES)
                .add(RedGraniteBlocks.RED_GRANITE_DIAMOND_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_DIAMOND_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_DIAMOND_ORE.get())
                .add(MarbleBlocks.MARBLE_DIAMOND_ORE.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_DIAMOND_ORE.get())
                .add(GabbroBlocks.GABBRO_DIAMOND_ORE.get())
                .add(GneissBlocks.GNEISS_DIAMOND_ORE.get());

        tag(BlockTags.EMERALD_ORES)
                .add(RedGraniteBlocks.RED_GRANITE_EMERALD_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_EMERALD_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_EMERALD_ORE.get())
                .add(MarbleBlocks.MARBLE_EMERALD_ORE.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_EMERALD_ORE.get())
                .add(GabbroBlocks.GABBRO_EMERALD_ORE.get())
                .add(GneissBlocks.GNEISS_EMERALD_ORE.get());

        tag(BlockTags.LAPIS_ORES)
                .add(SoapstoneBlocks.SOAPSTONE_LAPIS_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_LAPIS_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_LAPIS_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_LAPIS_ORE.get())
                .add(MarbleBlocks.MARBLE_LAPIS_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_LAPIS_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_LAPIS_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_LAPIS_ORE.get())
                .add(BlueschistBlocks.BLUESCHIST_LAPIS_ORE.get())
                .add(GreenschistBlocks.GREENSCHIST_LAPIS_ORE.get())
                .add(ChalkBlocks.CHALK_LAPIS_ORE.get())
                .add(ShaleBlocks.SHALE_LAPIS_ORE.get())
                .add(ChertBlocks.CHERT_LAPIS_ORE.get())
                .add(LigniteBlocks.LIGNITE_LAPIS_ORE.get())
                .add(DolomiteBlocks.DOLOMITE_LAPIS_ORE.get())
                .add(EclogiteBlocks.ECLOGITE_LAPIS_ORE.get())
                .add(GreywackeBlocks.GREYWACKE_LAPIS_ORE.get())
                .add(KomatiiteBlocks.KOMATIITE_LAPIS_ORE.get())
                .add(DaciteBlocks.DACITE_LAPIS_ORE.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_LAPIS_ORE.get())
                .add(GabbroBlocks.GABBRO_LAPIS_ORE.get())
                .add(GneissBlocks.GNEISS_LAPIS_ORE.get());

        tag(BlockTags.REDSTONE_ORES)
                .add(SoapstoneBlocks.SOAPSTONE_REDSTONE_ORE.get())
                .add(RedGraniteBlocks.RED_GRANITE_REDSTONE_ORE.get())
                .add(QuartziteBlocks.QUARTZITE_REDSTONE_ORE.get())
                .add(MigmatiteBlocks.MIGMATITE_REDSTONE_ORE.get())
                .add(MarbleBlocks.MARBLE_REDSTONE_ORE.get())
                .add(SiltstoneBlocks.SILTSTONE_REDSTONE_ORE.get())
                .add(RhyoliteBlocks.RHYOLITE_REDSTONE_ORE.get())
                .add(LimestoneBlocks.LIMESTONE_REDSTONE_ORE.get())
                .add(BlueschistBlocks.BLUESCHIST_REDSTONE_ORE.get())
                .add(GreenschistBlocks.GREENSCHIST_REDSTONE_ORE.get())
                .add(ChalkBlocks.CHALK_REDSTONE_ORE.get())
                .add(ShaleBlocks.SHALE_REDSTONE_ORE.get())
                .add(ChertBlocks.CHERT_REDSTONE_ORE.get())
                .add(LigniteBlocks.LIGNITE_REDSTONE_ORE.get())
                .add(DolomiteBlocks.DOLOMITE_REDSTONE_ORE.get())
                .add(EclogiteBlocks.ECLOGITE_REDSTONE_ORE.get())
                .add(GreywackeBlocks.GREYWACKE_REDSTONE_ORE.get())
                .add(KomatiiteBlocks.KOMATIITE_REDSTONE_ORE.get())
                .add(DaciteBlocks.DACITE_REDSTONE_ORE.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_REDSTONE_ORE.get())
                .add(GabbroBlocks.GABBRO_REDSTONE_ORE.get())
                .add(GneissBlocks.GNEISS_REDSTONE_ORE.get());

        // ------------------------------------------------------------
        // Generation base stone tag
        // ------------------------------------------------------------
        tag(BlockTags.BASE_STONE_OVERWORLD)
                .add(SoapstoneBlocks.SOAPSTONE_BLOCK.get())
                .add(RhyoliteBlocks.RHYOLITE_BLOCK.get())
                .add(RedGraniteBlocks.RED_GRANITE_BLOCK.get())
                .add(QuartziteBlocks.QUARTZITE_BLOCK.get())
                .add(MigmatiteBlocks.MIGMATITE_BLOCK.get())
                .add(MarbleBlocks.MARBLE_BLOCK.get())
                .add(LimestoneBlocks.LIMESTONE_BLOCK.get())
                .add(SiltstoneBlocks.SILTSTONE_BLOCK.get())
                .add(BlueschistBlocks.BLUESCHIST_BLOCK.get())
                .add(GreenschistBlocks.GREENSCHIST_BLOCK.get())
                .add(ChalkBlocks.CHALK_BLOCK.get())
                .add(ShaleBlocks.SHALE_BLOCK.get())
                .add(ChertBlocks.CHERT_BLOCK.get())
                .add(LigniteBlocks.LIGNITE_BLOCK.get())
                .add(DolomiteBlocks.DOLOMITE_BLOCK.get())
                .add(EclogiteBlocks.ECLOGITE_BLOCK.get())
                .add(GreywackeBlocks.GREYWACKE_BLOCK.get())
                .add(KomatiiteBlocks.KOMATIITE_BLOCK.get())
                .add(DaciteBlocks.DACITE_BLOCK.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_BLOCK.get())
                .add(GabbroBlocks.GABBRO_BLOCK.get())
                .add(GneissBlocks.GNEISS_BLOCK.get());

        // ------------------------------------------------------------
        // Block type tags (stairs, slabs, walls, buttons)
        // ------------------------------------------------------------
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

                .add(SiltstoneBlocks.SILTSTONE_STAIRS.get())

                .add(BlueschistBlocks.BLUESCHIST_STAIRS.get())
                .add(BlueschistBlocks.BLUESCHIST_BRICK_STAIRS.get())
                .add(BlueschistBlocks.BLUESCHIST_COBBLE_STAIRS.get())

                .add(GreenschistBlocks.GREENSCHIST_STAIRS.get())
                .add(GreenschistBlocks.GREENSCHIST_BRICK_STAIRS.get())
                .add(GreenschistBlocks.GREENSCHIST_COBBLE_STAIRS.get())

                .add(ChalkBlocks.CHALK_STAIRS.get())

                .add(ShaleBlocks.SHALE_STAIRS.get())

                .add(ChertBlocks.CHERT_STAIRS.get())

                .add(LigniteBlocks.LIGNITE_STAIRS.get())

                .add(DolomiteBlocks.DOLOMITE_STAIRS.get())

                .add(EclogiteBlocks.ECLOGITE_STAIRS.get())

                .add(GreywackeBlocks.GREYWACKE_STAIRS.get())

                .add(KomatiiteBlocks.KOMATIITE_STAIRS.get())
                .add(KomatiiteBlocks.KOMATIITE_BRICK_STAIRS.get())
                .add(KomatiiteBlocks.KOMATIITE_COBBLE_STAIRS.get())

                .add(DaciteBlocks.DACITE_STAIRS.get())
                .add(DaciteBlocks.DACITE_BRICK_STAIRS.get())
                .add(DaciteBlocks.DACITE_COBBLE_STAIRS.get())

                .add(BlackGraniteBlocks.BLACK_GRANITE_STAIRS.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_BRICK_STAIRS.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_COBBLE_STAIRS.get())

                .add(GabbroBlocks.GABBRO_STAIRS.get())
                .add(GabbroBlocks.GABBRO_BRICK_STAIRS.get())
                .add(GabbroBlocks.GABBRO_COBBLE_STAIRS.get())

                .add(GneissBlocks.GNEISS_STAIRS.get())
                .add(GneissBlocks.GNEISS_BRICK_STAIRS.get())
                .add(GneissBlocks.GNEISS_COBBLE_STAIRS.get());

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

                .add(SiltstoneBlocks.SILTSTONE_BLOCK_SLAB.get())

                .add(BlueschistBlocks.BLUESCHIST_BLOCK_SLAB.get())
                .add(BlueschistBlocks.BLUESCHIST_COBBLE_SLAB.get())
                .add(BlueschistBlocks.BLUESCHIST_BRICK_SLAB.get())

                .add(GreenschistBlocks.GREENSCHIST_BLOCK_SLAB.get())
                .add(GreenschistBlocks.GREENSCHIST_COBBLE_SLAB.get())
                .add(GreenschistBlocks.GREENSCHIST_BRICK_SLAB.get())

                .add(ChalkBlocks.CHALK_BLOCK_SLAB.get())

                .add(ShaleBlocks.SHALE_BLOCK_SLAB.get())

                .add(ChertBlocks.CHERT_BLOCK_SLAB.get())

                .add(LigniteBlocks.LIGNITE_BLOCK_SLAB.get())

                .add(DolomiteBlocks.DOLOMITE_BLOCK_SLAB.get())

                .add(EclogiteBlocks.ECLOGITE_BLOCK_SLAB.get())

                .add(GreywackeBlocks.GREYWACKE_BLOCK_SLAB.get())

                .add(KomatiiteBlocks.KOMATIITE_BLOCK_SLAB.get())
                .add(KomatiiteBlocks.KOMATIITE_COBBLE_SLAB.get())
                .add(KomatiiteBlocks.KOMATIITE_BRICK_SLAB.get())

                .add(DaciteBlocks.DACITE_BLOCK_SLAB.get())
                .add(DaciteBlocks.DACITE_COBBLE_SLAB.get())
                .add(DaciteBlocks.DACITE_BRICK_SLAB.get())

                .add(BlackGraniteBlocks.BLACK_GRANITE_BLOCK_SLAB.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_COBBLE_SLAB.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_BRICK_SLAB.get())

                .add(GabbroBlocks.GABBRO_BLOCK_SLAB.get())
                .add(GabbroBlocks.GABBRO_COBBLE_SLAB.get())
                .add(GabbroBlocks.GABBRO_BRICK_SLAB.get())

                .add(GneissBlocks.GNEISS_BLOCK_SLAB.get())
                .add(GneissBlocks.GNEISS_COBBLE_SLAB.get())
                .add(GneissBlocks.GNEISS_BRICK_SLAB.get());

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

                .add(SiltstoneBlocks.SILTSTONE_BLOCK_WALL.get())

                .add(BlueschistBlocks.BLUESCHIST_BLOCK_WALL.get())
                .add(BlueschistBlocks.BLUESCHIST_COBBLE_WALL.get())
                .add(BlueschistBlocks.BLUESCHIST_BRICK_WALL.get())

                .add(GreenschistBlocks.GREENSCHIST_BLOCK_WALL.get())
                .add(GreenschistBlocks.GREENSCHIST_COBBLE_WALL.get())
                .add(GreenschistBlocks.GREENSCHIST_BRICK_WALL.get())

                .add(ChalkBlocks.CHALK_BLOCK_WALL.get())

                .add(ShaleBlocks.SHALE_BLOCK_WALL.get())

                .add(ChertBlocks.CHERT_BLOCK_WALL.get())

                .add(LigniteBlocks.LIGNITE_BLOCK_WALL.get())

                .add(DolomiteBlocks.DOLOMITE_BLOCK_WALL.get())

                .add(EclogiteBlocks.ECLOGITE_BLOCK_WALL.get())

                .add(GreywackeBlocks.GREYWACKE_BLOCK_WALL.get())

                .add(KomatiiteBlocks.KOMATIITE_BLOCK_WALL.get())
                .add(KomatiiteBlocks.KOMATIITE_COBBLE_WALL.get())
                .add(KomatiiteBlocks.KOMATIITE_BRICK_WALL.get())

                .add(DaciteBlocks.DACITE_BLOCK_WALL.get())
                .add(DaciteBlocks.DACITE_COBBLE_WALL.get())
                .add(DaciteBlocks.DACITE_BRICK_WALL.get())

                .add(BlackGraniteBlocks.BLACK_GRANITE_BLOCK_WALL.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_COBBLE_WALL.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_BRICK_WALL.get())

                .add(GabbroBlocks.GABBRO_BLOCK_WALL.get())
                .add(GabbroBlocks.GABBRO_COBBLE_WALL.get())
                .add(GabbroBlocks.GABBRO_BRICK_WALL.get())

                .add(GneissBlocks.GNEISS_BLOCK_WALL.get())
                .add(GneissBlocks.GNEISS_COBBLE_WALL.get())
                .add(GneissBlocks.GNEISS_BRICK_WALL.get());

        tag(BlockTags.BUTTONS)
                .add(SoapstoneBlocks.SOAPSTONE_STONE_BUTTON.get())
                .add(RhyoliteBlocks.RHYOLITE_STONE_BUTTON.get())
                .add(RedGraniteBlocks.RED_GRANITE_STONE_BUTTON.get())
                .add(QuartziteBlocks.QUARTZITE_STONE_BUTTON.get())
                .add(MigmatiteBlocks.MIGMATITE_STONE_BUTTON.get())
                .add(MarbleBlocks.MARBLE_STONE_BUTTON.get())
                .add(LimestoneBlocks.LIMESTONE_STONE_BUTTON.get())
                .add(SiltstoneBlocks.SILTSTONE_STONE_BUTTON.get())
                .add(BlueschistBlocks.BLUESCHIST_STONE_BUTTON.get())
                .add(GreenschistBlocks.GREENSCHIST_STONE_BUTTON.get())
                .add(ChalkBlocks.CHALK_STONE_BUTTON.get())
                .add(ShaleBlocks.SHALE_STONE_BUTTON.get())
                .add(ChertBlocks.CHERT_STONE_BUTTON.get())
                .add(LigniteBlocks.LIGNITE_STONE_BUTTON.get())
                .add(DolomiteBlocks.DOLOMITE_STONE_BUTTON.get())
                .add(EclogiteBlocks.ECLOGITE_STONE_BUTTON.get())
                .add(GreywackeBlocks.GREYWACKE_STONE_BUTTON.get())
                .add(KomatiiteBlocks.KOMATIITE_STONE_BUTTON.get())
                .add(DaciteBlocks.DACITE_STONE_BUTTON.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_STONE_BUTTON.get())
                .add(GabbroBlocks.GABBRO_STONE_BUTTON.get())
                .add(GneissBlocks.GNEISS_STONE_BUTTON.get());

        tag(BlockTags.STONE_BUTTONS)
                .add(SoapstoneBlocks.SOAPSTONE_STONE_BUTTON.get())
                .add(RhyoliteBlocks.RHYOLITE_STONE_BUTTON.get())
                .add(RedGraniteBlocks.RED_GRANITE_STONE_BUTTON.get())
                .add(QuartziteBlocks.QUARTZITE_STONE_BUTTON.get())
                .add(MigmatiteBlocks.MIGMATITE_STONE_BUTTON.get())
                .add(MarbleBlocks.MARBLE_STONE_BUTTON.get())
                .add(LimestoneBlocks.LIMESTONE_STONE_BUTTON.get())
                .add(SiltstoneBlocks.SILTSTONE_STONE_BUTTON.get())
                .add(BlueschistBlocks.BLUESCHIST_STONE_BUTTON.get())
                .add(GreenschistBlocks.GREENSCHIST_STONE_BUTTON.get())
                .add(ChalkBlocks.CHALK_STONE_BUTTON.get())
                .add(ShaleBlocks.SHALE_STONE_BUTTON.get())
                .add(ChertBlocks.CHERT_STONE_BUTTON.get())
                .add(LigniteBlocks.LIGNITE_STONE_BUTTON.get())
                .add(DolomiteBlocks.DOLOMITE_STONE_BUTTON.get())
                .add(EclogiteBlocks.ECLOGITE_STONE_BUTTON.get())
                .add(GreywackeBlocks.GREYWACKE_STONE_BUTTON.get())
                .add(KomatiiteBlocks.KOMATIITE_STONE_BUTTON.get())
                .add(DaciteBlocks.DACITE_STONE_BUTTON.get())
                .add(BlackGraniteBlocks.BLACK_GRANITE_STONE_BUTTON.get())
                .add(GabbroBlocks.GABBRO_STONE_BUTTON.get())
                .add(GneissBlocks.GNEISS_STONE_BUTTON.get());
    }
}
