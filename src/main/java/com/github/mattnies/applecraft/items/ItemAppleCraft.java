package com.github.mattnies.applecraft.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.github.mattnies.applecraft.Reference;

public class ItemAppleCraft extends Item
{

	public ItemAppleCraft(String name)
	{
		super();
        this.setCreativeTab(CreativeTabs.tabMisc);
        this.setUnlocalizedName(name);
        this.setTextureName(Reference.MODID + ":" + name);
	}
	
}
