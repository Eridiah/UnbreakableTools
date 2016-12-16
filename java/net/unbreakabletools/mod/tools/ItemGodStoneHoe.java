package net.unbreakabletools.mod.tools;

import net.minecraft.item.ItemHoe;
import net.unbreakabletools.mod.Reference;
import net.unbreakabletools.mod.UnbreakableTools;

public class ItemGodStoneHoe extends ItemHoe {

	public ItemGodStoneHoe(ToolMaterial material) {
		super(material);
        setUnlocalizedName(Reference.UTItems.GOD_STONE_HOE.getUnlocalizedName());
        setRegistryName(Reference.UTItems.GOD_STONE_HOE.getRegistryName());
        setCreativeTab(UnbreakableTools.MAIN_TAB);
        setMaxStackSize(1);
	}

}
