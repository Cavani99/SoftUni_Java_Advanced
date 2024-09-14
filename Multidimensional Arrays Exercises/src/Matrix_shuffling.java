import java.util.Arrays;
import java.util.Scanner;

public class Matrix_shuffling {

    public static void printMatrix(String [] [] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(j == 0)
                    System.out.print(matrix[i][j]);
                else
                    System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String[][] matrix = new String[dimensions[0]][dimensions[1]];
        for (int i = 0; i < matrix.length; i++) {
            String[] arr = scanner.nextLine().split("\\s+");

            matrix[i] = arr;
        }

        String [] command = scanner.nextLine().split("\\s+");
        while (!command[0].equals("END")){
            if(!command[0].equals("swap") || command.length != 5 ||
            Integer.parseInt(command[1]) > matrix.length || Integer.parseInt(command[2]) > matrix.length
            || Integer.parseInt(command[3]) > matrix.length || Integer.parseInt(command[4]) > matrix.length ||

            Integer.parseInt(command[1]) < 0 || Integer.parseInt(command[2]) < 0
            || Integer.parseInt(command[3]) < 0 || Integer.parseInt(command[4]) < 0
            )
                System.out.println("Invalid input!");
            else {
                String oldValue = matrix[Integer.parseInt(command[1])][ Integer.parseInt(command[2])];
                matrix[Integer.parseInt(command[1])][ Integer.parseInt(command[2])] = matrix[Integer.parseInt(command[3])][ Integer.parseInt(command[4])];
                matrix[Integer.parseInt(command[3])][ Integer.parseInt(command[4])] = oldValue;

                printMatrix(matrix);
            }

            command = scanner.nextLine().split("\\s+");
        }

    }
}
