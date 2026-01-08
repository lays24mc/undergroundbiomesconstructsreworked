package com.lays24mc.undergroundbiomesconstructsreworked.datagen;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.QuartziteBlocks;
import com.lays24mc.undergroundbiomesconstructsreworked.block.RedGraniteBlocks;
import com.lays24mc.undergroundbiomesconstructsreworked.block.RhyoliteBlocks;
import com.lays24mc.undergroundbiomesconstructsreworked.block.SoapstoneBlocks;
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
        // ================================
        // SOAPSTONE
        // ================================
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

        blockWithItem(RhyoliteBlocks.RHYOLITE_BLOCK);
        blockWithItem(RhyoliteBlocks.RHYOLITE_COBBLE_BLOCK);
        blockWithItem(RhyoliteBlocks.RHYOLITE_BRICK_BLOCK);

        blockWithItem(RedGraniteBlocks.RED_GRANITE_BLOCK);
        blockWithItem(RedGraniteBlocks.RED_GRANITE_COBBLE_BLOCK);
        blockWithItem(RedGraniteBlocks.RED_GRANITE_BRICK_BLOCK);

        blockWithItem(QuartziteBlocks.QUARTZITE_BLOCK);
        blockWithItem(QuartziteBlocks.QUARTZITE_COBBLE_BLOCK);
        blockWithItem(QuartziteBlocks.QUARTZITE_BRICK_BLOCK);

        // --------------------------
        // Register buttons
        // --------------------------
        buttonWithItem((UBCButtonsBlocks) SoapstoneBlocks.SOAPSTONE_STONE_BUTTON.get(), "soapstone_stone_button", "soapstone_block");
        buttonWithItem((UBCButtonsBlocks) RhyoliteBlocks.RHYOLITE_STONE_BUTTON.get(), "rhyolite_stone_button", "rhyolite_block");
        buttonWithItem((UBCButtonsBlocks) RedGraniteBlocks.RED_GRANITE_STONE_BUTTON.get(), "red_granite_stone_button", "red_granite_block");
        buttonWithItem((UBCButtonsBlocks) QuartziteBlocks.QUARTZITE_STONE_BUTTON.get(), "quartzite_stone_button", "quartzite_block");

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