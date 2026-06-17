/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tavaressadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.tavaressadditions.block.DenseSandstoneWallBlock;
import net.mcreator.tavaressadditions.block.DenseSandstoneStairsBlock;
import net.mcreator.tavaressadditions.block.DenseSandstoneSlabBlock;
import net.mcreator.tavaressadditions.block.DenseSandstoneBlock;
import net.mcreator.tavaressadditions.TavaressAdditionsMod;

public class TavaressAdditionsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TavaressAdditionsMod.MODID);
	public static final RegistryObject<Block> DENSE_SANDSTONE;
	public static final RegistryObject<Block> DENSE_SANDSTONE_STAIRS;
	public static final RegistryObject<Block> DENSE_SANDSTONE_SLAB;
	public static final RegistryObject<Block> DENSE_SANDSTONE_WALL;
	static {
		DENSE_SANDSTONE = REGISTRY.register("dense_sandstone", DenseSandstoneBlock::new);
		DENSE_SANDSTONE_STAIRS = REGISTRY.register("dense_sandstone_stairs", DenseSandstoneStairsBlock::new);
		DENSE_SANDSTONE_SLAB = REGISTRY.register("dense_sandstone_slab", DenseSandstoneSlabBlock::new);
		DENSE_SANDSTONE_WALL = REGISTRY.register("dense_sandstone_wall", DenseSandstoneWallBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}