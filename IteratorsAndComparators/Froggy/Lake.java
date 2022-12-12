package JavaAdvanced.IteratorsAndComparators.Froggy;

import java.util.Iterator;

public class Lake implements Iterable<Integer> {
    private int[] stones;

    public Lake(int[] stones) {
        this.stones = stones;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int index;
            private int lastEvenIndex = stones.length % 2 == 0 ? stones.length - 2 : stones.length - 1;

            @Override
            public boolean hasNext() {
                return index < stones.length;
            }

            @Override
            public Integer next() {
                int element = stones[index];
                if (index == lastEvenIndex) {
                    index = 1;
                    return element = stones[lastEvenIndex];
                }
                index += 2;
                return element;
            }
        };
    }
}
