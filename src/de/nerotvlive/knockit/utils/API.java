package de.nerotvlive.knockit.utils;

import de.nerotvlive.owncorelite.api.ConfigAPI;
import de.nerotvlive.owncorelite.api.ServerAPI;

public class API {

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
}
