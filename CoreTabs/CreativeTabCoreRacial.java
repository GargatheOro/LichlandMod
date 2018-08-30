package com.GargatheOro.CoreTabs;

import com.GargatheOro.Blocks.ModBlocks;
import com.GargatheOro.Items.ModItems;

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