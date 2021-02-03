package de.nerotvlive.owncorelite.api;

import de.nerotvlive.knockit.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class ServerAPI {

    //OWNCORELITE VERSION: BETA 1.0.0
    //AUTHOR: NEROTVLIVE

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

    public static int getServerVersion() {
        if(Bukkit.getVersion().contains("1.0")) {
            return 100;
        } else if(Bukkit.getVersion().contains("1.1")) {
            return 101;
        } else if(Bukkit.getVersion().contains("1.2")) {
            return 102;
        } else if(Bukkit.getVersion().contains("1.3")) {
            return 103;
        } else if(Bukkit.getVersion().contains("1.4")) {
            return 104;
        } else if(Bukkit.getVersion().contains("1.5")) {
            return 105;
        } else if(Bukkit.getVersion().contains("1.6")) {
            return 106;
        } else if(Bukkit.getVersion().contains("1.7")) {
            return 107;
        } else if(Bukkit.getVersion().contains("1.8")) {
            return 108;
        } else if(Bukkit.getVersion().contains("1.9")) {
            return 109;
        } else if(Bukkit.getVersion().contains("1.10")) {
            return 110;
        } else if(Bukkit.getVersion().contains("1.11")) {
            return 111;
        } else if(Bukkit.getVersion().contains("1.12")) {
            return 112;
        } else if(Bukkit.getVersion().contains("1.13")) {
            return 113;
        } else if(Bukkit.getVersion().contains("1.14")) {
            return 114;
        } else if(Bukkit.getVersion().contains("1.15")) {
            return 115;
        } else if(Bukkit.getVersion().contains("1.16")) {
            return 116;
        } else {
            return 117;
        }
    }

    public static Boolean isLegacy() {
        if(getServerVersion() < 112) {
            return true;
        } else {
            return false;
        }
    }
}