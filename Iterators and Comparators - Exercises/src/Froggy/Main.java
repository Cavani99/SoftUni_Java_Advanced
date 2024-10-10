package Froggy;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] command = scanner.nextLine().split(", ");

        Lake<Integer> iterator = null;
        while (!command[0].equals("END")){
            Integer[] stringList = Arrays.stream(command)
                    .map(Integer::parseInt) // Parse each string to Integer
                    .toArray(Integer[]::new);



            iterator = new Lake<>(stringList);


            command = scanner.nextLine().split(", ");
        }

        ArrayList<Integer> stringBuilder = new ArrayList<>();
        int index = 0;
        for (Integer num: iterator) {
            if(index % 2 == 0){
                stringBuilder.add(num);
            }
            index++;
        }

        index = 0;
        for (Integer num: iterator) {
            if(index % 2 != 0){
                stringBuilder.add(num);
            }
            index++;
        }

        System.out.println(String.join(", ", stringBuilder.stream().map(String::valueOf).toArray(String[]::new)));
    }
}
