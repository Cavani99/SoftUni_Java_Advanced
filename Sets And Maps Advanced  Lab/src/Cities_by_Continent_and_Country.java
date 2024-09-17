import java.util.*;

public class Cities_by_Continent_and_Country {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> values = new LinkedHashMap<>();

        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            String [] info = scanner.nextLine().split("\\s+");

            String continent = info[0];
            String country = info[1];
            String city =info[2];

            if(!values.containsKey(continent)){
                values.put(continent, new LinkedHashMap<>(){
                    { put(country, new ArrayList<>(){
                        {
                    add(city);
                }
                    });
                }
                });
            } else {
                if(!values.get(continent).containsKey(country)){
                    values.get(continent).put(country, new ArrayList<>(){{add(city);}});
                } else {
                    values.get(continent).get(country).add(city);
                }
            }
        }


        for(Map.Entry<String, LinkedHashMap<String, ArrayList<String>>> entry: values.entrySet()){
            String continent = entry.getKey();

            System.out.printf("%s:\n", continent);

            LinkedHashMap<String, ArrayList<String>> countries = entry.getValue();

            for(Map.Entry<String, ArrayList<String>> countrySet: countries.entrySet()){
                String country = countrySet.getKey();
                ArrayList<String> cities = countrySet.getValue();

                System.out.printf(" %s -> ", country);

                for (int i = 0; i < cities.size(); i++) {
                    if(i == 0){
                        System.out.print(cities.get(i));
                    } else {
                        System.out.print(", " + cities.get(i));
                    }
                }
                System.out.println();
            }
        }
    }
}
