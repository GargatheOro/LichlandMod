package com.LichlandDevs.WeaponsMartial;

import com.LichlandDevs.WeaponsCore.IAttackSpeed;
import com.LichlandDevs.WeaponsCore.IShortenedReach;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.Vec3;

public class BattleAxeWeapon extends ItemSword implements IShortenedReach, IAttackSpeed {

	public BattleAxeWeapon(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
	}
	@Override
	public float getReach() {
		return 4.0F;
	}
	@Override
	public float getSpeed() {
		return 33.0F;
	}
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase wielder) {

		Vec3 look = wielder.getLookVec().normalize();

		double knockback = 0.25;

		target.addVelocity(look.xCoord * knockback, look.yCoord * knockback, look.zCoord * knockback);

		return true;
	}
}