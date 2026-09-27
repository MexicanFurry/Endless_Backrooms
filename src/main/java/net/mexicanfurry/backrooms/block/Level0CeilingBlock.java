package net.mexicanfurry.backrooms.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class Level0CeilingBlock extends Block {
	public Level0CeilingBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.SCAFFOLDING).strength(1f).instrument(NoteBlockInstrument.HAT));
	}
}