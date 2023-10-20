package net.esa.extremesnowadventures.event;

import net.esa.extremesnowadventures.core.ExtremeSnowAdventures;
import net.esa.extremesnowadventures.entity.ModEntities;
import net.esa.extremesnowadventures.entity.custom.FluffyEntity;
import net.esa.extremesnowadventures.entity.custom.YetiEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ExtremeSnowAdventures.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.YETI.get(), YetiEntity.createAttributes().build());
        event.put(ModEntities.FLUFFY.get(), FluffyEntity.createAttributes().build());
    }

}
