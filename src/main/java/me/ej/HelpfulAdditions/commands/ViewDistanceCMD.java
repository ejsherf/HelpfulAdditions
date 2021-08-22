package me.ej.HelpfulAdditions.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class ViewDistanceCMD implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            int viewDistance = ((Player) sender).getClientViewDistance();
            sender.sendMessage(ChatColor.GREEN + "Your view distance is " + ChatColor.GOLD + viewDistance);
        }
        return false;}}