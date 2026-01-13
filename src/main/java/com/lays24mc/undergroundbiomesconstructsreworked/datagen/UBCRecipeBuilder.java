package com.lays24mc.undergroundbiomesconstructsreworked.datagen;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.QuartziteBlocks;
import com.lays24mc.undergroundbiomesconstructsreworked.block.RedGraniteBlocks;
import com.lays24mc.undergroundbiomesconstructsreworked.block.RhyoliteBlocks;
import com.lays24mc.undergroundbiomesconstructsreworked.block.SoapstoneBlocks;
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
//        oreBlasting(recipeOutput, BISMUTH_SMELTABLES, RecipeCategory.MISC, ModItems.BISMUTH.get(), 0.25f, 100, "bismuth");

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

        // Quartzite Brick (4x)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, QuartziteBlocks.QUARTZITE_BRICK_BLOCK.get(), 4).pattern("AA").pattern("AA").define('A', QuartziteBlocks.QUARTZITE_BLOCK.get()).unlockedBy("has_quartzite_block", has(QuartziteBlocks.QUARTZITE_BLOCK)).save(recipeOutput);

        // Stone Button
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, QuartziteBlocks.QUARTZITE_STONE_BUTTON.get()).pattern("A").define('A', QuartziteBlocks.QUARTZITE_BLOCK.get()).unlockedBy("has_quartzite_block", has(QuartziteBlocks.QUARTZITE_BLOCK)).save(recipeOutput);

        // Smelting
        oreSmelting(recipeOutput, QUARTZITE_SMELTABLES, RecipeCategory.MISC, QuartziteBlocks.QUARTZITE_BLOCK.get(), 0.25f, 200, "quartzite");

        // Stairs, Slabs, Walls, Stonecutting
        stairBuilder(QuartziteBlocks.QUARTZITE_STAIRS.get(), Ingredient.of(QuartziteBlocks.QUARTZITE_BLOCK)).group("quartzite").unlockedBy("has_quartzite_block", has(QuartziteBlocks.QUARTZITE_BLOCK)).save(recipeOutput);

        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, QuartziteBlocks.QUARTZITE_BLOCK_SLAB.get(), QuartziteBlocks.QUARTZITE_BLOCK.get());

        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, QuartziteBlocks.QUARTZITE_BLOCK_WALL.get(), QuartziteBlocks.QUARTZITE_BLOCK.get());

        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, QuartziteBlocks.QUARTZITE_BLOCK_SLAB.get(), QuartziteBlocks.QUARTZITE_BLOCK.get(), 2);
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
