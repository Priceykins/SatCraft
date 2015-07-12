package org.priceykins.forge.mod.satcraft.core;

import org.priceykins.forge.mod.satcraft.sats.SatCraftSats;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SatCraftConstants {
	
	public static String SatCraftTabName = "SatCraft";
	protected static final String MOD_NAME = "SatCraft";
	protected static final String MOD_MAJ_VERSION = "0";
	protected static final String MOD_MIN_VERSION = "1";
	protected static final String MOD_BUILD_VERSION = "15";
	
	public static CreativeTabs tabSatCraft = new CreativeTabs(SatCraftTabName) {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return SatCraftSats.basicCubeSat;
	    }
	};

}
