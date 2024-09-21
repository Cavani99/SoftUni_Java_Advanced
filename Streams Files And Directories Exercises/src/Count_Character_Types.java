import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Count_Character_Types {
    public static void main(String[] args) {

        String path = "D:\\SoftUni\\Files-and-Streams-Exercises-Resources\\input.txt";
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(path));
             PrintWriter out = new PrintWriter(new FileWriter("D:\\SoftUni\\Files-and-Streams-Exercises-Resources\\all_capital.txt"))){
            String line = reader.readLine();

            int vowels = 0;
            int otherSymbols = 0;
            int punctuations = 0;
            while (line != null){

                for (char c : line.toCharArray()) {
                   switch (c){
                       case 'a', 'e', 'i', 'o', 'u' :
                           vowels++;
                           break;
                       case '!', '.', '?', ',':
                           punctuations++;
                           break;
                       default:
                           if(c != ' ')
                               otherSymbols++;
                           break;
                   }
                }

                line = reader.readLine();
            }

            out.println("Vowels: " + vowels);
            out.println("Other symbols: " + otherSymbols);
            out.println("Punctuation: " + punctuations);

            System.out.println("File saved successfully!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
