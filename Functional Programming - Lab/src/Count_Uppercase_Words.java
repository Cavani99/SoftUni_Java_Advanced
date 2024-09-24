import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class Count_Uppercase_Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] text = scanner.nextLine().split("\\s+");

        Predicate <String> checkUppercase = word -> Character.isUpperCase(word.charAt(0));
        ArrayList<String> numbers =new ArrayList<>();
        for (String s : text) {
            if (checkUppercase.test(s)) {
                numbers.add(s);
            }
        }

        System.out.println(numbers.size());
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

    }
}
