package de.nerotvlive.owncorelite.api;

import org.bukkit.Warning;
import org.bukkit.entity.Player;

public class PlayerAPI {

    //OWNCORELITE VERSION: BETA 1.0.0
    //AUTHOR: NEROTVLIVE

    public static void savePlayerFile(Player player) {
        ServerAPI.sendDebugMessage("Trying to save playerconfig of "+player.getUniqueId()+" ("+player.getName()+")...");
        ConfigAPI.saveConfig(ConfigAPI.PlayerCFG(player),ConfigAPI.PCFG(player));
        ConfigAPI.reloadConfig(ConfigAPI.PlayerCFG(player),ConfigAPI.PCFG(player));
    }

    public static void sendPlayerMessage(Player player,String message) {
        ServerAPI.sendDebugMessage("Trying to send formatted message to player "+player.getUniqueId()+" ("+player.getName()+")...");
        player.sendMessage(ServerAPI.formatMessage(message));
    }

    public static void sendPlayerMessage(Player player,String message,LegacySound sound) {
        ServerAPI.sendDebugMessage("Trying to send formatted message to player "+player.getUniqueId()+" ("+player.getName()+") with legacySound...");
        player.playSound(player.getLocation(),org.bukkit.Sound.valueOf(sound.toString()),100,100);
        player.sendMessage(ServerAPI.formatMessage(message));
    }

    public static void sendPlayerMessage(Player player,String message,Sound sound) {
        ServerAPI.sendDebugMessage("Trying to send formatted message to player "+player.getUniqueId()+" ("+player.getName()+") with sound...");
        player.playSound(player.getLocation(),org.bukkit.Sound.valueOf(sound.toString()),100,100);
        player.sendMessage(ServerAPI.formatMessage(message));
    }

    @Warning
    public static void sendPlayerMessage(Player player,String message,String soundname) {
        ServerAPI.sendDebugMessage("Trying to send formatted message to player "+player.getUniqueId()+" ("+player.getName()+") with sound from string...");
        player.playSound(player.getLocation(),org.bukkit.Sound.valueOf(soundname),100,100);
        player.sendMessage(ServerAPI.formatMessage(message));
    }

    public static void playSound(Player player, Sound sound) {
        ServerAPI.sendDebugMessage("Trying to play sound to player "+player.getUniqueId()+" ("+player.getName()+")...");
        player.playSound(player.getLocation(),org.bukkit.Sound.valueOf(sound.toString()),100,100);
    }

    public static void playLegacySound(Player player, LegacySound sound) {
        ServerAPI.sendDebugMessage("Trying to play legacySound to player "+player.getUniqueId()+" ("+player.getName()+")...");
        player.playSound(player.getLocation(),org.bukkit.Sound.valueOf(sound.toString()),100,100);
    }

    @Warning
    public static void playSound(Player player, String soundname) {
        ServerAPI.sendDebugMessage("Trying to play sound from string to player "+player.getUniqueId()+" ("+player.getName()+")...");
        player.playSound(player.getLocation(),org.bukkit.Sound.valueOf(soundname),100,100);
    }
}