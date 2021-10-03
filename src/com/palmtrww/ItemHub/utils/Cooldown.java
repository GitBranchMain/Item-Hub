package com.palmtrww.ItemHub.utils;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.entity.Player;

public class Cooldown {
	
	public static HashMap<UUID, Double> cooldowns;
	
	public static void setupCooldown() {
		
		cooldowns = new HashMap<>();
		
	}
	
	public static void setCooldown(Player p, int seconds) {
		
		double delay = System.currentTimeMillis() + (seconds * 1000);
		cooldowns.put(p.getUniqueId(), delay);
		
	}
	
	public static boolean checkCooldown(Player p) {
		if(!cooldowns.containsKey(p.getUniqueId()) || cooldowns.get(p.getUniqueId()) <= System.currentTimeMillis()) {
			return true;
		}
		return false;
	}

}
