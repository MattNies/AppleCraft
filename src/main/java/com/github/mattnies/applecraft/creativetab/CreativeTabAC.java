package com.github.mattnies.applecraft.creativetab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabAC extends CreativeTabs
{
	public CreativeTabAC(String unlocalizedName, int id)
	{
		super(id, unlocalizedName);
	}
	
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem()
	{
		return Items.apple;
	}
}
