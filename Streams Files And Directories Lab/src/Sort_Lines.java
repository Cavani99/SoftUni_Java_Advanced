import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sort_Lines {
    public static void main(String[] args) {
        Path path = Paths.get("D:\\SoftUni\\input.txt");
        Path outPath = Paths.get("D:\\SoftUni\\sorted_lines.txt");

        try {

            List <String> lines = Files.readAllLines(path);
            lines = lines.stream().filter(l -> !l.isBlank()).collect(Collectors.toList());
            Collections.sort(lines);
            Files.write(outPath, lines);

            System.out.println("File created!");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
