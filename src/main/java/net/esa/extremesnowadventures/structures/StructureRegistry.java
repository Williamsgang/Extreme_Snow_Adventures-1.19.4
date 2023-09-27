package net.esa.extremesnowadventures.structures;

import net.esa.extremesnowadventures.core.ExtremeSnowAdventures;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class StructureRegistry {
    public static final DeferredRegister<Feature<?>> STRUCTURES = DeferredRegister.create(ForgeRegistries.FEATURES, ExtremeSnowAdventures.MOD_ID);

    public static void register(IEventBus eventBus) {
        STRUCTURES.register(eventBus);
    }
}
