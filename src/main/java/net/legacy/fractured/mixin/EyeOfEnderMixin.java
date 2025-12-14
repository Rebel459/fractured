package net.legacy.fractured.mixin;

import net.legacy.fractured.config.FracturedConfig;
import net.legacy.fractured.registry.FracturedItems;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.projectile.EyeOfEnder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EyeOfEnder.class)
public class EyeOfEnderMixin {
    @Shadow
    private boolean surviveAfterDeath;

    @Shadow
    private int life;

    @Inject(at = @At("TAIL"), method = "signalTo")
    private void eyeBreakChance(CallbackInfo info) {
        int chance = FracturedConfig.get.general.eye_break_chance;
        if (chance == 20) return;
        EyeOfEnder eye = EyeOfEnder.class.cast(this);
        chance -= 1;
        this.surviveAfterDeath = eye.getRandom().nextInt(100) > chance;
    }

    @Inject(at = @At("TAIL"), method = "tick")
    private void onEyeBreak(CallbackInfo info) {
        if (!FracturedConfig.get.general.broken_eyes_fracture || this.surviveAfterDeath || !(this.life > 80)) return;
        EyeOfEnder eye = EyeOfEnder.class.cast(this);
        eye.level().addFreshEntity(new ItemEntity(eye.level(), eye.getX(), eye.getY(), eye.getZ(), FracturedItems.FRACTURED_EYE.getDefaultInstance()));
    }
}