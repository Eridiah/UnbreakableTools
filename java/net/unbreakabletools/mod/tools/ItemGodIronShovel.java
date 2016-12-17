package net.unbreakabletools.mod.tools;

import net.minecraft.item.ItemSpade;
import net.unbreakabletools.mod.Reference;
import net.unbreakabletools.mod.UnbreakableTools;


public class ItemGodIronShovel extends ItemSpade {

	public ItemGodIronShovel(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.UTItems.GOD_IRON_SHOVEL.getUnlocalizedName());
		setRegistryName(Reference.UTItems.GOD_IRON_SHOVEL.getRegistryName());
		setCreativeTab(UnbreakableTools.MAIN_TAB);
		setMaxStackSize(1);
	}

}
