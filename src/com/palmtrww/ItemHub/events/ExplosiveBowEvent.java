package com.palmtrww.ItemHub.events;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.palmtrww.ItemHub.utils.Cooldown;

public class ExplosiveBowEvent implements Listener {

	@EventHandler
	public void onProjectileHit(ProjectileHitEvent e) {
		
		Arrow a = (Arrow) e.getEntity();
		Player p = (Player) a.getShooter();
		
		ItemStack i = p.getInventory().getItemInHand();
		ItemMeta m = i.getItemMeta();
		String name = m.getDisplayName();
		if(name.equals(ChatColor.translateAlternateColorCodes('&', "&4&lExplosive &f&lBow"))) {
			if(Cooldown.checkCooldown((Player) a.getShooter())) {
				Location al = a.getLocation();
				World w = p.getWorld();
				w.createExplosion(al, 100, false);
				w.playSound(al, Sound.EXPLODE, 1, 1);
				Cooldown.setCooldown((Player) a.getShooter(), 5);
			} else {
				p.sendMessage(ChatColor.RED + "Item Ability isn't ready!");
			}
			
		} 
		
	}
	
}
