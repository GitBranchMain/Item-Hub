package com.palmtrww.ItemHub.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.palmtrww.ItemHub.ItemHub;
import com.palmtrww.ItemHub.items.ItemManager;

public class InfiniteWaterBucketCommand implements CommandExecutor{
	
	// Gives a player the Infinite Water Bucket
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(sender instanceof Player) {
			
			Player p = (Player) sender;
			
			if(p.hasPermission("itemhub.infWater")) {
				
				p.getInventory().addItem(ItemManager.infinteWater);
				p.sendMessage(ItemHub.prefix + ChatColor.translateAlternateColorCodes('&', "&bYou now own a infinite water bucket"));
				
			} else {
				p.sendMessage(ChatColor.RED + "You don't have the permissions to execute this command. Needed permission: itemhub.infWater");
			}
			
		} else {
			sender.sendMessage(ChatColor.RED + "Only players are allowed to execute this command!");
		}
		
		return true;
	}
	
	

}
