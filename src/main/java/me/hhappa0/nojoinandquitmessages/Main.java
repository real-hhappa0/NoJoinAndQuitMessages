package me.hhappa0.nojoinandquitmessages;

import me.hhappa0.nojoinandquitmessages.commands.AboutCommand;
import me.hhappa0.nojoinandquitmessages.listeners.ConnectionListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new ConnectionListener(), this);

        getCommand("about").setExecutor(new AboutCommand());

        getLogger().info("- Version v1.0 - Enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("- Disabled!");
    }
}
