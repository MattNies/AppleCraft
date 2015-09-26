package com.github.mattnies.applecraft;

import net.minecraft.potion.Potion;

public class Reference
{
    public static final String MODID = "applecraft";
    public static final String NAME = "AppleCraft";
    public static final String VERSION = "1.0.0";
    public static final String COMMON_PROXY = "com.github.mattnies.applecraft.proxies.CommonProxy";
    public static final String CLIENT_PROXY = "com.github.mattnies.applecraft.proxies.ClientProxy";
    public static final int NUMBER_OF_POTIONS_TYPES = 20;
    public static final int NUMBER_OF_POSITIVE_EFFECTS = 11 ;
    public static final int NUMBER_OF_NEGATIVE_EFFECTS = 9;
    public static Potion[] allPotions = 
    	{
    		Potion.blindness,
    		Potion.confusion,
    		Potion.damageBoost,
    		Potion.digSlowdown,   		
    		Potion.digSpeed,
    		Potion.fireResistance,
    		Potion.harm,
    		Potion.heal,
    		Potion.hunger,
    		Potion.invisibility,
    		Potion.jump,
    		Potion.moveSlowdown,
    		Potion.moveSpeed,
    		Potion.nightVision,
    		Potion.poison,
    		Potion.regeneration,
    		Potion.resistance,
    		Potion.waterBreathing,
    		Potion.weakness,
    		Potion.wither
    	};
    public static Potion[] posPotions =
    	{
	    	Potion.damageBoost,
	    	Potion.digSpeed,
	    	Potion.fireResistance,
	    	Potion.heal,
	    	Potion.invisibility,
	    	Potion.jump,
	    	Potion.moveSpeed,
	    	Potion.nightVision,
    		Potion.regeneration,
    		Potion.resistance,
    		Potion.waterBreathing
    	};
    public static Potion[] negPotions = 
    	{
			Potion.blindness,
			Potion.confusion,
			Potion.digSlowdown,
			Potion.harm,
			Potion.hunger,
			Potion.moveSlowdown,
			Potion.poison,
			Potion.weakness,
    		Potion.wither
    	};
    
}
