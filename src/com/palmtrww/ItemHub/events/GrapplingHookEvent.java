package com.palmtrww.ItemHub.events;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.palmtrww.ItemHub.utils.Cooldown;

public class GrapplingHookEvent implements Listener{
	
	@EventHandler
	public void onFish(PlayerFishEvent e) {
		
		Player p = e.getPlayer();
		
		ItemStack item = p.getInventory().getItemInHand();
		ItemMeta meta = item.getItemMeta();
		String name = meta.getDisplayName();
		if(name.equals(ChatColor.translateAlternateColorCodes('&', "&a&lGrappling Hook"))) {
			
			if(e.getState().equals(PlayerFishEvent.State.FAILED_ATTEMPT)) {
				if(Cooldown.checkCooldown(e.getPlayer())) {
					Location l = p.getLocation();
					Location hl = e.getHook().getLocation();
					Location change = hl.subtract(l);
					p.setVelocity(change.toVector().multiply(0.3));
					Cooldown.setCooldown(e.getPlayer(), 5);
				} else {
					p.sendMessage(ChatColor.RED + "Item Ability isn't ready!");
				}
			}
			
		}
		
	}

}
