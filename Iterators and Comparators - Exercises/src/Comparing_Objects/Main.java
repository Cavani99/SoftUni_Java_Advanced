package Comparing_Objects;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] command = scanner.nextLine().split("\\s+");

        ArrayList<Person> persons = new ArrayList<>();
        Person person;
        while (!command[0].equals("END")){
            person = new Person(command[0], Integer.parseInt(command[1]), command[2]);
            persons.add(person);

            command = scanner.nextLine().split("\\s+");
        }

        int equal = 0;
        int index = Integer.parseInt(scanner.nextLine());
        if(index >= persons.size())
            System.out.println("No matches");
        else {
            person = persons.get(index);
            for (int i = 0; i < persons.size(); i++) {
                int result = person.compareTo(persons.get(i));
                if(result == 0)
                    equal++;
            }

            System.out.println(String.format("%d %d %d", equal, persons.size() - equal, persons.size()));
        }


    }
}
