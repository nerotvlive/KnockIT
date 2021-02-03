package de.nerotvlive.knockit;

import de.nerotvlive.knockit.utils.API;
import de.nerotvlive.knockit.utils.MySQL;
import de.nerotvlive.owncorelite.api.ConfigAPI;
import de.nerotvlive.owncorelite.api.ServerAPI;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static String ConsolePrefix = "§9KnockIT §8| §7";

    @Override
    public void onEnable() {
        initConfig();
        if(API.enableMySQL()) {
            initMySQL();
        }
    }

    @Override
    public void onDisable() {
        if(API.enableMySQL()) {
            ServerAPI.sendDebugMessage("Disconnecting from MySQL...");
            if(MySQL.isConnected()) {
                MySQL.disconnect();
            }
        }
    }

    void initConfig() {
        ServerAPI.sendConsoleMessage("Checking config files...");
        ConfigAPI.checkEntry("Settings.Console.doDebug",false,ConfigAPI.Config,ConfigAPI.CFG);
        ConfigAPI.checkEntry("Settings.MySQL.enable",false,ConfigAPI.Config,ConfigAPI.CFG);
        ConfigAPI.checkEntry("Settings.MySQL.Host","localhost",ConfigAPI.Config,ConfigAPI.CFG);
        ConfigAPI.checkEntry("Settings.MySQL.Port","3306",ConfigAPI.Config,ConfigAPI.CFG);
        ConfigAPI.checkEntry("Settings.MySQL.Database","KnockIT",ConfigAPI.Config,ConfigAPI.CFG);
        ConfigAPI.checkEntry("Settings.MySQL.Username","username",ConfigAPI.Config,ConfigAPI.CFG);
        ConfigAPI.checkEntry("Settings.MySQL.Password","password",ConfigAPI.Config,ConfigAPI.CFG);
        ConfigAPI.checkEntry("Messages.JoinMessage","&8>> &9%player% &7joined the server&8.",ConfigAPI.Messages,ConfigAPI.MSG);
        ConfigAPI.checkEntry("Messages.QuitMessage","&8>> &9%player% &7left the server&8.",ConfigAPI.Messages,ConfigAPI.MSG);
        ConfigAPI.checkEntry("Messages.NoPermissions","&8>> &cYou aren't allowed to do that&8.",ConfigAPI.Messages,ConfigAPI.MSG);
    }

    void initMySQL() {
        ServerAPI.sendConsoleMessage("Trying to connect to the MySQL database...");
        if(!(MySQL.isConnected())) {
            MySQL.connect();
        }
        ServerAPI.sendConsoleMessage("Successfully connected to the MySQL Database");
        if(MySQL.isConnected()) {
            MySQL.disconnect();
        }
    }
}