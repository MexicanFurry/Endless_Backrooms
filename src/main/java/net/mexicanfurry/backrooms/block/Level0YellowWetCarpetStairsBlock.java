package net.mexicanfurry.backrooms.block;

import net.neoforged.neoforge.common.util.DeferredSoundType;
import net.neoforged.neoforge.common.ItemAbility;
import net.neoforged.neoforge.common.ItemAbilities;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mexicanfurry.backrooms.init.BackroomsModBlocks;

public class Level0YellowWetCarpetStairsBlock extends StairBlock {
	public Level0YellowWetCarpetStairsBlock() {
		super(Blocks.AIR.defaultBlockState(),
				BlockBehaviour.Properties.of()
						.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.break")), () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wool.step")),
								() -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.place")), () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.hit")),
								() -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.fall"))))
						.strength(2f).instrument(NoteBlockInstrument.GUITAR));
	}

	@Override
	public float getExplosionResistance() {
		return 2f;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 5;
	}

	@Override
	public BlockState getToolModifiedState(BlockState blockstate, UseOnContext context, ItemAbility itemAbility, boolean simulate) {
		if (ItemAbilities.AXE_STRIP == itemAbility && context.getItemInHand().canPerformAction(itemAbility)) {
			return BackroomsModBlocks.WOOD_STAIRS.get().withPropertiesOf(blockstate);
		}
		return super.getToolModifiedState(blockstate, context, itemAbility, simulate);
	}
}