package de.nerotvlive.knockit.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import de.nerotvlive.owncorelite.api.ConfigAPI;
import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;

public class MySQL {

    //MYSQL CLASS FROM VERSION 0.1.1 / 03.02.2021
    //AUTHOR: NEROTVLIVE

    public static String host = ConfigAPI.CFG.getString("Settings.MySQL.Host");
    public static String port = ConfigAPI.CFG.getString("Settings.MySQL.Port");
    public static String database = ConfigAPI.CFG.getString("Settings.MySQL.Database");
    public static String username = ConfigAPI.CFG.getString("Settings.MySQL.Username");
    public static String password = ConfigAPI.CFG.getString("Settings.MySQL.Password");
    public static Connection con;

    static ConsoleCommandSender console = Bukkit.getConsoleSender();

    public static void connect() {
        if (!isConnected()) {
            try {
                con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + database, username, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void disconnect() {
        if (isConnected()) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static boolean isConnected() {
        return (con == null ? false : true);
    }

    public static Connection getConnection() {
        return con;
    }
}