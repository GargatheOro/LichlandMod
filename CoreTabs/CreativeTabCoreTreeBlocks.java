package com.GargatheOro.CoreTabs;

import com.GargatheOro.Items.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabCoreTreeBlocks extends CreativeTabs {

	public CreativeTabCoreTreeBlocks(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.lbag;
	}
}