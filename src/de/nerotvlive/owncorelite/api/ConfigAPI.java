package de.nerotvlive.owncorelite.api;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import java.io.File;
import java.io.IOException;

public class ConfigAPI {

    public static File Config = new File("plugins/KnockIT/config.yml");
    public static YamlConfiguration CFG = YamlConfiguration.loadConfiguration(Config);

    public static File Messages = new File("plugins/KnockIT/messages.yml");
    public static YamlConfiguration MSG = YamlConfiguration.loadConfiguration(Messages);

    public static File PlayerCFG(Player player) {
        ServerAPI.sendDebugMessage("Creating/Getting userfile of "+player.getUniqueId()+" ("+player.getName()+") 1/2");
        return new File("plugins/KnockIT/users/"+player.getUniqueId()+".yml");
    }
    public static YamlConfiguration PCFG(Player player) {
        ServerAPI.sendDebugMessage("Creating/Getting userfile of "+player.getUniqueId()+" ("+player.getName()+") 2/2");
        return YamlConfiguration.loadConfiguration(PlayerCFG(player));
    }

    public static void checkEntry(String path,String content, File file, YamlConfiguration cfg) {
        reloadConfig(file,cfg);
        if(!(file.exists())) {
            cfg.set(path, content);
            saveConfig(file,cfg);
        } else {
            if(!(cfg.contains(path))) {
                cfg.set(path, content);
                saveConfig(file,cfg);
            }
        }
    }

    public static void checkEntry(String path, Boolean state, File file, YamlConfiguration cfg) {
        reloadConfig(file,cfg);
        if(!(file.exists())) {
            cfg.set(path, state);
            saveConfig(file,cfg);
        } else {
            if(!(cfg.contains(path))) {
                cfg.set(path, state);
                saveConfig(file,cfg);
            }
        }
    }

    public static void saveConfig(final File file, final YamlConfiguration cfg) {
        try {
            cfg.save(file);
        }
        catch (IOException ef) {
            ef.printStackTrace();
        }
        reloadConfig(file, cfg);
    }

    public static void reloadConfig(final File file, YamlConfiguration cfg) {
        cfg = YamlConfiguration.loadConfiguration(file);
    }
}