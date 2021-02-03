package de.nerotvlive.owncorelite.api;

import org.bukkit.Sound;

public class SoundAPI {

    public static Sound resolveSound(String soundname) {
        if(ServerAPI.isLegacy()) {
            return Sound.valueOf(LegacySound.valueOf(soundname).toString().toUpperCase());
        } else {
            return Sound.valueOf(de.nerotvlive.owncorelite.api.Sound.valueOf(soundname).toString().toUpperCase());
        }
    }
}