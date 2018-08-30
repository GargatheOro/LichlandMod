package com.LichlandDevs.Tools;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModTools {
	public static void Main(){
		/*initializeItem();
		registerItem();*/
	}
	
	//BASE METALS
	public static ToolMaterial Aluminum = EnumHelper.addToolMaterial("Aluminum", 0, 36, 6.0F, 2.0F, 14);
	//PURE METAL ALLOYS
   	
	//OTHER ALLOYS
	
	//FANTASY METALS
   	
   	
   	
	
	/*public static void initializeItem(){
		steepick = new Pickaxe(Steel).setUnlocalizedName("steepick").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":steepick");
		steeaxe = new Axe(Steel).setUnlocalizedName("steeaxe").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":steeaxe");
		steespade = new Hoe(Steel).setUnlocalizedName("steespade").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":steespade");
		steehoe = new Shovel(Steel).setUnlocalizedName("steehoe").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":steehoe");
		
		bronpick = new Pickaxe(Bronze).setUnlocalizedName("bronpick").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":bronpick");
		bronaxe = new Axe(Bronze).setUnlocalizedName("bronaxe").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":bronaxe");
		bronspade = new Shovel(Bronze).setUnlocalizedName("bronspade").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":bronspade");
		bronhoe = new Hoe(Bronze).setUnlocalizedName("bronhoe").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":bronhoe");
		
		copppick = new Pickaxe(Copper).setUnlocalizedName("copppick").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":copppick");
		coppaxe = new Axe(Copper).setUnlocalizedName("coppaxe").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":coppaxe");
		coppspade = new Shovel(Copper).setUnlocalizedName("coppspade").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":coppspade");
		copphoe = new Hoe(Copper).setUnlocalizedName("copphoe").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":copphoe");
		
		tinpick = new Pickaxe(Tin).setUnlocalizedName("tinpick").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":tinpick");
		tinaxe = new Axe(Tin).setUnlocalizedName("tinaxe").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":tinaxe");
		tinspade = new Shovel(Tin).setUnlocalizedName("tinspade").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":tinspade");
		tinhoe = new Hoe(Tin).setUnlocalizedName("tinhoe").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":tinhoe");
		
		silverpick = new Pickaxe(Silver).setUnlocalizedName("silverpick").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":silverpick");
		silveraxe = new Axe(Silver).setUnlocalizedName("silveraxe").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":silveraxe");
		silverspade = new Shovel(Silver).setUnlocalizedName("silverspade").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":silverspade");
		silverhoe = new Hoe(Silver).setUnlocalizedName("silverhoe").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":silverhoe");
		
		platpick = new Pickaxe(Platinum).setUnlocalizedName("platpick").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":platpick");
		plataxe = new Axe(Platinum).setUnlocalizedName("plataxe").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":plataxe");
		platspade = new Shovel(Platinum).setUnlocalizedName("platspade").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":platspade");
		plathoe = new Hoe(Platinum).setUnlocalizedName("plathoe").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":plathoe");
		
		citepick = new Pickaxe(Magicite).setUnlocalizedName("citepick").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":citepick");
		citeaxe = new Axe(Magicite).setUnlocalizedName("citeaxe").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":citeaxe");
		citespade = new Shovel(Magicite).setUnlocalizedName("citespade").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":citespade");
		citehoe = new Hoe(Magicite).setUnlocalizedName("citehoe").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":citehoe");
		
		titepick = new Pickaxe(Magitite).setUnlocalizedName("titepick").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":titepick");
		titeaxe = new Axe(Magitite).setUnlocalizedName("titeaxe").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":titeaxe");
		titespade = new Shovel(Magitite).setUnlocalizedName("titespade").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":titespade");
		titehoe = new Hoe(Magitite).setUnlocalizedName("titehoe").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":titehoe");

		ssteelpick = new Hoe(SSteel).setUnlocalizedName("ssteelpick").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":ssteelpick");
		ssteelaxe = new Hoe(SSteel).setUnlocalizedName("ssteelaxe").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":ssteelaxe");
		ssteelspade = new Hoe(SSteel).setUnlocalizedName("ssteelspade").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":ssteelspade");
		ssteelhoe = new Hoe(SSteel).setUnlocalizedName("ssteelhoe").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":ssteelhoe");
		
		vsteelpick = new Hoe(VSteel).setUnlocalizedName("vsteelpick").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":vsteelpick");
		vsteelaxe = new Hoe(VSteel).setUnlocalizedName("vsteelaxe").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":vsteelaxe");
		vsteelspade = new Hoe(VSteel).setUnlocalizedName("vsteelspade").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":vsteelspade");
		vsteelhoe = new Hoe(VSteel).setUnlocalizedName("vsteelhoe").setCreativeTab(ModTabs.tabCoreEquip).setTextureName(RefStrings.MODID + ":vsteelhoe");
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(steepick, steepick.getUnlocalizedName());
		GameRegistry.registerItem(steeaxe, steeaxe.getUnlocalizedName());
		GameRegistry.registerItem(steespade, steespade.getUnlocalizedName());
		GameRegistry.registerItem(steehoe, steehoe.getUnlocalizedName());
		
		GameRegistry.registerItem(bronpick, bronpick.getUnlocalizedName());
		GameRegistry.registerItem(bronaxe, bronaxe.getUnlocalizedName());
		GameRegistry.registerItem(bronspade, bronspade.getUnlocalizedName());
		GameRegistry.registerItem(bronhoe, bronhoe.getUnlocalizedName());
		
		GameRegistry.registerItem(copppick, copppick.getUnlocalizedName());
		GameRegistry.registerItem(coppaxe, coppaxe.getUnlocalizedName());
		GameRegistry.registerItem(coppspade, coppspade.getUnlocalizedName());
		GameRegistry.registerItem(copphoe, copphoe.getUnlocalizedName());

		GameRegistry.registerItem(tinpick, tinpick.getUnlocalizedName());
		GameRegistry.registerItem(tinaxe, tinaxe.getUnlocalizedName());
		GameRegistry.registerItem(tinspade, tinspade.getUnlocalizedName());
		GameRegistry.registerItem(tinhoe, tinhoe.getUnlocalizedName());
		
		GameRegistry.registerItem(silverpick, silverpick.getUnlocalizedName());
		GameRegistry.registerItem(silveraxe, silveraxe.getUnlocalizedName());
		GameRegistry.registerItem(silverspade, silverspade.getUnlocalizedName());
		GameRegistry.registerItem(silverhoe, silverhoe.getUnlocalizedName());
		
		GameRegistry.registerItem(platpick, platpick.getUnlocalizedName());
		GameRegistry.registerItem(plataxe, plataxe.getUnlocalizedName());
		GameRegistry.registerItem(platspade, platspade.getUnlocalizedName());
		GameRegistry.registerItem(plathoe, plathoe.getUnlocalizedName());
		
		GameRegistry.registerItem(citepick, citepick.getUnlocalizedName());
		GameRegistry.registerItem(citeaxe, citeaxe.getUnlocalizedName());
		GameRegistry.registerItem(citespade, citespade.getUnlocalizedName());
		GameRegistry.registerItem(citehoe, citehoe.getUnlocalizedName());
		
		GameRegistry.registerItem(titepick, titepick.getUnlocalizedName());
		GameRegistry.registerItem(titeaxe, titeaxe.getUnlocalizedName());
		GameRegistry.registerItem(titespade, titespade.getUnlocalizedName());
		GameRegistry.registerItem(titehoe, titehoe.getUnlocalizedName());

		GameRegistry.registerItem(ssteelpick, ssteelpick.getUnlocalizedName());
		GameRegistry.registerItem(ssteelaxe, ssteelaxe.getUnlocalizedName());
		GameRegistry.registerItem(ssteelspade, ssteelspade.getUnlocalizedName());
		GameRegistry.registerItem(ssteelhoe, ssteelhoe.getUnlocalizedName());
		
		GameRegistry.registerItem(vsteelpick, vsteelpick.getUnlocalizedName());
		GameRegistry.registerItem(vsteelaxe, vsteelaxe.getUnlocalizedName());
		GameRegistry.registerItem(vsteelspade, vsteelspade.getUnlocalizedName());
		GameRegistry.registerItem(vsteelhoe, vsteelhoe.getUnlocalizedName());
		}*/
}