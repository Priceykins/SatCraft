package org.priceykins.forge.mod.satcraft.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemSilicon extends Item {


	private static final String NAME = "silicon";
	
	public ItemSilicon(){
		super();
		this.setUnlocalizedName(NAME);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	public String getName(){
		return NAME;
	}
}

