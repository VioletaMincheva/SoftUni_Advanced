package JavaAdvanced.DefiningClasses.RawData_ex_4;

public class Car {
    public String model;
    Engine engine;
    Cargo cargo;
    Tires[] tires;

    public Car(String model, Engine engine, Cargo cargo, Tires[] tires) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public boolean hasTiresWithLessPressureThanOne() {
        for (Tires tire : tires) {
            if (tire.getTyrePressure() < 1) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return this.model;
    }
}
