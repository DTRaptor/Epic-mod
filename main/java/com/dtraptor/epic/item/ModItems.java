package com.dtraptor.epic.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	public static ItemBase amethystGem = new ItemBase("amethyst_gem").setCreativeTab(CreativeTabs.MATERIALS);
	
	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
			amethystGem	
		);
		
	}
	public static void registerModels() {
		amethystGem.registerItemModel();
	}
}
