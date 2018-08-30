package com.GargatheOro.MetalBlocks;

import com.GargatheOro.CoreTabs.ModTabs;
import com.GargatheOro.LichlandCore.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModMetalBlocks {
	public static void Main() {
		initializeBlock();
	}

	// BASE
	public static Block alumblock;
	public static Block alumore;
	public static Block chroblock;
	public static Block chroore;
	public static Block coppblock;
	public static Block coppore;
	public static Block leadblock;
	public static Block leadore;
	public static Block magnblock;
	public static Block magnore;
	public static Block nickblock;
	public static Block nickore;
	public static Block platblock;
	public static Block platore;
	public static Block silverblock;
	public static Block silverore;
	public static Block tinblock;
	public static Block tinore;
	public static Block titablock;
	public static Block titaore;
	public static Block zincblock;
	public static Block zincore;
	// TO SORT
	public static Block bronblock;
	public static Block steeblock;
	public static Block vsteeblock;
	public static Block ssteeblock;
	// MAGICAL OR FANTASY METALS
	public static Block citeblock;
	public static Block citeore;
	public static Block titeblock;
	// public static Block royablock;
	// public static Block deitblock;
	// public static Block holyblock;
	// public static Block lichciteblock;
	// public static Block lichtiteblock;
	// public static Block voidlichblock;

	public static void initializeBlock() {
		alumblock = new weakblock(Material.iron).setBlockName("alumblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":alumblock");
		alumore = new weakblock(Material.rock).setBlockName("alumore").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":alumore");
		chroblock = new reinforcedblock(Material.iron).setBlockName("chroblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":chroblock");
		chroore = new reinforcedblock(Material.rock).setBlockName("chroore").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":chroore");
		coppblock = new weakblock(Material.iron).setBlockName("coppblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":coppblock");
		coppore = new weakblock(Material.rock).setBlockName("coppore").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":coppore");
		leadblock = new weakblock(Material.iron).setBlockName("leadblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":leadblock");
		leadore = new weakblock(Material.rock).setBlockName("leadore").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":leadore");
		magnblock = new weakblock(Material.iron).setBlockName("magnblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":magnblock");
		magnore = new weakblock(Material.rock).setBlockName("magnore").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":magnore");
		nickblock = new mediumblock(Material.iron).setBlockName("nickblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":nickblock");
		nickore = new mediumblock(Material.rock).setBlockName("nickore").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":nickore");
		platblock = new mediumblock(Material.iron).setBlockName("platblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":platblock");
		platore = new mediumblock(Material.rock).setBlockName("platore").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":platore");
		silverblock = new weakblock(Material.iron).setBlockName("silverblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":silvblock");
		silverore = new weakblock(Material.rock).setBlockName("silverore").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":silvore");
		tinblock = new weakblock(Material.iron).setBlockName("tinblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":tinblock");
		tinore = new weakblock(Material.rock).setBlockName("tinore").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":tinore");
		titablock = new strongblock(Material.iron).setBlockName("titablock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":titablock");
		titaore = new strongblock(Material.rock).setBlockName("titaore").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":titaore");
		zincblock = new weakblock(Material.iron).setBlockName("zincblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":zincblock");
		zincore = new weakblock(Material.rock).setBlockName("zincore").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":zincore");

		bronblock = new mediumblock(Material.iron).setBlockName("bronblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":bronblock");
		steeblock = new strongblock(Material.iron).setBlockName("steeblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":steeblock");
		vsteeblock = new strongblock(Material.iron).setBlockName("vsteeblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":vsteeblock");
		ssteeblock = new reinforcedblock(Material.iron).setBlockName("ssteeblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":ssteeblock");
		citeore = new reinforcedblock(Material.rock).setBlockName("citeore").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":citeore");
		citeblock = new reinforcedblock(Material.iron).setBlockName("citeblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":citeblock");
		titeblock = new titeblock(Material.iron).setBlockName("titeblock").setCreativeTab(ModTabs.tabCoreBlocks)
				.setBlockTextureName(RefStrings.MODID + ":titeblock");
	}
}