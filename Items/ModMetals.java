package com.LichlandDevs.Items;

import com.LichlandDevs.CoreTabs.ModTabs;
import com.LichlandDevs.LichlandCore.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ModMetals {

	public static void Main() {
		initializeItem();
	}

	// BASE METALS iron is 2nd most common metal, 3k melting point; gold is 13th
	// most common metal, 2k melting point
	public static Item alumgot;
	public static Item meltalumgot;
	// light, easy to shape, 1k melting point, most common metal.
	public static Item chrogot;
	public static Item meltchrogot1;
	public static Item meltchrogot2;
	public static Item meltchrogot3;
	// 4th most common metal, 3k melting point, resists corrosion.
	public static Item coppgot;
	public static Item meltcoppgot1;
	public static Item meltcoppgot2;
	// 8th most common metal, 2k melting point, strong/hard.
	public static Item leadgot;
	public static Item meltleadgot;
	// 9th most common metal, 1k melting point
	public static Item magngot;
	public static Item meltmagngot;
	// 3rd most common metal, 1k melting point
	public static Item nickgot;
	public static Item meltnickgot1;
	public static Item meltnickgot2;
	// 6th most common metal, 2k melting point,
	public static Item platgot;
	public static Item meltplatgot1;
	public static Item meltplatgot2;
	public static Item meltplatgot3;
	// 12th most common metal, 3k melting point,
	public static Item silvergot;
	public static Item meltsilvergot1;
	public static Item meltsilvergot2;
	// 11th most common metal, 2k melting point,
	public static Item tingot;
	public static Item melttingot;
	// 10th most common metal, 1k melting point,
	public static Item titagot;
	public static Item melttitagot1;
	public static Item melttitagot2;
	public static Item melttitagot3;
	// 4th most common metal, 3k melting point,
	public static Item zincgot;
	public static Item meltzincgot;
	// 7th most common metal, 1k melting point, resists corrosion

	public static Item steengot;
	public static Item vsteengot;
	public static Item ssteengot;
	public static Item brongot;
	public static Item citegot;
	public static Item titegot;

	public static void initializeItem() {
		alumgot = new Item().setUnlocalizedName("alumgot").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":alumgot");
		meltalumgot = new Item().setUnlocalizedName("meltalumgot").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":mm3");
		chrogot = new Item().setUnlocalizedName("chrogot").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":chrogot");
		meltchrogot1 = new Item().setUnlocalizedName("meltchrogot1").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":mm1");
		meltchrogot2 = new Item().setUnlocalizedName("meltchrogot2").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":mm2");
		meltchrogot3 = new Item().setUnlocalizedName("meltchrogot3").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":mm3");
		coppgot = new Item().setUnlocalizedName("coppgot").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":coppgot");
		meltcoppgot1 = new Item().setUnlocalizedName("meltcoppgot1").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":mm1");
		meltcoppgot2 = new Item().setUnlocalizedName("meltcoppgot2").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":mm3");
		leadgot = new Item().setUnlocalizedName("leadgot").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":leadgot");
		meltleadgot = new Item().setUnlocalizedName("meltleadgot").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":mm3");
		magngot = new Item().setUnlocalizedName("magngot").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":magngot");
		meltmagngot = new Item().setUnlocalizedName("meltmagngot").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":mm3");
		nickgot = new Item().setUnlocalizedName("nickgot").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":nickgot");
		meltnickgot1 = new Item().setUnlocalizedName("meltnickgot1").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":mm1");
		meltnickgot2 = new Item().setUnlocalizedName("meltnickgot2").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":mm3");
		platgot = new Item().setUnlocalizedName("platgot").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":platgot");
		meltplatgot1 = new Item().setUnlocalizedName("meltplatgot1").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":mm1");
		meltplatgot2 = new Item().setUnlocalizedName("meltplatgot2").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":mm2");
		meltplatgot3 = new Item().setUnlocalizedName("meltplatgot3").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":mm3");
		silvergot = new Item().setUnlocalizedName("silvergot").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":silvergot");
		meltsilvergot1 = new Item().setUnlocalizedName("meltsilvergot1").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":mm1");
		meltsilvergot2 = new Item().setUnlocalizedName("meltsilvergot2").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":mm3");
		tingot = new Item().setUnlocalizedName("tingot").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":tingot");
		melttingot = new Item().setUnlocalizedName("melttingot").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":melttingot");
		titagot = new Item().setUnlocalizedName("titagot").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":titagot");
		melttitagot1 = new Item().setUnlocalizedName("melttitagot1").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":mm1");
		melttitagot2 = new Item().setUnlocalizedName("melttitagot2").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":mm2");
		melttitagot3 = new Item().setUnlocalizedName("melttitagot3").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":mm3");
		zincgot = new Item().setUnlocalizedName("zincgot").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":zincgot");
		meltzincgot = new Item().setUnlocalizedName("meltzincgot").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":mm1");

		steengot = new Item().setUnlocalizedName("steengot").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":steengot");
		vsteengot = new Item().setUnlocalizedName("vsteengot").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":vsteengot");
		ssteengot = new Item().setUnlocalizedName("ssteengot").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":ssteengot");
		brongot = new Item().setUnlocalizedName("brongot").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":brongot");
		citegot = new Item().setUnlocalizedName("citegot").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":citegot");
		titegot = new Item().setUnlocalizedName("titegot").setCreativeTab(ModTabs.tabCoreMetals)
				.setTextureName(RefStrings.MODID + ":titegot");
	}
}