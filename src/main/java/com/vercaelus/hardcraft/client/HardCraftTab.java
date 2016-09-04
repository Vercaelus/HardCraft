package com.vercaelus.hardcraft.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.vercaelus.hardcraft.HardCraft;
import com.vercaelus.hardcraft.items.ModItems;

public class HardCraftTab extends CreativeTabs{

	public HardCraftTab() {
		super(HardCraft.modId);
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.ingotNether;
	}
}
