package me.ej.HelpfulAdditions;

import me.ej.HelpfulAdditions.commands.*;
import me.ej.HelpfulAdditions.events.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class EJessentials extends JavaPlugin {
    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("HelpfulAdditions by EJ is starting! Hey there friend!");
        getCommand("plugininfo").setExecutor(new PluginInfo());
        getCommand("playerUUID").setExecutor(new UUIDcmd());
        getServer().getPluginManager().registerEvents(new JoinBed(),this);
        getServer().getPluginManager().registerEvents(new JoinMsg(),this);
        getServer().getPluginManager().registerEvents(new LeaveBed(),this);
        getServer().getPluginManager().registerEvents(new LeaveMsg(),this);
        getServer().getPluginManager().registerEvents(new ItemDrop(),this);
        getServer().getPluginManager().registerEvents(new ItemPickup(),this);
        getCommand("currentlevel").setExecutor(new LevelCMD());
        getCommand("viewdistance").setExecutor(new ViewDistanceCMD());
        getCommand("arrows").setExecutor(new ArrowsCMD());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("HelpfulAdditions is shutting down. Have a good day!!!");
    }
}
