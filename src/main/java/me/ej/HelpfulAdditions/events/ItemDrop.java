package me.ej.HelpfulAdditions.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class ItemDrop implements Listener {

    @EventHandler
    void onItemDrop(PlayerDropItemEvent event){
        Player player = event.getPlayer();
        Item item = event.getItemDrop();
        player.sendMessage(ChatColor.BOLD + "You dropped an item! The item you dropped was" + item);
    }}

