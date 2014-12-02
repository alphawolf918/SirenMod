package sirenmod.lib;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import sirenmod.blocks.Blocks;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	
	public static void init() {
		Crafting.init();
	}

	public static class Crafting {
		public static void init() {
			GameRegistry.addRecipe(new ItemStack(Blocks.ironSiren, 1),
					new Object[] {
				"OIO", "IRI", "OIO", 'O', Block.obsidian, 'I',
				Item.ingotIron, 'R', Item.redstone
					});
			GameRegistry.addRecipe(new ItemStack(Blocks.goldSiren, 1),
					new Object[] {
				"OIO", "IRI", "OIO", 'O', Block.obsidian, 'I',
				Item.ingotGold, 'R', Item.redstone
					});
			GameRegistry.addRecipe(new ItemStack(Blocks.diamondSiren, 1),
					new Object[] {
				"OIO", "IRI", "OIO", 'O', Block.obsidian, 'I',
				Item.diamond, 'R', Item.redstone
					});
			GameRegistry.addRecipe(new ItemStack(Blocks.emeraldSiren, 1),
					new Object[] {
				"OIO", "IRI", "OIO", 'O', Block.obsidian, 'I',
				Item.emerald, 'R', Item.redstone
					});
		}
	}
}