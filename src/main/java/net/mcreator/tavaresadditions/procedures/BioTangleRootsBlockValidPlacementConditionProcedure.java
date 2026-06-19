package net.mcreator.tavaresadditions.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.tavaresadditions.init.TavaresAdditionsModBlocks;

public class BioTangleRootsBlockValidPlacementConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude() || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == TavaresAdditionsModBlocks.BIO_TANGLE_ROOTS.get()
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == TavaresAdditionsModBlocks.BIO_TANGLE_ROOTS_MIDDLE.get()
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == TavaresAdditionsModBlocks.BIO_TANGLE_ROOTS_TOP.get();
	}
}