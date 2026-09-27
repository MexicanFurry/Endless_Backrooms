package net.mexicanfurry.backrooms.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class FluorescentLampBlock extends Block {
	public FluorescentLampBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GLASS).strength(0.3f).lightLevel(blockstate -> 15).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).instrument(NoteBlockInstrument.HAT));
	}
}