// Mixin credit: End Remastered
// https://modrinth.com/mod/endrem

package net.rebel459.fractured.mixin;

import net.rebel459.fractured.config.FracturedConfig;
import net.minecraft.world.level.levelgen.structure.structures.StrongholdPieces;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(StrongholdPieces.PortalRoom.class)
public class PortalRoomMixin {
    @ModifyConstant(method = "postProcess", constant = @Constant(floatValue = 0.9F))
    private float frameHasEyeOdds(float originalValue) {
        float newValue = 1.1F;
        return FracturedConfig.get.general.generate_eyes_in_frames ? originalValue : newValue;
    }
}