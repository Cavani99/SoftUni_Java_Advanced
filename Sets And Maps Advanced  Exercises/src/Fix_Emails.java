import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fix_Emails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, String> elements = new LinkedHashMap<>();

        String person = scanner.nextLine();
        while (!person.equals("stop")){
            String email = scanner.nextLine();
            Pattern pattern = Pattern.compile("@[\\w.-]+\\.(\\w+)");
            Matcher matcher = pattern.matcher(email);


            if (matcher.find()) {
                String domain = matcher.group(1);
                if (!domain.equalsIgnoreCase("us") && !domain.equalsIgnoreCase("uk") && !domain.equalsIgnoreCase("com")) {
                    elements.put(person, email);
                }
            }

            person = scanner.nextLine();
        }

        for(Map.Entry<String, String> entry: elements.entrySet()){

            System.out.printf("%s -> %s\n", entry.getKey(), entry.getValue());
        }

    }
}
