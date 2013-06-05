package me.never2nv.CockyRooster;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class CockyRooster extends JavaPlugin{
	public final Logger logger = Logger.getLogger("Minecraft)");
	public String cocky = ChatColor.RED + "[" + ChatColor.YELLOW + "CockyRooster" + ChatColor.RED + "] " + ChatColor.WHITE;
	public static CockyRooster plugin;
	
	@Override
	// Plugin gets logger and tells it's disabled.
	public void onDisable() {
		PluginDescriptionFile pdffile = this.getDescription();
		this.logger.info("Congrats! U iz ubber smart! " + pdffile.getName() + " has been disabled!");
	}
	
	@Override
	// Plugin gets logger and tells it's enabled.
	public void onEnable() {
		PluginDescriptionFile pdffile = this.getDescription();
		this.logger.info("Well would ya look at that? " + pdffile.getName() + " Version " + pdffile.getVersion() + " has been enabled!");
	}
	
// Thanks for the correction Grimlock257. I appreciate it!
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		Player player = (Player) sender;
		if(commandLabel.equalsIgnoreCase("cocky")){
			// Sends pm to user who triggered the cmd.
			player.sendMessage(ChatColor.GREEN + "You sure do look great today! So intelligent and handsome! Wow, I'm telling everyone!");
			// Sends global message to the server as the user indicated above.
			Bukkit.broadcastMessage(ChatColor.YELLOW + player.getName() + ChatColor.RED + " is such a handsome, intelligent, courageous individual!" + ChatColor.GREEN + " RESPECT!");
		}
	    if(commandLabel.equalsIgnoreCase("smart")){
	    	// Sends pm to user who triggered the cmd.
	    	player.sendMessage(ChatColor.GREEN + "You are so intelligent! You make Bill Nye look like child's play! I'm informing others...");
	    	// Sends global message to the server as the user indicated above.
	    	Bukkit.broadcastMessage(ChatColor.GREEN + player.getName() + ChatColor.YELLOW + " just solved a complex algirithim!" + ChatColor.RED + " Making them the most intelligent person on this server!");
	    }
	    if(commandLabel.equalsIgnoreCase("l33t")){
	    	// Sends pm to user who triggered the cmd.
			player.sendMessage(ChatColor.GREEN + "Telling others what a hax0r you are!");
			// Sends global message to the server as the user indicated above.
			Bukkit.broadcastMessage(ChatColor.RED + player.getName() + ChatColor.GREEN + " Can open up any command line terminal and access: " + ChatColor.YELLOW + "ANYTHING! Such a l33t hax0r!");
		}
	    if(commandLabel.equalsIgnoreCase("elite")){
	    	// Sends pm to user who triggered the cmd.
			player.sendMessage(ChatColor.GREEN + "Telling others of your greatness!");
			// Sends global message to the server as the user indicated above.
			
			Bukkit.broadcastMessage(ChatColor.GREEN + player.getName() + ChatColor.YELLOW + " is SO elite: " + ChatColor.RED + " they punched an enderdragon to death, literally..... with their fists!");
	    }
	    if(commandLabel.equalsIgnoreCase("troll")){
	    	// Sends pm to user who triggered the cmd.
			player.sendMessage(ChatColor.GREEN + "Telling others of your greatness!");
			// Sends global message to the server as the user indicated above.
			Bukkit.broadcastMessage(ChatColor.GREEN + player.getName() + ChatColor.YELLOW + " says to SHUTUP!! " + ChatColor.RED + " AN' GET BACK UNDER YOUR BRIDGE TROLL!");
	    }
	    // Return statement, derp.
		return false;
	}
}
