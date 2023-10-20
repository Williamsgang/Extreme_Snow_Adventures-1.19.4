package net.esa.extremesnowadventures.core;

import com.mojang.logging.LogUtils;
import net.esa.extremesnowadventures.blocks.ModBlocks;
import net.esa.extremesnowadventures.entity.ModEntities;
import net.esa.extremesnowadventures.entity.rendering.FluffyRenderer;
import net.esa.extremesnowadventures.entity.rendering.YetiRenderer;
import net.esa.extremesnowadventures.init.ModMobEffects;
import net.esa.extremesnowadventures.init.ModPotions;
import net.esa.extremesnowadventures.items.ModCreativeTab;
import net.esa.extremesnowadventures.items.ModItems;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;
import org.slf4j.Logger;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

import static net.esa.extremesnowadventures.entity.ModEntities.*;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ExtremeSnowAdventures.MOD_ID)
public class ExtremeSnowAdventures {
    public static final String MOD_ID = "extremesnowadventures";
    private static final Logger LOGGER = LogUtils.getLogger();

    public ExtremeSnowAdventures() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register the items
        ModItems.register(modEventBus);

        // Register the blocks
        ModBlocks.register(modEventBus);

        // Register mob effects
        ModMobEffects.register(modEventBus);

        // Register potions
        ModPotions.register(modEventBus);

        //Registers mob
        register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

    }

    private static final String PROTOCOL_VERSION = "1";
    public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(
            new ResourceLocation(MOD_ID, MOD_ID), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals,
            PROTOCOL_VERSION::equals);
    private static int messageID = 0;

    public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder,
            Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
        PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
        messageID++;
    }

    private static final Collection<AbstractMap.SimpleEntry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();

    public static void queueServerWork(int tick, Runnable action) {
        workQueue.add(new AbstractMap.SimpleEntry(action, tick));
    }

    @SubscribeEvent
    public void tick(TickEvent.ServerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            List<AbstractMap.SimpleEntry<Runnable, Integer>> actions = new ArrayList<>();
            workQueue.forEach(work -> {
                work.setValue(work.getValue() - 1);
                if (work.getValue() == 0)
                    actions.add(work);
            });
            actions.forEach(e -> e.getKey().run());
            workQueue.removeAll(actions);
        }
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == ModCreativeTab.ESA_ITEM_TAB) {
            event.accept(ModItems.BLUE_PROCESSED_WOOL);
            event.accept(ModItems.BLACK_PROCESSED_WOOL);
            event.accept(ModItems.BROWN_PROCESSED_WOOL);
            event.accept(ModItems.CYAN_PROCESSED_WOOL);
            event.accept(ModItems.GRAY_PROCESSED_WOOL);
            event.accept(ModItems.GREEN_PROCESSED_WOOL);
            event.accept(ModItems.LIGHT_BLUE_PROCESSED_WOOL);
            event.accept(ModItems.LIGHT_GRAY_PROCESSED_WOOL);
            event.accept(ModItems.LIGHT_PINK_PROCESSED_WOOL);
            event.accept(ModItems.LIME_PROCESSED_WOOL);
            event.accept(ModItems.MAGENTA_PROCESSED_WOOL);
            event.accept(ModItems.ORANGE_PROCESSED_WOOL);
            event.accept(ModItems.PURPLE_PROCESSED_WOOL);
            event.accept(ModItems.RED_PROCESSED_WOOL);
            event.accept(ModItems.WHITE_PROCESSED_WOOL);
            event.accept(ModItems.YELLOW_PROCESSED_WOOL);
            event.accept(ModItems.HOT_COCOA);
            event.accept(ModItems.WHITE_WINTER_CAP);
            event.accept(ModItems.WHITE_WINTER_COAT);
            event.accept(ModItems.WHITE_WINTER_PANTS);
            event.accept(ModItems.WHITE_WINTER_BOOTS);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods
    // in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(YETI.get(), YetiRenderer::new);
            EntityRenderers.register(FLUFFY.get(), FluffyRenderer::new);
        }
    }
}
