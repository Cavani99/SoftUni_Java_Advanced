package Car_Salesman;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, Engine> engines = new LinkedHashMap<>();
        Engine engine;
        for (int i = 0; i < number; i++) {
            String [] info = scanner.nextLine().split("\\s+");

            engine = new Engine(info[0], Integer.parseInt(info[1]));

            if(info.length == 3){
                if(info[2].matches("\\d+"))
                    engine.setDisplacement((info[2]));
                else
                    engine.setEfficiency(info[2]);
            }
            if(info.length == 4){
                if(info[2].matches("\\d+")){
                    engine.setDisplacement(info[2]);
                    engine.setEfficiency(info[3]);
                } else {
                    engine.setDisplacement(info[3]);
                    engine.setEfficiency(info[2]);
                }
            }

            engines.put(info[0], engine);
        }

        number = Integer.parseInt(scanner.nextLine());
        LinkedHashSet<Car> cars = new LinkedHashSet<>();
        Car car;
        for (int i = 0; i < number; i++) {
            String [] info = scanner.nextLine().split("\\s+");

            Engine currentEngine = engines.get(info[1]);
            car = new Car(info[0], currentEngine);

            if(info.length == 3){
                if(info[2].matches("\\d+"))
                    car.setWeight(info[2]);
                else
                    car.setColor(info[2]);
            }

            if(info.length == 4){
                if(info[2].matches("\\d+")){
                    car.setWeight(info[2]);
                    car.setColor(info[3]);
                } else {
                    car.setWeight(info[3]);
                    car.setColor(info[2]);
                }
            }

            cars.add(car);
        }

        cars.forEach( c -> System.out.println(c.toString()) );

    }
}
