/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tavaresadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.tavaresadditions.TavaresAdditionsMod;

public class TavaresAdditionsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TavaresAdditionsMod.MODID);
	public static final RegistryObject<Item> DENSE_SANDSTONE;
	public static final RegistryObject<Item> DENSE_SANDSTONE_STAIRS;
	public static final RegistryObject<Item> DENSE_SANDSTONE_SLAB;
	public static final RegistryObject<Item> DENSE_SANDSTONE_WALL;
	public static final RegistryObject<Item> POLISHED_DENSE_SANDSTONE;
	public static final RegistryObject<Item> POLISHED_DENSE_SANDSTONE_STAIRS;
	public static final RegistryObject<Item> POLISHED_DENSE_SANDSTONE_SLAB;
	public static final RegistryObject<Item> SHORT_DRY_GRASS;
	public static final RegistryObject<Item> TALL_DRY_GRASS;
	static {
		DENSE_SANDSTONE = block(TavaresAdditionsModBlocks.DENSE_SANDSTONE);
		DENSE_SANDSTONE_STAIRS = block(TavaresAdditionsModBlocks.DENSE_SANDSTONE_STAIRS);
		DENSE_SANDSTONE_SLAB = block(TavaresAdditionsModBlocks.DENSE_SANDSTONE_SLAB);
		DENSE_SANDSTONE_WALL = block(TavaresAdditionsModBlocks.DENSE_SANDSTONE_WALL);
		POLISHED_DENSE_SANDSTONE = block(TavaresAdditionsModBlocks.POLISHED_DENSE_SANDSTONE);
		POLISHED_DENSE_SANDSTONE_STAIRS = block(TavaresAdditionsModBlocks.POLISHED_DENSE_SANDSTONE_STAIRS);
		POLISHED_DENSE_SANDSTONE_SLAB = block(TavaresAdditionsModBlocks.POLISHED_DENSE_SANDSTONE_SLAB);
		SHORT_DRY_GRASS = block(TavaresAdditionsModBlocks.SHORT_DRY_GRASS);
		TALL_DRY_GRASS = block(TavaresAdditionsModBlocks.TALL_DRY_GRASS);
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