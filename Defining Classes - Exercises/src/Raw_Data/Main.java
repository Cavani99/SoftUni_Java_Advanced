package Raw_Data;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        LinkedHashSet<Car> cars = new LinkedHashSet<>();

        Car car;
        Engine engine;
        Cargo cargo;
        Tires tires;
        for (int i = 0; i < number; i++) {
            String [] info = scanner.nextLine().split("\\s+");

            engine = new Engine(Integer.parseInt(info[1]), Integer.parseInt(info[2]));
            cargo = new Cargo(Integer.parseInt(info[3]), info[4]);
            tires = new Tires(Double.parseDouble(info[5]), Integer.parseInt(info[6]), Double.parseDouble(info[7]), Integer.parseInt(info[8]),
                    Double.parseDouble(info[9]), Integer.parseInt(info[10]), Double.parseDouble(info[11]), Integer.parseInt(info[12]));
            car = new Car(info[0], engine, cargo, tires);
            cars.add(car);
        }

        String cargoType = scanner.nextLine();
        if(cargoType.equals("fragile")){
            cars.stream()
                    .filter((c) -> c.getCargo().getType().equals("fragile") &&
                    (c.getTires().getPressure1() < 1 || c.getTires().getPressure2() < 1 || c.getTires().getPressure3() < 1 || c.getTires().getPressure4() < 1 ))
                    .forEach(c -> System.out.println(String.format("%s", c.getModel())));
        } else {
            cars.stream()
                    .filter((c) -> c.getCargo().getType().equals("flamable") && c.getEngine().getPower() > 250)
                    .forEach(c -> System.out.println(String.format("%s", c.getModel())));
        }


    }
}
