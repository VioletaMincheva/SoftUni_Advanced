package guild;

import java.util.ArrayList;
import java.util.List;

public class Guild {

    private String name;
    private int capacity;
    private List<Player> guild;

    public Guild(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.guild = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Player> getGuild() {
        return guild;
    }

    public void setGuild(List<Player> guild) {
        this.guild = guild;
    }

    public void addPlayer(Player player) {
        if (this.capacity > this.guild.size()) {
            guild.add(player);
        }
    }

    public boolean removePlayer(String name) {
        return guild.removeIf(p -> p.getName().equals(name));
    }

    public void promotePlayer(String name) {
        for (Player p : guild) {
            if (p.getName().equals(name)
                    && !p.getRank().equals("Member")) {
                p.setRank("Member");
            }
        }
    }

    public void demotePlayer(String name) {
        for (Player player : guild) {
            if (player.getName().equals(name)
                    && !player.getRank().equals("Trial")) {
                player.setRank("Trial");
            }
        }
    }

    public Player[] kickPlayersByClass(String clazz) {
        Player[] kickPlayersByClass = guild.stream()
                .filter(p-> p.getClazz().equals(clazz))
                .toArray(Player[]::new);

        for (Player playersByClass : kickPlayersByClass) {
            guild.removeIf
                    (p-> p.getName().equals(playersByClass.getName()));
        }
        return kickPlayersByClass;
        }

    public int count() {
        return guild.size();
    }

    public String report() {
        StringBuilder output = new StringBuilder();
        output.append(System.lineSeparator())
                .append("Players in the guild: ")
                .append(getName()).append(":")
                .append(System.lineSeparator());
        for (Player player : guild) {
            output.append(player)
                    .append(System.lineSeparator());
        }
        return output.toString();
    }
}
