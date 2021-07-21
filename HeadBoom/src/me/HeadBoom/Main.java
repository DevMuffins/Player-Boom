package me.HeadBoom;

import me.HeadBoom.Hello.HelloCMD;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().info("HeadBoom Enabled!");
        this.getCommand("Hello").setExecutor((CommandExecutor)new HelloCMD());

    }

    @Override
    public void onDisable() {
        getLogger().info("HeadBoom Disabled!");

    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        event.setJoinMessage(ChatColor.translateAlternateColorCodes('&', "&c&lBE CAREFUL WITH YOUR WORDS!"));
    }
}


