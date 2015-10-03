package com.github.mattnies.applecraft;

import net.minecraft.creativetab.CreativeTabs;

import com.github.mattnies.applecraft.creativetab.CreativeTabAC;
import com.github.mattnies.applecraft.init.ModItems;
import com.github.mattnies.applecraft.init.ModRecipes;
import com.github.mattnies.applecraft.proxies.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class AppleCraft 
{
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static CommonProxy proxy;

	@Instance(Reference.MODID)
	public static AppleCraft instance;
	
	
	public static CreativeTabs appleTab = new CreativeTabAC("applecraft", CreativeTabs.getNextID());
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModItems.registerItems();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		ModRecipes.registerRecipes();
		ModRecipes.registerShapelessRecipes();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}

}
