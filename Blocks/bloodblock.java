package com.LichlandDevs.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class bloodblock extends Block {

	protected bloodblock(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setHarvestLevel("pickaxe", 4);
		this.setHardness(3.0F);
		this.setResistance(20.0F);
		this.setStepSound(soundTypeStone);
	}
}