package com.GargatheOro.CoreTabs;

import com.GargatheOro.Items.ModMetals;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabCoreMetals extends CreativeTabs {

	public CreativeTabCoreMetals(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return ModMetals.silvergot;
	}
}