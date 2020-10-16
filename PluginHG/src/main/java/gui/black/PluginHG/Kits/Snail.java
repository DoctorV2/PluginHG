package gui.black.PluginHG.Kits;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;

import java.util.HashMap;

public class Snail implements Listener {
    @EventHandler
    public void onHit(EntityDamageByEntityEvent e){
        if(e.getDamager() instanceof Player && e.getEntity() instanceof Player) {
            if(((Player) e.getDamager()).hasPermission("hg.snail")){
                Player hitter = (Player) e.getDamager();
                Player target = (Player) e.getEntity();
                getRegisterPlayer().put(hitter, target);
                target.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 1));
            }
        }
    }


    public HashMap<Player, Player> getRegisterPlayer() {
        return registerPlayer;
    }
    private final HashMap<Player, Player> registerPlayer = new HashMap<>();
}