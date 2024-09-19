import java.io.FileInputStream;
import java.io.IOException;

public class Read_File {
    public static void main(String[] args) {
      String path = "D:\\SoftUni\\input.txt";

      try (FileInputStream stream = new FileInputStream(path)){
          int oneByte = stream.read();
          while (oneByte >= 0){
              System.out.printf("%s ", Integer.toBinaryString(oneByte));
              oneByte = stream.read();
          }

      } catch (IOException e){
          e.printStackTrace();
      }
    }
}