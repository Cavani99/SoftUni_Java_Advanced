import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ALL_CAPITALS {
    public static void main(String[] args) {

        String path = "D:\\SoftUni\\Files-and-Streams-Exercises-Resources\\input.txt";
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(path));
            PrintWriter out = new PrintWriter(new FileWriter("D:\\SoftUni\\Files-and-Streams-Exercises-Resources\\all_capital.txt"))){
            String line = reader.readLine();

            while (line != null){

                String capital_line = line.toUpperCase();
                out.println(capital_line);

                line = reader.readLine();
            }

            System.out.println("File saved successfully!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
