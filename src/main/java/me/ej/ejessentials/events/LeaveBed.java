package me.ej.ejessentials.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;

public class LeaveBed implements Listener {

    @EventHandler
    void onLeaveBed(PlayerBedLeaveEvent event){
        Player player = event.getPlayer();
        player.sendMessage("Looks like you exited a bed! Have a nice day :)");
    }}

