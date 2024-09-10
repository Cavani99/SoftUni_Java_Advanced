import java.util.ArrayDeque;
import java.util.Scanner;

public class Maximum_Element {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int commands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < commands; i++) {
            String [] command = scanner.nextLine().split("\\s+");

            if(command[0].equals("1")){
                stack.push(Integer.valueOf(command[1]));
            } else if(command[0].equals("2")){
                stack.pop();
            } else {
                int biggest = Integer.MIN_VALUE;
                int current;

                for (Integer integer : stack) {
                    current = integer;

                    if (current > biggest)
                        biggest = current;

                }

                System.out.println(biggest);
            }
        }

    }
}
