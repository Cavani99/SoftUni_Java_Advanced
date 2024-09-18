import java.util.HashMap;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> elements = new HashMap<>();
        String [] text = scanner.nextLine().split("-");

        while (!text[0].equals("search")){
           String name = text[0];
           String number = text[1];

           elements.put(name, number);

           text = scanner.nextLine().split("-");
        }

        String name = scanner.nextLine();
        while (!name.equals("stop")){

            if(!elements.containsKey(name)){
                System.out.printf("Contact %s does not exist.\n", name);
            } else {
                System.out.printf("%s -> %s\n", name, elements.get(name));
            }

            name = scanner.nextLine();
        }

    }
}
