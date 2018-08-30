package com.GargatheOro.CoreTabs;

import com.GargatheOro.Items.ModItems;
import com.GargatheOro.Tools.ModTools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabCoreTools extends CreativeTabs {

	public CreativeTabCoreTools(String lable) {
		super(lable);
	}
	@Override
	public Item getTabIconItem() {
		return ModItems.lbag;
	}
}