package org.priceykins.forge.mod.satcraft.blocks;

import net.minecraft.creativetab.CreativeTabs;

public class BlockAluminiumOre extends BlockBasic {
	
	private static final String NAME = "aluminiumOreBlock";

	public BlockAluminiumOre(){
		super();
		this.setUnlocalizedName(NAME);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setResistance(5.0F);
		this.setHardness(10.0F);
	}
	
	public String getName(){
		return NAME;
	}
}
