import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class Sum_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] values = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayList<Integer> numbers =new ArrayList<>();

        for (int value : values) {
            numbers.add(value);
        }

        Function<String, Integer> count = text -> text.split(", ").length;
        Function<String, Integer> sum = x -> Integer.parseInt(x);


        int total = 0;
        int elements = count.apply(String.valueOf(numbers));
        for (int s : values) total += sum.apply(String.valueOf(s));

        System.out.println("Count = " + elements);
        System.out.println("Sum = " + total);
    }
}
