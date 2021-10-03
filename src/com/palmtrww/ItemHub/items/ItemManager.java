package com.palmtrww.ItemHub.items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemManager {
	
	// Item instances
	public static ItemStack grapplingHook;
	public static ItemStack explosiveBow;
	public static ItemStack infinteWater;
	public static ItemStack infinteLava;
	public static ItemStack machineBow;
	
	
	// Adds all items to the game
	public static void register() {
		
		registerGrapplingHook();
		registerInfiniteLava();
		registerExplosiveBow();
		registerInfiniteWater();
		registerMachineBow();
		
	}
	
	// Registers the grappling hook
	private static void registerGrapplingHook() {
		
		ItemStack item = new ItemStack(Material.FISHING_ROD, 1);
		ItemMeta meta = item.getItemMeta();
		List<String> lore = new ArrayList<>();
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&a&lGrappling Hook"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&4Travel in style!"));
		lore.add("");
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&6Item Ability: &7&lGrapple"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&6Grapples you forward!"));
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&4&lItem has 5 second cooldown"));
		meta.setLore(lore);
		meta.addEnchant(Enchantment.DURABILITY, 100, false);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		grapplingHook = item;
		
	}
	
	// Registers the explosive bow
	private static void registerExplosiveBow() {
		
		ItemStack item = new ItemStack(Material.BOW, 1);
		ItemMeta meta = item.getItemMeta();
		List<String> lore = new ArrayList<String>();
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&4&lExplosive &f&lBow"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&6Makes a explosion"));
		lore.add("");
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&6Item Ability: &7&lBoom!"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&6Creates an explosion to impress your friends!"));
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&4&lItem has 5 second cooldown"));
		meta.setLore(lore);
		meta.addEnchant(Enchantment.DURABILITY, 100, false);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		explosiveBow = item;
		
	}
	
	// Registers the infinte water bucket
	private static void registerInfiniteWater() {
		
		ItemStack item = new ItemStack(Material.WATER_BUCKET, 1);
		ItemMeta meta = item.getItemMeta();
		List<String> lore = new ArrayList<>();
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&1&lInfinite Water"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&1Infinite Water Bucket!"));
		lore.add("");
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&6Item Ability: Never End"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&6Water bucket with Infinite water!"));
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&4&lItem has 2 second cooldown"));
		meta.setLore(lore);
		meta.addEnchant(Enchantment.DURABILITY, 100, false);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		infinteWater = item;
		
	}	
	
	// Registers the infinite lava bucket
	private static void registerInfiniteLava() {
		
		ItemStack item = new ItemStack(Material.LAVA_BUCKET, 1);
		ItemMeta meta = item.getItemMeta();
		List<String> lore = new ArrayList<>();
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&4&lInfinite Lava"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&4Infinite Lava Bucket!"));
		lore.add("");
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&6Item Ability: Never End"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&6Lava bucket with Infinite lava!"));
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&4&lItem has 2 second cooldown"));
		meta.setLore(lore);
		meta.addEnchant(Enchantment.DURABILITY, 100, false);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		infinteLava = item;
		
	}
	
	private static void registerMachineBow() {
		
		ItemStack item = new ItemStack(Material.BOW, 1);
		ItemMeta meta = item.getItemMeta();
		List<String> lore = new ArrayList<>();
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&5&lMachine Bow"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&4Machine Bow!"));
		lore.add("");
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&6Item Ability: Spray"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&6Spray arrows with this bow! LEFT CLICK"));
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&4&lItem has 1 second cooldown. 5 arrows per second"));
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&4&lMUST HAVE ARROWS IN INVENTORY"));
		meta.setLore(lore);
		meta.addEnchant(Enchantment.DURABILITY, 100, false);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		machineBow = item;

	}
	
	
}
