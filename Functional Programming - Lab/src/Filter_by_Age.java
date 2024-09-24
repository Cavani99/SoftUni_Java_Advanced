import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Filter_by_Age {

    static Predicate<Integer> createTester(String condition, Integer age) {
        Predicate<Integer> tester = null;
        switch (condition) {
            case "younger":
                tester = x -> x <= age;
                break;
            case "older":
                tester = x -> x >= age;
                break;
        }
        return tester;
    }

    static Consumer<Map.Entry<String, Integer>> createPrinter(String format) {
        Consumer<Map.Entry<String, Integer>> printer = null;
        switch (format) {
            case "name age":
                printer = person -> System.out.printf("%s - %d%n",
                        person.getKey(), person.getValue());
                break;
            case "name":
                printer = person -> System.out.printf("%s%n",
                        person.getKey());
                break;
            case "age":
                printer = person -> System.out.printf("%s%n",
                        person.getValue());
                break;
        }
        return printer;
    }

    static void printFilteredStudent(
            LinkedHashMap<String, Integer> people,
            Predicate<Integer> tester,
            Consumer<Map.Entry<String, Integer>> printer) {
        for (Map.Entry<String, Integer> person : people.entrySet()) {
            if (tester.test(people.get(person.getKey())))
                printer.accept(person);
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        LinkedHashMap <String, Integer> people = new LinkedHashMap<>();
        for (int i = 0; i < number; i++) {
            String[] text = scanner.nextLine().split(", ");
            people.put(text[0], Integer.valueOf(text[1]));
        }

        String condition = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();
        Predicate<Integer> tester = createTester(condition, age);
        Consumer<Map.Entry<String, Integer>> printer = createPrinter(format);
        printFilteredStudent(people, tester, printer);

    }
}
