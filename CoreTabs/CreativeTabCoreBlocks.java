package com.LichlandDevs.CoreTabs;

import com.LichlandDevs.MetalBlocks.ModMetalBlocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabCoreBlocks extends CreativeTabs {

	public CreativeTabCoreBlocks(String lable) {
		super(lable);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return Item.getItemFromBlock(ModMetalBlocks.steeblock);
	}
}
