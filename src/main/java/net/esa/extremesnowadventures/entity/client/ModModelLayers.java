package net.esa.extremesnowadventures.entity.client;

import net.esa.extremesnowadventures.core.ExtremeSnowAdventures;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class ModModelLayers {
    public static final ModelLayerLocation YETI_LAYER = new ModelLayerLocation(
            new ResourceLocation(ExtremeSnowAdventures.MOD_ID, "yeti_layer"), "main");
    public static final ModelLayerLocation FLUFFY_LAYER = new ModelLayerLocation(
            new ResourceLocation(ExtremeSnowAdventures.MOD_ID, "fluffy_layer"), "main");
}
