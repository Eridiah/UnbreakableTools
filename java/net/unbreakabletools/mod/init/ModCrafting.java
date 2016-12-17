package net.unbreakabletools.mod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void register() {
		//Wood Tools
		GameRegistry.addRecipe(new ItemStack(ModItems.godwoodensword), "DND", "DSD", "DDD", 'D', Items.DIAMOND, 'N', Items.NETHER_STAR, 'S', Items.WOODEN_SWORD);
		GameRegistry.addRecipe(new ItemStack(ModItems.godwoodenshovel), "DND", "DSD", "DDD", 'D', Items.DIAMOND, 'N', Items.NETHER_STAR, 'S', Items.WOODEN_SHOVEL);
		GameRegistry.addRecipe(new ItemStack(ModItems.godwoodenpickaxe), "DND", "DPD", "DDD", 'D', Items.DIAMOND, 'N', Items.NETHER_STAR, 'P', Items.WOODEN_PICKAXE);
		GameRegistry.addRecipe(new ItemStack(ModItems.godwoodenaxe), "DND", "DAD", "DDD", 'A', Items.WOODEN_AXE, 'D', Items.DIAMOND, 'N', Items.NETHER_STAR);
		GameRegistry.addRecipe(new ItemStack(ModItems.godwoodenhoe), "DND", "DHD", "DDD", 'D', Items.DIAMOND, 'H', Items.WOODEN_HOE, 'N', Items.NETHER_STAR);
		
		//Stone Tools
		GameRegistry.addRecipe(new ItemStack(ModItems.godstonesword), "DND", "DSD", "DDD", 'D', Items.DIAMOND, 'N', Items.NETHER_STAR, 'S', Items.STONE_SWORD);
		GameRegistry.addRecipe(new ItemStack(ModItems.godstoneshovel), "DND", "DSD", "DDD", 'D', Items.DIAMOND, 'N', Items.NETHER_STAR, 'S', Items.STONE_SHOVEL);
		GameRegistry.addRecipe(new ItemStack(ModItems.godstonepickaxe), "DND", "DPD", "DDD", 'D', Items.DIAMOND, 'N', Items.NETHER_STAR, 'P', Items.STONE_PICKAXE);
		GameRegistry.addRecipe(new ItemStack(ModItems.godstoneaxe), "DND", "DAD", "DDD", 'D', Items.DIAMOND, 'N', Items.NETHER_STAR, 'A', Items.STONE_AXE);
		GameRegistry.addRecipe(new ItemStack(ModItems.godstonehoe), "DND", "DHD", "DDD", 'D', Items.DIAMOND, 'N', Items.NETHER_STAR, 'H', Items.STONE_HOE);
	}
	
}
