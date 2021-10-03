package com.palmtrww.ItemHub;


import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import com.palmtrww.ItemHub.commands.ExplosiveBowCommand;
import com.palmtrww.ItemHub.commands.GrapplingHookCommand;
import com.palmtrww.ItemHub.commands.InfiniteLavaBucketCommand;
import com.palmtrww.ItemHub.commands.InfiniteWaterBucketCommand;
import com.palmtrww.ItemHub.commands.MachineBowCommand;
import com.palmtrww.ItemHub.events.ExplosiveBowEvent;
import com.palmtrww.ItemHub.events.GrapplingHookEvent;
import com.palmtrww.ItemHub.events.InfiniteLavaBucketEvent;
import com.palmtrww.ItemHub.events.InfiniteWaterBucketEvent;
import com.palmtrww.ItemHub.events.MachineBowEvent;
import com.palmtrww.ItemHub.events.PlayerJoin;
import com.palmtrww.ItemHub.items.ItemManager;
import com.palmtrww.ItemHub.utils.Cooldown;

public class ItemHub extends JavaPlugin {
	
	public static String prefix = ChatColor.translateAlternateColorCodes('&', "&6Item&fHub &7>> ");
	
	@Override
	public void onEnable() {
		
		ItemManager.register();
		Cooldown.setupCooldown();
		
		getCommand("grapplinghook").setExecutor(new GrapplingHookCommand());
		getCommand("explosivebow").setExecutor(new ExplosiveBowCommand());
		getCommand("infinitewater").setExecutor(new InfiniteWaterBucketCommand());
		getCommand("infinitelava").setExecutor(new InfiniteLavaBucketCommand());
		getCommand("machinebow").setExecutor(new MachineBowCommand());
		getServer().getPluginManager().registerEvents(new GrapplingHookEvent(), this);
		getServer().getPluginManager().registerEvents(new ExplosiveBowEvent(), this);
		getServer().getPluginManager().registerEvents(new InfiniteLavaBucketEvent(), this);
		getServer().getPluginManager().registerEvents(new InfiniteWaterBucketEvent(), this);
		getServer().getPluginManager().registerEvents(new MachineBowEvent(this), this);
		getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
		
	}

}
