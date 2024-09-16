import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Count_Real_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<Double, Integer> values = new LinkedHashMap<>();

        double [] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        for (double value : numbers){
            if(values.containsKey(value)){
                values.put(value, values.get(value) + 1);
            } else {
                values.put(value, 1);
            }
        }

        for (Double key : values.keySet()){
            System.out.printf("%.1f -> %d", key, values.get(key));
            System.out.println();
        }


    }
}
