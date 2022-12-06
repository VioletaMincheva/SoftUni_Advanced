package JavaAdvanced.Generics.CustomListSorter_ex_8;

import java.util.ArrayList;
import java.util.List;

public class CustomList<T extends Comparable<T>> extends Sorter {
    public List<T> tList;

    public CustomList() {
        this.tList = new ArrayList<>();
    }

    public void addValue(T element) {
        this.tList.add(element);
    }

    public int size() {
        return this.tList.size();
    }

    public T get(int index) {
        return this.tList.get(index);
    }

    public void remove(int index) {
        this.tList.remove(index);
    }

    public boolean contains(T element) {
        return this.tList.contains(element);
    }

    public void swap(int index1, int index2) {
        T firstValue = this.tList.get(index1);
        this.tList.set(index1, this.tList.get(index2));
        this.tList.set(index2, firstValue);
    }

    public int countGreaterThan(T valueToCompare) {
        return (int) this.tList.stream().filter(v -> v.compareTo(valueToCompare) > 0).count();
    }

    public T getMax() {
        T maxElement = null;
        if (!this.tList.isEmpty()) {
            maxElement = this.tList.get(0);
            for (T currentElement : this.tList) {
                if (currentElement.compareTo(maxElement) > 0) {
                    maxElement = currentElement;
                }
            }
        }
        return maxElement;
    }

    public T getMin() {
        T minElement = null;
        if (!this.tList.isEmpty()) {
            minElement = this.tList.get(0);
            for (T currentElement : this.tList) {
                if (currentElement.compareTo(minElement) < 0) {
                    minElement = currentElement;
                }
            }
        }
        return minElement;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (T value : this.tList) {
            output.append(String.format("%s", value))
                    .append(System.lineSeparator());
        }
        return output.toString().trim();
    }
}

