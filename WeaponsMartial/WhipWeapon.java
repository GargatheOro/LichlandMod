package com.GargatheOro.WeaponsMartial;

import com.GargatheOro.WeaponsCore.IAttackSpeed;
import com.GargatheOro.WeaponsCore.IExtendedReach;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.Vec3;

public class WhipWeapon extends ItemSword implements IExtendedReach, IAttackSpeed {

	public WhipWeapon(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
	}

	@Override
	public float getReach() {
		return 10.0F;
	}
	@Override
	public float getSpeed() {
		return 34.0F;
	}
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase wielder) {

		Vec3 look = wielder.getLookVec().normalize();

		double knockback = 0.25;

		target.addVelocity(look.xCoord * knockback, look.yCoord * knockback, look.zCoord * knockback);

		return true;
	}
}