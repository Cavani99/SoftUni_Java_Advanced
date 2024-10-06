package Generic_Count_Method_Double;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        Swap_Box<Double> box = new Swap_Box<>();
        for (int i = 0; i < number; i++) {
            Double current = Double.parseDouble(scanner.nextLine());

            box.add(current);
        }
        Double compareValue = Double.parseDouble(scanner.nextLine());

        System.out.println(box.greater(compareValue));
    }
}
