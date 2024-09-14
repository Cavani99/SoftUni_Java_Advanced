import java.util.Arrays;
import java.util.Scanner;

public class Diagonal_Difference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int [] [] matrix = new int[size][size];
        for (int i = 0; i < matrix.length ; i++) {
            int [] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[i] = arr;
        }


        int diagonalSum = 0;
        int index = 0;
        while (index < matrix.length){
            diagonalSum += matrix[index][index];
            index++;
        }

        int reverseDiagonalSum = 0;
        int rowIndex = 0;
        index = matrix.length - 1;
        while (rowIndex < matrix.length){
            reverseDiagonalSum += matrix[rowIndex][index];
            rowIndex++;
            index--;
        }

        System.out.println(Math.abs(diagonalSum - reverseDiagonalSum));

    }
}
