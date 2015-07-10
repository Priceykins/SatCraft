package org.priceykins.forge.mod.satcraft.items;

import net.minecraft.item.ItemHoe;

public class ItemTitaniumHoe extends ItemHoe {

	
	private static final String NAME = "titaniumHoe";

	public ItemTitaniumHoe(ToolMaterial titanium) {
		super(titanium);
		this.setUnlocalizedName(NAME);
	}
	
	public String getName(){
		
		return NAME;
	}
}
