package net.mexicanfurry.backrooms.block;

import net.neoforged.neoforge.common.ItemAbility;
import net.neoforged.neoforge.common.ItemAbilities;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mexicanfurry.backrooms.init.BackroomsModBlocks;

public class Level0YellowWallpaperSlabBlock extends SlabBlock {
	public Level0YellowWallpaperSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(2f).ignitedByLava().instrument(NoteBlockInstrument.BASS));
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 10;
	}

	@Override
	public BlockState getToolModifiedState(BlockState blockstate, UseOnContext context, ItemAbility itemAbility, boolean simulate) {
		if (ItemAbilities.AXE_STRIP == itemAbility && context.getItemInHand().canPerformAction(itemAbility)) {
			return BackroomsModBlocks.WOOD_SLAB.get().withPropertiesOf(blockstate);
		}
		return super.getToolModifiedState(blockstate, context, itemAbility, simulate);
	}
}