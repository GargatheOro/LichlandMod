package com.LichlandDevs.WeaponsSimple;

import com.LichlandDevs.WeaponsCore.IAttackSpeed;
import com.LichlandDevs.WeaponsCore.IShortenedReach;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.Vec3;

public class ClubWeapon extends ItemSword implements IShortenedReach, IAttackSpeed {

	public ClubWeapon(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
	}

	@Override
	public float getReach() {
		return 3.0F;
	}
	@Override
	public float getSpeed() {
		return 20.0F;
	}
}