package me.ej.ejessentials.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathMsg implements Listener {
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event){
        Player player = event.getEntity();
        if (player.getType().equals(EntityType.PLAYER)){
            event.setDeathMessage(ChatColor.GOLD + "Oops! Looks like " + ChatColor.BLUE + player.getName() + ChatColor.GOLD + " died. They were doing " + ChatColor.BLUE + player.getLastDamageCause() + ChatColor.GOLD + ".");
        }
    }
}

