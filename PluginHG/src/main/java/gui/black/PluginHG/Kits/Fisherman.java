package gui.black.PluginHG.Kits;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerVelocityEvent;

import java.util.HashMap;

public class Fisherman implements Listener {

    @EventHandler
    public void onPlayerHitWithFishRod(PlayerFishEvent e) {
            if (e.getCaught() instanceof Player) {
                if (e.getPlayer().hasPermission("hg.fisherman")) {
                    Player hitter = e.getPlayer();
                    Player target = (Player) e.getCaught();
                    target.teleport(hitter.getLocation());
                }

            }


            }
        }





