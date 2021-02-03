package de.nerotvlive.knockit;

import de.nerotvlive.knockit.utils.API;
import de.nerotvlive.knockit.utils.MySQL;
import de.nerotvlive.owncorelite.api.ConfigAPI;
import de.nerotvlive.owncorelite.api.ServerAPI;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static String Prefix = "§9KnockIT §8| §7";

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
            MySQL.disconnect();
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
    }

    void initMySQL() {
        ServerAPI.sendConsoleMessage("Trying to connect to the MySQL database...");
        MySQL.connect();
    }
}