import java.util.*;

public class Count_Symbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        TreeMap<Character, Integer> elements = new TreeMap<>();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if(elements.containsKey(ch)){
                elements.put(ch, elements.get(ch) + 1);
            } else {
                elements.put(ch, 1);
            }
        }

        for(Map.Entry<Character, Integer> entry: elements.entrySet()){
            char symbol = entry.getKey();
            int amount = entry.getValue();

            System.out.printf("%c: %d time/s\n", symbol, amount);
        }

    }

}
