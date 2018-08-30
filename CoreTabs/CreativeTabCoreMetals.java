package com.LichlandDevs.CoreTabs;

import com.LichlandDevs.Items.ModMetals;

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