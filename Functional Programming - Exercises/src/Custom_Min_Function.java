import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class Custom_Min_Function {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Integer[] integerArray = Arrays.stream(numbers)
                .boxed()
                .toArray(Integer[]::new);

        Function<Integer [] , Integer> min =
                arr -> Arrays.stream(arr).min(Integer::compareTo).orElse(null);

        System.out.println(min.apply(integerArray));

    }
}
