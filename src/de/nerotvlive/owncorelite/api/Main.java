package de.nerotvlive.owncorelite.api;

public class Main {

    public static void initConfig() {
        ConfigAPI.checkEntry("Settings.Console.doDebug",false,ConfigAPI.Config,ConfigAPI.CFG);
        ConfigAPI.checkEntry("Settings.MySQL.enable",false,ConfigAPI.Config,ConfigAPI.CFG);
        ConfigAPI.checkEntry("Settings.MySQL.Host","localhost",ConfigAPI.Config,ConfigAPI.CFG);
        ConfigAPI.checkEntry("Settings.MySQL.Port","3306",ConfigAPI.Config,ConfigAPI.CFG);
        ConfigAPI.checkEntry("Settings.MySQL.Database","KnockIT",ConfigAPI.Config,ConfigAPI.CFG);
        ConfigAPI.checkEntry("Settings.MySQL.Username","username",ConfigAPI.Config,ConfigAPI.CFG);
        ConfigAPI.checkEntry("Settings.MySQL.Password","password",ConfigAPI.Config,ConfigAPI.CFG);
        ConfigAPI.checkEntry("Settings.MessageSounds.enable",false,ConfigAPI.Config,ConfigAPI.CFG);
    }
}