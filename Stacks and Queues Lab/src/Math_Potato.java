import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Math_Potato {

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<String> stack = new PriorityQueue<>();
        String [] children = scanner.nextLine().split("\\s+");
        int tosses = Integer.parseInt(scanner.nextLine());

        Collections.addAll(stack, children);

        int cycle = 1;
        while (stack.size() > 1){
            for (int i = 1; i < tosses; i++) {
                stack.offer(stack.poll());
            }

            if(isPrime(cycle)){
                System.out.println("Prime " + stack.peek());
            } else {
                System.out.println("Removed " + stack.poll());
            }

            cycle++;
        }

        System.out.println("Last is " + stack.poll());
    }
}
