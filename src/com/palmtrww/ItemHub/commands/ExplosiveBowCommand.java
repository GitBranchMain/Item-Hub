package com.palmtrww.ItemHub.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.palmtrww.ItemHub.ItemHub;
import com.palmtrww.ItemHub.items.ItemManager;

public class ExplosiveBowCommand implements CommandExecutor{
	
	// Gives a player the explosive bow
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(sender instanceof Player) {
			
			Player p = (Player) sender;
			
			if(p.hasPermission("itemhub.explosiveBow")) {
				
				p.getInventory().addItem(ItemManager.explosiveBow);
				p.sendMessage(ItemHub.prefix + ChatColor.translateAlternateColorCodes('&', "&bYou now own a explosive bow!"));
				
			} else {
				p.sendMessage("You don't have the permissions to execute this command. Needed perrmisions: itemhub.explosiveBow");
			}
			
		} else {
			sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4Only players can execute this command"));
		}
		
		return true;
	}
	
	

}
