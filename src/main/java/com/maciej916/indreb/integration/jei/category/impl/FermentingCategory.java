package com.maciej916.indreb.integration.jei.category.impl;

import com.maciej916.indreb.common.block.ModBlocks;
import com.maciej916.indreb.common.config.impl.ServerConfig;
import com.maciej916.indreb.common.recipe.ModRecipeSerializer;
import com.maciej916.indreb.common.recipe.impl.FermentingRecipe;
import com.maciej916.indreb.common.util.GuiUtil;
import com.maciej916.indreb.integration.jei.category.AbstractRecipeCategory;
import com.mojang.blaze3d.vertex.PoseStack;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.forge.ForgeTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawableAnimated;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

import static com.maciej916.indreb.common.util.Constants.*;

public class FermentingCategory extends AbstractRecipeCategory<FermentingRecipe> {

    public static final ResourceLocation UID = ModRecipeSerializer.FERMENTING.getId();

    private IDrawableAnimated progress;
    private IDrawableAnimated energy;

    public FermentingCategory(IGuiHelper guiHelper) {
        super(
                FermentingRecipe.class,
                UID,
                "fermenting",
                guiHelper,
                () -> guiHelper.createDrawable(JEI_LARGE_2, 0, 110, 152, 54),
                () -> guiHelper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.FERMENTER.get()))
        );
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, FermentingRecipe recipe, IFocusGroup focuses) {
        this.progress = guiHelper.drawableBuilder(PROCESS, 25, 0, 24, 16).buildAnimated(recipe.getDuration(), IDrawableAnimated.StartDirection.LEFT, false);
        this.energy = guiHelper.drawableBuilder(JEI, 249, 0, 7, 37).buildAnimated(200, IDrawableAnimated.StartDirection.TOP, true);

        builder.addSlot(RecipeIngredientRole.CATALYST, 11, 12)
                .setFluidRenderer(ServerConfig.fermenter_fluid_input_capacity.get(), false, 8, 29)
                .addIngredient(ForgeTypes.FLUID_STACK, recipe.getFluidInput());

        builder.addSlot(RecipeIngredientRole.OUTPUT, 67, 12)
                .setFluidRenderer(ServerConfig.fermenter_fluid_output_capacity.get(), false, 8, 29)
                .addIngredient(ForgeTypes.FLUID_STACK, recipe.getFluidOutput());

        builder.addSlot(RecipeIngredientRole.OUTPUT, halfX + 20, 19).addItemStack(recipe.getWasteOutput());
    }

    @Override
    public void draw(FermentingRecipe recipe, IRecipeSlotsView recipeSlotsView, GuiGraphics guiGraphics, double mouseX, double mouseY) {
        this.progress.draw(guiGraphics, halfX - 45, 19);
        this.energy.draw(guiGraphics, halfX + 58, 7);

        if (recipe.getExperience() > 0) {
            GuiUtil.renderScaled(guiGraphics, recipe.getExperience() + " XP", 0, 0, 0.75f, 0x7E7E7E, false);
        }

        GuiUtil.renderScaled(guiGraphics, recipe.getTickEnergyCost() + " IE/T", 0, 48, 0.75f, 0x7E7E7E, false);
    }
}
