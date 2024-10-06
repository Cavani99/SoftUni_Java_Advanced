package Generic_Count_Method_String;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        Swap_Box<String> box = new Swap_Box<>();
        for (int i = 0; i < number; i++) {
            String current = scanner.nextLine();

            box.add(current);
        }
        String compareValue = scanner.nextLine();

        System.out.println(box.greater(compareValue));
    }
}
