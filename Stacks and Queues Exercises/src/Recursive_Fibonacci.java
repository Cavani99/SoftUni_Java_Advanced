import java.util.ArrayDeque;
import java.util.Scanner;

public class Recursive_Fibonacci {


    public static long getFibonaci(ArrayDeque<Long> queue, int number){

        if(number < 2){
            return 1L;
        } else{
            queue.offer(0L);
            queue.offer(1L);
            for (int i = 0; i < number; i++) {
                long sum = queue.poll() + queue.peek();
                queue.offer(sum);
            }
            queue.poll();
            return queue.peek();
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Long> queue = new ArrayDeque<>();
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(getFibonaci(queue, number));


    }
}
