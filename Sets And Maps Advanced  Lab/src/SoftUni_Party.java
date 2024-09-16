import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class SoftUni_Party {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> VIP = new TreeSet<>();
        TreeSet<String> regulars = new TreeSet<>();

        String command = scanner.nextLine();
        while (!command.equals("PARTY")){
            char ch = command.charAt(0);
            if(Character.isDigit(ch)){
                VIP.add(command);
            } else {
                regulars.add(command);
            }

            command = scanner.nextLine();
        }

        command = scanner.nextLine();
        while (!command.equals("END")){
            char ch = command.charAt(0);
            if(Character.isDigit(ch)){
                VIP.remove(command);
            } else {
                regulars.remove(command);
            }

            command = scanner.nextLine();
        }

        int size = VIP.size();
        size += regulars.size();
        System.out.println(size);

        Iterator<String> iterator = VIP.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        iterator = regulars.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
