package com.LichlandDevs.CoreTabs;

import com.LichlandDevs.Blocks.ModBlocks;
import com.LichlandDevs.Items.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabCoreRacial extends CreativeTabs {

	public CreativeTabCoreRacial(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(ModBlocks.dstone);
	}
}