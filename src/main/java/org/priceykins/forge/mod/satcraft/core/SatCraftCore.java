package org.priceykins.forge.mod.satcraft.core;



import org.priceykins.forge.mod.satcraft.blocks.*;
import org.priceykins.forge.mod.satcraft.items.SatCraftItems;
import org.priceykins.forge.mod.satcraft.world.gen.OverworldGenerator;

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
	protected static final String MOD_BUILD_VERSION = "10";
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
	    //Initialising the mod

		//Init the blocks
		SatCraftBlocks.initBlocks();
		//init materials and items
		SatCraftItems.initMaterials();
		SatCraftItems.initItems();
		//add blocks and items to world
		this.addBlocksToWorld();
		this.addItemsToWorld();
		//add recipies
		SatCraftRecipieManager.loadRecipies();
	}
	
	public void addItemsToWorld(){
		
		//Add items to the world
		
		//Items - Materials
		GameRegistry.registerItem(SatCraftItems.titaniumIngot, SatCraftItems.titaniumIngot.getName());
		this.registerModelAndTexture(SatCraftItems.titaniumIngot.getName());
		GameRegistry.registerItem(SatCraftItems.aluminiumIngot, SatCraftItems.aluminiumIngot.getName());
		this.registerModelAndTexture(SatCraftItems.aluminiumIngot.getName());	
		GameRegistry.registerItem(SatCraftItems.silicaCrystal, SatCraftItems.silicaCrystal.getName());
		this.registerModelAndTexture(SatCraftItems.silicaCrystal.getName());
		
		//Items - Tools
		GameRegistry.registerItem(SatCraftItems.titaniumPickaxe, SatCraftItems.titaniumPickaxe.getName());
		this.registerModelAndTexture(SatCraftItems.titaniumPickaxe.getName());
		GameRegistry.registerItem(SatCraftItems.titaniumAxe, SatCraftItems.titaniumAxe.getName());
		this.registerModelAndTexture(SatCraftItems.titaniumAxe.getName());
		GameRegistry.registerItem(SatCraftItems.titaniumHoe, SatCraftItems.titaniumHoe.getName());
		this.registerModelAndTexture(SatCraftItems.titaniumHoe.getName());
		GameRegistry.registerItem(SatCraftItems.titaniumSword, SatCraftItems.titaniumSword.getName());
		this.registerModelAndTexture(SatCraftItems.titaniumSword.getName());
		GameRegistry.registerItem(SatCraftItems.titaniumShovel, SatCraftItems.titaniumShovel.getName());
		this.registerModelAndTexture(SatCraftItems.titaniumShovel.getName());
	}
	
	public void addBlocksToWorld(){
		
		//init the blocks
		//Current block types: blockTitaniumOre, blockAluminiumOre
		
		this.registerBlock(SatCraftBlocks.titaniumOre, SatCraftBlocks.titaniumOre.getName());
		this.registerModelAndTexture(SatCraftBlocks.titaniumOre.getName());
		this.registerBlock(SatCraftBlocks.aluminiumOre, SatCraftBlocks.aluminiumOre.getName());
		this.registerModelAndTexture(SatCraftBlocks.aluminiumOre.getName());
		this.registerBlock(SatCraftBlocks.silicaOre, SatCraftBlocks.silicaOre.getName());
		this.registerModelAndTexture(SatCraftBlocks.silicaOre.getName());
		GameRegistry.registerWorldGenerator(new OverworldGenerator(), 1);
	
	}
	
	//Method to register the mods blocks
	public void registerBlock(Block block, String name){
		
		GameRegistry.registerBlock(block, name);
	}
	
	//Method to register the blocks textures and models
	//unloc_name is the unlocalised name of the block being registered
	public void registerModelAndTexture(String name){
		
		Item item = GameRegistry.findItem(MOD_NAME.toLowerCase(), name);
		ModelResourceLocation model = new ModelResourceLocation(MOD_NAME.toLowerCase() + ":" + name, "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, model);
	}
	

}


