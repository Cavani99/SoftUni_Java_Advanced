import java.util.*;

public class Reverse_Numbers_with_a_Stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String [] tokens = scanner.nextLine().split("\\s+");

        for (String token : tokens) {
            stack.push(Integer.parseInt(token));
        }

        boolean first = true;
        while (!stack.isEmpty()){
            if(first){
                System.out.print(stack.pop());
                first = false;
            } else {
                System.out.print(" " + stack.pop());
            }
        }


    }
}