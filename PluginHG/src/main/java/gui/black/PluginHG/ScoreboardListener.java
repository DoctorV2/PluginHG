package gui.black.PluginHG;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class ScoreboardListener implements Listener {

    private final Main main;

    public ScoreboardListener(Main main) {
        this.main = main;
    }


    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();

        //main.killEnemy.put(player, 0);

        main.buildScoreboard(player);



    }

    //@EventHandler
    //public void onKill(EntityDeathEvent e) {
        //if (e.getEntity() instanceof Player) {
        //Player target = (Player) e.getEntity();
        //Player player = ((Player) e.getEntity()).getPlayer();

        //target.isDead();

        //main.killEnemy.put(player, target + 1);

        //player.getScoreboard().getTeam("kill_enemies").setSuffix(main.killEnemy.get(player) + "");


        }
    //}


//}





