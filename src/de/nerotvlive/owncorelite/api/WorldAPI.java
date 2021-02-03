package de.nerotvlive.owncorelite.api;

import org.bukkit.Bukkit;
import org.bukkit.Difficulty;
import org.bukkit.World;
import org.bukkit.entity.Player;

public class WorldAPI {

    //OWNCORELITE VERSION: BETA 1.0.0
    //AUTHOR: NEROTVLIVE

    public static World getPlayerWorld(Player player) {
        ServerAPI.sendDebugMessage("Trying to get world of "+player.getUniqueId()+" ("+player.getName()+")");
        return player.getWorld();
    }

    public static String getPlayerWorldName(Player player) {
        ServerAPI.sendDebugMessage("Trying to get worldname of "+player.getUniqueId()+" ("+player.getName()+")");
        return getPlayerWorld(player).getName();
    }

    public static World getWorld(String worldname) {
        ServerAPI.sendDebugMessage("Trying to get world from string "+worldname);
        if(Bukkit.getWorld(worldname) == null) { return null; } else {
            return Bukkit.getWorld(worldname);
        }
    }
    public static void setTime(Integer time, World world) {
        ServerAPI.sendDebugMessage("Trying to set the time of world "+world.getName());
        long t = time.longValue();
        world.setTime(t);
    }

    public static void setTime(Integer time, String worldname) {
        ServerAPI.sendDebugMessage("Trying to set the time of world "+worldname);
        if(Bukkit.getWorld(worldname) != null) {
            World world = Bukkit.getWorld(worldname);
            long t = time.longValue();
            world.setTime(t);
        }
    }

    public static void addTime(Integer time, World world) {
        ServerAPI.sendDebugMessage("Trying to change the time of world "+world.getName());
        long t = world.getTime()+time.longValue();
        world.setTime(t);
    }

    public static void addTime(Integer time, String worldname) {
        ServerAPI.sendDebugMessage("Trying to change the time of world "+worldname);
        if(Bukkit.getWorld(worldname) != null) {
            World world = Bukkit.getWorld(worldname);
            long t = world.getTime()+time.longValue();
            world.setTime(t);
        }
    }

    public static void removeTime(Integer time, World world) {
        ServerAPI.sendDebugMessage("Trying to change the time of world "+world.getName());
        long t = world.getTime()-time.longValue();
        world.setTime(t);
    }

    public static void removeTime(Integer time, String worldname) {
        ServerAPI.sendDebugMessage("Trying to change the time of world "+worldname);
        if(Bukkit.getWorld(worldname) != null) {
            World world = Bukkit.getWorld(worldname);
            long t = world.getTime()-time.longValue();
            world.setTime(t);
        }
    }

    public static void setSun(World world) {
        ServerAPI.sendDebugMessage("Trying to change the weather of world "+world.getName());
        world.setThundering(false);
        world.setStorm(false);
    }

    public static void setSun(String worldname) {
        ServerAPI.sendDebugMessage("Trying to change the weather of world "+worldname);
        if(Bukkit.getWorld(worldname) != null) {
            World world = Bukkit.getWorld(worldname);
            world.setThundering(false);
            world.setStorm(true);
        }
    }

    public static void setRain(World world) {
        ServerAPI.sendDebugMessage("Trying to change the weather of world "+world.getName());
        world.setThundering(false);
        world.setStorm(true);
    }

    public static void setRain(String worldname) {
        ServerAPI.sendDebugMessage("Trying to change the weather of world "+worldname);
        if(Bukkit.getWorld(worldname) != null) {
            World world = Bukkit.getWorld(worldname);
            world.setThundering(false);
            world.setStorm(true);
        }
    }

    public static void setStorm(World world) {
        ServerAPI.sendDebugMessage("Trying to change the weather of world "+world.getName());
        world.setStorm(true);
        world.setThundering(true);
    }

    public static void setStorm(String worldname) {
        ServerAPI.sendDebugMessage("Trying to change the weather of world "+worldname);
        if(Bukkit.getWorld(worldname) != null) {
            World world = Bukkit.getWorld(worldname);
            world.setStorm(true);
            world.setThundering(true);
        }
    }

    public static void setDifficulty(World world, Difficulty difficulty) {
        ServerAPI.sendDebugMessage("Trying to change the difficulty of world "+world.getName());
        world.setDifficulty(difficulty);
    }

    public static void setDifficulty(World world, String difficultyname) {
        ServerAPI.sendDebugMessage("Trying to change the difficulty (with string) of world "+world.getName());
        Difficulty diff = resolveDifficulty(difficultyname);
        world.setDifficulty(diff);
    }

    public static void setDifficulty(String worldname, Difficulty difficulty) {
        ServerAPI.sendDebugMessage("Trying to change the difficulty of world (from string) "+worldname);
        World world = Bukkit.getServer().getWorld(worldname);
        if(world != null)  {
            world.setDifficulty(difficulty);
        }
    }

    public static void setDifficulty(String worldname, String difficultyname) {
        ServerAPI.sendDebugMessage("Trying to change the difficulty (with string) of world (from string) "+worldname);
        Difficulty diff = resolveDifficulty(difficultyname);
        World world = Bukkit.getServer().getWorld(worldname);
        if(world != null)  {
            world.setDifficulty(diff);
        }
    }

    public static Difficulty resolveDifficulty(String difficulty) {
        if(difficulty.equalsIgnoreCase("peaceful")) {
            return Difficulty.PEACEFUL;
        } else if(difficulty.equalsIgnoreCase("peacefull")) {
            return Difficulty.PEACEFUL;
        } else if(difficulty.equalsIgnoreCase("0")) {
            return Difficulty.PEACEFUL;
        } else if(difficulty.equalsIgnoreCase("easy")) {
            return Difficulty.EASY;
        } else if(difficulty.equalsIgnoreCase("1")) {
            return Difficulty.EASY;
        } else if(difficulty.equalsIgnoreCase("normal")) {
            return Difficulty.NORMAL;
        } else if(difficulty.equalsIgnoreCase("2")) {
            return Difficulty.NORMAL;
        } else if(difficulty.equalsIgnoreCase("hard")) {
            return Difficulty.HARD;
        } else if(difficulty.equalsIgnoreCase("3")) {
            return Difficulty.HARD;
        } else {
            return null;
        }
    }
}