package app.revanced.patches.sleepasandroid.misc.premium

import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.patch.bytecodePatch

@Suppress("unused")
val unlockPremiumPatch = bytecodePatch(
    name = "unlock-premium",
) {
    compatibleWith("com.urbandroid.sleep")

    execute {
        isTrialFingerprint.method.addInstructions(
            0,
            """
                const/4 v0, 0x0
                return v0
            """
        )
    }
}
