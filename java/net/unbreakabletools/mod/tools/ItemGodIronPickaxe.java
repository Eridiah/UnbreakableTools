package net.unbreakabletools.mod.tools;

import net.minecraft.item.ItemPickaxe;
import net.unbreakabletools.mod.Reference;
import net.unbreakabletools.mod.UnbreakableTools;

public class ItemGodIronPickaxe extends ItemPickaxe {

	public ItemGodIronPickaxe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.UTItems.GOD_IRON_PICKAXE.getUnlocalizedName());
		setRegistryName(Reference.UTItems.GOD_IRON_PICKAXE.getRegistryName());
		setCreativeTab(UnbreakableTools.MAIN_TAB);
		setMaxStackSize(1);
	}

}
