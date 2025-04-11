package net.chookoo.thedevilsreject.datagen;

import net.chookoo.thedevilsreject.block.ModBlocks;
import net.chookoo.thedevilsreject.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.QUESTION_MARK_BLOCK)
                .pattern("QQQ")
                .pattern("QQQ")
                .pattern("QQQ")
                .input('Q', ModItems.QUESTION_MARK)
                .criterion(hasItem(ModItems.QUESTION_MARK), conditionsFromItem(ModItems.QUESTION_MARK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.QUESTION_MARK_BLOCK2)
                .pattern("QQQ")
                .pattern("QQQ")
                .pattern("QQQ")
                .input('Q', ModBlocks.QUESTION_MARK_BLOCK)
                .criterion(hasItem(ModBlocks.QUESTION_MARK_BLOCK2), conditionsFromItem(ModBlocks.QUESTION_MARK_BLOCK2))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.QUESTION_MARK, 9)
                .input(ModBlocks.QUESTION_MARK_BLOCK)
                .criterion(hasItem(ModBlocks.QUESTION_MARK_BLOCK), conditionsFromItem(ModBlocks.QUESTION_MARK_BLOCK))
                .offerTo(exporter);

    }
}
