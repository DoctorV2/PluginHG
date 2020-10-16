package gui.black.PluginHG.Kits;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class Madman implements Listener {
    @EventHandler
    public void onHit(EntityDamageByEntityEvent e){
        if(e.getDamager() instanceof Player) {
            Player player = (Player) e.getDamager();
            if(player.getNearbyEntities(5, 0,5 ).size() >= 3) {
                e.setDamage(e.getDamage() + 3*0.5);
            } else e.setDamage(e.getDamage() + player.getNearbyEntities(5, 0,5 ).size()*0.5);
        }
    }
}
