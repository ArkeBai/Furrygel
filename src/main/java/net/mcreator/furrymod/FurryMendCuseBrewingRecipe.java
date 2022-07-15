
package net.mcreator.furrymod;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.ItemStack;

import net.mcreator.furrymod.item.GelItem;
import net.mcreator.furrymod.item.FurryMendItem;
import net.mcreator.furrymod.item.BottenItem;

@FurrymodModElements.ModElement.Tag
public class FurryMendCuseBrewingRecipe extends FurrymodModElements.ModElement {
	public FurryMendCuseBrewingRecipe(FurrymodModElements instance) {
		super(instance, 35);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}

	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			return input.getItem() == BottenItem.block;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == GelItem.block;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return new ItemStack(FurryMendItem.block);
			}
			return ItemStack.EMPTY;
		}
	}
}
