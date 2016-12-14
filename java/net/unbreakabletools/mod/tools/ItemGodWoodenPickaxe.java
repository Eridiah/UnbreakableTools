package net.unbreakabletools.mod.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.unbreakabletools.mod.Reference;
import net.unbreakabletools.mod.UnbreakableTools;

public class ItemGodWoodenPickaxe extends ItemPickaxe {

	public ItemGodWoodenPickaxe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.UTItems.GOD_WOODEN_PICKAXE.getUnlocalizedName());
		setRegistryName(Reference.UTItems.GOD_WOODEN_PICKAXE.getRegistryName());
		setCreativeTab(UnbreakableTools.MAIN_TAB);
		setMaxStackSize(1);
	}

}
