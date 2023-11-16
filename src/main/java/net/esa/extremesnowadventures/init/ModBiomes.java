package net.esa.extremesnowadventures.init;

import net.esa.extremesnowadventures.common.biomes.Biomes;
import net.esa.extremesnowadventures.common.biomes.ModOverworldBiomes;
import net.esa.extremesnowadventures.core.ExtremeSnowAdventures;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBiomes {
    public static DeferredRegister<Biome> BIOMES = DeferredRegister.create(Registry.BIOME_REGISTRY, ExtremeSnowAdventures.MOD_ID);

    public static void registerBiomes() {
        register(Biomes.THE_NORTH, ModOverworldBiomes::TheNorth);
        register(Biomes.BEYOND_THE_WALL, ModOverworldBiomes::BeyondTheWall);
    }

    public static RegistryObject<Biome> register(ResourceKey<Biome> key, Supplier<Biome> biomeSupplier) {
        return BIOMES.register(key.location().getPath(), biomeSupplier);
    }
}
