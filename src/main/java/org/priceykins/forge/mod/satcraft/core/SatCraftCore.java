package org.priceykins.forge.mod.satcraft.core;



import org.priceykins.forge.mod.satcraft.blocks.*;
import org.priceykins.forge.mod.satcraft.items.SatCraftItems;
import org.priceykins.forge.mod.satcraft.sats.SatCraftSats;
import org.priceykins.forge.mod.satcraft.world.gen.OverworldGenerator;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = SatCraftConstants.MOD_NAME, version = SatCraftConstants.MOD_MAJ_VERSION + "." + SatCraftConstants.MOD_MIN_VERSION + "." + SatCraftConstants.MOD_BUILD_VERSION + ".")
public class SatCraftCore {

	//Mod name and version related variables

	
	@EventHandler
	public void init(FMLInitializationEvent event) {
	    //Initialising the mod

		//Init the blocks
		SatCraftBlocks.initBlocks();
		//init materials and items
		SatCraftItems.initMaterials();
		SatCraftItems.initItems();
		SatCraftSats.initSats();
		//add blocks and items to world
		this.addBlocksToWorld();
		this.addItemsToWorld();
		//creative tab
		
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
		GameRegistry.registerItem(SatCraftItems.silicon, SatCraftItems.silicon.getName());
		this.registerModelAndTexture(SatCraftItems.silicon.getName());
		
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
		
		//Items - Sat Components
		GameRegistry.registerItem(SatCraftItems.titaniumStrut, SatCraftItems.titaniumStrut.getName());
		this.registerModelAndTexture(SatCraftItems.titaniumStrut.getName());
		GameRegistry.registerItem(SatCraftItems.aluminiumStrut, SatCraftItems.aluminiumStrut.getName());
		this.registerModelAndTexture(SatCraftItems.aluminiumStrut.getName());
		GameRegistry.registerItem(SatCraftItems.aluminiumCubeSatFrame, SatCraftItems.aluminiumCubeSatFrame.getName());
		this.registerModelAndTexture(SatCraftItems.aluminiumCubeSatFrame.getName());
		GameRegistry.registerItem(SatCraftItems.basicCircuitBoard, SatCraftItems.basicCircuitBoard.getName());
		this.registerModelAndTexture(SatCraftItems.basicCircuitBoard.getName());
		GameRegistry.registerItem(SatCraftItems.clayTile, SatCraftItems.clayTile.getName());
		this.registerModelAndTexture(SatCraftItems.clayTile.getName());
		GameRegistry.registerItem(SatCraftItems.ceramicPlate, SatCraftItems.ceramicPlate.getName());
		this.registerModelAndTexture(SatCraftItems.ceramicPlate.getName());
		
		//Items - Sats
		GameRegistry.registerItem(SatCraftSats.basicCubeSat, SatCraftSats.basicCubeSat.getName());
		this.registerModelAndTexture(SatCraftSats.basicCubeSat.getName());
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
		
		Item item = GameRegistry.findItem(SatCraftConstants.MOD_NAME.toLowerCase(), name);
		ModelResourceLocation model = new ModelResourceLocation(SatCraftConstants.MOD_NAME.toLowerCase() + ":" + name, "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, model);
	}
}


