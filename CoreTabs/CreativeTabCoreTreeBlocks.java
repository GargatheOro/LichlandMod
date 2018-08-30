package com.LichlandDevs.CoreTabs;

import com.LichlandDevs.WeaponsCore.ModWeapons;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabCoreTreeBlocks extends CreativeTabs {

	public CreativeTabCoreTreeBlocks(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return ModWeapons.practiceflail;
	}
}