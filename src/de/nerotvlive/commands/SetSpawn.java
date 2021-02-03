package de.nerotvlive.commands;

import de.nerotvlive.knockit.utils.API;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetSpawn implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("setspawn")) {
            if(s.hasPermission("knockit.setspawn")) {
                if(!(s instanceof Player)) {
                    s.sendMessage(API.MBPlayer);
                } else {
                    Player p = (Player)s;
                    if(args.length == 0) {

                    } else {

                    }
                }
            }
        }
        return false;
    }
}