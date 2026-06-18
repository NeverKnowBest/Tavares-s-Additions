/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tavaresadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.tavaresadditions.block.*;
import net.mcreator.tavaresadditions.TavaresAdditionsMod;

public class TavaresAdditionsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TavaresAdditionsMod.MODID);
	public static final RegistryObject<Block> DENSE_SANDSTONE;
	public static final RegistryObject<Block> DENSE_SANDSTONE_STAIRS;
	public static final RegistryObject<Block> DENSE_SANDSTONE_SLAB;
	public static final RegistryObject<Block> DENSE_SANDSTONE_WALL;
	public static final RegistryObject<Block> POLISHED_DENSE_SANDSTONE;
	public static final RegistryObject<Block> POLISHED_DENSE_SANDSTONE_STAIRS;
	public static final RegistryObject<Block> POLISHED_DENSE_SANDSTONE_SLAB;
	public static final RegistryObject<Block> SHORT_DRY_GRASS;
	public static final RegistryObject<Block> TALL_DRY_GRASS;
	static {
		DENSE_SANDSTONE = REGISTRY.register("dense_sandstone", DenseSandstoneBlock::new);
		DENSE_SANDSTONE_STAIRS = REGISTRY.register("dense_sandstone_stairs", DenseSandstoneStairsBlock::new);
		DENSE_SANDSTONE_SLAB = REGISTRY.register("dense_sandstone_slab", DenseSandstoneSlabBlock::new);
		DENSE_SANDSTONE_WALL = REGISTRY.register("dense_sandstone_wall", DenseSandstoneWallBlock::new);
		POLISHED_DENSE_SANDSTONE = REGISTRY.register("polished_dense_sandstone", PolishedDenseSandstoneBlock::new);
		POLISHED_DENSE_SANDSTONE_STAIRS = REGISTRY.register("polished_dense_sandstone_stairs", PolishedDenseSandstoneStairsBlock::new);
		POLISHED_DENSE_SANDSTONE_SLAB = REGISTRY.register("polished_dense_sandstone_slab", PolishedDenseSandstoneSlabBlock::new);
		SHORT_DRY_GRASS = REGISTRY.register("short_dry_grass", ShortDryGrassBlock::new);
		TALL_DRY_GRASS = REGISTRY.register("tall_dry_grass", TallDryGrassBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}