/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mexicanfurry.backrooms.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mexicanfurry.backrooms.BackroomsMod;

@EventBusSubscriber
public class BackroomsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BackroomsMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BACKROOMS_BLOCKS = REGISTRY.register("backrooms_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.backrooms.backrooms_blocks")).icon(() -> new ItemStack(BackroomsModBlocks.LEVEL_0_YELLOW_WALLPAPER_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BackroomsModBlocks.WOOD_BLOCK.get().asItem());
				tabData.accept(BackroomsModBlocks.WOOD_STAIRS.get().asItem());
				tabData.accept(BackroomsModBlocks.WOOD_SLAB.get().asItem());
				tabData.accept(BackroomsModBlocks.WOOD_BOARDS.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_0_YELLOW_WALLPAPER_BLOCK_BASE.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_0_YELLOW_WALLPAPER_BLOCK.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_0_YELLOW_WALLPAPER_STAIRS.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_0_YELLOW_WALLPAPER_SLAB.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_0_YELLOW_WET_CARPET_BLOCK.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_0_YELLOW_WET_CARPET_STAIRS.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_0_YELLOW_WET_CARPET_SLAB.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_0_CEILING.get().asItem());
				tabData.accept(BackroomsModBlocks.FLUORESCENT_LAMP.get().asItem());
			}).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BACKROOMS_ITEMS = REGISTRY.register("backrooms_items",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.backrooms.backrooms_items")).icon(() -> new ItemStack(BackroomsModItems.LEVEL_0_YELLOW_WALLPAPER_ROLL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BackroomsModBlocks.WOOD_BOARDS.get().asItem());
				tabData.accept(BackroomsModItems.FLUORESCENT_LAMP_SHARD.get());
				tabData.accept(BackroomsModItems.LEVEL_0_YELLOW_WALLPAPER_ROLL.get());
				tabData.accept(BackroomsModItems.LEVEL_0_YELLOW_WET_CARPET.get());
			}).withTabsBefore(BACKROOMS_BLOCKS.getId()).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(BackroomsModBlocks.WOOD_BLOCK.get().asItem());
			tabData.accept(BackroomsModBlocks.WOOD_STAIRS.get().asItem());
			tabData.accept(BackroomsModBlocks.WOOD_SLAB.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.OP_BLOCKS) {
			if (tabData.hasPermissions()) {
				tabData.accept(BackroomsModBlocks.PORTAL.get().asItem());
			}
		} else if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(BackroomsModBlocks.WOOD_BOARDS.get().asItem());
			tabData.accept(BackroomsModBlocks.FLUORESCENT_LAMP.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(BackroomsModBlocks.WOOD_BOARDS.get().asItem());
			tabData.accept(BackroomsModItems.FLUORESCENT_LAMP_SHARD.get());
		}
	}
}