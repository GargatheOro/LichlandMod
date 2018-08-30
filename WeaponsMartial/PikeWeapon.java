package com.LichlandDevs.WeaponsMartial;

import com.LichlandDevs.WeaponsCore.IAttackSpeed;
import com.LichlandDevs.WeaponsCore.IExtendedReach;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.Vec3;

public class PikeWeapon extends ItemSword implements IExtendedReach, IAttackSpeed {

	public PikeWeapon(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
	}

	@Override
	public float getReach() {
		return 7.0F;
	}
	@Override
	public float getSpeed() {
		return 21.0F;
	}
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase wielder) {

		Vec3 look = wielder.getLookVec().normalize();

		double knockback = 0.45;

		target.addVelocity(look.xCoord * knockback, look.yCoord * knockback, look.zCoord * knockback);

		return true;
	}
}