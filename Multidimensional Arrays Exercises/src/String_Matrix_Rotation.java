import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class String_Matrix_Rotation {

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

        String [] [] matrix;
        if(degrees % 180 == 0){
            matrix = new String[elements][longestText];
        } else {
            matrix = new String[longestText][elements];
        }

        System.out.println(Arrays.deepToString(matrix));

    }
}
