package org.priceykins.forge.mod.satcraft.items;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class SatCraftItems {
	
	//blocks - ore
	public static ItemTitaniumIngot titaniumIngot;
	public static ItemAluminiumIngot aluminiumIngot;
	
	//items - tools
	public static ItemTitaniumPickaxe titaniumPickaxe;
	public static ItemTitaniumAxe titaniumAxe;
	public static ItemTitaniumHoe titaniumHoe;
	public static ItemTitaniumSword titaniumSword;
	public static ItemTitaniumShovel titaniumShovel;
	
	//Items - materials
	public static ItemSilicaCrystal silicaCrystal;
	public static ItemSilicon silicon;
	
	//Items - sat components
	public static ItemAluminiumStrut aluminiumStrut;
	public static ItemTitaniumStrut titaniumStrut;
	public static ItemAluminiumCubeSatFrame aluminiumCubeSatFrame;
	
	//materials
	public static ToolMaterial titanium;
	public static ToolMaterial aluminium;
	
	public static void initItems(){
		
		//blocks - ore
		titaniumIngot = new ItemTitaniumIngot();
		aluminiumIngot = new ItemAluminiumIngot();
		
		//items - tools
		titaniumPickaxe = new ItemTitaniumPickaxe(titanium);
		titaniumAxe = new ItemTitaniumAxe(titanium);
		titaniumHoe = new ItemTitaniumHoe(titanium);
		titaniumSword = new ItemTitaniumSword(titanium);
		titaniumShovel = new ItemTitaniumShovel(titanium);
		
		//Items - sat components
		aluminiumStrut = new ItemAluminiumStrut();
		titaniumStrut = new ItemTitaniumStrut();
		aluminiumCubeSatFrame = new ItemAluminiumCubeSatFrame();
		
		//Items - Materials
		silicaCrystal = new ItemSilicaCrystal();
		silicon = new ItemSilicon();
	}
	
	public static void initMaterials(){
		
		//add titanium material. Harvest level of iron. Faster and more durable than iron. .5 damage more than iron
		titanium = EnumHelper.addToolMaterial("titanium", 2, 500, 7.0F, 2.5F, 14);
		//add aluminium material. Harvest level of iron. Slower, less durable and less damage than iron
		aluminium = EnumHelper.addToolMaterial("aluminium", 2, 175, 5.0F, 2.0F, 14);
	}

}
