package JavaAdvanced.DefiningClasses.CarSalesman;

public class Engine {

    private String model;
    private int power;
    private int displacement;
    private String efficiency;

    public Engine(String model, int power, int displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
        this.displacement = 0;
        this.efficiency = "n/a";
    }

    public Engine(String model, int power, int displacement) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = "n/a";
    }

    public Engine(String model, int power, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = 0;
        this.efficiency = efficiency;
    }

    @Override
    public String toString() {
        StringBuilder engineOutput = new StringBuilder();
        engineOutput.append(this.model).append(":")
                .append(System.lineSeparator())
                .append("Power: ").append(this.power)
                .append(System.lineSeparator())
                .append("Displacement: ").append(this.displacement == 0 ? "n/a" : this.displacement)
                .append(System.lineSeparator())
                .append("Efficiency: ").append(this.efficiency)
                .append(System.lineSeparator());
        return engineOutput.toString().trim();
    }
}
