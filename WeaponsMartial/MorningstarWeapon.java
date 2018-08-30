package com.GargatheOro.WeaponsMartial;

import com.GargatheOro.WeaponsCore.IAttackSpeed;
import com.GargatheOro.WeaponsCore.IShortenedReach;

import net.minecraft.item.ItemSword;

public class MorningstarWeapon extends ItemSword implements IShortenedReach, IAttackSpeed {

	public MorningstarWeapon(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
	}
	@Override
	public float getSpeed() {
		return 20.0F;
	}
	@Override
	public float getReach() {
		return 3.0F;
	}
}