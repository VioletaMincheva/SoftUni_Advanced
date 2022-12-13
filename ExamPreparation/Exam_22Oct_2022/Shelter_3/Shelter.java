package JavaAdvanced.ExamPreparation.Exam_22Oct2022.shelter;

import java.util.ArrayList;
import java.util.List;

public class Shelter {
    private List<Animal> data;
    private int capacity;

    public Shelter(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public List<Animal> getAnimals() {
        return data;
    }

    public void setAnimals(List<Animal> data) {
        this.data = data;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void add(Animal animal) {
        if (this.getCapacity() > this.data.size()) {
            this.data.add(animal);
        }
    }

    public boolean remove(String name) {
        return this.data.removeIf(a -> a.getName().equals(name));
    }

    public Animal getAnimal(String name, String caretaker) {
        Animal animal = null;
        for (Animal currentAnimal : this.data) {
            if (currentAnimal.getName().equals(name)
                    && currentAnimal.getCaretaker().equals(caretaker)) {
                animal = currentAnimal;
            }
        }
        return animal;
    }


    public Animal getOldestAnimal() {
        Animal oldestAnimal = new Animal("", 0, "");
        for (Animal currentAnimal : this.data) {
            if (currentAnimal.getAge() > oldestAnimal.getAge()) {
                oldestAnimal = currentAnimal;
            }
        }
        return oldestAnimal;
    }

    public int getCount() {
        return this.data.size();
    }

    public String getStatistics() {
        StringBuilder out = new StringBuilder("The shelter has the following animals:");
        for (Animal currentAnimal : this.data) {
            out.append(System.lineSeparator())
                    .append(currentAnimal.getName())
                    .append(" ")
                    .append(currentAnimal.getCaretaker());
        }
        return out.toString();
    }

}
