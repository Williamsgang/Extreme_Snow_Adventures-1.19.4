package net.esa.extremesnowadventures.common.biomes;

import net.esa.extremesnowadventures.core.ExtremeSnowAdventures;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;

public class Biomes {
    public static final ResourceKey<Biome> THE_NORTH = register("the_north");
    public static final ResourceKey<Biome> BEYOND_THE_WALL = register("beyond_the_wall");

    private static ResourceKey<Biome> register(String name) {
        return ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(ExtremeSnowAdventures.MOD_ID, name));
    }
}
