/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tavaressadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.tavaressadditions.TavaressAdditionsMod;

public class TavaressAdditionsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TavaressAdditionsMod.MODID);
	public static final RegistryObject<Item> DENSE_SANDSTONE;
	public static final RegistryObject<Item> DENSE_SANDSTONE_STAIRS;
	public static final RegistryObject<Item> DENSE_SANDSTONE_SLAB;
	public static final RegistryObject<Item> DENSE_SANDSTONE_WALL;
	static {
		DENSE_SANDSTONE = block(TavaressAdditionsModBlocks.DENSE_SANDSTONE);
		DENSE_SANDSTONE_STAIRS = block(TavaressAdditionsModBlocks.DENSE_SANDSTONE_STAIRS);
		DENSE_SANDSTONE_SLAB = block(TavaressAdditionsModBlocks.DENSE_SANDSTONE_SLAB);
		DENSE_SANDSTONE_WALL = block(TavaressAdditionsModBlocks.DENSE_SANDSTONE_WALL);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return block(block, new Item.Properties());
	}

	private static RegistryObject<Item> block(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}