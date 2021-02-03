package de.nerotvlive.owncorelite.api;

import org.bukkit.Sound;

public class SoundAPI {

    //OWNCORELITE VERSION: BETA 1.0.0
    //AUTHOR: NEROTVLIVE

    public static Sound resolveSound(String soundname) {
        ServerAPI.sendDebugMessage("Trying to resolve sound from soundname "+soundname+"...");
        if(ServerAPI.isLegacy()) {
            return Sound.valueOf(LegacySound.valueOf(soundname).toString().toUpperCase());
        } else {
            return Sound.valueOf(de.nerotvlive.owncorelite.api.Sound.valueOf(soundname).toString().toUpperCase());
        }
    }

    public static Sound popSound() {
        ServerAPI.sendDebugMessage("Trying to play \"pop\"-Sound...");
        if(ServerAPI.isLegacy()) {
            return Sound.valueOf(LegacySound.CHICKEN_EGG_POP.toString());
        } else {
            return Sound.valueOf(de.nerotvlive.owncorelite.api.Sound.ENTITY_CHICKEN_EGG.toString());
        }
    }

    public static Sound getLegacySound(LegacySound legacySound) {
        ServerAPI.sendDebugMessage("Trying to get legacySound...");
        return Sound.valueOf(legacySound.toString());
    }

    public static Sound getSound(de.nerotvlive.owncorelite.api.Sound Sound) {
        ServerAPI.sendDebugMessage("Trying to get sound...");
        return org.bukkit.Sound.valueOf(Sound.toString());
    }
}