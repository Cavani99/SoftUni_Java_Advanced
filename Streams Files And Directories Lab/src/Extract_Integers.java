import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Extract_Integers {
    public static void main(String[] args) {
        String path = "D:\\SoftUni\\input.txt";

        try (FileInputStream stream = new FileInputStream(path)){
            FileOutputStream out = new FileOutputStream("D:\\SoftUni\\integers.txt");
            Scanner scanner = new Scanner(stream);

            while (scanner.hasNext()){
                 if(scanner.hasNextInt()){
                     System.out.println(scanner.nextInt());
                 }

                 scanner.next();
            }
            System.out.println("File created!");

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
