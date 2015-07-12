package org.priceykins.forge.mod.satcraft.items;

import org.priceykins.forge.mod.satcraft.core.SatCraftConstants;

import net.minecraft.item.Item;

public class ItemAluminiumCubeSatFrame extends Item {
	
	private static final String NAME = "aluminiumCubeSatFrame";
	
	public ItemAluminiumCubeSatFrame(){
		super();
		this.setUnlocalizedName(NAME);
		this.setCreativeTab(SatCraftConstants.tabSatCraft);
	}
	
	public String getName(){
		return NAME;
	}

}
