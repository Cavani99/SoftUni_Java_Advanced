import java.util.*;

public class Custom_Comparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] values = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayList<Integer> numbers =new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            numbers.add(values[i]);
        }

        Comparator<Integer> comparator = (n1, n2) -> {
            if (n1 % 2 == 0 && n2 % 2 == 0)  return n1.compareTo(n2);
            if (n1 % 2 != 0 && n2 % 2 != 0)  return n1.compareTo(n2);

            if (n1 % 2 == 0) return -1;
            return 1;
        };

        numbers.sort(comparator);

        for (int i = 0; i < values.length; i++) {
            System.out.print(numbers.get(i) + " ");
        }

    }
}
