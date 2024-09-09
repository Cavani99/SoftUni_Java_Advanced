import java.util.ArrayDeque;
import java.util.Scanner;

public class Decimal_To_Binary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();

        int number = Integer.parseInt(scanner.nextLine());
        if(number == 0){
            System.out.println(0);
        } else {
            while (number > 0){
                stack.push(String.valueOf(number % 2));
                number /= 2;
            }

            while (!stack.isEmpty()){
                System.out.print(stack.pop());
            }
        }

    }
}
