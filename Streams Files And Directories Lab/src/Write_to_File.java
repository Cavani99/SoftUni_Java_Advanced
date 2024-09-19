import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Write_to_File {
    public static void main(String[] args) {
        String path = "D:\\SoftUni\\input.txt";

        ArrayList <Character> forbidden_symbols = new ArrayList<>(){{
            add(',');
            add('.');
            add('!');
            add('?');
        }};

        try (FileInputStream stream = new FileInputStream(path)){
            FileOutputStream out = new FileOutputStream("D:\\SoftUni\\output.txt");
            int oneByte = stream.read();
            while (oneByte >= 0){
                if(!forbidden_symbols.contains((char)oneByte)){
                    out.write(oneByte);
                }
                oneByte = stream.read();
            }
            System.out.println("File created!");

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
