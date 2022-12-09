package JavaAdvanced.IteratorsAndComparators.Collection_ex_2;

import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterable<String> {
    private List<String> data;
    private int index;

    public ListyIterator(List<String> data) {
        this.data = data;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean move() {
        if (iterator().hasNext()) {
            this.index++;
            return true;
        }
        return false;
    }

    public void canPrint() {
        if (this.data.isEmpty())
            throw new IllegalStateException("Invalid Operation!");
    }

    public void print() {
        canPrint();
        System.out.println(this.data.get(this.index));
    }

    public void printAll() {
        canPrint();
        this.data.forEach(e -> System.out.print(e + " "));
        System.out.println();
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return index < data.size() - 1;
            }

            @Override
            public String next() {
                String element = data.get(index);
                index++;
                return element;
            }
        };
    }
}