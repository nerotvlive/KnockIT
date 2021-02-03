package de.nerotvlive.knockit.listeners;

import de.nerotvlive.owncorelite.api.ConfigAPI;
import de.nerotvlive.owncorelite.api.ServerAPI;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class Quit implements Listener {

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        Player p = e.getPlayer();
        e.setQuitMessage(ServerAPI.formatMessage(ConfigAPI.MSG.getString("Messages.General.QuitMessage".replace("%player%",p.getName()))));
    }
}