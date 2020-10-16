package gui.black.PluginHG;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MenuHG implements Listener {

    private Main main;

    public MenuHG(Main main) {
        this.main = main;
    }

    Inventory gui = Bukkit.createInventory(null, 54, ChatColor.AQUA + "Menu KitsHG");

    @EventHandler
    public void onUse(PlayerInteractEvent e) {

        Player player = e.getPlayer();

        if (e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            if ( e.getPlayer().getItemInHand().getType().equals(Material.NETHER_STAR)) {

                player.openInventory(gui);

                ItemStack flash = new ItemStack(Material.FEATHER);
                ItemMeta flashMeta = flash.getItemMeta();
                flashMeta.setDisplayName(ChatColor.DARK_RED + "Fla" + ChatColor.YELLOW + "sh");
                flash.setItemMeta(flashMeta);
                gui.setItem(10, flash);
            }

            for(int i = 0; i < 10; i++) {
                ItemStack vidro = new ItemStack(Material.THIN_GLASS);
                ItemMeta vidroMeta = vidro.getItemMeta();
                vidroMeta.setDisplayName(ChatColor.WHITE + "==");
                vidro.setItemMeta(vidroMeta);
                gui.setItem(i++, vidro);
            }

            for(int i = 45; i < 54; i++) {
                ItemStack vidroo = new ItemStack(Material.THIN_GLASS);
                ItemMeta vidrooMeta = vidroo.getItemMeta();
                vidrooMeta.setDisplayName(ChatColor.WHITE + "==");
                vidroo.setItemMeta(vidrooMeta);
                gui.setItem( i++, vidroo);
            }
            ItemStack archer =  new ItemStack(Material.BOW);
            ItemMeta archerMeta = archer.getItemMeta();
            archerMeta.setDisplayName(ChatColor.BLUE + "Archer");
            archer.setItemMeta(archerMeta);
            gui.setItem(19, archer);

            ItemStack fisherman =  new ItemStack(Material.FISHING_ROD);
            ItemMeta fisherMeta = fisherman.getItemMeta();
            fisherMeta.setDisplayName(ChatColor.GREEN + "Fisherman");
            fisherman.setItemMeta(fisherMeta);
            gui.setItem(20, fisherman);

            ItemStack monk =  new ItemStack(Material.BLAZE_ROD);
            ItemMeta monkMeta = monk.getItemMeta();
            monkMeta.setDisplayName(ChatColor.YELLOW + "Monk");
            monk.setItemMeta(monkMeta);
            gui.setItem(21, monk);

            ItemStack achiles =  new ItemStack(Material.WOOD_SWORD);
            ItemMeta achilesMeta = achiles.getItemMeta();
            achilesMeta.setDisplayName(ChatColor.WHITE + "Achiles");
            achiles.setItemMeta(achilesMeta);
            gui.setItem(22, achiles);

            ItemStack soulsand =  new ItemStack(Material.SOUL_SAND);
            ItemMeta soulsandMeta = soulsand.getItemMeta();
            soulsandMeta.setDisplayName(ChatColor.BLACK + "Snail");
            soulsand.setItemMeta(soulsandMeta);
            gui.setItem(23, soulsand);

            ItemStack specialist =  new ItemStack(Material.BOOK);
            ItemMeta speciaMeta = specialist.getItemMeta();
            speciaMeta.setDisplayName(ChatColor.DARK_RED + "Specialist");
            specialist.setItemMeta(speciaMeta);
            gui.setItem(24, specialist);

            ItemStack anchor =  new ItemStack(Material.ANVIL);
            ItemMeta anchorMeta = anchor.getItemMeta();
            anchorMeta.setDisplayName(ChatColor.GRAY + "Anchor");
            anchor.setItemMeta(anchorMeta);
            gui.setItem(28, anchor);

            ItemStack ajnin =  new ItemStack(Material.ENDER_PEARL);
            ItemMeta ajninMeta = ajnin.getItemMeta();
            ajninMeta.setDisplayName(ChatColor.DARK_GREEN + "Ajnin");
            ajnin.setItemMeta(ajninMeta);
            gui.setItem(25, ajnin);

            ItemStack kangaroo = new ItemStack(Material.FIREWORK);
            ItemMeta kangarooMeta = kangaroo.getItemMeta();
            kangarooMeta.setDisplayName(ChatColor.RED + "Kangaroo");
            kangaroo.setItemMeta(kangarooMeta);
            gui.setItem(11, kangaroo);

            ItemStack urgal = new ItemStack(Material.REDSTONE);
            ItemMeta urgalMeta = urgal.getItemMeta();
            urgalMeta.setDisplayName(ChatColor.RED + "Urgal");
            urgal.setItemMeta(urgalMeta);
            gui.setItem(12, urgal);

            ItemStack ninja = new ItemStack(Material.EMERALD);
            ItemMeta ninjaMeta = ninja.getItemMeta();
            ninjaMeta.setDisplayName(ChatColor.GREEN + "Ninja");
            ninja.setItemMeta(ninjaMeta);
            gui.setItem(13, ninja);

            ItemStack madman = new ItemStack(Material.REDSTONE_BLOCK);
            ItemMeta madmanMeta = madman.getItemMeta();
            madmanMeta.setDisplayName(ChatColor.DARK_RED + "MadMan");
            madman.setItemMeta(madmanMeta);
            gui.setItem(14, madman);

            ItemStack scout = new ItemStack(Material.POTION);
            ItemMeta scoutMeta = scout.getItemMeta();
            scoutMeta.setDisplayName(ChatColor.WHITE + "Scout");
            scout.setItemMeta(scoutMeta);
            gui.setItem(15, scout);

            ItemStack viper = new ItemStack(Material.SPIDER_EYE);
            ItemMeta viperMeta = viper.getItemMeta();
            viperMeta.setDisplayName(ChatColor.GREEN + "Viper");
            viper.setItemMeta(viperMeta);
            gui.setItem(16, viper);



        }

    }
}