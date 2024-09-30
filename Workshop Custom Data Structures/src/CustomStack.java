import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class CustomStack {
    private static final int INITIAL_CAPACITY = 4;
    private int [] items;
    private int size;
    private int capacity;

    public CustomStack() {
        this.items = new int[this.capacity];
        this.capacity = INITIAL_CAPACITY;
    }

    public int getSize() {
        return this.size;
    }

    private void resize() {
        this.capacity *= 2;
        int []copy = new int[this.capacity];

        for (int i = 0; i < this.items.length; i++) {
            copy[i] = this.items[i];
        }

        this.items = copy;
    }

    public void push(int element) {
        if (this.size == this.capacity) {
            this.resize();
        }

        this.items[this.size++] = element;
    }

    public int pop() {
        if(this.size == 0) {
            String message = "No elements in the stack";

            throw new NoSuchElementException(message);
        }

        int element = this.items[this.size - 1];
        this.size--;

        return element;
    }

    public int peek() {
        if(this.size == 0) {
            String message = "No elements in the stack";

            throw new NoSuchElementException(message);
        }

        return this.items[this.size - 1];
    }

    public void forEach(Consumer<Integer> consumer) {
        for (int i = 0; i < this.size; i++) {
            consumer.accept(this.items[i]);
        }
    }


}
