package gui.black.PluginHG.Kits;

import org.bukkit.Bukkit;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;

import java.util.HashMap;

public class Viper implements Listener {
    @EventHandler
    public void onHit(EntityDamageByEntityEvent e){
        if(e.getDamager() instanceof Player && e.getEntity() instanceof Player) {
            final String perm = "hg.viper";
            if(((Player) e.getDamager()).hasPermission(perm)){
                Player hitter = (Player) e.getDamager();
                Player target = (Player) e.getEntity();
                getRegisterKit().put(hitter, perm);
                target.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 60, 1));
            }
        }
    }



    public HashMap<Player, String> getRegisterKit() {
        return registerKit;
    }
    private final HashMap<Player, String> registerKit = new HashMap<>();
}