package com.Uebbels.modulararmor.datagen;


import com.Uebbels.modulararmor.util.RegistryHandler;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Items;

import java.util.function.Consumer;

public class Recipes extends RecipeProvider {

    public Recipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shapedRecipe(RegistryHandler.EMERALD_CHESTPLATE.get())
                .patternLine("# #")
                .patternLine("###")
                .patternLine("###")
                .key('#', Items.EMERALD)
                .setGroup("combat")
                .addCriterion("firstitem", InventoryChangeTrigger.Instance.forItems(RegistryHandler.EMERALD_CHESTPLATE.get()))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(RegistryHandler.EMERALD_LEGGINGS.get())
                .patternLine("###")
                .patternLine("# #")
                .patternLine("# #")
                .key('#', Items.EMERALD)
                .setGroup("combat")
                .addCriterion("firstitem", InventoryChangeTrigger.Instance.forItems(RegistryHandler.EMERALD_LEGGINGS.get()))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(RegistryHandler.EMERALD_HELMET.get())
                .patternLine("###")
                .patternLine("# #")
                .key('#', Items.EMERALD)
                .setGroup("combat")
                .addCriterion("firstitem", InventoryChangeTrigger.Instance.forItems(RegistryHandler.EMERALD_HELMET.get()))
                .build(consumer);
        ShapedRecipeBuilder.shapedRecipe(RegistryHandler.EMERALD_BOOTS.get())
                .patternLine("# #")
                .patternLine("# #")
                .key('#', Items.EMERALD)
                .setGroup("combat")
                .addCriterion("firstitem", InventoryChangeTrigger.Instance.forItems(RegistryHandler.EMERALD_BOOTS.get()))
                .build(consumer);

    }
}
