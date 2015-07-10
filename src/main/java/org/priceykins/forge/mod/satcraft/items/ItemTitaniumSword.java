package org.priceykins.forge.mod.satcraft.items;

import net.minecraft.item.ItemSword;

public class ItemTitaniumSword extends ItemSword {
	
	private static final String NAME = "titaniumSword";

	public ItemTitaniumSword(ToolMaterial titanium) {
		super(titanium);
		this.setUnlocalizedName(NAME);
	}
	
	public String getName(){
		
		return NAME;
	}

}
