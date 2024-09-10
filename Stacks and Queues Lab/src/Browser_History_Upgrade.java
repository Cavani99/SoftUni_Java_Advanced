import java.util.ArrayDeque;
import java.util.Scanner;

public class Browser_History_Upgrade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> browser = new ArrayDeque<>();
        ArrayDeque<String> forwardPages = new ArrayDeque<>();
        String line = scanner.nextLine();
        String current = "";

        while(!line.equals("Home")){
            if(line.equals("back")){
                if(!browser.isEmpty()){
                    forwardPages.addFirst(current);
                    current = browser.pop();

                } else {
                    System.out.println("no previous URLs");
                    line = scanner.nextLine();
                    continue;
                }
            } else if (line.equals("forward")) {
                if(!forwardPages.isEmpty()){
                    browser.addFirst(current);
                    current = forwardPages.pop();

                } else {
                    System.out.println("no next URLs");
                    line = scanner.nextLine();
                    continue;
                }
            } else {
                if(!current.equals("")) {
                    browser.push(current);
                    forwardPages.clear();
                }
                current = line;
            }
            System.out.println(current);
            line = scanner.nextLine();
        }
    }
}
