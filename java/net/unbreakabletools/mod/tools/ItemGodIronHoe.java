package net.unbreakabletools.mod.tools;

import net.minecraft.item.ItemHoe;
import net.unbreakabletools.mod.Reference;
import net.unbreakabletools.mod.UnbreakableTools;

public class ItemGodIronHoe extends ItemHoe {

	public ItemGodIronHoe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.UTItems.GOD_IRON_HOE.getUnlocalizedName());
		setRegistryName(Reference.UTItems.GOD_IRON_HOE.getRegistryName());
		setCreativeTab(UnbreakableTools.MAIN_TAB);
		setMaxStackSize(1);
	}

}
