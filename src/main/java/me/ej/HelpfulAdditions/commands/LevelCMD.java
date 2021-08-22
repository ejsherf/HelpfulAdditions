package me.ej.HelpfulAdditions.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LevelCMD implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            int level = ((Player) sender).getLevel();
            sender.sendMessage(ChatColor.GREEN + "Your level is " + ChatColor.GOLD + level);
        }
        return false;}}
