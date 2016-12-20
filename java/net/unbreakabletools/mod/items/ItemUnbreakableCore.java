package net.unbreakabletools.mod.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.unbreakabletools.mod.Reference;
import net.unbreakabletools.mod.UnbreakableTools;

public class ItemUnbreakableCore extends Item {

	public ItemUnbreakableCore() {
		setUnlocalizedName(Reference.UTItems.UNBREAKABLE_CORE.getUnlocalizedName());
		setRegistryName(Reference.UTItems.UNBREAKABLE_CORE.getRegistryName());
		setCreativeTab(UnbreakableTools.MAIN_TAB);
	}
	
	@Override
	public boolean hasEffect(ItemStack stack) {
		return true;
	}
	
}
