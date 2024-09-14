import java.util.Arrays;
import java.util.Scanner;

public class Maximal_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int [] [] matrix = new int[dimensions[0]][dimensions[1]];
        for (int i = 0; i < matrix.length; i++) {
            int [] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[i] = arr;
        }

        int max = 0;
        int current = 0;
        int startRow = 0;
        int startCol = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i + 2 < matrix.length && j + 2 < matrix[i].length){
                    for (int k = i; k <= i + 2; k++) {
                        for (int l = j; l <=  j + 2; l++) {
                           current += matrix[k][l];
                        }
                    }
                    if(current > max){
                        max = current;
                        startRow = i;
                        startCol = j;
                    }
                }
                current = 0;
            }
        }

        System.out.println("Sum = " + max);
        for (int i = startRow; i <= startRow + 2; i++) {
            for (int j = startCol; j <= startCol + 2; j++) {
                if(j == 0)
                    System.out.print(matrix[i][j]);
                else
                    System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
    }
}
