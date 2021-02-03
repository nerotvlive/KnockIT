package de.nerotvlive.owncorelite.api;

import de.nerotvlive.knockit.Main;
import org.bukkit.Bukkit;

public class ServerAPI {

    public static void sendConsoleMessage(String message) {
        Bukkit.getServer().getConsoleSender().sendMessage(Main.Prefix+message.replace("&","§"));
    }

    public static void sendDebugMessage(String message) {
        if(ConfigAPI.CFG.getBoolean("Settings.Console.doDebug")) {
            Bukkit.getServer().getConsoleSender().sendMessage(Main.Prefix + "§c§lDEBUG §r§8| §f" + message.replace("&", "§"));
        }
    }
}