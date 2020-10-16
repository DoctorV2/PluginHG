package gui.black.PluginHG.Kits;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.inventory.ItemStack;



public class Monk implements Listener {
    @EventHandler
    public void onRightClick(PlayerInteractEntityEvent e) {
        ItemStack itemstack = e.getPlayer().getItemInHand();
        if (e.getRightClicked() instanceof Player) {
            if (e.getPlayer().hasPermission("hg.monk")) {
                Player target = (Player) e.getRightClicked();
                Player player = e.getPlayer();



                }
            }

        }







}