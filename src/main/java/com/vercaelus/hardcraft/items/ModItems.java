package com.vercaelus.hardcraft.items;

import com.vercaelus.hardcraft.HardCraft;
import com.vercaelus.hardcraft.items.tools.ItemAxe;
import com.vercaelus.hardcraft.items.tools.ItemHoe;
import com.vercaelus.hardcraft.items.tools.ItemPickaxe;
import com.vercaelus.hardcraft.items.tools.ItemShovel;
import com.vercaelus.hardcraft.items.tools.ItemSword;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static ItemBase ingotNether;
	public static ItemSword netherSword;
	public static ItemPickaxe netherPickaxe;
	public static ItemAxe netherAxe;
	public static ItemShovel netherShovel;
	public static ItemHoe netherHoe;
	
	public static void init() {
		
		ingotNether = register(new ItemBase("ingotNether"));
		netherSword = register(new ItemSword(HardCraft.netherMaterial, "netherSword"));
		netherPickaxe = register(new ItemPickaxe(HardCraft.netherMaterial, "netherPickaxe"));
		netherAxe = register(new ItemAxe(HardCraft.netherMaterial, "netherAxe"));
		netherShovel = register(new ItemShovel(HardCraft.netherMaterial, "netherShovel"));
		netherHoe = register(new ItemHoe(HardCraft.netherMaterial, "netherHoe"));
	}

	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);

		if (item instanceof ItemModelProvider) {
			((ItemModelProvider)item).registerItemModel(item);
		}

		return item;
	}

}