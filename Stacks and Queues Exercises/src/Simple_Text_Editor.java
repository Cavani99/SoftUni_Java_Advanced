import java.util.ArrayDeque;
import java.util.Scanner;

public class Simple_Text_Editor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> queue = new ArrayDeque<>();
        int commands = Integer.parseInt(scanner.nextLine());
        StringBuilder text = new StringBuilder();

        for (int i = 0; i < commands; i++) {
            String [] command = scanner.nextLine().split("\\s+");

            if(command[0].equals("1")){

                queue.offer(text.toString());
                text.append(command[1]);
            } else if(command[0].equals("2")){
                queue.offer(text.toString());

                int characters = Integer.parseInt(command[1]);
                text.delete(text.length()-characters, text.length());

            } else if(command[0].equals("3")){
                int position = Integer.parseInt(command[1]) - 1;
                System.out.println(text.charAt(position));
            } else if(command[0].equals("4")){
                text = new StringBuilder(queue.pollLast());

            }
        }

    }
}