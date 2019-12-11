package com.dtraptor.epic.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.dtraptor.epic.Epic;

public class ItemBase extends Item{
	protected String name;
	
	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	public void registerItemModel() {
		Epic.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
	
}
