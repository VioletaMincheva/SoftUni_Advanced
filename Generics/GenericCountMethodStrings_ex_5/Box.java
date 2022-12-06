package JavaAdvanced.Generics.GenericCountMethodStrings_ex_5;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>> {
    public List<T> tList;

    public Box() {
        this.tList = new ArrayList<>();
    }

    public void addValue(T value) {
        this.tList.add(value);
    }

    public long compareTo(T valueToCompare) {
        return this.tList.stream().filter(v -> v.compareTo(valueToCompare) > 0).count();
    }
}

