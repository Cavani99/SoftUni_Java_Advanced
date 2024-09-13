import java.util.Arrays;
import java.util.Scanner;

public class Sum_Matrix_Elements {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] dimensions = scanner.nextLine().split(", ");

        System.out.println(dimensions[0]);
        System.out.println(dimensions[1]);

        int [] [] matrix = new int[Integer.parseInt(dimensions[0])][Integer.parseInt(dimensions[1])];

        for (int i = 0; i < matrix.length; i++) {
            int [] arr = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[i] = arr;
        }

        int total = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                total += matrix[i][j];
            }
        }

        System.out.println(total);

    }

}
