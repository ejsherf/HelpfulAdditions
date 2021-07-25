package me.ej.ejessentials.commands;

import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ServerVersionCMD implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            String version = (((Server) sender).getVersion());
            sender.sendMessage(ChatColor.GREEN + "The version of this server is " + ChatColor.GOLD + version);
        }
        return false;
    }}

