package org.priceykins.forge.mod.satcraft.items;

import net.minecraft.item.ItemAxe;

public class ItemTitaniumAxe extends ItemAxe {

	
	private static final String NAME = "titaniumAxe";

	public ItemTitaniumAxe(ToolMaterial titanium) {
		super(titanium);
		this.setUnlocalizedName(NAME);
	}
	
	public String getName(){
		
		return NAME;
	}
}
