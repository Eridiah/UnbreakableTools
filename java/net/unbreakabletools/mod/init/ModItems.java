package net.unbreakabletools.mod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.unbreakabletools.mod.tools.ItemGodDiamondAxe;
import net.unbreakabletools.mod.tools.ItemGodDiamondHoe;
import net.unbreakabletools.mod.tools.ItemGodDiamondPickaxe;
import net.unbreakabletools.mod.tools.ItemGodDiamondShovel;
import net.unbreakabletools.mod.tools.ItemGodDiamondSword;
import net.unbreakabletools.mod.tools.ItemGodGoldAxe;
import net.unbreakabletools.mod.tools.ItemGodGoldHoe;
import net.unbreakabletools.mod.tools.ItemGodGoldPickaxe;
import net.unbreakabletools.mod.tools.ItemGodGoldShovel;
import net.unbreakabletools.mod.tools.ItemGodGoldSword;
import net.unbreakabletools.mod.tools.ItemGodIronAxe;
import net.unbreakabletools.mod.tools.ItemGodIronHoe;
import net.unbreakabletools.mod.tools.ItemGodIronPickaxe;
import net.unbreakabletools.mod.tools.ItemGodIronShovel;
import net.unbreakabletools.mod.tools.ItemGodIronSword;
import net.unbreakabletools.mod.tools.ItemGodStoneAxe;
import net.unbreakabletools.mod.tools.ItemGodStoneHoe;
import net.unbreakabletools.mod.tools.ItemGodStonePickaxe;
import net.unbreakabletools.mod.tools.ItemGodStoneShovel;
import net.unbreakabletools.mod.tools.ItemGodStoneSword;
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
	
	//Stone Tools
	public static Item godstonesword;
	public static Item godstoneshovel;
	public static Item godstonepickaxe;
	public static Item godstoneaxe;
	public static Item godstonehoe;
	
	//Iron Tools
	public static Item godironsword;
	public static Item godironshovel;
	public static Item godironpickaxe;
	public static Item godironaxe;
	public static Item godironhoe;
	
	//Diamond Tools
	public static Item goddiamondsword;
	public static Item goddiamondshovel;
	public static Item goddiamondpickaxe;
	public static Item goddiamondaxe;
	public static Item goddiamondhoe;
	
	//Gold Tools
	public static Item godgoldsword;
	public static Item godgoldshovel;
	public static Item godgoldpickaxe;
	public static Item godgoldaxe;
	public static Item godgoldhoe;
	
	//Other Tools
	
	
	public static void init() {
		//Wood
		godwoodensword = new ItemGodWoodenSword(GOD_MATERIAL_WOOD);
		godwoodenshovel = new ItemGodWoodenShovel(GOD_MATERIAL_WOOD);
		godwoodenpickaxe = new ItemGodWoodenPickaxe(GOD_MATERIAL_WOOD);
		godwoodenaxe = new ItemGodWoodenAxe(GOD_MATERIAL_WOOD);
		godwoodenhoe = new ItemGodWoodenHoe(GOD_MATERIAL_WOOD);
		
		//Stone
		godstonesword = new ItemGodStoneSword(GOD_MATERIAL_STONE);
		godstoneshovel = new ItemGodStoneShovel(GOD_MATERIAL_STONE);
		godstonepickaxe = new ItemGodStonePickaxe(GOD_MATERIAL_STONE);
		godstoneaxe = new ItemGodStoneAxe(GOD_MATERIAL_STONE);
		godstonehoe = new ItemGodStoneHoe(GOD_MATERIAL_STONE);
		
		//Iron
		godironsword = new ItemGodIronSword(GOD_MATERIAL_IRON);
		godironshovel = new ItemGodIronShovel(GOD_MATERIAL_IRON);
		godironpickaxe = new ItemGodIronPickaxe(GOD_MATERIAL_IRON);
		godironaxe = new ItemGodIronAxe(GOD_MATERIAL_IRON);
		godironhoe = new ItemGodIronHoe(GOD_MATERIAL_IRON);
		
		//Diamond
		goddiamondsword = new ItemGodDiamondSword(GOD_MATERIAL_DIAMOND);
		goddiamondshovel = new ItemGodDiamondShovel(GOD_MATERIAL_DIAMOND);
		goddiamondpickaxe = new ItemGodDiamondPickaxe(GOD_MATERIAL_DIAMOND);
		goddiamondaxe = new ItemGodDiamondAxe(GOD_MATERIAL_DIAMOND);
		goddiamondhoe = new ItemGodDiamondHoe(GOD_MATERIAL_DIAMOND);
		
		//Gold
		godgoldsword = new ItemGodGoldSword(GOD_MATERIAL_GOLD);
		godgoldshovel = new ItemGodGoldShovel(GOD_MATERIAL_GOLD);
		godgoldpickaxe = new ItemGodGoldPickaxe(GOD_MATERIAL_GOLD);
		godgoldaxe = new ItemGodGoldAxe(GOD_MATERIAL_GOLD);
		godgoldhoe = new ItemGodGoldHoe(GOD_MATERIAL_GOLD);
	}
	
	public static void register() {
		//Wood
		GameRegistry.register(godwoodensword);
		GameRegistry.register(godwoodenshovel);
		GameRegistry.register(godwoodenpickaxe);
		GameRegistry.register(godwoodenaxe);
		GameRegistry.register(godwoodenhoe);
		
		//Stone
		GameRegistry.register(godstonesword);
		GameRegistry.register(godstoneshovel);
		GameRegistry.register(godstonepickaxe);
		GameRegistry.register(godstoneaxe);
		GameRegistry.register(godstonehoe);
		
		//Iron
		GameRegistry.register(godironsword);
		GameRegistry.register(godironshovel);
		GameRegistry.register(godironpickaxe);
		GameRegistry.register(godironaxe);
		GameRegistry.register(godironhoe);
		
		//Diamond
		GameRegistry.register(goddiamondsword);
		GameRegistry.register(goddiamondshovel);
		GameRegistry.register(goddiamondpickaxe);
		GameRegistry.register(goddiamondaxe);
		GameRegistry.register(goddiamondhoe);
		
		//Gold
		GameRegistry.register(godgoldsword);
		GameRegistry.register(godgoldshovel);
		GameRegistry.register(godgoldpickaxe);
		GameRegistry.register(godgoldaxe);
		GameRegistry.register(godgoldhoe);
	}
	
	public static void registerRenders() {
		//Wood
		registerRender(godwoodensword);
		registerRender(godwoodenshovel);
		registerRender(godwoodenpickaxe);
		registerRender(godwoodenaxe);
		registerRender(godwoodenhoe);
		
		//Stone
		registerRender(godstonesword);
		registerRender(godstoneshovel);
		registerRender(godstonepickaxe);
		registerRender(godstoneaxe);
		registerRender(godstonehoe);
		
		//Iron
		registerRender(godironsword);
		registerRender(godironshovel);
		registerRender(godironpickaxe);
		registerRender(godironaxe);
		registerRender(godironhoe);
		
		//Diamond
		registerRender(goddiamondsword);
		registerRender(goddiamondshovel);
		registerRender(goddiamondpickaxe);
		registerRender(goddiamondaxe);
		registerRender(goddiamondhoe);
		
		//Gold
		registerRender(godgoldsword);
		registerRender(godgoldshovel);
		registerRender(godgoldpickaxe);
		registerRender(godgoldaxe);
		registerRender(godgoldhoe);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
