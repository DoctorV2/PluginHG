package gui.black.PluginHG;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

public class MenuSkills implements Listener {

    @EventHandler
    public void onUse(PlayerInteractEvent e) {

        Player player = e.getPlayer();

        if (e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)
                || e.getAction().equals(Action.LEFT_CLICK_AIR) || e.getAction().equals(Action.LEFT_CLICK_BLOCK)) {
            if ( e.getPlayer().getItemInHand().getType().equals(Material.FEATHER)) {
                player.setVelocity(e.getPlayer().getLocation().getDirection().multiply(3));
            }
            if (e.getPlayer().getItemInHand().getType().equals(Material.FIREWORK)) {
                player.setVelocity(e.getPlayer().getLocation().getDirection().multiply(2).setY(1));


            }

        }
    }
}