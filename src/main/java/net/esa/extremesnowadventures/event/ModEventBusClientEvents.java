package net.esa.extremesnowadventures.event;

import net.esa.extremesnowadventures.core.ExtremeSnowAdventures;
import net.esa.extremesnowadventures.entity.client.ModModelLayers;
import net.esa.extremesnowadventures.entity.model.FluffyModel;
import net.esa.extremesnowadventures.entity.model.YetiModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ExtremeSnowAdventures.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.YETI_LAYER, YetiModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.FLUFFY_LAYER, FluffyModel::createBodyLayer);
    }
}
