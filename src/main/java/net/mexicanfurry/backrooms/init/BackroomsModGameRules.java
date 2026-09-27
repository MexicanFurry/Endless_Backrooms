/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mexicanfurry.backrooms.init;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.GameRules;

@EventBusSubscriber
public class BackroomsModGameRules {
	public static GameRules.Key<GameRules.BooleanValue> SPONTANEOUS_NO_CLIP;

	@SubscribeEvent
	public static void registerGameRules(FMLCommonSetupEvent event) {
		SPONTANEOUS_NO_CLIP = GameRules.register("spontaneousNoClip", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
	}
}