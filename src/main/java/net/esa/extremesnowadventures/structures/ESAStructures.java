package net.esa.extremesnowadventures.structures;

import com.mojang.serialization.Codec;
import net.esa.extremesnowadventures.core.ExtremeSnowAdventures;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ESAStructures {
    public static final DeferredRegister<StructureType<?>> DEFERRED_REGISTRY_STRUCTURE = DeferredRegister.create(Registries.STRUCTURE_TYPE, ExtremeSnowAdventures.MOD_ID);
    public static final RegistryObject<StructureType<PillagerStronghold>> PILLAGER_STRONGHOLD = DEFERRED_REGISTRY_STRUCTURE.register("pillager_stronghold", () -> explicitStructureTypeTyping(PillagerStronghold.CODEC));
    public static <T extends Structure> StructureType<T> explicitStructureTypeTyping(Codec<T> structureCodec) {
        return () -> structureCodec;
    }
}
