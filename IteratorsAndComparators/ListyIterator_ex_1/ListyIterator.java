package JavaAdvanced.IteratorsAndComparators.ListyIterator_ex_1;

import java.util.List;

public class ListyIterator {
    private List<String> data;
    private int index;

    public ListyIterator(List<String> data) {
        this.data = data;
    }

    public void canPrint() {
        if (this.data.isEmpty())
            throw new IllegalStateException("Invalid Operation!");
    }

    public void print() {
        canPrint();
        System.out.println(this.data.get(this.index));
    }

    public boolean move() {
        if (hasNext()) {
            this.index++;
            return true;
        }
        return false;
    }

    public boolean hasNext() {
        if (this.index < this.data.size() - 1) {
            return true;
        }
        return false;
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
}
