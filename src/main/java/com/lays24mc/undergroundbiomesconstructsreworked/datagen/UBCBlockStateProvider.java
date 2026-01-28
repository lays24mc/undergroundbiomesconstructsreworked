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
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import org.apache.logging.log4j.core.pattern.AbstractStyleNameConverter;

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

        blockWithItem(BluechistBlocks.BLUECHIST_BLOCK);
        blockWithItem(BluechistBlocks.BLUECHIST_COBBLE_BLOCK);
        blockWithItem(BluechistBlocks.BLUECHIST_BRICK_BLOCK);
        blockWithItem(BluechistBlocks.BLUECHIST_COAL_ORE);
        blockWithItem(BluechistBlocks.BLUECHIST_COPPER_ORE);
        blockWithItem(BluechistBlocks.BLUECHIST_IRON_ORE);
        blockWithItem(BluechistBlocks.BLUECHIST_GOLD_ORE);
        blockWithItem(BluechistBlocks.BLUECHIST_REDSTONE_ORE);
        blockWithItem(BluechistBlocks.BLUECHIST_LAPIS_ORE);

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
        buttonWithItem((UBCButtonsBlocks) BluechistBlocks.BLUECHIST_STONE_BUTTON.get(), "bluechist_stone_button", "bluechist_block");
        buttonWithItem((UBCButtonsBlocks) GreenschistBlocks.GREENSCHIST_STONE_BUTTON.get(), "greenschist_stone_button", "greenschist_block");
        buttonWithItem((UBCButtonsBlocks) ChalkBlocks.CHALK_STONE_BUTTON.get(), "chalk_stone_button", "chalk_block");
        buttonWithItem((UBCButtonsBlocks) ShaleBlocks.SHALE_STONE_BUTTON.get(), "shale_stone_button", "shale_block");


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

        blockItem(BluechistBlocks.BLUECHIST_STAIRS);
        blockItem(BluechistBlocks.BLUECHIST_COBBLE_STAIRS);
        blockItem(BluechistBlocks.BLUECHIST_BRICK_STAIRS);

        blockItem(BluechistBlocks.BLUECHIST_BLOCK_SLAB);
        blockItem(BluechistBlocks.BLUECHIST_COBBLE_SLAB);
        blockItem(BluechistBlocks.BLUECHIST_BRICK_SLAB);

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

        wallItem(BluechistBlocks.BLUECHIST_BLOCK_WALL, BluechistBlocks.BLUECHIST_BLOCK.get());
        wallItem(BluechistBlocks.BLUECHIST_COBBLE_WALL, BluechistBlocks.BLUECHIST_COBBLE_BLOCK.get());
        wallItem(BluechistBlocks.BLUECHIST_BRICK_WALL, BluechistBlocks.BLUECHIST_BRICK_BLOCK.get());

        wallItem(GreenschistBlocks.GREENSCHIST_BLOCK_WALL, GreenschistBlocks.GREENSCHIST_BLOCK.get());
        wallItem(GreenschistBlocks.GREENSCHIST_COBBLE_WALL, GreenschistBlocks.GREENSCHIST_COBBLE_BLOCK.get());
        wallItem(GreenschistBlocks.GREENSCHIST_BRICK_WALL, GreenschistBlocks.GREENSCHIST_BRICK_BLOCK.get());

        wallItem(ChalkBlocks.CHALK_BLOCK_WALL, ChalkBlocks.CHALK_BLOCK.get());

        wallItem(ShaleBlocks.SHALE_BLOCK_WALL, ShaleBlocks.SHALE_BLOCK.get());


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

        stairsBlock((UBCStairsBlocks) BluechistBlocks.BLUECHIST_STAIRS.get(), blockTexture(BluechistBlocks.BLUECHIST_BLOCK.get()));
        stairsBlock((UBCStairsBlocks) BluechistBlocks.BLUECHIST_COBBLE_STAIRS.get(), blockTexture(BluechistBlocks.BLUECHIST_COBBLE_BLOCK.get()));
        stairsBlock((UBCStairsBlocks) BluechistBlocks.BLUECHIST_BRICK_STAIRS.get(), blockTexture(BluechistBlocks.BLUECHIST_BRICK_BLOCK.get()));

        stairsBlock((UBCStairsBlocks) GreenschistBlocks.GREENSCHIST_STAIRS.get(), blockTexture(GreenschistBlocks.GREENSCHIST_BLOCK.get()));
        stairsBlock((UBCStairsBlocks) GreenschistBlocks.GREENSCHIST_COBBLE_STAIRS.get(), blockTexture(GreenschistBlocks.GREENSCHIST_COBBLE_BLOCK.get()));
        stairsBlock((UBCStairsBlocks) GreenschistBlocks.GREENSCHIST_BRICK_STAIRS.get(), blockTexture(GreenschistBlocks.GREENSCHIST_BRICK_BLOCK.get()));

        stairsBlock((UBCStairsBlocks) ChalkBlocks.CHALK_STAIRS.get(), blockTexture(ChalkBlocks.CHALK_BLOCK.get()));

        stairsBlock((UBCStairsBlocks) ShaleBlocks.SHALE_STAIRS.get(), blockTexture(ShaleBlocks.SHALE_BLOCK.get()));

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

        slabBlock((UBCSlabBlocks) BluechistBlocks.BLUECHIST_BLOCK_SLAB.get(), blockTexture(BluechistBlocks.BLUECHIST_BLOCK.get()), blockTexture(BluechistBlocks.BLUECHIST_BLOCK.get()));
        slabBlock((UBCSlabBlocks) BluechistBlocks.BLUECHIST_COBBLE_SLAB.get(), blockTexture(BluechistBlocks.BLUECHIST_COBBLE_BLOCK.get()), blockTexture(BluechistBlocks.BLUECHIST_COBBLE_BLOCK.get()));
        slabBlock((UBCSlabBlocks) BluechistBlocks.BLUECHIST_BRICK_SLAB.get(), blockTexture(BluechistBlocks.BLUECHIST_BRICK_BLOCK.get()), blockTexture(BluechistBlocks.BLUECHIST_BRICK_BLOCK.get()));

        slabBlock((UBCSlabBlocks) GreenschistBlocks.GREENSCHIST_BLOCK_SLAB.get(), blockTexture(GreenschistBlocks.GREENSCHIST_BLOCK.get()), blockTexture(GreenschistBlocks.GREENSCHIST_BLOCK.get()));
        slabBlock((UBCSlabBlocks) GreenschistBlocks.GREENSCHIST_COBBLE_SLAB.get(), blockTexture(GreenschistBlocks.GREENSCHIST_COBBLE_BLOCK.get()), blockTexture(GreenschistBlocks.GREENSCHIST_COBBLE_BLOCK.get()));
        slabBlock((UBCSlabBlocks) GreenschistBlocks.GREENSCHIST_BRICK_SLAB.get(), blockTexture(GreenschistBlocks.GREENSCHIST_BRICK_BLOCK.get()), blockTexture(GreenschistBlocks.GREENSCHIST_BRICK_BLOCK.get()));

        slabBlock((UBCSlabBlocks) ChalkBlocks.CHALK_BLOCK_SLAB.get(),blockTexture(ChalkBlocks.CHALK_BLOCK.get()), blockTexture(ChalkBlocks.CHALK_BLOCK.get()));

        slabBlock((UBCSlabBlocks) ShaleBlocks.SHALE_BLOCK_SLAB.get(), blockTexture(ShaleBlocks.SHALE_BLOCK.get()), blockTexture(ShaleBlocks.SHALE_BLOCK.get()));

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

        wallBlock((UBCWallBlocks) BluechistBlocks.BLUECHIST_BLOCK_WALL.get(), blockTexture(BluechistBlocks.BLUECHIST_BLOCK.get()));
        wallBlock((UBCWallBlocks) BluechistBlocks.BLUECHIST_COBBLE_WALL.get(), blockTexture(BluechistBlocks.BLUECHIST_COBBLE_BLOCK.get()));
        wallBlock((UBCWallBlocks) BluechistBlocks.BLUECHIST_BRICK_WALL.get(), blockTexture(BluechistBlocks.BLUECHIST_BRICK_BLOCK.get()));

        wallBlock((UBCWallBlocks) GreenschistBlocks.GREENSCHIST_BLOCK_WALL.get(), blockTexture(GreenschistBlocks.GREENSCHIST_BLOCK.get()));
        wallBlock((UBCWallBlocks) GreenschistBlocks.GREENSCHIST_COBBLE_WALL.get(), blockTexture(GreenschistBlocks.GREENSCHIST_COBBLE_BLOCK.get()));
        wallBlock((UBCWallBlocks) GreenschistBlocks.GREENSCHIST_BRICK_WALL.get(), blockTexture(GreenschistBlocks.GREENSCHIST_BRICK_BLOCK.get()));

        wallBlock((UBCWallBlocks) ChalkBlocks.CHALK_BLOCK_WALL.get(), blockTexture(ChalkBlocks.CHALK_BLOCK.get()));

        wallBlock((UBCWallBlocks) ShaleBlocks.SHALE_BLOCK_WALL.get(), blockTexture(ShaleBlocks.SHALE_BLOCK.get()));
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