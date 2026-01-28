package com.lays24mc.undergroundbiomesconstructsreworked.datagen;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.*;
import net.minecraft.client.Minecraft;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * Recipe provider for MoreWorldConstructs mod.
 * Handles generating crafting, smelting, blasting, stonecutting, and shaped recipes
 * blocks.
 */

public class UBCRecipeBuilder extends RecipeProvider implements IConditionBuilder {
    public UBCRecipeBuilder(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        //====================================================
        // Soapstone
        //====================================================
        buildSoapstoneRecipes(recipeOutput);

        //====================================================
        // Rhyolite
        //====================================================
        buildRhyoliteRecipes(recipeOutput);

        //====================================================
        // RedGranite
        //====================================================
        buildRedGraniteRecipes(recipeOutput);

        //====================================================
        // Quartzite
        //====================================================
        buildQuartziteRecipes(recipeOutput);

        //====================================================
        // Migmatite
        //====================================================
        buildMigmatiteRecipes(recipeOutput);

        //====================================================
        // Marble
        //====================================================
        buildMarbleRecipes(recipeOutput);

        //====================================================
        // Siltstone
        //====================================================
        buildSiltstoneRecipes(recipeOutput);

        //====================================================
        // Blueschist
        //====================================================
        buildBluechistRecipes(recipeOutput);

        //====================================================
        // Greenschist
        //====================================================
        buildGreenschistRecipes(recipeOutput);

        //====================================================
        // Chalk
        //====================================================
        buildChalkRecipes(recipeOutput);
    }

    // ------------------------------------------------------------
    // SOAPSTONE RECIPES
    // ------------------------------------------------------------
    private void buildSoapstoneRecipes(RecipeOutput recipeOutput) {

        List<ItemLike> SOAPSTONE_SMELTABLES = List.of(SoapstoneBlocks.SOAPSTONE_COBBLE_BLOCK);
        List<ItemLike> SOAPSTONE_COAL_SMELTABLES = List.of(SoapstoneBlocks.SOAPSTONE_COAL_ORE);
        List<ItemLike> SOAPSTONE_COPPER_SMELTABLES = List.of(SoapstoneBlocks.SOAPSTONE_COPPER_ORE);
        List<ItemLike> SOAPSTONE_IRON_SMELTABLES = List.of(SoapstoneBlocks.SOAPSTONE_IRON_ORE);
        List<ItemLike> SOAPSTONE_GOLD_SMELTABLES = List.of(SoapstoneBlocks.SOAPSTONE_GOLD_ORE);
        List<ItemLike> SOAPSTONE_REDSTONE_SMELTABLES = List.of(SoapstoneBlocks.SOAPSTONE_REDSTONE_ORE);
        List<ItemLike> SOAPSTONE_LAPIS_SMELTABLES = List.of(SoapstoneBlocks.SOAPSTONE_LAPIS_ORE);

        // Soapstone Brick (4x)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SoapstoneBlocks.SOAPSTONE_BRICK_BLOCK.get(), 4).pattern("AA").pattern("AA").define('A', SoapstoneBlocks.SOAPSTONE_BLOCK.get()).unlockedBy("has_soapstone_block", has(SoapstoneBlocks.SOAPSTONE_BLOCK)).save(recipeOutput);

        // Stone Button
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SoapstoneBlocks.SOAPSTONE_STONE_BUTTON.get()).pattern("A").define('A', SoapstoneBlocks.SOAPSTONE_BLOCK.get()).unlockedBy("has_soapstone_block", has(SoapstoneBlocks.SOAPSTONE_BLOCK)).save(recipeOutput);

        // Smelting
        oreSmelting(recipeOutput, SOAPSTONE_SMELTABLES, RecipeCategory.MISC, SoapstoneBlocks.SOAPSTONE_BLOCK.get(), 0.25f, 200, "soapstone");
        oreSmelting(recipeOutput, SOAPSTONE_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 200, "soapstone");
        oreSmelting(recipeOutput, SOAPSTONE_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 200, "soapstone");
        oreSmelting(recipeOutput, SOAPSTONE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 200, "soapstone");
        oreSmelting(recipeOutput, SOAPSTONE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 200, "soapstone");
        oreSmelting(recipeOutput, SOAPSTONE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "soapstone");
        oreSmelting(recipeOutput, SOAPSTONE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "soapstone");

        // Blasting
        //oreBlasting(recipeOutput, BISMUTH_SMELTABLES, RecipeCategory.MISC, ModItems.BISMUTH.get(), 0.25f, 100, "bismuth");

        // Stairs, Slabs, Walls, Stonecutting
        stairBuilder(SoapstoneBlocks.SOAPSTONE_STAIRS.get(), Ingredient.of(SoapstoneBlocks.SOAPSTONE_BLOCK)).group("soapstone").unlockedBy("has_soapstone_block", has(SoapstoneBlocks.SOAPSTONE_BLOCK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SoapstoneBlocks.SOAPSTONE_BLOCK_SLAB.get(), SoapstoneBlocks.SOAPSTONE_BLOCK.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SoapstoneBlocks.SOAPSTONE_BLOCK_WALL.get(), SoapstoneBlocks.SOAPSTONE_BLOCK.get());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SoapstoneBlocks.SOAPSTONE_BLOCK_SLAB.get(), SoapstoneBlocks.SOAPSTONE_BLOCK.get(), 2);
    }

    // ------------------------------------------------------------
    // RED GRANITE RECIPES
    // ------------------------------------------------------------
    private void buildRedGraniteRecipes(RecipeOutput recipeOutput) {

        List<ItemLike> RED_GRANITE_SMELTABLES = List.of(RedGraniteBlocks.RED_GRANITE_COBBLE_BLOCK);
        List<ItemLike> RED_GRANITE_IRON_SMELTABLES = List.of(RedGraniteBlocks.RED_GRANITE_IRON_ORE);
        List<ItemLike> RED_GRANITE_GOLD_SMELTABLES = List.of(RedGraniteBlocks.RED_GRANITE_GOLD_ORE);
        List<ItemLike> RED_GRANITE_REDSTONE_SMELTABLES = List.of(RedGraniteBlocks.RED_GRANITE_REDSTONE_ORE);
        List<ItemLike> RED_GRANITE_LAPIS_SMELTABLES = List.of(RedGraniteBlocks.RED_GRANITE_LAPIS_ORE);
        List<ItemLike> RED_GRANITE_DIAMOND_SMELTABLES = List.of(RedGraniteBlocks.RED_GRANITE_DIAMOND_ORE);
        List<ItemLike> RED_GRANITE_EMERALD_SMELTABLES = List.of(RedGraniteBlocks.RED_GRANITE_EMERALD_ORE);

        // Red Granite Brick (4x)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RedGraniteBlocks.RED_GRANITE_BRICK_BLOCK.get(), 4).pattern("AA").pattern("AA").define('A', RedGraniteBlocks.RED_GRANITE_BLOCK.get()).unlockedBy("has_red_granite_block", has(RedGraniteBlocks.RED_GRANITE_BLOCK)).save(recipeOutput);

        // Stone Button
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RedGraniteBlocks.RED_GRANITE_STONE_BUTTON.get()).pattern("A").define('A', RedGraniteBlocks.RED_GRANITE_BLOCK.get()).unlockedBy("has_red_granite_block", has(RedGraniteBlocks.RED_GRANITE_BLOCK)).save(recipeOutput);

        // Smelting
        oreSmelting(recipeOutput, RED_GRANITE_SMELTABLES, RecipeCategory.MISC, RedGraniteBlocks.RED_GRANITE_BLOCK.get(), 0.25f, 200, "red_granite");
        oreSmelting(recipeOutput, RED_GRANITE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 200, "red_granite");
        oreSmelting(recipeOutput, RED_GRANITE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 200, "red_granite");
        oreSmelting(recipeOutput, RED_GRANITE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "red_granite");
        oreSmelting(recipeOutput, RED_GRANITE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "red_granite");
        oreSmelting(recipeOutput, RED_GRANITE_DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 0.25f, 200, "red_granite");
        oreSmelting(recipeOutput, RED_GRANITE_EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD, 0.25f, 200, "red_granite");


        // Stairs, Slabs, Walls, Stonecutting
        stairBuilder(RedGraniteBlocks.RED_GRANITE_STAIRS.get(), Ingredient.of(RedGraniteBlocks.RED_GRANITE_BLOCK)).group("red_granite").unlockedBy("has_red_granite_block", has(RedGraniteBlocks.RED_GRANITE_BLOCK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, RedGraniteBlocks.RED_GRANITE_BLOCK_SLAB.get(), RedGraniteBlocks.RED_GRANITE_BLOCK.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, RedGraniteBlocks.RED_GRANITE_BLOCK_WALL.get(), RedGraniteBlocks.RED_GRANITE_BLOCK.get());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, RedGraniteBlocks.RED_GRANITE_BLOCK_SLAB.get(), RedGraniteBlocks.RED_GRANITE_BLOCK.get(), 2);
    }

    // ------------------------------------------------------------
    // RHYOLITE RECIPES
    // ------------------------------------------------------------
    private void buildRhyoliteRecipes(RecipeOutput recipeOutput) {

        List<ItemLike> RHYOLITE_SMELTABLES = List.of(RhyoliteBlocks.RHYOLITE_COBBLE_BLOCK);
        List<ItemLike> RHYOLITE_COAL_SMELTABLES = List.of(RhyoliteBlocks.RHYOLITE_COAL_ORE);
        List<ItemLike> RHYOLITE_COPPER_SMELTABLES = List.of(RhyoliteBlocks.RHYOLITE_COPPER_ORE);
        List<ItemLike> RHYOLITE_IRON_SMELTABLES = List.of(RhyoliteBlocks.RHYOLITE_IRON_ORE);
        List<ItemLike> RHYOLITE_GOLD_SMELTABLES = List.of(RhyoliteBlocks.RHYOLITE_GOLD_ORE);
        List<ItemLike> RHYOLITE_REDSTONE_SMELTABLES = List.of(RhyoliteBlocks.RHYOLITE_REDSTONE_ORE);
        List<ItemLike> RHYOLITE_LAPIS_SMELTABLES = List.of(RhyoliteBlocks.RHYOLITE_LAPIS_ORE);

        // Soapstone Brick (4x)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RhyoliteBlocks.RHYOLITE_BRICK_BLOCK.get(), 4).pattern("AA").pattern("AA").define('A', RhyoliteBlocks.RHYOLITE_BLOCK.get()).unlockedBy("has_rhyolite_block", has(RhyoliteBlocks.RHYOLITE_BLOCK)).save(recipeOutput);

        // Stone Button
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RhyoliteBlocks.RHYOLITE_STONE_BUTTON.get()).pattern("A").define('A', RhyoliteBlocks.RHYOLITE_BLOCK.get()).unlockedBy("has_rhyolite_block", has(RhyoliteBlocks.RHYOLITE_BLOCK)).save(recipeOutput);

        // Smelting
        oreSmelting(recipeOutput, RHYOLITE_SMELTABLES, RecipeCategory.MISC, RhyoliteBlocks.RHYOLITE_BLOCK.get(), 0.25f, 200, "rhyolite");
        oreSmelting(recipeOutput, RHYOLITE_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 200, "rhyolite");
        oreSmelting(recipeOutput, RHYOLITE_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 200, "rhyolite");
        oreSmelting(recipeOutput, RHYOLITE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 200, "rhyolite");
        oreSmelting(recipeOutput, RHYOLITE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 200, "rhyolite");
        oreSmelting(recipeOutput, RHYOLITE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "rhyolite");
        oreSmelting(recipeOutput, RHYOLITE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "rhyolite");

        // Stairs, Slabs, Walls, Stonecutting
        stairBuilder(RhyoliteBlocks.RHYOLITE_STAIRS.get(), Ingredient.of(RhyoliteBlocks.RHYOLITE_BLOCK)).group("rhyolite").unlockedBy("has_rhyolite_block", has(RhyoliteBlocks.RHYOLITE_BLOCK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, RhyoliteBlocks.RHYOLITE_BLOCK_SLAB.get(), RhyoliteBlocks.RHYOLITE_BLOCK.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, RhyoliteBlocks.RHYOLITE_BLOCK_WALL.get(), RhyoliteBlocks.RHYOLITE_BLOCK.get());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, RhyoliteBlocks.RHYOLITE_BLOCK_SLAB.get(), RhyoliteBlocks.RHYOLITE_BLOCK.get(), 2);
    }

    // ------------------------------------------------------------
    // QUARTZITE RECIPES
    // ------------------------------------------------------------
    private void buildQuartziteRecipes(RecipeOutput recipeOutput) {

        List<ItemLike> QUARTZITE_SMELTABLES = List.of(QuartziteBlocks.QUARTZITE_COBBLE_BLOCK);
        List<ItemLike> QUARTZITE_IRON_SMELTABLES = List.of(QuartziteBlocks.QUARTZITE_IRON_ORE);
        List<ItemLike> QUARTZITE_GOLD_SMELTABLES = List.of(QuartziteBlocks.QUARTZITE_GOLD_ORE);
        List<ItemLike> QUARTZITE_REDSTONE_SMELTABLES = List.of(QuartziteBlocks.QUARTZITE_REDSTONE_ORE);
        List<ItemLike> QUARTZITE_LAPIS_SMELTABLES = List.of(QuartziteBlocks.QUARTZITE_LAPIS_ORE);
        List<ItemLike> QUARTZITE_DIAMOND_SMELTABLES = List.of(QuartziteBlocks.QUARTZITE_DIAMOND_ORE);
        List<ItemLike> QUARTZITE_EMERALD_SMELTABLES = List.of(QuartziteBlocks.QUARTZITE_EMERALD_ORE);

        // Red Granite Brick (4x)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, QuartziteBlocks.QUARTZITE_BRICK_BLOCK.get(), 4).pattern("AA").pattern("AA").define('A', QuartziteBlocks.QUARTZITE_BLOCK.get()).unlockedBy("has_quartzite_block", has(QuartziteBlocks.QUARTZITE_BLOCK)).save(recipeOutput);

        // Stone Button
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, QuartziteBlocks.QUARTZITE_STONE_BUTTON.get()).pattern("A").define('A', QuartziteBlocks.QUARTZITE_BLOCK.get()).unlockedBy("has_quartzite_block", has(QuartziteBlocks.QUARTZITE_BLOCK)).save(recipeOutput);

        // Smelting
        oreSmelting(recipeOutput, QUARTZITE_SMELTABLES, RecipeCategory.MISC, QuartziteBlocks.QUARTZITE_BLOCK.get(), 0.25f, 200, "quartzite");
        oreSmelting(recipeOutput, QUARTZITE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 200, "quartzite");
        oreSmelting(recipeOutput, QUARTZITE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 200, "quartzite");
        oreSmelting(recipeOutput, QUARTZITE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "quartzite");
        oreSmelting(recipeOutput, QUARTZITE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "quartzite");
        oreSmelting(recipeOutput, QUARTZITE_DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 0.25f, 200, "quartzite");
        oreSmelting(recipeOutput, QUARTZITE_EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD, 0.25f, 200, "quartzite");


        // Stairs, Slabs, Walls, Stonecutting
        stairBuilder(QuartziteBlocks.QUARTZITE_STAIRS.get(), Ingredient.of(QuartziteBlocks.QUARTZITE_BLOCK)).group("quartzite").unlockedBy("has_quartzite_block", has(QuartziteBlocks.QUARTZITE_BLOCK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, QuartziteBlocks.QUARTZITE_BLOCK_SLAB.get(), QuartziteBlocks.QUARTZITE_BLOCK.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, QuartziteBlocks.QUARTZITE_BLOCK_WALL.get(), QuartziteBlocks.QUARTZITE_BLOCK.get());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, QuartziteBlocks.QUARTZITE_BLOCK_SLAB.get(), QuartziteBlocks.QUARTZITE_BLOCK.get(), 2);

    }

    // ------------------------------------------------------------
    // MIGMATITE RECIPES
    // ------------------------------------------------------------
    private void buildMigmatiteRecipes(RecipeOutput recipeOutput) {

        List<ItemLike> MIGMATITE_SMELTABLES = List.of(MigmatiteBlocks.MIGMATITE_COBBLE_BLOCK);
        List<ItemLike> MIGMATITE_IRON_SMELTABLES = List.of(MigmatiteBlocks.MIGMATITE_IRON_ORE);
        List<ItemLike> MIGMATITE_GOLD_SMELTABLES = List.of(MigmatiteBlocks.MIGMATITE_GOLD_ORE);
        List<ItemLike> MIGMATITE_REDSTONE_SMELTABLES = List.of(MigmatiteBlocks.MIGMATITE_REDSTONE_ORE);
        List<ItemLike> MIGMATITE_LAPIS_SMELTABLES = List.of(MigmatiteBlocks.MIGMATITE_LAPIS_ORE);
        List<ItemLike> MIGMATITE_DIAMOND_SMELTABLES = List.of(MigmatiteBlocks.MIGMATITE_DIAMOND_ORE);
        List<ItemLike> MIGMATITE_EMERALD_SMELTABLES = List.of(MigmatiteBlocks.MIGMATITE_EMERALD_ORE);

        // Red Granite Brick (4x)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MigmatiteBlocks.MIGMATITE_BRICK_BLOCK.get(), 4).pattern("AA").pattern("AA").define('A', MigmatiteBlocks.MIGMATITE_BLOCK.get()).unlockedBy("has_migmatite_block", has(MigmatiteBlocks.MIGMATITE_BLOCK)).save(recipeOutput);

        // Stone Button
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MigmatiteBlocks.MIGMATITE_STONE_BUTTON.get()).pattern("A").define('A', MigmatiteBlocks.MIGMATITE_BLOCK.get()).unlockedBy("has_migmatite_block", has(MigmatiteBlocks.MIGMATITE_BLOCK)).save(recipeOutput);

        // Smelting
        oreSmelting(recipeOutput, MIGMATITE_SMELTABLES, RecipeCategory.MISC, MigmatiteBlocks.MIGMATITE_BLOCK.get(), 0.25f, 200, "migmatite");
        oreSmelting(recipeOutput, MIGMATITE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 200, "migmatite");
        oreSmelting(recipeOutput, MIGMATITE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 200, "migmatite");
        oreSmelting(recipeOutput, MIGMATITE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "migmatite");
        oreSmelting(recipeOutput, MIGMATITE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "migmatite");
        oreSmelting(recipeOutput, MIGMATITE_DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 0.25f, 200, "migmatite");
        oreSmelting(recipeOutput, MIGMATITE_EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD, 0.25f, 200, "migmatite");


        // Stairs, Slabs, Walls, Stonecutting
        stairBuilder(MigmatiteBlocks.MIGMATITE_STAIRS.get(), Ingredient.of(MigmatiteBlocks.MIGMATITE_BLOCK)).group("migmatite").unlockedBy("has_migmatite_block", has(MigmatiteBlocks.MIGMATITE_BLOCK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, MigmatiteBlocks.MIGMATITE_BLOCK_SLAB.get(), MigmatiteBlocks.MIGMATITE_BLOCK.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, MigmatiteBlocks.MIGMATITE_BLOCK_WALL.get(), MigmatiteBlocks.MIGMATITE_BLOCK.get());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, MigmatiteBlocks.MIGMATITE_BLOCK_SLAB.get(), MigmatiteBlocks.MIGMATITE_BLOCK.get(), 2);
    }

    // ------------------------------------------------------------
    // MARBLE RECIPES
    // ------------------------------------------------------------
    private void buildMarbleRecipes(RecipeOutput recipeOutput) {

        List<ItemLike> MARBLE_SMELTABLES = List.of(MarbleBlocks.MARBLE_COBBLE_BLOCK);
        List<ItemLike> MARBLE_IRON_SMELTABLES = List.of(MarbleBlocks.MARBLE_IRON_ORE);
        List<ItemLike> MARBLE_GOLD_SMELTABLES = List.of(MarbleBlocks.MARBLE_GOLD_ORE);
        List<ItemLike> MARBLE_REDSTONE_SMELTABLES = List.of(MarbleBlocks.MARBLE_REDSTONE_ORE);
        List<ItemLike> MARBLE_LAPIS_SMELTABLES = List.of(MarbleBlocks.MARBLE_LAPIS_ORE);
        List<ItemLike> MARBLE_DIAMOND_SMELTABLES = List.of(MarbleBlocks.MARBLE_DIAMOND_ORE);
        List<ItemLike> MARBLE_EMERALD_SMELTABLES = List.of(MarbleBlocks.MARBLE_EMERALD_ORE);

        // Red Granite Brick (4x)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MarbleBlocks.MARBLE_BRICK_BLOCK.get(), 4).pattern("AA").pattern("AA").define('A', MarbleBlocks.MARBLE_BLOCK.get()).unlockedBy("has_marble_block", has(MarbleBlocks.MARBLE_BLOCK)).save(recipeOutput);

        // Stone Button
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MarbleBlocks.MARBLE_STONE_BUTTON.get()).pattern("A").define('A', MarbleBlocks.MARBLE_BLOCK.get()).unlockedBy("has_marble_block", has(MarbleBlocks.MARBLE_BLOCK)).save(recipeOutput);

        // Smelting
        oreSmelting(recipeOutput, MARBLE_SMELTABLES, RecipeCategory.MISC, MarbleBlocks.MARBLE_BLOCK.get(), 0.25f, 200, "marble");
        oreSmelting(recipeOutput, MARBLE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 200, "marble");
        oreSmelting(recipeOutput, MARBLE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 200, "marble");
        oreSmelting(recipeOutput, MARBLE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "marble");
        oreSmelting(recipeOutput, MARBLE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "marble");
        oreSmelting(recipeOutput, MARBLE_DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 0.25f, 200, "marble");
        oreSmelting(recipeOutput, MARBLE_EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD, 0.25f, 200, "marble");


        // Stairs, Slabs, Walls, Stonecutting
        stairBuilder(MarbleBlocks.MARBLE_STAIRS.get(), Ingredient.of(MarbleBlocks.MARBLE_BLOCK)).group("marble").unlockedBy("has_marble_block", has(MarbleBlocks.MARBLE_BLOCK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, MarbleBlocks.MARBLE_BLOCK_SLAB.get(), MarbleBlocks.MARBLE_BLOCK.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, MarbleBlocks.MARBLE_BLOCK_WALL.get(), MarbleBlocks.MARBLE_BLOCK.get());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, MarbleBlocks.MARBLE_BLOCK_SLAB.get(), MarbleBlocks.MARBLE_BLOCK.get(), 2);;
    }

    // ------------------------------------------------------------
    // LIMESTONE RECIPES
    // ------------------------------------------------------------
    private void buildLimestoneRecipes(RecipeOutput recipeOutput) {

        List<ItemLike> LIMESTONE_COAL_SMELTABLES = List.of(LimestoneBlocks.LIMESTONE_COAL_ORE);
        List<ItemLike> LIMESTONE_COPPER_SMELTABLES = List.of(LimestoneBlocks.LIMESTONE_COPPER_ORE);
        List<ItemLike> LIMESTONE_IRON_SMELTABLES = List.of(LimestoneBlocks.LIMESTONE_IRON_ORE);
        List<ItemLike> LIMESTONE_GOLD_SMELTABLES = List.of(LimestoneBlocks.LIMESTONE_GOLD_ORE);
        List<ItemLike> LIMESTONE_REDSTONE_SMELTABLES = List.of(LimestoneBlocks.LIMESTONE_REDSTONE_ORE);
        List<ItemLike> LIMESTONE_LAPIS_SMELTABLES = List.of(LimestoneBlocks.LIMESTONE_LAPIS_ORE);

        // Stone Button
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, LimestoneBlocks.LIMESTONE_STONE_BUTTON.get()).pattern("A").define('A', LimestoneBlocks.LIMESTONE_BLOCK.get()).unlockedBy("has_limestone_block", has(LimestoneBlocks.LIMESTONE_BLOCK)).save(recipeOutput);

        // Smelting;
        oreSmelting(recipeOutput, LIMESTONE_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 200, "limestone");
        oreSmelting(recipeOutput, LIMESTONE_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 200, "limestone");
        oreSmelting(recipeOutput, LIMESTONE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 200, "limestone");
        oreSmelting(recipeOutput, LIMESTONE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 200, "limestone");
        oreSmelting(recipeOutput, LIMESTONE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "limestone");
        oreSmelting(recipeOutput, LIMESTONE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "limestone");

        // Blasting
        //        oreBlasting(recipeOutput, BISMUTH_SMELTABLES, RecipeCategory.MISC, ModItems.BISMUTH.get(), 0.25f, 100, "bismuth");

        // Stairs, Slabs, Walls, Stonecutting
        stairBuilder(LimestoneBlocks.LIMESTONE_STAIRS.get(), Ingredient.of(LimestoneBlocks.LIMESTONE_BLOCK)).group("limestone").unlockedBy("has_limestone_block", has(LimestoneBlocks.LIMESTONE_BLOCK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, LimestoneBlocks.LIMESTONE_BLOCK_SLAB.get(), LimestoneBlocks.LIMESTONE_BLOCK.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, LimestoneBlocks.LIMESTONE_BLOCK_WALL.get(), LimestoneBlocks.LIMESTONE_BLOCK.get());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, LimestoneBlocks.LIMESTONE_BLOCK_SLAB.get(), LimestoneBlocks.LIMESTONE_BLOCK.get(), 2);
    }

    // ------------------------------------------------------------
    // SILTSTONE RECIPES
    // ------------------------------------------------------------
    private void buildSiltstoneRecipes(RecipeOutput recipeOutput) {

        List<ItemLike> SILTSTONE_COAL_SMELTABLES = List.of(SiltstoneBlocks.SILTSTONE_COAL_ORE);
        List<ItemLike> SILTSTONE_COPPER_SMELTABLES = List.of(SiltstoneBlocks.SILTSTONE_COPPER_ORE);
        List<ItemLike> SILTSTONE_IRON_SMELTABLES = List.of(SiltstoneBlocks.SILTSTONE_IRON_ORE);
        List<ItemLike> SILTSTONE_GOLD_SMELTABLES = List.of(SiltstoneBlocks.SILTSTONE_GOLD_ORE);
        List<ItemLike> SILTSTONE_REDSTONE_SMELTABLES = List.of(SiltstoneBlocks.SILTSTONE_REDSTONE_ORE);
        List<ItemLike> SILTSTONE_LAPIS_SMELTABLES = List.of(SiltstoneBlocks.SILTSTONE_LAPIS_ORE);

        // Stone Button
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SiltstoneBlocks.SILTSTONE_STONE_BUTTON.get()).pattern("A").define('A', SiltstoneBlocks.SILTSTONE_BLOCK.get()).unlockedBy("has_siltstone_block", has(SiltstoneBlocks.SILTSTONE_BLOCK)).save(recipeOutput);

        // Smelting;
        oreSmelting(recipeOutput, SILTSTONE_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 200, "siltstone");
        oreSmelting(recipeOutput, SILTSTONE_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 200, "siltstone");
        oreSmelting(recipeOutput, SILTSTONE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 200, "siltstone");
        oreSmelting(recipeOutput, SILTSTONE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 200, "siltstone");
        oreSmelting(recipeOutput, SILTSTONE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "siltstone");
        oreSmelting(recipeOutput, SILTSTONE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "siltstone");

        // Blasting
        //        oreBlasting(recipeOutput, BISMUTH_SMELTABLES, RecipeCategory.MISC, ModItems.BISMUTH.get(), 0.25f, 100, "bismuth");

        // Stairs, Slabs, Walls, Stonecutting
        stairBuilder(SiltstoneBlocks.SILTSTONE_STAIRS.get(), Ingredient.of(SiltstoneBlocks.SILTSTONE_BLOCK)).group("siltstone").unlockedBy("has_siltstone_block", has(SiltstoneBlocks.SILTSTONE_BLOCK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SiltstoneBlocks.SILTSTONE_BLOCK_SLAB.get(), SiltstoneBlocks.SILTSTONE_BLOCK.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SiltstoneBlocks.SILTSTONE_BLOCK_WALL.get(), SiltstoneBlocks.SILTSTONE_BLOCK.get());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SiltstoneBlocks.SILTSTONE_BLOCK_SLAB.get(), SiltstoneBlocks.SILTSTONE_BLOCK.get(), 2);
    }

    // ------------------------------------------------------------
    // BLUECHIST RECIPES
    // ------------------------------------------------------------
    private void buildBluechistRecipes(RecipeOutput recipeOutput) {

        List<ItemLike> BLUECHIST_SMELTABLES = List.of(BluechistBlocks.BLUECHIST_COBBLE_BLOCK);
        List<ItemLike> BLUECHIST_COAL_SMELTABLES = List.of(BluechistBlocks.BLUECHIST_COAL_ORE);
        List<ItemLike> BLUECHIST_COPPER_SMELTABLES = List.of(BluechistBlocks.BLUECHIST_COPPER_ORE);
        List<ItemLike> BLUECHIST_IRON_SMELTABLES = List.of(BluechistBlocks.BLUECHIST_IRON_ORE);
        List<ItemLike> BLUECHIST_GOLD_SMELTABLES = List.of(BluechistBlocks.BLUECHIST_GOLD_ORE);
        List<ItemLike> BLUECHIST_REDSTONE_SMELTABLES = List.of(BluechistBlocks.BLUECHIST_REDSTONE_ORE);
        List<ItemLike> BLUECHIST_LAPIS_SMELTABLES = List.of(BluechistBlocks.BLUECHIST_LAPIS_ORE);

        // Bluechist Brick (4x)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BluechistBlocks.BLUECHIST_BRICK_BLOCK.get(), 4).pattern("AA").pattern("AA").define('A', BluechistBlocks.BLUECHIST_BLOCK.get()).unlockedBy("has_bluechist_block", has(BluechistBlocks.BLUECHIST_BLOCK)).save(recipeOutput);

        // Stone Button
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BluechistBlocks.BLUECHIST_STONE_BUTTON.get()).pattern("A").define('A', BluechistBlocks.BLUECHIST_BLOCK.get()).unlockedBy("has_bluechist_block", has(BluechistBlocks.BLUECHIST_BLOCK)).save(recipeOutput);

        // Smelting
        oreSmelting(recipeOutput, BLUECHIST_SMELTABLES, RecipeCategory.MISC, BluechistBlocks.BLUECHIST_BLOCK.get(), 0.25f, 200, "bluechist");
        oreSmelting(recipeOutput, BLUECHIST_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 200, "bluechist");
        oreSmelting(recipeOutput, BLUECHIST_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 200, "bluechist");
        oreSmelting(recipeOutput, BLUECHIST_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 200, "bluechist");
        oreSmelting(recipeOutput, BLUECHIST_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 200, "bluechist");
        oreSmelting(recipeOutput, BLUECHIST_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "bluechist");
        oreSmelting(recipeOutput, BLUECHIST_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "bluechist");

        // Blasting
        //        oreBlasting(recipeOutput, BISMUTH_SMELTABLES, RecipeCategory.MISC, ModItems.BISMUTH.get(), 0.25f, 100, "bismuth");

        // Stairs, Slabs, Walls, Stonecutting
        stairBuilder(BluechistBlocks.BLUECHIST_STAIRS.get(), Ingredient.of(BluechistBlocks.BLUECHIST_BLOCK)).group("bluechist").unlockedBy("has_bluechist_block", has(BluechistBlocks.BLUECHIST_BLOCK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, BluechistBlocks.BLUECHIST_BLOCK_SLAB.get(), BluechistBlocks.BLUECHIST_BLOCK.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, BluechistBlocks.BLUECHIST_BLOCK_WALL.get(), BluechistBlocks.BLUECHIST_BLOCK.get());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, BluechistBlocks.BLUECHIST_BLOCK_SLAB.get(), BluechistBlocks.BLUECHIST_BLOCK.get(), 2);
    }

    private void buildGreenschistRecipes(RecipeOutput recipeOutput) {

        List<ItemLike> GREENSCHIST_SMELTABLES = List.of(GreenschistBlocks.GREENSCHIST_COBBLE_BLOCK);
        List<ItemLike> GREENSCHIST_COAL_SMELTABLES = List.of(GreenschistBlocks.GREENSCHIST_COAL_ORE);
        List<ItemLike> GREENSCHIST_COPPER_SMELTABLES = List.of(GreenschistBlocks.GREENSCHIST_COPPER_ORE);
        List<ItemLike> GREENSCHIST_IRON_SMELTABLES = List.of(GreenschistBlocks.GREENSCHIST_IRON_ORE);
        List<ItemLike> GREENSCHIST_GOLD_SMELTABLES = List.of(GreenschistBlocks.GREENSCHIST_GOLD_ORE);
        List<ItemLike> GREENSCHIST_REDSTONE_SMELTABLES = List.of(GreenschistBlocks.GREENSCHIST_REDSTONE_ORE);
        List<ItemLike> GREENSCHIST_LAPIS_SMELTABLES = List.of(GreenschistBlocks.GREENSCHIST_LAPIS_ORE);

        // Greenschist Brick (4x)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GreenschistBlocks.GREENSCHIST_BRICK_BLOCK.get(), 4).pattern("AA").pattern("AA").define('A', GreenschistBlocks.GREENSCHIST_BLOCK.get()).unlockedBy("has_greenschist_block", has(GreenschistBlocks.GREENSCHIST_BLOCK)).save(recipeOutput);

        // Stone Button
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GreenschistBlocks.GREENSCHIST_STONE_BUTTON.get()).pattern("A").define('A', GreenschistBlocks.GREENSCHIST_BLOCK.get()).unlockedBy("has_greenschist_block", has(GreenschistBlocks.GREENSCHIST_BLOCK)).save(recipeOutput);

        // Smelting
        oreSmelting(recipeOutput, GREENSCHIST_SMELTABLES, RecipeCategory.MISC, GreenschistBlocks.GREENSCHIST_BLOCK.get(), 0.25f, 200, "greenschist");
        oreSmelting(recipeOutput, GREENSCHIST_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 200, "greenschist");
        oreSmelting(recipeOutput, GREENSCHIST_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 200, "greenschist");
        oreSmelting(recipeOutput, GREENSCHIST_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 200, "greenschist");
        oreSmelting(recipeOutput, GREENSCHIST_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 200, "greenschist");
        oreSmelting(recipeOutput, GREENSCHIST_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "greenschist");
        oreSmelting(recipeOutput, GREENSCHIST_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "greenschist");

        // Blasting
        //oreBlasting(recipeOutput, BISMUTH_SMELTABLES, RecipeCategory.MISC, ModItems.BISMUTH.get(), 0.25f, 100, "bismuth");

        // Stairs, Slabs, Walls, Stonecutting
        stairBuilder(GreenschistBlocks.GREENSCHIST_STAIRS.get(), Ingredient.of(GreenschistBlocks.GREENSCHIST_BLOCK)).group("greenschist").unlockedBy("has_greenschist_block", has(GreenschistBlocks.GREENSCHIST_BLOCK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GreenschistBlocks.GREENSCHIST_BLOCK_SLAB.get(), GreenschistBlocks.GREENSCHIST_BLOCK.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GreenschistBlocks.GREENSCHIST_BLOCK_WALL.get(), GreenschistBlocks.GREENSCHIST_BLOCK.get());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GreenschistBlocks.GREENSCHIST_BLOCK_SLAB.get(), GreenschistBlocks.GREENSCHIST_BLOCK.get(), 2);
    }

    // ------------------------------------------------------------
    // CHALK RECIPES
    // ------------------------------------------------------------
    private void buildChalkRecipes(RecipeOutput recipeOutput) {

        List<ItemLike> CHALK_COAL_SMELTABLES = List.of(ChalkBlocks.CHALK_COAL_ORE);
        List<ItemLike> CHALK_COPPER_SMELTABLES = List.of(ChalkBlocks.CHALK_COPPER_ORE);
        List<ItemLike> CHALK_IRON_SMELTABLES = List.of(ChalkBlocks.CHALK_IRON_ORE);
        List<ItemLike> CHALK_GOLD_SMELTABLES = List.of(ChalkBlocks.CHALK_GOLD_ORE);
        List<ItemLike> CHALK_REDSTONE_SMELTABLES = List.of(ChalkBlocks.CHALK_REDSTONE_ORE);
        List<ItemLike> CHALK_LAPIS_SMELTABLES = List.of(ChalkBlocks.CHALK_LAPIS_ORE);

        // Stone Button
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ChalkBlocks.CHALK_STONE_BUTTON.get()).pattern("A").define('A', ChalkBlocks.CHALK_BLOCK.get()).unlockedBy("has_chalk_block", has(ChalkBlocks.CHALK_BLOCK)).save(recipeOutput);

        // Smelting;
        oreSmelting(recipeOutput, CHALK_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 200, "chalk");
        oreSmelting(recipeOutput, CHALK_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 200, "chalk");
        oreSmelting(recipeOutput, CHALK_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 200, "chalk");
        oreSmelting(recipeOutput, CHALK_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 200, "chalk");
        oreSmelting(recipeOutput, CHALK_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "chalk");
        oreSmelting(recipeOutput, CHALK_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "chalk");

        // Blasting
        //        oreBlasting(recipeOutput, BISMUTH_SMELTABLES, RecipeCategory.MISC, ModItems.BISMUTH.get(), 0.25f, 100, "bismuth");

        // Stairs, Slabs, Walls, Stonecutting
        stairBuilder(ChalkBlocks.CHALK_STAIRS.get(), Ingredient.of(ChalkBlocks.CHALK_BLOCK)).group("chalk").unlockedBy("has_chalk_block", has(ChalkBlocks.CHALK_BLOCK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ChalkBlocks.CHALK_BLOCK_SLAB.get(), ChalkBlocks.CHALK_BLOCK.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ChalkBlocks.CHALK_BLOCK_WALL.get(), ChalkBlocks.CHALK_BLOCK.get());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ChalkBlocks.CHALK_BLOCK_SLAB.get(), ChalkBlocks.CHALK_BLOCK.get(), 2);
    }

    // ------------------------------------------------------------
    // GENERIC COOKING HELPERS
    // ------------------------------------------------------------
    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike)).save(recipeOutput, UndergroundBiomesConstructsReworked.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
