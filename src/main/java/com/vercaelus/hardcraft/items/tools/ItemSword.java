package com.vercaelus.hardcraft.items.tools;

import com.vercaelus.hardcraft.HardCraft;
import com.vercaelus.hardcraft.items.ItemModelProvider;

import net.minecraft.item.Item;

public class ItemSword extends net.minecraft.item.ItemSword implements ItemModelProvider {

	private String name;

	public ItemSword(ToolMaterial material, String name) {
		super(material);
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
