package com.github.mattnies.applecraft.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

import com.github.mattnies.applecraft.helpers.RegisterHelper;
import com.github.mattnies.applecraft.items.ItemAppleCraft;
import com.github.mattnies.applecraft.items.ItemFoodAC;

public class ModItems
{
	public static Item appleNew = new ItemAppleCraft("apple_new");	
	public static ItemFood luckyApple = new ItemFoodAC("apple_lucky", 2, .02f, false
			, new PotionEffect(Potion.damageBoost.id, 1200, 1)
			, new PotionEffect(Potion.digSpeed.id, 1200, 1)
			, new PotionEffect(Potion.fireResistance.id, 1200, 1)
			, new PotionEffect(Potion.invisibility.id, 1200, 1)
			, new PotionEffect(Potion.jump.id, 1200, 1)
			, new PotionEffect(Potion.moveSpeed.id, 1200, 1)
			, new PotionEffect(Potion.nightVision.id, 1200, 1)
			, new PotionEffect(Potion.regeneration.id, 1200, 1)
			, new PotionEffect(Potion.resistance.id, 1200, 1)
			, new PotionEffect(Potion.waterBreathing.id, 1200, 1));
	public static ItemFood unluckyApple = new ItemFoodAC("apple_unlucky", 2, .02f, false
			, new PotionEffect(Potion.blindness.id, 1200, 1)
			, new PotionEffect(Potion.confusion.id, 1200, 1)
			, new PotionEffect(Potion.digSlowdown.id, 1200, 1)
			, new PotionEffect(Potion.moveSlowdown.id, 1200, 1)
			, new PotionEffect(Potion.weakness.id, 1200, 1));
	
    public static void registerItems()
    {
    	RegisterHelper.registerItem(appleNew);
    	RegisterHelper.registerItem(luckyApple);
    	RegisterHelper.registerItem(unluckyApple);
    }
}
