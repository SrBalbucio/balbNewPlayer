package me.balbucio.newplayer;

import java.io.File;
import java.io.IOException;
import net.md_5.bungee.BungeeCord;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.config.Configuration;
import net.md_5.bungee.config.ConfigurationProvider;
import net.md_5.bungee.config.YamlConfiguration;

public class Main extends Plugin{
	private static Main instance;
	private File file = new File()
	
	public void onEnable() {
		setInstance(this);

		BungeeCord.getInstance().getPluginManager().registerListener(this, new Evento());
		BungeeCord.getInstance().getConsole().sendMessage(new TextComponent("[BalbucioNewPlayer] �2Ativado com sucesso!"));
	}
	 public static Main getInstance() {
	        return instance;
	    }

	    private static void setInstance(final Main instance) {
	        Main.instance = instance;
	    }

}
