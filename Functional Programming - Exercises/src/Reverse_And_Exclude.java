import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Reverse_And_Exclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] values = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayList<Integer> numbers =new ArrayList<>();
        for (int i = values.length - 1; i >= 0; i--) {
            numbers.add(values[i]);
        }

        int division = Integer.parseInt(scanner.nextLine());
        numbers.removeIf( (num) -> num % division == 0);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }

    }
}
