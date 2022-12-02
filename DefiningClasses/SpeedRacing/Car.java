package JavaAdvanced.DefiningClasses.SpeedRacing;

public class Car {
    private String model;
    private double fuel;
    private double costOfFuelPer1Km;
    private int distance;

    public Car(String model, double fuel, double costOfFuelPer1Km) {
        this.model = model;
        this.fuel = fuel;
        this.costOfFuelPer1Km = costOfFuelPer1Km;
        this.distance = 0;
    }

    public void carCanOrNotMoveDistance(String currentModel, int distanceToMove) {
        double neededFuel = distanceToMove * this.costOfFuelPer1Km;
        if (neededFuel <= this.fuel) {
            this.fuel -= neededFuel;
            this.distance += distanceToMove;
        } else {
            System.out.println("Insufficient fuel for the drive");
        }
    }

    public String getModel() {
        return model;
    }

    public double getFuel() {
        return fuel;
    }

    public int getDistance() {
        return distance;
    }
}
