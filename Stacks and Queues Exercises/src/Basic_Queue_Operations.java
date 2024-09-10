import java.util.ArrayDeque;
import java.util.Scanner;

public class Basic_Queue_Operations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        String [] commands = scanner.nextLine().split("\\s+");
        String [] elements = scanner.nextLine().split("\\s+");

        int pushElements = Integer.parseInt(commands[0]);
        int popElements = Integer.parseInt(commands[1]);
        int presentElement = Integer.parseInt(commands[2]);

        for (int i = 0; i < pushElements; i++) {
            if(elements.length >= i)
                queue.add(Integer.valueOf(elements[i]));
        }

        for (int i = 0; i < popElements; i++) {
            if(!queue.isEmpty())
                queue.poll();
        }

        if(queue.isEmpty()){
            System.out.println("0");
        }
        else if(queue.contains(presentElement)){
            System.out.println("true");
        } else {
            int smallest = Integer.MAX_VALUE;
            int current;
            while (!queue.isEmpty()){
                current = queue.pop();

                if(current < smallest)
                    smallest = current;
            }

            System.out.println(smallest);
        }


    }
}
