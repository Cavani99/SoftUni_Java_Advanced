import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sets_of_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        ArrayList<Integer> repeated = new ArrayList<>();
        for (int i = 0; i < arr[0]; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if(list1.contains(number) ||  repeated.contains(number)){
                list1.remove(number);
                repeated.add(number);
            }
            else
                list1.add(number);
        }

        repeated = new ArrayList<>();
        for (int i = 0; i < arr[1]; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if(list2.contains(number) ||  repeated.contains(number)){
                list2.remove(number);
                repeated.add(number);
            }
            else
                list2.add(number);
        }

        ArrayList<Integer> repeatedElements = new ArrayList<>();
        if(list2.isEmpty()){
            System.out.println();
        } else {
            for (int i = 0; i < list2.size(); i++) {
                int current = list2.get(i);
                if(list1.contains(current))
                    repeatedElements.add(current);
            }

            for (int i = 0; i < repeatedElements.size(); i++) {
                if(i == 0)
                    System.out.print(repeatedElements.get(i));
                else
                    System.out.print(" " + repeatedElements.get(i));
            }
        }
    }
}
