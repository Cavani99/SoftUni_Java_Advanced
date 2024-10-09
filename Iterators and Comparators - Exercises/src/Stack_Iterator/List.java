package Stack_Iterator;


import java.util.ArrayDeque;
import java.util.Iterator;

public class List<Integer> implements Iterable<Integer> {


    private final class StackIterator implements Iterator<Integer> {
        private ArrayDeque<Integer> tempStack = new ArrayDeque<>(numbers);

        @Override
        public boolean hasNext() {
            return !tempStack.isEmpty();
        }

        @Override
        public Integer next() {
            return tempStack.pop();
        }
    }

    private ArrayDeque<Integer> numbers;


    public void pop(){
        if(!this.numbers.isEmpty()) {
            this.numbers.pop();

        } else {
            System.out.println("No elements");
        }
    }

    public List(Integer... numbers){
        this.numbers = new ArrayDeque<>();
        for (int i = 0; i < numbers.length; i++) {
            this.numbers.push(numbers[i]);
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new StackIterator();
    }
}
