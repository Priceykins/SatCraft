package org.priceykins.forge.mod.satcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTitaniumOre extends Block {
	
	public BlockTitaniumOre(){
		super(Material.iron);
		this.setUnlocalizedName("titaniumOreBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setResistance(5.0F);
		this.setHardness(10.0F);
	}

}
