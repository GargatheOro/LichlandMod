package com.GargatheOro.WeaponsMartial;

import com.GargatheOro.WeaponsCore.IAttackSpeed;
import com.GargatheOro.WeaponsCore.IShortenedReach;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.Vec3;

public class WarhammerWeapon extends ItemSword implements IShortenedReach, IAttackSpeed {

	public WarhammerWeapon(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
	}

	@Override
	public float getReach() {
		return 4.0F;
	}
	@Override
	public float getSpeed() {
		return 46.0F;
	}
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase wielder) {

		Vec3 look = wielder.getLookVec().normalize();

		double knockback = 1.5;

		target.addVelocity(look.xCoord * knockback, look.yCoord * knockback, look.zCoord * knockback);

		return true;
	}
}