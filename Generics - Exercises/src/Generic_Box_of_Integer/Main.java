package Generic_Box_of_Integer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            int value = Integer.parseInt(scanner.nextLine());

            Generic_Box<Integer> box = new Generic_Box<>(value);
            System.out.println(box.toString());
        }

    }
}
