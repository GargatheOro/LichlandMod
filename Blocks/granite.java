package com.GargatheOro.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class granite extends Block {

	protected granite(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(6F);
		this.setResistance(15F);
		this.setStepSound(soundTypeStone);
	}
}