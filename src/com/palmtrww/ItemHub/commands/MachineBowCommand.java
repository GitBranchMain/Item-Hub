package com.palmtrww.ItemHub.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.palmtrww.ItemHub.ItemHub;
import com.palmtrww.ItemHub.items.ItemManager;

public class MachineBowCommand implements CommandExecutor{
	
	// Gives a player the machine bow
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(sender instanceof Player) {
			
			Player p = (Player) sender;
			
			if(p.hasPermission("itemhub.machineBow")) {
				
				p.getInventory().addItem(ItemManager.machineBow);
				p.sendMessage(ItemHub.prefix + ChatColor.translateAlternateColorCodes('&', "&bYou now own a machine bow!"));
				
			} else {
				p.sendMessage("You don't have the permissions to execute this command. Needed perrmisions: itemhub.machineBow");
			}
			
		} else {
			sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4Only players can execute this command"));
		}
		
		return true;
	}
	
	

}

