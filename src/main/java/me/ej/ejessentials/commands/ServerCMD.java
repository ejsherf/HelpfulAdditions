package me.ej.ejessentials.commands;

import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ServerCMD implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Server server = (sender.getServer());
            sender.sendMessage(ChatColor.GREEN + "You are on " + ChatColor.GOLD + server);
        }
        return false;
    }}
