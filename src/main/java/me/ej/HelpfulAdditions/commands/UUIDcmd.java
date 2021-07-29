package me.ej.HelpfulAdditions.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.UUID;

public class UUIDcmd implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            UUID uniqueId = (((Player) sender).getUniqueId());
            sender.sendMessage(ChatColor.GREEN + "Your UUID is " + ChatColor.GOLD + uniqueId);
        }
        return false;
    }}