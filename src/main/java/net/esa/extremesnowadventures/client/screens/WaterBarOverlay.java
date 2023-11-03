package net.esa.extremesnowadventures.client.screens;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
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

@Mod.EventBusSubscriber({ Dist.CLIENT })
public class WaterBarOverlay {
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void eventHandler(RenderGuiEvent.Pre event) {
        int w = event.getWindow().getGuiScaledWidth();
        int h = event.getWindow().getGuiScaledHeight();
        int posX = w / 2;
        int posY = h / 2;
        Player entity = Minecraft.getInstance().player;

        if (entity != null && !entity.isCreative() && !entity.isSpectator()) {
            Level world = entity.level;
            double x = entity.getX();
            double y = entity.getY();
            double z = entity.getZ();

            RenderSystem.disableDepthTest();
            RenderSystem.depthMask(false);
            RenderSystem.enableBlend();
            RenderSystem.setShader(GameRenderer::getPositionTexShader);
            RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA,
                    GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE,
                    GlStateManager.DestFactor.ZERO);
            RenderSystem.setShaderColor(1, 1, 1, 1);

            for (int i = 0; i <= 10; i++) {
                for (int j = 0; j <= 10; j++) {
                    if (WaterBarConditionsProcedures.executeWaterBarCondition(i, j, entity)) {
                        renderWaterBar(event.getPoseStack(), posX, posY, -90 + i * 9, 68);
                    } else {
                        renderEmptyWaterBar(event.getPoseStack(), posX, posY, -90 + i * 9, 68);
                    }
                }
            }

            RenderSystem.depthMask(true);
            RenderSystem.defaultBlendFunc();
            RenderSystem.enableDepthTest();
            RenderSystem.disableBlend();
            RenderSystem.setShaderColor(1, 1, 1, 1);
        }
    }

    private static void renderWaterBar(PoseStack poseStack, int posX, int posY, int xOffset, int yOffset) {
        RenderSystem.setShaderTexture(0, new ResourceLocation("extremesnowadventures:textures/filled_thirst.png"));
        GuiComponent.blit(poseStack, posX + xOffset, posY + yOffset, 0, 0, 8, 8, 8, 8);
    }

    private static void renderEmptyWaterBar(PoseStack poseStack, int posX, int posY, int xOffset, int yOffset) {
        RenderSystem.setShaderTexture(0, new ResourceLocation("extremesnowadventures:textures/empty_thirst.png"));
        GuiComponent.blit(poseStack, posX + xOffset, posY + yOffset, 0, 0, 8, 8, 8, 8);
    }
}
