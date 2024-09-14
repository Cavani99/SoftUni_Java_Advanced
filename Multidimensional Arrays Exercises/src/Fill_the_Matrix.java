import java.util.Scanner;

public class Fill_the_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] commands = scanner.nextLine().split(", ");

        int [] [] matrix = new int[Integer.parseInt(commands[0])][Integer.parseInt(commands[0])];

        if(commands[1].equals("A")){
            int index = 1;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[j][i] = index;
                    index++;
                }
            }
        } else  if(commands[1].equals("B")){
            int index = 1;
            for (int i = 0; i < matrix.length; i++) {
                if(i % 2 == 0) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        matrix[j][i] = index;
                        index++;
                    }
                } else {
                    for (int j = matrix.length - 1; j >= 0; j--) {
                        matrix[j][i] = index;
                        index++;
                    }
                }
            }
        }

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
}