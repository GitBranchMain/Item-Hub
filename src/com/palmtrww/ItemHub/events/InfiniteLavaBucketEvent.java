package com.palmtrww.ItemHub.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBucketEmptyEvent;

import com.palmtrww.ItemHub.utils.Cooldown;

public class InfiniteLavaBucketEvent implements Listener {

	@EventHandler
	public void onBucketEmpty(PlayerBucketEmptyEvent e) {
		
		int x = e.getBlockClicked().getX() + e.getBlockFace().getModX();
		int y = e.getBlockClicked().getY() + e.getBlockFace().getModY();
		int z = e.getBlockClicked().getZ() + e.getBlockFace().getModZ();
		
		if(e.getPlayer().getInventory().getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&4&lInfinite Lava"))) {
			if(Cooldown.checkCooldown(e.getPlayer())) {
				e.getPlayer().getWorld().getBlockAt(x, y, z).setType(Material.LAVA);
				e.setCancelled(true);
				Cooldown.setCooldown(e.getPlayer(), 2);
			} else {
				e.getPlayer().sendMessage(ChatColor.RED + "Item Ability isn't ready!");
			}
		}
		
	}
	
}
