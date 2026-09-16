package com.lays24mc.undergroundbiomesconstructsreworked.block.custom;

import com.lays24mc.undergroundbiomesconstructsreworked.compat.terrainslabs.TerrainSlabsSupport;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.Property;

import java.util.function.Supplier;

public class UBCSlabBlocks extends SlabBlock {

    // Soft compat with the "Terrain Slabs" mod (modid "terrain_slabs"): its world-gen code
    // unconditionally does `slabState.setValue(CustomSlab.GENERATED, true)` on whatever slab it
    // places, including ours (see TerrainSlabsCompat). If our block state doesn't declare that
    // exact property instance it crashes with "Cannot set property ... as it does not exist",
    // since property lookup in vanilla's StateHolder is by reference identity, not equals().
    // So when that mod is present we add its actual GENERATED property (resolved via
    // TerrainSlabsSupport) to our own state definition too. No-op (null) when unavailable.
    private static final Property<Boolean> TERRAIN_SLABS_GENERATED = TerrainSlabsSupport.generatedProperty();

    public UBCSlabBlocks(Supplier<Block> baseBlock) {
        super(BlockBehaviour.Properties.ofFullCopy(baseBlock.get()));
        if (TERRAIN_SLABS_GENERATED != null) {
            this.registerDefaultState(this.defaultBlockState().setValue(TERRAIN_SLABS_GENERATED, false));
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        if (TERRAIN_SLABS_GENERATED != null) {
            builder.add(TERRAIN_SLABS_GENERATED);
        }
    }
}
