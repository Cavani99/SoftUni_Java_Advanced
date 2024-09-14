import java.util.Arrays;
import java.util.Scanner;

public class Matrix_of_Palindromes {

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

        int [] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String [] [] matrix = new String[dimensions[0]][dimensions[1]];

        StringBuilder currentValue = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                char row = (char) ('a' + i);
                char col = (char) (row + j);
                currentValue.append(row);
                currentValue.append(col);
                currentValue.append(row);

                matrix[i][j] = String.valueOf(currentValue);
                currentValue.delete(0, currentValue.length());
            }

        }

        printMatrix(matrix);

    }
}
