package net.unbreakabletools.mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.unbreakabletools.mod.init.ModItems;

public class MainTab extends CreativeTabs {

	public MainTab() {
		super("tabmain");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.godwoodenpickaxe);
	}

}
