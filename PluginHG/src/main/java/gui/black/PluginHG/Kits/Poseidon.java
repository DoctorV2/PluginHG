package gui.black.PluginHG.Kits;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Poseidon implements Listener {
    @EventHandler
    public void onWater (PlayerInteractEvent e) {
        if (e.getPlayer().hasPermission("hg.poseidon")) {
            Player player = e.getPlayer();
            if (player.getLocation().getBlock().isLiquid()) {
                player.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 40 ,1, true, true));
                player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 40, 1, true, false));
            }
        }
    }
}
