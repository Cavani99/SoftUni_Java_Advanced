import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Hot_Potato {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();
        String [] children = scanner.nextLine().split("\\s+");
        int tosses = Integer.parseInt(scanner.nextLine());

        Collections.addAll(stack, children);

        while (stack.size() > 1){
            for (int i = 1; i < tosses; i++) {
                stack.offer(stack.poll());
            }

            System.out.println("Removed " + stack.pollFirst());
        }

        System.out.println("Last is " + stack.pollFirst());

    }
}
