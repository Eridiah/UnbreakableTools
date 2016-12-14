package net.unbreakabletools.mod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.unbreakabletools.mod.Reference;

public class ItemTestItem extends Item {

	public ItemTestItem() {
		setUnlocalizedName(Reference.UTItems.TEST_ITEM.getUnlocalizedName());
		setRegistryName(Reference.UTItems.TEST_ITEM.getRegistryName());
		setCreativeTab(CreativeTabs.MISC);
	}
	
}
