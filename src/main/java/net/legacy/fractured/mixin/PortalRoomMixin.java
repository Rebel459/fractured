// Mixin credit: End Remastered
// This file is licensed under LGPL-3.0 Only
// https://modrinth.com/mod/endrem
// https://www.gnu.org/licenses/lgpl-3.0.en.html#license-text

package net.legacy.fractured.mixin;

import net.legacy.fractured.config.FracturedConfig;
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