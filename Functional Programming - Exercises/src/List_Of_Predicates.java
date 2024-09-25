import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class List_Of_Predicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int range = Integer.parseInt(scanner.nextLine());
        int [] values = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Predicate<Integer> divisible = num -> {
            for (int i = 0; i < values.length; i++) {
                if(num % values[i] != 0)
                    return false;
            }
            return true;
        };

        for (int i = 1; i <= range; i++) {
            if(divisible.test(i))
                System.out.print(i + " ");
        }

    }
}
