package me.ej.HelpfulAdditions.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPickupItemEvent;

@SuppressWarnings("deprecation")
public class ItemPickup implements Listener {

    @EventHandler
    void onItemPickup(PlayerPickupItemEvent event){
        Player player = event.getPlayer();
        Item item = event.getItem();
        player.sendMessage(ChatColor.BOLD + "You picked up an item! The item you received was" + item);
    }}


