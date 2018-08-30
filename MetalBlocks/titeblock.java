package com.LichlandDevs.MetalBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class titeblock extends Block {

	protected titeblock(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setHarvestLevel("pickaxe", 4);
		this.setStepSound(soundTypeMetal);
		this.setHardness(8.0F);
		this.setResistance(100.0F);
	}
}