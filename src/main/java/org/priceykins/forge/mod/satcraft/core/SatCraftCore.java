package org.priceykins.forge.mod.satcraft.core;



import org.priceykins.forge.mod.satcraft.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = SatCraftCore.MOD_NAME, version = SatCraftCore.MOD_MAJ_VERSION + "." + SatCraftCore.MOD_MIN_VERSION + "." + SatCraftCore.MOD_BUILD_VERSION + ".")
public class SatCraftCore {

	//Mod name and version related variables
	protected static final String MOD_NAME = "SatCraft";
	protected static final String MOD_MAJ_VERSION = "0";
	protected static final String MOD_MIN_VERSION = "1";
	protected static final String MOD_BUILD_VERSION = "2";
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
	    //Initialising the mod

		//Init the blocks
		this.initBlocks();
	}
	
	public void initBlocks(){
		
		//init the blocks
		//Current block types: blockTitaniumOre, blockAluminiumOre
		BlockTitaniumOre titaniumOre = new BlockTitaniumOre();
		this.registerBlock(titaniumOre, titaniumOre.getName());
		this.registerBlockModelAndTexture(titaniumOre.getName());
		BlockAluminiumOre aluminiumOre = new BlockAluminiumOre();
		this.registerBlock(aluminiumOre, aluminiumOre.getName());
		this.registerBlockModelAndTexture(aluminiumOre.getName());
	}
	
	//Method to register the mods blocks
	public void registerBlock(Block block, String name){
		
		GameRegistry.registerBlock(block, name);
	}
	
	//Method to register the blocks textures and models
	//unloc_name is the unlocalised name of the block being registered
	public void registerBlockModelAndTexture(String name){
		
		Item item = GameRegistry.findItem(MOD_NAME.toLowerCase(), name);
		ModelResourceLocation model = new ModelResourceLocation(MOD_NAME.toLowerCase() + ":" + name, "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, model);
	}
	

}


