package JavaAdvanced.Generics.GenericSwapMethodIntegers_ex_4;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    public List<T> values;

    public Box() {
        this.values = new ArrayList<>();
    }

    public void addValue(T value) {
        this.values.add(value);
    }

    public void swapValues(int index1, int index2) {
        T firstValue = values.get(index1);
        values.set(index1, this.values.get(index2));
        values.set(index2, firstValue);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (T value : values) {
            output.append(String.format("%s: %s", value.getClass().getName(), value))
                    .append(System.lineSeparator());
        }
        return output.toString().trim();
    }
}

