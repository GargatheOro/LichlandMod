package com.GargatheOro.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class marble extends Block{

	protected marble(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(3F);
		this.setResistance(7.5F);
		this.setStepSound(soundTypeStone);
	}
}