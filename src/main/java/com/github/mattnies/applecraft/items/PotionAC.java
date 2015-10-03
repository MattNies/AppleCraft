package com.github.mattnies.applecraft.items;

public enum PotionAC
{
	NightVision(8198, 8230),
	NightVisionPlus(8262, -1),
	Invisibility(8206, 0),
	InvisibilityPlus(8270, 0),
	Leaping(8203, 0),
	LeapingPlus(8267, 0),
	LeapingII(8235, 0),
	FireResist(8195, 0),
	FireResistPlus(8259, 0),
	Slowness(8202, 0),
	SlownessPlus(8266, 0),
	Swiftness(8194, 0),
	SwiftnessPlus(8258, 0),
	SwiftnessII(8226, 0),
	WaterBreath(8205, 0),
	WaterBreathPlus(8269, 0),
	Heal(8197, 0),
	HealII(8229, 0),
	Harm(8204, 0),
	HarmII(8236, 0),
	Poison(8196, 0),
	PoisonPlus(8260, 0),
	PoisonII(8228, 0),
	Regen(8193, 0),
	RegenPlus(8257, 0),
	RegenII(8225, 0),
	Strength(8201, 0),
	StrengthPlus(8265, 0),
	StrengthII(8233, 0),
	Weakness(8200, 0),
	WeaknessPlus(8264, 0)
	;
	
	private final int metaData;
	private final int metaDataCreative;
	
	
	private PotionAC(int metaData, int metaDataCreative)
	{
		this.metaData = metaData;
		this.metaDataCreative = metaDataCreative;
	}
	
	public int getMetaData()
	{
		return this.metaData;
	}
	
	public int getMetaDataCreative()
	{
		return this.metaDataCreative;
	}
}
