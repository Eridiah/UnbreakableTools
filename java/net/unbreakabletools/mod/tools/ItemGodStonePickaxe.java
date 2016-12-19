package net.unbreakabletools.mod.tools;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.unbreakabletools.mod.Reference;
import net.unbreakabletools.mod.UnbreakableTools;

public class ItemGodStonePickaxe extends ItemPickaxe {

	public ItemGodStonePickaxe(ToolMaterial material) {
		super(material);
        setUnlocalizedName(Reference.UTItems.GOD_STONE_PICKAXE.getUnlocalizedName());
        setRegistryName(Reference.UTItems.GOD_STONE_PICKAXE.getRegistryName());
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

}
