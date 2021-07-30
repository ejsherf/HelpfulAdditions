package me.ej.HelpfulAdditions;

import me.ej.HelpfulAdditions.commands.*;
import me.ej.HelpfulAdditions.events.*;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class EJessentials extends JavaPlugin {
    FileConfiguration config = this.getConfig();
    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("HelpfulAdditions by EJ is starting! Hey there friend!");
        this.saveDefaultConfig();
        this.getConfig();
        config.addDefault("DeathMsg", toString());
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
        getServer().getPluginManager().registerEvents(new ItemDrop(),this);
        getServer().getPluginManager().registerEvents(new ItemPickup(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("HelpfulAdditions is shutting down. Have a good day!!!");
    }
}
