package Constructors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            String [] values = scanner.nextLine().split("\\s+");

            Car car;
            if(values.length <= 2){
                car = new Car(values[0]);
            } else {
                car = new Car(values[0], values[1], Integer.parseInt(values[2]));
            }

            System.out.println(String.format("The car is: %s %s - %d HP.", car.getBrand(), car.getModel(), car.getHorsepower()));
        }

    }
}