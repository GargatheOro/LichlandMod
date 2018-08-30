package com.LichlandDevs.LichlandCore;

import java.io.File;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {

	public static Configuration config;
	public static boolean fluxBiomeCheck = true;
	public static boolean geologyCheck = true;
	public static boolean fixedCombatCheck = true;
	public static boolean metallurgyCheck = true;
	public static boolean fixedCookingCheck = true;
	public static boolean alcoholCheck = true;
	public static boolean monstersCheck = true;
	public static boolean bossesCheck = true;
	public static boolean dwarvesCheck = true;
	public static boolean nakayamiCheck = true;
	public static boolean vaskesiansCheck = true;
	public static boolean elvesCheck = true;
	public static boolean imperialsCheck = true;
	public static boolean victoriansCheck = true;
	public static boolean animalsCheck = true;
	public static boolean treesCheck = true;

	public static void init(String configDir) {
		if (config == null) {
			File path = new File(configDir + "/" + RefStrings.MODID + ".cfg");

			config = new Configuration(path); 
			loadConfig();
		}
	}

	private static void loadConfig() {
		fluxBiomeCheck = config.getBoolean("Enable Flux Wastes Biome", Configuration.CATEGORY_GENERAL, true,
				"Enable the Flux Wastes Biome");
		geologyCheck = config.getBoolean("Enable Geology", Configuration.CATEGORY_GENERAL, true,
				"Enable Custom Rocks and Underground Minerals");
		fixedCombatCheck = config.getBoolean("Enable Realistic Combat", Configuration.CATEGORY_GENERAL, true,
				"Enable Custom Weapons, Armor, Tools and Combat Mechanics");
		metallurgyCheck = config.getBoolean("Enable Flux Wastes Biome", Configuration.CATEGORY_GENERAL, true,
				"Enable Custom Metals, Metallurgy and Smithing System");
		fixedCookingCheck = config.getBoolean("Enable Cooking", Configuration.CATEGORY_GENERAL, true,
				"Enable Custom Cooking System");
		alcoholCheck = config.getBoolean("Enable Alcohol", Configuration.CATEGORY_GENERAL, true,
				"Enable Alcohol and Brewing");
		monstersCheck = config.getBoolean("Enable Custom Monsters", Configuration.CATEGORY_GENERAL, true,
				"Enable Custom Monsters");
		bossesCheck = config.getBoolean("Enable Custom Bosses", Configuration.CATEGORY_GENERAL, true,
				"Enable Custom Bosses");
		dwarvesCheck = config.getBoolean("Enable Dwarves", Configuration.CATEGORY_GENERAL, true,
				"Enable the Dwarven Race and Special Blocks");
		nakayamiCheck = config.getBoolean("Enable Nakayami", Configuration.CATEGORY_GENERAL, true,
				"Enable the Nakayami Race and Special Blocks");
		vaskesiansCheck = config.getBoolean("Enable Vaskesians", Configuration.CATEGORY_GENERAL, true,
				"Enable the Vaskesian Race and Special Blocks");
		elvesCheck = config.getBoolean("Enable Elves", Configuration.CATEGORY_GENERAL, true,
				"Enable the Elven Race and Special Blocks");
		imperialsCheck = config.getBoolean("Enable Imperials", Configuration.CATEGORY_GENERAL, true,
				"Enable the Imperial Race and Special Blocks");
		victoriansCheck = config.getBoolean("Enable Victorians", Configuration.CATEGORY_GENERAL, true,
				"Enable the Victorian Race and Special Blocks");
		animalsCheck = config.getBoolean("Enable Custom Animals", Configuration.CATEGORY_GENERAL, true,
				"Enable Custom Animals and Passive Mobs");
		treesCheck = config.getBoolean("Enable Custom Trees", Configuration.CATEGORY_GENERAL, true,
				"Enable Custom Trees");

		if (config.hasChanged()) {
			config.save();
		}
	}

	@SubscribeEvent
	public void onConfigChangeEvent(ConfigChangedEvent.OnConfigChangedEvent event) {

		if (event.modID.equalsIgnoreCase(RefStrings.MODID)) {
			loadConfig();
		}
	}

	public static Configuration getConfig() {
		return config;
	}
}