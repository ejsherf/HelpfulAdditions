package me.ej.HelpfulAdditions.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class PluginInfo implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player || sender instanceof ConsoleCommandSender){
                sender.sendMessage(ChatColor.GOLD + "HelpfulAdditions is a plugin that has a few nice things to have on your server. Developer: EJ.");
            }
        return true;
    }


    }
