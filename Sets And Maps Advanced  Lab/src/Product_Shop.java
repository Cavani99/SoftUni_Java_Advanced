import java.util.*;

public class Product_Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, LinkedHashMap<String, Double>> values = new TreeMap<>();

        String [] info = scanner.nextLine().split(", ");
        while (!info[0].equals("Revision")){
            String key = info[0];
            String product = info[1];
            Double price = Double.valueOf(info[2]);

            if (values.containsKey(key)) {
                values.get(key).put(product, price);
            }
            else {
                LinkedHashMap<String, Double> productInfo = new LinkedHashMap<>();
                productInfo.put(product, price);
                values.put(key, productInfo);
            }

            info = scanner.nextLine().split(", ");
        }

        for(Map.Entry<String, LinkedHashMap<String, Double>> entry: values.entrySet()){
            String shop = entry.getKey();
            LinkedHashMap <String, Double> products = entry.getValue();

            System.out.printf("%s->\n", shop);


            for(Map.Entry<String, Double> productEntry: products.entrySet()){
                String product = productEntry.getKey();
                Double price = productEntry.getValue();

                System.out.printf("Product: %s, Price: %.1f\n", product,price);
            }
        }

    }
}
