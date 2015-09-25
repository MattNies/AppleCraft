package com.github.mattnies.applecraft.items;

import com.github.mattnies.applecraft.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemFoodAC extends ItemFood
{
	private PotionEffect[] effects;
	
	public ItemFoodAC(String unlocalizedName, int healAmount, float satModifier, boolean isWolfFood, PotionEffect...effects)
	{
		super(healAmount, satModifier, isWolfFood);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Reference.MODID + ":" + unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.effects = effects;
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player)
	{
		super.onFoodEaten(stack, world, player);
		
		for (int i = 0; i < effects.length; i++)
		{
			if (!world.isRemote && effects[i] != null && effects[i].getPotionID() > 0)
			{
				player.addPotionEffect(new PotionEffect(this.effects[i].getPotionID()
						, this.effects[i].getDuration()
						, this.effects[i].getAmplifier()
						, this.effects[i].getIsAmbient()));
			}
		}
	}
	
	
}
