package com.GargatheOro.LichlandCore;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class ExtendedPlayer implements IExtendedEntityProperties {

	public final static String EXT_PROP_NAME = "PlayerLastAttacked";

	private final EntityPlayer player;

	public float lastAttacked;

	public ExtendedPlayer(EntityPlayer player) {
		this.player = player;
		this.lastAttacked = 20;
	}

	public static final void register(EntityPlayer player) {
		player.registerExtendedProperties(ExtendedPlayer.EXT_PROP_NAME, new ExtendedPlayer(player));
	}

	public static final ExtendedPlayer get(EntityPlayer player) {
		return (ExtendedPlayer) player.getExtendedProperties(EXT_PROP_NAME);
	}

	@Override
	public void saveNBTData(NBTTagCompound compound) {
		NBTTagCompound properties = new NBTTagCompound();
		properties.setFloat("lastAttacked", this.lastAttacked);
		compound.setTag(EXT_PROP_NAME, properties);
	}

	@Override
	public void loadNBTData(NBTTagCompound compound) {
		NBTTagCompound properties = (NBTTagCompound) compound.getTag(EXT_PROP_NAME);
		this.lastAttacked = properties.getFloat("lastAttacked");
	}

	@Override
	public void init(Entity entity, World world) {
	}

	public void update() {
		if (lastAttacked > 0)
			lastAttacked--;
		System.out.println("Extended Player Update Fired");
	}
}