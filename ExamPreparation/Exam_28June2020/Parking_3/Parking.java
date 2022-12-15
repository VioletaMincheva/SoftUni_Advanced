package JavaAdvanced.ExamPreparation.Exam_28June2020.parking;

import java.util.ArrayList;
import java.util.List;

public class Parking {
    private List<Car> data;
    private String type;
    private int capacity;

    public Parking(String type, int capacity) {
        this.data = new ArrayList<>();
        this.type = type;
        this.capacity = capacity;
    }

    public List<Car> getData() {
        return data;
    }

    public void setData(List<Car> data) {
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void add(Car car) {
        if (this.data.size() < this.capacity) {
            this.data.add(car);
        }
    }

    public boolean remove(String manufacturer, String model) {
        return this.data.removeIf(c -> c.getManufacturer().equals(manufacturer) && c.getModel().equals(model));
    }

    public Car getLatestCar() {
        Car car = null;
        int latestCarYear = 2000;
        if (!this.data.isEmpty()) {
            for (Car currentCar : this.data) {
                if (currentCar.getYear() > latestCarYear) {
                    car = currentCar;
                    latestCarYear = currentCar.getYear();
                }
            }
        }
        return car;
    }

    public Car getCar(String manufacturer, String model) {
        Car car = null;
        if (!this.data.isEmpty()) {
            for (Car currentCar : this.data) {
                if (currentCar.getManufacturer().equals(manufacturer)
                        && currentCar.getModel().equals(model)) {
                    car = currentCar;
                    break;
                }
            }
        }
        return car;
    }

    public int getCount() {
        return this.data.size();
    }

    public String getStatistics() {
        StringBuilder output = new StringBuilder("The cars are parked in ");
        output.append(this.getType()).append(":").append(System.lineSeparator());
        for (Car currentCar : data) {
            output.append(currentCar).append(System.lineSeparator());
        }
        return output.toString().trim();
    }
}
