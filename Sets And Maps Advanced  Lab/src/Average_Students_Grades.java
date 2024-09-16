import java.util.*;

public class Average_Students_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, ArrayList<Double>> values = new TreeMap<>();

        int students = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < students; i++) {
            String [] info = scanner.nextLine().split("\\s+");
            String studentName = info[0];
            double score = Double.parseDouble(info[1]);

            if (values.containsKey(studentName)) {
                values.get(studentName).add(score);
            }
            else {
                ArrayList<Double> scores = new ArrayList<>();
                scores.add(score);
                values.put(studentName, scores);
            }
        }

        for(Map.Entry<String,ArrayList<Double>>entry: values.entrySet()){
            String student = entry.getKey();
            ArrayList <Double> grades = entry.getValue();

            System.out.printf("%s -> ", student);

            double averageGrade = 0;
            for (int i = 0; i < grades.size(); i++) {
                averageGrade += grades.get(i);
                System.out.printf("%.2f ", grades.get(i));
            }

            System.out.printf("(avg: %.2f)", averageGrade / grades.size());
            System.out.println();
        }

    }
}
