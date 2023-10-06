package net.esa.extremesnowadventures.client.screens.water;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import net.esa.extremesnowadventures.procedures.WaterBarConditionsProcedures;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiComponent;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class WaterBar5Overlay {
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void eventHandler(RenderGuiEvent.Pre event) {
        int w = event.getWindow().getGuiScaledWidth();
        int h = event.getWindow().getGuiScaledHeight();
        int posX = w / 2;
        int posY = h / 2;
        Level world = null;
        double x = 0;
        double y = 0;
        double z = 0;
        Player entity = Minecraft.getInstance().player;
        if (entity != null) {
            world = entity.level;
            x = entity.getX();
            y = entity.getY();
            z = entity.getZ();
        }
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask(false);
        RenderSystem.enableBlend();
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
        RenderSystem.setShaderColor(1, 1, 1, 1);
        if (WaterBarConditionsProcedures.executeWaterBarCondition5(entity)) {
            RenderSystem.setShaderTexture(0, new ResourceLocation("extremesnowadventures:textures/screens/filled_thirst"));
            GuiComponent.blit(event.getPoseStack(), posX + -90, posY + 68, 0, 0, 8, 8, 8, 8);

            RenderSystem.setShaderTexture(0, new ResourceLocation("extremesnowadventures:textures/screens/filled_thirst"));
            GuiComponent.blit(event.getPoseStack(), posX + -81, posY + 68, 0, 0, 8, 8, 8, 8);

            RenderSystem.setShaderTexture(0, new ResourceLocation("extremesnowadventures:textures/screens/filled_thirst"));
            GuiComponent.blit(event.getPoseStack(), posX + -72, posY + 68, 0, 0, 8, 8, 8, 8);

            RenderSystem.setShaderTexture(0, new ResourceLocation("extremesnowadventures:textures/screens/filled_thirst"));
            GuiComponent.blit(event.getPoseStack(), posX + -63, posY + 68, 0, 0, 8, 8, 8, 8);

            RenderSystem.setShaderTexture(0, new ResourceLocation("extremesnowadventures:textures/screens/filled_thirst"));
            GuiComponent.blit(event.getPoseStack(), posX + -54, posY + 68, 0, 0, 8, 8, 8, 8);

            RenderSystem.setShaderTexture(0, new ResourceLocation("extremesnowadventures:textures/screens/filled_thirst"));
            GuiComponent.blit(event.getPoseStack(), posX + -45, posY + 68, 0, 0, 8, 8, 8, 8);

            RenderSystem.setShaderTexture(0, new ResourceLocation("extremesnowadventures:textures/screens/water/empty_thirst"));
            GuiComponent.blit(event.getPoseStack(), posX + -36, posY + 68, 0, 0, 8, 8, 8, 8);

            RenderSystem.setShaderTexture(0, new ResourceLocation("extremesnowadventures:textures/screens/water/empty_thirst"));
            GuiComponent.blit(event.getPoseStack(), posX + -27, posY + 68, 0, 0, 8, 8, 8, 8);

            RenderSystem.setShaderTexture(0, new ResourceLocation("extremesnowadventures:textures/screens/water/empty_thirst"));
            GuiComponent.blit(event.getPoseStack(), posX + -18, posY + 68, 0, 0, 8, 8, 8, 8);

            RenderSystem.setShaderTexture(0, new ResourceLocation("extremesnowadventures:textures/screens/water/empty_thirst"));
            GuiComponent.blit(event.getPoseStack(), posX + -9, posY + 68, 0, 0, 8, 8, 8, 8);

        }
        RenderSystem.depthMask(true);
        RenderSystem.defaultBlendFunc();
        RenderSystem.enableDepthTest();
        RenderSystem.disableBlend();
        RenderSystem.setShaderColor(1, 1, 1, 1);
    }
}
