package Generic_Scale;

public class Main {
    public static void main(String[] args) {
        Scale<Integer> integerScale = new Scale<>(1, 3);
        System.out.println(integerScale.getHeavier());

        Scale<String> strings = new Scale<>("ab", "z");
        System.out.println(strings.getHeavier());

    }
}
