package com.GargatheOro.MetalBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class mediumblock extends Block {

	protected mediumblock(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(soundTypeMetal);
		this.setHardness(5.0F);
		this.setResistance(10.0F);
	}
}