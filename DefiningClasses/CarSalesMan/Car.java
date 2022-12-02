package JavaAdvanced.DefiningClasses.CarSalesman;

public class Car {

    private String model;
    private Engine engine;
    private int weight;
    private String color;

    public Car(String model, Engine engine, int weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.weight = 0;
        this.color = "n/a";
    }

    public Car(String model, Engine engine, int weight) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = "n/a";
    }

    public Car(String model, Engine engine, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = 0;
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder carOutput = new StringBuilder();
        carOutput.append(this.model).append(":")
                .append(System.lineSeparator())
                .append(this.engine)
                .append(System.lineSeparator())
                .append("Weight: ").append(this.weight == 0 ? "n/a" : this.weight)
                .append(System.lineSeparator())
                .append("Color: ").append(this.color);
        return carOutput.toString().trim();
    }
}