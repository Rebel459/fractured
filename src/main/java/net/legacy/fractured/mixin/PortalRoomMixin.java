// Mixin credit: End Remastered
// This file is licensed under LGPL-3.0 Only
// https://modrinth.com/mod/endrem
// https://www.gnu.org/licenses/lgpl-3.0.en.html#license-text

package net.legacy.fractured.mixin;

import net.legacy.fractured.FracturedConfig;
import net.minecraft.world.level.levelgen.structure.structures.StrongholdPieces;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(StrongholdPieces.PortalRoom.class)
public class PortalRoomMixin {
    @ModifyConstant(method = "postProcess", constant = @Constant(floatValue = 0.9F))
    private float frameHasEyeOdds(float originalValue) {

        //Game checks if a random number between 0.0 and 1.0 is greater than our value "odd", if true, add an eye to the frame.
        float newValue = 1.1F; //Set impossible value to reach
        return FracturedConfig.generate_eyes_in_frames ? originalValue : newValue;
    }
}