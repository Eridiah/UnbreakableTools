package net.unbreakabletools.mod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void register() {
		//Wood Tools
		GameRegistry.addRecipe(new ItemStack(ModItems.godwoodensword), " U ", "USU", " U ", 'U', ModItems.unbreakablecore, 'S', Items.WOODEN_SWORD);
		GameRegistry.addRecipe(new ItemStack(ModItems.godwoodenshovel), " U ", "USU", " U ", 'U', ModItems.unbreakablecore, 'S', Items.WOODEN_SHOVEL);
		GameRegistry.addRecipe(new ItemStack(ModItems.godwoodenpickaxe), " U ", "UPU", " U ", 'U', ModItems.unbreakablecore, 'P', Items.WOODEN_PICKAXE);
		GameRegistry.addRecipe(new ItemStack(ModItems.godwoodenaxe), " U ", "UAU", " U ", 'U', ModItems.unbreakablecore, 'A', Items.WOODEN_AXE);
		GameRegistry.addRecipe(new ItemStack(ModItems.godwoodenhoe), " U ", "UHU", " U ", 'U', ModItems.unbreakablecore, 'H', Items.WOODEN_HOE);
		
		//Stone Tools
		GameRegistry.addRecipe(new ItemStack(ModItems.godstonesword), " U ", "USU", " U ", 'U', ModItems.unbreakablecore, 'S', Items.STONE_SWORD);
		GameRegistry.addRecipe(new ItemStack(ModItems.godstoneshovel), " U ", "USU", " U ", 'U', ModItems.unbreakablecore, 'S', Items.STONE_SHOVEL);
		GameRegistry.addRecipe(new ItemStack(ModItems.godstonepickaxe), " U ", "UPU", " U ", 'U', ModItems.unbreakablecore, 'P', Items.STONE_PICKAXE);
		GameRegistry.addRecipe(new ItemStack(ModItems.godstoneaxe), " U ", "UAU", " U ", 'U', ModItems.unbreakablecore, 'A', Items.STONE_AXE);
		GameRegistry.addRecipe(new ItemStack(ModItems.godstonehoe), " U ", "UHU", " U ", 'U', ModItems.unbreakablecore, 'H', Items.STONE_HOE);
		
		//Iron Tools
		GameRegistry.addRecipe(new ItemStack(ModItems.godironsword), " U ", "USU", " U ", 'U', ModItems.unbreakablecore, 'S', Items.IRON_SWORD);
		GameRegistry.addRecipe(new ItemStack(ModItems.godironshovel), " U ", "USU", " U ", 'U', ModItems.unbreakablecore, 'S', Items.IRON_SHOVEL);
		GameRegistry.addRecipe(new ItemStack(ModItems.godironpickaxe), " U ", "UPU", " U ", 'U', ModItems.unbreakablecore, 'P', Items.IRON_PICKAXE);
		GameRegistry.addRecipe(new ItemStack(ModItems.godironaxe), " U ", "UAU", " U ", 'U', ModItems.unbreakablecore, 'A', Items.IRON_AXE);
		GameRegistry.addRecipe(new ItemStack(ModItems.godironhoe), " U ", "UHU", " U ", 'U', ModItems.unbreakablecore, 'H', Items.IRON_HOE);
		
		//Diamond Tools
		GameRegistry.addRecipe(new ItemStack(ModItems.goddiamondsword), " U ", "USU", " U ", 'U', ModItems.unbreakablecore, 'S', Items.DIAMOND_SWORD);
		GameRegistry.addRecipe(new ItemStack(ModItems.goddiamondshovel), " U ", "USU", " U ", 'U', ModItems.unbreakablecore, 'S', Items.DIAMOND_SHOVEL);
		GameRegistry.addRecipe(new ItemStack(ModItems.goddiamondpickaxe), " U ", "UPU", " U ", 'U', ModItems.unbreakablecore, 'P', Items.DIAMOND_PICKAXE);
		GameRegistry.addRecipe(new ItemStack(ModItems.goddiamondaxe), " U ", "UAU", " U ", 'U', ModItems.unbreakablecore, 'A', Items.DIAMOND_AXE);
		GameRegistry.addRecipe(new ItemStack(ModItems.goddiamondhoe), " U ", "UHU", " U ", 'U', ModItems.unbreakablecore, 'H', Items.DIAMOND_HOE);
		
		//Gold Tools
		GameRegistry.addRecipe(new ItemStack(ModItems.godgoldsword), " U ", "USU", " U ", 'U', ModItems.unbreakablecore, 'S', Items.GOLDEN_SWORD);
		GameRegistry.addRecipe(new ItemStack(ModItems.godgoldshovel), " U ", "USU", " U ", 'U', ModItems.unbreakablecore, 'S', Items.GOLDEN_SHOVEL);
		GameRegistry.addRecipe(new ItemStack(ModItems.godgoldpickaxe), " U ", "UPU", " U ", 'U', ModItems.unbreakablecore, 'P', Items.GOLDEN_PICKAXE);
		GameRegistry.addRecipe(new ItemStack(ModItems.godgoldaxe), " U ", "UAU", " U ", 'U', ModItems.unbreakablecore, 'A', Items.GOLDEN_AXE);
		GameRegistry.addRecipe(new ItemStack(ModItems.godgoldhoe), " U ", "UHU", " U ", 'U', ModItems.unbreakablecore, 'H', Items.GOLDEN_HOE);
		
		//Items
		GameRegistry.addRecipe(new ItemStack(ModItems.unbreakablecore, 8), "DDD", "DND", "DDD", 'D', Blocks.DIAMOND_BLOCK, 'N', Items.NETHER_STAR);
	}
	
}
