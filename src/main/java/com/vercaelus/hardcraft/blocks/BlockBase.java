package com.vercaelus.hardcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.vercaelus.hardcraft.HardCraft;
import com.vercaelus.hardcraft.items.ItemModelProvider;

public class BlockBase extends Block implements ItemModelProvider {

	protected String name;

	public BlockBase(Material material, String name) {
		super(material);
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
	public BlockBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}