package com.LichlandDevs.WeaponsSimple;

import com.LichlandDevs.WeaponsCore.IAttackSpeed;
import com.LichlandDevs.WeaponsCore.IShortenedReach;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.Vec3;

public class HandAxeWeapon extends ItemSword implements IShortenedReach, IAttackSpeed {

	public HandAxeWeapon(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
	}

	@Override
	public float getReach() {
		return 4.0F;
	}
	@Override
	public float getSpeed() {
		return 19.0F;
	}
}