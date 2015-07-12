package org.priceykins.forge.mod.satcraft.sats;

import java.util.HashMap;

import org.priceykins.forge.mod.satcraft.core.SatCraftConstants;

import net.minecraft.item.Item;

public class SatBasic extends Item {
	
	private boolean isPowered = false;
	private HashMap<Integer, Item> components;
	private String NAME = "SatBasic";
	
	public SatBasic(){
		super();
		this.setUnlocalizedName("SatBasic");
		this.setCreativeTab(SatCraftConstants.tabSatCraft);
		components = new HashMap<Integer, Item>();
	}
	
	public boolean getPowered(){
		return isPowered;
	}
	
	public void setPowered(boolean powered){
		isPowered = powered;
	}
	
	public HashMap<Integer, Item> getComponents(){
		return components;
	}
	
	public void addComponent(int position, Item component){
		components.put(position, component);
	}
	
	public void removeComponent(int position){
		components.remove(position);
	}
	
	public String getName(){
		return NAME;
	}
	
	public void setName(String name){
		NAME = name;
	}

}
