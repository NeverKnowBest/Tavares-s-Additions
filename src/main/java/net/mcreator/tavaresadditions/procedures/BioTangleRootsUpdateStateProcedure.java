package net.mcreator.tavaresadditions.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.tavaresadditions.init.TavaresAdditionsModBlocks;

public class BioTangleRootsUpdateStateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == TavaresAdditionsModBlocks.BIO_TANGLE_ROOTS.get()
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == TavaresAdditionsModBlocks.BIO_TANGLE_ROOTS_MIDDLE.get())) {
			world.setBlock(BlockPos.containing(x, y, z), TavaresAdditionsModBlocks.BIO_TANGLE_ROOTS.get().defaultBlockState(), 3);
		} else if (world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude()) {
			world.setBlock(BlockPos.containing(x, y, z), TavaresAdditionsModBlocks.BIO_TANGLE_ROOTS_TOP.get().defaultBlockState(), 3);
		} else {
			world.setBlock(BlockPos.containing(x, y, z), TavaresAdditionsModBlocks.BIO_TANGLE_ROOTS_MIDDLE.get().defaultBlockState(), 3);
		}
	}
}