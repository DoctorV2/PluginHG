package gui.black.PluginHG.Kits;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.permissions.Permission;
import org.bukkit.util.Vector;

import javax.management.Attribute;
import java.security.PermissionCollection;
import java.util.Collection;
import java.util.HashMap;

public class Anchor implements Listener {
    @EventHandler
    public void onHit(EntityDamageByEntityEvent e) {
        if (e.getDamager() instanceof Player && e.getEntity() instanceof Player) {
            final String perm = "hg.anchor";
            if (((Player) e.getDamager()).hasPermission(perm)) {
                Player hitter = (Player) e.getDamager();
                Player target = (Player) e.getEntity();
                hitter.playSound(hitter.getLocation(), Sound.ANVIL_LAND, 0.5F, 1.0F);
                target.playSound(hitter.getLocation(), Sound.ANVIL_LAND, 0.5F, 1.0F);


                }
            }
     }


}


