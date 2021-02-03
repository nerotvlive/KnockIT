package de.nerotvlive.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class SetSpawn implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("setspawn")) {
            if(s.hasPermission("knockit.setspawn")) {
                //WILL BE ADDED IN 0.1.2
            }
        }
        return false;
    }
}