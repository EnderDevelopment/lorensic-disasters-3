package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Lorensic Natural Disasters plugin enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Lorensic Natural Disasters plugin disabled!");
    }
}