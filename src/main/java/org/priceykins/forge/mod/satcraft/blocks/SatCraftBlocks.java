package org.priceykins.forge.mod.satcraft.blocks;


public class SatCraftBlocks {
	
	public static BlockTitaniumOre titaniumOre;
	public static BlockAluminiumOre aluminiumOre;
	
	public static void initBlocks(){
		
		//Create the blocks
		titaniumOre = new BlockTitaniumOre();
		aluminiumOre = new BlockAluminiumOre();
		
		//Set harvest levels
		titaniumOre.setHarvestLevel("pickaxe", 2);
		aluminiumOre.setHarvestLevel("pickaxe", 1);
	}
	

}
