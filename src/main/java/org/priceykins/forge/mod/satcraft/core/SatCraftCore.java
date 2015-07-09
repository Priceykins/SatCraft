package org.priceykins.forge.mod.satcraft.core;

import org.priceykins.forge.mod.satcraft.blocks.*;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = SatCraftCore.MOD_NAME, version = SatCraftCore.MOD_MAJ_VERSION + "." + SatCraftCore.MOD_MIN_VERSION + "." + SatCraftCore.MOD_BUILD_VERSION + ".")
public class SatCraftCore {

	public static final String MOD_NAME = "SatCraft";
	public static final String MOD_MAJ_VERSION = "0";
	public static final String MOD_MIN_VERSION = "1";
	public static final String MOD_BUILD_VERSION = "1";
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
	    //Initialising the mod
		//Register the new Blocks
		this.registerBlock(new BlockTitaniumOre(), "titaniumOreBlock");
		this.registerBlock(new BlockAluminiumOre(), "aluminiumOreBlock");
	}
	
	public void registerBlock(Block block, String name){
		
		GameRegistry.registerBlock(block, name);
	}
}


