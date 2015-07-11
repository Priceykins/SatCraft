package org.priceykins.forge.mod.satcraft.blocks;

import java.util.Random;
import org.priceykins.forge.mod.satcraft.items.SatCraftItems;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockSilicaOre extends BlockBasic {
	
	private static final String NAME = "silicaOreBlock";
	private int leastDropped = 2;
	private int mostDropped = 4;
	
	public BlockSilicaOre(){
		super();
		this.setUnlocalizedName(NAME);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setResistance(5.0F);
		this.setHardness(2.0F);
	}

	public String getName(){
		return NAME;
	}
	
    public Item getItemDropped(IBlockState state, Random random, int fortune){
    	return SatCraftItems.silicaCrystal;
    }
    
    public int quantityDropped(Random random){
    	return random.nextInt(mostDropped-leastDropped)+leastDropped;
    }

}
