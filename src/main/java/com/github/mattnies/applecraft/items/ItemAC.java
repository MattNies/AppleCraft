package com.github.mattnies.applecraft.items;

import net.minecraft.item.Item;

import com.github.mattnies.applecraft.AppleCraft;
import com.github.mattnies.applecraft.Reference;

public class ItemAC extends Item
{

	public ItemAC(String name)
	{
		super();
        this.setCreativeTab(AppleCraft.appleTab);
        this.setUnlocalizedName(name);
        this.setTextureName(Reference.MODID + ":" + name);
	}
	
}
