package com.LichlandDevs.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class dblock extends Block{

	protected dblock(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setHarvestLevel("pickaxe", 100);
		this.setHardness(100.0F);
		this.setResistance(10000.0F);
		this.setStepSound(soundTypeStone);
	}
}