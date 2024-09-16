import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Parking_Lot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet <String> set = new LinkedHashSet<>();
        String [] info = scanner.nextLine().split(", ");

        while (!info[0].equals("END")){
            if(info[0].equals("IN"))
                set.add(info[1]);
            else
                set.remove(info[1]);

            info = scanner.nextLine().split(", ");
        }

        if(set.isEmpty())
            System.out.println("Parking Lot is Empty");
        else {
            Iterator<String> iterator = set.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }

    }
}