package org.priceykins.forge.mod.satcraft.items;

import net.minecraft.item.ItemSpade;

public class ItemTitaniumShovel extends ItemSpade {
	
	
	private static final String NAME = "titaniumShovel";

	public ItemTitaniumShovel(ToolMaterial titanium) {
		super(titanium);
		this.setUnlocalizedName(NAME);
	}
	
	public String getName(){
		
		return NAME;
	}

}
