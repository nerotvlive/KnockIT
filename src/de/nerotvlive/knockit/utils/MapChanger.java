package de.nerotvlive.knockit.utils;

import de.nerotvlive.knockit.Main;
import org.bukkit.scheduler.BukkitRunnable;

public class MapChanger {

    private static Main MAIN;
    public MapChanger(final Main main) {
        this.MAIN = main;
    }

    public static void MapTimer(int seconds) {
        int time = seconds*20;
        new BukkitRunnable() {
            public void run() {
                changeMap();
            }
        }.runTaskTimer(MAIN, 0, time);
    }

    public static void changeMap() {
        //-
    }
}