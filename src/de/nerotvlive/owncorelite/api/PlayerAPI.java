package de.nerotvlive.owncorelite.api;

import org.bukkit.entity.Player;

public class PlayerAPI {

    //OWNCORELITE VERSION: BETA 1.0.0
    //AUTHOR: NEROTVLIVE

    public static void savePlayerFile(Player player) {
        ServerAPI.sendDebugMessage("Trying to save playerconfig of "+player.getUniqueId()+" ("+player.getName()+")");
        ConfigAPI.saveConfig(ConfigAPI.PlayerCFG(player),ConfigAPI.PCFG(player));
        ConfigAPI.reloadConfig(ConfigAPI.PlayerCFG(player),ConfigAPI.PCFG(player));
    }

    public static void sendPlayerMessage(Player player,String message) {

    }
}