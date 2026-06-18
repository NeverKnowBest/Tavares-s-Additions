/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tavaresadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.tavaresadditions.TavaresAdditionsMod;

public class TavaresAdditionsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TavaresAdditionsMod.MODID);
	public static final RegistryObject<CreativeModeTab> TAVARES_ADDITIONS_TAB = REGISTRY.register("tavares_additions_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.tavares_additions.tavares_additions_tab")).icon(() -> new ItemStack(TavaresAdditionsModBlocks.TALL_DRY_GRASS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TavaresAdditionsModBlocks.DENSE_SANDSTONE.get().asItem());
				tabData.accept(TavaresAdditionsModBlocks.DENSE_SANDSTONE_STAIRS.get().asItem());
				tabData.accept(TavaresAdditionsModBlocks.DENSE_SANDSTONE_SLAB.get().asItem());
				tabData.accept(TavaresAdditionsModBlocks.DENSE_SANDSTONE_WALL.get().asItem());
				tabData.accept(TavaresAdditionsModBlocks.POLISHED_DENSE_SANDSTONE.get().asItem());
				tabData.accept(TavaresAdditionsModBlocks.POLISHED_DENSE_SANDSTONE_STAIRS.get().asItem());
				tabData.accept(TavaresAdditionsModBlocks.POLISHED_DENSE_SANDSTONE_SLAB.get().asItem());
				tabData.accept(TavaresAdditionsModBlocks.SHORT_DRY_GRASS.get().asItem());
				tabData.accept(TavaresAdditionsModBlocks.TALL_DRY_GRASS.get().asItem());
			}).build());
}