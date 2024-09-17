import java.util.ArrayList;
import java.util.Scanner;

public class Unique_Usernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        ArrayList<String> texts = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            String text = scanner.nextLine();

            if(!texts.contains(text)){
                texts.add(text);
            }
        }

        for (String text : texts) {
            System.out.println(text);
        }
    }
}