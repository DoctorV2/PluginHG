package gui.black.PluginHG.Kits;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;

import java.util.HashMap;

public class Ninja implements Listener {
    @EventHandler
    public void onHit(EntityDamageByEntityEvent e){
        if(e.getDamager() instanceof Player && e.getEntity() instanceof Player) {
            if(((Player) e.getDamager()).hasPermission("hg.ninja")){
                Player hitter = (Player) e.getDamager();
                Player target = (Player) e.getEntity();
                getRegisterPlayer().put(hitter, target);
            }
        }
    }

    @EventHandler
    public void onSneak(PlayerToggleSneakEvent e){
        if(e.getPlayer().hasPermission("hg.ninja")) {
            if(getRegisterPlayer().containsKey(e.getPlayer())) {
                e.getPlayer().teleport(getRegisterPlayer().get(e.getPlayer()).getLocation());

            }
    }
}

    public HashMap<Player, Player> getRegisterPlayer() {
        return registerPlayer;
    }
    private final HashMap<Player, Player> registerPlayer = new HashMap<>();
}
