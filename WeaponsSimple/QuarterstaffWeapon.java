package com.LichlandDevs.WeaponsSimple;

import com.LichlandDevs.WeaponsCore.IAttackSpeed;
import com.LichlandDevs.WeaponsCore.IExtendedReach;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.Vec3;

public class QuarterstaffWeapon extends ItemSword implements IExtendedReach, IAttackSpeed {

	public QuarterstaffWeapon(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
	}

	@Override
	public float getReach() {
		return 6.0F;
	}
	@Override
	public float getSpeed() {
		return 27.0F;
	}
}