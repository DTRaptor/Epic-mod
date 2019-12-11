package com.dtraptor.epic.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
	
	public static BlockOre oreAmethyst = new BlockOre("ore_amethyst").setCreativeTab(CreativeTabs.MATERIALS);
	public static BlockBase blockAmethyst = new BlockBase(Material.IRON, "block_amethyst").setHardness(4);
	
	public static void register(IForgeRegistry<Block> registry) {
		
		registry.registerAll(
				oreAmethyst,
				blockAmethyst
		);
		
	}
	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		
		registry.registerAll(
				oreAmethyst.createItemBlock(),
				blockAmethyst.createItemBlock()
		);
	}
	public static void registerModels() {
		oreAmethyst.registerItemModel(Item.getItemFromBlock(oreAmethyst));
		blockAmethyst.registerItemModel(Item.getItemFromBlock(blockAmethyst));
	}
}
