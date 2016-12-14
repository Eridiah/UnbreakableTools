package net.unbreakabletools.mod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.unbreakabletools.mod.tools.ItemGodWoodenAxe;
import net.unbreakabletools.mod.tools.ItemGodWoodenHoe;
import net.unbreakabletools.mod.tools.ItemGodWoodenPickaxe;
import net.unbreakabletools.mod.tools.ItemGodWoodenShovel;
import net.unbreakabletools.mod.tools.ItemGodWoodenSword;

public class ModItems {
	
	//Tool Materials
	public static ToolMaterial GOD_MATERIAL_WOOD = EnumHelper.addToolMaterial("god_material_wood", 0, 0, 2.0f, 0.0f, 15);
	public static ToolMaterial GOD_MATERIAL_STONE = EnumHelper.addToolMaterial("god_material_stone", 1, 0, 4.0f, 1.0f, 5);
	public static ToolMaterial GOD_MATERIAL_IRON = EnumHelper.addToolMaterial("god_material_iron", 2, 0, 6.0f, 2.0f, 14);
	public static ToolMaterial GOD_MATERIAL_GOLD = EnumHelper.addToolMaterial("god_material_gold", 0, 0, 12.0f, 0.0f, 22);
	public static ToolMaterial GOD_MATERIAL_DIAMOND = EnumHelper.addToolMaterial("god_material_diamond", 3, 0, 8.0f, 3.0f, 10);
	
	//Wooden Tools
	public static Item godwoodensword;
	public static Item godwoodenshovel;
	public static Item godwoodenpickaxe;
	public static Item godwoodenaxe;
	public static Item godwoodenhoe;
	
	public static void init() {
		//Wood
		godwoodensword = new ItemGodWoodenSword(GOD_MATERIAL_WOOD);
		godwoodenshovel = new ItemGodWoodenShovel(GOD_MATERIAL_WOOD);
		godwoodenpickaxe = new ItemGodWoodenPickaxe(GOD_MATERIAL_WOOD);
		godwoodenaxe = new ItemGodWoodenAxe(GOD_MATERIAL_WOOD);
		godwoodenhoe = new ItemGodWoodenHoe(GOD_MATERIAL_WOOD);
	}
	
	public static void register() {
		//Wood
		GameRegistry.register(godwoodensword);
		GameRegistry.register(godwoodenshovel);
		GameRegistry.register(godwoodenpickaxe);
		GameRegistry.register(godwoodenaxe);
		GameRegistry.register(godwoodenhoe);
	}
	
	public static void registerRenders() {
		//Wood
		registerRender(godwoodensword);
		registerRender(godwoodenshovel);
		registerRender(godwoodenpickaxe);
		registerRender(godwoodenaxe);
		registerRender(godwoodenhoe);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
