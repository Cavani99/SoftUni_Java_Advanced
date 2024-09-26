package Car_Info;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            String [] values = scanner.nextLine().split("\\s+");
            Car car = new Car();

            car.setBrand(values[0]);
            car.setModel(values[1]);
            car.setHorsepower(Integer.parseInt(values[2]));


            System.out.println(String.format("The car is: %s %s - %d HP.", car.getBrand(), car.getModel(), car.getHorsepower()));
        }


    }
}