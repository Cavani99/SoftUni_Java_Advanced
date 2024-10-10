package Froggy;


import java.util.Iterator;
import java.util.List;

public class Lake<Integer> implements Iterator<Integer>, Iterable<Integer> {

    @Override
    public boolean hasNext() {
        return this.integers.size() > this.counter + 1;
    }

    @Override
    public Integer next() {
        return integers.get(counter++);
    }

    private final class Frog implements Iterator<Integer> {
        private int counter = 0;

        @Override
        public boolean hasNext() {
            return integers.size() > counter;
        }

        @Override
        public Integer next() {
            return integers.get(counter++);
        }
    }

    private int counter = 0;
    private List<Integer> integers;


    public Lake(Integer... integers){
        this.integers = List.of(integers);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }
}
