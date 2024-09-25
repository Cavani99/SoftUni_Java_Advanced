import java.util.Scanner;
import java.util.function.Predicate;

public class Predicate_For_Names {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        String [] values = scanner.nextLine().split("\\s+");

        Predicate<String > smaller = word -> word.length() <= size;

        for (int i = 0; i < values.length; i++) {
            if(smaller.test(values[i]))
                System.out.println(values[i]);
        }


    }
}
