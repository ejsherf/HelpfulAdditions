package me.ej.ejessentials;

import me.ej.ejessentials.commands.*;
import me.ej.ejessentials.events.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class EJessentials extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
System.out.println("HelpfulAdditions by EJ is starting! Hey there friend!");
        getCommand("server").setExecutor(new ServerCMD());
        getCommand("plugininfo").setExecutor(new PluginInfo());
        getCommand("playerUUID").setExecutor(new UUIDcmd());
        getServer().getPluginManager().registerEvents(new JoinBed(),this);
        getServer().getPluginManager().registerEvents(new JoinMsg(),this);
        getServer().getPluginManager().registerEvents(new LeaveBed(),this);
        getServer().getPluginManager().registerEvents(new LeaveMsg(),this);
        getCommand("renderdistance").setExecutor(new RenderDistance());
        getCommand("online").setExecutor(new OnlinePlayers());
        getCommand("serverversion").setExecutor(new ServerVersionCMD());
        getServer().getPluginManager().registerEvents(new DeathMsg(),this);
        getServer().getPluginManager().registerEvents(new ItemDrop(),this);
        getServer().getPluginManager().registerEvents(new ItemPickup(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("HelpfulAdditions is shutting down. Have a good day!!!");
    }
}