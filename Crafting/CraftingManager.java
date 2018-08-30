package com.GargatheOro.Crafting;

import com.GargatheOro.Blocks.ModBlocks;
import com.GargatheOro.Items.ModFood;
import com.GargatheOro.Items.ModItems;
import com.GargatheOro.Items.ModMetals;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingManager {
	public static void Main(){
		addCraftingRec();
		addSmeltingRec();
	}
	public static void addCraftingRec(){
		//CRUDE ITEMS
		
		//BLOCKS
		
		//GameRegistry.addRecipe(new ItemStack(, ), new Object []{"", "", "", '',});
		//GameRegistry.addShapelessRecipe(new ItemStack(, ), new Object[] {});
	}
	public static void addSmeltingRec(){
		//GameRegistry.addSmelting(, new ItemStack(, ), );
	}
}