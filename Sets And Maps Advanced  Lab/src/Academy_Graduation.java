import java.text.DecimalFormat;
import java.util.*;

public class Academy_Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, ArrayList<Double>> values = new TreeMap<>();

        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            String student = scanner.nextLine();

            double [] grades =  Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble)
                    .toArray();

            if(!values.containsKey(student)){
                values.put(student, new ArrayList<>(){{
                    for (double grade : grades) {
                        add(grade);
                    }
                    }
                });
            } else {
                ArrayList<Double> cities = values.get(student);

                for (double grade : grades) {
                    cities.add(grade);
                }

                values.put(student, cities);
            }
        }

        for(Map.Entry<String, ArrayList<Double>> entry: values.entrySet()){
            String student = entry.getKey();
            ArrayList<Double> grades = entry.getValue();
            double averageGrade = 0;
            for (int i = 0; i < grades.size(); i++) {
                averageGrade += grades.get(i);
            }
            averageGrade /= grades.size();

            System.out.println(String.format("%s is graduated with %s", student, averageGrade).replaceAll("0+$", "")
                    .replaceAll("\\.$", ""));
        }

    }
}
