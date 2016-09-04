package com.vercaelus.hardcraft.items.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import com.vercaelus.hardcraft.HardCraft;
import com.vercaelus.hardcraft.items.ItemModelProvider;

public class ItemShovel extends ItemSpade implements ItemModelProvider {

	private String name;

	public ItemShovel(ToolMaterial material, String name) {
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