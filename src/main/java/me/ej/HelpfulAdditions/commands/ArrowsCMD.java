package me.ej.HelpfulAdditions.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class ArrowsCMD implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            int arrows = ((Player) sender).getArrowsInBody();
            sender.sendMessage(ChatColor.GREEN + "OUCH!!! You have, " + ChatColor.GOLD + arrows + ChatColor.GREEN + " in your body!");
        }
        return true;}}
