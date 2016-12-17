package net.unbreakabletools.mod.tools;

import net.minecraft.item.ItemPickaxe;
import net.unbreakabletools.mod.Reference;
import net.unbreakabletools.mod.UnbreakableTools;

public class ItemGodGoldPickaxe extends ItemPickaxe {

	public ItemGodGoldPickaxe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.UTItems.GOD_GOLD_PICKAXE.getUnlocalizedName());
		setRegistryName(Reference.UTItems.GOD_GOLD_PICKAXE.getRegistryName());
		setCreativeTab(UnbreakableTools.MAIN_TAB);
		setMaxStackSize(1);
	}

}
