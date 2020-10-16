package gui.black.PluginHG.Kits;

import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.HashMap;

public class Fireman implements Listener {


    @EventHandler
    public void onHit(EntityDamageByEntityEvent e){
        if(e.getDamager() instanceof Player && e.getEntity() instanceof Player) {
            final String perm = "hg.fireman";
            if(((Player) e.getDamager()).hasPermission(perm)){
                Player hitter = (Player) e.getDamager();
                Player target = (Player) e.getEntity();
                getRegisterKit().put(hitter, perm);
                target.setFireTicks(20*60);

            }
        }
    }
    @EventHandler
    public void onFire (PlayerInteractEvent e) {
        Player player = e.getPlayer();
        if (player.hasPermission("hg.fireman")) {
            if (player.getLocation().getBlock().getType().equals(Material.LAVA)) {
                player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 1000000, 1));
            }
        }
    }

    @EventHandler
    public void onPlayerMove (PlayerMoveEvent e) {
        Player player = e.getPlayer();
        if (player.hasPermission("hg.fireman")) {player.playEffect(player.getLocation(), Effect.MOBSPAWNER_FLAMES, 1);}

    }



    public HashMap<Player, String> getRegisterKit() {
        return registerKit;
    }
    private final HashMap<Player, String> registerKit = new HashMap<>();
}
