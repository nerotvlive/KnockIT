package de.nerotvlive.owncorelite.api;

import de.nerotvlive.knockit.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class ServerAPI {

    //OWNCORELITE VERSION: BETA 1.0.0

    public static void sendConsoleMessage(String message) {
        Bukkit.getServer().getConsoleSender().sendMessage(Main.ConsolePrefix+message.replace("&","§"));
    }

    public static void sendDebugMessage(String message) {
        if(ConfigAPI.CFG.getBoolean("Settings.Console.doDebug")) {
            Bukkit.getServer().getConsoleSender().sendMessage(Main.ConsolePrefix + "§c§lDEBUG §r§8| §f" + message.replace("&", "§"));
        }
    }

    public static void secureShutdown(String shutdownMessage) {
        for(Player all: Bukkit.getOnlinePlayers()) {
            all.kickPlayer(shutdownMessage);
        }
        Bukkit.shutdown();
    }

    public static String formatMessage(String message) {
        return message.replace("&","§");
    }
}