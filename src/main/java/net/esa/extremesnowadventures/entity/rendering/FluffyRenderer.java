package net.esa.extremesnowadventures.entity.rendering;

import net.esa.extremesnowadventures.core.ExtremeSnowAdventures;
import net.esa.extremesnowadventures.entity.client.ModModelLayers;
import net.esa.extremesnowadventures.entity.custom.FluffyEntity;
import net.esa.extremesnowadventures.entity.model.FluffyModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class FluffyRenderer extends MobRenderer<FluffyEntity, FluffyModel<FluffyEntity>> {
    public FluffyRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new FluffyModel<>(pContext.bakeLayer(ModModelLayers.FLUFFY_LAYER)), 1f);
    }

    /**
     * Returns the location of an entity's texture.
     *
     * @param pEntity
     */
    @Override
    public ResourceLocation getTextureLocation(FluffyEntity pEntity) {
        return new ResourceLocation(ExtremeSnowAdventures.MOD_ID, "textures/entity/fluffy.png");
    }

}
