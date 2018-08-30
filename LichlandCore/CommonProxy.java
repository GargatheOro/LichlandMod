package com.LichlandDevs.LichlandCore;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.relauncher.Side;
import net.minecraftforge.common.MinecraftForge;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent e) {

	}

	public void init(FMLInitializationEvent e) {
		Main.network = NetworkRegistry.INSTANCE.newSimpleChannel(RefStrings.NETWORK_CHANNEL_NAME);

		int packetId = 0;
		// register messages from client to server
		Main.network.registerMessage(MessageExtendedReachAttack.Handler.class, MessageExtendedReachAttack.class,
				packetId++, Side.SERVER);
		MinecraftForge.EVENT_BUS.register(new CommonHandler());
	}

	public void postInit(FMLPostInitializationEvent e) {

	}
}