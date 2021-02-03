package de.nerotvlive.knockit.utils;

import de.nerotvlive.owncorelite.api.ConfigAPI;
import de.nerotvlive.owncorelite.api.ServerAPI;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class API {

    //
    public static String MBPlayer = ServerAPI.formatMessage(ConfigAPI.MSG.getString("Messages.General.ConsolePlayerError"));

    //AUTO FORMATTED NO PERMS STRING
    public static String NoPerms = ServerAPI.formatMessage(ConfigAPI.MSG.getString("Messages.General.NoPermissions"));

    //TO CHECK IF MYSQL IS ENABLED
    public static Boolean enableMySQL() {
        ServerAPI.sendDebugMessage("Checking if MySQL is enabled...");
        ConfigAPI.reloadConfig(ConfigAPI.Config,ConfigAPI.CFG);
        if(ConfigAPI.CFG.getBoolean("Settings.MySQL.enable")) {
            ServerAPI.sendDebugMessage("MySQL is enabled!");
            return true;
        } else {
            ServerAPI.sendDebugMessage("MySQL is disabled!");
            return false;
        }
    }

    public static void sendPlayerMessage(Player player, String message, Sound sound) {
        if(ConfigAPI.CFG.getBoolean("")) {

        }
    }
}
