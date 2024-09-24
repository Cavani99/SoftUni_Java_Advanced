import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Applied_Arithmetics {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] values = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayList<Integer> numbers =new ArrayList<>();
        for (Integer s : values) {
           numbers.add(s);
        }

        Consumer<ArrayList<Integer> > add =
                arr -> {
                    for (int i = 0; i < arr.size(); i++) {
                        arr.set(i, arr.get(i) + 1);
                    }
                };

        Consumer<ArrayList<Integer> > subtract =
                arr -> {
                    for (int i = 0; i < arr.size(); i++) {
                        arr.set(i, arr.get(i) - 1);
                    }
                };

        Consumer<ArrayList<Integer> > multiply =
                arr -> {
                    for (int i = 0; i < arr.size(); i++) {
                        arr.set(i, arr.get(i) * 2);
                    }
                };

        Consumer<ArrayList<Integer> > print =
                arr -> {
                    for (int i = 0; i < arr.size(); i++) {
                        System.out.print(arr.get(i) + " ");
                    }
                    System.out.println();
                };


        String command = scanner.nextLine();
        while (!command.equals("end")){
            switch (command){
                case "add":
                    add.accept(numbers);
                    break;
                case "print":
                    print.accept(numbers);
                    break;
                case "subtract":
                    subtract.accept(numbers);
                    break;
                case "multiply":
                    multiply.accept(numbers);
                    break;
            }

            command = scanner.nextLine();
        }
    }
}
