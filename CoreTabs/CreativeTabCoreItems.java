package com.GargatheOro.CoreTabs;

import com.GargatheOro.Items.ModItems;
import com.GargatheOro.Items.ModMetals;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabCoreItems extends CreativeTabs {

	public CreativeTabCoreItems(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.lbag;
	}
}