import java.util.Scanner;
import java.util.function.Consumer;

public class Consumer_Print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] names = scanner.nextLine().split("\\s+");

        Consumer<String []> print = arr -> {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        };

        print.accept(names);

    }
}