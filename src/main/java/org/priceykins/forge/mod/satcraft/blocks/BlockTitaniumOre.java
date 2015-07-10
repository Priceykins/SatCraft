package org.priceykins.forge.mod.satcraft.blocks;

import net.minecraft.creativetab.CreativeTabs;

public class BlockTitaniumOre extends BlockBasic {
	
	private static final String NAME = "titaniumOreBlock";
	
	public BlockTitaniumOre(){
		super();
		this.setUnlocalizedName(NAME);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setResistance(10.0F);
		this.setHardness(4.0F);
	}

	public String getName(){
		return NAME;
	}
}
