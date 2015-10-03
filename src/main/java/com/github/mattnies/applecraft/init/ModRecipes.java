package com.github.mattnies.applecraft.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;

import com.github.mattnies.applecraft.helpers.RegisterHelper;
import com.github.mattnies.applecraft.items.PotionAC;

public class ModRecipes 
{
	public static void registerRecipes()
	{
		//RegisterHelper.registerRecipes(iStack, objects);
		RegisterHelper.registerRecipes(
				new ItemStack(ModItems.appleNightVision), new Object[]{"AA", 'A', Items.apple});
	}
	
	public static void registerShapelessRecipes()
	{
		RegisterHelper.registerShapelessRecipes(
				new ItemStack(ModItems.appleNightVision), 
				new Object[]{Items.apple, new ItemStack(Items.potionitem, 1, PotionAC.NightVision.getMetaData())});
		RegisterHelper.registerShapelessRecipes(
				new ItemStack(ModItems.appleNightVisionPlus), 
				new Object[]{Items.apple, new ItemStack(Items.potionitem, 1, PotionAC.NightVisionPlus.getMetaData())});
	}
}
