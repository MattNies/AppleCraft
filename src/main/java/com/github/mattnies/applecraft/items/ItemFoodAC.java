package com.github.mattnies.applecraft.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.github.mattnies.applecraft.AppleCraft;
import com.github.mattnies.applecraft.Reference;

public class ItemFoodAC extends ItemFood
{
	private PotionEffect[] effects;
	private AppleAC apple;
	
	public ItemFoodAC(String unlocalizedName, int healAmount, float satModifier, boolean isWolfFood, AppleAC apple)
	{
		super(healAmount, satModifier, isWolfFood);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Reference.MODID + ":" + unlocalizedName);
		this.setCreativeTab(AppleCraft.appleTab);
		this.apple = apple;
	}
	
	public ItemFoodAC(String unlocalizedName, int healAmount, float satModifier, boolean isWolfFood, AppleAC apple, PotionEffect...effects)
	{
		super(healAmount, satModifier, isWolfFood);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Reference.MODID + ":" + unlocalizedName);
		this.setCreativeTab(AppleCraft.appleTab);
		this.effects = effects;
		this.apple = AppleAC.Potion;
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player)
	{
		super.onFoodEaten(stack, world, player);
		
		switch (this.apple) 
		{
			case Normal:
				break;
				
			case Potion:
				for (int i = 0; i < this.effects.length; i++)
				{
					if (!world.isRemote && this.effects[i] != null && this.effects[i].getPotionID() > 0)
					{
						player.addPotionEffect(new PotionEffect(this.effects[i].getPotionID()
								, this.effects[i].getDuration()
								, this.effects[i].getAmplifier()
								, this.effects[i].getIsAmbient()));
					}
				}
				break;
				
			case Random:
				/*
				//effects = getRandomPotionEffects();
				PotionEffect[] pEffects = new PotionEffect[1];	
				pEffects[0] = new PotionEffect(Potion.invisibility.id, 1200, 1);
				
				for (int i = 0; i < pEffects.length; i++)
				{					
					if (!world.isRemote && pEffects[i] != null && pEffects[i].getPotionID() > 0)
					{
						player.addPotionEffect(new PotionEffect(pEffects[i].getPotionID()
								, pEffects[i].getDuration()
								, pEffects[i].getAmplifier()
								, pEffects[i].getIsAmbient()));
					}
				}
				break;*/
			case RandomNegative:
				break;
			case RandomPositive:
				break;
			default:
				break;
		}
	}
	
	private PotionEffect[] getRandomPotionEffects()
	{
		
		PotionEffect[] pEffect = new PotionEffect[1];	
		pEffect[0] = new PotionEffect(Potion.invisibility.id, 1200, 1);
		
		/*
		 * 
		Random rand = new Random();
		for ( int i = 0; i < effects.length; i++)
		{
			pEffect[i] = new PotionEffect(Reference.allPotions[rand.nextInt(Reference.NUMBER_OF_POTIONS_TYPES)+ 1].id, 1200, 1);
		}
		*/
		
		
		return pEffect;
	}
}
