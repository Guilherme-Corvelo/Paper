package com.destroystokyo.paper.event.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityKnockbackByEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class KnockbackEventTest extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Register the event listener when the plugin is enabled
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onKnockback(EntityKnockbackByEntityEvent event) {
        // Broadcast a debug message every time the event is triggered
        getServer().broadcastMessage("Entity got hit,EntityKnockbackByEntityEvent got triggered\n");
    }
}