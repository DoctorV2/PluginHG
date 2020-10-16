package gui.black.PluginHG;

import org.bukkit.Location;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Arena {
    private int id;
    private ArrayList<UUID> players;
    private Location spawn;

    public Arena(int id) {
        this.id = id;
        players = new ArrayList<>();
        spawn = Config.getArenaSpawn(id);
    }

    public int getID() {return id;}
    public List<UUID> getPlayers() {return players; }

}
