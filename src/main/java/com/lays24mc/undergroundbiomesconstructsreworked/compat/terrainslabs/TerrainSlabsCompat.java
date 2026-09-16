package com.lays24mc.undergroundbiomesconstructsreworked.compat.terrainslabs;

import com.lays24mc.undergroundbiomesconstructsreworked.block.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.Property;
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.registries.DeferredBlock;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Field;
import java.util.Map;

public final class TerrainSlabsCompat {
    private static final Logger LOGGER = LogManager.getLogger(TerrainSlabsCompat.class);

    private static final String MOD_ID = TerrainSlabsSupport.MOD_ID;
    private static final String SLAB_MAP_CLASS = "net.countered.terrainslabs.block.ModSlabsMap";
    private static final String SLAB_MAP_FIELD = "SLAB_MAP";

    private TerrainSlabsCompat() {
    }

    public static void init() {
        if (!ModList.get().isLoaded(MOD_ID)) {
            return;
        }

        try {
            Map<Block, Block> slabMap = getSlabMap();
            int added = registerPairs(slabMap);
            LOGGER.info("Terrain Slabs compat: registered {} block -> slab mapping(s)", added);
        } catch (ReflectiveOperationException | RuntimeException e) {
            LOGGER.warn(
                    "Terrain Slabs compat: could not hook into '{}' (internal layout may have changed or is incompatible). " +
                            "Slab generation for this mod's blocks will be skipped, everything else is unaffected.",
                    MOD_ID, e
            );
        }
    }

    private static Map<Block, Block> getSlabMap() throws ReflectiveOperationException {
        Class<?> clazz = Class.forName(SLAB_MAP_CLASS);
        Field field = clazz.getDeclaredField(SLAB_MAP_FIELD);
        field.setAccessible(true);
        return (Map<Block, Block>) field.get(null);
    }

    private static int registerPairs(Map<Block, Block> slabMap) {
        int added = 0;

        added += addPair(slabMap, BlackGraniteBlocks.BLACK_GRANITE_BLOCK, BlackGraniteBlocks.BLACK_GRANITE_BLOCK_SLAB);
        added += addPair(slabMap, BlackGraniteBlocks.BLACK_GRANITE_COBBLE_BLOCK, BlackGraniteBlocks.BLACK_GRANITE_COBBLE_SLAB);
        added += addPair(slabMap, BlackGraniteBlocks.BLACK_GRANITE_BRICK_BLOCK, BlackGraniteBlocks.BLACK_GRANITE_BRICK_SLAB);

        added += addPair(slabMap, BlueschistBlocks.BLUESCHIST_BLOCK, BlueschistBlocks.BLUESCHIST_BLOCK_SLAB);
        added += addPair(slabMap, BlueschistBlocks.BLUESCHIST_COBBLE_BLOCK, BlueschistBlocks.BLUESCHIST_COBBLE_SLAB);
        added += addPair(slabMap, BlueschistBlocks.BLUESCHIST_BRICK_BLOCK, BlueschistBlocks.BLUESCHIST_BRICK_SLAB);

        added += addPair(slabMap, ChalkBlocks.CHALK_BLOCK, ChalkBlocks.CHALK_BLOCK_SLAB);

        added += addPair(slabMap, ChertBlocks.CHERT_BLOCK, ChertBlocks.CHERT_BLOCK_SLAB);

        added += addPair(slabMap, DaciteBlocks.DACITE_BLOCK, DaciteBlocks.DACITE_BLOCK_SLAB);
        added += addPair(slabMap, DaciteBlocks.DACITE_COBBLE_BLOCK, DaciteBlocks.DACITE_COBBLE_SLAB);
        added += addPair(slabMap, DaciteBlocks.DACITE_BRICK_BLOCK, DaciteBlocks.DACITE_BRICK_SLAB);

        added += addPair(slabMap, DolomiteBlocks.DOLOMITE_BLOCK, DolomiteBlocks.DOLOMITE_BLOCK_SLAB);

        added += addPair(slabMap, EclogiteBlocks.ECLOGITE_BLOCK, EclogiteBlocks.ECLOGITE_BLOCK_SLAB);

        added += addPair(slabMap, GabbroBlocks.GABBRO_BLOCK, GabbroBlocks.GABBRO_BLOCK_SLAB);
        added += addPair(slabMap, GabbroBlocks.GABBRO_COBBLE_BLOCK, GabbroBlocks.GABBRO_COBBLE_SLAB);
        added += addPair(slabMap, GabbroBlocks.GABBRO_BRICK_BLOCK, GabbroBlocks.GABBRO_BRICK_SLAB);

        added += addPair(slabMap, GneissBlocks.GNEISS_BLOCK, GneissBlocks.GNEISS_BLOCK_SLAB);
        added += addPair(slabMap, GneissBlocks.GNEISS_COBBLE_BLOCK, GneissBlocks.GNEISS_COBBLE_SLAB);
        added += addPair(slabMap, GneissBlocks.GNEISS_BRICK_BLOCK, GneissBlocks.GNEISS_BRICK_SLAB);

        added += addPair(slabMap, GreenschistBlocks.GREENSCHIST_BLOCK, GreenschistBlocks.GREENSCHIST_BLOCK_SLAB);
        added += addPair(slabMap, GreenschistBlocks.GREENSCHIST_COBBLE_BLOCK, GreenschistBlocks.GREENSCHIST_COBBLE_SLAB);
        added += addPair(slabMap, GreenschistBlocks.GREENSCHIST_BRICK_BLOCK, GreenschistBlocks.GREENSCHIST_BRICK_SLAB);

        added += addPair(slabMap, GreywackeBlocks.GREYWACKE_BLOCK, GreywackeBlocks.GREYWACKE_BLOCK_SLAB);

        added += addPair(slabMap, KomatiiteBlocks.KOMATIITE_BLOCK, KomatiiteBlocks.KOMATIITE_BLOCK_SLAB);
        added += addPair(slabMap, KomatiiteBlocks.KOMATIITE_COBBLE_BLOCK, KomatiiteBlocks.KOMATIITE_COBBLE_SLAB);
        added += addPair(slabMap, KomatiiteBlocks.KOMATIITE_BRICK_BLOCK, KomatiiteBlocks.KOMATIITE_BRICK_SLAB);

        added += addPair(slabMap, LigniteBlocks.LIGNITE_BLOCK, LigniteBlocks.LIGNITE_BLOCK_SLAB);

        added += addPair(slabMap, LimestoneBlocks.LIMESTONE_BLOCK, LimestoneBlocks.LIMESTONE_BLOCK_SLAB);

        added += addPair(slabMap, MarbleBlocks.MARBLE_BLOCK, MarbleBlocks.MARBLE_BLOCK_SLAB);
        added += addPair(slabMap, MarbleBlocks.MARBLE_COBBLE_BLOCK, MarbleBlocks.MARBLE_COBBLE_SLAB);
        added += addPair(slabMap, MarbleBlocks.MARBLE_BRICK_BLOCK, MarbleBlocks.MARBLE_BRICK_SLAB);

        added += addPair(slabMap, MigmatiteBlocks.MIGMATITE_BLOCK, MigmatiteBlocks.MIGMATITE_BLOCK_SLAB);
        added += addPair(slabMap, MigmatiteBlocks.MIGMATITE_COBBLE_BLOCK, MigmatiteBlocks.MIGMATITE_COBBLE_SLAB);
        added += addPair(slabMap, MigmatiteBlocks.MIGMATITE_BRICK_BLOCK, MigmatiteBlocks.MIGMATITE_BRICK_SLAB);

        added += addPair(slabMap, QuartziteBlocks.QUARTZITE_BLOCK, QuartziteBlocks.QUARTZITE_BLOCK_SLAB);
        added += addPair(slabMap, QuartziteBlocks.QUARTZITE_COBBLE_BLOCK, QuartziteBlocks.QUARTZITE_COBBLE_SLAB);
        added += addPair(slabMap, QuartziteBlocks.QUARTZITE_BRICK_BLOCK, QuartziteBlocks.QUARTZITE_BRICK_SLAB);

        added += addPair(slabMap, RedGraniteBlocks.RED_GRANITE_BLOCK, RedGraniteBlocks.RED_GRANITE_BLOCK_SLAB);
        added += addPair(slabMap, RedGraniteBlocks.RED_GRANITE_COBBLE_BLOCK, RedGraniteBlocks.RED_GRANITE_COBBLE_SLAB);
        added += addPair(slabMap, RedGraniteBlocks.RED_GRANITE_BRICK_BLOCK, RedGraniteBlocks.RED_GRANITE_BRICK_SLAB);

        added += addPair(slabMap, RhyoliteBlocks.RHYOLITE_BLOCK, RhyoliteBlocks.RHYOLITE_BLOCK_SLAB);
        added += addPair(slabMap, RhyoliteBlocks.RHYOLITE_COBBLE_BLOCK, RhyoliteBlocks.RHYOLITE_COBBLE_SLAB);
        added += addPair(slabMap, RhyoliteBlocks.RHYOLITE_BRICK_BLOCK, RhyoliteBlocks.RHYOLITE_BRICK_SLAB);

        added += addPair(slabMap, ShaleBlocks.SHALE_BLOCK, ShaleBlocks.SHALE_BLOCK_SLAB);

        added += addPair(slabMap, SiltstoneBlocks.SILTSTONE_BLOCK, SiltstoneBlocks.SILTSTONE_BLOCK_SLAB);

        added += addPair(slabMap, SoapstoneBlocks.SOAPSTONE_BLOCK, SoapstoneBlocks.SOAPSTONE_BLOCK_SLAB);
        added += addPair(slabMap, SoapstoneBlocks.SOAPSTONE_COBBLE_BLOCK, SoapstoneBlocks.SOAPSTONE_COBBLE_SLAB);
        added += addPair(slabMap, SoapstoneBlocks.SOAPSTONE_BRICK_BLOCK, SoapstoneBlocks.SOAPSTONE_BRICK_SLAB);

        return added;
    }

    private static int addPair(Map<Block, Block> slabMap, DeferredBlock<Block> full, DeferredBlock<Block> slab) {
        Block slabBlock = slab.get();

        Property<Boolean> generated = TerrainSlabsSupport.generatedProperty();
        if (generated != null && !slabBlock.defaultBlockState().hasProperty(generated)) {
            LOGGER.warn(
                    "Terrain Slabs compat: {} is missing the 'generated' state property, skipping " +
                            "its slab mapping to avoid a world-gen crash",
                    slabBlock
            );
            return 0;
        }

        slabMap.put(full.get(), slabBlock);
        return 1;
    }
}
