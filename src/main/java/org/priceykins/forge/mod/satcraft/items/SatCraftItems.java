package org.priceykins.forge.mod.satcraft.items;

public class SatCraftItems {
	
	public static ItemTitaniumIngot titaniumIngot;
	public static ItemAluminiumIngot aluminiumIngot;
	
	public static void initItems(){
		
		titaniumIngot = new ItemTitaniumIngot();
		aluminiumIngot = new ItemAluminiumIngot();
	}

}
