package me.HeadBoom.Hello;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelloCMD implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        if (sender instanceof Player) {
            player.setHealth(0);
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lBOOOOOOOOOOOOOOM!"));
        }
        else {
            sender.sendMessage("Console cannot execute this command!");
        }
        return true;
    }
}