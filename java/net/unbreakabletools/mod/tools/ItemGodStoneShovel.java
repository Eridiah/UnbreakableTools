package net.unbreakabletools.mod.tools;

import net.minecraft.item.ItemSpade;
import net.unbreakabletools.mod.Reference;
import net.unbreakabletools.mod.UnbreakableTools;

public class ItemGodStoneShovel extends ItemSpade {

	public ItemGodStoneShovel(ToolMaterial material) {
		super(material);
        setUnlocalizedName(Reference.UTItems.GOD_STONE_SHOVEL.getUnlocalizedName());
        setRegistryName(Reference.UTItems.GOD_STONE_SHOVEL.getRegistryName());
        setCreativeTab(UnbreakableTools.MAIN_TAB);
        setMaxStackSize(1);
	}

}
