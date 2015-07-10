package org.priceykins.forge.mod.satcraft.items;

import net.minecraft.item.ItemPickaxe;

public class ItemTitaniumPickaxe extends ItemPickaxe {
	
	private static final String NAME = "titaniumPickaxe";

	protected ItemTitaniumPickaxe(ToolMaterial titanium) {
		super(titanium);
		this.setUnlocalizedName(NAME);
	}

	public String getName(){
		
		return NAME;
	}
}
