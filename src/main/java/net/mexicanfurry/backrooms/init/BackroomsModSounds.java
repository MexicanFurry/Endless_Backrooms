/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mexicanfurry.backrooms.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mexicanfurry.backrooms.BackroomsMod;

public class BackroomsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, BackroomsMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> LEVEL0_AMBIENT = REGISTRY.register("level0_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_ambient")));
}