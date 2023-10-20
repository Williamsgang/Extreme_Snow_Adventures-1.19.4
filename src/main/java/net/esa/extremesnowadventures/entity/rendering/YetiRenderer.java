package net.esa.extremesnowadventures.entity.rendering;

import net.esa.extremesnowadventures.core.ExtremeSnowAdventures;
import net.esa.extremesnowadventures.entity.client.ModModelLayers;
import net.esa.extremesnowadventures.entity.custom.YetiEntity;
import net.esa.extremesnowadventures.entity.model.YetiModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class YetiRenderer extends MobRenderer<YetiEntity, YetiModel<YetiEntity>> {
    public YetiRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new YetiModel<>(pContext.bakeLayer(ModModelLayers.YETI_LAYER)), 1f);
    }

    /**
     * Returns the location of an entity's texture.
     *
     * @param pEntity
     */
    @Override
    public ResourceLocation getTextureLocation(YetiEntity pEntity) {
        return new ResourceLocation(ExtremeSnowAdventures.MOD_ID, "textures/entity/yeti.png");
    }

}
