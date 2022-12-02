package JavaAdvanced.DefiningClasses.RawData_ex_4;

public class Tires {
    private double tyrePressure;
    private int tireAge;

    public Tires(double tyrePressure, int tireAge) {
        this.tyrePressure = tyrePressure;
        this.tireAge = tireAge;
    }

    public double getTyrePressure() {
        return tyrePressure;
    }
}
