package net.unbreakabletools.mod.tools;

import net.minecraft.item.ItemHoe;
import net.unbreakabletools.mod.Reference;
import net.unbreakabletools.mod.UnbreakableTools;

public class ItemGodDiamondHoe extends ItemHoe {

	public ItemGodDiamondHoe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.UTItems.GOD_DIAMOND_HOE.getUnlocalizedName());
		setRegistryName(Reference.UTItems.GOD_DIAMOND_HOE.getRegistryName());
		setCreativeTab(UnbreakableTools.MAIN_TAB);
		setMaxStackSize(1);
	}

}
