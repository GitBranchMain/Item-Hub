package com.palmtrww.ItemHub.events;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

import com.palmtrww.ItemHub.ItemHub;
import com.palmtrww.ItemHub.utils.Cooldown;

public class MachineBowEvent implements Listener{
	
	ItemHub plugin;
	public MachineBowEvent(ItemHub plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onClick(PlayerInteractEvent e) {
		
		if(e.getAction().equals(Action.LEFT_CLICK_AIR) || e.getAction().equals(Action.LEFT_CLICK_BLOCK)) {
			if(e.getPlayer().getInventory().getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&5&lMachine Bow"))) {
				if(Cooldown.checkCooldown(e.getPlayer())) {
				
					new BukkitRunnable() {
						
						int timer = 25;
						
						@Override
						public void run() {
							
							if(e.getPlayer().getInventory().containsAtLeast(new ItemStack(Material.ARROW), 1)) {
								Location eye = e.getPlayer().getEyeLocation();
								Location l = eye.add(eye.getDirection().multiply(1.2));
								Arrow a = (Arrow) l.getWorld().spawnEntity(l, EntityType.ARROW);
								a.setVelocity(l.getDirection().normalize().multiply(2));
								a.setShooter(e.getPlayer());
								e.getPlayer().getInventory().removeItem(new ItemStack(Material.ARROW));
								
							}
							timer--;
							if(timer == 0) {
								cancel();
							}
							
							
						}
					}.runTaskTimer(plugin, 0L, 4L);
					Cooldown.setCooldown(e.getPlayer(), 1);
				} else {
					e.getPlayer().sendMessage(ChatColor.RED + "Item Ability isn't ready!");
				}
				
			}
		}
		
	}

}
