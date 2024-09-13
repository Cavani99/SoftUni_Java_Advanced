import java.util.Arrays;
import java.util.Scanner;

public class Print_Diagonals_of_Square_Matrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int [] [] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            int [] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[i] = arr;
        }

        StringBuilder diagonal = new StringBuilder(String.valueOf(matrix[0][0]));
        StringBuilder reverseDiagonal = new StringBuilder(String.valueOf(matrix[size - 1][0]));

        for (int i = 1; i < matrix.length; i++) {
            diagonal.append(" ").append(matrix[i][i]);
        }

        int col = 1;
        for (int i = matrix.length - 2; i >= 0; i--) {
            reverseDiagonal.append(" ").append(matrix[i][col]);
            col++;
        }

        System.out.println(diagonal);
        System.out.println(reverseDiagonal);

    }

}
