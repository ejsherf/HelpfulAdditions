package me.ej.ejessentials.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class LeaveMsg implements Listener {

    @EventHandler
    void onPlayerQuit(PlayerQuitEvent event){
        Player player = event.getPlayer();
        event.setQuitMessage(ChatColor.GOLD + "Thanks for visiting us today, " + ChatColor.BLUE + player.getDisplayName() + ChatColor.GOLD + "! See you next time :D");
    }}

