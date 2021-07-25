package me.ej.ejessentials.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

public class RespawnMsg implements Listener {

    @EventHandler
    void onRespawn(PlayerRespawnEvent event){
        Player player = event.getPlayer();
        player.sendMessage(ChatColor.BOLD + "Poof! You respawned!");
    }}
