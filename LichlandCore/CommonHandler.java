package com.GargatheOro.LichlandCore;

import com.GargatheOro.WeaponsCore.IAttackSpeed;
import com.GargatheOro.WeaponsCore.IShortenedReach;
import com.GargatheOro.WeaponsCore.ModWeapons;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class CommonHandler {
	@SubscribeEvent
	public void onLivingAttackEvent(LivingAttackEvent event) {
		if (event.source.getEntity() instanceof EntityLivingBase) {
			EntityLivingBase attacker = (EntityLivingBase) event.source.getEntity();
			if (attacker.getHeldItem() != null && attacker.getHeldItem().getItem() instanceof IShortenedReach) {
				double reach = ((IShortenedReach) attacker.getHeldItem().getItem()).getReach();
				if (attacker.getDistanceToEntity(event.entity) > reach) {
					event.setCanceled(true);
					return;
				}
			}
		}
	}

	@SubscribeEvent
	public void slowLivingAttackEvent(LivingAttackEvent event) {
		if (event.source.getEntity() instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.source.getEntity();
			ExtendedPlayer properties = ExtendedPlayer.get(player);
			if (properties != null) {
				if (player.getHeldItem() != null && player.getHeldItem().getItem() instanceof IAttackSpeed) {
					if (properties.lastAttacked > 0) {
						event.setCanceled(true);
						return;
					}
					properties.lastAttacked = ((IAttackSpeed) player.getHeldItem().getItem()).getSpeed();
				}
			}
		}
	}

	@SubscribeEvent
	public void onLivingUpdateEvent(LivingUpdateEvent event) {
		if (event.entityLiving instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.entity;
			ExtendedPlayer properties = ExtendedPlayer.get(player);
			if (properties != null) {
				properties.update();
			}
		}
	}

	@SubscribeEvent
	public void onEntityConstructing(EntityConstructing event) {
		if (event.entity instanceof EntityPlayer && ExtendedPlayer.get((EntityPlayer) event.entity) == null) {
			ExtendedPlayer.register((EntityPlayer) event.entity);
			if (event.entity instanceof EntityPlayer
					&& event.entity.getExtendedProperties(ExtendedPlayer.EXT_PROP_NAME) == null) {
				event.entity.registerExtendedProperties(ExtendedPlayer.EXT_PROP_NAME,
						new ExtendedPlayer((EntityPlayer) event.entity));
			}
		}
	}
}