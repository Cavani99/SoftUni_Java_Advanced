package Stack_Iterator;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] command = scanner.nextLine().split(" ");

        List<Integer> iterator = null;
        while (!command[0].equals("END")){

            switch (command[0]){
                case "Push":
                    StringBuilder values = new StringBuilder();
                    for (int i = 1; i < command.length; i++) {
                        String[] numbers = command[i].split(",");
                        for (String number : numbers) {
                            values.append(number).append(" ");
                        }
                    }
                    if(command.length == 1)
                        iterator = new List<>();
                    else {
                        Integer[] stringList = Arrays.stream(values.toString().split("\\s+"))
                                .map(Integer::parseInt) // Parse each string to Integer
                                .toArray(Integer[]::new);

                        iterator = new List<>(stringList);
                    }
                    break;
                case "Pop":
                    iterator.pop();
                    break;
            }


            command = scanner.nextLine().split("\\s+");
        }

        for (int i = 0; i < 2; i++) {
            for (Integer num: iterator) {
                System.out.println(num);
            }
        }
    }
}
