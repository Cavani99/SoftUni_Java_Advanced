import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.function.Predicate;

public class Predicate_Party {

    static Predicate<String> getAction(String command, String text) {
        Predicate<String> tester = null;
        switch (command){
            case "StartsWith":
                tester = x -> x.startsWith(text);
                break;
            case "EndsWith":
                tester = x -> x.endsWith(text);
                break;
            case "Length":
                int len = Integer.parseInt(text);
                tester = x -> x.length() == len;
                break;
        }

        return tester;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] values = scanner.nextLine().split("\\s+");

        ArrayList<String> people = new ArrayList<>(Arrays.asList(values));

        String [] command = scanner.nextLine().split("\\s+");
        while (!command[0].equals("Party!")){
           if(command[0].equals("Double")){
               ArrayList<String> add = new ArrayList<>();
               for (int i = 0; i < people.size(); i++) {
                   if(getAction(command[1], command[2]).test(people.get(i))){
                       add.add(people.get(i));
                   }
               }
               people.addAll(add);

           } else if (command[0].equals("Remove")) {
               Iterator<String> iterator = people.iterator();
               while (iterator.hasNext()) {
                   String person = iterator.next();
                   if (getAction(command[1], command[2]).test(person)) {
                       iterator.remove();
                   }
               }
           }
            command = scanner.nextLine().split("\\s+");
        }

        if(people.isEmpty()){
            System.out.println("Nobody is going to the party!");
        } else {
            people.sort(String::compareTo);
            String output = "";
            output = String.join(", ", people);
            System.out.println(output + " are going to the party!");
        }

    }
}
