import java.util.*;

public class Hands_Of_Cards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> elements = new LinkedHashMap<>();
        String [] hand = scanner.nextLine().split(": ");
        while (!hand[0].equals("JOKER")){
            ArrayList<String> cards;
            String [] cardsArray = hand[1].split(", ");
            if(!elements.containsKey(hand[0])){
                cards = new ArrayList<>();
                for (int i = 0; i < cardsArray.length; i++) {
                    if(!cards.contains(cardsArray[i]))
                        cards.add(cardsArray[i]);
                }

            } else {
                cards = elements.get(hand[0]);
                for (int i = 0; i < cardsArray.length; i++) {
                    if(!cards.contains(cardsArray[i]))
                        cards.add(cardsArray[i]);
                }

            }
            elements.put(hand[0], cards);

            hand = scanner.nextLine().split(": ");
        }

        for(Map.Entry<String, ArrayList<String>> entry: elements.entrySet()){
            int total = getTotal(entry);

            System.out.printf("%s: %d\n", entry.getKey(), total);
        }

    }

    private static int getTotal(Map.Entry<String, ArrayList<String>> entry) {
        ArrayList<String> cards = entry.getValue();
        int total = 0;

        for (String card : cards) {
            String cardValue;
            String cardType;

            if (card.length() > 2) {
                cardValue = card.charAt(0) + String.valueOf(card.charAt(1));
                cardType = String.valueOf(card.charAt(2));
            } else {
                cardValue = String.valueOf(card.charAt(0));
                cardType = String.valueOf(card.charAt(1));
            }

            int value;
            int type;
            value = switch (cardValue) {
                case "J" -> 11;
                case "Q" -> 12;
                case "K" -> 13;
                case "A" -> 14;
                default -> Integer.parseInt(cardValue);
            };

            type = switch (cardType) {
                case "S" -> 4;
                case "H" -> 3;
                case "D" -> 2;
                default -> 1;
            };

            total += value * type;

        }
        return total;
    }
}
