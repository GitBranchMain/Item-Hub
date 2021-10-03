package com.palmtrww.ItemHub.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.palmtrww.ItemHub.items.ItemManager;

public class PlayerJoin implements Listener{
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player p = (Player) e.getPlayer();
		
		if(p.isOp()) {
			p.getInventory().addItem(ItemManager.grapplingHook);
			p.getInventory().addItem(ItemManager.explosiveBow);
			p.getInventory().addItem(ItemManager.infinteLava);
			p.getInventory().addItem(ItemManager.infinteWater);
			p.getInventory().addItem(ItemManager.machineBow);
		} 
	}

}
