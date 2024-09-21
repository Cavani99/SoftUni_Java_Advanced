import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Line_Numbers {
    public static void main(String[] args) {

        String path = "D:\\SoftUni\\Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(path));
             PrintWriter out = new PrintWriter(new FileWriter("D:\\SoftUni\\Files-and-Streams-Exercises-Resources\\insert_numbers.txt"))){
            String line = reader.readLine();

            int number = 1;
            while (line != null){
                 out.println(number + ". " + line);

                 number++;
                line = reader.readLine();
            }

            System.out.println("File saved successfully!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
