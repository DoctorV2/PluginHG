package gui.black.PluginHG.Kits;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class Achiles implements Listener {

    @EventHandler
    public void onDamageAchiles(EntityDamageByEntityEvent e) {
        if (!(e.getEntity() instanceof Player && e.getDamager() instanceof Player)) {
            if (e.getDamager().hasPermission("hg.achiles")) {
                Player hitter = (Player) e.getDamager();

                }
            }
        }
    }

