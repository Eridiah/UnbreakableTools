package net.unbreakabletools.mod.tools;

import java.util.List;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.unbreakabletools.mod.Reference;
import net.unbreakabletools.mod.UnbreakableTools;

public class ItemGodIronSword extends ItemSword {

	public ItemGodIronSword(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.UTItems.GOD_IRON_SWORD.getUnlocalizedName());
		setRegistryName(Reference.UTItems.GOD_IRON_SWORD.getRegistryName());
		setCreativeTab(UnbreakableTools.MAIN_TAB);
		setMaxStackSize(1);
	}

	@Override
	public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) {
		return true;
	}

	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
		return true;
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		tooltip.add("Indestructible");
		super.addInformation(stack, playerIn, tooltip, advanced);
	}
	
}
