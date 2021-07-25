package me.ej.ejessentials.commands;

import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Collection;

public class OnlinePlayers implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Collection<? extends Player> onlinePlayers = (((Server) sender).getOnlinePlayers());
            sender.sendMessage(ChatColor.GREEN + "People online: " + ChatColor.GOLD + onlinePlayers);
        }
        return false;
    }}

