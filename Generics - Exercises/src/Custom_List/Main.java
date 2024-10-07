package Custom_List;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Box<String> box = new Box<>();
        String [] command = scanner.nextLine().split("\\s+");
        while (!command[0].equals("END")){
            switch (command[0]){
                case "Add" :
                    box.add(command[1]);
                    break;
                case "Remove":
                    box.remove(Integer.parseInt(command[1]));
                    break;
                case "Contains":
                    System.out.println(box.contains(command[1]));
                    break;
                case "Greater":
                    System.out.println(box.greater(command[1]));
                    break;
                case "Swap":
                    box.swap(Integer.parseInt(command[1]), Integer.parseInt(command[2]));
                    break;
                case "Max":
                    System.out.println(box.getMax());
                    break;
                case "Min":
                    System.out.println(box.getMin());
                    break;
                case "Print":
                    box.printList();
                    break;
            }

            command = scanner.nextLine().split("\\s+");
        }
    }
}
