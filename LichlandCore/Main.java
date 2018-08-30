package com.LichlandDevs.LichlandCore;

import com.LichlandDevs.Biomes.BiomeLogs;
import com.LichlandDevs.Biomes.BiomeSapling;
import com.LichlandDevs.Biomes.ItemLeafBlocks;
import com.LichlandDevs.Biomes.ItemLogBlocks;
import com.LichlandDevs.Blocks.ModBlocks;
import com.LichlandDevs.CoreTabs.ModTabs;
import com.LichlandDevs.Crafting.MetallicCraftingManager;
import com.LichlandDevs.Items.ModArmor;
import com.LichlandDevs.Items.ModItems;
import com.LichlandDevs.Items.ModMetals;
import com.LichlandDevs.MetalBlocks.ModMetalBlocks;
import com.LichlandDevs.Tools.ModTools;
import com.LichlandDevs.WeaponsCore.ModWeapons;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

@Mod(modid = RefStrings.MODID, name = RefStrings.NAME, version = RefStrings.VERSION, guiFactory = RefStrings.GUI_FACTORY_CLASS)
public class Main {

	public static SimpleNetworkWrapper network;
	@SidedProxy(clientSide = RefStrings.CLIENTSIDE, serverSide = RefStrings.SERVERSIDE)
	public static CommonProxy proxy;

	@Instance(RefStrings.MODID)
	public static Main modInstance;

	public static Block blockLog;
	public static Block blockLeaf;
	public static Block blockSapling;

	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent event) {
		proxy.preInit(event);
		ModTabs.initializeTabs();
		ModArmor.Main();
		ModMetals.Main();
		ModItems.Main();
		ModTools.Main();
		ModBlocks.Main();
		ModMetalBlocks.Main();
		ModWeapons.Main();
		MetallicCraftingManager.Main();
		String configDir = event.getModConfigurationDirectory().toString();
		ConfigurationHandler.init(configDir);
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		GameRegistry.registerWorldGenerator(new OreGen(), 0);

		blockLog = new BiomeLogs().setBlockName("BiomeLog").setCreativeTab(ModTabs.tabCoreTreeBlocks);
		blockLeaf = new BiomeLogs().setBlockName("BiomeLeaf").setCreativeTab(ModTabs.tabCoreTreeBlocks);
		blockSapling = new BiomeSapling().setBlockName("BiomeSapling").setCreativeTab(ModTabs.tabCoreTreeBlocks);
		
		//BLOCKS
		if (ConfigurationHandler.geologyCheck == true) {

			GameRegistry.registerBlock(blockLog, ItemLogBlocks.class, blockLog.getUnlocalizedName().substring(5));
			GameRegistry.registerBlock(blockLeaf, ItemLeafBlocks.class, blockLeaf.getUnlocalizedName().substring(5));

			GameRegistry.registerBlock(ModBlocks.basalt, ModBlocks.basalt.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.limeore, ModBlocks.limeore.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.limeblock, ModBlocks.limeblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.granore, ModBlocks.granore.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.granblock, ModBlocks.granblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.cgranblock, ModBlocks.cgranblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.pgranblock, ModBlocks.pgranblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.whitegranore, ModBlocks.whitegranore.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.whitegranblock, ModBlocks.whitegranblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.whitecgranblock, ModBlocks.whitecgranblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.whitepgranblock, ModBlocks.whitepgranblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.redgranore, ModBlocks.redgranore.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.redgranblock, ModBlocks.redgranblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.redcgranblock, ModBlocks.redcgranblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.redpgranblock, ModBlocks.redpgranblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.salmongranore, ModBlocks.salmongranore.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.salmongranblock, ModBlocks.salmongranblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.salmoncgranblock, ModBlocks.salmoncgranblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.salmonpgranblock, ModBlocks.salmonpgranblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.marbore, ModBlocks.marbore.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.marbblock, ModBlocks.marbblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.pmarbblock, ModBlocks.pmarbblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.cmarbblock, ModBlocks.cmarbblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.bluemarbore, ModBlocks.bluemarbore.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.bluemarbblock, ModBlocks.bluemarbblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.bluepmarbblock, ModBlocks.bluepmarbblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.bluecmarbblock, ModBlocks.bluecmarbblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.darkmarbore, ModBlocks.darkmarbore.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.darkmarbblock, ModBlocks.darkmarbblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.darkpmarbblock, ModBlocks.darkpmarbblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.darkcmarbblock, ModBlocks.darkcmarbblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.greenmarbore, ModBlocks.greenmarbore.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.greenmarbblock, ModBlocks.greenmarbblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.greenpmarbblock, ModBlocks.greenpmarbblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.greencmarbblock, ModBlocks.greencmarbblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.redmarbore, ModBlocks.redmarbore.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.redmarbblock, ModBlocks.redmarbblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.redpmarbblock, ModBlocks.redpmarbblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.redcmarbblock, ModBlocks.redcmarbblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.bloodstone, ModBlocks.bloodstone.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.bloodbrick, ModBlocks.bloodbrick.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.bloodcracked, ModBlocks.bloodcracked.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.bloodpillar, ModBlocks.bloodpillar.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.bloodchisel, ModBlocks.bloodchisel.getUnlocalizedName());
		}
		if (ConfigurationHandler.metallurgyCheck == true) {
			GameRegistry.registerBlock(ModMetalBlocks.alumore, ModMetalBlocks.alumore.getUnlocalizedName());
			GameRegistry.registerBlock(ModMetalBlocks.alumblock, ModMetalBlocks.alumblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModMetalBlocks.bronblock, ModMetalBlocks.bronblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModMetalBlocks.chroore, ModMetalBlocks.chroore.getUnlocalizedName());
			GameRegistry.registerBlock(ModMetalBlocks.chroblock, ModMetalBlocks.chroblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModMetalBlocks.vsteeblock, ModMetalBlocks.vsteeblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModMetalBlocks.coppore, ModMetalBlocks.coppore.getUnlocalizedName());
			GameRegistry.registerBlock(ModMetalBlocks.coppblock, ModMetalBlocks.coppblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModMetalBlocks.ssteeblock, ModMetalBlocks.ssteeblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModMetalBlocks.leadore, ModMetalBlocks.leadore.getUnlocalizedName());
			GameRegistry.registerBlock(ModMetalBlocks.leadblock, ModMetalBlocks.leadblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModMetalBlocks.citeore, ModMetalBlocks.citeore.getUnlocalizedName());
			GameRegistry.registerBlock(ModMetalBlocks.citeblock, ModMetalBlocks.citeblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModMetalBlocks.titeblock, ModMetalBlocks.titeblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModMetalBlocks.magnore, ModMetalBlocks.magnore.getUnlocalizedName());
			GameRegistry.registerBlock(ModMetalBlocks.magnblock, ModMetalBlocks.magnblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModMetalBlocks.nickore, ModMetalBlocks.nickore.getUnlocalizedName());
			GameRegistry.registerBlock(ModMetalBlocks.nickblock, ModMetalBlocks.nickblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModMetalBlocks.platore, ModMetalBlocks.platore.getUnlocalizedName());
			GameRegistry.registerBlock(ModMetalBlocks.platblock, ModMetalBlocks.platblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModMetalBlocks.silverore, ModMetalBlocks.silverore.getUnlocalizedName());
			GameRegistry.registerBlock(ModMetalBlocks.silverblock, ModMetalBlocks.silverblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModMetalBlocks.steeblock, ModMetalBlocks.steeblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModMetalBlocks.tinore, ModMetalBlocks.tinore.getUnlocalizedName());
			GameRegistry.registerBlock(ModMetalBlocks.tinblock, ModMetalBlocks.tinblock.getUnlocalizedName());
			GameRegistry.registerBlock(ModMetalBlocks.titaore, ModMetalBlocks.titaore.getUnlocalizedName());
			GameRegistry.registerBlock(ModMetalBlocks.titablock, ModMetalBlocks.titablock.getUnlocalizedName());
			GameRegistry.registerBlock(ModMetalBlocks.zincore, ModMetalBlocks.zincore.getUnlocalizedName());
			GameRegistry.registerBlock(ModMetalBlocks.zincblock, ModMetalBlocks.zincblock.getUnlocalizedName());
		}
		// RACIAL
		if (ConfigurationHandler.dwarvesCheck == true) {
			GameRegistry.registerBlock(ModBlocks.dstone, ModBlocks.dstone.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.dpillar, ModBlocks.dpillar.getUnlocalizedName());
			GameRegistry.registerBlock(ModBlocks.dchisel, ModBlocks.dchisel.getUnlocalizedName());
		}
		// ITEMS
		if (ConfigurationHandler.metallurgyCheck == true) {
			GameRegistry.registerItem(ModMetals.alumgot, ModMetals.alumgot.getUnlocalizedName());
			GameRegistry.registerItem(ModMetals.meltalumgot, ModMetals.meltalumgot.getUnlocalizedName());
			GameRegistry.registerItem(ModMetals.chrogot, ModMetals.chrogot.getUnlocalizedName());
			GameRegistry.registerItem(ModMetals.meltchrogot1, ModMetals.meltchrogot1.getUnlocalizedName());
			GameRegistry.registerItem(ModMetals.meltchrogot2, ModMetals.meltchrogot2.getUnlocalizedName());
			GameRegistry.registerItem(ModMetals.meltchrogot3, ModMetals.meltchrogot3.getUnlocalizedName());
			GameRegistry.registerItem(ModMetals.coppgot, ModMetals.coppgot.getUnlocalizedName());
			GameRegistry.registerItem(ModMetals.meltcoppgot1, ModMetals.meltcoppgot1.getUnlocalizedName());
			GameRegistry.registerItem(ModMetals.meltcoppgot2, ModMetals.meltcoppgot2.getUnlocalizedName());
			GameRegistry.registerItem(ModMetals.leadgot, ModMetals.leadgot.getUnlocalizedName());
			GameRegistry.registerItem(ModMetals.meltleadgot, ModMetals.meltleadgot.getUnlocalizedName());
			GameRegistry.registerItem(ModMetals.magngot, ModMetals.magngot.getUnlocalizedName());
			GameRegistry.registerItem(ModMetals.meltmagngot, ModMetals.meltmagngot.getUnlocalizedName());
			GameRegistry.registerItem(ModMetals.nickgot, ModMetals.nickgot.getUnlocalizedName());
			GameRegistry.registerItem(ModMetals.meltnickgot1, ModMetals.meltnickgot1.getUnlocalizedName());
			GameRegistry.registerItem(ModMetals.meltnickgot2, ModMetals.meltnickgot2.getUnlocalizedName());
			GameRegistry.registerItem(ModMetals.platgot, ModMetals.platgot.getUnlocalizedName());
			GameRegistry.registerItem(ModMetals.meltplatgot1, ModMetals.meltplatgot1.getUnlocalizedName());
			GameRegistry.registerItem(ModMetals.meltplatgot2, ModMetals.meltplatgot2.getUnlocalizedName());
			GameRegistry.registerItem(ModMetals.meltplatgot3, ModMetals.meltplatgot3.getUnlocalizedName());
			GameRegistry.registerItem(ModMetals.silvergot, ModMetals.silvergot.getUnlocalizedName());
			GameRegistry.registerItem(ModMetals.meltsilvergot1, ModMetals.meltsilvergot1.getUnlocalizedName());
			GameRegistry.registerItem(ModMetals.meltsilvergot2, ModMetals.meltsilvergot2.getUnlocalizedName());
			GameRegistry.registerItem(ModMetals.tingot, ModMetals.tingot.getUnlocalizedName());
			GameRegistry.registerItem(ModMetals.melttingot, ModMetals.melttingot.getUnlocalizedName());
			GameRegistry.registerItem(ModMetals.titagot, ModMetals.titagot.getUnlocalizedName());
			GameRegistry.registerItem(ModMetals.melttitagot1, ModMetals.melttitagot1.getUnlocalizedName());
			GameRegistry.registerItem(ModMetals.melttitagot2, ModMetals.melttitagot2.getUnlocalizedName());
			GameRegistry.registerItem(ModMetals.melttitagot3, ModMetals.melttitagot3.getUnlocalizedName());
			GameRegistry.registerItem(ModMetals.zincgot, ModMetals.zincgot.getUnlocalizedName());
			GameRegistry.registerItem(ModMetals.meltzincgot, ModMetals.meltzincgot.getUnlocalizedName());
			GameRegistry.registerItem(ModMetals.steengot, ModMetals.steengot.getUnlocalizedName());
			GameRegistry.registerItem(ModMetals.vsteengot, ModMetals.vsteengot.getUnlocalizedName());
			GameRegistry.registerItem(ModMetals.ssteengot, ModMetals.ssteengot.getUnlocalizedName());
			GameRegistry.registerItem(ModMetals.brongot, ModMetals.brongot.getUnlocalizedName());
			GameRegistry.registerItem(ModMetals.citegot, ModMetals.citegot.getUnlocalizedName());
			GameRegistry.registerItem(ModMetals.titegot, ModMetals.titegot.getUnlocalizedName());
		}
		// WEAPONS
		if (ConfigurationHandler.fixedCombatCheck == true) {
			GameRegistry.registerItem(ModWeapons.practicebattleaxe, ModWeapons.practicebattleaxe.getUnlocalizedName());
			GameRegistry.registerItem(ModWeapons.chain, ModWeapons.chain.getUnlocalizedName());
			GameRegistry.registerItem(ModWeapons.club, ModWeapons.club.getUnlocalizedName());
			GameRegistry.registerItem(ModWeapons.practicedagger, ModWeapons.practicedagger.getUnlocalizedName());
			GameRegistry.registerItem(ModWeapons.practiceflail, ModWeapons.practiceflail.getUnlocalizedName());
			GameRegistry.registerItem(ModWeapons.practiceglaive, ModWeapons.practiceglaive.getUnlocalizedName());
			GameRegistry.registerItem(ModWeapons.practicegreataxe, ModWeapons.practicegreataxe.getUnlocalizedName());
			GameRegistry.registerItem(ModWeapons.practicegreatsword,
					ModWeapons.practicegreatsword.getUnlocalizedName());
			GameRegistry.registerItem(ModWeapons.practicehalberd, ModWeapons.practicehalberd.getUnlocalizedName());
			GameRegistry.registerItem(ModWeapons.practicehandaxe, ModWeapons.practicehandaxe.getUnlocalizedName());
			GameRegistry.registerItem(ModWeapons.practicejavelin, ModWeapons.practicejavelin.getUnlocalizedName());
			GameRegistry.registerItem(ModWeapons.practicelance, ModWeapons.practicelance.getUnlocalizedName());
			GameRegistry.registerItem(ModWeapons.practicelongsword, ModWeapons.practicelongsword.getUnlocalizedName());
			GameRegistry.registerItem(ModWeapons.practicemace, ModWeapons.practicemace.getUnlocalizedName());
			GameRegistry.registerItem(ModWeapons.practicemaul, ModWeapons.practicemaul.getUnlocalizedName());
			GameRegistry.registerItem(ModWeapons.practicemorningstar,
					ModWeapons.practicemorningstar.getUnlocalizedName());
			GameRegistry.registerItem(ModWeapons.practicepike, ModWeapons.practicepike.getUnlocalizedName());
			GameRegistry.registerItem(ModWeapons.quarterstaff, ModWeapons.quarterstaff.getUnlocalizedName());
			GameRegistry.registerItem(ModWeapons.practicerapier, ModWeapons.practicerapier.getUnlocalizedName());
			GameRegistry.registerItem(ModWeapons.practicescimitar, ModWeapons.practicescimitar.getUnlocalizedName());
			GameRegistry.registerItem(ModWeapons.practiceshortsword,
					ModWeapons.practiceshortsword.getUnlocalizedName());
			GameRegistry.registerItem(ModWeapons.practicesickle, ModWeapons.practicesickle.getUnlocalizedName());
			GameRegistry.registerItem(ModWeapons.practicespear, ModWeapons.practicespear.getUnlocalizedName());
			GameRegistry.registerItem(ModWeapons.practicetrident, ModWeapons.practicetrident.getUnlocalizedName());
			GameRegistry.registerItem(ModWeapons.practicewarhammer, ModWeapons.practicewarhammer.getUnlocalizedName());
			GameRegistry.registerItem(ModWeapons.practicewarpick, ModWeapons.practicewarpick.getUnlocalizedName());
			GameRegistry.registerItem(ModWeapons.whip, ModWeapons.whip.getUnlocalizedName());
		}
	}

	@EventHandler
	public static void load(FMLInitializationEvent event) {
		proxy.init(event);
	}

	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
}