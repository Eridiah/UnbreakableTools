package net.unbreakabletools.mod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.unbreakabletools.mod.items.ItemTestItem;
import net.unbreakabletools.mod.tools.ItemGodPickaxe;

public class ModItems {
	
	//Tool Materials
	public static ToolMaterial GOD_MATERIAL = EnumHelper.addToolMaterial("god_material", 3, 0, 8.0f, 6.0f, 10);
	
	public static Item godpickaxe;

	public static Item testitem;
	
	public static void init() {
		testitem = new ItemTestItem();
		godpickaxe = new ItemGodPickaxe(GOD_MATERIAL);
	}
	
	public static void register() {
		GameRegistry.register(testitem);
		GameRegistry.register(godpickaxe);
	}
	
	public static void registerRenders() {
		registerRender(testitem);
		registerRender(godpickaxe);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
