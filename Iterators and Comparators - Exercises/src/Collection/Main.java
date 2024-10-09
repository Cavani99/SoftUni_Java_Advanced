package Collection;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] command = scanner.nextLine().split("\\s+");

        List<String> iterator = null;
        while (!command[0].equals("END")){

            switch (command[0]){
                case "Create":
                    StringBuilder values = new StringBuilder();
                    for (int i = 1; i < command.length; i++) {
                        values.append(command[i]).append(" ");
                    }
                    if(command.length == 1)
                        iterator = new List<>();
                    else {
                        String [] stringList = values.toString().split("\\s+");
                        iterator = new List<>(stringList);
                    }
                    break;
                case "Move":
                    System.out.println(iterator.move());
                    break;
                case "Print":
                    iterator.print();
                    break;
                case "HasNext":
                    System.out.println(iterator.hasNext());
                    break;
                case "PrintAll":
                    System.out.println(String.join(" ", iterator));
                    break;

            }


            command = scanner.nextLine().split("\\s+");
        }

    }
}
