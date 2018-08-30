package com.GargatheOro.Blocks;

import com.GargatheOro.CoreTabs.ModTabs;
import com.GargatheOro.LichlandCore.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockMushroom;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

public class ModBlocks {
	public static void Main() {
		initializeBlock();
	}

	// MINERALS
	public static Block limeore;
	public static Block limeblock;

	public static Block marbore;
	public static Block marbblock;
	public static Block cmarbblock;
	public static Block pmarbblock;

	public static Block darkmarbore;
	public static Block darkmarbblock;
	public static Block darkcmarbblock;
	public static Block darkpmarbblock;

	public static Block redmarbore;
	public static Block redmarbblock;
	public static Block redcmarbblock;
	public static Block redpmarbblock;

	public static Block bluemarbore;
	public static Block bluemarbblock;
	public static Block bluecmarbblock;
	public static Block bluepmarbblock;

	public static Block greenmarbore;
	public static Block greenmarbblock;
	public static Block greencmarbblock;
	public static Block greenpmarbblock;

	public static Block basalt;
	public static Block basaltblock;

	public static Block granore;
	public static Block granblock;
	public static Block cgranblock;
	public static Block pgranblock;

	public static Block whitegranore;
	public static Block whitegranblock;
	public static Block whitecgranblock;
	public static Block whitepgranblock;

	public static Block blackgranore;
	public static Block blackgranblock;
	public static Block blackcgranblock;
	public static Block blackpgranblock;

	public static Block redgranore; // original granite texture
	public static Block redgranblock; // original polished granite texture
	public static Block redcgranblock;
	public static Block redpgranblock;

	public static Block salmongranore;
	public static Block salmongranblock;
	public static Block salmoncgranblock;
	public static Block salmonpgranblock;

	// BLOOD CULT PALACE
	public static Block bloodstone;
	public static Block bloodbrick;
	public static Block bloodpillar;
	public static Block bloodcracked;
	public static Block bloodchisel;

	// DWARVEN ARCHITECTURE
	public static Block dstone;
	public static Block dpillar;
	public static Block dchisel;

	public static void initializeBlock() {
		limeore = new limestone(Material.rock).setBlockName("limeore").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":limeore");
		limeblock = new limestone(Material.rock).setBlockName("limeblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":limeblock");

		marbore = new marble(Material.rock).setBlockName("marbore").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":marbore");
		marbblock = new marble(Material.rock).setBlockName("marbblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":marbblock");
		cmarbblock = new marble(Material.rock).setBlockName("cmarbblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":cmarbblock");
		pmarbblock = new marble(Material.rock).setBlockName("pmarbblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":pmarbblock");

		darkmarbore = new marble(Material.rock).setBlockName("darkmarbore").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":darkmarbore");
		darkmarbblock = new marble(Material.rock).setBlockName("darkmarbblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":darkmarbblock");
		darkcmarbblock = new marble(Material.rock).setBlockName("darkcmarbblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":darkcmarbblock");
		darkpmarbblock = new marble(Material.rock).setBlockName("darkpmarbblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":darkpmarbblock");

		redmarbore = new marble(Material.rock).setBlockName("redmarbore").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":redmarbore");
		redmarbblock = new marble(Material.rock).setBlockName("redmarbblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":redmarbblock");
		redcmarbblock = new marble(Material.rock).setBlockName("redcmarbblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":redcmarbblock");
		redpmarbblock = new marble(Material.rock).setBlockName("redpmarbblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":redpmarbblock");

		bluemarbore = new marble(Material.rock).setBlockName("bluemarbore").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":bluemarbore");
		bluemarbblock = new marble(Material.rock).setBlockName("bluemarbblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":bluemarbblock");
		bluecmarbblock = new marble(Material.rock).setBlockName("bluecmarbblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":bluecmarbblock");
		bluepmarbblock = new marble(Material.rock).setBlockName("bluepmarbblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":bluepmarbblock");

		greenmarbore = new marble(Material.rock).setBlockName("greenmarbore").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":greenmarbore");
		greenmarbblock = new marble(Material.rock).setBlockName("greenmarbblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":greenmarbblock");
		greencmarbblock = new marble(Material.rock).setBlockName("greencmarbblock")
				.setCreativeTab(ModTabs.tabCoreBlocks).setBlockTextureName(RefStrings.MODID + ":greencmarbblock");
		greenpmarbblock = new marble(Material.rock).setBlockName("greenpmarbblock")
				.setCreativeTab(ModTabs.tabCoreBlocks).setBlockTextureName(RefStrings.MODID + ":greenpmarbblock");

		granore = new granite(Material.rock).setBlockName("granore").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":granore");
		granblock = new granite(Material.rock).setBlockName("granblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":granblock");
		cgranblock = new granite(Material.rock).setBlockName("cgranblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":cgranblock");
		pgranblock = new granite(Material.rock).setBlockName("pgranblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":pgranblock");

		redgranore = new granite(Material.rock).setBlockName("redgranore").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":redgranore");
		redgranblock = new granite(Material.rock).setBlockName("redgranblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":redgranblock");
		redcgranblock = new granite(Material.rock).setBlockName("redcgranblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":redcgranblock");
		redpgranblock = new granite(Material.rock).setBlockName("redcpgranblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":redpgranblock");

		salmongranore = new granite(Material.rock).setBlockName("salmongranore").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":salmongranore");
		salmongranblock = new granite(Material.rock).setBlockName("salmongranblock")
				.setCreativeTab(ModTabs.tabCoreBlocks).setBlockTextureName(RefStrings.MODID + ":salmongranblock");
		salmoncgranblock = new granite(Material.rock).setBlockName("salmoncgranblock")
				.setCreativeTab(ModTabs.tabCoreBlocks).setBlockTextureName(RefStrings.MODID + ":salmoncgranblock");
		salmonpgranblock = new granite(Material.rock).setBlockName("salmonpgranblock")
				.setCreativeTab(ModTabs.tabCoreBlocks).setBlockTextureName(RefStrings.MODID + ":salmonpgranblock");

		whitegranore = new granite(Material.rock).setBlockName("whitegranore").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":whitegranore");
		whitegranblock = new granite(Material.rock).setBlockName("whitegranblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":whitegranblock");
		whitecgranblock = new granite(Material.rock).setBlockName("whitecgranblock")
				.setCreativeTab(ModTabs.tabCoreBlocks).setBlockTextureName(RefStrings.MODID + ":whitecgranblock");
		whitepgranblock = new granite(Material.rock).setBlockName("whitepgranblock")
				.setCreativeTab(ModTabs.tabCoreBlocks).setBlockTextureName(RefStrings.MODID + ":whitepgranblock");

		basalt = new basalt(Material.rock).setBlockName("basalt").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":basalt");

		dstone = new dblock(Material.rock).setBlockName("dstone").setCreativeTab(ModTabs.tabCoreRacial)
				.setBlockTextureName(RefStrings.MODID + ":dstone");
		dpillar = new dblock(Material.rock).setBlockName("dpillar").setCreativeTab(ModTabs.tabCoreRacial)
				.setBlockTextureName(RefStrings.MODID + ":dpillar");
		dchisel = new dblock(Material.rock).setBlockName("dchisel").setCreativeTab(ModTabs.tabCoreRacial)
				.setBlockTextureName(RefStrings.MODID + ":dchisel");

		bloodstone = new bloodblock(Material.rock).setBlockName("bloodstone").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":bloodstone");
		bloodbrick = new bloodblock(Material.rock).setBlockName("bloodbrick").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":bloodbrick");
		bloodpillar = new bloodblock(Material.rock).setBlockName("bloodpillar").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":bloodpillar");
		bloodcracked = new bloodblock(Material.rock).setBlockName("bloodcracked").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":bloodcracked");
		bloodchisel = new bloodblock(Material.rock).setBlockName("bloodchisel").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":bloodchisel");
	}
}