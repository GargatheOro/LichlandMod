package com.LichlandDevs.MetalBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class strongblock extends Block {

	protected strongblock(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(soundTypeMetal);
		this.setHardness(6.0F);
		this.setResistance(13.0F);
	}
}