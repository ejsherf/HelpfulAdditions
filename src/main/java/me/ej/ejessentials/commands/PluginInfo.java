package me.ej.ejessentials.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class PluginInfo implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player || sender instanceof ConsoleCommandSender) {
            if (sender.hasPermission("helpfuladdititons.plugininfo")) {
                sender.sendMessage(ChatColor.GOLD + "HelpfulAdditions is a plugin that has a few nice things to have on your server. Developer: EJ. ");
            } else {
                sender.sendMessage(ChatColor.RED+"Looks like you don't have the permission to run this. This is a mistake. Contact your server administrator.");
            }
        }
        return false;}}
