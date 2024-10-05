package Generic_Box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            String value = scanner.nextLine();
            value = String.valueOf(new Generic_Box<>(value));

            System.out.println(value.toString());
        }

    }
}
