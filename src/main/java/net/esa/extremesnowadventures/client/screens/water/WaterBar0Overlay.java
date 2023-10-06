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
public class WaterBar0Overlay {
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
        if (WaterBarConditionsProcedures.executeWaterBarCondition0(entity)) {
            RenderSystem.setShaderTexture(0, new ResourceLocation("extremesnowadventures:textures/screens/water/empty_thirst"));
            GuiComponent.blit(event.getPoseStack(), posX + 91, posY + 82, 0, 0, 8, 8, 8, 8);

            RenderSystem.setShaderTexture(0, new ResourceLocation("extremesnowadventures:textures/screens/water/empty_thirst"));
            GuiComponent.blit(event.getPoseStack(), posX + 99, posY + 82, 0, 0, 8, 8, 8, 8);

            RenderSystem.setShaderTexture(0, new ResourceLocation("extremesnowadventures:textures/screens/water/empty_thirst"));
            GuiComponent.blit(event.getPoseStack(), posX + 107, posY + 82, 0, 0, 8, 8, 8, 8);

            RenderSystem.setShaderTexture(0, new ResourceLocation("extremesnowadventures:textures/screens/water/empty_thirst"));
            GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 82, 0, 0, 8, 8, 8, 8);

            RenderSystem.setShaderTexture(0, new ResourceLocation("extremesnowadventures:textures/screens/water/empty_thirst"));
            GuiComponent.blit(event.getPoseStack(), posX + 123, posY + 82, 0, 0, 8, 8, 8, 8);

            RenderSystem.setShaderTexture(0, new ResourceLocation("extremesnowadventures:textures/screens/water/empty_thirst"));
            GuiComponent.blit(event.getPoseStack(), posX + 131, posY + 82, 0, 0, 8, 8, 8, 8);

            RenderSystem.setShaderTexture(0, new ResourceLocation("extremesnowadventures:textures/screens/water/empty_thirst"));
            GuiComponent.blit(event.getPoseStack(), posX + 139, posY + 82, 0, 0, 8, 8, 8, 8);

            RenderSystem.setShaderTexture(0, new ResourceLocation("extremesnowadventures:textures/screens/water/empty_thirst"));
            GuiComponent.blit(event.getPoseStack(), posX + 147, posY + 82, 0, 0, 8, 8, 8, 8);

            RenderSystem.setShaderTexture(0, new ResourceLocation("extremesnowadventures:textures/screens/water/empty_thirst"));
            GuiComponent.blit(event.getPoseStack(), posX + 155, posY + 82, 0, 0, 8, 8, 8, 8);

            RenderSystem.setShaderTexture(0, new ResourceLocation("extremesnowadventures:textures/screens/water/empty_thirst"));
            GuiComponent.blit(event.getPoseStack(), posX + 163, posY + 82, 0, 0, 8, 8, 8, 8);

        }
        RenderSystem.depthMask(true);
        RenderSystem.defaultBlendFunc();
        RenderSystem.enableDepthTest();
        RenderSystem.disableBlend();
        RenderSystem.setShaderColor(1, 1, 1, 1);
    }
}
