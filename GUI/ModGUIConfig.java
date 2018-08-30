package com.LichlandDevs.GUI;


import static com.LichlandDevs.LichlandCore.ConfigurationHandler.*;

import com.LichlandDevs.LichlandCore.RefStrings;

import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class ModGUIConfig extends GuiConfig {
	public ModGUIConfig(GuiScreen guiScreen) {
		super(guiScreen, new ConfigElement(getConfig().getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
				RefStrings.MODID, false, false, GuiConfig.getAbridgedConfigPath(getConfig().toString()));
	}
}