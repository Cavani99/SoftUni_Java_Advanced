import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Simple_Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] tokens = scanner.nextLine().split("\\s+");
        ArrayDeque<String> calculator = new ArrayDeque<>();
        Collections.addAll(calculator, tokens);

        while (calculator.size() > 1){
            int first = Integer.parseInt(calculator.pop());
            String operation = calculator.pop();
            int second = Integer.parseInt(calculator.pop());

            switch (operation){
                case "+" :
                    calculator.push(String.valueOf(first + second));
                    break;
                case "-" :
                    calculator.push(String.valueOf(first - second));
                    break;
            }
        }

        System.out.println(calculator.pop());
    }
}
