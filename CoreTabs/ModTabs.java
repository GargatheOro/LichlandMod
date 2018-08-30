package com.LichlandDevs.CoreTabs;

import net.minecraft.creativetab.CreativeTabs;

public class ModTabs {
	
	public static CreativeTabs tabCoreBlocks;
	public static CreativeTabs tabCoreTreeBlocks;
	public static CreativeTabs tabCoreRacial;
	public static CreativeTabs tabCoreItems;
	public static CreativeTabs tabCoreMetals;
	public static CreativeTabs tabCoreFood;
	public static CreativeTabs tabCoreTools;
	public static CreativeTabs tabCoreWeapons;
	public static CreativeTabs tabCoreArmor;
	public static CreativeTabs tabCoreMagicItems;
	public static CreativeTabs tabCoreMobs;
	
	public static void initializeTabs(){
		tabCoreBlocks = new CreativeTabCoreBlocks("CoreBlocks");
		tabCoreTreeBlocks = new CreativeTabCoreTreeBlocks("CoreTreeBlocks");
		tabCoreRacial = new CreativeTabCoreRacial("CoreRacial");
		tabCoreItems = new CreativeTabCoreItems("CoreItems");
		tabCoreMetals = new CreativeTabCoreMetals("CoreMetals");
		tabCoreFood = new CreativeTabCoreFood("CoreFood");
		tabCoreTools = new CreativeTabCoreTools("CoreTools");
		tabCoreWeapons = new CreativeTabCoreWeapons("CoreWeapons");
		tabCoreArmor = new CreativeTabCoreArmor("CoreArmor");
		tabCoreMagicItems = new CreativeTabCoreMagicItems("CoreMagicItems");
		tabCoreMobs = new CreativeTabCoreMobs("CoreMobs");
	}
}