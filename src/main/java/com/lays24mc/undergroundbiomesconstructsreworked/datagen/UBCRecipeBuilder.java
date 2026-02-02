package com.lays24mc.undergroundbiomesconstructsreworked.datagen;

import com.lays24mc.undergroundbiomesconstructsreworked.UndergroundBiomesConstructsReworked;
import com.lays24mc.undergroundbiomesconstructsreworked.block.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class UBCRecipeBuilder extends RecipeProvider implements IConditionBuilder {
    public UBCRecipeBuilder(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
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
        buildBlueschistRecipes(recipeOutput);

        //====================================================
        // Greenschist
        //====================================================
        buildGreenschistRecipes(recipeOutput);

        //====================================================
        // Chalk
        //====================================================
        buildChalkRecipes(recipeOutput);

        //====================================================
        // Shale
        //====================================================
        buildShaleRecipes(recipeOutput);

        //====================================================
        // Chert
        //====================================================
        buildChertRecipes(recipeOutput);

        //====================================================
        // Lignite
        //====================================================
        buildLigniteRecipes(recipeOutput);

        //====================================================
        // Dolomite
        //====================================================
        buildDolomiteRecipes(recipeOutput);

        //====================================================
        // Eclogite
        //====================================================
        buildEclogiteRecipes(recipeOutput);

        //====================================================
        // Greywacke
        //====================================================
        buildGreywackeRecipes(recipeOutput);

        //====================================================
        // Komatiite
        //====================================================
        buildKomatiiteRecipes(recipeOutput);

        //====================================================
        // Dacite
        //====================================================
        buildDaciteRecipes(recipeOutput);

        //====================================================
        // Black Granite
        //====================================================
        buildBlackGraniteRecipes(recipeOutput);

        //====================================================
        // Gabbro
        //====================================================
        buildGabbroRecipes(recipeOutput);

        //====================================================
        // Gneiss
        //====================================================
        buildGneissRecipes(recipeOutput);

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

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SoapstoneBlocks.SOAPSTONE_BRICK_BLOCK.get(), 4).pattern("AA").pattern("AA").define('A', SoapstoneBlocks.SOAPSTONE_BLOCK.get()).unlockedBy("has_soapstone_block", has(SoapstoneBlocks.SOAPSTONE_BLOCK)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SoapstoneBlocks.SOAPSTONE_STONE_BUTTON.get()).pattern("A").define('A', SoapstoneBlocks.SOAPSTONE_BLOCK.get()).unlockedBy("has_soapstone_block", has(SoapstoneBlocks.SOAPSTONE_BLOCK)).save(recipeOutput);

        oreSmelting(recipeOutput, SOAPSTONE_SMELTABLES, RecipeCategory.MISC, SoapstoneBlocks.SOAPSTONE_BLOCK.get(), 0.25f, 200, "soapstone");
        oreSmelting(recipeOutput, SOAPSTONE_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 200, "soapstone");
        oreSmelting(recipeOutput, SOAPSTONE_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 200, "soapstone");
        oreSmelting(recipeOutput, SOAPSTONE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 200, "soapstone");
        oreSmelting(recipeOutput, SOAPSTONE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 200, "soapstone");
        oreSmelting(recipeOutput, SOAPSTONE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "soapstone");
        oreSmelting(recipeOutput, SOAPSTONE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "soapstone");

        oreBlasting(recipeOutput, SOAPSTONE_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 100, "soapstone");
        oreBlasting(recipeOutput, SOAPSTONE_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 100, "soapstone");
        oreBlasting(recipeOutput, SOAPSTONE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 100, "soapstone");
        oreBlasting(recipeOutput, SOAPSTONE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 100, "soapstone");
        oreBlasting(recipeOutput, SOAPSTONE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 100, "soapstone");
        oreBlasting(recipeOutput, SOAPSTONE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 100, "soapstone");

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

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RedGraniteBlocks.RED_GRANITE_BRICK_BLOCK.get(), 4).pattern("AA").pattern("AA").define('A', RedGraniteBlocks.RED_GRANITE_BLOCK.get()).unlockedBy("has_red_granite_block", has(RedGraniteBlocks.RED_GRANITE_BLOCK)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RedGraniteBlocks.RED_GRANITE_STONE_BUTTON.get()).pattern("A").define('A', RedGraniteBlocks.RED_GRANITE_BLOCK.get()).unlockedBy("has_red_granite_block", has(RedGraniteBlocks.RED_GRANITE_BLOCK)).save(recipeOutput);

        oreSmelting(recipeOutput, RED_GRANITE_SMELTABLES, RecipeCategory.MISC, RedGraniteBlocks.RED_GRANITE_BLOCK.get(), 0.25f, 200, "red_granite");
        oreSmelting(recipeOutput, RED_GRANITE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 200, "red_granite");
        oreSmelting(recipeOutput, RED_GRANITE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 200, "red_granite");
        oreSmelting(recipeOutput, RED_GRANITE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "red_granite");
        oreSmelting(recipeOutput, RED_GRANITE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "red_granite");
        oreSmelting(recipeOutput, RED_GRANITE_DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 0.25f, 200, "red_granite");
        oreSmelting(recipeOutput, RED_GRANITE_EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD, 0.25f, 200, "red_granite");

        oreBlasting(recipeOutput, RED_GRANITE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 100, "red_granite");
        oreBlasting(recipeOutput, RED_GRANITE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 100, "red_granite");
        oreBlasting(recipeOutput, RED_GRANITE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 100, "red_granite");
        oreBlasting(recipeOutput, RED_GRANITE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 100, "red_granite");
        oreBlasting(recipeOutput, RED_GRANITE_DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 0.25f, 100, "red_granite");
        oreBlasting(recipeOutput, RED_GRANITE_EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD, 0.25f, 100, "red_granite");

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

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RhyoliteBlocks.RHYOLITE_BRICK_BLOCK.get(), 4).pattern("AA").pattern("AA").define('A', RhyoliteBlocks.RHYOLITE_BLOCK.get()).unlockedBy("has_rhyolite_block", has(RhyoliteBlocks.RHYOLITE_BLOCK)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RhyoliteBlocks.RHYOLITE_STONE_BUTTON.get()).pattern("A").define('A', RhyoliteBlocks.RHYOLITE_BLOCK.get()).unlockedBy("has_rhyolite_block", has(RhyoliteBlocks.RHYOLITE_BLOCK)).save(recipeOutput);

        oreSmelting(recipeOutput, RHYOLITE_SMELTABLES, RecipeCategory.MISC, RhyoliteBlocks.RHYOLITE_BLOCK.get(), 0.25f, 200, "rhyolite");
        oreSmelting(recipeOutput, RHYOLITE_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 200, "rhyolite");
        oreSmelting(recipeOutput, RHYOLITE_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 200, "rhyolite");
        oreSmelting(recipeOutput, RHYOLITE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 200, "rhyolite");
        oreSmelting(recipeOutput, RHYOLITE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 200, "rhyolite");
        oreSmelting(recipeOutput, RHYOLITE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "rhyolite");
        oreSmelting(recipeOutput, RHYOLITE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "rhyolite");

        oreBlasting(recipeOutput, RHYOLITE_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 100, "rhyolite");
        oreBlasting(recipeOutput, RHYOLITE_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 100, "rhyolite");
        oreBlasting(recipeOutput, RHYOLITE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 100, "rhyolite");
        oreBlasting(recipeOutput, RHYOLITE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 100, "rhyolite");
        oreBlasting(recipeOutput, RHYOLITE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 100, "rhyolite");
        oreBlasting(recipeOutput, RHYOLITE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 100, "rhyolite");

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

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, QuartziteBlocks.QUARTZITE_BRICK_BLOCK.get(), 4).pattern("AA").pattern("AA").define('A', QuartziteBlocks.QUARTZITE_BLOCK.get()).unlockedBy("has_quartzite_block", has(QuartziteBlocks.QUARTZITE_BLOCK)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, QuartziteBlocks.QUARTZITE_STONE_BUTTON.get()).pattern("A").define('A', QuartziteBlocks.QUARTZITE_BLOCK.get()).unlockedBy("has_quartzite_block", has(QuartziteBlocks.QUARTZITE_BLOCK)).save(recipeOutput);

        oreSmelting(recipeOutput, QUARTZITE_SMELTABLES, RecipeCategory.MISC, QuartziteBlocks.QUARTZITE_BLOCK.get(), 0.25f, 200, "quartzite");
        oreSmelting(recipeOutput, QUARTZITE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 200, "quartzite");
        oreSmelting(recipeOutput, QUARTZITE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 200, "quartzite");
        oreSmelting(recipeOutput, QUARTZITE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "quartzite");
        oreSmelting(recipeOutput, QUARTZITE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "quartzite");
        oreSmelting(recipeOutput, QUARTZITE_DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 0.25f, 200, "quartzite");
        oreSmelting(recipeOutput, QUARTZITE_EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD, 0.25f, 200, "quartzite");

        oreBlasting(recipeOutput, QUARTZITE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 100, "quartzite");
        oreBlasting(recipeOutput, QUARTZITE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 100, "quartzite");
        oreBlasting(recipeOutput, QUARTZITE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 100, "quartzite");
        oreBlasting(recipeOutput, QUARTZITE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 100, "quartzite");
        oreBlasting(recipeOutput, QUARTZITE_DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 0.25f, 100, "quartzite");
        oreBlasting(recipeOutput, QUARTZITE_EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD, 0.25f, 100, "quartzite");

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

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MigmatiteBlocks.MIGMATITE_BRICK_BLOCK.get(), 4).pattern("AA").pattern("AA").define('A', MigmatiteBlocks.MIGMATITE_BLOCK.get()).unlockedBy("has_migmatite_block", has(MigmatiteBlocks.MIGMATITE_BLOCK)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MigmatiteBlocks.MIGMATITE_STONE_BUTTON.get()).pattern("A").define('A', MigmatiteBlocks.MIGMATITE_BLOCK.get()).unlockedBy("has_migmatite_block", has(MigmatiteBlocks.MIGMATITE_BLOCK)).save(recipeOutput);

        oreSmelting(recipeOutput, MIGMATITE_SMELTABLES, RecipeCategory.MISC, MigmatiteBlocks.MIGMATITE_BLOCK.get(), 0.25f, 200, "migmatite");
        oreSmelting(recipeOutput, MIGMATITE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 200, "migmatite");
        oreSmelting(recipeOutput, MIGMATITE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 200, "migmatite");
        oreSmelting(recipeOutput, MIGMATITE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "migmatite");
        oreSmelting(recipeOutput, MIGMATITE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "migmatite");
        oreSmelting(recipeOutput, MIGMATITE_DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 0.25f, 200, "migmatite");
        oreSmelting(recipeOutput, MIGMATITE_EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD, 0.25f, 200, "migmatite");

        oreBlasting(recipeOutput, MIGMATITE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 100, "migmatite");
        oreBlasting(recipeOutput, MIGMATITE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 100, "migmatite");
        oreBlasting(recipeOutput, MIGMATITE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 100, "migmatite");
        oreBlasting(recipeOutput, MIGMATITE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 100, "migmatite");
        oreBlasting(recipeOutput, MIGMATITE_DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 0.25f, 100, "migmatite");
        oreBlasting(recipeOutput, MIGMATITE_EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD, 0.25f, 100, "migmatite");

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

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MarbleBlocks.MARBLE_BRICK_BLOCK.get(), 4).pattern("AA").pattern("AA").define('A', MarbleBlocks.MARBLE_BLOCK.get()).unlockedBy("has_marble_block", has(MarbleBlocks.MARBLE_BLOCK)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MarbleBlocks.MARBLE_STONE_BUTTON.get()).pattern("A").define('A', MarbleBlocks.MARBLE_BLOCK.get()).unlockedBy("has_marble_block", has(MarbleBlocks.MARBLE_BLOCK)).save(recipeOutput);

        oreSmelting(recipeOutput, MARBLE_SMELTABLES, RecipeCategory.MISC, MarbleBlocks.MARBLE_BLOCK.get(), 0.25f, 200, "marble");
        oreSmelting(recipeOutput, MARBLE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 200, "marble");
        oreSmelting(recipeOutput, MARBLE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 200, "marble");
        oreSmelting(recipeOutput, MARBLE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "marble");
        oreSmelting(recipeOutput, MARBLE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "marble");
        oreSmelting(recipeOutput, MARBLE_DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 0.25f, 200, "marble");
        oreSmelting(recipeOutput, MARBLE_EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD, 0.25f, 200, "marble");

        oreBlasting(recipeOutput, MARBLE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 100, "marble");
        oreBlasting(recipeOutput, MARBLE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 100, "marble");
        oreBlasting(recipeOutput, MARBLE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 100, "marble");
        oreBlasting(recipeOutput, MARBLE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 100, "marble");
        oreBlasting(recipeOutput, MARBLE_DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 0.25f, 100, "marble");
        oreBlasting(recipeOutput, MARBLE_EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD, 0.25f, 100, "marble");

        stairBuilder(MarbleBlocks.MARBLE_STAIRS.get(), Ingredient.of(MarbleBlocks.MARBLE_BLOCK)).group("marble").unlockedBy("has_marble_block", has(MarbleBlocks.MARBLE_BLOCK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, MarbleBlocks.MARBLE_BLOCK_SLAB.get(), MarbleBlocks.MARBLE_BLOCK.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, MarbleBlocks.MARBLE_BLOCK_WALL.get(), MarbleBlocks.MARBLE_BLOCK.get());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, MarbleBlocks.MARBLE_BLOCK_SLAB.get(), MarbleBlocks.MARBLE_BLOCK.get(), 2);
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

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, LimestoneBlocks.LIMESTONE_STONE_BUTTON.get()).pattern("A").define('A', LimestoneBlocks.LIMESTONE_BLOCK.get()).unlockedBy("has_limestone_block", has(LimestoneBlocks.LIMESTONE_BLOCK)).save(recipeOutput);

        oreSmelting(recipeOutput, LIMESTONE_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 200, "limestone");
        oreSmelting(recipeOutput, LIMESTONE_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 200, "limestone");
        oreSmelting(recipeOutput, LIMESTONE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 200, "limestone");
        oreSmelting(recipeOutput, LIMESTONE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 200, "limestone");
        oreSmelting(recipeOutput, LIMESTONE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "limestone");
        oreSmelting(recipeOutput, LIMESTONE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "limestone");

        oreBlasting(recipeOutput, LIMESTONE_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 100, "limestone");
        oreBlasting(recipeOutput, LIMESTONE_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 100, "limestone");
        oreBlasting(recipeOutput, LIMESTONE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 100, "limestone");
        oreBlasting(recipeOutput, LIMESTONE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 100, "limestone");
        oreBlasting(recipeOutput, LIMESTONE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 100, "limestone");
        oreBlasting(recipeOutput, LIMESTONE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 100, "limestone");

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

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SiltstoneBlocks.SILTSTONE_STONE_BUTTON.get()).pattern("A").define('A', SiltstoneBlocks.SILTSTONE_BLOCK.get()).unlockedBy("has_siltstone_block", has(SiltstoneBlocks.SILTSTONE_BLOCK)).save(recipeOutput);

        oreSmelting(recipeOutput, SILTSTONE_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 200, "siltstone");
        oreSmelting(recipeOutput, SILTSTONE_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 200, "siltstone");
        oreSmelting(recipeOutput, SILTSTONE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 200, "siltstone");
        oreSmelting(recipeOutput, SILTSTONE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 200, "siltstone");
        oreSmelting(recipeOutput, SILTSTONE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "siltstone");
        oreSmelting(recipeOutput, SILTSTONE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "siltstone");

        oreBlasting(recipeOutput, SILTSTONE_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 100, "siltstone");
        oreBlasting(recipeOutput, SILTSTONE_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 100, "siltstone");
        oreBlasting(recipeOutput, SILTSTONE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 100, "siltstone");
        oreBlasting(recipeOutput, SILTSTONE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 100, "siltstone");
        oreBlasting(recipeOutput, SILTSTONE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 100, "siltstone");
        oreBlasting(recipeOutput, SILTSTONE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 100, "siltstone");

        stairBuilder(SiltstoneBlocks.SILTSTONE_STAIRS.get(), Ingredient.of(SiltstoneBlocks.SILTSTONE_BLOCK)).group("siltstone").unlockedBy("has_siltstone_block", has(SiltstoneBlocks.SILTSTONE_BLOCK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SiltstoneBlocks.SILTSTONE_BLOCK_SLAB.get(), SiltstoneBlocks.SILTSTONE_BLOCK.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SiltstoneBlocks.SILTSTONE_BLOCK_WALL.get(), SiltstoneBlocks.SILTSTONE_BLOCK.get());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SiltstoneBlocks.SILTSTONE_BLOCK_SLAB.get(), SiltstoneBlocks.SILTSTONE_BLOCK.get(), 2);
    }

    // ------------------------------------------------------------
    // BLUESCHIST RECIPES
    // ------------------------------------------------------------
    private void buildBlueschistRecipes(RecipeOutput recipeOutput) {

        List<ItemLike> BLUESCHIST_SMELTABLES = List.of(BlueschistBlocks.BLUESCHIST_COBBLE_BLOCK);
        List<ItemLike> BLUESCHIST_COAL_SMELTABLES = List.of(BlueschistBlocks.BLUESCHIST_COAL_ORE);
        List<ItemLike> BLUESCHIST_COPPER_SMELTABLES = List.of(BlueschistBlocks.BLUESCHIST_COPPER_ORE);
        List<ItemLike> BLUESCHIST_IRON_SMELTABLES = List.of(BlueschistBlocks.BLUESCHIST_IRON_ORE);
        List<ItemLike> BLUESCHIST_GOLD_SMELTABLES = List.of(BlueschistBlocks.BLUESCHIST_GOLD_ORE);
        List<ItemLike> BLUESCHIST_REDSTONE_SMELTABLES = List.of(BlueschistBlocks.BLUESCHIST_REDSTONE_ORE);
        List<ItemLike> BLUESCHIST_LAPIS_SMELTABLES = List.of(BlueschistBlocks.BLUESCHIST_LAPIS_ORE);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlueschistBlocks.BLUESCHIST_BRICK_BLOCK.get(), 4).pattern("AA").pattern("AA").define('A', BlueschistBlocks.BLUESCHIST_BLOCK.get()).unlockedBy("has_blueschist_block", has(BlueschistBlocks.BLUESCHIST_BLOCK)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlueschistBlocks.BLUESCHIST_STONE_BUTTON.get()).pattern("A").define('A', BlueschistBlocks.BLUESCHIST_BLOCK.get()).unlockedBy("has_blueschist_block", has(BlueschistBlocks.BLUESCHIST_BLOCK)).save(recipeOutput);

        oreSmelting(recipeOutput, BLUESCHIST_SMELTABLES, RecipeCategory.MISC, BlueschistBlocks.BLUESCHIST_BLOCK.get(), 0.25f, 200, "blueschist");
        oreSmelting(recipeOutput, BLUESCHIST_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 200, "blueschist");
        oreSmelting(recipeOutput, BLUESCHIST_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 200, "blueschist");
        oreSmelting(recipeOutput, BLUESCHIST_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 200, "blueschist");
        oreSmelting(recipeOutput, BLUESCHIST_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 200, "blueschist");
        oreSmelting(recipeOutput, BLUESCHIST_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "blueschist");
        oreSmelting(recipeOutput, BLUESCHIST_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "blueschist");

        oreBlasting(recipeOutput, BLUESCHIST_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 100, "blueschist");
        oreBlasting(recipeOutput, BLUESCHIST_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 100, "blueschist");
        oreBlasting(recipeOutput, BLUESCHIST_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 100, "blueschist");
        oreBlasting(recipeOutput, BLUESCHIST_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 100, "blueschist");
        oreBlasting(recipeOutput, BLUESCHIST_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 100, "blueschist");
        oreBlasting(recipeOutput, BLUESCHIST_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 100, "blueschist");

        stairBuilder(BlueschistBlocks.BLUESCHIST_STAIRS.get(), Ingredient.of(BlueschistBlocks.BLUESCHIST_BLOCK)).group("blueschist").unlockedBy("has_blueschist_block", has(BlueschistBlocks.BLUESCHIST_BLOCK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, BlueschistBlocks.BLUESCHIST_BLOCK_SLAB.get(), BlueschistBlocks.BLUESCHIST_BLOCK.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, BlueschistBlocks.BLUESCHIST_BLOCK_WALL.get(), BlueschistBlocks.BLUESCHIST_BLOCK.get());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, BlueschistBlocks.BLUESCHIST_BLOCK_SLAB.get(), BlueschistBlocks.BLUESCHIST_BLOCK.get(), 2);
    }

    private void buildGreenschistRecipes(RecipeOutput recipeOutput) {

        List<ItemLike> GREENSCHIST_SMELTABLES = List.of(GreenschistBlocks.GREENSCHIST_COBBLE_BLOCK);
        List<ItemLike> GREENSCHIST_COAL_SMELTABLES = List.of(GreenschistBlocks.GREENSCHIST_COAL_ORE);
        List<ItemLike> GREENSCHIST_COPPER_SMELTABLES = List.of(GreenschistBlocks.GREENSCHIST_COPPER_ORE);
        List<ItemLike> GREENSCHIST_IRON_SMELTABLES = List.of(GreenschistBlocks.GREENSCHIST_IRON_ORE);
        List<ItemLike> GREENSCHIST_GOLD_SMELTABLES = List.of(GreenschistBlocks.GREENSCHIST_GOLD_ORE);
        List<ItemLike> GREENSCHIST_REDSTONE_SMELTABLES = List.of(GreenschistBlocks.GREENSCHIST_REDSTONE_ORE);
        List<ItemLike> GREENSCHIST_LAPIS_SMELTABLES = List.of(GreenschistBlocks.GREENSCHIST_LAPIS_ORE);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GreenschistBlocks.GREENSCHIST_BRICK_BLOCK.get(), 4).pattern("AA").pattern("AA").define('A', GreenschistBlocks.GREENSCHIST_BLOCK.get()).unlockedBy("has_greenschist_block", has(GreenschistBlocks.GREENSCHIST_BLOCK)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GreenschistBlocks.GREENSCHIST_STONE_BUTTON.get()).pattern("A").define('A', GreenschistBlocks.GREENSCHIST_BLOCK.get()).unlockedBy("has_greenschist_block", has(GreenschistBlocks.GREENSCHIST_BLOCK)).save(recipeOutput);

        oreSmelting(recipeOutput, GREENSCHIST_SMELTABLES, RecipeCategory.MISC, GreenschistBlocks.GREENSCHIST_BLOCK.get(), 0.25f, 200, "greenschist");
        oreSmelting(recipeOutput, GREENSCHIST_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 200, "greenschist");
        oreSmelting(recipeOutput, GREENSCHIST_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 200, "greenschist");
        oreSmelting(recipeOutput, GREENSCHIST_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 200, "greenschist");
        oreSmelting(recipeOutput, GREENSCHIST_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 200, "greenschist");
        oreSmelting(recipeOutput, GREENSCHIST_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "greenschist");
        oreSmelting(recipeOutput, GREENSCHIST_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "greenschist");

        oreBlasting(recipeOutput, GREENSCHIST_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 100, "greenschist");
        oreBlasting(recipeOutput, GREENSCHIST_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 100, "greenschist");
        oreBlasting(recipeOutput, GREENSCHIST_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 100, "greenschist");
        oreBlasting(recipeOutput, GREENSCHIST_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 100, "greenschist");
        oreBlasting(recipeOutput, GREENSCHIST_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 100, "greenschist");
        oreBlasting(recipeOutput, GREENSCHIST_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 100, "greenschist");

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

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ChalkBlocks.CHALK_STONE_BUTTON.get()).pattern("A").define('A', ChalkBlocks.CHALK_BLOCK.get()).unlockedBy("has_chalk_block", has(ChalkBlocks.CHALK_BLOCK)).save(recipeOutput);

        oreSmelting(recipeOutput, CHALK_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 200, "chalk");
        oreSmelting(recipeOutput, CHALK_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 200, "chalk");
        oreSmelting(recipeOutput, CHALK_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 200, "chalk");
        oreSmelting(recipeOutput, CHALK_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 200, "chalk");
        oreSmelting(recipeOutput, CHALK_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "chalk");
        oreSmelting(recipeOutput, CHALK_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "chalk");

        oreBlasting(recipeOutput, CHALK_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 100, "chalk");
        oreBlasting(recipeOutput, CHALK_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 100, "chalk");
        oreBlasting(recipeOutput, CHALK_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 100, "chalk");
        oreBlasting(recipeOutput, CHALK_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 100, "chalk");
        oreBlasting(recipeOutput, CHALK_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 100, "chalk");
        oreBlasting(recipeOutput, CHALK_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 100, "chalk");

        stairBuilder(ChalkBlocks.CHALK_STAIRS.get(), Ingredient.of(ChalkBlocks.CHALK_BLOCK)).group("chalk").unlockedBy("has_chalk_block", has(ChalkBlocks.CHALK_BLOCK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ChalkBlocks.CHALK_BLOCK_SLAB.get(), ChalkBlocks.CHALK_BLOCK.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ChalkBlocks.CHALK_BLOCK_WALL.get(), ChalkBlocks.CHALK_BLOCK.get());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ChalkBlocks.CHALK_BLOCK_SLAB.get(), ChalkBlocks.CHALK_BLOCK.get(), 2);
    }

    // ------------------------------------------------------------
    // SHALE RECIPES
    // ------------------------------------------------------------
    private void buildShaleRecipes(RecipeOutput recipeOutput) {

        List<ItemLike> SHALE_COAL_SMELTABLES = List.of(ShaleBlocks.SHALE_COAL_ORE);
        List<ItemLike> SHALE_COPPER_SMELTABLES = List.of(ShaleBlocks.SHALE_COPPER_ORE);
        List<ItemLike> SHALE_IRON_SMELTABLES = List.of(ShaleBlocks.SHALE_IRON_ORE);
        List<ItemLike> SHALE_GOLD_SMELTABLES = List.of(ShaleBlocks.SHALE_GOLD_ORE);
        List<ItemLike> SHALE_REDSTONE_SMELTABLES = List.of(ShaleBlocks.SHALE_REDSTONE_ORE);
        List<ItemLike> SHALE_LAPIS_SMELTABLES = List.of(ShaleBlocks.SHALE_LAPIS_ORE);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ShaleBlocks.SHALE_STONE_BUTTON.get()).pattern("A").define('A', ShaleBlocks.SHALE_BLOCK.get()).unlockedBy("has_shale_block", has(ShaleBlocks.SHALE_BLOCK)).save(recipeOutput);

        oreSmelting(recipeOutput, SHALE_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 200, "shale");
        oreSmelting(recipeOutput, SHALE_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 200, "shale");
        oreSmelting(recipeOutput, SHALE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 200, "shale");
        oreSmelting(recipeOutput, SHALE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 200, "shale");
        oreSmelting(recipeOutput, SHALE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "shale");
        oreSmelting(recipeOutput, SHALE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "shale");

        oreBlasting(recipeOutput, SHALE_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 100, "shale");
        oreBlasting(recipeOutput, SHALE_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 100, "shale");
        oreBlasting(recipeOutput, SHALE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 100, "shale");
        oreBlasting(recipeOutput, SHALE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 100, "shale");
        oreBlasting(recipeOutput, SHALE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 100, "shale");
        oreBlasting(recipeOutput, SHALE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 100, "shale");

        stairBuilder(ShaleBlocks.SHALE_STAIRS.get(), Ingredient.of(ShaleBlocks.SHALE_BLOCK)).group("shale").unlockedBy("has_shale_block", has(ShaleBlocks.SHALE_BLOCK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ShaleBlocks.SHALE_BLOCK_SLAB.get(), ShaleBlocks.SHALE_BLOCK.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ShaleBlocks.SHALE_BLOCK_WALL.get(), ShaleBlocks.SHALE_BLOCK.get());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ShaleBlocks.SHALE_BLOCK_SLAB.get(), ShaleBlocks.SHALE_BLOCK.get(), 2);
    }

    // ------------------------------------------------------------
    // CHERT RECIPES
    // ------------------------------------------------------------
    private void buildChertRecipes(RecipeOutput recipeOutput) {

        List<ItemLike> CHERT_COAL_SMELTABLES = List.of(ChertBlocks.CHERT_COAL_ORE);
        List<ItemLike> CHERT_COPPER_SMELTABLES = List.of(ChertBlocks.CHERT_COPPER_ORE);
        List<ItemLike> CHERT_IRON_SMELTABLES = List.of(ChertBlocks.CHERT_IRON_ORE);
        List<ItemLike> CHERT_GOLD_SMELTABLES = List.of(ChertBlocks.CHERT_GOLD_ORE);
        List<ItemLike> CHERT_REDSTONE_SMELTABLES = List.of(ChertBlocks.CHERT_REDSTONE_ORE);
        List<ItemLike> CHERT_LAPIS_SMELTABLES = List.of(ChertBlocks.CHERT_LAPIS_ORE);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ChertBlocks.CHERT_STONE_BUTTON.get()).pattern("A").define('A', ChertBlocks.CHERT_BLOCK.get()).unlockedBy("has_chert_block", has(ChertBlocks.CHERT_BLOCK)).save(recipeOutput);

        oreSmelting(recipeOutput, CHERT_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 200, "chert");
        oreSmelting(recipeOutput, CHERT_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 200, "chert");
        oreSmelting(recipeOutput, CHERT_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 200, "chert");
        oreSmelting(recipeOutput, CHERT_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 200, "chert");
        oreSmelting(recipeOutput, CHERT_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "chert");
        oreSmelting(recipeOutput, CHERT_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "chert");

        oreBlasting(recipeOutput, CHERT_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 100, "chert");
        oreBlasting(recipeOutput, CHERT_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 100, "chert");
        oreBlasting(recipeOutput, CHERT_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 100, "chert");
        oreBlasting(recipeOutput, CHERT_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 100, "chert");
        oreBlasting(recipeOutput, CHERT_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 100, "chert");
        oreBlasting(recipeOutput, CHERT_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 100, "chert");

        stairBuilder(ChertBlocks.CHERT_STAIRS.get(), Ingredient.of(ChertBlocks.CHERT_BLOCK)).group("chert").unlockedBy("has_chert_block", has(ChertBlocks.CHERT_BLOCK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ChertBlocks.CHERT_BLOCK_SLAB.get(), ChertBlocks.CHERT_BLOCK.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ChertBlocks.CHERT_BLOCK_WALL.get(), ChertBlocks.CHERT_BLOCK.get());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ChertBlocks.CHERT_BLOCK_SLAB.get(), ChertBlocks.CHERT_BLOCK.get(), 2);
    }

    // ------------------------------------------------------------
    // LIGNITE RECIPES
    // ------------------------------------------------------------
    private void buildLigniteRecipes(RecipeOutput recipeOutput) {

        List<ItemLike> LIGNITE_COAL_SMELTABLES = List.of(LigniteBlocks.LIGNITE_COAL_ORE);
        List<ItemLike> LIGNITE_COPPER_SMELTABLES = List.of(LigniteBlocks.LIGNITE_COPPER_ORE);
        List<ItemLike> LIGNITE_IRON_SMELTABLES = List.of(LigniteBlocks.LIGNITE_IRON_ORE);
        List<ItemLike> LIGNITE_GOLD_SMELTABLES = List.of(LigniteBlocks.LIGNITE_GOLD_ORE);
        List<ItemLike> LIGNITE_REDSTONE_SMELTABLES = List.of(LigniteBlocks.LIGNITE_REDSTONE_ORE);
        List<ItemLike> LIGNITE_LAPIS_SMELTABLES = List.of(LigniteBlocks.LIGNITE_LAPIS_ORE);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, LigniteBlocks.LIGNITE_STONE_BUTTON.get()).pattern("A").define('A', LigniteBlocks.LIGNITE_BLOCK.get()).unlockedBy("has_lignite_block", has(LigniteBlocks.LIGNITE_BLOCK)).save(recipeOutput);

        oreSmelting(recipeOutput, LIGNITE_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 200, "lignite");
        oreSmelting(recipeOutput, LIGNITE_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 200, "lignite");
        oreSmelting(recipeOutput, LIGNITE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 200, "lignite");
        oreSmelting(recipeOutput, LIGNITE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 200, "lignite");
        oreSmelting(recipeOutput, LIGNITE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "lignite");
        oreSmelting(recipeOutput, LIGNITE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "lignite");

        oreBlasting(recipeOutput, LIGNITE_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 100, "lignite");
        oreBlasting(recipeOutput, LIGNITE_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 100, "lignite");
        oreBlasting(recipeOutput, LIGNITE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 100, "lignite");
        oreBlasting(recipeOutput, LIGNITE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 100, "lignite");
        oreBlasting(recipeOutput, LIGNITE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 100, "lignite");
        oreBlasting(recipeOutput, LIGNITE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 100, "lignite");

        stairBuilder(LigniteBlocks.LIGNITE_STAIRS.get(), Ingredient.of(LigniteBlocks.LIGNITE_BLOCK)).group("lignite").unlockedBy("has_lignite_block", has(LigniteBlocks.LIGNITE_BLOCK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, LigniteBlocks.LIGNITE_BLOCK_SLAB.get(), LigniteBlocks.LIGNITE_BLOCK.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, LigniteBlocks.LIGNITE_BLOCK_WALL.get(), LigniteBlocks.LIGNITE_BLOCK.get());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, LigniteBlocks.LIGNITE_BLOCK_SLAB.get(), LigniteBlocks.LIGNITE_BLOCK.get(), 2);
    }

    // ------------------------------------------------------------
    // DOLOMITE RECIPES
    // ------------------------------------------------------------
    private void buildDolomiteRecipes(RecipeOutput recipeOutput) {

        List<ItemLike> DOLOMITE_COAL_SMELTABLES = List.of(DolomiteBlocks.DOLOMITE_COAL_ORE);
        List<ItemLike> DOLOMITE_COPPER_SMELTABLES = List.of(DolomiteBlocks.DOLOMITE_COPPER_ORE);
        List<ItemLike> DOLOMITE_IRON_SMELTABLES = List.of(DolomiteBlocks.DOLOMITE_IRON_ORE);
        List<ItemLike> DOLOMITE_GOLD_SMELTABLES = List.of(DolomiteBlocks.DOLOMITE_GOLD_ORE);
        List<ItemLike> DOLOMITE_REDSTONE_SMELTABLES = List.of(DolomiteBlocks.DOLOMITE_REDSTONE_ORE);
        List<ItemLike> DOLOMITE_LAPIS_SMELTABLES = List.of(DolomiteBlocks.DOLOMITE_LAPIS_ORE);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DolomiteBlocks.DOLOMITE_STONE_BUTTON.get()).pattern("A").define('A', DolomiteBlocks.DOLOMITE_BLOCK.get()).unlockedBy("has_dolomite_block", has(DolomiteBlocks.DOLOMITE_BLOCK)).save(recipeOutput);

        oreSmelting(recipeOutput, DOLOMITE_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 200, "dolomite");
        oreSmelting(recipeOutput, DOLOMITE_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 200, "dolomite");
        oreSmelting(recipeOutput, DOLOMITE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 200, "dolomite");
        oreSmelting(recipeOutput, DOLOMITE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 200, "dolomite");
        oreSmelting(recipeOutput, DOLOMITE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "dolomite");
        oreSmelting(recipeOutput, DOLOMITE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "dolomite");

        oreBlasting(recipeOutput, DOLOMITE_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 100, "dolomite");
        oreBlasting(recipeOutput, DOLOMITE_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 100, "dolomite");
        oreBlasting(recipeOutput, DOLOMITE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 100, "dolomite");
        oreBlasting(recipeOutput, DOLOMITE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 100, "dolomite");
        oreBlasting(recipeOutput, DOLOMITE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 100, "dolomite");
        oreBlasting(recipeOutput, DOLOMITE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 100, "dolomite");

        stairBuilder(DolomiteBlocks.DOLOMITE_STAIRS.get(), Ingredient.of(DolomiteBlocks.DOLOMITE_BLOCK)).group("dolomite").unlockedBy("has_dolomite_block", has(DolomiteBlocks.DOLOMITE_BLOCK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, DolomiteBlocks.DOLOMITE_BLOCK_SLAB.get(), DolomiteBlocks.DOLOMITE_BLOCK.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, DolomiteBlocks.DOLOMITE_BLOCK_WALL.get(), DolomiteBlocks.DOLOMITE_BLOCK.get());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, DolomiteBlocks.DOLOMITE_BLOCK_SLAB.get(), DolomiteBlocks.DOLOMITE_BLOCK.get(), 2);
    }

    // ------------------------------------------------------------
    // ECLOGITE RECIPES
    // ------------------------------------------------------------
    private void buildEclogiteRecipes(RecipeOutput recipeOutput) {

        List<ItemLike> ECLOGITE_COAL_SMELTABLES = List.of(EclogiteBlocks.ECLOGITE_COAL_ORE);
        List<ItemLike> ECLOGITE_COPPER_SMELTABLES = List.of(EclogiteBlocks.ECLOGITE_COPPER_ORE);
        List<ItemLike> ECLOGITE_IRON_SMELTABLES = List.of(EclogiteBlocks.ECLOGITE_IRON_ORE);
        List<ItemLike> ECLOGITE_GOLD_SMELTABLES = List.of(EclogiteBlocks.ECLOGITE_GOLD_ORE);
        List<ItemLike> ECLOGITE_REDSTONE_SMELTABLES = List.of(EclogiteBlocks.ECLOGITE_REDSTONE_ORE);
        List<ItemLike> ECLOGITE_LAPIS_SMELTABLES = List.of(EclogiteBlocks.ECLOGITE_LAPIS_ORE);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EclogiteBlocks.ECLOGITE_STONE_BUTTON.get()).pattern("A").define('A', EclogiteBlocks.ECLOGITE_BLOCK.get()).unlockedBy("has_eclogite_block", has(EclogiteBlocks.ECLOGITE_BLOCK)).save(recipeOutput);

        oreSmelting(recipeOutput, ECLOGITE_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 200, "eclogite");
        oreSmelting(recipeOutput, ECLOGITE_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 200, "eclogite");
        oreSmelting(recipeOutput, ECLOGITE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 200, "eclogite");
        oreSmelting(recipeOutput, ECLOGITE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 200, "eclogite");
        oreSmelting(recipeOutput, ECLOGITE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "eclogite");
        oreSmelting(recipeOutput, ECLOGITE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "eclogite");

        oreBlasting(recipeOutput, ECLOGITE_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 100, "eclogite");
        oreBlasting(recipeOutput, ECLOGITE_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 100, "eclogite");
        oreBlasting(recipeOutput, ECLOGITE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 100, "eclogite");
        oreBlasting(recipeOutput, ECLOGITE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 100, "eclogite");
        oreBlasting(recipeOutput, ECLOGITE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 100, "eclogite");
        oreBlasting(recipeOutput, ECLOGITE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 100, "eclogite");

        stairBuilder(EclogiteBlocks.ECLOGITE_STAIRS.get(), Ingredient.of(EclogiteBlocks.ECLOGITE_BLOCK)).group("eclogite").unlockedBy("has_eclogite_block", has(EclogiteBlocks.ECLOGITE_BLOCK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, EclogiteBlocks.ECLOGITE_BLOCK_SLAB.get(), EclogiteBlocks.ECLOGITE_BLOCK.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, EclogiteBlocks.ECLOGITE_BLOCK_WALL.get(), EclogiteBlocks.ECLOGITE_BLOCK.get());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, EclogiteBlocks.ECLOGITE_BLOCK_SLAB.get(), EclogiteBlocks.ECLOGITE_BLOCK.get(), 2);
    }

    // ------------------------------------------------------------
    // GREYWACKE RECIPES
    // ------------------------------------------------------------
    private void buildGreywackeRecipes(RecipeOutput recipeOutput) {

        List<ItemLike> GREYWACKE_COAL_SMELTABLES = List.of(GreywackeBlocks.GREYWACKE_COAL_ORE);
        List<ItemLike> GREYWACKE_COPPER_SMELTABLES = List.of(GreywackeBlocks.GREYWACKE_COPPER_ORE);
        List<ItemLike> GREYWACKE_IRON_SMELTABLES = List.of(GreywackeBlocks.GREYWACKE_IRON_ORE);
        List<ItemLike> GREYWACKE_GOLD_SMELTABLES = List.of(GreywackeBlocks.GREYWACKE_GOLD_ORE);
        List<ItemLike> GREYWACKE_REDSTONE_SMELTABLES = List.of(GreywackeBlocks.GREYWACKE_REDSTONE_ORE);
        List<ItemLike> GREYWACKE_LAPIS_SMELTABLES = List.of(GreywackeBlocks.GREYWACKE_LAPIS_ORE);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GreywackeBlocks.GREYWACKE_STONE_BUTTON.get()).pattern("A").define('A', GreywackeBlocks.GREYWACKE_BLOCK.get()).unlockedBy("has_greywacke_block", has(GreywackeBlocks.GREYWACKE_BLOCK)).save(recipeOutput);

        oreSmelting(recipeOutput, GREYWACKE_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 200, "greywacke");
        oreSmelting(recipeOutput, GREYWACKE_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 200, "greywacke");
        oreSmelting(recipeOutput, GREYWACKE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 200, "greywacke");
        oreSmelting(recipeOutput, GREYWACKE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 200, "greywacke");
        oreSmelting(recipeOutput, GREYWACKE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "greywacke");
        oreSmelting(recipeOutput, GREYWACKE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "greywacke");

        oreBlasting(recipeOutput, GREYWACKE_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 100, "greywacke");
        oreBlasting(recipeOutput, GREYWACKE_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 100, "greywacke");
        oreBlasting(recipeOutput, GREYWACKE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 100, "greywacke");
        oreBlasting(recipeOutput, GREYWACKE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 100, "greywacke");
        oreBlasting(recipeOutput, GREYWACKE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 100, "greywacke");
        oreBlasting(recipeOutput, GREYWACKE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 100, "greywacke");

        stairBuilder(GreywackeBlocks.GREYWACKE_STAIRS.get(), Ingredient.of(GreywackeBlocks.GREYWACKE_BLOCK)).group("greywacke").unlockedBy("has_greywacke_block", has(GreywackeBlocks.GREYWACKE_BLOCK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GreywackeBlocks.GREYWACKE_BLOCK_SLAB.get(), GreywackeBlocks.GREYWACKE_BLOCK.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GreywackeBlocks.GREYWACKE_BLOCK_WALL.get(), GreywackeBlocks.GREYWACKE_BLOCK.get());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GreywackeBlocks.GREYWACKE_BLOCK_SLAB.get(), GreywackeBlocks.GREYWACKE_BLOCK.get(), 2);

    }

    // ------------------------------------------------------------
    // KOMATIITE RECIPES
    // ------------------------------------------------------------
    private void buildKomatiiteRecipes(RecipeOutput recipeOutput) {

        List<ItemLike> KOMATIITE_SMELTABLES = List.of(KomatiiteBlocks.KOMATIITE_COBBLE_BLOCK);
        List<ItemLike> KOMATIITE_COAL_SMELTABLES = List.of(KomatiiteBlocks.KOMATIITE_COAL_ORE);
        List<ItemLike> KOMATIITE_COPPER_SMELTABLES = List.of(KomatiiteBlocks.KOMATIITE_COPPER_ORE);
        List<ItemLike> KOMATIITE_IRON_SMELTABLES = List.of(KomatiiteBlocks.KOMATIITE_IRON_ORE);
        List<ItemLike> KOMATIITE_GOLD_SMELTABLES = List.of(KomatiiteBlocks.KOMATIITE_GOLD_ORE);
        List<ItemLike> KOMATIITE_REDSTONE_SMELTABLES = List.of(KomatiiteBlocks.KOMATIITE_REDSTONE_ORE);
        List<ItemLike> KOMATIITE_LAPIS_SMELTABLES = List.of(KomatiiteBlocks.KOMATIITE_LAPIS_ORE);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, KomatiiteBlocks.KOMATIITE_BRICK_BLOCK.get(), 4).pattern("AA").pattern("AA").define('A', KomatiiteBlocks.KOMATIITE_BLOCK.get()).unlockedBy("has_komatiite_block", has(KomatiiteBlocks.KOMATIITE_BLOCK)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, KomatiiteBlocks.KOMATIITE_STONE_BUTTON.get()).pattern("A").define('A', KomatiiteBlocks.KOMATIITE_BLOCK.get()).unlockedBy("has_komatiite_block", has(KomatiiteBlocks.KOMATIITE_BLOCK)).save(recipeOutput);

        oreSmelting(recipeOutput, KOMATIITE_SMELTABLES, RecipeCategory.MISC, KomatiiteBlocks.KOMATIITE_BLOCK.get(), 0.25f, 200, "komatiite");
        oreSmelting(recipeOutput, KOMATIITE_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 200, "komatiite");
        oreSmelting(recipeOutput, KOMATIITE_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 200, "komatiite");
        oreSmelting(recipeOutput, KOMATIITE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 200, "komatiite");
        oreSmelting(recipeOutput, KOMATIITE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 200, "komatiite");
        oreSmelting(recipeOutput, KOMATIITE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "komatiite");
        oreSmelting(recipeOutput, KOMATIITE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "komatiite");

        oreBlasting(recipeOutput, KOMATIITE_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 100, "komatiite");
        oreBlasting(recipeOutput, KOMATIITE_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 100, "komatiite");
        oreBlasting(recipeOutput, KOMATIITE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 100, "komatiite");
        oreBlasting(recipeOutput, KOMATIITE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 100, "komatiite");
        oreBlasting(recipeOutput, KOMATIITE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 100, "komatiite");
        oreBlasting(recipeOutput, KOMATIITE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 100, "komatiite");

        stairBuilder(KomatiiteBlocks.KOMATIITE_STAIRS.get(), Ingredient.of(KomatiiteBlocks.KOMATIITE_BLOCK)).group("komatiite").unlockedBy("has_komatiite_block", has(KomatiiteBlocks.KOMATIITE_BLOCK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, KomatiiteBlocks.KOMATIITE_BLOCK_SLAB.get(), KomatiiteBlocks.KOMATIITE_BLOCK.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, KomatiiteBlocks.KOMATIITE_BLOCK_WALL.get(), KomatiiteBlocks.KOMATIITE_BLOCK.get());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, KomatiiteBlocks.KOMATIITE_BLOCK_SLAB.get(), KomatiiteBlocks.KOMATIITE_BLOCK.get(), 2);
    }

    // ------------------------------------------------------------
    // DACITE RECIPES
    // ------------------------------------------------------------
    private void buildDaciteRecipes(RecipeOutput recipeOutput) {

        List<ItemLike> DACITE_SMELTABLES = List.of(DaciteBlocks.DACITE_COBBLE_BLOCK);
        List<ItemLike> DACITE_COAL_SMELTABLES = List.of(DaciteBlocks.DACITE_COAL_ORE);
        List<ItemLike> DACITE_COPPER_SMELTABLES = List.of(DaciteBlocks.DACITE_COPPER_ORE);
        List<ItemLike> DACITE_IRON_SMELTABLES = List.of(DaciteBlocks.DACITE_IRON_ORE);
        List<ItemLike> DACITE_GOLD_SMELTABLES = List.of(DaciteBlocks.DACITE_GOLD_ORE);
        List<ItemLike> DACITE_REDSTONE_SMELTABLES = List.of(DaciteBlocks.DACITE_REDSTONE_ORE);
        List<ItemLike> DACITE_LAPIS_SMELTABLES = List.of(DaciteBlocks.DACITE_LAPIS_ORE);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DaciteBlocks.DACITE_BRICK_BLOCK.get(), 4).pattern("AA").pattern("AA").define('A', DaciteBlocks.DACITE_BLOCK.get()).unlockedBy("has_dacite_block", has(DaciteBlocks.DACITE_BLOCK)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DaciteBlocks.DACITE_STONE_BUTTON.get()).pattern("A").define('A', DaciteBlocks.DACITE_BLOCK.get()).unlockedBy("has_dacite_block", has(DaciteBlocks.DACITE_BLOCK)).save(recipeOutput);

        oreSmelting(recipeOutput, DACITE_SMELTABLES, RecipeCategory.MISC, DaciteBlocks.DACITE_BLOCK.get(), 0.25f, 200, "dacite");
        oreSmelting(recipeOutput, DACITE_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 200, "dacite");
        oreSmelting(recipeOutput, DACITE_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 200, "dacite");
        oreSmelting(recipeOutput, DACITE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 200, "dacite");
        oreSmelting(recipeOutput, DACITE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 200, "dacite");
        oreSmelting(recipeOutput, DACITE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "dacite");
        oreSmelting(recipeOutput, DACITE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "dacite");

        oreBlasting(recipeOutput, DACITE_COPPER_SMELTABLES, RecipeCategory.MISC, Items.RAW_COPPER, 0.25f, 100, "dacite");
        oreBlasting(recipeOutput, DACITE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 100, "dacite");
        oreBlasting(recipeOutput, DACITE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 100, "dacite");
        oreBlasting(recipeOutput, DACITE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 100, "dacite");
        oreBlasting(recipeOutput, DACITE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 100, "dacite");

        stairBuilder(DaciteBlocks.DACITE_STAIRS.get(), Ingredient.of(DaciteBlocks.DACITE_BLOCK)).group("dacite").unlockedBy("has_dacite_block", has(DaciteBlocks.DACITE_BLOCK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, DaciteBlocks.DACITE_BLOCK_SLAB.get(), DaciteBlocks.DACITE_BLOCK.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, DaciteBlocks.DACITE_BLOCK_WALL.get(), DaciteBlocks.DACITE_BLOCK.get());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, DaciteBlocks.DACITE_BLOCK_SLAB.get(), DaciteBlocks.DACITE_BLOCK.get(), 2);
    }

    // ------------------------------------------------------------
    // BLACK GRANITE RECIPES
    // ------------------------------------------------------------
    private void buildBlackGraniteRecipes(RecipeOutput recipeOutput) {

        List<ItemLike> BLACK_GRANITE_SMELTABLES = List.of(BlackGraniteBlocks.BLACK_GRANITE_COBBLE_BLOCK);
        List<ItemLike> BLACK_GRANITE_IRON_SMELTABLES = List.of(BlackGraniteBlocks.BLACK_GRANITE_IRON_ORE);
        List<ItemLike> BLACK_GRANITE_GOLD_SMELTABLES = List.of(BlackGraniteBlocks.BLACK_GRANITE_GOLD_ORE);
        List<ItemLike> BLACK_GRANITE_REDSTONE_SMELTABLES = List.of(BlackGraniteBlocks.BLACK_GRANITE_REDSTONE_ORE);
        List<ItemLike> BLACK_GRANITE_LAPIS_SMELTABLES = List.of(BlackGraniteBlocks.BLACK_GRANITE_LAPIS_ORE);
        List<ItemLike> BLACK_GRANITE_DIAMOND_SMELTABLES = List.of(BlackGraniteBlocks.BLACK_GRANITE_DIAMOND_ORE);
        List<ItemLike> BLACK_GRANITE_EMERALD_SMELTABLES = List.of(BlackGraniteBlocks.BLACK_GRANITE_EMERALD_ORE);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlackGraniteBlocks.BLACK_GRANITE_BRICK_BLOCK.get(), 4).pattern("AA").pattern("AA").define('A', BlackGraniteBlocks.BLACK_GRANITE_BLOCK.get()).unlockedBy("has_black_granite_block", has(BlackGraniteBlocks.BLACK_GRANITE_BLOCK)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlackGraniteBlocks.BLACK_GRANITE_STONE_BUTTON.get()).pattern("A").define('A', BlackGraniteBlocks.BLACK_GRANITE_BLOCK.get()).unlockedBy("has_black_granite_block", has(BlackGraniteBlocks.BLACK_GRANITE_BLOCK)).save(recipeOutput);

        oreSmelting(recipeOutput, BLACK_GRANITE_SMELTABLES, RecipeCategory.MISC, BlackGraniteBlocks.BLACK_GRANITE_BLOCK.get(), 0.25f, 200, "black_granite");
        oreSmelting(recipeOutput, BLACK_GRANITE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 200, "black_granite");
        oreSmelting(recipeOutput, BLACK_GRANITE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 200, "black_granite");
        oreSmelting(recipeOutput, BLACK_GRANITE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "black_granite");
        oreSmelting(recipeOutput, BLACK_GRANITE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "black_granite");
        oreSmelting(recipeOutput, BLACK_GRANITE_DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 0.25f, 200, "black_granite");
        oreSmelting(recipeOutput, BLACK_GRANITE_EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD, 0.25f, 200, "black_granite");

        oreBlasting(recipeOutput, BLACK_GRANITE_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 100, "black_granite");
        oreBlasting(recipeOutput, BLACK_GRANITE_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 100, "black_granite");
        oreBlasting(recipeOutput, BLACK_GRANITE_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 100, "black_granite");
        oreBlasting(recipeOutput, BLACK_GRANITE_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 100, "black_granite");
        oreBlasting(recipeOutput, BLACK_GRANITE_DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 0.25f, 100, "black_granite");
        oreBlasting(recipeOutput, BLACK_GRANITE_EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD, 0.25f, 100, "black_granite");

        stairBuilder(BlackGraniteBlocks.BLACK_GRANITE_STAIRS.get(), Ingredient.of(BlackGraniteBlocks.BLACK_GRANITE_BLOCK)).group("black_granite").unlockedBy("has_black_granite_block", has(BlackGraniteBlocks.BLACK_GRANITE_BLOCK)).save(recipeOutput);

        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, BlackGraniteBlocks.BLACK_GRANITE_BLOCK_SLAB.get(), BlackGraniteBlocks.BLACK_GRANITE_BLOCK.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, BlackGraniteBlocks.BLACK_GRANITE_BLOCK_WALL.get(), BlackGraniteBlocks.BLACK_GRANITE_BLOCK.get());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, BlackGraniteBlocks.BLACK_GRANITE_BLOCK_SLAB.get(), BlackGraniteBlocks.BLACK_GRANITE_BLOCK.get(), 2);
    }

    // ------------------------------------------------------------
    // GABBRO RECIPES
    // ------------------------------------------------------------
    private void buildGabbroRecipes(RecipeOutput recipeOutput) {

        List<ItemLike> GABBRO_SMELTABLES = List.of(GabbroBlocks.GABBRO_COBBLE_BLOCK);
        List<ItemLike> GABBRO_IRON_SMELTABLES = List.of(GabbroBlocks.GABBRO_IRON_ORE);
        List<ItemLike> GABBRO_GOLD_SMELTABLES = List.of(GabbroBlocks.GABBRO_GOLD_ORE);
        List<ItemLike> GABBRO_REDSTONE_SMELTABLES = List.of(GabbroBlocks.GABBRO_REDSTONE_ORE);
        List<ItemLike> GABBRO_LAPIS_SMELTABLES = List.of(GabbroBlocks.GABBRO_LAPIS_ORE);
        List<ItemLike> GABBRO_DIAMOND_SMELTABLES = List.of(GabbroBlocks.GABBRO_DIAMOND_ORE);
        List<ItemLike> GABBRO_EMERALD_SMELTABLES = List.of(GabbroBlocks.GABBRO_EMERALD_ORE);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GabbroBlocks.GABBRO_BRICK_BLOCK.get(), 4).pattern("AA").pattern("AA").define('A', GabbroBlocks.GABBRO_BLOCK.get()).unlockedBy("has_gabbro_block", has(GabbroBlocks.GABBRO_BLOCK)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GabbroBlocks.GABBRO_STONE_BUTTON.get()).pattern("A").define('A', GabbroBlocks.GABBRO_BLOCK.get()).unlockedBy("has_gabbro_block", has(GabbroBlocks.GABBRO_BLOCK)).save(recipeOutput);

        oreSmelting(recipeOutput, GABBRO_SMELTABLES, RecipeCategory.MISC, GabbroBlocks.GABBRO_BLOCK.get(), 0.25f, 200, "gabbro");
        oreSmelting(recipeOutput, GABBRO_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 200, "gabbro");
        oreSmelting(recipeOutput, GABBRO_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 200, "gabbro");
        oreSmelting(recipeOutput, GABBRO_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "gabbro");
        oreSmelting(recipeOutput, GABBRO_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "gabbro");
        oreSmelting(recipeOutput, GABBRO_DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 0.25f, 200, "gabbro");
        oreSmelting(recipeOutput, GABBRO_EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD, 0.25f, 200, "gabbro");

        oreBlasting(recipeOutput, GABBRO_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 100, "gabbro");
        oreBlasting(recipeOutput, GABBRO_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 100, "gabbro");
        oreBlasting(recipeOutput, GABBRO_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 100, "gabbro");
        oreBlasting(recipeOutput, GABBRO_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 100, "gabbro");
        oreBlasting(recipeOutput, GABBRO_DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 0.25f, 100, "gabbro");
        oreBlasting(recipeOutput, GABBRO_EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD, 0.25f, 100, "gabbro");

        stairBuilder(GabbroBlocks.GABBRO_STAIRS.get(), Ingredient.of(GabbroBlocks.GABBRO_BLOCK)).group("gabbro").unlockedBy("has_gabbro_block", has(GabbroBlocks.GABBRO_BLOCK)).save(recipeOutput);

        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GabbroBlocks.GABBRO_BLOCK_SLAB.get(), GabbroBlocks.GABBRO_BLOCK.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GabbroBlocks.GABBRO_BLOCK_WALL.get(), GabbroBlocks.GABBRO_BLOCK.get());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GabbroBlocks.GABBRO_BLOCK_SLAB.get(), GabbroBlocks.GABBRO_BLOCK.get(), 2);
    }

    // ------------------------------------------------------------
    // GNEISS RECIPES
    // ------------------------------------------------------------
    private void buildGneissRecipes(RecipeOutput recipeOutput) {

        List<ItemLike> GNEISS_SMELTABLES = List.of(GneissBlocks.GNEISS_COBBLE_BLOCK);
        List<ItemLike> GNEISS_IRON_SMELTABLES = List.of(GneissBlocks.GNEISS_IRON_ORE);
        List<ItemLike> GNEISS_GOLD_SMELTABLES = List.of(GneissBlocks.GNEISS_GOLD_ORE);
        List<ItemLike> GNEISS_REDSTONE_SMELTABLES = List.of(GneissBlocks.GNEISS_REDSTONE_ORE);
        List<ItemLike> GNEISS_LAPIS_SMELTABLES = List.of(GneissBlocks.GNEISS_LAPIS_ORE);
        List<ItemLike> GNEISS_DIAMOND_SMELTABLES = List.of(GneissBlocks.GNEISS_DIAMOND_ORE);
        List<ItemLike> GNEISS_EMERALD_SMELTABLES = List.of(GneissBlocks.GNEISS_EMERALD_ORE);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GneissBlocks.GNEISS_BRICK_BLOCK.get(), 4).pattern("AA").pattern("AA").define('A', GneissBlocks.GNEISS_BLOCK.get()).unlockedBy("has_gneiss_block", has(GneissBlocks.GNEISS_BLOCK)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GneissBlocks.GNEISS_STONE_BUTTON.get()).pattern("A").define('A', GneissBlocks.GNEISS_BLOCK.get()).unlockedBy("has_gneiss_block", has(GneissBlocks.GNEISS_BLOCK)).save(recipeOutput);

        oreSmelting(recipeOutput, GNEISS_SMELTABLES, RecipeCategory.MISC, GneissBlocks.GNEISS_BLOCK.get(), 0.25f, 200, "gneiss");
        oreSmelting(recipeOutput, GNEISS_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 200, "gneiss");
        oreSmelting(recipeOutput, GNEISS_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 200, "gneiss");
        oreSmelting(recipeOutput, GNEISS_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "gneiss");
        oreSmelting(recipeOutput, GNEISS_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "gneiss");
        oreSmelting(recipeOutput, GNEISS_DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 0.25f, 200, "gneiss");
        oreSmelting(recipeOutput, GNEISS_EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD, 0.25f, 200, "gneiss");

        oreBlasting(recipeOutput, GNEISS_IRON_SMELTABLES, RecipeCategory.MISC, Items.RAW_IRON, 0.25f, 100, "gneiss");
        oreBlasting(recipeOutput, GNEISS_GOLD_SMELTABLES, RecipeCategory.MISC, Items.RAW_GOLD, 0.25f, 100, "gneiss");
        oreBlasting(recipeOutput, GNEISS_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 100, "gneiss");
        oreBlasting(recipeOutput, GNEISS_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 100, "gneiss");
        oreBlasting(recipeOutput, GNEISS_DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 0.25f, 100, "gneiss");
        oreBlasting(recipeOutput, GNEISS_EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD, 0.25f, 100, "gneiss");

        stairBuilder(GneissBlocks.GNEISS_STAIRS.get(), Ingredient.of(GneissBlocks.GNEISS_BLOCK)).group("gneiss").unlockedBy("has_gneiss_block", has(GneissBlocks.GNEISS_BLOCK)).save(recipeOutput);

        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GneissBlocks.GNEISS_BLOCK_SLAB.get(), GneissBlocks.GNEISS_BLOCK.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GneissBlocks.GNEISS_BLOCK_WALL.get(), GneissBlocks.GNEISS_BLOCK.get());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GneissBlocks.GNEISS_BLOCK_SLAB.get(), GneissBlocks.GNEISS_BLOCK.get(), 2);
    }
}
