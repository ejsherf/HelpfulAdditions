package me.ej.ejessentials.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class JoinBed implements Listener {

    @EventHandler
    void onEnterBed(PlayerBedEnterEvent event) {
        Player player = event.getPlayer();
        player.sendMessage(ChatColor.AQUA + "It was a hard day of Mining and Crafting. Sleep tight," + player.getDisplayName());
    }}