package net.unbreakabletools.mod.tools;

import net.minecraft.item.ItemSword;
import net.unbreakabletools.mod.Reference;
import net.unbreakabletools.mod.UnbreakableTools;

public class ItemGodStoneSword extends ItemSword {

	public ItemGodStoneSword(ToolMaterial material) {
		super(material);
        setUnlocalizedName(Reference.UTItems.GOD_STONE_SWORD.getUnlocalizedName());
        setRegistryName(Reference.UTItems.GOD_STONE_SWORD.getRegistryName());
        setCreativeTab(UnbreakableTools.MAIN_TAB);
        setMaxStackSize(1);
	}

}
