
package net.esa.extremesnowadventures.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class BodyTempOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
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
		if (true) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("extremesnowadventures:textures/screens/temp/temp_blank"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 0, posY + 68, 0, 0, 8, 8, 8, 8);

			RenderSystem.setShaderTexture(0, new ResourceLocation("extremesnowadventures:textures/screens/temp/temp_blank"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 9, posY + 68, 0, 0, 8, 8, 8, 8);

			RenderSystem.setShaderTexture(0, new ResourceLocation("extremesnowadventures:textures/screens/temp/temp_blank"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 18, posY + 68, 0, 0, 8, 8, 8, 8);

			RenderSystem.setShaderTexture(0, new ResourceLocation("extremesnowadventures:textures/screens/temp/temp_blank"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 27, posY + 68, 0, 0, 8, 8, 8, 8);

			RenderSystem.setShaderTexture(0, new ResourceLocation("extremesnowadventures:textures/screens/temp/temp_blank"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 54, posY + 68, 0, 0, 8, 8, 8, 8);

			RenderSystem.setShaderTexture(0, new ResourceLocation("extremesnowadventures:textures/screens/temp/temp_blank"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 63, posY + 68, 0, 0, 8, 8, 8, 8);

			RenderSystem.setShaderTexture(0, new ResourceLocation("extremesnowadventures:textures/screens/temp/temp_blank"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 72, posY + 68, 0, 0, 8, 8, 8, 8);

			RenderSystem.setShaderTexture(0, new ResourceLocation("extremesnowadventures:textures/screens/temp/temp_blank"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 81, posY + 68, 0, 0, 8, 8, 8, 8);

			RenderSystem.setShaderTexture(0, new ResourceLocation("extremesnowadventures:textures/screens/temp/hottt"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 45, posY + 68, 0, 0, 8, 8, 8, 8);

			RenderSystem.setShaderTexture(0, new ResourceLocation("extremesnowadventures:textures/screens/temp/temp_cold"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 36, posY + 68, 0, 0, 8, 8, 8, 8);

		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
