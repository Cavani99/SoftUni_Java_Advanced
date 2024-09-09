import java.util.ArrayDeque;
import java.util.Scanner;

public class Printer_Queue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();
        String line = scanner.nextLine();

        while(!line.equals("print")){
            if(line.equals("cancel")){
                String removedFile = stack.pollFirst();

                if(removedFile == null){
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + removedFile);
                }

            } else {
                stack.offer(line);
            }

            line = scanner.nextLine();
        }

        while(!stack.isEmpty()){
            System.out.println(stack.pollFirst());
        }


    }
}
