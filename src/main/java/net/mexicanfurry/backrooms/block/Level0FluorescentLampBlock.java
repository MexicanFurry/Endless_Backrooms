package net.mexicanfurry.backrooms.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.BlockPos;

import net.mexicanfurry.backrooms.procedures.Level0FluorescentLampLuminanceProcedure;

public class Level0FluorescentLampBlock extends Block {
	public static final BooleanProperty LIGHT_EVENT = BooleanProperty.create("light_event");

	public Level0FluorescentLampBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GLASS).strength(0.3f).lightLevel(blockstate -> (int) Level0FluorescentLampLuminanceProcedure.execute(blockstate)).hasPostProcess((bs, br, bp) -> true)
				.emissiveRendering((bs, br, bp) -> true).instrument(NoteBlockInstrument.HAT));
		this.registerDefaultState(this.stateDefinition.any().setValue(LIGHT_EVENT, true));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(LIGHT_EVENT);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		BlockState state = super.getStateForPlacement(context);
		if (state == null)
			return null;
		return state.setValue(LIGHT_EVENT, true);
	}
}