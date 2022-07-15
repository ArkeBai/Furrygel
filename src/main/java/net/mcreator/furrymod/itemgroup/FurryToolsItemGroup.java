
package net.mcreator.furrymod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.furrymod.block.GelConveyorDoorHousingBlock;
import net.mcreator.furrymod.FurrymodModElements;

@FurrymodModElements.ModElement.Tag
public class FurryToolsItemGroup extends FurrymodModElements.ModElement {
	public FurryToolsItemGroup(FurrymodModElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabfurry_tools") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(GelConveyorDoorHousingBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
