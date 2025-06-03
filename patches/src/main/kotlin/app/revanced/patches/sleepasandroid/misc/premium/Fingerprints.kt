package app.revanced.patches.sleepasandroid.misc.premium

import app.revanced.patcher.fingerprint

internal val isTrialFingerprint = fingerprint {
    returns("Z")
    custom { method, _ ->
        method.name == "isTrial"
    }
}
