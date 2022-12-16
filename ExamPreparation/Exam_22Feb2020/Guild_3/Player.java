package guild;

public class Player {
    private String name;
    private String clazz;
    private String rank = "Trial";
    private String description = "n/a";

    public Player(String name, String clazz) {
        this.name = name;
        this.clazz = clazz;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getClazz() {
        return clazz;
    }

    public String getRank() {
        return rank;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Player ")
                .append(getName())
                .append(": ")
                .append(getClazz())
                .append(System.lineSeparator());
        output.append("Rank: ")
                .append(getRank())
                .append(System.lineSeparator());
        output.append("Description: ")
                .append(getDescription());
        return output.toString();
    }
}
