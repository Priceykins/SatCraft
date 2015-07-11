package org.priceykins.forge.mod.satcraft.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemSilicaCrystal extends Item {

	private static final String NAME = "silicaCrystal";
	
	public ItemSilicaCrystal(){
		super();
		this.setUnlocalizedName(NAME);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	public String getName(){
		return NAME;
	}
}
