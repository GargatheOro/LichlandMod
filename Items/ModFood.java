package com.GargatheOro.Items;

import com.GargatheOro.CoreTabs.ModTabs;
import com.GargatheOro.LichlandCore.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ModFood {
	public static void Main(){
		initializeItem();
	}
	//FRUIT
	public static Item banana;
	public static Item mango;
	public static Item orange;
	public static Item grape;
	public static Item pear;
	public static Item peach;
	public static Item pineapple;
	public static Item raspberry;
	public static Item blackberry;
	public static Item strawberry;
	public static Item canaloupe;
	public static Item lemon;
	public static Item cherry;
	public static Item avocado;
	public static Item pomegranate;
	public static Item tomato;
	//VEGETABLES
	public static Item corn;
	public static Item onion;
	public static Item cabbage;
	public static Item lettuce;
	public static Item broccoli;
	public static Item spinach;
	public static Item cucumber;
	public static Item greenbean;
	public static Item kale;
	public static Item eggplant;
	public static Item pea;
	public static Item bellpepper;
	public static Item celery;
	public static Item turnip;
	public static Item garlic;
	public static Item asparagus;
	public static Item radish;
	public static Item leek;
	//BAKERY
	public static Item dough;
	public static Item flour;
	public static Item crust;
	public static Item pastrybread;
	public static Item toast;
	public static Item breadslice;
	public static Item sugarcookie;
	public static Item pancakes;
	public static Item waffles;
	public static Item yeast;
	public static Item pita;
	public static Item burgerbuns;
	public static Item hotdogbuns;
	public static Item frenchbread;
	public static Item garlicbread;
	public static Item chocolatecake;
	public static Item strawcake;
	public static Item lemoncake;
	public static Item carrotcake;
	//CHEESE
	public static Item cheddar;
	public static Item jack;
	public static Item colby;
	public static Item pepperjack;
	public static Item mozzarella;
	public static Item gouda;
	public static Item american;
	public static Item provolone;
	public static Item parmesan;
	public static Item feta;
	public static Item goatcheese;
	public static Item swisscheese;
	public static Item bluecheese;
	public static Item creamcheese;
	//MEAT
	public static Item jerky;
	public static Item ratmeat;
	public static Item dogmeat;
	public static Item catmeat;
	public static Item squirrelmeat;
	public static Item moosemeat;
	public static Item bearmeat;
	public static Item reptilemeat;
	public static Item frogmeat;
	public static Item venison;
	public static Item duck;
	public static Item turkey;
	public static Item pheasant;
	//MEALS
	public static Item trations;
	
	public static void initializeItem(){
		trations = new ItemFood(10, 1.0F, false).setUnlocalizedName("trations").setCreativeTab(ModTabs.tabCoreFood).setTextureName(RefStrings.MODID + ":");
		banana = new ItemFood(4, 0.3F, false).setUnlocalizedName("banana").setCreativeTab(ModTabs.tabCoreFood).setTextureName(RefStrings.MODID + ":");
		mango = new ItemFood(4, 0.3F, false).setUnlocalizedName("mango").setCreativeTab(ModTabs.tabCoreFood).setTextureName(RefStrings.MODID + ":");
		orange = new ItemFood(4, 0.3F, false).setUnlocalizedName("orange").setCreativeTab(ModTabs.tabCoreFood).setTextureName(RefStrings.MODID + ":");
		grape = new ItemFood(3, 0.4F, false).setUnlocalizedName("grape").setCreativeTab(ModTabs.tabCoreFood).setTextureName(RefStrings.MODID + ":");
		pear = new ItemFood(4, 0.3F, false).setUnlocalizedName("pear").setCreativeTab(CreativeTabs.tabBlock).setTextureName(RefStrings.MODID + ":");
		peach = new ItemFood(4, 0.3F, false).setUnlocalizedName("peach").setCreativeTab(ModTabs.tabCoreFood).setTextureName(RefStrings.MODID + ":");
		pineapple = new ItemFood(6, 0.6F, false).setUnlocalizedName("pineapple").setCreativeTab(ModTabs.tabCoreFood).setTextureName(RefStrings.MODID + ":");
		raspberry = new ItemFood(3, 0.4F, false).setUnlocalizedName("raspberry").setCreativeTab(ModTabs.tabCoreFood).setTextureName(RefStrings.MODID + ":");
		blackberry = new ItemFood(3, 0.4F, false).setUnlocalizedName("blackberry").setCreativeTab(ModTabs.tabCoreFood).setTextureName(RefStrings.MODID + ":");
		strawberry = new ItemFood(3, 0.4F, false).setUnlocalizedName("strawberry").setCreativeTab(ModTabs.tabCoreFood).setTextureName(RefStrings.MODID + ":");
		canaloupe = new ItemFood(2, 0.15F, false).setUnlocalizedName("mango").setCreativeTab(ModTabs.tabCoreFood).setTextureName(RefStrings.MODID + ":");
		lemon = new ItemFood(4, 0.3F, false).setUnlocalizedName("lemon").setCreativeTab(ModTabs.tabCoreFood).setTextureName(RefStrings.MODID + ":");
		cherry = new ItemFood(3, 0.4F, false).setUnlocalizedName("cherry").setCreativeTab(ModTabs.tabCoreFood).setTextureName(RefStrings.MODID + ":");
		avocado = new ItemFood(4, 0.3F, false).setUnlocalizedName("avocado").setCreativeTab(ModTabs.tabCoreFood).setTextureName(RefStrings.MODID + ":");
		pomegranate = new ItemFood(4, 0.4F, false).setUnlocalizedName("pomegranate").setCreativeTab(ModTabs.tabCoreFood).setTextureName(RefStrings.MODID + ":");
		tomato = new ItemFood(4, 0.3F, false).setUnlocalizedName("tomato").setCreativeTab(ModTabs.tabCoreFood).setTextureName(RefStrings.MODID + ":");
		
		corn = new ItemFood(5, 0.5F, false).setUnlocalizedName("corn").setCreativeTab(ModTabs.tabCoreFood).setTextureName(RefStrings.MODID + ":");
		onion = new ItemFood(4, 0.3F, false).setUnlocalizedName("onion").setCreativeTab(ModTabs.tabCoreFood).setTextureName(RefStrings.MODID + ":");
		cabbage = new ItemFood(6, 0.6F, false).setUnlocalizedName("cabbage").setCreativeTab(ModTabs.tabCoreFood).setTextureName(RefStrings.MODID + ":");
		lettuce = new ItemFood(6, 0.6F, false).setUnlocalizedName("lettuce").setCreativeTab(ModTabs.tabCoreFood).setTextureName(RefStrings.MODID + ":");
		broccoli = new ItemFood(4, 0.5F, false).setUnlocalizedName("broccoli").setCreativeTab(ModTabs.tabCoreFood).setTextureName(RefStrings.MODID + ":");
		spinach = new ItemFood(5, 0.6F, false).setUnlocalizedName("spinach").setCreativeTab(ModTabs.tabCoreFood).setTextureName(RefStrings.MODID + ":");
		cucumber = new ItemFood(4, 0.3F, false).setUnlocalizedName("cucumber").setCreativeTab(ModTabs.tabCoreFood).setTextureName(RefStrings.MODID + ":");
		greenbean = new ItemFood(3, 0.2F, false).setUnlocalizedName("greenbean").setCreativeTab(ModTabs.tabCoreFood).setTextureName(RefStrings.MODID + ":");
		kale = new ItemFood(5, 0.7F, false).setUnlocalizedName("kale").setCreativeTab(ModTabs.tabCoreFood).setTextureName(RefStrings.MODID + ":");
		eggplant = new ItemFood(7, 0.9F, false).setUnlocalizedName("eggplant").setCreativeTab(ModTabs.tabCoreFood).setTextureName(RefStrings.MODID + ":");

	}
}