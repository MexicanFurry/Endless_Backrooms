/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mexicanfurry.backrooms.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mexicanfurry.backrooms.item.Level0YellowWetCarpetItem;
import net.mexicanfurry.backrooms.item.Level0YellowWallpaperRollItem;
import net.mexicanfurry.backrooms.item.FluorescentLampShardItem;
import net.mexicanfurry.backrooms.BackroomsMod;

public class BackroomsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(BackroomsMod.MODID);
	public static final DeferredItem<Item> LEVEL_0_YELLOW_WALLPAPER_ROLL;
	public static final DeferredItem<Item> LEVEL_0_YELLOW_WET_CARPET;
	public static final DeferredItem<Item> LEVEL_0_YELLOW_WALLPAPER_BLOCK;
	public static final DeferredItem<Item> LEVEL_0_YELLOW_WET_CARPET_BLOCK;
	public static final DeferredItem<Item> WOOD_BLOCK;
	public static final DeferredItem<Item> WOOD_STAIRS;
	public static final DeferredItem<Item> WOOD_SLAB;
	public static final DeferredItem<Item> LEVEL_0_YELLOW_WALLPAPER_STAIRS;
	public static final DeferredItem<Item> LEVEL_0_YELLOW_WALLPAPER_SLAB;
	public static final DeferredItem<Item> LEVEL_0_YELLOW_WET_CARPET_STAIRS;
	public static final DeferredItem<Item> LEVEL_0_YELLOW_WET_CARPET_SLAB;
	public static final DeferredItem<Item> FLUORESCENT_LAMP_SHARD;
	public static final DeferredItem<Item> FLUORESCENT_LAMP;
	public static final DeferredItem<Item> LEVEL_0_FLUORESCENT_LAMP;
	public static final DeferredItem<Item> LEVEL_0_CEILING;
	public static final DeferredItem<Item> LEVEL_0_YELLOW_WALLPAPER_BLOCK_BASE;
	public static final DeferredItem<Item> WOOD_BOARDS;
	public static final DeferredItem<Item> PORTAL;
	public static final DeferredItem<Item> PORTAL_1;
	static {
		LEVEL_0_YELLOW_WALLPAPER_ROLL = REGISTRY.register("level_0_yellow_wallpaper_roll", Level0YellowWallpaperRollItem::new);
		LEVEL_0_YELLOW_WET_CARPET = REGISTRY.register("level_0_yellow_wet_carpet", Level0YellowWetCarpetItem::new);
		LEVEL_0_YELLOW_WALLPAPER_BLOCK = block(BackroomsModBlocks.LEVEL_0_YELLOW_WALLPAPER_BLOCK);
		LEVEL_0_YELLOW_WET_CARPET_BLOCK = block(BackroomsModBlocks.LEVEL_0_YELLOW_WET_CARPET_BLOCK);
		WOOD_BLOCK = block(BackroomsModBlocks.WOOD_BLOCK);
		WOOD_STAIRS = block(BackroomsModBlocks.WOOD_STAIRS);
		WOOD_SLAB = block(BackroomsModBlocks.WOOD_SLAB);
		LEVEL_0_YELLOW_WALLPAPER_STAIRS = block(BackroomsModBlocks.LEVEL_0_YELLOW_WALLPAPER_STAIRS);
		LEVEL_0_YELLOW_WALLPAPER_SLAB = block(BackroomsModBlocks.LEVEL_0_YELLOW_WALLPAPER_SLAB);
		LEVEL_0_YELLOW_WET_CARPET_STAIRS = block(BackroomsModBlocks.LEVEL_0_YELLOW_WET_CARPET_STAIRS);
		LEVEL_0_YELLOW_WET_CARPET_SLAB = block(BackroomsModBlocks.LEVEL_0_YELLOW_WET_CARPET_SLAB);
		FLUORESCENT_LAMP_SHARD = REGISTRY.register("fluorescent_lamp_shard", FluorescentLampShardItem::new);
		FLUORESCENT_LAMP = block(BackroomsModBlocks.FLUORESCENT_LAMP);
		LEVEL_0_FLUORESCENT_LAMP = block(BackroomsModBlocks.LEVEL_0_FLUORESCENT_LAMP);
		LEVEL_0_CEILING = block(BackroomsModBlocks.LEVEL_0_CEILING);
		LEVEL_0_YELLOW_WALLPAPER_BLOCK_BASE = block(BackroomsModBlocks.LEVEL_0_YELLOW_WALLPAPER_BLOCK_BASE);
		WOOD_BOARDS = block(BackroomsModBlocks.WOOD_BOARDS);
		PORTAL = block(BackroomsModBlocks.PORTAL, new Item.Properties().stacksTo(1).rarity(Rarity.RARE));
		PORTAL_1 = block(BackroomsModBlocks.PORTAL_1, new Item.Properties().stacksTo(1).rarity(Rarity.RARE));
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}