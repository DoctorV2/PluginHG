package gui.black.PluginHG;

import gui.black.PluginHG.Kits.*;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.*;

public class Main extends JavaPlugin {
    private static Main instance;

    //public HashMap<Player, Player> killEnemy;

    @Override
    public void onEnable() {
        Main.instance = this;
        new Manager();
       //killEnemy = new HashMap<>();
        System.out.println("PluginHG ativado!");

        Bukkit.getPluginManager().registerEvents(new MenuHG(this), this);
        Bukkit.getPluginManager().registerEvents(new ScoreboardListener(this), this);
        Bukkit.getPluginManager().registerEvents(new MenuClick(this), this);
        Bukkit.getPluginManager().registerEvents(new MenuSkills(), this);
        Bukkit.getPluginManager().registerEvents(new Ninja(), this);
        Bukkit.getPluginManager().registerEvents(new Ajin(), this);
        Bukkit.getPluginManager().registerEvents(new Viper(), this);
        Bukkit.getPluginManager().registerEvents(new Snail(), this);
        Bukkit.getPluginManager().registerEvents(new Anchor(), this);
        Bukkit.getPluginManager().registerEvents(new Achiles(), this);
        Bukkit.getPluginManager().registerEvents(new Fisherman(), this);
        Bukkit.getPluginManager().registerEvents(new Fireman(), this);

    }
    


    public static Main getInstance() { return instance; }

    public void buildScoreboard(Player player) {
        Scoreboard board = Bukkit.getScoreboardManager().getNewScoreboard();

        Objective obj = board.registerNewObjective("HGScore", "HG Scoreboard!");
        obj.setDisplayName(ChatColor.AQUA.toString() + "Sopinha");
        obj.setDisplaySlot(DisplaySlot.SIDEBAR);

        //Team killEnemies = board.registerNewTeam("kill_enemies");
        //killEnemies.setPrefix(ChatColor.AQUA + "Kills: ");
        //killEnemies.setSuffix(this.killEnemy.get(player) + "");
       // obj.getScore(ChatColor.AQUA.toString()).setScore(4);

        Score playerNick = obj.getScore(ChatColor.AQUA + "Nick: " + player.getName());
        playerNick.setScore(3);

        Score blank = obj.getScore("");
        blank.setScore(2);

        Score website = obj.getScore(ChatColor.AQUA + "Loja: (Loja)");
        website.setScore(1);

        player.setScoreboard(board);
    }

}

