package net.unbreakabletools.mod.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.unbreakabletools.mod.Reference;

public class ItemGodPickaxe extends ItemPickaxe {

	public ItemGodPickaxe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.UTItems.GOD_PICKAXE.getUnlocalizedName());
		setRegistryName(Reference.UTItems.GOD_PICKAXE.getRegistryName());
		setCreativeTab(CreativeTabs.TOOLS);
		setMaxStackSize(1);
	}

}
