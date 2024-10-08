import java.util.*;

public class Browser_History {

    public static void browserInstructions(){
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> browser = new ArrayDeque<>();
        String line = scanner.nextLine();
        String current = "";

        while(!line.equals("Home")){
            if(line.equals("back")){
                if(!browser.isEmpty()){
                    current = browser.pop();

                } else {
                    System.out.println("no previous URLs");
                    line = scanner.nextLine();
                    continue;
                }
            } else {
                if(!current.equals("")) {
                    browser.push(current);
                }
                current = line;
            }
            System.out.println(current);
            line = scanner.nextLine();
        }
    }

    public static void main(String[] args) {
        browserInstructions();
    }
}