package net.esa.extremesnowadventures.potion;

import net.esa.extremesnowadventures.procedures.DrinkingWaterStartedAppliedProcedure;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class DrinkingWaterMobEffect extends MobEffect {
    public DrinkingWaterMobEffect() {
        super(MobEffectCategory.BENEFICIAL, -1);
    }

    @Override
    public String getDescriptionId() {
        return "effect.extremesnowadventures.drinkingwatereffect";
    }

    @Override
    public boolean isInstantenous() {
        return true;
    }

    @Override
    public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
        DrinkingWaterStartedAppliedProcedure.execute(entity);
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}