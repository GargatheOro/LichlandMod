package com.LichlandDevs.CoreTabs;

import com.LichlandDevs.WeaponsCore.ModWeapons;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabCoreFood extends CreativeTabs {

	public CreativeTabCoreFood(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return ModWeapons.practiceflail;
	}
}