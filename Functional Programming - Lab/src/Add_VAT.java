import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Add_VAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split(", ");

        ArrayList<Double> numbers = new ArrayList<>();
        for (String s : text)
            numbers.add(Double.parseDouble(s));
        UnaryOperator<Double> addVat = x -> x * 1.2;

        System.out.println("Prices with VAT:");
        for (Double str : numbers)
            System.out.printf("%1$.2f%n", addVat.apply(str));

    }
}
