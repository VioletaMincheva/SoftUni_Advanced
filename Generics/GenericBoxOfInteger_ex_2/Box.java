package JavaAdvanced.Generics.GenericBoxOfInteger_ex_2;

public class Box<T> {
 public T value;

    public Box(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", this.value.getClass().getName(), this.value);
    }
}
