import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sort_Even_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] values = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayList <Integer> numbers =new ArrayList<>();

        for (int value : values) {
            numbers.add(value);
        }
        
        numbers.removeIf(num -> num % 2 != 0);
        for (int i = 0; i < numbers.size(); i++) {
            if(i == 0)
                System.out.print(numbers.get(i));
            else
                System.out.print(", " + numbers.get(i));
        }
        System.out.println();

        numbers.sort(Integer::compareTo);
        for (int i = 0; i < numbers.size(); i++) {
            if(i == 0)
                System.out.print(numbers.get(i));
            else
                System.out.print(", " + numbers.get(i));
        }

    }
}