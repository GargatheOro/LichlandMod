package com.LichlandDevs.MetalBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class weakblock extends Block {

	protected weakblock(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setHarvestLevel("pickaxe", 1);
		this.setStepSound(soundTypeMetal);
		this.setHardness(4.0F);
		this.setResistance(8.0F);
	}
}