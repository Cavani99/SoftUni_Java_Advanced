import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Balanced_Parentheses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Character> queue = new ArrayDeque<>();
        String elements = scanner.nextLine();

        if(elements.length() % 2 != 0 || elements.isEmpty()){
            System.out.println("NO");
        } else {
            for (int i = 0; i < elements.length(); i++) {
                char ch = elements.charAt(i);
                if(ch == '{' || ch == '[' || ch == '('){
                    queue.push(ch);
                } else {
                    switch (ch) {
                        case ')':
                            if (queue.peek().equals('('))
                                queue.pop();
                            break;
                        case ']':
                            if (queue.peek().equals('['))
                                queue.pop();
                            break;
                        case '}':
                            if (queue.peek().equals('{'))
                                queue.pop();
                            break;
                    }
                }
            }
            if (queue.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
