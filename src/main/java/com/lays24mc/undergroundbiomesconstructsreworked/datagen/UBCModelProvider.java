package com.lays24mc.undergroundbiomesconstructsreworked.datagen;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.*;
import com.lays24mc.undergroundbiomesconstructsreworked.item.UBCItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.core.Holder;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.stream.Stream;

public class UBCModelProvider extends ModelProvider {
    public UBCModelProvider(PackOutput output) {
        super(output, UndergroundBiomesConstructsReworked.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(UBCItems.LIGNITE_COAL.get(), ModelTemplates.FLAT_ITEM);

        blockModels.family(BlackGraniteBlocks.BLACK_GRANITE_BLOCK.get())
                .slab(BlackGraniteBlocks.BLACK_GRANITE_BLOCK_SLAB.get())
                .stairs(BlackGraniteBlocks.BLACK_GRANITE_STAIRS.get())
                .wall(BlackGraniteBlocks.BLACK_GRANITE_BLOCK_WALL.get())
                .button(BlackGraniteBlocks.BLACK_GRANITE_STONE_BUTTON.get());

        blockModels.family(BlackGraniteBlocks.BLACK_GRANITE_COBBLE_BLOCK.get())
                .slab(BlackGraniteBlocks.BLACK_GRANITE_COBBLE_SLAB.get())
                .stairs(BlackGraniteBlocks.BLACK_GRANITE_COBBLE_STAIRS.get())
                .wall(BlackGraniteBlocks.BLACK_GRANITE_COBBLE_WALL.get());

        blockModels.family(BlackGraniteBlocks.BLACK_GRANITE_BRICK_BLOCK.get())
                .slab(BlackGraniteBlocks.BLACK_GRANITE_BRICK_SLAB.get())
                .stairs(BlackGraniteBlocks.BLACK_GRANITE_BRICK_STAIRS.get())
                .wall(BlackGraniteBlocks.BLACK_GRANITE_BRICK_WALL.get());

        blockModels.createTrivialCube(BlackGraniteBlocks.BLACK_GRANITE_IRON_ORE.get());
        blockModels.createTrivialCube(BlackGraniteBlocks.BLACK_GRANITE_GOLD_ORE.get());
        blockModels.createTrivialCube(BlackGraniteBlocks.BLACK_GRANITE_REDSTONE_ORE.get());
        blockModels.createTrivialCube(BlackGraniteBlocks.BLACK_GRANITE_LAPIS_ORE.get());
        blockModels.createTrivialCube(BlackGraniteBlocks.BLACK_GRANITE_DIAMOND_ORE.get());
        blockModels.createTrivialCube(BlackGraniteBlocks.BLACK_GRANITE_EMERALD_ORE.get());

        blockModels.family(BlueschistBlocks.BLUESCHIST_BLOCK.get())
                .slab(BlueschistBlocks.BLUESCHIST_BLOCK_SLAB.get())
                .stairs(BlueschistBlocks.BLUESCHIST_STAIRS.get())
                .wall(BlueschistBlocks.BLUESCHIST_BLOCK_WALL.get())
                .button(BlueschistBlocks.BLUESCHIST_STONE_BUTTON.get());

        blockModels.family(BlueschistBlocks.BLUESCHIST_COBBLE_BLOCK.get())
                .slab(BlueschistBlocks.BLUESCHIST_COBBLE_SLAB.get())
                .stairs(BlueschistBlocks.BLUESCHIST_COBBLE_STAIRS.get())
                .wall(BlueschistBlocks.BLUESCHIST_COBBLE_WALL.get());

        blockModels.family(BlueschistBlocks.BLUESCHIST_BRICK_BLOCK.get())
                .slab(BlueschistBlocks.BLUESCHIST_BRICK_SLAB.get())
                .stairs(BlueschistBlocks.BLUESCHIST_BRICK_STAIRS.get())
                .wall(BlueschistBlocks.BLUESCHIST_BRICK_WALL.get());

        blockModels.createTrivialCube(BlueschistBlocks.BLUESCHIST_COAL_ORE.get());
        blockModels.createTrivialCube(BlueschistBlocks.BLUESCHIST_COPPER_ORE.get());
        blockModels.createTrivialCube(BlueschistBlocks.BLUESCHIST_IRON_ORE.get());
        blockModels.createTrivialCube(BlueschistBlocks.BLUESCHIST_GOLD_ORE.get());
        blockModels.createTrivialCube(BlueschistBlocks.BLUESCHIST_REDSTONE_ORE.get());
        blockModels.createTrivialCube(BlueschistBlocks.BLUESCHIST_LAPIS_ORE.get());

        blockModels.family(ChalkBlocks.CHALK_BLOCK.get())
                .slab(ChalkBlocks.CHALK_BLOCK_SLAB.get())
                .stairs(ChalkBlocks.CHALK_STAIRS.get())
                .wall(ChalkBlocks.CHALK_BLOCK_WALL.get())
                .button(ChalkBlocks.CHALK_STONE_BUTTON.get());

        blockModels.createTrivialCube(ChalkBlocks.CHALK_COAL_ORE.get());
        blockModels.createTrivialCube(ChalkBlocks.CHALK_COPPER_ORE.get());
        blockModels.createTrivialCube(ChalkBlocks.CHALK_IRON_ORE.get());
        blockModels.createTrivialCube(ChalkBlocks.CHALK_GOLD_ORE.get());
        blockModels.createTrivialCube(ChalkBlocks.CHALK_REDSTONE_ORE.get());
        blockModels.createTrivialCube(ChalkBlocks.CHALK_LAPIS_ORE.get());

        blockModels.family(ChertBlocks.CHERT_BLOCK.get())
                .slab(ChertBlocks.CHERT_BLOCK_SLAB.get())
                .stairs(ChertBlocks.CHERT_STAIRS.get())
                .wall(ChertBlocks.CHERT_BLOCK_WALL.get())
                .button(ChertBlocks.CHERT_STONE_BUTTON.get());

        blockModels.createTrivialCube(ChertBlocks.CHERT_COAL_ORE.get());
        blockModels.createTrivialCube(ChertBlocks.CHERT_COPPER_ORE.get());
        blockModels.createTrivialCube(ChertBlocks.CHERT_IRON_ORE.get());
        blockModels.createTrivialCube(ChertBlocks.CHERT_GOLD_ORE.get());
        blockModels.createTrivialCube(ChertBlocks.CHERT_REDSTONE_ORE.get());
        blockModels.createTrivialCube(ChertBlocks.CHERT_LAPIS_ORE.get());

        blockModels.family(DaciteBlocks.DACITE_BLOCK.get())
                .slab(DaciteBlocks.DACITE_BLOCK_SLAB.get())
                .stairs(DaciteBlocks.DACITE_STAIRS.get())
                .wall(DaciteBlocks.DACITE_BLOCK_WALL.get())
                .button(DaciteBlocks.DACITE_STONE_BUTTON.get());

        blockModels.family(DaciteBlocks.DACITE_COBBLE_BLOCK.get())
                .slab(DaciteBlocks.DACITE_COBBLE_SLAB.get())
                .stairs(DaciteBlocks.DACITE_COBBLE_STAIRS.get())
                .wall(DaciteBlocks.DACITE_COBBLE_WALL.get());

        blockModels.family(DaciteBlocks.DACITE_BRICK_BLOCK.get())
                .slab(DaciteBlocks.DACITE_BRICK_SLAB.get())
                .stairs(DaciteBlocks.DACITE_BRICK_STAIRS.get())
                .wall(DaciteBlocks.DACITE_BRICK_WALL.get());

        blockModels.createTrivialCube(DaciteBlocks.DACITE_COAL_ORE.get());
        blockModels.createTrivialCube(DaciteBlocks.DACITE_COPPER_ORE.get());
        blockModels.createTrivialCube(DaciteBlocks.DACITE_IRON_ORE.get());
        blockModels.createTrivialCube(DaciteBlocks.DACITE_GOLD_ORE.get());
        blockModels.createTrivialCube(DaciteBlocks.DACITE_REDSTONE_ORE.get());
        blockModels.createTrivialCube(DaciteBlocks.DACITE_LAPIS_ORE.get());

        blockModels.family(DolomiteBlocks.DOLOMITE_BLOCK.get())
                .slab(DolomiteBlocks.DOLOMITE_BLOCK_SLAB.get())
                .stairs(DolomiteBlocks.DOLOMITE_STAIRS.get())
                .wall(DolomiteBlocks.DOLOMITE_BLOCK_WALL.get())
                .button(DolomiteBlocks.DOLOMITE_STONE_BUTTON.get());

        blockModels.createTrivialCube(DolomiteBlocks.DOLOMITE_COAL_ORE.get());
        blockModels.createTrivialCube(DolomiteBlocks.DOLOMITE_COPPER_ORE.get());
        blockModels.createTrivialCube(DolomiteBlocks.DOLOMITE_IRON_ORE.get());
        blockModels.createTrivialCube(DolomiteBlocks.DOLOMITE_GOLD_ORE.get());
        blockModels.createTrivialCube(DolomiteBlocks.DOLOMITE_REDSTONE_ORE.get());
        blockModels.createTrivialCube(DolomiteBlocks.DOLOMITE_LAPIS_ORE.get());

        blockModels.family(EclogiteBlocks.ECLOGITE_BLOCK.get())
                .slab(EclogiteBlocks.ECLOGITE_BLOCK_SLAB.get())
                .stairs(EclogiteBlocks.ECLOGITE_STAIRS.get())
                .wall(EclogiteBlocks.ECLOGITE_BLOCK_WALL.get())
                .button(EclogiteBlocks.ECLOGITE_STONE_BUTTON.get());

        blockModels.createTrivialCube(EclogiteBlocks.ECLOGITE_COAL_ORE.get());
        blockModels.createTrivialCube(EclogiteBlocks.ECLOGITE_COPPER_ORE.get());
        blockModels.createTrivialCube(EclogiteBlocks.ECLOGITE_IRON_ORE.get());
        blockModels.createTrivialCube(EclogiteBlocks.ECLOGITE_GOLD_ORE.get());
        blockModels.createTrivialCube(EclogiteBlocks.ECLOGITE_REDSTONE_ORE.get());
        blockModels.createTrivialCube(EclogiteBlocks.ECLOGITE_LAPIS_ORE.get());

        blockModels.family(GabbroBlocks.GABBRO_BLOCK.get())
                .slab(GabbroBlocks.GABBRO_BLOCK_SLAB.get())
                .stairs(GabbroBlocks.GABBRO_STAIRS.get())
                .wall(GabbroBlocks.GABBRO_BLOCK_WALL.get())
                .button(GabbroBlocks.GABBRO_STONE_BUTTON.get());

        blockModels.family(GabbroBlocks.GABBRO_COBBLE_BLOCK.get())
                .slab(GabbroBlocks.GABBRO_COBBLE_SLAB.get())
                .stairs(GabbroBlocks.GABBRO_COBBLE_STAIRS.get())
                .wall(GabbroBlocks.GABBRO_COBBLE_WALL.get());

        blockModels.family(GabbroBlocks.GABBRO_BRICK_BLOCK.get())
                .slab(GabbroBlocks.GABBRO_BRICK_SLAB.get())
                .stairs(GabbroBlocks.GABBRO_BRICK_STAIRS.get())
                .wall(GabbroBlocks.GABBRO_BRICK_WALL.get());

        blockModels.createTrivialCube(GabbroBlocks.GABBRO_IRON_ORE.get());
        blockModels.createTrivialCube(GabbroBlocks.GABBRO_GOLD_ORE.get());
        blockModels.createTrivialCube(GabbroBlocks.GABBRO_REDSTONE_ORE.get());
        blockModels.createTrivialCube(GabbroBlocks.GABBRO_LAPIS_ORE.get());
        blockModels.createTrivialCube(GabbroBlocks.GABBRO_DIAMOND_ORE.get());
        blockModels.createTrivialCube(GabbroBlocks.GABBRO_EMERALD_ORE.get());

        blockModels.family(GneissBlocks.GNEISS_BLOCK.get())
                .slab(GneissBlocks.GNEISS_BLOCK_SLAB.get())
                .stairs(GneissBlocks.GNEISS_STAIRS.get())
                .wall(GneissBlocks.GNEISS_BLOCK_WALL.get())
                .button(GneissBlocks.GNEISS_STONE_BUTTON.get());

        blockModels.family(GneissBlocks.GNEISS_COBBLE_BLOCK.get())
                .slab(GneissBlocks.GNEISS_COBBLE_SLAB.get())
                .stairs(GneissBlocks.GNEISS_COBBLE_STAIRS.get())
                .wall(GneissBlocks.GNEISS_COBBLE_WALL.get());

        blockModels.family(GneissBlocks.GNEISS_BRICK_BLOCK.get())
                .slab(GneissBlocks.GNEISS_BRICK_SLAB.get())
                .stairs(GneissBlocks.GNEISS_BRICK_STAIRS.get())
                .wall(GneissBlocks.GNEISS_BRICK_WALL.get());

        blockModels.createTrivialCube(GneissBlocks.GNEISS_IRON_ORE.get());
        blockModels.createTrivialCube(GneissBlocks.GNEISS_GOLD_ORE.get());
        blockModels.createTrivialCube(GneissBlocks.GNEISS_REDSTONE_ORE.get());
        blockModels.createTrivialCube(GneissBlocks.GNEISS_LAPIS_ORE.get());
        blockModels.createTrivialCube(GneissBlocks.GNEISS_EMERALD_ORE.get());
        blockModels.createTrivialCube(GneissBlocks.GNEISS_DIAMOND_ORE.get());

        blockModels.family(GreenschistBlocks.GREENSCHIST_BLOCK.get())
                .slab(GreenschistBlocks.GREENSCHIST_BLOCK_SLAB.get())
                .stairs(GreenschistBlocks.GREENSCHIST_STAIRS.get())
                .wall(GreenschistBlocks.GREENSCHIST_BLOCK_WALL.get())
                .button(GreenschistBlocks.GREENSCHIST_STONE_BUTTON.get());

        blockModels.family(GreenschistBlocks.GREENSCHIST_COBBLE_BLOCK.get())
                .slab(GreenschistBlocks.GREENSCHIST_COBBLE_SLAB.get())
                .stairs(GreenschistBlocks.GREENSCHIST_COBBLE_STAIRS.get())
                .wall(GreenschistBlocks.GREENSCHIST_COBBLE_WALL.get());

        blockModels.family(GreenschistBlocks.GREENSCHIST_BRICK_BLOCK.get())
                .slab(GreenschistBlocks.GREENSCHIST_BRICK_SLAB.get())
                .stairs(GreenschistBlocks.GREENSCHIST_BRICK_STAIRS.get())
                .wall(GreenschistBlocks.GREENSCHIST_BRICK_WALL.get());

        blockModels.createTrivialCube(GreenschistBlocks.GREENSCHIST_COAL_ORE.get());
        blockModels.createTrivialCube(GreenschistBlocks.GREENSCHIST_COPPER_ORE.get());
        blockModels.createTrivialCube(GreenschistBlocks.GREENSCHIST_IRON_ORE.get());
        blockModels.createTrivialCube(GreenschistBlocks.GREENSCHIST_GOLD_ORE.get());
        blockModels.createTrivialCube(GreenschistBlocks.GREENSCHIST_REDSTONE_ORE.get());
        blockModels.createTrivialCube(GreenschistBlocks.GREENSCHIST_LAPIS_ORE.get());

        blockModels.family(GreywackeBlocks.GREYWACKE_BLOCK.get())
                .slab(GreywackeBlocks.GREYWACKE_BLOCK_SLAB.get())
                .stairs(GreywackeBlocks.GREYWACKE_STAIRS.get())
                .wall(GreywackeBlocks.GREYWACKE_BLOCK_WALL.get())
                .button(GreywackeBlocks.GREYWACKE_STONE_BUTTON.get());

        blockModels.createTrivialCube(GreywackeBlocks.GREYWACKE_COAL_ORE.get());
        blockModels.createTrivialCube(GreywackeBlocks.GREYWACKE_COPPER_ORE.get());
        blockModels.createTrivialCube(GreywackeBlocks.GREYWACKE_IRON_ORE.get());
        blockModels.createTrivialCube(GreywackeBlocks.GREYWACKE_GOLD_ORE.get());
        blockModels.createTrivialCube(GreywackeBlocks.GREYWACKE_REDSTONE_ORE.get());
        blockModels.createTrivialCube(GreywackeBlocks.GREYWACKE_LAPIS_ORE.get());

        blockModels.family(KomatiiteBlocks.KOMATIITE_BLOCK.get())
                .slab(KomatiiteBlocks.KOMATIITE_BLOCK_SLAB.get())
                .stairs(KomatiiteBlocks.KOMATIITE_STAIRS.get())
                .wall(KomatiiteBlocks.KOMATIITE_BLOCK_WALL.get())
                .button(KomatiiteBlocks.KOMATIITE_STONE_BUTTON.get());

        blockModels.family(KomatiiteBlocks.KOMATIITE_COBBLE_BLOCK.get())
                .slab(KomatiiteBlocks.KOMATIITE_COBBLE_SLAB.get())
                .stairs(KomatiiteBlocks.KOMATIITE_COBBLE_STAIRS.get())
                .wall(KomatiiteBlocks.KOMATIITE_COBBLE_WALL.get());

        blockModels.family(KomatiiteBlocks.KOMATIITE_BRICK_BLOCK.get())
                .slab(KomatiiteBlocks.KOMATIITE_BRICK_SLAB.get())
                .stairs(KomatiiteBlocks.KOMATIITE_BRICK_STAIRS.get())
                .wall(KomatiiteBlocks.KOMATIITE_BRICK_WALL.get());

        blockModels.createTrivialCube(KomatiiteBlocks.KOMATIITE_COAL_ORE.get());
        blockModels.createTrivialCube(KomatiiteBlocks.KOMATIITE_COPPER_ORE.get());
        blockModels.createTrivialCube(KomatiiteBlocks.KOMATIITE_IRON_ORE.get());
        blockModels.createTrivialCube(KomatiiteBlocks.KOMATIITE_GOLD_ORE.get());
        blockModels.createTrivialCube(KomatiiteBlocks.KOMATIITE_REDSTONE_ORE.get());
        blockModels.createTrivialCube(KomatiiteBlocks.KOMATIITE_LAPIS_ORE.get());

        blockModels.family(LigniteBlocks.LIGNITE_BLOCK.get())
                .slab(LigniteBlocks.LIGNITE_BLOCK_SLAB.get())
                .stairs(LigniteBlocks.LIGNITE_STAIRS.get())
                .wall(LigniteBlocks.LIGNITE_BLOCK_WALL.get())
                .button(LigniteBlocks.LIGNITE_STONE_BUTTON.get());

        blockModels.createTrivialCube(LigniteBlocks.LIGNITE_COAL_ORE.get());
        blockModels.createTrivialCube(LigniteBlocks.LIGNITE_COPPER_ORE.get());
        blockModels.createTrivialCube(LigniteBlocks.LIGNITE_IRON_ORE.get());
        blockModels.createTrivialCube(LigniteBlocks.LIGNITE_GOLD_ORE.get());
        blockModels.createTrivialCube(LigniteBlocks.LIGNITE_REDSTONE_ORE.get());
        blockModels.createTrivialCube(LigniteBlocks.LIGNITE_LAPIS_ORE.get());

        blockModels.family(LimestoneBlocks.LIMESTONE_BLOCK.get())
                .slab(LimestoneBlocks.LIMESTONE_BLOCK_SLAB.get())
                .stairs(LimestoneBlocks.LIMESTONE_STAIRS.get())
                .wall(LimestoneBlocks.LIMESTONE_BLOCK_WALL.get())
                .button(LimestoneBlocks.LIMESTONE_STONE_BUTTON.get());

        blockModels.createTrivialCube(LimestoneBlocks.LIMESTONE_COAL_ORE.get());
        blockModels.createTrivialCube(LimestoneBlocks.LIMESTONE_COPPER_ORE.get());
        blockModels.createTrivialCube(LimestoneBlocks.LIMESTONE_IRON_ORE.get());
        blockModels.createTrivialCube(LimestoneBlocks.LIMESTONE_GOLD_ORE.get());
        blockModels.createTrivialCube(LimestoneBlocks.LIMESTONE_REDSTONE_ORE.get());
        blockModels.createTrivialCube(LimestoneBlocks.LIMESTONE_LAPIS_ORE.get());

        blockModels.family(MarbleBlocks.MARBLE_BLOCK.get())
                .slab(MarbleBlocks.MARBLE_BLOCK_SLAB.get())
                .stairs(MarbleBlocks.MARBLE_STAIRS.get())
                .wall(MarbleBlocks.MARBLE_BLOCK_WALL.get())
                .button(MarbleBlocks.MARBLE_STONE_BUTTON.get());

        blockModels.family(MarbleBlocks.MARBLE_COBBLE_BLOCK.get())
                .slab(MarbleBlocks.MARBLE_COBBLE_SLAB.get())
                .stairs(MarbleBlocks.MARBLE_COBBLE_STAIRS.get())
                .wall(MarbleBlocks.MARBLE_COBBLE_WALL.get());

        blockModels.family(MarbleBlocks.MARBLE_BRICK_BLOCK.get())
                .slab(MarbleBlocks.MARBLE_BRICK_SLAB.get())
                .stairs(MarbleBlocks.MARBLE_BRICK_STAIRS.get())
                .wall(MarbleBlocks.MARBLE_BRICK_WALL.get());

        blockModels.createTrivialCube(MarbleBlocks.MARBLE_IRON_ORE.get());
        blockModels.createTrivialCube(MarbleBlocks.MARBLE_GOLD_ORE.get());
        blockModels.createTrivialCube(MarbleBlocks.MARBLE_REDSTONE_ORE.get());
        blockModels.createTrivialCube(MarbleBlocks.MARBLE_LAPIS_ORE.get());
        blockModels.createTrivialCube(MarbleBlocks.MARBLE_DIAMOND_ORE.get());
        blockModels.createTrivialCube(MarbleBlocks.MARBLE_EMERALD_ORE.get());

        blockModels.family(MigmatiteBlocks.MIGMATITE_BLOCK.get())
                .slab(MigmatiteBlocks.MIGMATITE_BLOCK_SLAB.get())
                .stairs(MigmatiteBlocks.MIGMATITE_STAIRS.get())
                .wall(MigmatiteBlocks.MIGMATITE_BLOCK_WALL.get())
                .button(MigmatiteBlocks.MIGMATITE_STONE_BUTTON.get());

        blockModels.family(MigmatiteBlocks.MIGMATITE_COBBLE_BLOCK.get())
                .slab(MigmatiteBlocks.MIGMATITE_COBBLE_SLAB.get())
                .stairs(MigmatiteBlocks.MIGMATITE_COBBLE_STAIRS.get())
                .wall(MigmatiteBlocks.MIGMATITE_COBBLE_WALL.get());

        blockModels.family(MigmatiteBlocks.MIGMATITE_BRICK_BLOCK.get())
                .slab(MigmatiteBlocks.MIGMATITE_BRICK_SLAB.get())
                .stairs(MigmatiteBlocks.MIGMATITE_BRICK_STAIRS.get())
                .wall(MigmatiteBlocks.MIGMATITE_BRICK_WALL.get());

        blockModels.createTrivialCube(MigmatiteBlocks.MIGMATITE_IRON_ORE.get());
        blockModels.createTrivialCube(MigmatiteBlocks.MIGMATITE_GOLD_ORE.get());
        blockModels.createTrivialCube(MigmatiteBlocks.MIGMATITE_REDSTONE_ORE.get());
        blockModels.createTrivialCube(MigmatiteBlocks.MIGMATITE_LAPIS_ORE.get());
        blockModels.createTrivialCube(MigmatiteBlocks.MIGMATITE_DIAMOND_ORE.get());
        blockModels.createTrivialCube(MigmatiteBlocks.MIGMATITE_EMERALD_ORE.get());

        blockModels.family(QuartziteBlocks.QUARTZITE_BLOCK.get())
                .slab(QuartziteBlocks.QUARTZITE_BLOCK_SLAB.get())
                .stairs(QuartziteBlocks.QUARTZITE_STAIRS.get())
                .wall(QuartziteBlocks.QUARTZITE_BLOCK_WALL.get())
                .button(QuartziteBlocks.QUARTZITE_STONE_BUTTON.get());

        blockModels.family(QuartziteBlocks.QUARTZITE_COBBLE_BLOCK.get())
                .slab(QuartziteBlocks.QUARTZITE_COBBLE_SLAB.get())
                .stairs(QuartziteBlocks.QUARTZITE_COBBLE_STAIRS.get())
                .wall(QuartziteBlocks.QUARTZITE_COBBLE_WALL.get());

        blockModels.family(QuartziteBlocks.QUARTZITE_BRICK_BLOCK.get())
                .slab(QuartziteBlocks.QUARTZITE_BRICK_SLAB.get())
                .stairs(QuartziteBlocks.QUARTZITE_BRICK_STAIRS.get())
                .wall(QuartziteBlocks.QUARTZITE_BRICK_WALL.get());

        blockModels.createTrivialCube(QuartziteBlocks.QUARTZITE_IRON_ORE.get());
        blockModels.createTrivialCube(QuartziteBlocks.QUARTZITE_GOLD_ORE.get());
        blockModels.createTrivialCube(QuartziteBlocks.QUARTZITE_REDSTONE_ORE.get());
        blockModels.createTrivialCube(QuartziteBlocks.QUARTZITE_LAPIS_ORE.get());
        blockModels.createTrivialCube(QuartziteBlocks.QUARTZITE_DIAMOND_ORE.get());
        blockModels.createTrivialCube(QuartziteBlocks.QUARTZITE_EMERALD_ORE.get());

        blockModels.family(RedGraniteBlocks.RED_GRANITE_BLOCK.get())
                .slab(RedGraniteBlocks.RED_GRANITE_BLOCK_SLAB.get())
                .stairs(RedGraniteBlocks.RED_GRANITE_STAIRS.get())
                .wall(RedGraniteBlocks.RED_GRANITE_BLOCK_WALL.get())
                .button(RedGraniteBlocks.RED_GRANITE_STONE_BUTTON.get());

        blockModels.family(RedGraniteBlocks.RED_GRANITE_COBBLE_BLOCK.get())
                .slab(RedGraniteBlocks.RED_GRANITE_COBBLE_SLAB.get())
                .stairs(RedGraniteBlocks.RED_GRANITE_COBBLE_STAIRS.get())
                .wall(RedGraniteBlocks.RED_GRANITE_COBBLE_WALL.get());

        blockModels.family(RedGraniteBlocks.RED_GRANITE_BRICK_BLOCK.get())
                .slab(RedGraniteBlocks.RED_GRANITE_BRICK_SLAB.get())
                .stairs(RedGraniteBlocks.RED_GRANITE_BRICK_STAIRS.get())
                .wall(RedGraniteBlocks.RED_GRANITE_BRICK_WALL.get());

        blockModels.createTrivialCube(RedGraniteBlocks.RED_GRANITE_IRON_ORE.get());
        blockModels.createTrivialCube(RedGraniteBlocks.RED_GRANITE_GOLD_ORE.get());
        blockModels.createTrivialCube(RedGraniteBlocks.RED_GRANITE_REDSTONE_ORE.get());
        blockModels.createTrivialCube(RedGraniteBlocks.RED_GRANITE_LAPIS_ORE.get());
        blockModels.createTrivialCube(RedGraniteBlocks.RED_GRANITE_DIAMOND_ORE.get());
        blockModels.createTrivialCube(RedGraniteBlocks.RED_GRANITE_EMERALD_ORE.get());

        blockModels.family(RhyoliteBlocks.RHYOLITE_BLOCK.get())
                .slab(RhyoliteBlocks.RHYOLITE_BLOCK_SLAB.get())
                .stairs(RhyoliteBlocks.RHYOLITE_STAIRS.get())
                .wall(RhyoliteBlocks.RHYOLITE_BLOCK_WALL.get())
                .button(RhyoliteBlocks.RHYOLITE_STONE_BUTTON.get());

        blockModels.family(RhyoliteBlocks.RHYOLITE_COBBLE_BLOCK.get())
                .slab(RhyoliteBlocks.RHYOLITE_COBBLE_SLAB.get())
                .stairs(RhyoliteBlocks.RHYOLITE_COBBLE_STAIRS.get())
                .wall(RhyoliteBlocks.RHYOLITE_COBBLE_WALL.get());

        blockModels.family(RhyoliteBlocks.RHYOLITE_BRICK_BLOCK.get())
                .slab(RhyoliteBlocks.RHYOLITE_BRICK_SLAB.get())
                .stairs(RhyoliteBlocks.RHYOLITE_BRICK_STAIRS.get())
                .wall(RhyoliteBlocks.RHYOLITE_BRICK_WALL.get());

        blockModels.createTrivialCube(RhyoliteBlocks.RHYOLITE_COAL_ORE.get());
        blockModels.createTrivialCube(RhyoliteBlocks.RHYOLITE_COPPER_ORE.get());
        blockModels.createTrivialCube(RhyoliteBlocks.RHYOLITE_IRON_ORE.get());
        blockModels.createTrivialCube(RhyoliteBlocks.RHYOLITE_GOLD_ORE.get());
        blockModels.createTrivialCube(RhyoliteBlocks.RHYOLITE_REDSTONE_ORE.get());
        blockModels.createTrivialCube(RhyoliteBlocks.RHYOLITE_LAPIS_ORE.get());

        blockModels.family(ShaleBlocks.SHALE_BLOCK.get())
                .slab(ShaleBlocks.SHALE_BLOCK_SLAB.get())
                .stairs(ShaleBlocks.SHALE_STAIRS.get())
                .wall(ShaleBlocks.SHALE_BLOCK_WALL.get())
                .button(ShaleBlocks.SHALE_STONE_BUTTON.get());

        blockModels.createTrivialCube(ShaleBlocks.SHALE_COAL_ORE.get());
        blockModels.createTrivialCube(ShaleBlocks.SHALE_COPPER_ORE.get());
        blockModels.createTrivialCube(ShaleBlocks.SHALE_IRON_ORE.get());
        blockModels.createTrivialCube(ShaleBlocks.SHALE_GOLD_ORE.get());
        blockModels.createTrivialCube(ShaleBlocks.SHALE_REDSTONE_ORE.get());
        blockModels.createTrivialCube(ShaleBlocks.SHALE_LAPIS_ORE.get());

        blockModels.family(SiltstoneBlocks.SILTSTONE_BLOCK.get())
                .slab(SiltstoneBlocks.SILTSTONE_BLOCK_SLAB.get())
                .stairs(SiltstoneBlocks.SILTSTONE_STAIRS.get())
                .wall(SiltstoneBlocks.SILTSTONE_BLOCK_WALL.get())
                .button(SiltstoneBlocks.SILTSTONE_STONE_BUTTON.get());

        blockModels.createTrivialCube(SiltstoneBlocks.SILTSTONE_COAL_ORE.get());
        blockModels.createTrivialCube(SiltstoneBlocks.SILTSTONE_COPPER_ORE.get());
        blockModels.createTrivialCube(SiltstoneBlocks.SILTSTONE_IRON_ORE.get());
        blockModels.createTrivialCube(SiltstoneBlocks.SILTSTONE_GOLD_ORE.get());
        blockModels.createTrivialCube(SiltstoneBlocks.SILTSTONE_REDSTONE_ORE.get());
        blockModels.createTrivialCube(SiltstoneBlocks.SILTSTONE_LAPIS_ORE.get());

        blockModels.family(SoapstoneBlocks.SOAPSTONE_BLOCK.get())
                .slab(SoapstoneBlocks.SOAPSTONE_BLOCK_SLAB.get())
                .stairs(SoapstoneBlocks.SOAPSTONE_STAIRS.get())
                .wall(SoapstoneBlocks.SOAPSTONE_BLOCK_WALL.get())
                .button(SoapstoneBlocks.SOAPSTONE_STONE_BUTTON.get());

        blockModels.family(SoapstoneBlocks.SOAPSTONE_COBBLE_BLOCK.get())
                .slab(SoapstoneBlocks.SOAPSTONE_COBBLE_SLAB.get())
                .stairs(SoapstoneBlocks.SOAPSTONE_COBBLE_STAIRS.get())
                .wall(SoapstoneBlocks.SOAPSTONE_COBBLE_WALL.get());

        blockModels.family(SoapstoneBlocks.SOAPSTONE_BRICK_BLOCK.get())
                .slab(SoapstoneBlocks.SOAPSTONE_BRICK_SLAB.get())
                .stairs(SoapstoneBlocks.SOAPSTONE_BRICK_STAIRS.get())
                .wall(SoapstoneBlocks.SOAPSTONE_BRICK_WALL.get());

        blockModels.createTrivialCube(SoapstoneBlocks.SOAPSTONE_COAL_ORE.get());
        blockModels.createTrivialCube(SoapstoneBlocks.SOAPSTONE_COPPER_ORE.get());
        blockModels.createTrivialCube(SoapstoneBlocks.SOAPSTONE_IRON_ORE.get());
        blockModels.createTrivialCube(SoapstoneBlocks.SOAPSTONE_GOLD_ORE.get());
        blockModels.createTrivialCube(SoapstoneBlocks.SOAPSTONE_REDSTONE_ORE.get());
        blockModels.createTrivialCube(SoapstoneBlocks.SOAPSTONE_LAPIS_ORE.get());
    }

    //    @Override
//    protected void registerModels() {
//        basicItem(UBCItems.LIGNITE_COAL.get());
//    }

    @Override
    protected Stream<? extends Holder<Block>> getKnownBlocks() {
        return super.getKnownBlocks();
    }

    @Override
    protected Stream<? extends Holder<Item>> getKnownItems() {
        return super.getKnownItems();
    }
}
