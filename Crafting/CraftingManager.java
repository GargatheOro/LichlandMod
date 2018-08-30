package com.LichlandDevs.Crafting;

import com.LichlandDevs.Blocks.ModBlocks;
import com.LichlandDevs.Items.ModFood;
import com.LichlandDevs.Items.ModItems;
import com.LichlandDevs.Items.ModMetals;

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