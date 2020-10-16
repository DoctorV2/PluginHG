package gui.black.PluginHG.Kits;

import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public class Specialist implements Listener {
    @EventHandler
    public void giveXP(EntityDeathEvent e) {
        if (e.getEntity() instanceof Player) {
                Player target = (Player) e.getEntity();
                Player player = ((Player) e.getEntity()).getPlayer();
                if (player.hasPermission("hg.specialist")){
                    if (target.isDead()) {
                        player.getInventory().addItem(new ItemStack(Material.EXP_BOTTLE));

                    }
                }

            }

        }

}


