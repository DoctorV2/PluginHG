package gui.black.PluginHG;

import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import static org.bukkit.Material.*;

public class MenuClick implements Listener {

    private Main main;

    public MenuClick(Main main) {
        this.main = main;

    }

    @EventHandler
    public void onClick(InventoryClickEvent e) {

        Player player = (Player) e.getWhoClicked();
        if (ChatColor.translateAlternateColorCodes('&', e.getInventory().getTitle()).equals(ChatColor.AQUA + "Menu KitsHG")) {
            if (e.getCurrentItem() != null) {
                e.setCancelled(true);

                switch (e.getCurrentItem().getType()) {
                    case FEATHER:
                        if (player.hasPermission("hg.flash")) {
                            player.getInventory().removeItem(new ItemStack(Material.NETHER_STAR, 1));
                            player.getInventory().addItem(new ItemStack(Material.FEATHER, 1));
                            player.closeInventory();
                        }

                        break;

                    case FIREWORK:
                        player.getInventory().removeItem(new ItemStack(Material.NETHER_STAR, 1));
                        player.getInventory().addItem(new ItemStack(FIREWORK, 1));
                        player.closeInventory();
                        break;

                    case REDSTONE:
                        player.getInventory().removeItem(new ItemStack(Material.NETHER_STAR, 1));
                        player.getInventory().addItem(new ItemStack(Material.POTION,3, (short) 57));
                        player.closeInventory();
                        break;

                    case EMERALD:
                        if (player.hasPermission("hg.ninja")) {
                            player.getInventory().removeItem(new ItemStack(Material.NETHER_STAR, 1));
                            player.closeInventory();
                        }else{
                            player.sendMessage(ChatColor.AQUA + "Você não não tem permissão para usar esse kit!");
                        }

                        break;

                    case BOW:
                        ItemStack bowWithDMG = new ItemStack(BOW);
                        bowWithDMG.addEnchantment(Enchantment.ARROW_DAMAGE, 2);
                        player.getInventory().removeItem(new ItemStack(Material.NETHER_STAR, 1));
                        player.getInventory().addItem(new ItemStack(bowWithDMG));
                        player.getInventory().addItem(new ItemStack(ARROW, 16));
                        player.closeInventory();
                        break;

                    case SPIDER_EYE:
                        if (player.hasPermission("hg.viper")) {
                            player.getInventory().removeItem(new ItemStack(Material.NETHER_STAR, 1));
                            player.closeInventory();
                        }
                        break;

                    case FLINT:
                        player.getInventory().removeItem(new ItemStack(Material.NETHER_STAR, 1));
                        player.getInventory().addItem(new ItemStack(Material.FEATHER, 1));
                        player.closeInventory();
                        break;

                }

            }
        }
    }
}