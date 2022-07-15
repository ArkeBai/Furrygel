
package net.mcreator.furrymod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.furrymod.itemgroup.FurryToolsItemGroup;
import net.mcreator.furrymod.FurrymodModElements;

@FurrymodModElements.ModElement.Tag
public class GelKeyItem extends FurrymodModElements.ModElement {
	@ObjectHolder("furrymod:gel_key")
	public static final Item block = null;

	public GelKeyItem(FurrymodModElements instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(FurryToolsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("gel_key");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
