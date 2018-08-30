package com.LichlandDevs.Biomes;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockLeaves;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BiomeLeaves extends BlockLeaves {

	public static final String[][] leaftypes = new String[][] { { "LeafBamboo", "LeafFantasy" },
			{ "LeafBambooOpaque", "LeafFantasyOpaque" } };
	public static final String[] leaves = new String[] { "Bamboo", "Fantasy" };

	protected void func_150124_c(World world, int x, int y, int z, int side,
			int meta) {
		if ((side & 3) == 1 && world.rand.nextInt(meta) == 0) {
			this.dropBlockAsItem(world, x, y, z, new ItemStack(Items.apple, 1, 0));
		}
	}

	public int damageDropped(int i) {
		return super.damageDropped(i) + 4;
	}

	public int getDamageValue(World world, int x, int y, int z) {
		return world.getBlockMetadata(x, y, z) & 3;
	}

	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item item, CreativeTabs tab, List list) {
		for (int i = 0; i < leaves.length; i++) {
			list.add(new ItemStack(item, 1, i));
		}
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconregister) {
		for (int i = 0; i < leaftypes.length; ++i) {
			this.field_150129_M[i] = new IIcon[leaftypes[i].length];

			for (int j = 0; j < leaftypes[i].length; ++j) {
				this.field_150129_M[i][j] = iconregister.registerIcon(leaftypes[i][j]);
			}
		}
	}

	@Override
	public IIcon getIcon(int side, int meta) {
		return (meta & 3) == 1 ? this.field_150129_M[this.field_150127_b][1]
				: this.field_150129_M[this.field_150127_b][0];
	}

	@Override
	public String[] func_150125_e() {
		return leaves;
	}

}