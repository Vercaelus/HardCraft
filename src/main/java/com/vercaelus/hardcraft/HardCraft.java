package com.vercaelus.hardcraft;

import com.vercaelus.hardcraft.blocks.ModBlocks;
import com.vercaelus.hardcraft.client.HardCraftTab;
import com.vercaelus.hardcraft.items.ModItems;
import com.vercaelus.hardcraft.proxy.CommonProxy;
import com.vercaelus.hardcraft.recipes.ModRecipes;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = HardCraft.modId, name = HardCraft.name, version = HardCraft.version, acceptedMinecraftVersions = "[1.10.2]")
public class HardCraft {

	public static final String modId = "hardcraft";
	public static final String name = "HardCraft";
	public static final String version = "0.1.0";
	
	// ...
	public static final HardCraftTab creativeTab = new HardCraftTab();
	
	//6 params: Name, Harvest Level (can be set higher), Durability, Mining Speed, Damage vs Entities, Enchantability
	//EXAMPLE: "DIAMOND", 3, 1561, 8, 3, 10
	public static final Item.ToolMaterial netherMaterial = EnumHelper.addToolMaterial("NETHER", 4, 1999, 12, 6, 25);
	// ...

	@Mod.Instance(modId)
	public static HardCraft instance;
	
	@SidedProxy(serverSide = "com.vercaelus.hardcraft.proxy.CommonProxy", clientSide = "com.vercaelus.hardcraft.proxy.ClientProxy")
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(name + " is loading!");
		
		ModBlocks.init();
		ModItems.init();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		ModRecipes.init();
		
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

}