package com.GargatheOro.CoreTabs;

import com.GargatheOro.Items.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabCoreArmor extends CreativeTabs {

	public CreativeTabCoreArmor(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.lbag;
	}
}