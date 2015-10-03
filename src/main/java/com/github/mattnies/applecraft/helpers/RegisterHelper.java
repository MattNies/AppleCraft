package com.github.mattnies.applecraft.helpers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class RegisterHelper 
{
    public static void registerBlock(Block block)
    {
        GameRegistry.registerBlock(block, block.getUnlocalizedName().substring(5));
    }

    public static void registerItem(Item item)
    {
        GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
    }
    
    public static void registerRecipes(ItemStack iStack, Object...objects)
    {
    	GameRegistry.addRecipe(iStack, objects);
    }
    
    public static void registerShapelessRecipes(ItemStack iStack, Object...objects)
    {
    	GameRegistry.addShapelessRecipe(iStack, objects);
    }
}
