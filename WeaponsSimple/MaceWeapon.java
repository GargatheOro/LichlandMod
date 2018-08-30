package com.LichlandDevs.WeaponsSimple;

import com.LichlandDevs.WeaponsCore.IAttackSpeed;
import com.LichlandDevs.WeaponsCore.IShortenedReach;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.Vec3;

public class MaceWeapon extends ItemSword implements IShortenedReach, IAttackSpeed {

	public MaceWeapon(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
	}

	@Override
	public float getReach() {
		return 3.0F;
	}
	@Override
	public float getSpeed() {
		return 26.0F;
	}
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase wielder) {

		Vec3 look = wielder.getLookVec().normalize();

		double knockback = 1.11;

		target.addVelocity(look.xCoord * knockback, look.yCoord * knockback, look.zCoord * knockback);

		return true;
	}
}