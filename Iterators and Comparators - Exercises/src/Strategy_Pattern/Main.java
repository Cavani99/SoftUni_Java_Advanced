package Strategy_Pattern;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        TreeSet<Person> peopleName = new TreeSet<>(new NameComparator());
        TreeSet<Person> peopleAge = new TreeSet<>(new AgeComparator());
        int number = Integer.parseInt(scanner.nextLine());
        Person person;
        for (int i = 0; i < number; i++) {
            String [] values = scanner.nextLine().split("\\s+");
            person = new Person(values[0], Integer.parseInt(values[1]));

            peopleName.add(person);
            peopleAge.add(person);
        }

        for (Person p: peopleName) {
            System.out.println(p.getName() + " " + p.getAge());
        }
        for (Person p: peopleAge) {
            System.out.println(p.getName() + " " + p.getAge());
        }
    }
}
