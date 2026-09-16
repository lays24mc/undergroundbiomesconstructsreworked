package com.lays24mc.undergroundbiomesconstructsreworked.compat.terrainslabs;

import net.minecraft.world.level.block.state.properties.Property;
import net.neoforged.fml.ModList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Field;

public final class TerrainSlabsSupport {
    private static final Logger LOGGER = LogManager.getLogger(TerrainSlabsSupport.class);

    public static final String MOD_ID = "terrain_slabs";

    private static final Property<Boolean> GENERATED = resolve();

    private TerrainSlabsSupport() {
    }

    public static Property<Boolean> generatedProperty() {
        return GENERATED;
    }

    private static Property<Boolean> resolve() {
        if (!ModList.get().isLoaded(MOD_ID)) {
            return null;
        }
        try {
            Class<?> clazz = Class.forName("net.countered.terrainslabs.block.customslabs.specialslabs.CustomSlab");
            Field field = clazz.getField("GENERATED");
            return (Property<Boolean>) field.get(null);
        } catch (ReflectiveOperationException | ClassCastException e) {
            LOGGER.warn(
                    "Terrain Slabs compat",
                    e
            );
            return null;
        }
    }
}
