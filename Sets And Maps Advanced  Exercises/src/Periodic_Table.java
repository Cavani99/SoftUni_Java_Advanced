import java.util.*;

public class Periodic_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        TreeSet <String> elements = new TreeSet<>();
        for (int i = 0; i < number; i++) {
            String [] arr = scanner.nextLine().split("\\s+");

            elements.addAll(Arrays.asList(arr));
        }

        for (String element : elements) {
            System.out.print(element + " ");
        }

    }

}
