package Generic_Box_of_Integer;

public class Generic_Box <T> {

    private final T value;

    Generic_Box(T type) {
        this.value = type;
    }

    @Override
    public String toString() {
        String cl = this.value.getClass().getName();

        return String.format("%s: %s", cl, this.value);
    }
}
