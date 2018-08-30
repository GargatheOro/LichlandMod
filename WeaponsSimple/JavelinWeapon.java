package com.LichlandDevs.WeaponsSimple;

import com.LichlandDevs.WeaponsCore.IAttackSpeed;
import com.LichlandDevs.WeaponsCore.IExtendedReach;
import com.LichlandDevs.WeaponsCore.IShortenedReach;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.Vec3;

public class JavelinWeapon extends ItemSword implements IExtendedReach, IAttackSpeed {

	public JavelinWeapon(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
	}
//BREAKS AFTER ONE USE! HAS A RANDOM CHANCE OF DROPPING ITSELF NEAR THE OPPONENT AFTER THE BLEED EFFECT WHERES OFF
	@Override
	public float getReach() {
		return 25.0F;
	}
	@Override
	public float getSpeed() {
		return 100.0F;
	}
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase wielder) {

		Vec3 look = wielder.getLookVec().normalize();

		double knockback = 1.05;

		target.addVelocity(look.xCoord * knockback, look.yCoord * knockback, look.zCoord * knockback);

		return true;
	}
}