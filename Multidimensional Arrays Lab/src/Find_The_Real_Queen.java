import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Find_The_Real_Queen {

    public static boolean isRealQueen(String [] [] matrix, int row, int col){

        for (int i = 0; i < matrix.length; i++) {
            //same row
            if(matrix[row][i].equals("q") && i != col)
                return false;
            //same col
            if(matrix[i][col].equals("q") && i != row)
                return false;
        }


        //northwest diagonal
        int index = 1;
        while(row - index >= 0 && col - index >= 0){
            if(matrix[row - index][col - index].equals("q"))
                return false;
            index++;
        }

        //southeast diagonal
        index = 1;
        while(row + index < matrix.length && col + index < matrix.length ){
            if(matrix[row + index][col + index].equals("q"))
                return false;
            index++;
        }

        //northeast diagonal
        int rowIndex = row - 1;
        for (int i = col + 1; i < matrix.length; i++) {
            if(rowIndex >= 0 && matrix[rowIndex][i].equals("q"))
                return false;

            rowIndex--;
        }

        //southeast diagonal
        int colIndex = col - 1;
        for (int i = row + 1; i < matrix.length; i++) {
            if(colIndex >= 0 && matrix[i][colIndex].equals("q"))
                return false;

            colIndex--;
        }

        return  true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] [] matrix = new String[8][8];

        for (int i = 0; i < matrix.length; i++) {
            String [] arr = scanner.nextLine().split("\\s+");

            matrix[i] = arr;
        }

        boolean queenFound = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
               if(matrix[i][j].equals("q")){
                   if(isRealQueen(matrix, i, j)){
                       System.out.println(i + " " + j);
                       queenFound = true;
                       break;
                   }
               }
            }
            if(queenFound)
                break;
        }

    }

}
