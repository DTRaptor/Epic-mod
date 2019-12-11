package com.dtraptor.epic;

import com.dtraptor.epic.block.ModBlocks;
import com.dtraptor.epic.item.ModItems;
import com.dtraptor.epic.proxy.CommonProxy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = Epic.mod_id, name = Epic.mod_name, version = Epic.mod_version)
public class Epic {
	public static final String mod_id = "epic";
	public static final String mod_name = "Epic Mod";
	public static final String mod_version = "Alpha 0001";
	
	@SidedProxy(serverSide = "com.dtraptor.epic.proxy.CommonProxy", clientSide = "com.dtraptor.epic.proxy.ClientProxy")
	public static CommonProxy proxy;
	
	@Mod.Instance(mod_id)
	public static Epic instance;
	
	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent event)
	{

	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	}
	
	@Mod.EventHandler
	public void init(FMLPostInitializationEvent event)
	{
		
	}
	
	@Mod.EventBusSubscriber
	public static class RegistrationHandler 
	{
		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) {
			ModBlocks.register(event.getRegistry());
		}
		
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			ModItems.register(event.getRegistry());
			ModBlocks.registerItemBlocks(event.getRegistry());
		}
		
		@SubscribeEvent
		public static void registerItems(ModelRegistryEvent Event) {
			ModItems.registerModels();
			ModBlocks.registerModels();
		}
	}
}