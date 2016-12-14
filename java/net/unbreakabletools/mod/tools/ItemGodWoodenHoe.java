package net.unbreakabletools.mod.tools;

import net.minecraft.item.ItemHoe;
import net.unbreakabletools.mod.Reference;
import net.unbreakabletools.mod.UnbreakableTools;

public class ItemGodWoodenHoe extends ItemHoe {

	public ItemGodWoodenHoe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.UTItems.GOD_WOODEN_HOE.getUnlocalizedName());
		setRegistryName(Reference.UTItems.GOD_WOODEN_HOE.getRegistryName());
		setCreativeTab(UnbreakableTools.MAIN_TAB);
		setMaxStackSize(1);
	}

}
