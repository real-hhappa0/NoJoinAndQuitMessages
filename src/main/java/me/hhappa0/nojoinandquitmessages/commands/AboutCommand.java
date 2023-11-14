package me.hhappa0.nojoinandquitmessages.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class AboutCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(" §8------------ §bABOUT §8------------ ");
        sender.sendMessage("§bNoJoinAndQuitMessages §f- by §bhhappa0");
        sender.sendMessage("§fVersion: §bv1.0 §f| Minecraft: §b1.20.2");
        sender.sendMessage("§fDescription: §bSimple plugin to get rid of the ugly default Minecraft join message§f:");
        sender.sendMessage("§f(§eSteve joined the game.§f)");
        sender.sendMessage(" §8------------------------------- ");
        return false;
    }
}
