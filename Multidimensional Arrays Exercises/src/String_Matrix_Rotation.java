import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class String_Matrix_Rotation {

        public static void printMatrix(String [] [] matrix){
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if(matrix[i][j].equals("whitespace"))
                        System.out.print(" ");
                    else
                        System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
        }

    static String[][] rotate90(String[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Determine the dimensions of the rotated matrix
        int newRows = cols;
        int newCols = rows;

        // Create a new matrix for the rotated result
        String[][] rotatedMatrix = new String[newRows][newCols];

        // Initialize the rotated matrix with empty strings
        for (int i = 0; i < newRows; i++) {
            for (int j = 0; j < newCols; j++) {
                rotatedMatrix[i][j] = "";
            }
        }

        // Fill the rotated matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                rotatedMatrix[j][rows - 1 - i] = matrix[i][j];
            }
        }

        return rotatedMatrix;
    }


        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] rotation = scanner.nextLine().split("\\D+");
        int degrees = Integer.parseInt(rotation[1]);

        ArrayList <String> strings = new ArrayList<>();
        String command = scanner.nextLine();
        int longestText = 0;
        int elements = 0;
        while (!command.equals("END")){
            strings.add(command);

            elements++;
            if(command.length() > longestText)
                longestText = command.length();


            command = scanner.nextLine();
        }

        String[][] matrix = new String[elements][longestText];
        for (int i = 0; i < matrix.length; i++) {
            Arrays.fill(matrix[i], "whitespace");
        }

        for (int i = 0; i < strings.size(); i++) {
            String current = strings.get(i);
            for (int j = 0; j < current.length(); j++) {
                matrix[i][j] = String.valueOf(current.charAt(j));
            }
        }
        int rotations = degrees / 90 ;

        String[][] rotatedMatrix = matrix; // Start with the original matrix
        for (int i = 0; i < rotations; i++) {
            rotatedMatrix = rotate90(rotatedMatrix);
        }

        printMatrix(rotatedMatrix);
    }
}
