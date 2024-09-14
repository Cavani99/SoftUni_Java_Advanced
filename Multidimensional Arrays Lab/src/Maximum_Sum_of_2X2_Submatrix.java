import java.util.Arrays;
import java.util.Scanner;

public class Maximum_Sum_of_2X2_Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] dimensions = scanner.nextLine().split(", ");

        int [] [] matrix = new int[Integer.parseInt(dimensions[0])][Integer.parseInt(dimensions[1])];

        for (int i = 0; i < matrix.length; i++) {
            int [] arr = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[i] = arr;
        }

        int total = 0;
        int current = 0;
        int row = -1;
        int col = -1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i + 1 < matrix.length && j + 1 < matrix[i].length){
                    current += matrix[i][j];
                    current += matrix[i + 1][j];
                    current += matrix[i][j + 1];
                    current += matrix[i + 1][j + 1];
                }
                if(current > total){
                    total = current;
                    row = i;
                    col = j;
                }

                current = 0;
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0)
                    System.out.print(matrix[row + i][col + j]);
                else
                    System.out.print(" " + matrix[row + i][col + j]);
            }
            System.out.println();
        }

        System.out.println(total);

    }
}
