import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class Find_The_Smallest_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] values = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayList<Integer> numbers =new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            numbers.add(values[i]);
        }

        Function<List<Integer>, Integer> smallest = list -> list.lastIndexOf(list.stream().min(Integer::compareTo).orElse(0));

        System.out.println(smallest.apply(numbers));

    }
}
