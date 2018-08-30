package com.LichlandDevs.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class basalt extends Block {

	protected basalt(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setHarvestLevel("pickaxe", 3);
		this.setHardness(100.0F);
		this.setResistance(50.0F);
		this.setStepSound(soundTypeStone);
	}
}