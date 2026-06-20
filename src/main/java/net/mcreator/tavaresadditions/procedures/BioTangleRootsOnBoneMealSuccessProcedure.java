package net.mcreator.tavaresadditions.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.tavaresadditions.init.TavaresAdditionsModBlocks;

public class BioTangleRootsOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double scanY = 0;
		scanY = y;
		for (int index0 = 0; index0 < 50; index0++) {
			if ((world.getBlockState(BlockPos.containing(x, scanY - 1, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, scanY - 1, z))).getBlock() == Blocks.VOID_AIR
					|| (world.getBlockState(BlockPos.containing(x, scanY - 1, z))).getBlock() == Blocks.CAVE_AIR) {
				world.setBlock(BlockPos.containing(x, scanY - 1, z), TavaresAdditionsModBlocks.BIO_TANGLE_ROOTS.get().defaultBlockState(), 3);
				break;
			} else if ((world.getBlockState(BlockPos.containing(x, scanY - 1, z))).getBlock() == TavaresAdditionsModBlocks.BIO_TANGLE_ROOTS.get()
					|| (world.getBlockState(BlockPos.containing(x, scanY - 1, z))).getBlock() == TavaresAdditionsModBlocks.BIO_TANGLE_ROOTS_MIDDLE.get()) {
				scanY = scanY - 1;
			} else {
				break;
			}
		}
	}
}