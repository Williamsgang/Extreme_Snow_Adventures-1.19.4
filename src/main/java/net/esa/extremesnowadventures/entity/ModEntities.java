package net.esa.extremesnowadventures.entity;

import net.esa.extremesnowadventures.core.ExtremeSnowAdventures;
import net.esa.extremesnowadventures.entity.custom.FluffyEntity;
import net.esa.extremesnowadventures.entity.custom.YetiEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ExtremeSnowAdventures.MOD_ID);

    public static final RegistryObject<EntityType<YetiEntity>> YETI =
            ENTITY_TYPES.register("yeti", () -> EntityType.Builder.of(YetiEntity::new, MobCategory.MONSTER)
                    .sized(2.5f, 2.5f).build("yeti"));
    public static final RegistryObject<EntityType<FluffyEntity>> FLUFFY =
            ENTITY_TYPES.register("fluffy", () -> EntityType.Builder.of(FluffyEntity::new, MobCategory.MONSTER)
                    .sized(2.5f, 2.5f).build("fluffy"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
