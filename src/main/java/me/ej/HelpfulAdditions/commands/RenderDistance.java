package me.ej.HelpfulAdditions.commands;

import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RenderDistance implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            int viewDistance = (((Server) sender).getViewDistance());
            sender.sendMessage(ChatColor.GREEN + "Your Render Distance is " + ChatColor.GOLD + viewDistance);
        }
        return false;
    }}


