import java.util.ArrayDeque;
import java.util.Scanner;

public class Simple_Text_Editor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> queue = new ArrayDeque<>();
        int commands = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> prev =  new ArrayDeque<>();
        ArrayDeque<String> copy =  new ArrayDeque<>();

        for (int i = 0; i < commands; i++) {
            String [] command = scanner.nextLine().split("\\s+");

            if(command[0].equals("1")){

                //retrieve information before operation
                if(queue.isEmpty()){
                    prev.offer("");
                } else {
                    StringBuilder queueInfo = new StringBuilder();
                    copy = queue.clone();
                    while (!queue.isEmpty()){
                        queueInfo.append(queue.poll());
                    }
                    queue = copy.clone();
                    prev.offer(String.valueOf(queueInfo));
                }

                //operation
                String text = command[1];
                for (int j = 0; j < text.length(); j++) {
                  queue.offer(String.valueOf(text.charAt(j)));
                }
            } else if(command[0].equals("2")){
                StringBuilder text = new StringBuilder();
                copy = queue.clone();
               while (!queue.isEmpty()){
                    text.append(queue.poll());
                }
                queue = copy.clone();
                for (int j = 0; j < Integer.parseInt(command[1]); j++) {
                    if(!queue.isEmpty()){
                        queue.pollLast();
                    }
                }
                prev.offer(text.toString());
            } else if(command[0].equals("3")){
                ArrayDeque<String> copyQueue = queue.clone();

                for (int j = 0; j < Integer.parseInt(command[1]) - 1; j++) {
                    if(!queue.isEmpty())
                        queue.pollFirst();
                }
                System.out.println(queue.pollFirst());
                queue = copyQueue.clone();
            } else if(command[0].equals("4")){
                String text = prev.poll();
                queue.clear();

                for (int j = 0; j < text.length(); j++) {
                    queue.offer(String.valueOf(text.charAt(j)));
                }

            }
        }


    }
}
