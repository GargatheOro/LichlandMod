package com.GargatheOro.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class limestone extends Block {

	protected limestone(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(2F);
		this.setResistance(5F);
		this.setStepSound(soundTypeStone);
	}
}