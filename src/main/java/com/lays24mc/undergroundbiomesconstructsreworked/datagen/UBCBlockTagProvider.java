package com.lays24mc.undergroundbiomesconstructsreworked.datagen;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import org.apache.logging.log4j.core.pattern.AbstractStyleNameConverter;

import java.util.concurrent.CompletableFuture;

public class UBCBlockTagProvider extends BlockTagsProvider {
    public UBCBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, UndergroundBiomesConstructsReworked.MODID);
    }

    /**
     * All tags
     */

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        // ------------------------------------------------------------
        // All blocks that should be mined with a pickaxe
        // ------------------------------------------------------------
        tag(BlockTags.MINEABLE_WITH_PICKAXE)

                .add(BlackGraniteBlocks.BLACK_GRANITE_BLOCK.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_COBBLE_BLOCK.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_BRICK_BLOCK.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_IRON_ORE.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_GOLD_ORE.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_REDSTONE_ORE.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_LAPIS_ORE.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_DIAMOND_ORE.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_EMERALD_ORE.getKey())

                .add(BlueschistBlocks.BLUESCHIST_BLOCK.getKey())
                .add(BlueschistBlocks.BLUESCHIST_COBBLE_BLOCK.getKey())
                .add(BlueschistBlocks.BLUESCHIST_BRICK_BLOCK.getKey())
                .add(BlueschistBlocks.BLUESCHIST_IRON_ORE.getKey())
                .add(BlueschistBlocks.BLUESCHIST_GOLD_ORE.getKey())
                .add(BlueschistBlocks.BLUESCHIST_REDSTONE_ORE.getKey())
                .add(BlueschistBlocks.BLUESCHIST_LAPIS_ORE.getKey())
                .add(BlueschistBlocks.BLUESCHIST_COAL_ORE.getKey())
                .add(BlueschistBlocks.BLUESCHIST_COPPER_ORE.getKey())

                .add(ChalkBlocks.CHALK_BLOCK.getKey())
                .add(ChalkBlocks.CHALK_COAL_ORE.getKey())
                .add(ChalkBlocks.CHALK_IRON_ORE.getKey())
                .add(ChalkBlocks.CHALK_GOLD_ORE.getKey())
                .add(ChalkBlocks.CHALK_REDSTONE_ORE.getKey())
                .add(ChalkBlocks.CHALK_LAPIS_ORE.getKey())
                .add(ChalkBlocks.CHALK_COPPER_ORE.getKey())

                .add(ChertBlocks.CHERT_BLOCK.getKey())
                .add(ChertBlocks.CHERT_COAL_ORE.getKey())
                .add(ChertBlocks.CHERT_IRON_ORE.getKey())
                .add(ChertBlocks.CHERT_GOLD_ORE.getKey())
                .add(ChertBlocks.CHERT_REDSTONE_ORE.getKey())
                .add(ChertBlocks.CHERT_LAPIS_ORE.getKey())
                .add(ChertBlocks.CHERT_COPPER_ORE.getKey())

                .add(DaciteBlocks.DACITE_BLOCK.getKey())
                .add(DaciteBlocks.DACITE_COBBLE_BLOCK.getKey())
                .add(DaciteBlocks.DACITE_BRICK_BLOCK.getKey())
                .add(DaciteBlocks.DACITE_COAL_ORE.getKey())
                .add(DaciteBlocks.DACITE_COPPER_ORE.getKey())
                .add(DaciteBlocks.DACITE_IRON_ORE.getKey())
                .add(DaciteBlocks.DACITE_GOLD_ORE.getKey())
                .add(DaciteBlocks.DACITE_REDSTONE_ORE.getKey())
                .add(DaciteBlocks.DACITE_LAPIS_ORE.getKey())

                .add(DolomiteBlocks.DOLOMITE_BLOCK.getKey())
                .add(DolomiteBlocks.DOLOMITE_COAL_ORE.getKey())
                .add(DolomiteBlocks.DOLOMITE_COPPER_ORE.getKey())
                .add(DolomiteBlocks.DOLOMITE_IRON_ORE.getKey())
                .add(DolomiteBlocks.DOLOMITE_GOLD_ORE.getKey())
                .add(DolomiteBlocks.DOLOMITE_REDSTONE_ORE.getKey())
                .add(DolomiteBlocks.DOLOMITE_LAPIS_ORE.getKey())

                .add(EclogiteBlocks.ECLOGITE_BLOCK.getKey())
                .add(EclogiteBlocks.ECLOGITE_COAL_ORE.getKey())
                .add(EclogiteBlocks.ECLOGITE_COPPER_ORE.getKey())
                .add(EclogiteBlocks.ECLOGITE_IRON_ORE.getKey())
                .add(EclogiteBlocks.ECLOGITE_GOLD_ORE.getKey())
                .add(EclogiteBlocks.ECLOGITE_REDSTONE_ORE.getKey())
                .add(EclogiteBlocks.ECLOGITE_LAPIS_ORE.getKey())

                .add(GabbroBlocks.GABBRO_BLOCK.getKey())
                .add(GabbroBlocks.GABBRO_COBBLE_BLOCK.getKey())
                .add(GabbroBlocks.GABBRO_BRICK_BLOCK.getKey())
                .add(GabbroBlocks.GABBRO_IRON_ORE.getKey())
                .add(GabbroBlocks.GABBRO_GOLD_ORE.getKey())
                .add(GabbroBlocks.GABBRO_REDSTONE_ORE.getKey())
                .add(GabbroBlocks.GABBRO_LAPIS_ORE.getKey())
                .add(GabbroBlocks.GABBRO_DIAMOND_ORE.getKey())
                .add(GabbroBlocks.GABBRO_EMERALD_ORE.getKey())

                .add(GneissBlocks.GNEISS_BLOCK.getKey())
                .add(GneissBlocks.GNEISS_COBBLE_BLOCK.getKey())
                .add(GneissBlocks.GNEISS_BRICK_BLOCK.getKey())
                .add(GneissBlocks.GNEISS_IRON_ORE.getKey())
                .add(GneissBlocks.GNEISS_GOLD_ORE.getKey())
                .add(GneissBlocks.GNEISS_REDSTONE_ORE.getKey())
                .add(GneissBlocks.GNEISS_LAPIS_ORE.getKey())
                .add(GneissBlocks.GNEISS_DIAMOND_ORE.getKey())
                .add(GneissBlocks.GNEISS_EMERALD_ORE.getKey())

                .add(GreenschistBlocks.GREENSCHIST_BLOCK.getKey())
                .add(GreenschistBlocks.GREENSCHIST_COAL_ORE.getKey())
                .add(GreenschistBlocks.GREENSCHIST_COPPER_ORE.getKey())
                .add(GreenschistBlocks.GREENSCHIST_IRON_ORE.getKey())
                .add(GreenschistBlocks.GREENSCHIST_GOLD_ORE.getKey())
                .add(GreenschistBlocks.GREENSCHIST_REDSTONE_ORE.getKey())
                .add(GreenschistBlocks.GREENSCHIST_LAPIS_ORE.getKey())
                .add(GreenschistBlocks.GREENSCHIST_COPPER_ORE.getKey())
                .add(GreenschistBlocks.GREENSCHIST_IRON_ORE.getKey())
                .add(GreenschistBlocks.GREENSCHIST_BRICK_BLOCK.getKey())
                .add(GreenschistBlocks.GREENSCHIST_COBBLE_BLOCK.getKey())

                .add(GreywackeBlocks.GREYWACKE_BLOCK.getKey())
                .add(GreywackeBlocks.GREYWACKE_COAL_ORE.getKey())
                .add(GreywackeBlocks.GREYWACKE_COPPER_ORE.getKey())
                .add(GreywackeBlocks.GREYWACKE_IRON_ORE.getKey())
                .add(GreywackeBlocks.GREYWACKE_GOLD_ORE.getKey())
                .add(GreywackeBlocks.GREYWACKE_REDSTONE_ORE.getKey())
                .add(GreywackeBlocks.GREYWACKE_LAPIS_ORE.getKey())

                .add(KomatiiteBlocks.KOMATIITE_BLOCK.getKey())
                .add(KomatiiteBlocks.KOMATIITE_COBBLE_BLOCK.getKey())
                .add(KomatiiteBlocks.KOMATIITE_BRICK_BLOCK.getKey())
                .add(KomatiiteBlocks.KOMATIITE_COAL_ORE.getKey())
                .add(KomatiiteBlocks.KOMATIITE_COPPER_ORE.getKey())
                .add(KomatiiteBlocks.KOMATIITE_IRON_ORE.getKey())
                .add(KomatiiteBlocks.KOMATIITE_GOLD_ORE.getKey())
                .add(KomatiiteBlocks.KOMATIITE_REDSTONE_ORE.getKey())
                .add(KomatiiteBlocks.KOMATIITE_LAPIS_ORE.getKey())

                .add(LigniteBlocks.LIGNITE_BLOCK.getKey())
                .add(LigniteBlocks.LIGNITE_COAL_ORE.getKey())
                .add(LigniteBlocks.LIGNITE_IRON_ORE.getKey())
                .add(LigniteBlocks.LIGNITE_GOLD_ORE.getKey())
                .add(LigniteBlocks.LIGNITE_REDSTONE_ORE.getKey())
                .add(LigniteBlocks.LIGNITE_LAPIS_ORE.getKey())
                .add(LigniteBlocks.LIGNITE_COPPER_ORE.getKey())

                .add(LimestoneBlocks.LIMESTONE_BLOCK.getKey())
                .add(LimestoneBlocks.LIMESTONE_COAL_ORE.getKey())
                .add(LimestoneBlocks.LIMESTONE_IRON_ORE.getKey())
                .add(LimestoneBlocks.LIMESTONE_GOLD_ORE.getKey())
                .add(LimestoneBlocks.LIMESTONE_REDSTONE_ORE.getKey())
                .add(LimestoneBlocks.LIMESTONE_LAPIS_ORE.getKey())
                .add(LimestoneBlocks.LIMESTONE_COPPER_ORE.getKey())

                .add(MarbleBlocks.MARBLE_BLOCK.getKey())
                .add(MarbleBlocks.MARBLE_COBBLE_BLOCK.getKey())
                .add(MarbleBlocks.MARBLE_BRICK_BLOCK.getKey())
                .add(MarbleBlocks.MARBLE_IRON_ORE.getKey())
                .add(MarbleBlocks.MARBLE_GOLD_ORE.getKey())
                .add(MarbleBlocks.MARBLE_REDSTONE_ORE.getKey())
                .add(MarbleBlocks.MARBLE_LAPIS_ORE.getKey())
                .add(MarbleBlocks.MARBLE_DIAMOND_ORE.getKey())
                .add(MarbleBlocks.MARBLE_EMERALD_ORE.getKey())

                .add(MigmatiteBlocks.MIGMATITE_BLOCK.getKey())
                .add(MigmatiteBlocks.MIGMATITE_COBBLE_BLOCK.getKey())
                .add(MigmatiteBlocks.MIGMATITE_BRICK_BLOCK.getKey())
                .add(MigmatiteBlocks.MIGMATITE_IRON_ORE.getKey())
                .add(MigmatiteBlocks.MIGMATITE_GOLD_ORE.getKey())
                .add(MigmatiteBlocks.MIGMATITE_REDSTONE_ORE.getKey())
                .add(MigmatiteBlocks.MIGMATITE_LAPIS_ORE.getKey())
                .add(MigmatiteBlocks.MIGMATITE_DIAMOND_ORE.getKey())
                .add(MigmatiteBlocks.MIGMATITE_EMERALD_ORE.getKey())

                .add(QuartziteBlocks.QUARTZITE_BLOCK.getKey())
                .add(QuartziteBlocks.QUARTZITE_COBBLE_BLOCK.getKey())
                .add(QuartziteBlocks.QUARTZITE_BRICK_BLOCK.getKey())
                .add(QuartziteBlocks.QUARTZITE_IRON_ORE.getKey())
                .add(QuartziteBlocks.QUARTZITE_GOLD_ORE.getKey())
                .add(QuartziteBlocks.QUARTZITE_REDSTONE_ORE.getKey())
                .add(QuartziteBlocks.QUARTZITE_LAPIS_ORE.getKey())
                .add(QuartziteBlocks.QUARTZITE_DIAMOND_ORE.getKey())
                .add(QuartziteBlocks.QUARTZITE_EMERALD_ORE.getKey())

                .add(RedGraniteBlocks.RED_GRANITE_BLOCK.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_COBBLE_BLOCK.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_BRICK_BLOCK.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_DIAMOND_ORE.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_EMERALD_ORE.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_IRON_ORE.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_GOLD_ORE.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_REDSTONE_ORE.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_LAPIS_ORE.getKey())

                .add(RhyoliteBlocks.RHYOLITE_BLOCK.getKey())
                .add(RhyoliteBlocks.RHYOLITE_COBBLE_BLOCK.getKey())
                .add(RhyoliteBlocks.RHYOLITE_BRICK_BLOCK.getKey())
                .add(RhyoliteBlocks.RHYOLITE_COAL_ORE.getKey())
                .add(RhyoliteBlocks.RHYOLITE_COPPER_ORE.getKey())
                .add(RhyoliteBlocks.RHYOLITE_IRON_ORE.getKey())
                .add(RhyoliteBlocks.RHYOLITE_GOLD_ORE.getKey())
                .add(RhyoliteBlocks.RHYOLITE_REDSTONE_ORE.getKey())
                .add(RhyoliteBlocks.RHYOLITE_LAPIS_ORE.getKey())

                .add(ShaleBlocks.SHALE_BLOCK.getKey())
                .add(ShaleBlocks.SHALE_COAL_ORE.getKey())
                .add(ShaleBlocks.SHALE_COPPER_ORE.getKey())
                .add(ShaleBlocks.SHALE_IRON_ORE.getKey())
                .add(ShaleBlocks.SHALE_GOLD_ORE.getKey())
                .add(ShaleBlocks.SHALE_REDSTONE_ORE.getKey())
                .add(ShaleBlocks.SHALE_LAPIS_ORE.getKey())

                .add(SiltstoneBlocks.SILTSTONE_BLOCK.getKey())
                .add(SiltstoneBlocks.SILTSTONE_COAL_ORE.getKey())
                .add(SiltstoneBlocks.SILTSTONE_IRON_ORE.getKey())
                .add(SiltstoneBlocks.SILTSTONE_GOLD_ORE.getKey())
                .add(SiltstoneBlocks.SILTSTONE_REDSTONE_ORE.getKey())
                .add(SiltstoneBlocks.SILTSTONE_LAPIS_ORE.getKey())
                .add(SiltstoneBlocks.SILTSTONE_COPPER_ORE.getKey())

                .add(SoapstoneBlocks.SOAPSTONE_BLOCK.getKey())
                .add(SoapstoneBlocks.SOAPSTONE_COBBLE_BLOCK.getKey())
                .add(SoapstoneBlocks.SOAPSTONE_BRICK_BLOCK.getKey())
                .add(SoapstoneBlocks.SOAPSTONE_COAL_ORE.getKey())
                .add(SoapstoneBlocks.SOAPSTONE_COPPER_ORE.getKey())
                .add(SoapstoneBlocks.SOAPSTONE_IRON_ORE.getKey())
                .add(SoapstoneBlocks.SOAPSTONE_GOLD_ORE.getKey())
                .add(SoapstoneBlocks.SOAPSTONE_REDSTONE_ORE.getKey())
                .add(SoapstoneBlocks.SOAPSTONE_LAPIS_ORE.getKey())

                .add(BlackGraniteBlocks.BLACK_GRANITE_BLOCK_SLAB.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_COBBLE_SLAB.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_BRICK_SLAB.getKey())

                .add(BlueschistBlocks.BLUESCHIST_BLOCK_SLAB.getKey())
                .add(BlueschistBlocks.BLUESCHIST_COBBLE_SLAB.getKey())
                .add(BlueschistBlocks.BLUESCHIST_BRICK_SLAB.getKey())

                .add(ChalkBlocks.CHALK_BLOCK_SLAB.getKey())

                .add(ChertBlocks.CHERT_BLOCK_SLAB.getKey())

                .add(DaciteBlocks.DACITE_BLOCK_SLAB.getKey())
                .add(DaciteBlocks.DACITE_COBBLE_SLAB.getKey())
                .add(DaciteBlocks.DACITE_BRICK_SLAB.getKey())

                .add(DolomiteBlocks.DOLOMITE_BLOCK_SLAB.getKey())

                .add(EclogiteBlocks.ECLOGITE_BLOCK_SLAB.getKey())

                .add(GabbroBlocks.GABBRO_BLOCK_SLAB.getKey())
                .add(GabbroBlocks.GABBRO_COBBLE_SLAB.getKey())
                .add(GabbroBlocks.GABBRO_BRICK_SLAB.getKey())

                .add(GneissBlocks.GNEISS_BLOCK_SLAB.getKey())
                .add(GneissBlocks.GNEISS_COBBLE_SLAB.getKey())
                .add(GneissBlocks.GNEISS_BRICK_SLAB.getKey())

                .add(GreenschistBlocks.GREENSCHIST_BLOCK_SLAB.getKey())
                .add(GreenschistBlocks.GREENSCHIST_COBBLE_SLAB.getKey())
                .add(GreenschistBlocks.GREENSCHIST_BRICK_SLAB.getKey())

                .add(GreywackeBlocks.GREYWACKE_BLOCK_SLAB.getKey())

                .add(KomatiiteBlocks.KOMATIITE_BLOCK_SLAB.getKey())
                .add(KomatiiteBlocks.KOMATIITE_COBBLE_SLAB.getKey())
                .add(KomatiiteBlocks.KOMATIITE_BRICK_SLAB.getKey())

                .add(LigniteBlocks.LIGNITE_BLOCK_SLAB.getKey())

                .add(LimestoneBlocks.LIMESTONE_BLOCK_SLAB.getKey())

                .add(MarbleBlocks.MARBLE_BLOCK_SLAB.getKey())
                .add(MarbleBlocks.MARBLE_COBBLE_SLAB.getKey())
                .add(MarbleBlocks.MARBLE_BRICK_SLAB.getKey())

                .add(MigmatiteBlocks.MIGMATITE_BLOCK_SLAB.getKey())
                .add(MigmatiteBlocks.MIGMATITE_COBBLE_SLAB.getKey())
                .add(MigmatiteBlocks.MIGMATITE_BRICK_SLAB.getKey())

                .add(QuartziteBlocks.QUARTZITE_BLOCK_SLAB.getKey())
                .add(QuartziteBlocks.QUARTZITE_COBBLE_SLAB.getKey())
                .add(QuartziteBlocks.QUARTZITE_BRICK_SLAB.getKey())

                .add(RedGraniteBlocks.RED_GRANITE_BLOCK_SLAB.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_COBBLE_SLAB.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_BRICK_SLAB.getKey())

                .add(RhyoliteBlocks.RHYOLITE_BLOCK_SLAB.getKey())
                .add(RhyoliteBlocks.RHYOLITE_COBBLE_SLAB.getKey())
                .add(RhyoliteBlocks.RHYOLITE_BRICK_SLAB.getKey())

                .add(ShaleBlocks.SHALE_BLOCK_SLAB.getKey())

                .add(SiltstoneBlocks.SILTSTONE_BLOCK_SLAB.getKey())

                .add(SoapstoneBlocks.SOAPSTONE_BLOCK_SLAB.getKey())
                .add(SoapstoneBlocks.SOAPSTONE_COBBLE_SLAB.getKey())
                .add(SoapstoneBlocks.SOAPSTONE_BRICK_SLAB.getKey())

                .add(SoapstoneBlocks.SOAPSTONE_STAIRS.getKey())
                .add(SoapstoneBlocks.SOAPSTONE_BRICK_STAIRS.getKey())
                .add(SoapstoneBlocks.SOAPSTONE_COBBLE_STAIRS.getKey())

                .add(RhyoliteBlocks.RHYOLITE_STAIRS.getKey())
                .add(RhyoliteBlocks.RHYOLITE_COBBLE_STAIRS.getKey())
                .add(RhyoliteBlocks.RHYOLITE_BRICK_STAIRS.getKey())

                .add(RedGraniteBlocks.RED_GRANITE_STAIRS.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_COBBLE_STAIRS.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_BRICK_STAIRS.getKey())

                .add(QuartziteBlocks.QUARTZITE_STAIRS.getKey())
                .add(QuartziteBlocks.QUARTZITE_COBBLE_STAIRS.getKey())
                .add(QuartziteBlocks.QUARTZITE_BRICK_STAIRS.getKey())

                .add(MigmatiteBlocks.MIGMATITE_STAIRS.getKey())
                .add(MigmatiteBlocks.MIGMATITE_COBBLE_STAIRS.getKey())
                .add(MigmatiteBlocks.MIGMATITE_BRICK_STAIRS.getKey())

                .add(MarbleBlocks.MARBLE_STAIRS.getKey())
                .add(MarbleBlocks.MARBLE_COBBLE_STAIRS.getKey())
                .add(MarbleBlocks.MARBLE_BRICK_STAIRS.getKey())

                .add(LimestoneBlocks.LIMESTONE_STAIRS.getKey())

                .add(SiltstoneBlocks.SILTSTONE_STAIRS.getKey())

                .add(BlueschistBlocks.BLUESCHIST_STAIRS.getKey())
                .add(BlueschistBlocks.BLUESCHIST_BRICK_STAIRS.getKey())
                .add(BlueschistBlocks.BLUESCHIST_COBBLE_STAIRS.getKey())

                .add(GreenschistBlocks.GREENSCHIST_STAIRS.getKey())
                .add(GreenschistBlocks.GREENSCHIST_BRICK_STAIRS.getKey())
                .add(GreenschistBlocks.GREENSCHIST_COBBLE_STAIRS.getKey())

                .add(ChalkBlocks.CHALK_STAIRS.getKey())

                .add(ShaleBlocks.SHALE_STAIRS.getKey())

                .add(ChertBlocks.CHERT_STAIRS.getKey())

                .add(LigniteBlocks.LIGNITE_STAIRS.getKey())

                .add(DolomiteBlocks.DOLOMITE_STAIRS.getKey())

                .add(EclogiteBlocks.ECLOGITE_STAIRS.getKey())

                .add(GreywackeBlocks.GREYWACKE_STAIRS.getKey())

                .add(KomatiiteBlocks.KOMATIITE_STAIRS.getKey())
                .add(KomatiiteBlocks.KOMATIITE_BRICK_STAIRS.getKey())
                .add(KomatiiteBlocks.KOMATIITE_COBBLE_STAIRS.getKey())

                .add(DaciteBlocks.DACITE_STAIRS.getKey())
                .add(DaciteBlocks.DACITE_BRICK_STAIRS.getKey())
                .add(DaciteBlocks.DACITE_COBBLE_STAIRS.getKey())

                .add(BlackGraniteBlocks.BLACK_GRANITE_STAIRS.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_COBBLE_STAIRS.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_BRICK_STAIRS.getKey())

                .add(GabbroBlocks.GABBRO_STAIRS.getKey())
                .add(GabbroBlocks.GABBRO_COBBLE_STAIRS.getKey())
                .add(GabbroBlocks.GABBRO_BRICK_STAIRS.getKey())

                .add(GneissBlocks.GNEISS_STAIRS.getKey())
                .add(GneissBlocks.GNEISS_COBBLE_STAIRS.getKey())
                .add(GneissBlocks.GNEISS_BRICK_STAIRS.getKey())

                .add(SoapstoneBlocks.SOAPSTONE_BLOCK_WALL.getKey())
                .add(SoapstoneBlocks.SOAPSTONE_COBBLE_WALL.getKey())
                .add(SoapstoneBlocks.SOAPSTONE_BRICK_WALL.getKey())

                .add(RhyoliteBlocks.RHYOLITE_BLOCK_WALL.getKey())
                .add(RhyoliteBlocks.RHYOLITE_COBBLE_WALL.getKey())
                .add(RhyoliteBlocks.RHYOLITE_BRICK_WALL.getKey())

                .add(RedGraniteBlocks.RED_GRANITE_BLOCK_WALL.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_COBBLE_WALL.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_BRICK_WALL.getKey())

                .add(QuartziteBlocks.QUARTZITE_BLOCK_WALL.getKey())
                .add(QuartziteBlocks.QUARTZITE_COBBLE_WALL.getKey())
                .add(QuartziteBlocks.QUARTZITE_BRICK_WALL.getKey())

                .add(MigmatiteBlocks.MIGMATITE_BLOCK_WALL.getKey())
                .add(MigmatiteBlocks.MIGMATITE_COBBLE_WALL.getKey())
                .add(MigmatiteBlocks.MIGMATITE_BRICK_WALL.getKey())

                .add(MarbleBlocks.MARBLE_BLOCK_WALL.getKey())
                .add(MarbleBlocks.MARBLE_COBBLE_WALL.getKey())
                .add(MarbleBlocks.MARBLE_BRICK_WALL.getKey())

                .add(LimestoneBlocks.LIMESTONE_BLOCK_WALL.getKey())

                .add(SiltstoneBlocks.SILTSTONE_BLOCK_WALL.getKey())

                .add(BlueschistBlocks.BLUESCHIST_BLOCK_WALL.getKey())
                .add(BlueschistBlocks.BLUESCHIST_COBBLE_WALL.getKey())
                .add(BlueschistBlocks.BLUESCHIST_BRICK_WALL.getKey())

                .add(GreenschistBlocks.GREENSCHIST_BLOCK_WALL.getKey())
                .add(GreenschistBlocks.GREENSCHIST_COBBLE_WALL.getKey())
                .add(GreenschistBlocks.GREENSCHIST_BRICK_WALL.getKey())

                .add(ChalkBlocks.CHALK_BLOCK_WALL.getKey())

                .add(ShaleBlocks.SHALE_BLOCK_WALL.getKey())

                .add(ChertBlocks.CHERT_BLOCK_WALL.getKey())

                .add(LigniteBlocks.LIGNITE_BLOCK_WALL.getKey())

                .add(DolomiteBlocks.DOLOMITE_BLOCK_WALL.getKey())

                .add(EclogiteBlocks.ECLOGITE_BLOCK_WALL.getKey())

                .add(GreywackeBlocks.GREYWACKE_BLOCK_WALL.getKey())

                .add(KomatiiteBlocks.KOMATIITE_BLOCK_WALL.getKey())
                .add(KomatiiteBlocks.KOMATIITE_COBBLE_WALL.getKey())
                .add(KomatiiteBlocks.KOMATIITE_BRICK_WALL.getKey())

                .add(DaciteBlocks.DACITE_BLOCK_WALL.getKey())
                .add(DaciteBlocks.DACITE_COBBLE_WALL.getKey())
                .add(DaciteBlocks.DACITE_BRICK_WALL.getKey())

                .add(BlackGraniteBlocks.BLACK_GRANITE_BLOCK_WALL.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_COBBLE_WALL.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_BRICK_WALL.getKey())

                .add(GabbroBlocks.GABBRO_BLOCK_WALL.getKey())
                .add(GabbroBlocks.GABBRO_COBBLE_WALL.getKey())
                .add(GabbroBlocks.GABBRO_BRICK_WALL.getKey())

                .add(GneissBlocks.GNEISS_BLOCK_WALL.getKey())
                .add(GneissBlocks.GNEISS_COBBLE_WALL.getKey())
                .add(GneissBlocks.GNEISS_BRICK_WALL.getKey())

                .add(SoapstoneBlocks.SOAPSTONE_STONE_BUTTON.getKey())
                .add(RhyoliteBlocks.RHYOLITE_STONE_BUTTON.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_STONE_BUTTON.getKey())
                .add(QuartziteBlocks.QUARTZITE_STONE_BUTTON.getKey())
                .add(MigmatiteBlocks.MIGMATITE_STONE_BUTTON.getKey())
                .add(MarbleBlocks.MARBLE_STONE_BUTTON.getKey())
                .add(LimestoneBlocks.LIMESTONE_STONE_BUTTON.getKey())
                .add(SiltstoneBlocks.SILTSTONE_STONE_BUTTON.getKey())
                .add(BlueschistBlocks.BLUESCHIST_STONE_BUTTON.getKey())
                .add(GreenschistBlocks.GREENSCHIST_STONE_BUTTON.getKey())
                .add(ChalkBlocks.CHALK_STONE_BUTTON.getKey())
                .add(ShaleBlocks.SHALE_STONE_BUTTON.getKey())
                .add(ChertBlocks.CHERT_STONE_BUTTON.getKey())
                .add(LigniteBlocks.LIGNITE_STONE_BUTTON.getKey())
                .add(DolomiteBlocks.DOLOMITE_STONE_BUTTON.getKey())
                .add(EclogiteBlocks.ECLOGITE_STONE_BUTTON.getKey())
                .add(GreywackeBlocks.GREYWACKE_STONE_BUTTON.getKey())
                .add(KomatiiteBlocks.KOMATIITE_STONE_BUTTON.getKey())
                .add(DaciteBlocks.DACITE_STONE_BUTTON.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_STONE_BUTTON.getKey())
                .add(GabbroBlocks.GABBRO_STONE_BUTTON.getKey())
                .add(GneissBlocks.GNEISS_STONE_BUTTON.getKey());

        // ------------------------------------------------------------
        // Tool requirement tags
        // ------------------------------------------------------------

        tag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(RedGraniteBlocks.RED_GRANITE_DIAMOND_ORE.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_GOLD_ORE.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_REDSTONE_ORE.getKey())

                .add(QuartziteBlocks.QUARTZITE_DIAMOND_ORE.getKey())
                .add(QuartziteBlocks.QUARTZITE_GOLD_ORE.getKey())
                .add(QuartziteBlocks.QUARTZITE_REDSTONE_ORE.getKey())

                .add(MigmatiteBlocks.MIGMATITE_DIAMOND_ORE.getKey())
                .add(MigmatiteBlocks.MIGMATITE_GOLD_ORE.getKey())
                .add(MigmatiteBlocks.MIGMATITE_REDSTONE_ORE.getKey())

                .add(SoapstoneBlocks.SOAPSTONE_GOLD_ORE.getKey())
                .add(SoapstoneBlocks.SOAPSTONE_REDSTONE_ORE.getKey())

                .add(RhyoliteBlocks.RHYOLITE_GOLD_ORE.getKey())
                .add(RhyoliteBlocks.RHYOLITE_REDSTONE_ORE.getKey())

                .add(MarbleBlocks.MARBLE_GOLD_ORE.getKey())
                .add(MarbleBlocks.MARBLE_REDSTONE_ORE.getKey())

                .add(LimestoneBlocks.LIMESTONE_GOLD_ORE.getKey())
                .add(LimestoneBlocks.LIMESTONE_REDSTONE_ORE.getKey())

                .add(SiltstoneBlocks.SILTSTONE_GOLD_ORE.getKey())
                .add(SiltstoneBlocks.SILTSTONE_REDSTONE_ORE.getKey())

                .add(BlueschistBlocks.BLUESCHIST_GOLD_ORE.getKey())
                .add(BlueschistBlocks.BLUESCHIST_REDSTONE_ORE.getKey())

                .add(GreenschistBlocks.GREENSCHIST_GOLD_ORE.getKey())
                .add(GreenschistBlocks.GREENSCHIST_REDSTONE_ORE.getKey())

                .add(ChalkBlocks.CHALK_GOLD_ORE.getKey())
                .add(ChalkBlocks.CHALK_REDSTONE_ORE.getKey())

                .add(ShaleBlocks.SHALE_GOLD_ORE.getKey())
                .add(ShaleBlocks.SHALE_REDSTONE_ORE.getKey())

                .add(ChertBlocks.CHERT_GOLD_ORE.getKey())
                .add(ChertBlocks.CHERT_REDSTONE_ORE.getKey())

                .add(LigniteBlocks.LIGNITE_GOLD_ORE.getKey())
                .add(LigniteBlocks.LIGNITE_REDSTONE_ORE.getKey())

                .add(DolomiteBlocks.DOLOMITE_GOLD_ORE.getKey())
                .add(DolomiteBlocks.DOLOMITE_REDSTONE_ORE.getKey())

                .add(EclogiteBlocks.ECLOGITE_GOLD_ORE.getKey())
                .add(EclogiteBlocks.ECLOGITE_REDSTONE_ORE.getKey())

                .add(GreywackeBlocks.GREYWACKE_GOLD_ORE.getKey())
                .add(GreywackeBlocks.GREYWACKE_REDSTONE_ORE.getKey())

                .add(KomatiiteBlocks.KOMATIITE_GOLD_ORE.getKey())
                .add(KomatiiteBlocks.KOMATIITE_REDSTONE_ORE.getKey())

                .add(DaciteBlocks.DACITE_GOLD_ORE.getKey())
                .add(DaciteBlocks.DACITE_REDSTONE_ORE.getKey())

                .add(BlackGraniteBlocks.BLACK_GRANITE_DIAMOND_ORE.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_GOLD_ORE.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_REDSTONE_ORE.getKey())

                .add(GabbroBlocks.GABBRO_DIAMOND_ORE.getKey())
                .add(GabbroBlocks.GABBRO_GOLD_ORE.getKey())
                .add(GabbroBlocks.GABBRO_REDSTONE_ORE.getKey())

                .add(GneissBlocks.GNEISS_DIAMOND_ORE.getKey())
                .add(GneissBlocks.GNEISS_GOLD_ORE.getKey())
                .add(GneissBlocks.GNEISS_REDSTONE_ORE.getKey());

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(RedGraniteBlocks.RED_GRANITE_LAPIS_ORE.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_IRON_ORE.getKey())

                .add(RhyoliteBlocks.RHYOLITE_LAPIS_ORE.getKey())
                .add(RhyoliteBlocks.RHYOLITE_IRON_ORE.getKey())
                .add(RhyoliteBlocks.RHYOLITE_COPPER_ORE.getKey())
                .add(RhyoliteBlocks.RHYOLITE_COAL_ORE.getKey())

                .add(SoapstoneBlocks.SOAPSTONE_LAPIS_ORE.getKey())
                .add(SoapstoneBlocks.SOAPSTONE_IRON_ORE.getKey())
                .add(SoapstoneBlocks.SOAPSTONE_COPPER_ORE.getKey())
                .add(SoapstoneBlocks.SOAPSTONE_COAL_ORE.getKey())

                .add(QuartziteBlocks.QUARTZITE_LAPIS_ORE.getKey())
                .add(QuartziteBlocks.QUARTZITE_IRON_ORE.getKey())

                .add(MigmatiteBlocks.MIGMATITE_LAPIS_ORE.getKey())
                .add(MigmatiteBlocks.MIGMATITE_IRON_ORE.getKey())

                .add(MarbleBlocks.MARBLE_LAPIS_ORE.getKey())
                .add(MarbleBlocks.MARBLE_IRON_ORE.getKey())

                .add(LimestoneBlocks.LIMESTONE_COAL_ORE.getKey())
                .add(LimestoneBlocks.LIMESTONE_LAPIS_ORE.getKey())
                .add(LimestoneBlocks.LIMESTONE_IRON_ORE.getKey())
                .add(LimestoneBlocks.LIMESTONE_COPPER_ORE.getKey())

                .add(SiltstoneBlocks.SILTSTONE_COAL_ORE.getKey())
                .add(SiltstoneBlocks.SILTSTONE_LAPIS_ORE.getKey())
                .add(SiltstoneBlocks.SILTSTONE_IRON_ORE.getKey())
                .add(SiltstoneBlocks.SILTSTONE_COPPER_ORE.getKey())

                .add(BlueschistBlocks.BLUESCHIST_LAPIS_ORE.getKey())
                .add(BlueschistBlocks.BLUESCHIST_IRON_ORE.getKey())
                .add(BlueschistBlocks.BLUESCHIST_COPPER_ORE.getKey())
                .add(BlueschistBlocks.BLUESCHIST_COAL_ORE.getKey())

                .add(GreenschistBlocks.GREENSCHIST_LAPIS_ORE.getKey())
                .add(GreenschistBlocks.GREENSCHIST_IRON_ORE.getKey())
                .add(GreenschistBlocks.GREENSCHIST_COPPER_ORE.getKey())
                .add(GreenschistBlocks.GREENSCHIST_COAL_ORE.getKey())

                .add(ChalkBlocks.CHALK_COAL_ORE.getKey())
                .add(ChalkBlocks.CHALK_LAPIS_ORE.getKey())
                .add(ChalkBlocks.CHALK_IRON_ORE.getKey())
                .add(ChalkBlocks.CHALK_COPPER_ORE.getKey())

                .add(ShaleBlocks.SHALE_COAL_ORE.getKey())
                .add(ShaleBlocks.SHALE_LAPIS_ORE.getKey())
                .add(ShaleBlocks.SHALE_IRON_ORE.getKey())
                .add(ShaleBlocks.SHALE_COPPER_ORE.getKey())

                .add(ChertBlocks.CHERT_COAL_ORE.getKey())
                .add(ChertBlocks.CHERT_LAPIS_ORE.getKey())
                .add(ChertBlocks.CHERT_IRON_ORE.getKey())
                .add(ChertBlocks.CHERT_COPPER_ORE.getKey())

                .add(LigniteBlocks.LIGNITE_COAL_ORE.getKey())
                .add(LigniteBlocks.LIGNITE_LAPIS_ORE.getKey())
                .add(LigniteBlocks.LIGNITE_IRON_ORE.getKey())
                .add(LigniteBlocks.LIGNITE_COPPER_ORE.getKey())

                .add(DolomiteBlocks.DOLOMITE_COAL_ORE.getKey())
                .add(DolomiteBlocks.DOLOMITE_LAPIS_ORE.getKey())
                .add(DolomiteBlocks.DOLOMITE_IRON_ORE.getKey())
                .add(DolomiteBlocks.DOLOMITE_COPPER_ORE.getKey())

                .add(EclogiteBlocks.ECLOGITE_COAL_ORE.getKey())
                .add(EclogiteBlocks.ECLOGITE_LAPIS_ORE.getKey())
                .add(EclogiteBlocks.ECLOGITE_IRON_ORE.getKey())
                .add(EclogiteBlocks.ECLOGITE_COPPER_ORE.getKey())

                .add(GreywackeBlocks.GREYWACKE_COAL_ORE.getKey())
                .add(GreywackeBlocks.GREYWACKE_LAPIS_ORE.getKey())
                .add(GreywackeBlocks.GREYWACKE_IRON_ORE.getKey())
                .add(GreywackeBlocks.GREYWACKE_COPPER_ORE.getKey())

                .add(KomatiiteBlocks.KOMATIITE_LAPIS_ORE.getKey())
                .add(KomatiiteBlocks.KOMATIITE_IRON_ORE.getKey())
                .add(KomatiiteBlocks.KOMATIITE_COPPER_ORE.getKey())
                .add(KomatiiteBlocks.KOMATIITE_COAL_ORE.getKey())
                .add(DaciteBlocks.DACITE_LAPIS_ORE.getKey())
                .add(DaciteBlocks.DACITE_IRON_ORE.getKey())
                .add(DaciteBlocks.DACITE_COPPER_ORE.getKey())
                .add(DaciteBlocks.DACITE_COAL_ORE.getKey())

                .add(BlackGraniteBlocks.BLACK_GRANITE_LAPIS_ORE.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_IRON_ORE.getKey())

                .add(GabbroBlocks.GABBRO_LAPIS_ORE.getKey())
                .add(GabbroBlocks.GABBRO_IRON_ORE.getKey())

                .add(GneissBlocks.GNEISS_LAPIS_ORE.getKey())
                .add(GneissBlocks.GNEISS_IRON_ORE.getKey());

        // Tool tags
        tag(BlockTags.INCORRECT_FOR_STONE_TOOL)
                .add(RedGraniteBlocks.RED_GRANITE_DIAMOND_ORE.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_GOLD_ORE.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_REDSTONE_ORE.getKey())

                .add(QuartziteBlocks.QUARTZITE_DIAMOND_ORE.getKey())
                .add(QuartziteBlocks.QUARTZITE_GOLD_ORE.getKey())
                .add(QuartziteBlocks.QUARTZITE_REDSTONE_ORE.getKey())

                .add(MigmatiteBlocks.MIGMATITE_DIAMOND_ORE.getKey())
                .add(MigmatiteBlocks.MIGMATITE_GOLD_ORE.getKey())
                .add(MigmatiteBlocks.MIGMATITE_REDSTONE_ORE.getKey())

                .add(MarbleBlocks.MARBLE_DIAMOND_ORE.getKey())
                .add(MarbleBlocks.MARBLE_GOLD_ORE.getKey())
                .add(MarbleBlocks.MARBLE_REDSTONE_ORE.getKey())

                .add(SoapstoneBlocks.SOAPSTONE_GOLD_ORE.getKey())
                .add(SoapstoneBlocks.SOAPSTONE_REDSTONE_ORE.getKey())

                .add(RhyoliteBlocks.RHYOLITE_GOLD_ORE.getKey())
                .add(RhyoliteBlocks.RHYOLITE_REDSTONE_ORE.getKey())

                .add(LimestoneBlocks.LIMESTONE_GOLD_ORE.getKey())
                .add(LimestoneBlocks.LIMESTONE_REDSTONE_ORE.getKey())

                .add(SiltstoneBlocks.SILTSTONE_GOLD_ORE.getKey())
                .add(SiltstoneBlocks.SILTSTONE_REDSTONE_ORE.getKey())

                .add(BlueschistBlocks.BLUESCHIST_GOLD_ORE.getKey())
                .add(BlueschistBlocks.BLUESCHIST_REDSTONE_ORE.getKey())

                .add(GreenschistBlocks.GREENSCHIST_GOLD_ORE.getKey())
                .add(GreenschistBlocks.GREENSCHIST_REDSTONE_ORE.getKey())

                .add(ChalkBlocks.CHALK_GOLD_ORE.getKey())
                .add(ChalkBlocks.CHALK_REDSTONE_ORE.getKey())

                .add(ShaleBlocks.SHALE_GOLD_ORE.getKey())
                .add(ShaleBlocks.SHALE_REDSTONE_ORE.getKey())

                .add(ChertBlocks.CHERT_GOLD_ORE.getKey())
                .add(ChertBlocks.CHERT_REDSTONE_ORE.getKey())

                .add(LigniteBlocks.LIGNITE_GOLD_ORE.getKey())
                .add(LigniteBlocks.LIGNITE_REDSTONE_ORE.getKey())

                .add(DolomiteBlocks.DOLOMITE_GOLD_ORE.getKey())
                .add(DolomiteBlocks.DOLOMITE_REDSTONE_ORE.getKey())

                .add(EclogiteBlocks.ECLOGITE_GOLD_ORE.getKey())
                .add(EclogiteBlocks.ECLOGITE_REDSTONE_ORE.getKey())

                .add(GreywackeBlocks.GREYWACKE_GOLD_ORE.getKey())
                .add(GreywackeBlocks.GREYWACKE_REDSTONE_ORE.getKey())

                .add(KomatiiteBlocks.KOMATIITE_GOLD_ORE.getKey())
                .add(KomatiiteBlocks.KOMATIITE_REDSTONE_ORE.getKey())

                .add(DaciteBlocks.DACITE_GOLD_ORE.getKey())
                .add(DaciteBlocks.DACITE_REDSTONE_ORE.getKey())

                .add(BlackGraniteBlocks.BLACK_GRANITE_DIAMOND_ORE.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_GOLD_ORE.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_REDSTONE_ORE.getKey())

                .add(GabbroBlocks.GABBRO_DIAMOND_ORE.getKey())
                .add(GabbroBlocks.GABBRO_GOLD_ORE.getKey())
                .add(GabbroBlocks.GABBRO_REDSTONE_ORE.getKey())

                .add(GneissBlocks.GNEISS_DIAMOND_ORE.getKey())
                .add(GneissBlocks.GNEISS_GOLD_ORE.getKey())
                .add(GneissBlocks.GNEISS_REDSTONE_ORE.getKey());

        tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
                .add(RedGraniteBlocks.RED_GRANITE_DIAMOND_ORE.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_LAPIS_ORE.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_GOLD_ORE.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_REDSTONE_ORE.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_IRON_ORE.getKey())

                .add(QuartziteBlocks.QUARTZITE_DIAMOND_ORE.getKey())
                .add(QuartziteBlocks.QUARTZITE_LAPIS_ORE.getKey())
                .add(QuartziteBlocks.QUARTZITE_GOLD_ORE.getKey())
                .add(QuartziteBlocks.QUARTZITE_REDSTONE_ORE.getKey())
                .add(QuartziteBlocks.QUARTZITE_IRON_ORE.getKey())

                .add(MigmatiteBlocks.MIGMATITE_DIAMOND_ORE.getKey())
                .add(MigmatiteBlocks.MIGMATITE_LAPIS_ORE.getKey())
                .add(MigmatiteBlocks.MIGMATITE_GOLD_ORE.getKey())
                .add(MigmatiteBlocks.MIGMATITE_REDSTONE_ORE.getKey())
                .add(MigmatiteBlocks.MIGMATITE_IRON_ORE.getKey())

                .add(MarbleBlocks.MARBLE_DIAMOND_ORE.getKey())
                .add(MarbleBlocks.MARBLE_LAPIS_ORE.getKey())
                .add(MarbleBlocks.MARBLE_GOLD_ORE.getKey())
                .add(MarbleBlocks.MARBLE_REDSTONE_ORE.getKey())
                .add(MarbleBlocks.MARBLE_IRON_ORE.getKey())

                .add(SoapstoneBlocks.SOAPSTONE_GOLD_ORE.getKey())
                .add(SoapstoneBlocks.SOAPSTONE_REDSTONE_ORE.getKey())
                .add(SoapstoneBlocks.SOAPSTONE_IRON_ORE.getKey())
                .add(SoapstoneBlocks.SOAPSTONE_COPPER_ORE.getKey())
                .add(SoapstoneBlocks.SOAPSTONE_COAL_ORE.getKey())

                .add(RhyoliteBlocks.RHYOLITE_GOLD_ORE.getKey())
                .add(RhyoliteBlocks.RHYOLITE_REDSTONE_ORE.getKey())
                .add(RhyoliteBlocks.RHYOLITE_IRON_ORE.getKey())
                .add(RhyoliteBlocks.RHYOLITE_COPPER_ORE.getKey())
                .add(RhyoliteBlocks.RHYOLITE_COAL_ORE.getKey())

                .add(LimestoneBlocks.LIMESTONE_GOLD_ORE.getKey())
                .add(LimestoneBlocks.LIMESTONE_REDSTONE_ORE.getKey())
                .add(LimestoneBlocks.LIMESTONE_IRON_ORE.getKey())
                .add(LimestoneBlocks.LIMESTONE_COPPER_ORE.getKey())
                .add(LimestoneBlocks.LIMESTONE_COAL_ORE.getKey())

                .add(SiltstoneBlocks.SILTSTONE_GOLD_ORE.getKey())
                .add(SiltstoneBlocks.SILTSTONE_REDSTONE_ORE.getKey())
                .add(SiltstoneBlocks.SILTSTONE_IRON_ORE.getKey())
                .add(SiltstoneBlocks.SILTSTONE_COPPER_ORE.getKey())
                .add(SiltstoneBlocks.SILTSTONE_COAL_ORE.getKey())

                .add(BlueschistBlocks.BLUESCHIST_GOLD_ORE.getKey())
                .add(BlueschistBlocks.BLUESCHIST_REDSTONE_ORE.getKey())
                .add(BlueschistBlocks.BLUESCHIST_IRON_ORE.getKey())
                .add(BlueschistBlocks.BLUESCHIST_COPPER_ORE.getKey())
                .add(BlueschistBlocks.BLUESCHIST_COAL_ORE.getKey())

                .add(GreenschistBlocks.GREENSCHIST_GOLD_ORE.getKey())
                .add(GreenschistBlocks.GREENSCHIST_REDSTONE_ORE.getKey())
                .add(GreenschistBlocks.GREENSCHIST_IRON_ORE.getKey())
                .add(GreenschistBlocks.GREENSCHIST_COPPER_ORE.getKey())
                .add(GreenschistBlocks.GREENSCHIST_COAL_ORE.getKey())

                .add(ChalkBlocks.CHALK_GOLD_ORE.getKey())
                .add(ChalkBlocks.CHALK_REDSTONE_ORE.getKey())
                .add(ChalkBlocks.CHALK_IRON_ORE.getKey())
                .add(ChalkBlocks.CHALK_COPPER_ORE.getKey())
                .add(ChalkBlocks.CHALK_COAL_ORE.getKey())

                .add(ShaleBlocks.SHALE_GOLD_ORE.getKey())
                .add(ShaleBlocks.SHALE_REDSTONE_ORE.getKey())
                .add(ShaleBlocks.SHALE_IRON_ORE.getKey())
                .add(ShaleBlocks.SHALE_COPPER_ORE.getKey())
                .add(ShaleBlocks.SHALE_COAL_ORE.getKey())

                .add(ChertBlocks.CHERT_GOLD_ORE.getKey())
                .add(ChertBlocks.CHERT_REDSTONE_ORE.getKey())
                .add(ChertBlocks.CHERT_IRON_ORE.getKey())
                .add(ChertBlocks.CHERT_COPPER_ORE.getKey())
                .add(ChertBlocks.CHERT_COAL_ORE.getKey())

                .add(LigniteBlocks.LIGNITE_GOLD_ORE.getKey())
                .add(LigniteBlocks.LIGNITE_REDSTONE_ORE.getKey())
                .add(LigniteBlocks.LIGNITE_IRON_ORE.getKey())
                .add(LigniteBlocks.LIGNITE_COPPER_ORE.getKey())
                .add(LigniteBlocks.LIGNITE_COAL_ORE.getKey())

                .add(DolomiteBlocks.DOLOMITE_GOLD_ORE.getKey())
                .add(DolomiteBlocks.DOLOMITE_REDSTONE_ORE.getKey())
                .add(DolomiteBlocks.DOLOMITE_IRON_ORE.getKey())
                .add(DolomiteBlocks.DOLOMITE_COPPER_ORE.getKey())
                .add(DolomiteBlocks.DOLOMITE_COAL_ORE.getKey())

                .add(EclogiteBlocks.ECLOGITE_GOLD_ORE.getKey())
                .add(EclogiteBlocks.ECLOGITE_REDSTONE_ORE.getKey())
                .add(EclogiteBlocks.ECLOGITE_IRON_ORE.getKey())
                .add(EclogiteBlocks.ECLOGITE_COPPER_ORE.getKey())
                .add(EclogiteBlocks.ECLOGITE_COAL_ORE.getKey())

                .add(GreywackeBlocks.GREYWACKE_GOLD_ORE.getKey())
                .add(GreywackeBlocks.GREYWACKE_REDSTONE_ORE.getKey())
                .add(GreywackeBlocks.GREYWACKE_IRON_ORE.getKey())
                .add(GreywackeBlocks.GREYWACKE_COPPER_ORE.getKey())
                .add(GreywackeBlocks.GREYWACKE_COAL_ORE.getKey())

                .add(KomatiiteBlocks.KOMATIITE_GOLD_ORE.getKey())
                .add(KomatiiteBlocks.KOMATIITE_REDSTONE_ORE.getKey())
                .add(KomatiiteBlocks.KOMATIITE_IRON_ORE.getKey())
                .add(KomatiiteBlocks.KOMATIITE_COPPER_ORE.getKey())
                .add(KomatiiteBlocks.KOMATIITE_COAL_ORE.getKey())

                .add(DaciteBlocks.DACITE_GOLD_ORE.getKey())
                .add(DaciteBlocks.DACITE_REDSTONE_ORE.getKey())
                .add(DaciteBlocks.DACITE_IRON_ORE.getKey())
                .add(DaciteBlocks.DACITE_COPPER_ORE.getKey())
                .add(DaciteBlocks.DACITE_COAL_ORE.getKey())

                .add(BlackGraniteBlocks.BLACK_GRANITE_DIAMOND_ORE.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_LAPIS_ORE.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_GOLD_ORE.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_REDSTONE_ORE.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_IRON_ORE.getKey())

                .add(GabbroBlocks.GABBRO_DIAMOND_ORE.getKey())
                .add(GabbroBlocks.GABBRO_LAPIS_ORE.getKey())
                .add(GabbroBlocks.GABBRO_GOLD_ORE.getKey())
                .add(GabbroBlocks.GABBRO_REDSTONE_ORE.getKey())
                .add(GabbroBlocks.GABBRO_IRON_ORE.getKey())

                .add(GneissBlocks.GNEISS_DIAMOND_ORE.getKey())
                .add(GneissBlocks.GNEISS_LAPIS_ORE.getKey())
                .add(GneissBlocks.GNEISS_GOLD_ORE.getKey())
                .add(GneissBlocks.GNEISS_REDSTONE_ORE.getKey())
                .add(GneissBlocks.GNEISS_IRON_ORE.getKey());

        tag(BlockTags.INCORRECT_FOR_IRON_TOOL);

        tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
                .add(RedGraniteBlocks.RED_GRANITE_DIAMOND_ORE.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_LAPIS_ORE.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_GOLD_ORE.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_REDSTONE_ORE.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_IRON_ORE.getKey())

                .add(QuartziteBlocks.QUARTZITE_DIAMOND_ORE.getKey())
                .add(QuartziteBlocks.QUARTZITE_LAPIS_ORE.getKey())
                .add(QuartziteBlocks.QUARTZITE_GOLD_ORE.getKey())
                .add(QuartziteBlocks.QUARTZITE_REDSTONE_ORE.getKey())
                .add(QuartziteBlocks.QUARTZITE_IRON_ORE.getKey())

                .add(MigmatiteBlocks.MIGMATITE_DIAMOND_ORE.getKey())
                .add(MigmatiteBlocks.MIGMATITE_LAPIS_ORE.getKey())
                .add(MigmatiteBlocks.MIGMATITE_GOLD_ORE.getKey())
                .add(MigmatiteBlocks.MIGMATITE_REDSTONE_ORE.getKey())
                .add(MigmatiteBlocks.MIGMATITE_IRON_ORE.getKey())

                .add(MarbleBlocks.MARBLE_DIAMOND_ORE.getKey())
                .add(MarbleBlocks.MARBLE_LAPIS_ORE.getKey())
                .add(MarbleBlocks.MARBLE_GOLD_ORE.getKey())
                .add(MarbleBlocks.MARBLE_REDSTONE_ORE.getKey())
                .add(MarbleBlocks.MARBLE_IRON_ORE.getKey())

                .add(SoapstoneBlocks.SOAPSTONE_GOLD_ORE.getKey())
                .add(SoapstoneBlocks.SOAPSTONE_REDSTONE_ORE.getKey())
                .add(SoapstoneBlocks.SOAPSTONE_IRON_ORE.getKey())
                .add(SoapstoneBlocks.SOAPSTONE_COPPER_ORE.getKey())
                .add(SoapstoneBlocks.SOAPSTONE_COAL_ORE.getKey())

                .add(RhyoliteBlocks.RHYOLITE_GOLD_ORE.getKey())
                .add(RhyoliteBlocks.RHYOLITE_REDSTONE_ORE.getKey())
                .add(RhyoliteBlocks.RHYOLITE_IRON_ORE.getKey())
                .add(RhyoliteBlocks.RHYOLITE_COPPER_ORE.getKey())
                .add(RhyoliteBlocks.RHYOLITE_COAL_ORE.getKey())

                .add(LimestoneBlocks.LIMESTONE_GOLD_ORE.getKey())
                .add(LimestoneBlocks.LIMESTONE_REDSTONE_ORE.getKey())
                .add(LimestoneBlocks.LIMESTONE_IRON_ORE.getKey())
                .add(LimestoneBlocks.LIMESTONE_COPPER_ORE.getKey())
                .add(LimestoneBlocks.LIMESTONE_COAL_ORE.getKey())

                .add(SiltstoneBlocks.SILTSTONE_GOLD_ORE.getKey())
                .add(SiltstoneBlocks.SILTSTONE_REDSTONE_ORE.getKey())
                .add(SiltstoneBlocks.SILTSTONE_IRON_ORE.getKey())
                .add(SiltstoneBlocks.SILTSTONE_COPPER_ORE.getKey())
                .add(SiltstoneBlocks.SILTSTONE_COAL_ORE.getKey())

                .add(BlueschistBlocks.BLUESCHIST_GOLD_ORE.getKey())
                .add(BlueschistBlocks.BLUESCHIST_REDSTONE_ORE.getKey())
                .add(BlueschistBlocks.BLUESCHIST_IRON_ORE.getKey())
                .add(BlueschistBlocks.BLUESCHIST_COPPER_ORE.getKey())
                .add(BlueschistBlocks.BLUESCHIST_COAL_ORE.getKey())

                .add(GreenschistBlocks.GREENSCHIST_GOLD_ORE.getKey())
                .add(GreenschistBlocks.GREENSCHIST_REDSTONE_ORE.getKey())
                .add(GreenschistBlocks.GREENSCHIST_IRON_ORE.getKey())
                .add(GreenschistBlocks.GREENSCHIST_COPPER_ORE.getKey())
                .add(GreenschistBlocks.GREENSCHIST_COAL_ORE.getKey())

                .add(ChalkBlocks.CHALK_GOLD_ORE.getKey())
                .add(ChalkBlocks.CHALK_REDSTONE_ORE.getKey())
                .add(ChalkBlocks.CHALK_IRON_ORE.getKey())
                .add(ChalkBlocks.CHALK_COPPER_ORE.getKey())
                .add(ChalkBlocks.CHALK_COAL_ORE.getKey())

                .add(ShaleBlocks.SHALE_GOLD_ORE.getKey())
                .add(ShaleBlocks.SHALE_REDSTONE_ORE.getKey())
                .add(ShaleBlocks.SHALE_IRON_ORE.getKey())
                .add(ShaleBlocks.SHALE_COPPER_ORE.getKey())
                .add(ShaleBlocks.SHALE_COAL_ORE.getKey())

                .add(ChertBlocks.CHERT_GOLD_ORE.getKey())
                .add(ChertBlocks.CHERT_REDSTONE_ORE.getKey())
                .add(ChertBlocks.CHERT_IRON_ORE.getKey())
                .add(ChertBlocks.CHERT_COPPER_ORE.getKey())
                .add(ChertBlocks.CHERT_COAL_ORE.getKey())

                .add(LigniteBlocks.LIGNITE_GOLD_ORE.getKey())
                .add(LigniteBlocks.LIGNITE_REDSTONE_ORE.getKey())
                .add(LigniteBlocks.LIGNITE_IRON_ORE.getKey())
                .add(LigniteBlocks.LIGNITE_COPPER_ORE.getKey())
                .add(LigniteBlocks.LIGNITE_COAL_ORE.getKey())

                .add(DolomiteBlocks.DOLOMITE_GOLD_ORE.getKey())
                .add(DolomiteBlocks.DOLOMITE_REDSTONE_ORE.getKey())
                .add(DolomiteBlocks.DOLOMITE_IRON_ORE.getKey())
                .add(DolomiteBlocks.DOLOMITE_COPPER_ORE.getKey())
                .add(DolomiteBlocks.DOLOMITE_COAL_ORE.getKey())

                .add(EclogiteBlocks.ECLOGITE_GOLD_ORE.getKey())
                .add(EclogiteBlocks.ECLOGITE_REDSTONE_ORE.getKey())
                .add(EclogiteBlocks.ECLOGITE_IRON_ORE.getKey())
                .add(EclogiteBlocks.ECLOGITE_COPPER_ORE.getKey())
                .add(EclogiteBlocks.ECLOGITE_COAL_ORE.getKey())

                .add(GreywackeBlocks.GREYWACKE_GOLD_ORE.getKey())
                .add(GreywackeBlocks.GREYWACKE_REDSTONE_ORE.getKey())
                .add(GreywackeBlocks.GREYWACKE_IRON_ORE.getKey())
                .add(GreywackeBlocks.GREYWACKE_COPPER_ORE.getKey())
                .add(GreywackeBlocks.GREYWACKE_COAL_ORE.getKey())

                .add(KomatiiteBlocks.KOMATIITE_GOLD_ORE.getKey())
                .add(KomatiiteBlocks.KOMATIITE_REDSTONE_ORE.getKey())
                .add(KomatiiteBlocks.KOMATIITE_IRON_ORE.getKey())
                .add(KomatiiteBlocks.KOMATIITE_COPPER_ORE.getKey())
                .add(KomatiiteBlocks.KOMATIITE_COAL_ORE.getKey())

                .add(DaciteBlocks.DACITE_GOLD_ORE.getKey())
                .add(DaciteBlocks.DACITE_REDSTONE_ORE.getKey())
                .add(DaciteBlocks.DACITE_IRON_ORE.getKey())
                .add(DaciteBlocks.DACITE_COPPER_ORE.getKey())
                .add(DaciteBlocks.DACITE_COAL_ORE.getKey())

                .add(BlackGraniteBlocks.BLACK_GRANITE_DIAMOND_ORE.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_LAPIS_ORE.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_GOLD_ORE.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_REDSTONE_ORE.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_IRON_ORE.getKey())

                .add(GabbroBlocks.GABBRO_DIAMOND_ORE.getKey())
                .add(GabbroBlocks.GABBRO_LAPIS_ORE.getKey())
                .add(GabbroBlocks.GABBRO_GOLD_ORE.getKey())
                .add(GabbroBlocks.GABBRO_REDSTONE_ORE.getKey())
                .add(GabbroBlocks.GABBRO_IRON_ORE.getKey())

                .add(GneissBlocks.GNEISS_DIAMOND_ORE.getKey())
                .add(GneissBlocks.GNEISS_LAPIS_ORE.getKey())
                .add(GneissBlocks.GNEISS_GOLD_ORE.getKey())
                .add(GneissBlocks.GNEISS_REDSTONE_ORE.getKey())
                .add(GneissBlocks.GNEISS_IRON_ORE.getKey());

        tag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL);

        tag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL);

        // ------------------------------------------------------------
        // Ore tags
        // ------------------------------------------------------------
        tag(Tags.Blocks.ORES_COAL)
                .add(SoapstoneBlocks.SOAPSTONE_COAL_ORE.getKey())
                .add(RhyoliteBlocks.RHYOLITE_COAL_ORE.getKey())
                .add(SiltstoneBlocks.SILTSTONE_COAL_ORE.getKey())
                .add(LimestoneBlocks.LIMESTONE_COAL_ORE.getKey())
                .add(BlueschistBlocks.BLUESCHIST_COAL_ORE.getKey())
                .add(GreenschistBlocks.GREENSCHIST_COAL_ORE.getKey())
                .add(ChalkBlocks.CHALK_COAL_ORE.getKey())
                .add(ShaleBlocks.SHALE_COAL_ORE.getKey())
                .add(ChertBlocks.CHERT_COAL_ORE.getKey())
                .add(LigniteBlocks.LIGNITE_COAL_ORE.getKey())
                .add(DolomiteBlocks.DOLOMITE_COAL_ORE.getKey())
                .add(EclogiteBlocks.ECLOGITE_COAL_ORE.getKey())
                .add(GreywackeBlocks.GREYWACKE_COAL_ORE.getKey())
                .add(KomatiiteBlocks.KOMATIITE_COAL_ORE.getKey())
                .add(DaciteBlocks.DACITE_COAL_ORE.getKey());

        tag(Tags.Blocks.ORES_COPPER)
                .add(SoapstoneBlocks.SOAPSTONE_COPPER_ORE.getKey())
                .add(RhyoliteBlocks.RHYOLITE_COPPER_ORE.getKey())
                .add(SiltstoneBlocks.SILTSTONE_COPPER_ORE.getKey())
                .add(LimestoneBlocks.LIMESTONE_COPPER_ORE.getKey())
                .add(BlueschistBlocks.BLUESCHIST_COPPER_ORE.getKey())
                .add(GreenschistBlocks.GREENSCHIST_COPPER_ORE.getKey())
                .add(ChalkBlocks.CHALK_COPPER_ORE.getKey())
                .add(ShaleBlocks.SHALE_COPPER_ORE.getKey())
                .add(ChertBlocks.CHERT_COPPER_ORE.getKey())
                .add(LigniteBlocks.LIGNITE_COPPER_ORE.getKey())
                .add(DolomiteBlocks.DOLOMITE_COPPER_ORE.getKey())
                .add(EclogiteBlocks.ECLOGITE_COPPER_ORE.getKey())
                .add(GreywackeBlocks.GREYWACKE_COPPER_ORE.getKey())
                .add(KomatiiteBlocks.KOMATIITE_COPPER_ORE.getKey())
                .add(DaciteBlocks.DACITE_COPPER_ORE.getKey());

        tag(Tags.Blocks.ORES_IRON)
                .add(SoapstoneBlocks.SOAPSTONE_IRON_ORE.getKey())
                .add(RhyoliteBlocks.RHYOLITE_IRON_ORE.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_IRON_ORE.getKey())
                .add(QuartziteBlocks.QUARTZITE_IRON_ORE.getKey())
                .add(MigmatiteBlocks.MIGMATITE_IRON_ORE.getKey())
                .add(MarbleBlocks.MARBLE_IRON_ORE.getKey())
                .add(SiltstoneBlocks.SILTSTONE_IRON_ORE.getKey())
                .add(LimestoneBlocks.LIMESTONE_IRON_ORE.getKey())
                .add(BlueschistBlocks.BLUESCHIST_IRON_ORE.getKey())
                .add(GreenschistBlocks.GREENSCHIST_IRON_ORE.getKey())
                .add(ChalkBlocks.CHALK_IRON_ORE.getKey())
                .add(ShaleBlocks.SHALE_IRON_ORE.getKey())
                .add(ChertBlocks.CHERT_IRON_ORE.getKey())
                .add(LigniteBlocks.LIGNITE_IRON_ORE.getKey())
                .add(DolomiteBlocks.DOLOMITE_IRON_ORE.getKey())
                .add(EclogiteBlocks.ECLOGITE_IRON_ORE.getKey())
                .add(GreywackeBlocks.GREYWACKE_IRON_ORE.getKey())
                .add(KomatiiteBlocks.KOMATIITE_IRON_ORE.getKey())
                .add(DaciteBlocks.DACITE_IRON_ORE.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_IRON_ORE.getKey())
                .add(GabbroBlocks.GABBRO_IRON_ORE.getKey())
                .add(GneissBlocks.GNEISS_IRON_ORE.getKey());

        tag(Tags.Blocks.ORES_GOLD)
                .add(SoapstoneBlocks.SOAPSTONE_GOLD_ORE.getKey())
                .add(RhyoliteBlocks.RHYOLITE_GOLD_ORE.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_GOLD_ORE.getKey())
                .add(QuartziteBlocks.QUARTZITE_GOLD_ORE.getKey())
                .add(MigmatiteBlocks.MIGMATITE_GOLD_ORE.getKey())
                .add(MarbleBlocks.MARBLE_GOLD_ORE.getKey())
                .add(LimestoneBlocks.LIMESTONE_GOLD_ORE.getKey())
                .add(SiltstoneBlocks.SILTSTONE_GOLD_ORE.getKey())
                .add(BlueschistBlocks.BLUESCHIST_GOLD_ORE.getKey())
                .add(GreenschistBlocks.GREENSCHIST_GOLD_ORE.getKey())
                .add(ChalkBlocks.CHALK_GOLD_ORE.getKey())
                .add(ShaleBlocks.SHALE_GOLD_ORE.getKey())
                .add(ChertBlocks.CHERT_GOLD_ORE.getKey())
                .add(LigniteBlocks.LIGNITE_GOLD_ORE.getKey())
                .add(DolomiteBlocks.DOLOMITE_GOLD_ORE.getKey())
                .add(EclogiteBlocks.ECLOGITE_GOLD_ORE.getKey())
                .add(GreywackeBlocks.GREYWACKE_GOLD_ORE.getKey())
                .add(KomatiiteBlocks.KOMATIITE_GOLD_ORE.getKey())
                .add(DaciteBlocks.DACITE_GOLD_ORE.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_GOLD_ORE.getKey())
                .add(GabbroBlocks.GABBRO_GOLD_ORE.getKey())
                .add(GneissBlocks.GNEISS_GOLD_ORE.getKey());

        tag(Tags.Blocks.ORES_DIAMOND)
                .add(RedGraniteBlocks.RED_GRANITE_DIAMOND_ORE.getKey())
                .add(QuartziteBlocks.QUARTZITE_DIAMOND_ORE.getKey())
                .add(MigmatiteBlocks.MIGMATITE_DIAMOND_ORE.getKey())
                .add(MarbleBlocks.MARBLE_DIAMOND_ORE.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_DIAMOND_ORE.getKey())
                .add(GabbroBlocks.GABBRO_DIAMOND_ORE.getKey())
                .add(GneissBlocks.GNEISS_DIAMOND_ORE.getKey());

        tag(Tags.Blocks.ORES_EMERALD)
                .add(RedGraniteBlocks.RED_GRANITE_EMERALD_ORE.getKey())
                .add(QuartziteBlocks.QUARTZITE_EMERALD_ORE.getKey())
                .add(MigmatiteBlocks.MIGMATITE_EMERALD_ORE.getKey())
                .add(MarbleBlocks.MARBLE_EMERALD_ORE.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_EMERALD_ORE.getKey())
                .add(GabbroBlocks.GABBRO_EMERALD_ORE.getKey())
                .add(GneissBlocks.GNEISS_EMERALD_ORE.getKey());

        tag(Tags.Blocks.ORES_LAPIS)
                .add(SoapstoneBlocks.SOAPSTONE_LAPIS_ORE.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_LAPIS_ORE.getKey())
                .add(QuartziteBlocks.QUARTZITE_LAPIS_ORE.getKey())
                .add(MigmatiteBlocks.MIGMATITE_LAPIS_ORE.getKey())
                .add(MarbleBlocks.MARBLE_LAPIS_ORE.getKey())
                .add(SiltstoneBlocks.SILTSTONE_LAPIS_ORE.getKey())
                .add(RhyoliteBlocks.RHYOLITE_LAPIS_ORE.getKey())
                .add(LimestoneBlocks.LIMESTONE_LAPIS_ORE.getKey())
                .add(BlueschistBlocks.BLUESCHIST_LAPIS_ORE.getKey())
                .add(GreenschistBlocks.GREENSCHIST_LAPIS_ORE.getKey())
                .add(ChalkBlocks.CHALK_LAPIS_ORE.getKey())
                .add(ShaleBlocks.SHALE_LAPIS_ORE.getKey())
                .add(ChertBlocks.CHERT_LAPIS_ORE.getKey())
                .add(LigniteBlocks.LIGNITE_LAPIS_ORE.getKey())
                .add(DolomiteBlocks.DOLOMITE_LAPIS_ORE.getKey())
                .add(EclogiteBlocks.ECLOGITE_LAPIS_ORE.getKey())
                .add(GreywackeBlocks.GREYWACKE_LAPIS_ORE.getKey())
                .add(KomatiiteBlocks.KOMATIITE_LAPIS_ORE.getKey())
                .add(DaciteBlocks.DACITE_LAPIS_ORE.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_LAPIS_ORE.getKey())
                .add(GabbroBlocks.GABBRO_LAPIS_ORE.getKey())
                .add(GneissBlocks.GNEISS_LAPIS_ORE.getKey());

        tag(Tags.Blocks.ORES_REDSTONE)
                .add(SoapstoneBlocks.SOAPSTONE_REDSTONE_ORE.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_REDSTONE_ORE.getKey())
                .add(QuartziteBlocks.QUARTZITE_REDSTONE_ORE.getKey())
                .add(MigmatiteBlocks.MIGMATITE_REDSTONE_ORE.getKey())
                .add(MarbleBlocks.MARBLE_REDSTONE_ORE.getKey())
                .add(SiltstoneBlocks.SILTSTONE_REDSTONE_ORE.getKey())
                .add(RhyoliteBlocks.RHYOLITE_REDSTONE_ORE.getKey())
                .add(LimestoneBlocks.LIMESTONE_REDSTONE_ORE.getKey())
                .add(BlueschistBlocks.BLUESCHIST_REDSTONE_ORE.getKey())
                .add(GreenschistBlocks.GREENSCHIST_REDSTONE_ORE.getKey())
                .add(ChalkBlocks.CHALK_REDSTONE_ORE.getKey())
                .add(ShaleBlocks.SHALE_REDSTONE_ORE.getKey())
                .add(ChertBlocks.CHERT_REDSTONE_ORE.getKey())
                .add(LigniteBlocks.LIGNITE_REDSTONE_ORE.getKey())
                .add(DolomiteBlocks.DOLOMITE_REDSTONE_ORE.getKey())
                .add(EclogiteBlocks.ECLOGITE_REDSTONE_ORE.getKey())
                .add(GreywackeBlocks.GREYWACKE_REDSTONE_ORE.getKey())
                .add(KomatiiteBlocks.KOMATIITE_REDSTONE_ORE.getKey())
                .add(DaciteBlocks.DACITE_REDSTONE_ORE.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_REDSTONE_ORE.getKey())
                .add(GabbroBlocks.GABBRO_REDSTONE_ORE.getKey())
                .add(GneissBlocks.GNEISS_REDSTONE_ORE.getKey());

        // ------------------------------------------------------------
        // Generation base stone tag
        // ------------------------------------------------------------
        tag(BlockTags.BASE_STONE_OVERWORLD)
                .add(SoapstoneBlocks.SOAPSTONE_BLOCK.getKey())
                .add(RhyoliteBlocks.RHYOLITE_BLOCK.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_BLOCK.getKey())
                .add(QuartziteBlocks.QUARTZITE_BLOCK.getKey())
                .add(MigmatiteBlocks.MIGMATITE_BLOCK.getKey())
                .add(MarbleBlocks.MARBLE_BLOCK.getKey())
                .add(LimestoneBlocks.LIMESTONE_BLOCK.getKey())
                .add(SiltstoneBlocks.SILTSTONE_BLOCK.getKey())
                .add(BlueschistBlocks.BLUESCHIST_BLOCK.getKey())
                .add(GreenschistBlocks.GREENSCHIST_BLOCK.getKey())
                .add(ChalkBlocks.CHALK_BLOCK.getKey())
                .add(ShaleBlocks.SHALE_BLOCK.getKey())
                .add(ChertBlocks.CHERT_BLOCK.getKey())
                .add(LigniteBlocks.LIGNITE_BLOCK.getKey())
                .add(DolomiteBlocks.DOLOMITE_BLOCK.getKey())
                .add(EclogiteBlocks.ECLOGITE_BLOCK.getKey())
                .add(GreywackeBlocks.GREYWACKE_BLOCK.getKey())
                .add(KomatiiteBlocks.KOMATIITE_BLOCK.getKey())
                .add(DaciteBlocks.DACITE_BLOCK.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_BLOCK.getKey())
                .add(GabbroBlocks.GABBRO_BLOCK.getKey())
                .add(GneissBlocks.GNEISS_BLOCK.getKey());

        // ------------------------------------------------------------
        // Block type tags (stairs, slabs, walls, buttons)
        // ------------------------------------------------------------
        tag(BlockTags.STAIRS)
                .add(SoapstoneBlocks.SOAPSTONE_STAIRS.getKey())
                .add(SoapstoneBlocks.SOAPSTONE_BRICK_STAIRS.getKey())
                .add(SoapstoneBlocks.SOAPSTONE_COBBLE_STAIRS.getKey())

                .add(RhyoliteBlocks.RHYOLITE_STAIRS.getKey())
                .add(RhyoliteBlocks.RHYOLITE_BRICK_STAIRS.getKey())
                .add(RhyoliteBlocks.RHYOLITE_COBBLE_STAIRS.getKey())

                .add(RedGraniteBlocks.RED_GRANITE_STAIRS.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_BRICK_STAIRS.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_COBBLE_STAIRS.getKey())

                .add(QuartziteBlocks.QUARTZITE_STAIRS.getKey())
                .add(QuartziteBlocks.QUARTZITE_BRICK_STAIRS.getKey())
                .add(QuartziteBlocks.QUARTZITE_COBBLE_STAIRS.getKey())

                .add(MigmatiteBlocks.MIGMATITE_STAIRS.getKey())
                .add(MigmatiteBlocks.MIGMATITE_BRICK_STAIRS.getKey())
                .add(MigmatiteBlocks.MIGMATITE_COBBLE_STAIRS.getKey())

                .add(MarbleBlocks.MARBLE_STAIRS.getKey())
                .add(MarbleBlocks.MARBLE_BRICK_STAIRS.getKey())
                .add(MarbleBlocks.MARBLE_COBBLE_STAIRS.getKey())

                .add(LimestoneBlocks.LIMESTONE_STAIRS.getKey())

                .add(SiltstoneBlocks.SILTSTONE_STAIRS.getKey())

                .add(BlueschistBlocks.BLUESCHIST_STAIRS.getKey())
                .add(BlueschistBlocks.BLUESCHIST_BRICK_STAIRS.getKey())
                .add(BlueschistBlocks.BLUESCHIST_COBBLE_STAIRS.getKey())

                .add(GreenschistBlocks.GREENSCHIST_STAIRS.getKey())
                .add(GreenschistBlocks.GREENSCHIST_BRICK_STAIRS.getKey())
                .add(GreenschistBlocks.GREENSCHIST_COBBLE_STAIRS.getKey())

                .add(ChalkBlocks.CHALK_STAIRS.getKey())

                .add(ShaleBlocks.SHALE_STAIRS.getKey())

                .add(ChertBlocks.CHERT_STAIRS.getKey())

                .add(LigniteBlocks.LIGNITE_STAIRS.getKey())

                .add(DolomiteBlocks.DOLOMITE_STAIRS.getKey())

                .add(EclogiteBlocks.ECLOGITE_STAIRS.getKey())

                .add(GreywackeBlocks.GREYWACKE_STAIRS.getKey())

                .add(KomatiiteBlocks.KOMATIITE_STAIRS.getKey())
                .add(KomatiiteBlocks.KOMATIITE_BRICK_STAIRS.getKey())
                .add(KomatiiteBlocks.KOMATIITE_COBBLE_STAIRS.getKey())

                .add(DaciteBlocks.DACITE_STAIRS.getKey())
                .add(DaciteBlocks.DACITE_BRICK_STAIRS.getKey())
                .add(DaciteBlocks.DACITE_COBBLE_STAIRS.getKey())

                .add(BlackGraniteBlocks.BLACK_GRANITE_STAIRS.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_BRICK_STAIRS.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_COBBLE_STAIRS.getKey())

                .add(GabbroBlocks.GABBRO_STAIRS.getKey())
                .add(GabbroBlocks.GABBRO_BRICK_STAIRS.getKey())
                .add(GabbroBlocks.GABBRO_COBBLE_STAIRS.getKey())

                .add(GneissBlocks.GNEISS_STAIRS.getKey())
                .add(GneissBlocks.GNEISS_BRICK_STAIRS.getKey())
                .add(GneissBlocks.GNEISS_COBBLE_STAIRS.getKey());

        tag(BlockTags.SLABS)
                .add(SoapstoneBlocks.SOAPSTONE_BLOCK_SLAB.getKey())
                .add(SoapstoneBlocks.SOAPSTONE_COBBLE_SLAB.getKey())
                .add(SoapstoneBlocks.SOAPSTONE_BRICK_SLAB.getKey())

                .add(RedGraniteBlocks.RED_GRANITE_BLOCK_SLAB.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_COBBLE_SLAB.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_BRICK_SLAB.getKey())

                .add(RhyoliteBlocks.RHYOLITE_BLOCK_SLAB.getKey())
                .add(RhyoliteBlocks.RHYOLITE_COBBLE_SLAB.getKey())
                .add(RhyoliteBlocks.RHYOLITE_BRICK_SLAB.getKey())

                .add(QuartziteBlocks.QUARTZITE_BLOCK_SLAB.getKey())
                .add(QuartziteBlocks.QUARTZITE_COBBLE_SLAB.getKey())
                .add(QuartziteBlocks.QUARTZITE_BRICK_SLAB.getKey())

                .add(MigmatiteBlocks.MIGMATITE_BLOCK_SLAB.getKey())
                .add(MigmatiteBlocks.MIGMATITE_COBBLE_SLAB.getKey())
                .add(MigmatiteBlocks.MIGMATITE_BRICK_SLAB.getKey())

                .add(MarbleBlocks.MARBLE_BLOCK_SLAB.getKey())
                .add(MarbleBlocks.MARBLE_COBBLE_SLAB.getKey())
                .add(MarbleBlocks.MARBLE_BRICK_SLAB.getKey())

                .add(LimestoneBlocks.LIMESTONE_BLOCK_SLAB.getKey())

                .add(SiltstoneBlocks.SILTSTONE_BLOCK_SLAB.getKey())

                .add(BlueschistBlocks.BLUESCHIST_BLOCK_SLAB.getKey())
                .add(BlueschistBlocks.BLUESCHIST_COBBLE_SLAB.getKey())
                .add(BlueschistBlocks.BLUESCHIST_BRICK_SLAB.getKey())

                .add(GreenschistBlocks.GREENSCHIST_BLOCK_SLAB.getKey())
                .add(GreenschistBlocks.GREENSCHIST_COBBLE_SLAB.getKey())
                .add(GreenschistBlocks.GREENSCHIST_BRICK_SLAB.getKey())

                .add(ChalkBlocks.CHALK_BLOCK_SLAB.getKey())

                .add(ShaleBlocks.SHALE_BLOCK_SLAB.getKey())

                .add(ChertBlocks.CHERT_BLOCK_SLAB.getKey())

                .add(LigniteBlocks.LIGNITE_BLOCK_SLAB.getKey())

                .add(DolomiteBlocks.DOLOMITE_BLOCK_SLAB.getKey())

                .add(EclogiteBlocks.ECLOGITE_BLOCK_SLAB.getKey())

                .add(GreywackeBlocks.GREYWACKE_BLOCK_SLAB.getKey())

                .add(KomatiiteBlocks.KOMATIITE_BLOCK_SLAB.getKey())
                .add(KomatiiteBlocks.KOMATIITE_COBBLE_SLAB.getKey())
                .add(KomatiiteBlocks.KOMATIITE_BRICK_SLAB.getKey())

                .add(DaciteBlocks.DACITE_BLOCK_SLAB.getKey())
                .add(DaciteBlocks.DACITE_COBBLE_SLAB.getKey())
                .add(DaciteBlocks.DACITE_BRICK_SLAB.getKey())

                .add(BlackGraniteBlocks.BLACK_GRANITE_BLOCK_SLAB.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_COBBLE_SLAB.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_BRICK_SLAB.getKey())

                .add(GabbroBlocks.GABBRO_BLOCK_SLAB.getKey())
                .add(GabbroBlocks.GABBRO_COBBLE_SLAB.getKey())
                .add(GabbroBlocks.GABBRO_BRICK_SLAB.getKey())

                .add(GneissBlocks.GNEISS_BLOCK_SLAB.getKey())
                .add(GneissBlocks.GNEISS_COBBLE_SLAB.getKey())
                .add(GneissBlocks.GNEISS_BRICK_SLAB.getKey());

        tag(BlockTags.WALLS)
                .add(SoapstoneBlocks.SOAPSTONE_BLOCK_WALL.getKey())
                .add(SoapstoneBlocks.SOAPSTONE_COBBLE_WALL.getKey())
                .add(SoapstoneBlocks.SOAPSTONE_BRICK_WALL.getKey())

                .add(RhyoliteBlocks.RHYOLITE_BLOCK_WALL.getKey())
                .add(RhyoliteBlocks.RHYOLITE_COBBLE_WALL.getKey())
                .add(RhyoliteBlocks.RHYOLITE_BRICK_WALL.getKey())

                .add(RedGraniteBlocks.RED_GRANITE_BLOCK_WALL.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_COBBLE_WALL.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_BRICK_WALL.getKey())

                .add(QuartziteBlocks.QUARTZITE_BLOCK_WALL.getKey())
                .add(QuartziteBlocks.QUARTZITE_COBBLE_WALL.getKey())
                .add(QuartziteBlocks.QUARTZITE_BRICK_WALL.getKey())

                .add(MigmatiteBlocks.MIGMATITE_BLOCK_WALL.getKey())
                .add(MigmatiteBlocks.MIGMATITE_COBBLE_WALL.getKey())
                .add(MigmatiteBlocks.MIGMATITE_BRICK_WALL.getKey())

                .add(MarbleBlocks.MARBLE_BLOCK_WALL.getKey())
                .add(MarbleBlocks.MARBLE_COBBLE_WALL.getKey())
                .add(MarbleBlocks.MARBLE_BRICK_WALL.getKey())

                .add(LimestoneBlocks.LIMESTONE_BLOCK_WALL.getKey())

                .add(SiltstoneBlocks.SILTSTONE_BLOCK_WALL.getKey())

                .add(BlueschistBlocks.BLUESCHIST_BLOCK_WALL.getKey())
                .add(BlueschistBlocks.BLUESCHIST_COBBLE_WALL.getKey())
                .add(BlueschistBlocks.BLUESCHIST_BRICK_WALL.getKey())

                .add(GreenschistBlocks.GREENSCHIST_BLOCK_WALL.getKey())
                .add(GreenschistBlocks.GREENSCHIST_COBBLE_WALL.getKey())
                .add(GreenschistBlocks.GREENSCHIST_BRICK_WALL.getKey())

                .add(ChalkBlocks.CHALK_BLOCK_WALL.getKey())

                .add(ShaleBlocks.SHALE_BLOCK_WALL.getKey())

                .add(ChertBlocks.CHERT_BLOCK_WALL.getKey())

                .add(LigniteBlocks.LIGNITE_BLOCK_WALL.getKey())

                .add(DolomiteBlocks.DOLOMITE_BLOCK_WALL.getKey())

                .add(EclogiteBlocks.ECLOGITE_BLOCK_WALL.getKey())

                .add(GreywackeBlocks.GREYWACKE_BLOCK_WALL.getKey())

                .add(KomatiiteBlocks.KOMATIITE_BLOCK_WALL.getKey())
                .add(KomatiiteBlocks.KOMATIITE_COBBLE_WALL.getKey())
                .add(KomatiiteBlocks.KOMATIITE_BRICK_WALL.getKey())

                .add(DaciteBlocks.DACITE_BLOCK_WALL.getKey())
                .add(DaciteBlocks.DACITE_COBBLE_WALL.getKey())
                .add(DaciteBlocks.DACITE_BRICK_WALL.getKey())

                .add(BlackGraniteBlocks.BLACK_GRANITE_BLOCK_WALL.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_COBBLE_WALL.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_BRICK_WALL.getKey())

                .add(GabbroBlocks.GABBRO_BLOCK_WALL.getKey())
                .add(GabbroBlocks.GABBRO_COBBLE_WALL.getKey())
                .add(GabbroBlocks.GABBRO_BRICK_WALL.getKey())

                .add(GneissBlocks.GNEISS_BLOCK_WALL.getKey())
                .add(GneissBlocks.GNEISS_COBBLE_WALL.getKey())
                .add(GneissBlocks.GNEISS_BRICK_WALL.getKey());

        tag(BlockTags.BUTTONS)
                .add(SoapstoneBlocks.SOAPSTONE_STONE_BUTTON.getKey())
                .add(RhyoliteBlocks.RHYOLITE_STONE_BUTTON.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_STONE_BUTTON.getKey())
                .add(QuartziteBlocks.QUARTZITE_STONE_BUTTON.getKey())
                .add(MigmatiteBlocks.MIGMATITE_STONE_BUTTON.getKey())
                .add(MarbleBlocks.MARBLE_STONE_BUTTON.getKey())
                .add(LimestoneBlocks.LIMESTONE_STONE_BUTTON.getKey())
                .add(SiltstoneBlocks.SILTSTONE_STONE_BUTTON.getKey())
                .add(BlueschistBlocks.BLUESCHIST_STONE_BUTTON.getKey())
                .add(GreenschistBlocks.GREENSCHIST_STONE_BUTTON.getKey())
                .add(ChalkBlocks.CHALK_STONE_BUTTON.getKey())
                .add(ShaleBlocks.SHALE_STONE_BUTTON.getKey())
                .add(ChertBlocks.CHERT_STONE_BUTTON.getKey())
                .add(LigniteBlocks.LIGNITE_STONE_BUTTON.getKey())
                .add(DolomiteBlocks.DOLOMITE_STONE_BUTTON.getKey())
                .add(EclogiteBlocks.ECLOGITE_STONE_BUTTON.getKey())
                .add(GreywackeBlocks.GREYWACKE_STONE_BUTTON.getKey())
                .add(KomatiiteBlocks.KOMATIITE_STONE_BUTTON.getKey())
                .add(DaciteBlocks.DACITE_STONE_BUTTON.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_STONE_BUTTON.getKey())
                .add(GabbroBlocks.GABBRO_STONE_BUTTON.getKey())
                .add(GneissBlocks.GNEISS_STONE_BUTTON.getKey());

        tag(BlockTags.STONE_BUTTONS)
                .add(SoapstoneBlocks.SOAPSTONE_STONE_BUTTON.getKey())
                .add(RhyoliteBlocks.RHYOLITE_STONE_BUTTON.getKey())
                .add(RedGraniteBlocks.RED_GRANITE_STONE_BUTTON.getKey())
                .add(QuartziteBlocks.QUARTZITE_STONE_BUTTON.getKey())
                .add(MigmatiteBlocks.MIGMATITE_STONE_BUTTON.getKey())
                .add(MarbleBlocks.MARBLE_STONE_BUTTON.getKey())
                .add(LimestoneBlocks.LIMESTONE_STONE_BUTTON.getKey())
                .add(SiltstoneBlocks.SILTSTONE_STONE_BUTTON.getKey())
                .add(BlueschistBlocks.BLUESCHIST_STONE_BUTTON.getKey())
                .add(GreenschistBlocks.GREENSCHIST_STONE_BUTTON.getKey())
                .add(ChalkBlocks.CHALK_STONE_BUTTON.getKey())
                .add(ShaleBlocks.SHALE_STONE_BUTTON.getKey())
                .add(ChertBlocks.CHERT_STONE_BUTTON.getKey())
                .add(LigniteBlocks.LIGNITE_STONE_BUTTON.getKey())
                .add(DolomiteBlocks.DOLOMITE_STONE_BUTTON.getKey())
                .add(EclogiteBlocks.ECLOGITE_STONE_BUTTON.getKey())
                .add(GreywackeBlocks.GREYWACKE_STONE_BUTTON.getKey())
                .add(KomatiiteBlocks.KOMATIITE_STONE_BUTTON.getKey())
                .add(DaciteBlocks.DACITE_STONE_BUTTON.getKey())
                .add(BlackGraniteBlocks.BLACK_GRANITE_STONE_BUTTON.getKey())
                .add(GabbroBlocks.GABBRO_STONE_BUTTON.getKey())
                .add(GneissBlocks.GNEISS_STONE_BUTTON.getKey());
    }
}
