package net.mcreator.tavaresadditions.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.tavaresadditions.init.TavaresAdditionsModBlocks;

public class ShortDryGrassOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState wheatBlock = Blocks.AIR.defaultBlockState();
		world.setBlock(BlockPos.containing(x, y, z), TavaresAdditionsModBlocks.TALL_DRY_GRASS.get().defaultBlockState(), 3);
	}
}