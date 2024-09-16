import java.util.*;

public class Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<Integer> playerOne = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondPlayer = new LinkedHashSet<>();

        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int number : numbers) {
            playerOne.add(number);
        }

        numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int number : numbers) {
            secondPlayer.add(number);
        }

        int round = 1;
        while (round <= 50){
            if(!playerOne.iterator().hasNext() || !secondPlayer.iterator().hasNext()){
                break;
            }
            int firstNumber = playerOne.iterator().next();
            playerOne.remove(firstNumber);

            int secondNumber = secondPlayer.iterator().next();
            secondPlayer.remove(secondNumber);

            if(firstNumber > secondNumber){
                playerOne.add(firstNumber);
                playerOne.add(secondNumber);
            } else if(secondNumber > firstNumber){
                secondPlayer.add(firstNumber);
                secondPlayer.add(secondNumber);
            }

            round++;
        }

        if(playerOne.size() > secondPlayer.size()){
            System.out.println("First player win!");
        } else if (secondPlayer.size() > playerOne.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}
