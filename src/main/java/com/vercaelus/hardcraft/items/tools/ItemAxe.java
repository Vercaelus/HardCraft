package com.vercaelus.hardcraft.items.tools;

import net.minecraft.item.Item;
import com.vercaelus.hardcraft.HardCraft;
import com.vercaelus.hardcraft.items.ItemModelProvider;

public class ItemAxe extends net.minecraft.item.ItemAxe implements ItemModelProvider {

	private String name;

	public ItemAxe(ToolMaterial material, String name) {
		super(material, 8f, -3.1f);
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(HardCraft.creativeTab);
		this.name = name;
	}

	@Override
	public void registerItemModel(Item item) {
		HardCraft.proxy.registerItemRenderer(this, 0, name);
	}

}