package Generic_Swap_Method_Integer;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        Swap_Box<Integer> box = new Swap_Box<>();
        for (int i = 0; i < number; i++) {
            int current = Integer.parseInt(scanner.nextLine());

            box.add(current);
        }
        int [] indexes = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        box.swap(indexes[0], indexes[1]);
        box.printList();
    }
}
