import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Merge_Two_Files {
    public static void main(String[] args) {

        String path = "D:\\SoftUni\\Files-and-Streams-Exercises-Resources\\inputOne.txt";
        String textPath = "D:\\SoftUni\\Files-and-Streams-Exercises-Resources\\inputTwo.txt";
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(path));
             BufferedReader text = Files.newBufferedReader(Paths.get(textPath));
             PrintWriter out = new PrintWriter(new FileWriter("D:\\SoftUni\\Files-and-Streams-Exercises-Resources\\combines_file.txt"))){

            String line = reader.readLine();

            while (line != null){

                out.println(line);

                line = reader.readLine();
            }

            line = text.readLine();
            while (line != null){

                out.println(line);

                line = text.readLine();
            }


            System.out.println("File saved successfully!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
