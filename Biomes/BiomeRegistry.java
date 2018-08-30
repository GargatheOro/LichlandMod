package com.LichlandDevs.Biomes; //Edit the package directory

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

public class BiomeRegistry { // Edit class name if you wish

	public static void Main() {
		initializeBiome();
		registerBiome();
	}

	public static BiomeGenBase bambooForest;
	public static BiomeGenBase fantasyForest;

	public static void initializeBiome() {

		bambooForest = new BiomeGenBamboo(135).setBiomeName("bambooForest"); // Number in () is the biome ID; Feel free to change as needed
		fantasyForest = new BiomeGenFantasy(136).setBiomeName("fantasyForest");
	}

	public static void registerBiome() {
		BiomeDictionary.registerBiomeType(bambooForest, Type.FOREST);
		BiomeDictionary.registerBiomeType(fantasyForest, Type.FOREST);
		BiomeManager.addSpawnBiome(bambooForest);
		BiomeManager.addSpawnBiome(fantasyForest);
	}
}