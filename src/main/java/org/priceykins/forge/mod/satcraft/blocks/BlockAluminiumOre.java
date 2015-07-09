package org.priceykins.forge.mod.satcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockAluminiumOre extends Block {

	public BlockAluminiumOre(){
		super(Material.iron);
		this.setUnlocalizedName("AluminiumOreBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setResistance(5.0F);
		this.setHardness(10.0F);
	}
}
