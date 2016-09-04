package com.vercaelus.hardcraft.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.vercaelus.hardcraft.HardCraft;

public class ItemBase extends Item implements ItemModelProvider{

	protected String name;

	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(HardCraft.creativeTab);
	}

	@Override
	public void registerItemModel(Item item) {
		HardCraft.proxy.registerItemRenderer(item, 0, name);
	}

	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
