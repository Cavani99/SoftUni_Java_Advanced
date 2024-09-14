import java.util.Scanner;

public class Intersection_of_Two_Matrices {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        String [] [] matrix = new String[number][secondNumber];
        String [] [] secondMatrix = new String[number][secondNumber];

        for (int i = 0; i < number; i++) {
            String [] arr = scanner.nextLine().split("\\s+");

            matrix[i] = arr;
        }

        for (int i = 0; i < number; i++) {
            String [] arr = scanner.nextLine().split("\\s+");

            secondMatrix[i] = arr;
        }

        String [] [] compareMatrix = new String[number][secondNumber];
        for (int i = 0; i < compareMatrix.length; i++) {
            for (int j = 0; j < compareMatrix[i].length; j++) {
                if(matrix[i][j].equals(secondMatrix[i][j]))
                    compareMatrix[i][j] = matrix[i][j];
                else
                    compareMatrix[i][j] = "*";

                if(j == 0)
                    System.out.print(compareMatrix[i][j]);
                else
                    System.out.print(" " + compareMatrix[i][j]);

            }
            System.out.println();
        }



    }

}
