package com.vercaelus.hardcraft.recipes;

import com.vercaelus.hardcraft.blocks.ModBlocks;
import com.vercaelus.hardcraft.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static final Block MAGMA_BLOCK = Block.getBlockById(213);
	
	public static void init() {
		//GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotNether), ModItems.ingotCopper);
		
		//Shaped Recipe requires 1-3 string arguments. "spaces" are counted as empty slots
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ingotNether), "ABA", 'A', MAGMA_BLOCK, 'B', Blocks.OBSIDIAN);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.netherSword), " A ", " A ", " B ", 'A', ModItems.ingotNether, 'B', Items.BLAZE_ROD);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.netherPickaxe), "AAA", " B ", " B ", 'A', ModItems.ingotNether, 'B', Items.BLAZE_ROD);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.netherAxe), "AA ", "AB ", " B ", 'A', ModItems.ingotNether, 'B', Items.BLAZE_ROD);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.netherShovel), " A ", " B ", " B ", 'A', ModItems.ingotNether, 'B', Items.BLAZE_ROD);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.netherHoe), "AA ", " B ", " B ", 'A', ModItems.ingotNether, 'B', Items.BLAZE_ROD);
		
		//3 params: item/block/stack input, ItemStack output, experience earned per smelt
		//GameRegistry.addSmelting(ModBlocks.oreCopper, new ItemStack(ModItems.ingotCopper), 0.7f);
		
		//GameRegistry.addShapedRecipe(new ItemStack(Items.OUTPUT_ITEM), "TopLeft-TopCenter-TopRight", "MiddleLeft-MiddleCenter-MiddleRight", "BottomLeft-BottomCenter-BottomRight", 'var-A', Items.COOKED_RABBIT, 'var-B', ModItems.corn, 'var-C', Items.BAKED_POTATO, 'var-D', Blocks.BROWN_MUSHROOM, 'var-E', Items.BOWL);
	}
}
