import java.util.Scanner;
import java.util.function.Consumer;

public class Knights_of_Honor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] names = scanner.nextLine().split("\\s+");

        Consumer<String []> print = arr -> {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Sir " + arr[i]);
            }
        };

        print.accept(names);

    }
}
