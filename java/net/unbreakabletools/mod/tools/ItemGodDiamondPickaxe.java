package net.unbreakabletools.mod.tools;

import net.minecraft.item.ItemPickaxe;
import net.unbreakabletools.mod.Reference;
import net.unbreakabletools.mod.UnbreakableTools;

public class ItemGodDiamondPickaxe extends ItemPickaxe {

	public ItemGodDiamondPickaxe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.UTItems.GOD_DIAMOND_PICKAXE.getUnlocalizedName());
		setRegistryName(Reference.UTItems.GOD_DIAMOND_PICKAXE.getRegistryName());
		setCreativeTab(UnbreakableTools.MAIN_TAB);
		setMaxStackSize(1);
	}

}
