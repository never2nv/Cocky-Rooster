package me.never2nv.CockyRooster;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class CockyRooster extends JavaPlugin{
	public final Logger logger = Logger.getLogger("Minecraft)");
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
			player.sendMessage(ChatColor.GREEN + "You sure do look great today! So intelligent and handsome! Wow!");
			// Sends global message to the server as the user indicated above.
			player.chat("/me " + ChatColor.RED + "<-- Look at this handsome, intelligent, courageous individual right " + ChatColor.GREEN + "HERE!");
		}
	    if(commandLabel.equalsIgnoreCase("smart")){
	    	// Sends pm to user who triggered the cmd.
	    	player.sendMessage(ChatColor.GREEN + "You are so intelligent! You make Bill Nye look like child's play!");
	    	// Sends global message to the server as the user indicated above.
	    	player.chat("/me " + ChatColor.WHITE + "just solved an impossible complex algirhtym " + ChatColor.RED + "Making them the smartest person on the server!");
	    }
	    if(commandLabel.equalsIgnoreCase("l33t")){
	    	// Sends pm to user who triggered the cmd.
			player.sendMessage(ChatColor.GREEN + "You are so uber l33t! You hax0r you!");
			// Sends global message to the server as the user indicated above.
			player.chat("/me " + ChatColor.GREEN + "Can open up any command line terminal and access " + ChatColor.GREEN + "ANYTHING! Such a l33t hax0r!");
		}
	    // Return statement, derp.
		return false;
	}
}
