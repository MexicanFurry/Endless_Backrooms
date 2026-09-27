/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mexicanfurry.backrooms.init;

import net.neoforged.neoforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;

@EventBusSubscriber
public class BackroomsModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == BackroomsModItems.LEVEL_0_YELLOW_WALLPAPER_ROLL.get())
			event.setBurnTime(50);
		else if (itemstack.getItem() == BackroomsModBlocks.LEVEL_0_YELLOW_WALLPAPER_BLOCK.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == BackroomsModBlocks.LEVEL_0_YELLOW_WET_CARPET_BLOCK.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == BackroomsModBlocks.LEVEL_0_YELLOW_WALLPAPER_STAIRS.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == BackroomsModBlocks.LEVEL_0_YELLOW_WALLPAPER_SLAB.get().asItem())
			event.setBurnTime(150);
		else if (itemstack.getItem() == BackroomsModBlocks.LEVEL_0_YELLOW_WET_CARPET_STAIRS.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == BackroomsModBlocks.LEVEL_0_YELLOW_WET_CARPET_SLAB.get().asItem())
			event.setBurnTime(150);
		else if (itemstack.getItem() == BackroomsModBlocks.WOOD_BLOCK.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == BackroomsModBlocks.WOOD_STAIRS.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == BackroomsModBlocks.WOOD_SLAB.get().asItem())
			event.setBurnTime(150);
		else if (itemstack.getItem() == BackroomsModBlocks.WOOD_BOARDS.get().asItem())
			event.setBurnTime(75);
	}
}