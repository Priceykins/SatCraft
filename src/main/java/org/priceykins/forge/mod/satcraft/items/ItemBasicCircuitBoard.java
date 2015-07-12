package org.priceykins.forge.mod.satcraft.items;

import org.priceykins.forge.mod.satcraft.core.SatCraftConstants;

import net.minecraft.item.Item;

public class ItemBasicCircuitBoard extends Item {

	private static final String NAME = "basicCircuitBoard";
	
	public ItemBasicCircuitBoard(){
		super();
		this.setUnlocalizedName(NAME);
		this.setCreativeTab(SatCraftConstants.tabSatCraft);
	}
	
	public String getName(){
		return NAME;
	}
}
