import java.util.Arrays;
import java.util.Scanner;

public class Positions_Of {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int matrixRows = dimensions[0];
        int matrixCols = dimensions[1];

        int [] [] matrix = new int[matrixRows][];
        for (int i = 0; i < matrixRows; i++) {
            int [] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[i] = arr;
        }

        int number = Integer.parseInt(scanner.nextLine());
        boolean numberFound = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(number == matrix[i][j]){
                    System.out.println(i + " " + j);
                    numberFound = true;
                }
            }
        }

        if(!numberFound)
            System.out.println("not found");

    }
}