package com.github.mattnies.applecraft.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

import com.github.mattnies.applecraft.helpers.RegisterHelper;
import com.github.mattnies.applecraft.items.AppleAC;
import com.github.mattnies.applecraft.items.ItemFoodAC;

public class ModItems
{
	public static Item appleNew = new ItemFoodAC("apple_new", 2, .02f, false, AppleAC.Normal);
	
	public static ItemFood chanceApple = new ItemFoodAC("apple_chance", 2, .02f, false, AppleAC.Random);
	public static ItemFood luckyApple = new ItemFoodAC("apple_lucky", 2, .02f, false, AppleAC.Potion
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
	public static ItemFood unluckyApple = new ItemFoodAC("apple_unlucky", 2, .02f, false, AppleAC.Potion
			, new PotionEffect(Potion.blindness.id, 1200, 1)
			, new PotionEffect(Potion.confusion.id, 1200, 1)
			, new PotionEffect(Potion.digSlowdown.id, 1200, 1)
			, new PotionEffect(Potion.moveSlowdown.id, 1200, 1)
			, new PotionEffect(Potion.weakness.id, 1200, 1));
	
	public static Item appleNightVision = new ItemFoodAC("apple_nightvision", 0, 0, false, AppleAC.Potion, new PotionEffect(Potion.nightVision.id, 3600, 0));
	public static Item appleNightVisionPlus = new ItemFoodAC("apple_nightvision_plus", 0, 0 ,false, AppleAC.Potion, new PotionEffect(Potion.nightVision.id, 9600, 0));
	public static Item appleInvisibility = new ItemFoodAC("apple_invisibility", 0, 0, false, AppleAC.Potion, new PotionEffect(Potion.invisibility.id, 3600, 0));
	public static Item appleInvisibilityPlus = new ItemFoodAC("apple_invisibility_plus", 0, 0, false, AppleAC.Potion, new PotionEffect(Potion.invisibility.id, 9600, 0));
	public static Item appleLeaping = new ItemFoodAC("apple_leaping", 0, 0, false, AppleAC.Potion, new PotionEffect(Potion.jump.id, 3600, 0));
	public static Item appleLeapingPlus = new ItemFoodAC("apple_leaping_plus", 0, 0, false, AppleAC.Potion, new PotionEffect(Potion.jump.id, 9600, 0));
	public static Item appleLeapingII = new ItemFoodAC("apple_leaping2", 0, 0, false, AppleAC.Potion, new PotionEffect(Potion.jump.id, 1800, 1));
	public static Item appleFireResist = new ItemFoodAC("apple_fireresist", 0, 0, false, AppleAC.Potion, new PotionEffect(Potion.fireResistance.id, 3600, 0));
	public static Item appleFireResistPlus = new ItemFoodAC("apple_fireresist_plus", 0, 0, false, AppleAC.Potion, new PotionEffect(Potion.fireResistance.id, 9600, 0));
	public static Item appleSlowness = new ItemFoodAC("apple_slowness", 0, 0, false, AppleAC.Potion, new PotionEffect(Potion.moveSlowdown.id, 1800, 0));
	public static Item appleSlownessPlus = new ItemFoodAC("apple_slowness_plus", 0, 0, false, AppleAC.Potion, new PotionEffect(Potion.moveSlowdown.id, 4800, 0));
	public static Item appleSwiftness = new ItemFoodAC("apple_swiftness", 0, 0, false, AppleAC.Potion, new PotionEffect(Potion.moveSpeed.id, 3600, 0));
	public static Item appleSwiftnessPlus = new ItemFoodAC("apple_swiftness_plus", 0, 0, false, AppleAC.Potion, new PotionEffect(Potion.moveSpeed.id, 9600, 0));
	public static Item appleSwiftnessII = new ItemFoodAC("apple_swiftness2", 0, 0, false, AppleAC.Potion, new PotionEffect(Potion.moveSpeed.id, 1800, 1));
	public static Item appleWaterBreath = new ItemFoodAC("apple_waterbreath", 0, 0, false, AppleAC.Potion, new PotionEffect(Potion.waterBreathing.id, 3600, 0));
	public static Item appleWaterBreathPlus = new ItemFoodAC("apple_waterbreath_plus", 0, 0, false, AppleAC.Potion, new PotionEffect(Potion.waterBreathing.id, 9600, 0));
	public static Item appleHeal = new ItemFoodAC("apple_heal", 0, 0, false, AppleAC.Potion, new PotionEffect(Potion.heal.id, 0, 0));
	public static Item appleHealII = new ItemFoodAC("apple_heal2", 0, 0, false, AppleAC.Potion, new PotionEffect(Potion.heal.id, 0, 1));
	public static Item appleHarm = new ItemFoodAC("apple_harm", 0, 0, false, AppleAC.Potion, new PotionEffect(Potion.harm.id, 0, 0));
	public static Item appleHarmII = new ItemFoodAC("apple_harm2", 0, 0, false, AppleAC.Potion, new PotionEffect(Potion.harm.id, 0, 1));
	public static Item applePoison = new ItemFoodAC("apple_poison", 0, 0, false, AppleAC.Potion, new PotionEffect(Potion.poison.id, 900, 0));
	public static Item applePoisonPlus = new ItemFoodAC("apple_poison_plus", 0, 0, false, AppleAC.Potion, new PotionEffect(Potion.poison.id, 2400, 0));
	public static Item applePoisonII = new ItemFoodAC("apple_poison2", 0, 0, false, AppleAC.Potion, new PotionEffect(Potion.poison.id, 440, 1));
	public static Item appleRegen = new ItemFoodAC("apple_regen", 0, 0, false, AppleAC.Potion, new PotionEffect(Potion.regeneration.id, 900, 0));
	public static Item appleRegenPlus = new ItemFoodAC("apple_regen_plus", 0, 0, false, AppleAC.Potion, new PotionEffect(Potion.regeneration.id, 2400, 0));
	public static Item appleRegenII = new ItemFoodAC("apple_regen2", 0, 0, false, AppleAC.Potion, new PotionEffect(Potion.regeneration.id, 440, 1));
	public static Item appleStrength = new ItemFoodAC("apple_strength", 0, 0, false, AppleAC.Potion, new PotionEffect(Potion.damageBoost.id, 3600, 0));
	public static Item appleStrengthPlus = new ItemFoodAC("apple_strength_plus", 0, 0, false, AppleAC.Potion, new PotionEffect(Potion.damageBoost.id, 9600, 0));
	public static Item appleStrengthII = new ItemFoodAC("apple_strength2", 0, 0, false, AppleAC.Potion, new PotionEffect(Potion.damageBoost.id, 1800, 1));
	public static Item appleWeakness = new ItemFoodAC("apple_weakness", 0, 0, false, AppleAC.Potion, new PotionEffect(Potion.weakness.id, 1800, 0));
	public static Item appleWeaknessPlus = new ItemFoodAC("apple_weakness_plus", 0, 0, false, AppleAC.Potion, new PotionEffect(Potion.weakness.id, 4800, 0));
	
    public static void registerItems()
    {
    	RegisterHelper.registerItem(appleNew);
    	//RegisterHelper.registerItem(luckyApple);
    	//RegisterHelper.registerItem(unluckyApple);
    	//RegisterHelper.registerItem(chanceApple);
    	
    	RegisterHelper.registerItem(appleNightVision);
    	RegisterHelper.registerItem(appleNightVisionPlus);
    	RegisterHelper.registerItem(appleInvisibility);
    	RegisterHelper.registerItem(appleInvisibilityPlus);
    	RegisterHelper.registerItem(appleLeaping);
    	RegisterHelper.registerItem(appleLeapingPlus);
    	RegisterHelper.registerItem(appleLeapingII);
    	RegisterHelper.registerItem(appleFireResist);
    	RegisterHelper.registerItem(appleFireResistPlus);
    	RegisterHelper.registerItem(appleSlowness);
    	RegisterHelper.registerItem(appleSlownessPlus);
    	RegisterHelper.registerItem(appleSwiftness);
    	RegisterHelper.registerItem(appleSwiftnessPlus);
    	RegisterHelper.registerItem(appleSwiftnessII);
    	RegisterHelper.registerItem(appleWaterBreath);
    	RegisterHelper.registerItem(appleWaterBreathPlus);
    	RegisterHelper.registerItem(appleHeal);
    	RegisterHelper.registerItem(appleHealII);
    	RegisterHelper.registerItem(appleHarm);
    	RegisterHelper.registerItem(appleHarmII);
    	RegisterHelper.registerItem(applePoison);
    	RegisterHelper.registerItem(applePoisonPlus);
    	RegisterHelper.registerItem(applePoisonII);
    	RegisterHelper.registerItem(appleRegen);
    	RegisterHelper.registerItem(appleRegenPlus);
    	RegisterHelper.registerItem(appleRegenII);
    	RegisterHelper.registerItem(appleStrength);
    	RegisterHelper.registerItem(appleStrengthPlus);
    	RegisterHelper.registerItem(appleStrengthII);
    	RegisterHelper.registerItem(appleWeakness);
    	RegisterHelper.registerItem(appleWeaknessPlus);
    }
}
