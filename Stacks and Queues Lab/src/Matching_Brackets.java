import java.util.ArrayDeque;
import java.util.Scanner;

public class Matching_Brackets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();
        String tokens = scanner.nextLine();

        for (int i = 0; i < tokens.length(); i++) {
            String token = String.valueOf(tokens.charAt(i));

            if(token.equals("(")){
                stack.push(String.valueOf(i));
            } else if (token.equals(")")) {
                int startIndex = Integer.parseInt(stack.pop());
                String contents = tokens.substring(startIndex, i + 1);
                System.out.println(contents);
            }
        }

    }
}
