package net.mcreator.tavaressadditions.block;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.util.ForgeSoundType;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;

public class PolishedDenseSandstoneBlock extends Block {
	public PolishedDenseSandstoneBlock() {
		super(BlockBehaviour.Properties.of()
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.break")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sand.step")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.hit")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.fall"))))
				.strength(1.5f, 6f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.SNARE));
	}
}