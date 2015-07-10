package org.priceykins.forge.mod.satcraft.core;

import org.priceykins.forge.mod.satcraft.blocks.SatCraftBlocks;
import org.priceykins.forge.mod.satcraft.items.SatCraftItems;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class SatCraftRecipieManager {
	
	public static void loadRecipies(){
		
		SatCraftRecipieManager.loadSmeltingRecipies();
	}
	
	public static void loadSmeltingRecipies(){
		FurnaceRecipes.instance().addSmeltingRecipeForBlock(SatCraftBlocks.titaniumOre, new ItemStack(SatCraftItems.titaniumIngot, 1), 1.0F);
		FurnaceRecipes.instance().addSmeltingRecipeForBlock(SatCraftBlocks.aluminiumOre, new ItemStack(SatCraftItems.aluminiumIngot, 1), 1.0F);
	}

}
