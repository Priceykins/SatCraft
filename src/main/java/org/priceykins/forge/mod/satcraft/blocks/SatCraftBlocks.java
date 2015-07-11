package org.priceykins.forge.mod.satcraft.blocks;


public class SatCraftBlocks {
	
	public static BlockTitaniumOre titaniumOre;
	public static BlockAluminiumOre aluminiumOre;
	public static BlockSilicaOre silicaOre;
	
	public static void initBlocks(){
		
		//Create the blocks
		titaniumOre = new BlockTitaniumOre();
		aluminiumOre = new BlockAluminiumOre();
		silicaOre = new BlockSilicaOre();
		
		//Set harvest levels
		titaniumOre.setHarvestLevel("pickaxe", 2);
		aluminiumOre.setHarvestLevel("pickaxe", 1);
		silicaOre.setHarvestLevel("pickaxe", 1);
	}
	

}
