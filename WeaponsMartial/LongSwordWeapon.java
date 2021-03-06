package com.LichlandDevs.WeaponsMartial;

import com.LichlandDevs.WeaponsCore.IAttackSpeed;
import com.LichlandDevs.WeaponsCore.IExtendedReach;

import net.minecraft.item.ItemSword;

public class LongSwordWeapon extends ItemSword implements IExtendedReach, IAttackSpeed {

	public LongSwordWeapon(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
	}
	@Override
	public float getSpeed() {
		return 30.0F;
	}
	@Override
	public float getReach() {
		return 6.0F;
	}

}