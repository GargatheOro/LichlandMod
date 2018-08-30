package com.GargatheOro.MetalBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class reinforcedblock extends Block {

	protected reinforcedblock(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setHarvestLevel("pickaxe", 3);
		this.setStepSound(soundTypeMetal);
		this.setHardness(7.0F);
		this.setResistance(15.0F);
	}
}