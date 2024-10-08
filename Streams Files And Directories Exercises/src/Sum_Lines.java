import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Sum_Lines {
    public static void main(String[] args) {

        String path = "D:\\SoftUni\\Files-and-Streams-Exercises-Resources\\input.txt";
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(path))){
            String line = reader.readLine();

            while (line != null){
                long sum = 0;
                for (char c : line.toCharArray()) {
                    sum += c;
                }

                System.out.println(sum);
                line = reader.readLine();
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}