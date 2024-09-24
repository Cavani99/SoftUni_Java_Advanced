import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class Find_Evens_or_Odds {

    static Predicate<Integer> evenOrOdds(String condition) {
        Predicate<Integer> tester = null;
        switch (condition) {
            case "odd":
                tester = x -> x % 2 != 0;
                break;
            case "even":
                tester = x -> x % 2 == 0;
                break;
        }
        return tester;
    }

    static void printFilteredNumbers(
            int [] range,
            Predicate<Integer> tester) {
        for (int i = range[0]; i <= range[1] ; i++) {
            if(tester.test(i))
                System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] range = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String condition = scanner.nextLine();
        Predicate<Integer> tester = evenOrOdds(condition);
        printFilteredNumbers(range, tester);
    }
}
