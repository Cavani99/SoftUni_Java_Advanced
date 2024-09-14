import java.util.Arrays;
import java.util.Scanner;

public class Wrong_Measurements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int [] [] matrix = new int[size][];

        for (int i = 0; i < matrix.length; i++) {
            int [] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[i] = arr;
        }

        int [] location = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int number = matrix[location[0]][location[1]];

        int [] [] fixedMatrix = new int[size][matrix[size - 1].length];
        for (int i = 0; i < matrix.length; i++) {
            int total = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == number){
                    if(i - 1 >= 0 && matrix[i - 1][j] != number)
                        total += matrix[i - 1][j];

                    if(i + 1 < matrix.length && matrix[i + 1][j] != number)
                        total += matrix[i + 1][j];

                    if(j - 1 >= 0 && matrix[i][j - 1] != number)
                        total += matrix[i][j - 1];

                    if(j + 1 < matrix[i].length && matrix[i][j + 1] != number)
                        total += matrix[i][j + 1];

                    fixedMatrix[i][j] = total;
                    total = 0;
                } else {
                    fixedMatrix[i][j] = matrix[i][j];
                }
            }
        }

        for (int i = 0; i < fixedMatrix.length; i++) {
            for (int j = 0; j < fixedMatrix[i].length; j++) {
                if(j == 0)
                    System.out.print(fixedMatrix[i][j]);
               else
                    System.out.print(" " + fixedMatrix[i][j]);
            }
            System.out.println();
        }

    }
}
