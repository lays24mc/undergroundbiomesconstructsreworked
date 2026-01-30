package com.lays24mc.undergroundbiomesconstructsreworked.datagen;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.*;
import com.lays24mc.undergroundbiomesconstructsreworked.block.custom.UBCButtonsBlocks;
import com.lays24mc.undergroundbiomesconstructsreworked.block.custom.UBCSlabBlocks;
import com.lays24mc.undergroundbiomesconstructsreworked.block.custom.UBCStairsBlocks;
import com.lays24mc.undergroundbiomesconstructsreworked.block.custom.UBCWallBlocks;
import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

/**
 * BlockState and model provider for UndergroundBiomesConstructsReworked mod.
 * Handles generating block models, item models, and blockstates blocks.
 */
public class UBCBlockStateProvider extends BlockStateProvider {

    public UBCBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, UndergroundBiomesConstructsReworked.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        buildAllModels();

    }

    // ------------------------------------------------------------
    // BLOCK MODELS
    // ------------------------------------------------------------
    private void buildAllModels() {

        // --------------------------
        // Register blocks single
        // --------------------------
        blockWithItem(SoapstoneBlocks.SOAPSTONE_BLOCK);
        blockWithItem(SoapstoneBlocks.SOAPSTONE_COBBLE_BLOCK);
        blockWithItem(SoapstoneBlocks.SOAPSTONE_BRICK_BLOCK);
        blockWithItem(SoapstoneBlocks.SOAPSTONE_COAL_ORE);
        blockWithItem(SoapstoneBlocks.SOAPSTONE_COPPER_ORE);
        blockWithItem(SoapstoneBlocks.SOAPSTONE_IRON_ORE);
        blockWithItem(SoapstoneBlocks.SOAPSTONE_GOLD_ORE);
        blockWithItem(SoapstoneBlocks.SOAPSTONE_REDSTONE_ORE);
        blockWithItem(SoapstoneBlocks.SOAPSTONE_LAPIS_ORE);

        blockWithItem(RhyoliteBlocks.RHYOLITE_BLOCK);
        blockWithItem(RhyoliteBlocks.RHYOLITE_COBBLE_BLOCK);
        blockWithItem(RhyoliteBlocks.RHYOLITE_BRICK_BLOCK);
        blockWithItem(RhyoliteBlocks.RHYOLITE_COAL_ORE);
        blockWithItem(RhyoliteBlocks.RHYOLITE_COPPER_ORE);
        blockWithItem(RhyoliteBlocks.RHYOLITE_IRON_ORE);
        blockWithItem(RhyoliteBlocks.RHYOLITE_GOLD_ORE);
        blockWithItem(RhyoliteBlocks.RHYOLITE_REDSTONE_ORE);
        blockWithItem(RhyoliteBlocks.RHYOLITE_LAPIS_ORE);

        blockWithItem(RedGraniteBlocks.RED_GRANITE_BLOCK);
        blockWithItem(RedGraniteBlocks.RED_GRANITE_COBBLE_BLOCK);
        blockWithItem(RedGraniteBlocks.RED_GRANITE_BRICK_BLOCK);
        blockWithItem(RedGraniteBlocks.RED_GRANITE_IRON_ORE);
        blockWithItem(RedGraniteBlocks.RED_GRANITE_GOLD_ORE);
        blockWithItem(RedGraniteBlocks.RED_GRANITE_REDSTONE_ORE);
        blockWithItem(RedGraniteBlocks.RED_GRANITE_LAPIS_ORE);
        blockWithItem(RedGraniteBlocks.RED_GRANITE_DIAMOND_ORE);
        blockWithItem(RedGraniteBlocks.RED_GRANITE_EMERALD_ORE);

        blockWithItem(QuartziteBlocks.QUARTZITE_BLOCK);
        blockWithItem(QuartziteBlocks.QUARTZITE_COBBLE_BLOCK);
        blockWithItem(QuartziteBlocks.QUARTZITE_BRICK_BLOCK);
        blockWithItem(QuartziteBlocks.QUARTZITE_IRON_ORE);
        blockWithItem(QuartziteBlocks.QUARTZITE_GOLD_ORE);
        blockWithItem(QuartziteBlocks.QUARTZITE_REDSTONE_ORE);
        blockWithItem(QuartziteBlocks.QUARTZITE_LAPIS_ORE);
        blockWithItem(QuartziteBlocks.QUARTZITE_DIAMOND_ORE);
        blockWithItem(QuartziteBlocks.QUARTZITE_EMERALD_ORE);

        blockWithItem(MigmatiteBlocks.MIGMATITE_BLOCK);
        blockWithItem(MigmatiteBlocks.MIGMATITE_COBBLE_BLOCK);
        blockWithItem(MigmatiteBlocks.MIGMATITE_BRICK_BLOCK);
        blockWithItem(MigmatiteBlocks.MIGMATITE_IRON_ORE);
        blockWithItem(MigmatiteBlocks.MIGMATITE_GOLD_ORE);
        blockWithItem(MigmatiteBlocks.MIGMATITE_REDSTONE_ORE);
        blockWithItem(MigmatiteBlocks.MIGMATITE_LAPIS_ORE);
        blockWithItem(MigmatiteBlocks.MIGMATITE_DIAMOND_ORE);
        blockWithItem(MigmatiteBlocks.MIGMATITE_EMERALD_ORE);

        blockWithItem(MarbleBlocks.MARBLE_BLOCK);
        blockWithItem(MarbleBlocks.MARBLE_COBBLE_BLOCK);
        blockWithItem(MarbleBlocks.MARBLE_BRICK_BLOCK);
        blockWithItem(MarbleBlocks.MARBLE_IRON_ORE);
        blockWithItem(MarbleBlocks.MARBLE_GOLD_ORE);
        blockWithItem(MarbleBlocks.MARBLE_REDSTONE_ORE);
        blockWithItem(MarbleBlocks.MARBLE_LAPIS_ORE);
        blockWithItem(MarbleBlocks.MARBLE_DIAMOND_ORE);
        blockWithItem(MarbleBlocks.MARBLE_EMERALD_ORE);

        blockWithItem(LimestoneBlocks.LIMESTONE_BLOCK);
        blockWithItem(LimestoneBlocks.LIMESTONE_COAL_ORE);
        blockWithItem(LimestoneBlocks.LIMESTONE_COPPER_ORE);
        blockWithItem(LimestoneBlocks.LIMESTONE_IRON_ORE);
        blockWithItem(LimestoneBlocks.LIMESTONE_GOLD_ORE);
        blockWithItem(LimestoneBlocks.LIMESTONE_REDSTONE_ORE);
        blockWithItem(LimestoneBlocks.LIMESTONE_LAPIS_ORE);

        blockWithItem(SiltstoneBlocks.SILTSTONE_BLOCK);
        blockWithItem(SiltstoneBlocks.SILTSTONE_COAL_ORE);
        blockWithItem(SiltstoneBlocks.SILTSTONE_COPPER_ORE);
        blockWithItem(SiltstoneBlocks.SILTSTONE_IRON_ORE);
        blockWithItem(SiltstoneBlocks.SILTSTONE_GOLD_ORE);
        blockWithItem(SiltstoneBlocks.SILTSTONE_REDSTONE_ORE);
        blockWithItem(SiltstoneBlocks.SILTSTONE_LAPIS_ORE);

        blockWithItem(BlueschistBlocks.BLUESCHIST_BLOCK);
        blockWithItem(BlueschistBlocks.BLUESCHIST_COBBLE_BLOCK);
        blockWithItem(BlueschistBlocks.BLUESCHIST_BRICK_BLOCK);
        blockWithItem(BlueschistBlocks.BLUESCHIST_COAL_ORE);
        blockWithItem(BlueschistBlocks.BLUESCHIST_COPPER_ORE);
        blockWithItem(BlueschistBlocks.BLUESCHIST_IRON_ORE);
        blockWithItem(BlueschistBlocks.BLUESCHIST_GOLD_ORE);
        blockWithItem(BlueschistBlocks.BLUESCHIST_REDSTONE_ORE);
        blockWithItem(BlueschistBlocks.BLUESCHIST_LAPIS_ORE);

        blockWithItem(GreenschistBlocks.GREENSCHIST_BLOCK);
        blockWithItem(GreenschistBlocks.GREENSCHIST_COBBLE_BLOCK);
        blockWithItem(GreenschistBlocks.GREENSCHIST_BRICK_BLOCK);
        blockWithItem(GreenschistBlocks.GREENSCHIST_COAL_ORE);
        blockWithItem(GreenschistBlocks.GREENSCHIST_COPPER_ORE);
        blockWithItem(GreenschistBlocks.GREENSCHIST_IRON_ORE);
        blockWithItem(GreenschistBlocks.GREENSCHIST_GOLD_ORE);
        blockWithItem(GreenschistBlocks.GREENSCHIST_REDSTONE_ORE);
        blockWithItem(GreenschistBlocks.GREENSCHIST_LAPIS_ORE);

        blockWithItem(ChalkBlocks.CHALK_BLOCK);
        blockWithItem(ChalkBlocks.CHALK_COAL_ORE);
        blockWithItem(ChalkBlocks.CHALK_COPPER_ORE);
        blockWithItem(ChalkBlocks.CHALK_IRON_ORE);
        blockWithItem(ChalkBlocks.CHALK_GOLD_ORE);
        blockWithItem(ChalkBlocks.CHALK_REDSTONE_ORE);
        blockWithItem(ChalkBlocks.CHALK_LAPIS_ORE);

        blockWithItem(ShaleBlocks.SHALE_BLOCK);
        blockWithItem(ShaleBlocks.SHALE_COAL_ORE);
        blockWithItem(ShaleBlocks.SHALE_COPPER_ORE);
        blockWithItem(ShaleBlocks.SHALE_IRON_ORE);
        blockWithItem(ShaleBlocks.SHALE_GOLD_ORE);
        blockWithItem(ShaleBlocks.SHALE_REDSTONE_ORE);
        blockWithItem(ShaleBlocks.SHALE_LAPIS_ORE);

        blockWithItem(ChertBlocks.CHERT_BLOCK);
        blockWithItem(ChertBlocks.CHERT_COAL_ORE);
        blockWithItem(ChertBlocks.CHERT_COPPER_ORE);
        blockWithItem(ChertBlocks.CHERT_IRON_ORE);
        blockWithItem(ChertBlocks.CHERT_GOLD_ORE);
        blockWithItem(ChertBlocks.CHERT_REDSTONE_ORE);
        blockWithItem(ChertBlocks.CHERT_LAPIS_ORE);

        blockWithItem(LigniteBlocks.LIGNITE_BLOCK);
        blockWithItem(LigniteBlocks.LIGNITE_COAL_ORE);
        blockWithItem(LigniteBlocks.LIGNITE_COPPER_ORE);
        blockWithItem(LigniteBlocks.LIGNITE_IRON_ORE);
        blockWithItem(LigniteBlocks.LIGNITE_GOLD_ORE);
        blockWithItem(LigniteBlocks.LIGNITE_REDSTONE_ORE);
        blockWithItem(LigniteBlocks.LIGNITE_LAPIS_ORE);

        blockWithItem(DolomiteBlocks.DOLOMITE_BLOCK);
        blockWithItem(DolomiteBlocks.DOLOMITE_COAL_ORE);
        blockWithItem(DolomiteBlocks.DOLOMITE_COPPER_ORE);
        blockWithItem(DolomiteBlocks.DOLOMITE_IRON_ORE);
        blockWithItem(DolomiteBlocks.DOLOMITE_GOLD_ORE);
        blockWithItem(DolomiteBlocks.DOLOMITE_REDSTONE_ORE);
        blockWithItem(DolomiteBlocks.DOLOMITE_LAPIS_ORE);

        blockWithItem(EclogiteBlocks.ECLOGITE_BLOCK);
        blockWithItem(EclogiteBlocks.ECLOGITE_COAL_ORE);
        blockWithItem(EclogiteBlocks.ECLOGITE_COPPER_ORE);
        blockWithItem(EclogiteBlocks.ECLOGITE_IRON_ORE);
        blockWithItem(EclogiteBlocks.ECLOGITE_GOLD_ORE);
        blockWithItem(EclogiteBlocks.ECLOGITE_REDSTONE_ORE);
        blockWithItem(EclogiteBlocks.ECLOGITE_LAPIS_ORE);

        blockWithItem(GreywackeBlocks.GREYWACKE_BLOCK);
        blockWithItem(GreywackeBlocks.GREYWACKE_COAL_ORE);
        blockWithItem(GreywackeBlocks.GREYWACKE_COPPER_ORE);
        blockWithItem(GreywackeBlocks.GREYWACKE_IRON_ORE);
        blockWithItem(GreywackeBlocks.GREYWACKE_GOLD_ORE);
        blockWithItem(GreywackeBlocks.GREYWACKE_REDSTONE_ORE);
        blockWithItem(GreywackeBlocks.GREYWACKE_LAPIS_ORE);

        blockWithItem(KomatiiteBlocks.KOMATIITE_BLOCK);
        blockWithItem(KomatiiteBlocks.KOMATIITE_COBBLE_BLOCK);
        blockWithItem(KomatiiteBlocks.KOMATIITE_BRICK_BLOCK);
        blockWithItem(KomatiiteBlocks.KOMATIITE_COAL_ORE);
        blockWithItem(KomatiiteBlocks.KOMATIITE_COPPER_ORE);
        blockWithItem(KomatiiteBlocks.KOMATIITE_IRON_ORE);
        blockWithItem(KomatiiteBlocks.KOMATIITE_GOLD_ORE);
        blockWithItem(KomatiiteBlocks.KOMATIITE_REDSTONE_ORE);
        blockWithItem(KomatiiteBlocks.KOMATIITE_LAPIS_ORE);

        blockWithItem(DaciteBlocks.DACITE_BLOCK);
        blockWithItem(DaciteBlocks.DACITE_COBBLE_BLOCK);
        blockWithItem(DaciteBlocks.DACITE_BRICK_BLOCK);
        blockWithItem(DaciteBlocks.DACITE_COAL_ORE);
        blockWithItem(DaciteBlocks.DACITE_COPPER_ORE);
        blockWithItem(DaciteBlocks.DACITE_IRON_ORE);
        blockWithItem(DaciteBlocks.DACITE_GOLD_ORE);
        blockWithItem(DaciteBlocks.DACITE_REDSTONE_ORE);
        blockWithItem(DaciteBlocks.DACITE_LAPIS_ORE);

        blockWithItem(BlackGraniteBlocks.BLACK_GRANITE_BLOCK);
        blockWithItem(BlackGraniteBlocks.BLACK_GRANITE_COBBLE_BLOCK);
        blockWithItem(BlackGraniteBlocks.BLACK_GRANITE_BRICK_BLOCK);
        blockWithItem(BlackGraniteBlocks.BLACK_GRANITE_IRON_ORE);
        blockWithItem(BlackGraniteBlocks.BLACK_GRANITE_GOLD_ORE);
        blockWithItem(BlackGraniteBlocks.BLACK_GRANITE_REDSTONE_ORE);
        blockWithItem(BlackGraniteBlocks.BLACK_GRANITE_LAPIS_ORE);
        blockWithItem(BlackGraniteBlocks.BLACK_GRANITE_DIAMOND_ORE);
        blockWithItem(BlackGraniteBlocks.BLACK_GRANITE_EMERALD_ORE);

        blockWithItem(GabbroBlocks.GABBRO_BLOCK);
        blockWithItem(GabbroBlocks.GABBRO_COBBLE_BLOCK);
        blockWithItem(GabbroBlocks.GABBRO_BRICK_BLOCK);
        blockWithItem(GabbroBlocks.GABBRO_IRON_ORE);
        blockWithItem(GabbroBlocks.GABBRO_GOLD_ORE);
        blockWithItem(GabbroBlocks.GABBRO_REDSTONE_ORE);
        blockWithItem(GabbroBlocks.GABBRO_LAPIS_ORE);
        blockWithItem(GabbroBlocks.GABBRO_DIAMOND_ORE);
        blockWithItem(GabbroBlocks.GABBRO_EMERALD_ORE);

        blockWithItem(GneissBlocks.GNEISS_BLOCK);
        blockWithItem(GneissBlocks.GNEISS_COBBLE_BLOCK);
        blockWithItem(GneissBlocks.GNEISS_BRICK_BLOCK);
        blockWithItem(GneissBlocks.GNEISS_IRON_ORE);
        blockWithItem(GneissBlocks.GNEISS_GOLD_ORE);
        blockWithItem(GneissBlocks.GNEISS_REDSTONE_ORE);
        blockWithItem(GneissBlocks.GNEISS_LAPIS_ORE);
        blockWithItem(GneissBlocks.GNEISS_DIAMOND_ORE);
        blockWithItem(GneissBlocks.GNEISS_EMERALD_ORE);

        // --------------------------
        // Register buttons
        // --------------------------
        buttonWithItem((UBCButtonsBlocks) SoapstoneBlocks.SOAPSTONE_STONE_BUTTON.get(), "soapstone_stone_button", "soapstone_block");
        buttonWithItem((UBCButtonsBlocks) RhyoliteBlocks.RHYOLITE_STONE_BUTTON.get(), "rhyolite_stone_button", "rhyolite_block");
        buttonWithItem((UBCButtonsBlocks) RedGraniteBlocks.RED_GRANITE_STONE_BUTTON.get(), "red_granite_stone_button", "red_granite_block");
        buttonWithItem((UBCButtonsBlocks) QuartziteBlocks.QUARTZITE_STONE_BUTTON.get(), "quartzite_stone_button", "quartzite_block");
        buttonWithItem((UBCButtonsBlocks) MigmatiteBlocks.MIGMATITE_STONE_BUTTON.get(), "migmatite_stone_button", "migmatite_block");
        buttonWithItem((UBCButtonsBlocks) MarbleBlocks.MARBLE_STONE_BUTTON.get(), "marble_stone_button", "marble_block");
        buttonWithItem((UBCButtonsBlocks) LimestoneBlocks.LIMESTONE_STONE_BUTTON.get(), "limestone_stone_button", "limestone_block");
        buttonWithItem((UBCButtonsBlocks) SiltstoneBlocks.SILTSTONE_STONE_BUTTON.get(), "siltstone_stone_button", "siltstone_block");
        buttonWithItem((UBCButtonsBlocks) BlueschistBlocks.BLUESCHIST_STONE_BUTTON.get(), "blueschist_stone_button", "blueschist_block");
        buttonWithItem((UBCButtonsBlocks) GreenschistBlocks.GREENSCHIST_STONE_BUTTON.get(), "greenschist_stone_button", "greenschist_block");
        buttonWithItem((UBCButtonsBlocks) ChalkBlocks.CHALK_STONE_BUTTON.get(), "chalk_stone_button", "chalk_block");
        buttonWithItem((UBCButtonsBlocks) ShaleBlocks.SHALE_STONE_BUTTON.get(), "shale_stone_button", "shale_block");
        buttonWithItem((UBCButtonsBlocks) ChertBlocks.CHERT_STONE_BUTTON.get(), "chert_stone_button", "chert_block");
        buttonWithItem((UBCButtonsBlocks) LigniteBlocks.LIGNITE_STONE_BUTTON.get(), "lignite_stone_button", "lignite_block");
        buttonWithItem((UBCButtonsBlocks) DolomiteBlocks.DOLOMITE_STONE_BUTTON.get(), "dolomite_stone_button", "dolomite_block");
        buttonWithItem((UBCButtonsBlocks) EclogiteBlocks.ECLOGITE_STONE_BUTTON.get(), "eclogite_stone_button", "eclogite_block");
        buttonWithItem((UBCButtonsBlocks) GreywackeBlocks.GREYWACKE_STONE_BUTTON.get(), "greywacke_stone_button", "greywacke_block");
        buttonWithItem((UBCButtonsBlocks) KomatiiteBlocks.KOMATIITE_STONE_BUTTON.get(), "komatiite_stone_button", "komatiite_block");
        buttonWithItem((UBCButtonsBlocks) DaciteBlocks.DACITE_STONE_BUTTON.get(), "dacite_stone_button", "dacite_block");
        buttonWithItem((UBCButtonsBlocks) BlackGraniteBlocks.BLACK_GRANITE_STONE_BUTTON.get(), "blackgranite_stone_button", "black_granite_block");
        buttonWithItem((UBCButtonsBlocks) GabbroBlocks.GABBRO_STONE_BUTTON.get(), "gabbro_stone_button", "gabbro_block");
        buttonWithItem((UBCButtonsBlocks) GneissBlocks.GNEISS_STONE_BUTTON.get(), "gneiss_stone_button", "gneiss_block");

        // --------------------------
        // Register stairs, slabs, and walls, blocks multiple
        // --------------------------
        blockItem(SoapstoneBlocks.SOAPSTONE_STAIRS);
        blockItem(SoapstoneBlocks.SOAPSTONE_COBBLE_STAIRS);
        blockItem(SoapstoneBlocks.SOAPSTONE_BRICK_STAIRS);

        blockItem(SoapstoneBlocks.SOAPSTONE_BLOCK_SLAB);
        blockItem(SoapstoneBlocks.SOAPSTONE_COBBLE_SLAB);
        blockItem(SoapstoneBlocks.SOAPSTONE_BRICK_SLAB);

        blockItem(RhyoliteBlocks.RHYOLITE_BLOCK_SLAB);
        blockItem(RhyoliteBlocks.RHYOLITE_COBBLE_SLAB);
        blockItem(RhyoliteBlocks.RHYOLITE_BRICK_SLAB);

        blockItem(RhyoliteBlocks.RHYOLITE_STAIRS);
        blockItem(RhyoliteBlocks.RHYOLITE_COBBLE_STAIRS);
        blockItem(RhyoliteBlocks.RHYOLITE_BRICK_STAIRS);

        blockItem(RedGraniteBlocks.RED_GRANITE_BLOCK_SLAB);
        blockItem(RedGraniteBlocks.RED_GRANITE_COBBLE_SLAB);
        blockItem(RedGraniteBlocks.RED_GRANITE_BRICK_SLAB);

        blockItem(RedGraniteBlocks.RED_GRANITE_STAIRS);
        blockItem(RedGraniteBlocks.RED_GRANITE_COBBLE_STAIRS);
        blockItem(RedGraniteBlocks.RED_GRANITE_BRICK_STAIRS);

        blockItem(QuartziteBlocks.QUARTZITE_BLOCK_SLAB);
        blockItem(QuartziteBlocks.QUARTZITE_COBBLE_SLAB);
        blockItem(QuartziteBlocks.QUARTZITE_BRICK_SLAB);

        blockItem(QuartziteBlocks.QUARTZITE_STAIRS);
        blockItem(QuartziteBlocks.QUARTZITE_COBBLE_STAIRS);
        blockItem(QuartziteBlocks.QUARTZITE_BRICK_STAIRS);

        blockItem(MigmatiteBlocks.MIGMATITE_STAIRS);
        blockItem(MigmatiteBlocks.MIGMATITE_COBBLE_STAIRS);
        blockItem(MigmatiteBlocks.MIGMATITE_BRICK_STAIRS);

        blockItem(MigmatiteBlocks.MIGMATITE_BLOCK_SLAB);
        blockItem(MigmatiteBlocks.MIGMATITE_COBBLE_SLAB);
        blockItem(MigmatiteBlocks.MIGMATITE_BRICK_SLAB);

        blockItem(MarbleBlocks.MARBLE_STAIRS);
        blockItem(MarbleBlocks.MARBLE_COBBLE_STAIRS);
        blockItem(MarbleBlocks.MARBLE_BRICK_STAIRS);

        blockItem(MarbleBlocks.MARBLE_BLOCK_SLAB);
        blockItem(MarbleBlocks.MARBLE_COBBLE_SLAB);
        blockItem(MarbleBlocks.MARBLE_BRICK_SLAB);

        blockItem(LimestoneBlocks.LIMESTONE_STAIRS);
        blockItem(LimestoneBlocks.LIMESTONE_BLOCK_SLAB);

        blockItem(SiltstoneBlocks.SILTSTONE_STAIRS);
        blockItem(SiltstoneBlocks.SILTSTONE_BLOCK_SLAB);

        blockItem(BlueschistBlocks.BLUESCHIST_STAIRS);
        blockItem(BlueschistBlocks.BLUESCHIST_COBBLE_STAIRS);
        blockItem(BlueschistBlocks.BLUESCHIST_BRICK_STAIRS);

        blockItem(BlueschistBlocks.BLUESCHIST_BLOCK_SLAB);
        blockItem(BlueschistBlocks.BLUESCHIST_COBBLE_SLAB);
        blockItem(BlueschistBlocks.BLUESCHIST_BRICK_SLAB);

        blockItem(GreenschistBlocks.GREENSCHIST_STAIRS);
        blockItem(GreenschistBlocks.GREENSCHIST_COBBLE_STAIRS);
        blockItem(GreenschistBlocks.GREENSCHIST_BRICK_STAIRS);

        blockItem(GreenschistBlocks.GREENSCHIST_BLOCK_SLAB);
        blockItem(GreenschistBlocks.GREENSCHIST_COBBLE_SLAB);
        blockItem(GreenschistBlocks.GREENSCHIST_BRICK_SLAB);

        blockItem(ChalkBlocks.CHALK_STAIRS);
        blockItem(ChalkBlocks.CHALK_BLOCK_SLAB);

        blockItem(ShaleBlocks.SHALE_STAIRS);
        blockItem(ShaleBlocks.SHALE_BLOCK_SLAB);

        blockItem(ChertBlocks.CHERT_STAIRS);
        blockItem(ChertBlocks.CHERT_BLOCK_SLAB);

        blockItem(LigniteBlocks.LIGNITE_STAIRS);
        blockItem(LigniteBlocks.LIGNITE_BLOCK_SLAB);

        blockItem(DolomiteBlocks.DOLOMITE_STAIRS);
        blockItem(DolomiteBlocks.DOLOMITE_BLOCK_SLAB);

        blockItem(EclogiteBlocks.ECLOGITE_STAIRS);
        blockItem(EclogiteBlocks.ECLOGITE_BLOCK_SLAB);

        blockItem(GreywackeBlocks.GREYWACKE_STAIRS);
        blockItem(GreywackeBlocks.GREYWACKE_BLOCK_SLAB);

        blockItem(KomatiiteBlocks.KOMATIITE_STAIRS);
        blockItem(KomatiiteBlocks.KOMATIITE_COBBLE_STAIRS);
        blockItem(KomatiiteBlocks.KOMATIITE_BRICK_STAIRS);

        blockItem(KomatiiteBlocks.KOMATIITE_BLOCK_SLAB);
        blockItem(KomatiiteBlocks.KOMATIITE_COBBLE_SLAB);
        blockItem(KomatiiteBlocks.KOMATIITE_BRICK_SLAB);

        blockItem(DaciteBlocks.DACITE_STAIRS);
        blockItem(DaciteBlocks.DACITE_COBBLE_STAIRS);
        blockItem(DaciteBlocks.DACITE_BRICK_STAIRS);

        blockItem(DaciteBlocks.DACITE_BLOCK_SLAB);
        blockItem(DaciteBlocks.DACITE_COBBLE_SLAB);
        blockItem(DaciteBlocks.DACITE_BRICK_SLAB);

        blockItem(BlackGraniteBlocks.BLACK_GRANITE_STAIRS);
        blockItem(BlackGraniteBlocks.BLACK_GRANITE_COBBLE_STAIRS);
        blockItem(BlackGraniteBlocks.BLACK_GRANITE_BRICK_STAIRS);

        blockItem(BlackGraniteBlocks.BLACK_GRANITE_BLOCK_SLAB);
        blockItem(BlackGraniteBlocks.BLACK_GRANITE_COBBLE_SLAB);
        blockItem(BlackGraniteBlocks.BLACK_GRANITE_BRICK_SLAB);

        blockItem(GabbroBlocks.GABBRO_STAIRS);
        blockItem(GabbroBlocks.GABBRO_COBBLE_STAIRS);
        blockItem(GabbroBlocks.GABBRO_BRICK_STAIRS);

        blockItem(GabbroBlocks.GABBRO_BLOCK_SLAB);
        blockItem(GabbroBlocks.GABBRO_COBBLE_SLAB);
        blockItem(GabbroBlocks.GABBRO_BRICK_SLAB);

        blockItem(GneissBlocks.GNEISS_STAIRS);
        blockItem(GneissBlocks.GNEISS_COBBLE_STAIRS);
        blockItem(GneissBlocks.GNEISS_BRICK_STAIRS);

        blockItem(GneissBlocks.GNEISS_BLOCK_SLAB);
        blockItem(GneissBlocks.GNEISS_COBBLE_SLAB);
        blockItem(GneissBlocks.GNEISS_BRICK_SLAB);

        //Wall items
        wallItem(SoapstoneBlocks.SOAPSTONE_BLOCK_WALL, SoapstoneBlocks.SOAPSTONE_BLOCK.get());
        wallItem(SoapstoneBlocks.SOAPSTONE_COBBLE_WALL, SoapstoneBlocks.SOAPSTONE_COBBLE_BLOCK.get());
        wallItem(SoapstoneBlocks.SOAPSTONE_BRICK_WALL, SoapstoneBlocks.SOAPSTONE_BRICK_BLOCK.get());

        wallItem(RhyoliteBlocks.RHYOLITE_BLOCK_WALL, RhyoliteBlocks.RHYOLITE_BLOCK.get());
        wallItem(RhyoliteBlocks.RHYOLITE_COBBLE_WALL, RhyoliteBlocks.RHYOLITE_COBBLE_BLOCK.get());
        wallItem(RhyoliteBlocks.RHYOLITE_BRICK_WALL, RhyoliteBlocks.RHYOLITE_BRICK_BLOCK.get());

        wallItem(RedGraniteBlocks.RED_GRANITE_BLOCK_WALL, RedGraniteBlocks.RED_GRANITE_BLOCK.get());
        wallItem(RedGraniteBlocks.RED_GRANITE_COBBLE_WALL, RedGraniteBlocks.RED_GRANITE_COBBLE_BLOCK.get());
        wallItem(RedGraniteBlocks.RED_GRANITE_BRICK_WALL, RedGraniteBlocks.RED_GRANITE_BRICK_BLOCK.get());

        wallItem(QuartziteBlocks.QUARTZITE_BLOCK_WALL, QuartziteBlocks.QUARTZITE_BLOCK.get());
        wallItem(QuartziteBlocks.QUARTZITE_COBBLE_WALL, QuartziteBlocks.QUARTZITE_COBBLE_BLOCK.get());
        wallItem(QuartziteBlocks.QUARTZITE_BRICK_WALL, QuartziteBlocks.QUARTZITE_BRICK_BLOCK.get());

        wallItem(MigmatiteBlocks.MIGMATITE_BLOCK_WALL, MigmatiteBlocks.MIGMATITE_BLOCK.get());
        wallItem(MigmatiteBlocks.MIGMATITE_COBBLE_WALL, MigmatiteBlocks.MIGMATITE_COBBLE_BLOCK.get());
        wallItem(MigmatiteBlocks.MIGMATITE_BRICK_WALL, MigmatiteBlocks.MIGMATITE_BRICK_BLOCK.get());

        wallItem(MarbleBlocks.MARBLE_BLOCK_WALL, MarbleBlocks.MARBLE_BLOCK.get());
        wallItem(MarbleBlocks.MARBLE_COBBLE_WALL, MarbleBlocks.MARBLE_COBBLE_BLOCK.get());
        wallItem(MarbleBlocks.MARBLE_BRICK_WALL, MarbleBlocks.MARBLE_BRICK_BLOCK.get());

        wallItem(SiltstoneBlocks.SILTSTONE_BLOCK_WALL, SiltstoneBlocks.SILTSTONE_BLOCK.get());
        wallItem(SiltstoneBlocks.SILTSTONE_BLOCK_WALL, SiltstoneBlocks.SILTSTONE_BLOCK.get());

        wallItem(LimestoneBlocks.LIMESTONE_BLOCK_WALL, LimestoneBlocks.LIMESTONE_BLOCK.get());

        wallItem(BlueschistBlocks.BLUESCHIST_BLOCK_WALL, BlueschistBlocks.BLUESCHIST_BLOCK.get());
        wallItem(BlueschistBlocks.BLUESCHIST_COBBLE_WALL, BlueschistBlocks.BLUESCHIST_COBBLE_BLOCK.get());
        wallItem(BlueschistBlocks.BLUESCHIST_BRICK_WALL, BlueschistBlocks.BLUESCHIST_BRICK_BLOCK.get());

        wallItem(GreenschistBlocks.GREENSCHIST_BLOCK_WALL, GreenschistBlocks.GREENSCHIST_BLOCK.get());
        wallItem(GreenschistBlocks.GREENSCHIST_COBBLE_WALL, GreenschistBlocks.GREENSCHIST_COBBLE_BLOCK.get());
        wallItem(GreenschistBlocks.GREENSCHIST_BRICK_WALL, GreenschistBlocks.GREENSCHIST_BRICK_BLOCK.get());

        wallItem(ChalkBlocks.CHALK_BLOCK_WALL, ChalkBlocks.CHALK_BLOCK.get());

        wallItem(ShaleBlocks.SHALE_BLOCK_WALL, ShaleBlocks.SHALE_BLOCK.get());

        wallItem(ChertBlocks.CHERT_BLOCK_WALL, ChertBlocks.CHERT_BLOCK.get());

        wallItem(LigniteBlocks.LIGNITE_BLOCK_WALL, LigniteBlocks.LIGNITE_BLOCK.get());

        wallItem(DolomiteBlocks.DOLOMITE_BLOCK_WALL, DolomiteBlocks.DOLOMITE_BLOCK.get());

        wallItem(EclogiteBlocks.ECLOGITE_BLOCK_WALL, EclogiteBlocks.ECLOGITE_BLOCK.get());

        wallItem(GreywackeBlocks.GREYWACKE_BLOCK_WALL, GreywackeBlocks.GREYWACKE_BLOCK.get());

        wallItem(KomatiiteBlocks.KOMATIITE_BLOCK_WALL, KomatiiteBlocks.KOMATIITE_BLOCK.get());
        wallItem(KomatiiteBlocks.KOMATIITE_COBBLE_WALL, KomatiiteBlocks.KOMATIITE_COBBLE_BLOCK.get());
        wallItem(KomatiiteBlocks.KOMATIITE_BRICK_WALL, KomatiiteBlocks.KOMATIITE_BRICK_BLOCK.get());

        wallItem(DaciteBlocks.DACITE_BLOCK_WALL, DaciteBlocks.DACITE_BLOCK.get());
        wallItem(DaciteBlocks.DACITE_COBBLE_WALL, DaciteBlocks.DACITE_COBBLE_BLOCK.get());
        wallItem(DaciteBlocks.DACITE_BRICK_WALL, DaciteBlocks.DACITE_BRICK_BLOCK.get());

        wallItem(BlackGraniteBlocks.BLACK_GRANITE_BLOCK_WALL, BlackGraniteBlocks.BLACK_GRANITE_BLOCK.get());
        wallItem(BlackGraniteBlocks.BLACK_GRANITE_COBBLE_WALL, BlackGraniteBlocks.BLACK_GRANITE_COBBLE_BLOCK.get());
        wallItem(BlackGraniteBlocks.BLACK_GRANITE_BRICK_WALL, BlackGraniteBlocks.BLACK_GRANITE_BRICK_BLOCK.get());

        wallItem(GabbroBlocks.GABBRO_BLOCK_WALL, GabbroBlocks.GABBRO_BLOCK.get());
        wallItem(GabbroBlocks.GABBRO_COBBLE_WALL, GabbroBlocks.GABBRO_COBBLE_BLOCK.get());
        wallItem(GabbroBlocks.GABBRO_BRICK_WALL, GabbroBlocks.GABBRO_BRICK_BLOCK.get());

        wallItem(GneissBlocks.GNEISS_BLOCK_WALL, GneissBlocks.GNEISS_BLOCK.get());
        wallItem(GneissBlocks.GNEISS_COBBLE_WALL, GneissBlocks.GNEISS_COBBLE_BLOCK.get());
        wallItem(GneissBlocks.GNEISS_BRICK_WALL, GneissBlocks.GNEISS_BRICK_BLOCK.get());

        // Stairs
        stairsBlock((UBCStairsBlocks) SoapstoneBlocks.SOAPSTONE_STAIRS.get(), blockTexture(SoapstoneBlocks.SOAPSTONE_BLOCK.get()));
        stairsBlock((UBCStairsBlocks) SoapstoneBlocks.SOAPSTONE_COBBLE_STAIRS.get(), blockTexture(SoapstoneBlocks.SOAPSTONE_COBBLE_BLOCK.get()));
        stairsBlock((UBCStairsBlocks) SoapstoneBlocks.SOAPSTONE_BRICK_STAIRS.get(), blockTexture(SoapstoneBlocks.SOAPSTONE_BRICK_BLOCK.get()));

        stairsBlock((UBCStairsBlocks) RhyoliteBlocks.RHYOLITE_STAIRS.get(), blockTexture(RhyoliteBlocks.RHYOLITE_BLOCK.get()));
        stairsBlock((UBCStairsBlocks) RhyoliteBlocks.RHYOLITE_COBBLE_STAIRS.get(), blockTexture(RhyoliteBlocks.RHYOLITE_COBBLE_BLOCK.get()));
        stairsBlock((UBCStairsBlocks) RhyoliteBlocks.RHYOLITE_BRICK_STAIRS.get(), blockTexture(RhyoliteBlocks.RHYOLITE_BRICK_BLOCK.get()));

        stairsBlock((UBCStairsBlocks) RedGraniteBlocks.RED_GRANITE_STAIRS.get(), blockTexture(RedGraniteBlocks.RED_GRANITE_BLOCK.get()));
        stairsBlock((UBCStairsBlocks) RedGraniteBlocks.RED_GRANITE_COBBLE_STAIRS.get(), blockTexture(RedGraniteBlocks.RED_GRANITE_BLOCK.get()));
        stairsBlock((UBCStairsBlocks) RedGraniteBlocks.RED_GRANITE_BRICK_STAIRS.get(), blockTexture(RedGraniteBlocks.RED_GRANITE_BRICK_BLOCK.get()));

        stairsBlock((UBCStairsBlocks) QuartziteBlocks.QUARTZITE_STAIRS.get(), blockTexture(QuartziteBlocks.QUARTZITE_BLOCK.get()));
        stairsBlock((UBCStairsBlocks) QuartziteBlocks.QUARTZITE_COBBLE_STAIRS.get(), blockTexture(QuartziteBlocks.QUARTZITE_COBBLE_BLOCK.get()));
        stairsBlock((UBCStairsBlocks) QuartziteBlocks.QUARTZITE_BRICK_STAIRS.get(), blockTexture(QuartziteBlocks.QUARTZITE_BRICK_BLOCK.get()));

        stairsBlock((UBCStairsBlocks) MigmatiteBlocks.MIGMATITE_STAIRS.get(), blockTexture(MigmatiteBlocks.MIGMATITE_BLOCK.get()));
        stairsBlock((UBCStairsBlocks) MigmatiteBlocks.MIGMATITE_COBBLE_STAIRS.get(), blockTexture(MigmatiteBlocks.MIGMATITE_COBBLE_BLOCK.get()));
        stairsBlock((UBCStairsBlocks) MigmatiteBlocks.MIGMATITE_BRICK_STAIRS.get(), blockTexture(MigmatiteBlocks.MIGMATITE_BRICK_BLOCK.get()));

        stairsBlock((UBCStairsBlocks) MarbleBlocks.MARBLE_STAIRS.get(), blockTexture(MarbleBlocks.MARBLE_BLOCK.get()));
        stairsBlock((UBCStairsBlocks) MarbleBlocks.MARBLE_COBBLE_STAIRS.get(), blockTexture(MarbleBlocks.MARBLE_COBBLE_BLOCK.get()));
        stairsBlock((UBCStairsBlocks) MarbleBlocks.MARBLE_BRICK_STAIRS.get(), blockTexture(MarbleBlocks.MARBLE_BRICK_BLOCK.get()));

        stairsBlock((UBCStairsBlocks) LimestoneBlocks.LIMESTONE_STAIRS.get(), blockTexture(LimestoneBlocks.LIMESTONE_BLOCK.get()));

        stairsBlock((UBCStairsBlocks) SiltstoneBlocks.SILTSTONE_STAIRS.get(), blockTexture(SiltstoneBlocks.SILTSTONE_BLOCK.get()));

        stairsBlock((UBCStairsBlocks) BlueschistBlocks.BLUESCHIST_STAIRS.get(), blockTexture(BlueschistBlocks.BLUESCHIST_BLOCK.get()));
        stairsBlock((UBCStairsBlocks) BlueschistBlocks.BLUESCHIST_COBBLE_STAIRS.get(), blockTexture(BlueschistBlocks.BLUESCHIST_COBBLE_BLOCK.get()));
        stairsBlock((UBCStairsBlocks) BlueschistBlocks.BLUESCHIST_BRICK_STAIRS.get(), blockTexture(BlueschistBlocks.BLUESCHIST_BRICK_BLOCK.get()));

        stairsBlock((UBCStairsBlocks) GreenschistBlocks.GREENSCHIST_STAIRS.get(), blockTexture(GreenschistBlocks.GREENSCHIST_BLOCK.get()));
        stairsBlock((UBCStairsBlocks) GreenschistBlocks.GREENSCHIST_COBBLE_STAIRS.get(), blockTexture(GreenschistBlocks.GREENSCHIST_COBBLE_BLOCK.get()));
        stairsBlock((UBCStairsBlocks) GreenschistBlocks.GREENSCHIST_BRICK_STAIRS.get(), blockTexture(GreenschistBlocks.GREENSCHIST_BRICK_BLOCK.get()));

        stairsBlock((UBCStairsBlocks) ChalkBlocks.CHALK_STAIRS.get(), blockTexture(ChalkBlocks.CHALK_BLOCK.get()));

        stairsBlock((UBCStairsBlocks) ShaleBlocks.SHALE_STAIRS.get(), blockTexture(ShaleBlocks.SHALE_BLOCK.get()));

        stairsBlock((UBCStairsBlocks) ChertBlocks.CHERT_STAIRS.get(), blockTexture(ChertBlocks.CHERT_BLOCK.get()));

        stairsBlock((UBCStairsBlocks) LigniteBlocks.LIGNITE_STAIRS.get(), blockTexture(LigniteBlocks.LIGNITE_BLOCK.get()));

        stairsBlock((UBCStairsBlocks) DolomiteBlocks.DOLOMITE_STAIRS.get(), blockTexture(DolomiteBlocks.DOLOMITE_BLOCK.get()));

        stairsBlock((UBCStairsBlocks) EclogiteBlocks.ECLOGITE_STAIRS.get(), blockTexture(EclogiteBlocks.ECLOGITE_BLOCK.get()));

        stairsBlock((UBCStairsBlocks) GreywackeBlocks.GREYWACKE_STAIRS.get(), blockTexture(GreywackeBlocks.GREYWACKE_BLOCK.get()));

        stairsBlock((UBCStairsBlocks) KomatiiteBlocks.KOMATIITE_STAIRS.get(), blockTexture(KomatiiteBlocks.KOMATIITE_BLOCK.get()));
        stairsBlock((UBCStairsBlocks) KomatiiteBlocks.KOMATIITE_COBBLE_STAIRS.get(), blockTexture(KomatiiteBlocks.KOMATIITE_COBBLE_BLOCK.get()));
        stairsBlock((UBCStairsBlocks) KomatiiteBlocks.KOMATIITE_BRICK_STAIRS.get(), blockTexture(KomatiiteBlocks.KOMATIITE_BRICK_BLOCK.get()));

        stairsBlock((UBCStairsBlocks) DaciteBlocks.DACITE_STAIRS.get(), blockTexture(DaciteBlocks.DACITE_BLOCK.get()));
        stairsBlock((UBCStairsBlocks) DaciteBlocks.DACITE_COBBLE_STAIRS.get(), blockTexture(DaciteBlocks.DACITE_COBBLE_BLOCK.get()));
        stairsBlock((UBCStairsBlocks) DaciteBlocks.DACITE_BRICK_STAIRS.get(), blockTexture(DaciteBlocks.DACITE_BRICK_BLOCK.get()));

        stairsBlock((UBCStairsBlocks) BlackGraniteBlocks.BLACK_GRANITE_STAIRS.get(), blockTexture(BlackGraniteBlocks.BLACK_GRANITE_BLOCK.get()));
        stairsBlock((UBCStairsBlocks) BlackGraniteBlocks.BLACK_GRANITE_COBBLE_STAIRS.get(), blockTexture(BlackGraniteBlocks.BLACK_GRANITE_COBBLE_BLOCK.get()));
        stairsBlock((UBCStairsBlocks) BlackGraniteBlocks.BLACK_GRANITE_BRICK_STAIRS.get(), blockTexture(BlackGraniteBlocks.BLACK_GRANITE_BRICK_BLOCK.get()));

        stairsBlock((UBCStairsBlocks) GabbroBlocks.GABBRO_STAIRS.get(), blockTexture(GabbroBlocks.GABBRO_BLOCK.get()));
        stairsBlock((UBCStairsBlocks) GabbroBlocks.GABBRO_COBBLE_STAIRS.get(), blockTexture(GabbroBlocks.GABBRO_COBBLE_BLOCK.get()));
        stairsBlock((UBCStairsBlocks) GabbroBlocks.GABBRO_BRICK_STAIRS.get(), blockTexture(GabbroBlocks.GABBRO_BRICK_BLOCK.get()));

        stairsBlock((UBCStairsBlocks) GneissBlocks.GNEISS_STAIRS.get(), blockTexture(GneissBlocks.GNEISS_BLOCK.get()));
        stairsBlock((UBCStairsBlocks) GneissBlocks.GNEISS_COBBLE_STAIRS.get(), blockTexture(GneissBlocks.GNEISS_COBBLE_BLOCK.get()));
        stairsBlock((UBCStairsBlocks) GneissBlocks.GNEISS_BRICK_STAIRS.get(), blockTexture(GneissBlocks.GNEISS_BRICK_BLOCK.get()));

        // Slabs
        slabBlock((UBCSlabBlocks) SoapstoneBlocks.SOAPSTONE_BLOCK_SLAB.get(), blockTexture(SoapstoneBlocks.SOAPSTONE_BLOCK.get()), blockTexture(SoapstoneBlocks.SOAPSTONE_BLOCK.get()));
        slabBlock((UBCSlabBlocks) SoapstoneBlocks.SOAPSTONE_COBBLE_SLAB.get(), blockTexture(SoapstoneBlocks.SOAPSTONE_COBBLE_BLOCK.get()), blockTexture(SoapstoneBlocks.SOAPSTONE_COBBLE_BLOCK.get()));
        slabBlock((UBCSlabBlocks) SoapstoneBlocks.SOAPSTONE_BRICK_SLAB.get(), blockTexture(SoapstoneBlocks.SOAPSTONE_BRICK_BLOCK.get()), blockTexture(SoapstoneBlocks.SOAPSTONE_BRICK_BLOCK.get()));

        slabBlock((UBCSlabBlocks) RhyoliteBlocks.RHYOLITE_BLOCK_SLAB.get(), blockTexture(RhyoliteBlocks.RHYOLITE_BLOCK.get()), blockTexture(RhyoliteBlocks.RHYOLITE_BLOCK.get()));
        slabBlock((UBCSlabBlocks) RhyoliteBlocks.RHYOLITE_COBBLE_SLAB.get(), blockTexture(RhyoliteBlocks.RHYOLITE_COBBLE_BLOCK.get()), blockTexture(RhyoliteBlocks.RHYOLITE_COBBLE_BLOCK.get()));
        slabBlock((UBCSlabBlocks) RhyoliteBlocks.RHYOLITE_BRICK_SLAB.get(), blockTexture(RhyoliteBlocks.RHYOLITE_BRICK_BLOCK.get()), blockTexture(RhyoliteBlocks.RHYOLITE_BRICK_BLOCK.get()));

        slabBlock((UBCSlabBlocks) RedGraniteBlocks.RED_GRANITE_BLOCK_SLAB.get(), blockTexture(RedGraniteBlocks.RED_GRANITE_BLOCK.get()), blockTexture(RedGraniteBlocks.RED_GRANITE_BLOCK.get()));
        slabBlock((UBCSlabBlocks) RedGraniteBlocks.RED_GRANITE_COBBLE_SLAB.get(), blockTexture(RedGraniteBlocks.RED_GRANITE_COBBLE_BLOCK.get()), blockTexture(RedGraniteBlocks.RED_GRANITE_BLOCK.get()));
        slabBlock((UBCSlabBlocks) RedGraniteBlocks.RED_GRANITE_BRICK_SLAB.get(), blockTexture(RedGraniteBlocks.RED_GRANITE_BRICK_BLOCK.get()), blockTexture(RedGraniteBlocks.RED_GRANITE_BRICK_BLOCK.get()));

        slabBlock((UBCSlabBlocks) QuartziteBlocks.QUARTZITE_BLOCK_SLAB.get(), blockTexture(QuartziteBlocks.QUARTZITE_BLOCK.get()), blockTexture(QuartziteBlocks.QUARTZITE_BLOCK.get()));
        slabBlock((UBCSlabBlocks) QuartziteBlocks.QUARTZITE_COBBLE_SLAB.get(), blockTexture(QuartziteBlocks.QUARTZITE_COBBLE_BLOCK.get()), blockTexture(QuartziteBlocks.QUARTZITE_COBBLE_BLOCK.get()));
        slabBlock((UBCSlabBlocks) QuartziteBlocks.QUARTZITE_BRICK_SLAB.get(), blockTexture(QuartziteBlocks.QUARTZITE_BRICK_BLOCK.get()), blockTexture(QuartziteBlocks.QUARTZITE_BRICK_BLOCK.get()));

        slabBlock((UBCSlabBlocks) MigmatiteBlocks.MIGMATITE_BLOCK_SLAB.get(), blockTexture(MigmatiteBlocks.MIGMATITE_BLOCK.get()), blockTexture(MigmatiteBlocks.MIGMATITE_BLOCK.get()));
        slabBlock((UBCSlabBlocks) MigmatiteBlocks.MIGMATITE_COBBLE_SLAB.get(), blockTexture(MigmatiteBlocks.MIGMATITE_COBBLE_BLOCK.get()), blockTexture(MigmatiteBlocks.MIGMATITE_COBBLE_BLOCK.get()));
        slabBlock((UBCSlabBlocks) MigmatiteBlocks.MIGMATITE_BRICK_SLAB.get(), blockTexture(MigmatiteBlocks.MIGMATITE_BRICK_BLOCK.get()), blockTexture(MigmatiteBlocks.MIGMATITE_BRICK_BLOCK.get()));

        slabBlock((UBCSlabBlocks) MarbleBlocks.MARBLE_BLOCK_SLAB.get(), blockTexture(MarbleBlocks.MARBLE_BLOCK.get()), blockTexture(MarbleBlocks.MARBLE_BLOCK.get()));
        slabBlock((UBCSlabBlocks) MarbleBlocks.MARBLE_COBBLE_SLAB.get(), blockTexture(MarbleBlocks.MARBLE_COBBLE_BLOCK.get()), blockTexture(MarbleBlocks.MARBLE_COBBLE_BLOCK.get()));
        slabBlock((UBCSlabBlocks) MarbleBlocks.MARBLE_BRICK_SLAB.get(), blockTexture(MarbleBlocks.MARBLE_BRICK_BLOCK.get()), blockTexture(MarbleBlocks.MARBLE_BRICK_BLOCK.get()));

        slabBlock((UBCSlabBlocks) LimestoneBlocks.LIMESTONE_BLOCK_SLAB.get(), blockTexture(LimestoneBlocks.LIMESTONE_BLOCK.get()), blockTexture(LimestoneBlocks.LIMESTONE_BLOCK.get()));

        slabBlock((UBCSlabBlocks) SiltstoneBlocks.SILTSTONE_BLOCK_SLAB.get(),blockTexture(SiltstoneBlocks.SILTSTONE_BLOCK.get()), blockTexture(SiltstoneBlocks.SILTSTONE_BLOCK.get()));

        slabBlock((UBCSlabBlocks) BlueschistBlocks.BLUESCHIST_BLOCK_SLAB.get(), blockTexture(BlueschistBlocks.BLUESCHIST_BLOCK.get()), blockTexture(BlueschistBlocks.BLUESCHIST_BLOCK.get()));
        slabBlock((UBCSlabBlocks) BlueschistBlocks.BLUESCHIST_COBBLE_SLAB.get(), blockTexture(BlueschistBlocks.BLUESCHIST_COBBLE_BLOCK.get()), blockTexture(BlueschistBlocks.BLUESCHIST_COBBLE_BLOCK.get()));
        slabBlock((UBCSlabBlocks) BlueschistBlocks.BLUESCHIST_BRICK_SLAB.get(), blockTexture(BlueschistBlocks.BLUESCHIST_BRICK_BLOCK.get()), blockTexture(BlueschistBlocks.BLUESCHIST_BRICK_BLOCK.get()));

        slabBlock((UBCSlabBlocks) GreenschistBlocks.GREENSCHIST_BLOCK_SLAB.get(), blockTexture(GreenschistBlocks.GREENSCHIST_BLOCK.get()), blockTexture(GreenschistBlocks.GREENSCHIST_BLOCK.get()));
        slabBlock((UBCSlabBlocks) GreenschistBlocks.GREENSCHIST_COBBLE_SLAB.get(), blockTexture(GreenschistBlocks.GREENSCHIST_COBBLE_BLOCK.get()), blockTexture(GreenschistBlocks.GREENSCHIST_COBBLE_BLOCK.get()));
        slabBlock((UBCSlabBlocks) GreenschistBlocks.GREENSCHIST_BRICK_SLAB.get(), blockTexture(GreenschistBlocks.GREENSCHIST_BRICK_BLOCK.get()), blockTexture(GreenschistBlocks.GREENSCHIST_BRICK_BLOCK.get()));

        slabBlock((UBCSlabBlocks) ChalkBlocks.CHALK_BLOCK_SLAB.get(),blockTexture(ChalkBlocks.CHALK_BLOCK.get()), blockTexture(ChalkBlocks.CHALK_BLOCK.get()));

        slabBlock((UBCSlabBlocks) ShaleBlocks.SHALE_BLOCK_SLAB.get(), blockTexture(ShaleBlocks.SHALE_BLOCK.get()), blockTexture(ShaleBlocks.SHALE_BLOCK.get()));

        slabBlock((UBCSlabBlocks) ChertBlocks.CHERT_BLOCK_SLAB.get(), blockTexture(ChertBlocks.CHERT_BLOCK.get()), blockTexture(ChertBlocks.CHERT_BLOCK.get()));

        slabBlock((UBCSlabBlocks) LigniteBlocks.LIGNITE_BLOCK_SLAB.get(), blockTexture(LigniteBlocks.LIGNITE_BLOCK.get()), blockTexture(LigniteBlocks.LIGNITE_BLOCK.get()));

        slabBlock((UBCSlabBlocks) DolomiteBlocks.DOLOMITE_BLOCK_SLAB.get(), blockTexture(DolomiteBlocks.DOLOMITE_BLOCK.get()), blockTexture(DolomiteBlocks.DOLOMITE_BLOCK.get()));

        slabBlock((UBCSlabBlocks) EclogiteBlocks.ECLOGITE_BLOCK_SLAB.get(), blockTexture(EclogiteBlocks.ECLOGITE_BLOCK.get()), blockTexture(EclogiteBlocks.ECLOGITE_BLOCK.get()));

        slabBlock((UBCSlabBlocks) GreywackeBlocks.GREYWACKE_BLOCK_SLAB.get(), blockTexture(GreywackeBlocks.GREYWACKE_BLOCK.get()), blockTexture(GreywackeBlocks.GREYWACKE_BLOCK.get()));

        slabBlock((UBCSlabBlocks) KomatiiteBlocks.KOMATIITE_BLOCK_SLAB.get(), blockTexture(KomatiiteBlocks.KOMATIITE_BLOCK.get()), blockTexture(KomatiiteBlocks.KOMATIITE_BLOCK.get()));
        slabBlock((UBCSlabBlocks) KomatiiteBlocks.KOMATIITE_COBBLE_SLAB.get(), blockTexture(KomatiiteBlocks.KOMATIITE_COBBLE_BLOCK.get()), blockTexture(KomatiiteBlocks.KOMATIITE_COBBLE_BLOCK.get()));
        slabBlock((UBCSlabBlocks) KomatiiteBlocks.KOMATIITE_BRICK_SLAB.get(), blockTexture(KomatiiteBlocks.KOMATIITE_BRICK_BLOCK.get()), blockTexture(KomatiiteBlocks.KOMATIITE_BRICK_BLOCK.get()));

        slabBlock((UBCSlabBlocks) DaciteBlocks.DACITE_BLOCK_SLAB.get(), blockTexture(DaciteBlocks.DACITE_BLOCK.get()), blockTexture(DaciteBlocks.DACITE_BLOCK.get()));
        slabBlock((UBCSlabBlocks) DaciteBlocks.DACITE_COBBLE_SLAB.get(), blockTexture(DaciteBlocks.DACITE_COBBLE_BLOCK.get()), blockTexture(DaciteBlocks.DACITE_COBBLE_BLOCK.get()));
        slabBlock((UBCSlabBlocks) DaciteBlocks.DACITE_BRICK_SLAB.get(), blockTexture(DaciteBlocks.DACITE_BRICK_BLOCK.get()), blockTexture(DaciteBlocks.DACITE_BRICK_BLOCK.get()));

        slabBlock((UBCSlabBlocks) BlackGraniteBlocks.BLACK_GRANITE_BLOCK_SLAB.get(), blockTexture(BlackGraniteBlocks.BLACK_GRANITE_BLOCK.get()), blockTexture(BlackGraniteBlocks.BLACK_GRANITE_BLOCK.get()));
        slabBlock((UBCSlabBlocks) BlackGraniteBlocks.BLACK_GRANITE_COBBLE_SLAB.get(), blockTexture(BlackGraniteBlocks.BLACK_GRANITE_COBBLE_BLOCK.get()), blockTexture(BlackGraniteBlocks.BLACK_GRANITE_COBBLE_BLOCK.get()));
        slabBlock((UBCSlabBlocks) BlackGraniteBlocks.BLACK_GRANITE_BRICK_SLAB.get(), blockTexture(BlackGraniteBlocks.BLACK_GRANITE_BRICK_BLOCK.get()), blockTexture(BlackGraniteBlocks.BLACK_GRANITE_BRICK_BLOCK.get()));

        slabBlock((UBCSlabBlocks) GabbroBlocks.GABBRO_BLOCK_SLAB.get(), blockTexture(GabbroBlocks.GABBRO_BLOCK.get()), blockTexture(GabbroBlocks.GABBRO_BLOCK.get()));
        slabBlock((UBCSlabBlocks) GabbroBlocks.GABBRO_COBBLE_SLAB.get(), blockTexture(GabbroBlocks.GABBRO_COBBLE_BLOCK.get()), blockTexture(GabbroBlocks.GABBRO_COBBLE_BLOCK.get()));
        slabBlock((UBCSlabBlocks) GabbroBlocks.GABBRO_BRICK_SLAB.get(), blockTexture(GabbroBlocks.GABBRO_BRICK_BLOCK.get()), blockTexture(GabbroBlocks.GABBRO_BRICK_BLOCK.get()));

        slabBlock((UBCSlabBlocks) GneissBlocks.GNEISS_BLOCK_SLAB.get(), blockTexture(GneissBlocks.GNEISS_BLOCK.get()), blockTexture(GneissBlocks.GNEISS_BLOCK.get()));
        slabBlock((UBCSlabBlocks) GneissBlocks.GNEISS_COBBLE_SLAB.get(), blockTexture(GneissBlocks.GNEISS_COBBLE_BLOCK.get()), blockTexture(GneissBlocks.GNEISS_COBBLE_BLOCK.get()));
        slabBlock((UBCSlabBlocks) GneissBlocks.GNEISS_BRICK_SLAB.get(), blockTexture(GneissBlocks.GNEISS_BRICK_BLOCK.get()), blockTexture(GneissBlocks.GNEISS_BRICK_BLOCK.get()));


        // Walls
        wallBlock((UBCWallBlocks) SoapstoneBlocks.SOAPSTONE_BLOCK_WALL.get(), blockTexture(SoapstoneBlocks.SOAPSTONE_BLOCK.get()));
        wallBlock((UBCWallBlocks) SoapstoneBlocks.SOAPSTONE_COBBLE_WALL.get(), blockTexture(SoapstoneBlocks.SOAPSTONE_COBBLE_BLOCK.get()));
        wallBlock((UBCWallBlocks) SoapstoneBlocks.SOAPSTONE_BRICK_WALL.get(), blockTexture(SoapstoneBlocks.SOAPSTONE_BRICK_BLOCK.get()));

        wallBlock((UBCWallBlocks) RhyoliteBlocks.RHYOLITE_BLOCK_WALL.get(), blockTexture(RhyoliteBlocks.RHYOLITE_BLOCK.get()));
        wallBlock((UBCWallBlocks) RhyoliteBlocks.RHYOLITE_COBBLE_WALL.get(), blockTexture(RhyoliteBlocks.RHYOLITE_COBBLE_BLOCK.get()));
        wallBlock((UBCWallBlocks) RhyoliteBlocks.RHYOLITE_BRICK_WALL.get(), blockTexture(RhyoliteBlocks.RHYOLITE_BRICK_BLOCK.get()));

        wallBlock((UBCWallBlocks) RedGraniteBlocks.RED_GRANITE_BLOCK_WALL.get(), blockTexture(RedGraniteBlocks.RED_GRANITE_BLOCK.get()));
        wallBlock((UBCWallBlocks) RedGraniteBlocks.RED_GRANITE_COBBLE_WALL.get(), blockTexture(RedGraniteBlocks.RED_GRANITE_COBBLE_BLOCK.get()));
        wallBlock((UBCWallBlocks) RedGraniteBlocks.RED_GRANITE_BRICK_WALL.get(), blockTexture(RedGraniteBlocks.RED_GRANITE_BRICK_BLOCK.get()));

        wallBlock((UBCWallBlocks) QuartziteBlocks.QUARTZITE_BLOCK_WALL.get(), blockTexture(QuartziteBlocks.QUARTZITE_BLOCK.get()));
        wallBlock((UBCWallBlocks) QuartziteBlocks.QUARTZITE_COBBLE_WALL.get(), blockTexture(QuartziteBlocks.QUARTZITE_COBBLE_BLOCK.get()));
        wallBlock((UBCWallBlocks) QuartziteBlocks.QUARTZITE_BRICK_WALL.get(), blockTexture(QuartziteBlocks.QUARTZITE_BRICK_BLOCK.get()));

        wallBlock((UBCWallBlocks) MigmatiteBlocks.MIGMATITE_BLOCK_WALL.get(), blockTexture(MigmatiteBlocks.MIGMATITE_BLOCK.get()));
        wallBlock((UBCWallBlocks) MigmatiteBlocks.MIGMATITE_COBBLE_WALL.get(), blockTexture(MigmatiteBlocks.MIGMATITE_COBBLE_BLOCK.get()));
        wallBlock((UBCWallBlocks) MigmatiteBlocks.MIGMATITE_BRICK_WALL.get(), blockTexture(MigmatiteBlocks.MIGMATITE_BRICK_BLOCK.get()));

        wallBlock((UBCWallBlocks) MarbleBlocks.MARBLE_BLOCK_WALL.get(), blockTexture(MarbleBlocks.MARBLE_BLOCK.get()));
        wallBlock((UBCWallBlocks) MarbleBlocks.MARBLE_COBBLE_WALL.get(), blockTexture(MarbleBlocks.MARBLE_COBBLE_BLOCK.get()));
        wallBlock((UBCWallBlocks) MarbleBlocks.MARBLE_BRICK_WALL.get(), blockTexture(MarbleBlocks.MARBLE_BRICK_BLOCK.get()));

        wallBlock((UBCWallBlocks) LimestoneBlocks.LIMESTONE_BLOCK_WALL.get(), blockTexture(LimestoneBlocks.LIMESTONE_BLOCK.get()));

        wallBlock((UBCWallBlocks) SiltstoneBlocks.SILTSTONE_BLOCK_WALL.get(), blockTexture(SiltstoneBlocks.SILTSTONE_BLOCK.get()));

        wallBlock((UBCWallBlocks) BlueschistBlocks.BLUESCHIST_BLOCK_WALL.get(), blockTexture(BlueschistBlocks.BLUESCHIST_BLOCK.get()));
        wallBlock((UBCWallBlocks) BlueschistBlocks.BLUESCHIST_COBBLE_WALL.get(), blockTexture(BlueschistBlocks.BLUESCHIST_COBBLE_BLOCK.get()));
        wallBlock((UBCWallBlocks) BlueschistBlocks.BLUESCHIST_BRICK_WALL.get(), blockTexture(BlueschistBlocks.BLUESCHIST_BRICK_BLOCK.get()));

        wallBlock((UBCWallBlocks) GreenschistBlocks.GREENSCHIST_BLOCK_WALL.get(), blockTexture(GreenschistBlocks.GREENSCHIST_BLOCK.get()));
        wallBlock((UBCWallBlocks) GreenschistBlocks.GREENSCHIST_COBBLE_WALL.get(), blockTexture(GreenschistBlocks.GREENSCHIST_COBBLE_BLOCK.get()));
        wallBlock((UBCWallBlocks) GreenschistBlocks.GREENSCHIST_BRICK_WALL.get(), blockTexture(GreenschistBlocks.GREENSCHIST_BRICK_BLOCK.get()));

        wallBlock((UBCWallBlocks) ChalkBlocks.CHALK_BLOCK_WALL.get(), blockTexture(ChalkBlocks.CHALK_BLOCK.get()));

        wallBlock((UBCWallBlocks) ShaleBlocks.SHALE_BLOCK_WALL.get(), blockTexture(ShaleBlocks.SHALE_BLOCK.get()));

        wallBlock((UBCWallBlocks) ChertBlocks.CHERT_BLOCK_WALL.get(), blockTexture(ChertBlocks.CHERT_BLOCK.get()));

        wallBlock((UBCWallBlocks) LigniteBlocks.LIGNITE_BLOCK_WALL.get(), blockTexture(LigniteBlocks.LIGNITE_BLOCK.get()));

        wallBlock((UBCWallBlocks) DolomiteBlocks.DOLOMITE_BLOCK_WALL.get(), blockTexture(DolomiteBlocks.DOLOMITE_BLOCK.get()));

        wallBlock((UBCWallBlocks) EclogiteBlocks.ECLOGITE_BLOCK_WALL.get(), blockTexture(EclogiteBlocks.ECLOGITE_BLOCK.get()));

        wallBlock((UBCWallBlocks) GreywackeBlocks.GREYWACKE_BLOCK_WALL.get(), blockTexture(GreywackeBlocks.GREYWACKE_BLOCK.get()));

        wallBlock((UBCWallBlocks) KomatiiteBlocks.KOMATIITE_BLOCK_WALL.get(), blockTexture(KomatiiteBlocks.KOMATIITE_BLOCK.get()));
        wallBlock((UBCWallBlocks) KomatiiteBlocks.KOMATIITE_COBBLE_WALL.get(), blockTexture(KomatiiteBlocks.KOMATIITE_COBBLE_BLOCK.get()));
        wallBlock((UBCWallBlocks) KomatiiteBlocks.KOMATIITE_BRICK_WALL.get(), blockTexture(KomatiiteBlocks.KOMATIITE_BRICK_BLOCK.get()));

        wallBlock((UBCWallBlocks) DaciteBlocks.DACITE_BLOCK_WALL.get(), blockTexture(DaciteBlocks.DACITE_BLOCK.get()));
        wallBlock((UBCWallBlocks) DaciteBlocks.DACITE_COBBLE_WALL.get(), blockTexture(DaciteBlocks.DACITE_COBBLE_BLOCK.get()));
        wallBlock((UBCWallBlocks) DaciteBlocks.DACITE_BRICK_WALL.get(), blockTexture(DaciteBlocks.DACITE_BRICK_BLOCK.get()));

        wallBlock((UBCWallBlocks) BlackGraniteBlocks.BLACK_GRANITE_BLOCK_WALL.get(), blockTexture(BlackGraniteBlocks.BLACK_GRANITE_BLOCK.get()));
        wallBlock((UBCWallBlocks) BlackGraniteBlocks.BLACK_GRANITE_COBBLE_WALL.get(), blockTexture(BlackGraniteBlocks.BLACK_GRANITE_COBBLE_BLOCK.get()));
        wallBlock((UBCWallBlocks) BlackGraniteBlocks.BLACK_GRANITE_BRICK_WALL.get(), blockTexture(BlackGraniteBlocks.BLACK_GRANITE_BRICK_BLOCK.get()));

        wallBlock((UBCWallBlocks) GabbroBlocks.GABBRO_BLOCK_WALL.get(), blockTexture(GabbroBlocks.GABBRO_BLOCK.get()));
        wallBlock((UBCWallBlocks) GabbroBlocks.GABBRO_COBBLE_WALL.get(), blockTexture(GabbroBlocks.GABBRO_COBBLE_BLOCK.get()));
        wallBlock((UBCWallBlocks) GabbroBlocks.GABBRO_BRICK_WALL.get(), blockTexture(GabbroBlocks.GABBRO_BRICK_BLOCK.get()));

        wallBlock((UBCWallBlocks) GneissBlocks.GNEISS_BLOCK_WALL.get(), blockTexture(GneissBlocks.GNEISS_BLOCK.get()));
        wallBlock((UBCWallBlocks) GneissBlocks.GNEISS_COBBLE_WALL.get(), blockTexture(GneissBlocks.GNEISS_COBBLE_BLOCK.get()));
        wallBlock((UBCWallBlocks) GneissBlocks.GNEISS_BRICK_WALL.get(), blockTexture(GneissBlocks.GNEISS_BRICK_BLOCK.get()));

    }

    // ------------------------------------------------------------
    // Helper methods
    // ------------------------------------------------------------

    private void blockWithItem(DeferredBlock<Block> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void wallItem(DeferredBlock<Block> wallBlock, Block baseBlock) {
        models().withExistingParent("item/" + wallBlock.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", blockTexture(baseBlock));
    }

    private void blockItem(DeferredBlock<Block> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("undergroundbiomesconstructsreworked:block/" + deferredBlock.getId().getPath()));
    }

    private void buttonWithItem(UBCButtonsBlocks buttonBlock, String name, String baseBlockTextureName) {
        models().withExistingParent(name, mcLoc("block/button"))
                .texture("texture", modLoc("block/" + baseBlockTextureName));

        models().withExistingParent(name + "_inventory", mcLoc("block/button_inventory"))
                .texture("texture", modLoc("block/" + baseBlockTextureName));

        models().withExistingParent(name + "_pressed", mcLoc("block/button_pressed"))
                .texture("texture", modLoc("block/" + baseBlockTextureName));

        models().withExistingParent("item/" + name, modLoc("block/" + name + "_inventory"));

        getVariantBuilder(buttonBlock).forAllStates(state -> {
            boolean powered = state.getValue(UBCButtonsBlocks.POWERED);
            Direction facing = state.getValue(UBCButtonsBlocks.FACING);
            AttachFace face = state.getValue(UBCButtonsBlocks.FACE);

            int y = switch (facing) {
                case SOUTH -> 180;
                case WEST -> 270;
                case EAST -> 90;
                default -> 0;
            };

            int x = (face == AttachFace.CEILING) ? 180 : 0;

            ModelFile model = models().getExistingFile(
                    modLoc("block/" + name + (powered ? "_pressed" : ""))
            );

            return ConfiguredModel.builder()
                    .modelFile(model)
                    .rotationX(x)
                    .rotationY(y)
                    .build();
        });
    }
}