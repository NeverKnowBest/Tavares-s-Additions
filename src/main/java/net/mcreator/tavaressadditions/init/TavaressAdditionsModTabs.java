/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tavaressadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.tavaressadditions.TavaressAdditionsMod;

public class TavaressAdditionsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TavaressAdditionsMod.MODID);
	public static final RegistryObject<CreativeModeTab> TAVARES_ADDITIONS_TAB = REGISTRY.register("tavares_additions_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.tavaress_additions.tavares_additions_tab")).icon(() -> new ItemStack(TavaressAdditionsModBlocks.DENSE_SANDSTONE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TavaressAdditionsModBlocks.DENSE_SANDSTONE.get().asItem());
				tabData.accept(TavaressAdditionsModBlocks.DENSE_SANDSTONE_STAIRS.get().asItem());
				tabData.accept(TavaressAdditionsModBlocks.DENSE_SANDSTONE_SLAB.get().asItem());
				tabData.accept(TavaressAdditionsModBlocks.DENSE_SANDSTONE_WALL.get().asItem());
				tabData.accept(TavaressAdditionsModBlocks.POLISHED_DENSE_SANDSTONE.get().asItem());
				tabData.accept(TavaressAdditionsModBlocks.POLISHED_DENSE_SANDSTONE_STAIRS.get().asItem());
				tabData.accept(TavaressAdditionsModBlocks.POLISHED_DENSE_SANDSTONE_SLAB.get().asItem());
			}).build());
}