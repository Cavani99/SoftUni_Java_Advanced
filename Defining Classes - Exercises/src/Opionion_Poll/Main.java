package Opionion_Poll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        LinkedHashSet<Person> people = new LinkedHashSet<>();
        Person person;
        for (int i = 0; i < number; i++) {
            String[] info = scanner.nextLine().split("\\s+");
            person = new Person(info[0], Integer.parseInt(info[1]));
            people.add(person);
        }

       people.stream()
               .sorted(Comparator.comparing(Person::getName))
               .filter((p) -> p.getAge() > 30)
               .forEach(p -> System.out.println(String.format("%s - %d", p.getName(), p.getAge())));


    }

}
