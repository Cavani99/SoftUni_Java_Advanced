import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Word_Count {
    public static void main(String[] args) {

        String path = "D:\\SoftUni\\Files-and-Streams-Exercises-Resources\\words.txt";
        String textPath = "D:\\SoftUni\\Files-and-Streams-Exercises-Resources\\text.txt";
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(path));
             BufferedReader text = Files.newBufferedReader(Paths.get(textPath));
             PrintWriter out = new PrintWriter(new FileWriter("D:\\SoftUni\\Files-and-Streams-Exercises-Resources\\words_count.txt"))){

            String [] words = reader.readLine().split("\\s+");
            String line = text.readLine();

            ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(words));
            LinkedHashMap <String, Integer> wordsRepetitions = new LinkedHashMap<>();

            while (line != null){
                String [] strings = line.split("\\s+");
                for (int i = 0; i < strings.length; i++) {
                    String current = strings[i];
                    if(wordsList.contains(current)){
                        if(!wordsRepetitions.containsKey(current)){
                            wordsRepetitions.put(current, 1);
                        } else {
                            wordsRepetitions.put(current, wordsRepetitions.get(current) + 1);
                        }
                    }
                }

                line = reader.readLine();
            }

            for(Map.Entry<String, Integer> entry: wordsRepetitions.entrySet()){
                String word = entry.getKey();
                int reps = entry.getValue();

                out.println(word + " - " + reps);
            }

            System.out.println("File saved successfully!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
