package com.vercaelus.hardcraft.items.tools;

import net.minecraft.item.Item;
import com.vercaelus.hardcraft.HardCraft;
import com.vercaelus.hardcraft.items.ItemModelProvider;

public class ItemPickaxe extends net.minecraft.item.ItemPickaxe implements ItemModelProvider {

	private String name;

	public ItemPickaxe(ToolMaterial material, String name) {
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