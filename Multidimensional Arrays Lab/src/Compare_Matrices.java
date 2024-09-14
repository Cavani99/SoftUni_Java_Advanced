import java.util.Arrays;
import java.util.Scanner;

public class Compare_Matrices {

    private  static String matricesAreEqual(int [] [] firstMatrix, int [] [] secondMatrix){
        if (firstMatrix.length != secondMatrix.length){
            return  "not equal";
        }
        for (int i = 0; i < firstMatrix.length; i++) {
            if (firstMatrix[i].length != secondMatrix[i].length)
                return "not equal";
            for (int j = 0; j < firstMatrix[i].length; j++) {
                if (firstMatrix[i][j] != secondMatrix[i][j])
                    return "not equal";
            }
        }
        return "equal";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int firstMatrixRows = dimensions[0];

        int [] [] firstMatrix = new int[firstMatrixRows][];
        for (int i = 0; i < firstMatrixRows; i++) {
            int [] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            firstMatrix[i] = arr;
        }

        dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int secondMatrixRows = dimensions[0];

        int [] [] secondMatrix = new int[secondMatrixRows][];
        for (int i = 0; i < secondMatrixRows; i++) {
            int [] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            secondMatrix[i] = arr;
        }

        System.out.println(matricesAreEqual(firstMatrix, secondMatrix));

    }
}