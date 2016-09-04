package com.vercaelus.hardcraft.blocks;

import com.vercaelus.hardcraft.items.ItemModelProvider;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	//public static BlockOre oreNether;

	public static void init() {
		//oreNether = register(new BlockOre("oreNether"));
	}

	private static <T extends Block> T register(T block, ItemBlock itemBlock) {
		GameRegistry.register(block);
		
		if (itemBlock != null){
			GameRegistry.register(itemBlock);
		}
		
		if (block instanceof ItemModelProvider) {
			((ItemModelProvider)block).registerItemModel(itemBlock);
		}

		return block;
	}

	private static <T extends Block> T register(T block) {
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		return register(block, itemBlock);
	}

}