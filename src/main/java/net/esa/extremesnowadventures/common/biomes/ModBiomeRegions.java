package net.esa.extremesnowadventures.common.biomes;

import com.mojang.datafixers.util.Pair;
import net.esa.extremesnowadventures.common.biomes.Biomes;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.List;
import java.util.function.Consumer;

import static terrablender.api.ParameterUtils.*;

public class ModBiomeRegions extends Region {
    public ModBiomeRegions(ResourceLocation name, int weight) {
        super(name, RegionType.OVERWORLD, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper) {
        this.addModifiedVanillaOverworldBiomes(mapper, builder -> {
            List<Climate.ParameterPoint> theNorth = new ParameterPointListBuilder()
                    .temperature(Temperature.ICY, Temperature.COOL, Temperature.NEUTRAL)
                    .humidity(Humidity.ARID, Humidity.DRY, Humidity.NEUTRAL, Humidity.WET, Humidity.HUMID)
                    .continentalness(Continentalness.span(Continentalness.COAST, Continentalness.FAR_INLAND), Continentalness.span(Continentalness.MID_INLAND, Continentalness.FAR_INLAND))
                    .erosion(Erosion.EROSION_0, Erosion.EROSION_1)
                    .depth(Depth.SURFACE, Depth.FLOOR)
                    .weirdness(Weirdness.HIGH_SLICE_VARIANT_ASCENDING, Weirdness.PEAK_VARIANT, Weirdness.HIGH_SLICE_VARIANT_DESCENDING)
                    .build();

            theNorth.forEach(point -> builder.replaceBiome(point, Biomes.THE_NORTH));
        });

        this.addModifiedVanillaOverworldBiomes(mapper, builder -> {
            List<Climate.ParameterPoint> beyondTheWall = new ParameterPointListBuilder()
                    .temperature(Temperature.ICY, Temperature.COOL, Temperature.NEUTRAL)
                    .humidity(Humidity.ARID, Humidity.DRY, Humidity.NEUTRAL, Humidity.WET, Humidity.HUMID)
                    .continentalness(Continentalness.span(Continentalness.COAST, Continentalness.FAR_INLAND), Continentalness.span(Continentalness.MID_INLAND, Continentalness.FAR_INLAND))
                    .erosion(Erosion.EROSION_0, Erosion.EROSION_1)
                    .depth(Depth.SURFACE, Depth.FLOOR)
                    .weirdness(Weirdness.HIGH_SLICE_VARIANT_ASCENDING, Weirdness.PEAK_VARIANT, Weirdness.HIGH_SLICE_VARIANT_DESCENDING)
                    .build();

            beyondTheWall.forEach(point -> builder.replaceBiome(point, Biomes.BEYOND_THE_WALL));
        });
    }
}
