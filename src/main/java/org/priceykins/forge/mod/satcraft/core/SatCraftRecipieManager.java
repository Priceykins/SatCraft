package org.priceykins.forge.mod.satcraft.core;

import org.priceykins.forge.mod.satcraft.blocks.SatCraftBlocks;
import org.priceykins.forge.mod.satcraft.items.SatCraftItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;

public class SatCraftRecipieManager {
	
	public static void loadRecipies(){
		
		SatCraftRecipieManager.loadSmeltingRecipies();
		SatCraftRecipieManager.loadToolRecipies();
	}
	
	public static void loadSmeltingRecipies(){
		
		FurnaceRecipes.instance().addSmeltingRecipeForBlock(SatCraftBlocks.titaniumOre, new ItemStack(SatCraftItems.titaniumIngot, 1), 1.0F);
		FurnaceRecipes.instance().addSmeltingRecipeForBlock(SatCraftBlocks.aluminiumOre, new ItemStack(SatCraftItems.aluminiumIngot, 1), 1.0F);
	}
	
	public static void loadToolRecipies(){
		
		CraftingManager.getInstance().addRecipe(new ItemStack(SatCraftItems.titaniumPickaxe, 1), "ttt", " s ", " s ", Character.valueOf('s'), Items.stick, Character.valueOf('t'), SatCraftItems.titaniumIngot);
		CraftingManager.getInstance().addRecipe(new ItemStack(SatCraftItems.titaniumSword, 1), " t ", " t ", " s ", Character.valueOf('s'), Items.stick, Character.valueOf('t'), SatCraftItems.titaniumIngot);
		CraftingManager.getInstance().addRecipe(new ItemStack(SatCraftItems.titaniumAxe, 1), " tt", " st", " s ", Character.valueOf('s'), Items.stick, Character.valueOf('t'), SatCraftItems.titaniumIngot);
		CraftingManager.getInstance().addRecipe(new ItemStack(SatCraftItems.titaniumShovel, 1), " t ", " s ", " s ", Character.valueOf('s'), Items.stick, Character.valueOf('t'), SatCraftItems.titaniumIngot);
		CraftingManager.getInstance().addRecipe(new ItemStack(SatCraftItems.titaniumHoe, 1), "tt ", " s ", " s ", Character.valueOf('s'), Items.stick, Character.valueOf('t'), SatCraftItems.titaniumIngot);
	}

}
