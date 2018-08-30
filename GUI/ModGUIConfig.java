package com.GargatheOro.GUI;


import com.GargatheOro.LichlandCore.RefStrings;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import static com.GargatheOro.LichlandCore.ConfigurationHandler.*;

public class ModGUIConfig extends GuiConfig {
	public ModGUIConfig(GuiScreen guiScreen) {
		super(guiScreen, new ConfigElement(getConfig().getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
				RefStrings.MODID, false, false, GuiConfig.getAbridgedConfigPath(getConfig().toString()));
	}
}